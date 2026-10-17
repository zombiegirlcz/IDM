package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c2 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f247626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247627b;

    public c2(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247626a = bufferWithData;
        this.f247627b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f247626a, this.f247627b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.x(storage);
    }

    @Override // qlm.k1
    public final void b(int i) {
        long[] jArr = this.f247626a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] storage = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f247626a = storage;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247627b;
    }

    public final void e(long j2) {
        b(d() + 1);
        long[] jArr = this.f247626a;
        int i = this.f247627b;
        this.f247627b = i + 1;
        jArr[i] = j2;
    }
}
