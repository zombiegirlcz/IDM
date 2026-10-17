package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f247684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247685b;

    public o(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247684a = bufferWithData;
        this.f247685b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f247684a, this.f247685b);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        char[] cArr = this.f247684a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f247684a = cArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247685b;
    }

    public final void e(char c2) {
        b(d() + 1);
        char[] cArr = this.f247684a;
        int i = this.f247685b;
        this.f247685b = i + 1;
        cArr[i] = c2;
    }
}
