package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class r0 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f247700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247701b;

    public r0(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f247700a = bufferWithData;
        this.f247701b = bufferWithData.length;
        b(10);
    }

    @Override // qlm.k1
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f247700a, this.f247701b);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // qlm.k1
    public final void b(int i) {
        long[] jArr = this.f247700a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f247700a = jArrCopyOf;
        }
    }

    @Override // qlm.k1
    public final int d() {
        return this.f247701b;
    }

    public final void e(long j2) {
        b(d() + 1);
        long[] jArr = this.f247700a;
        int i = this.f247701b;
        this.f247701b = i + 1;
        jArr[i] = j2;
    }
}
