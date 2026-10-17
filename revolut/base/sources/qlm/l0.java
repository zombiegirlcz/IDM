package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class l0 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f247674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247675b;

    public l0(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247674a = bufferWithData;
        this.f247675b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f247674a, this.f247675b);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        int[] iArr = this.f247674a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f247674a = iArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247675b;
    }

    public final void e(int i) {
        b(d() + 1);
        int[] iArr = this.f247674a;
        int i2 = this.f247675b;
        this.f247675b = i2 + 1;
        iArr[i2] = i;
    }
}
