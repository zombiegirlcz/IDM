package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f247622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247623b;

    public c0(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247622a = bufferWithData;
        this.f247623b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f247622a, this.f247623b);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        float[] fArr = this.f247622a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f247622a = fArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247623b;
    }

    public final void e(float f) {
        b(d() + 1);
        float[] fArr = this.f247622a;
        int i = this.f247623b;
        this.f247623b = i + 1;
        fArr[i] = f;
    }
}
