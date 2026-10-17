package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import yhm.w;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010\u0006R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findAbsoluteInsertIndex", "(J)I", "hash1", "findFirstAvailableSlot", "(I)I", "value", "set", "(JLjava/lang/Object;)V", "remove", "(J)Ljava/lang/Object;", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public /* synthetic */ MutableLongObjectMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final int findAbsoluteInsertIndex(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & CertificateBody.profileType;
        int i5 = this._capacity;
        int i6 = i2 & i5;
        int i21 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i22 = i6 >> 3;
            int i32 = (i6 & 7) << 3;
            long j2 = ((jArr[i22 + 1] << (64 - i32)) & ((-i32) >> 63)) | (jArr[i22] >>> i32);
            long j3 = i3;
            int i33 = i21;
            long j5 = j2 ^ (j3 * 72340172838076673L);
            for (long j16 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i43 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i59 = iFindFirstAvailableSlot >> 3;
                long j22 = jArr2[i59];
                int i66 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i43 - (((j22 >> i66) & 255) == 128 ? 1 : 0);
                int i74 = this._capacity;
                long j42 = ((~(255 << i66)) & j22) | (j3 << i66);
                jArr2[i59] = j42;
                jArr2[(((iFindFirstAvailableSlot - 7) & i74) + (i74 & 7)) >> 3] = j42;
                return iFindFirstAvailableSlot;
            }
            i21 = i33 + 8;
            i6 = (i6 + i21) & i5;
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i2 >> 3;
            int i6 = (i2 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j3) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            p.t(jArr, -9187201950435737472L);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j2 = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j2)) | j2;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    public final void adjustStorage$collection() {
        int i = this._capacity;
        if (i > 8) {
            long j2 = this._size;
            w.Companion companion = w.INSTANCE;
            if (Long.compareUnsigned(j2 * 32, ((long) i) * 25) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            p.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j2 = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j2)) | j2;
        }
        p.p(this.values, 0, this._capacity, null);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i;
        long[] jArr;
        long[] jArr2 = this.metadata;
        int i2 = this._capacity;
        long[] jArr3 = this.keys;
        Object[] objArr = this.values;
        int i3 = (i2 + 7) >> 3;
        char c2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr2[i5] & (-9187201950435737472L);
            jArr2[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iS = d.S(jArr2);
        int i6 = iS - 1;
        long j3 = 72057594037927935L;
        jArr2[i6] = (jArr2[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr2[iS] = jArr2[0];
        int i21 = 0;
        while (i21 != i2) {
            int i22 = i21 >> 3;
            int i32 = (i21 & 7) << 3;
            long j5 = (jArr2[i22] >> i32) & 255;
            if (j5 != 128 && j5 == 254) {
                int iHashCode = Long.hashCode(jArr3[i21]) * (-862048943);
                int i33 = iHashCode ^ (iHashCode << 16);
                int i43 = i33 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i43);
                int i59 = i43 & i2;
                char c3 = c2;
                long j16 = j3;
                if (((iFindFirstAvailableSlot - i59) & i2) / 8 == ((i21 - i59) & i2) / 8) {
                    jArr2[i22] = ((i33 & CertificateBody.profileType) << i32) | ((~(255 << i32)) & jArr2[i22]);
                    Intrinsics.checkNotNullParameter(jArr2, "<this>");
                    jArr2[jArr2.length - 1] = (jArr2[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                } else {
                    int i66 = iFindFirstAvailableSlot >> 3;
                    long j22 = jArr2[i66];
                    int i74 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j22 >> i74) & 255) == 128) {
                        i = i2;
                        jArr = jArr3;
                        jArr2[i66] = (j22 & (~(255 << i74))) | (((long) (i33 & CertificateBody.profileType)) << i74);
                        jArr2[i22] = (jArr2[i22] & (~(255 << i32))) | (128 << i32);
                        jArr[iFindFirstAvailableSlot] = jArr[i21];
                        jArr[i21] = 0;
                        objArr[iFindFirstAvailableSlot] = objArr[i21];
                        objArr[i21] = null;
                    } else {
                        i = i2;
                        jArr = jArr3;
                        jArr2[i66] = (((long) (i33 & CertificateBody.profileType)) << i74) | (j22 & (~(255 << i74)));
                        long j42 = jArr[iFindFirstAvailableSlot];
                        jArr[iFindFirstAvailableSlot] = jArr[i21];
                        jArr[i21] = j42;
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i21];
                        objArr[i21] = obj2;
                        i21--;
                    }
                    Intrinsics.checkNotNullParameter(jArr2, "<this>");
                    jArr2[jArr2.length - 1] = (jArr2[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                    i2 = i;
                    jArr3 = jArr;
                }
                c2 = c3;
                j3 = j16;
            } else {
                i21++;
            }
        }
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.keys
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6e
            r10 = -1
        L65:
            if (r10 < 0) goto L6c
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L6c:
            r14 = 0
            return r14
        L6e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long):java.lang.Object");
    }

    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j2 = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j2;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j2;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableLongObjectMap<V> mutableLongObjectMap = this;
        long[] jArr2 = mutableLongObjectMap.metadata;
        long[] jArr3 = mutableLongObjectMap.keys;
        Object[] objArr = mutableLongObjectMap.values;
        int i = mutableLongObjectMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableLongObjectMap.metadata;
        long[] jArr5 = mutableLongObjectMap.keys;
        Object[] objArr2 = mutableLongObjectMap.values;
        int i2 = mutableLongObjectMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i3];
                int iHashCode = Long.hashCode(j2) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableLongObjectMap.findFirstAvailableSlot(i5 >>> 7);
                long j3 = i5 & CertificateBody.profileType;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j5 = (jArr4[i6] & (~(255 << i21))) | (j3 << i21);
                jArr4[i6] = j5;
                jArr4[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j5;
                jArr5[iFindFirstAvailableSlot] = j2;
                objArr2[iFindFirstAvailableSlot] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableLongObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[iFindAbsoluteInsertIndex] = key;
        this.values[iFindAbsoluteInsertIndex] = value;
    }

    public MutableLongObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }
}
