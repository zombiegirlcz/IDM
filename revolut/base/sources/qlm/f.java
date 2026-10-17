package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f247639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247640b;

    public f(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247639a = bufferWithData;
        this.f247640b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f247639a, this.f247640b);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        boolean[] zArr = this.f247639a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f247639a = zArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247640b;
    }

    public final void e(boolean z) {
        b(d() + 1);
        boolean[] zArr = this.f247639a;
        int i = this.f247640b;
        this.f247640b = i + 1;
        zArr[i] = z;
    }
}
