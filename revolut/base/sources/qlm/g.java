package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f247643c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.e.f186418a, "<this>");
        f247643c = new g(h.f247648a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        boolean[] zArr = (boolean[]) obj2;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        f builder = (f) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeBooleanElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        boolean[] zArr = (boolean[]) obj2;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new f(zArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new boolean[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        boolean[] content = (boolean[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeBooleanElement(this.f247678b, i2, content[i2]);
        }
    }
}
