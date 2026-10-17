package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f247656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247657b;

    public i(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247656a = bufferWithData;
        this.f247657b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f247656a, this.f247657b);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        byte[] bArr = this.f247656a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f247656a = bArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247657b;
    }

    public final void e(byte b4) {
        b(d() + 1);
        byte[] bArr = this.f247656a;
        int i = this.f247657b;
        this.f247657b = i + 1;
        bArr[i] = b4;
    }
}
