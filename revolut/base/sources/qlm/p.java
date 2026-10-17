package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f247688c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.i.f186421a, "<this>");
        f247688c = new p(q.f247694a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        char[] cArr = (char[]) obj2;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        o builder = (o) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeCharElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        char[] cArr = (char[]) obj2;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new o(cArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new char[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        char[] content = (char[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeCharElement(this.f247678b, i2, content[i2]);
        }
    }
}
