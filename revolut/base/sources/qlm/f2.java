package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class f2 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f247641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247642b;

    public f2(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247641a = bufferWithData;
        this.f247642b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f247641a, this.f247642b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.a0(storage);
    }

    @Override // qlm.k1
    public final void b(int i) {
        short[] sArr = this.f247641a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] storage = Arrays.copyOf(sArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f247641a = storage;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247642b;
    }

    public final void e(short s2) {
        b(d() + 1);
        short[] sArr = this.f247641a;
        int i = this.f247642b;
        this.f247642b = i + 1;
        sArr[i] = s2;
    }
}
