package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f247628c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.m.f186426a, "<this>");
        f247628c = new d0(e0.f247634a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        float[] fArr = (float[]) obj2;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        c0 builder = (c0) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeFloatElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        float[] fArr = (float[]) obj2;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new c0(fArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new float[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        float[] content = (float[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeFloatElement(this.f247678b, i2, content[i2]);
        }
    }
}
