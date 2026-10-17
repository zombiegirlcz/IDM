package androidx.media3.common.util;

import com.google.common.base.Preconditions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TimedValueQueue<V> {
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
        this(10);
    }

    private void addUnchecked(long j2, V v) {
        int i = this.first;
        int i2 = this.size;
        V[] vArr = this.values;
        int length = (i + i2) % vArr.length;
        this.timestamps[length] = j2;
        vArr[length] = v;
        this.size = i2 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j2) {
        if (this.size > 0) {
            if (j2 <= this.timestamps[((this.first + r0) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) newArray(i);
        int i2 = this.first;
        int i3 = length - i2;
        System.arraycopy(this.timestamps, i2, jArr, 0, i3);
        System.arraycopy(this.values, this.first, vArr, 0, i3);
        int i5 = this.first;
        if (i5 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i3, i5);
            System.arraycopy(this.values, 0, vArr, i3, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private static <V> V[] newArray(int i) {
        return (V[]) new Object[i];
    }

    private V popFirst() {
        Preconditions.checkState(this.size > 0);
        V[] vArr = this.values;
        int i = this.first;
        V v = vArr[i];
        vArr[i] = null;
        this.first = (i + 1) % vArr.length;
        this.size--;
        return v;
    }

    public synchronized void add(long j2, V v) {
        clearBufferOnTimeDiscontinuity(j2);
        doubleCapacityIfFull();
        addUnchecked(j2, v);
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill(this.values, (Object) null);
    }

    public synchronized V poll(long j2) {
        return poll(j2, false);
    }

    public synchronized V pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    public synchronized V pollFloor(long j2) {
        return poll(j2, true);
    }

    public synchronized int size() {
        return this.size;
    }

    public TimedValueQueue(int i) {
        this.timestamps = new long[i];
        this.values = (V[]) newArray(i);
    }

    private V poll(long j2, boolean z) {
        V vPopFirst = null;
        long j3 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j5 = j2 - this.timestamps[this.first];
            if (j5 < 0 && (z || (-j5) >= j3)) {
                break;
            }
            vPopFirst = popFirst();
            j3 = j5;
        }
        return vPopFirst;
    }
}
