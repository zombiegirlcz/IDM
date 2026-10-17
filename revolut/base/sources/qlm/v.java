package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class v extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f247714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247715b;

    public v(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247714a = bufferWithData;
        this.f247715b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f247714a, this.f247715b);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        double[] dArr = this.f247714a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f247714a = dArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247715b;
    }

    public final void e(double d) {
        b(d() + 1);
        double[] dArr = this.f247714a;
        int i = this.f247715b;
        this.f247715b = i + 1;
        dArr[i] = d;
    }
}
