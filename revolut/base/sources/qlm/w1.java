package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class w1 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f247721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247722b;

    public w1(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247721a = bufferWithData;
        this.f247722b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f247721a, this.f247722b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.t(storage);
    }

    @Override // qlm.k1
    public final void b(int i) {
        byte[] bArr = this.f247721a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f247721a = storage;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247722b;
    }

    public final void e(byte b4) {
        b(d() + 1);
        byte[] bArr = this.f247721a;
        int i = this.f247722b;
        this.f247722b = i + 1;
        bArr[i] = b4;
    }
}
