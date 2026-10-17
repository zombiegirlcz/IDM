package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class s1 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f247703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247704b;

    public s1(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247703a = bufferWithData;
        this.f247704b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f247703a, this.f247704b);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        short[] sArr = this.f247703a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f247703a = sArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247704b;
    }

    public final void e(short s2) {
        b(d() + 1);
        short[] sArr = this.f247703a;
        int i = this.f247704b;
        this.f247704b = i + 1;
        sArr[i] = s2;
    }
}
