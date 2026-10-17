package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class z1 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f247733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247734b;

    public z1(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247733a = bufferWithData;
        this.f247734b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f247733a, this.f247734b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.v(storage);
    }

    @Override // qlm.k1
    public final void b(int i) {
        int[] iArr = this.f247733a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] storage = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f247733a = storage;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247734b;
    }

    public final void e(int i) {
        b(d() + 1);
        int[] iArr = this.f247733a;
        int i2 = this.f247734b;
        this.f247734b = i2 + 1;
        iArr[i2] = i;
    }
}
