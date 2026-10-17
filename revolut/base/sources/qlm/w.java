package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f247720c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.l.f186424a, "<this>");
        f247720c = new w(x.f247723a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        double[] dArr = (double[]) obj2;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        v builder = (v) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeDoubleElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        double[] dArr = (double[]) obj2;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new v(dArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new double[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        double[] content = (double[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeDoubleElement(this.f247678b, i2, content[i2]);
        }
    }
}
