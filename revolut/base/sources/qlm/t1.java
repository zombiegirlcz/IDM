package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class t1 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f247708c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r0.f186432a, "<this>");
        f247708c = new t1(u1.f247712a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        short[] sArr = (short[]) obj2;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        s1 builder = (s1) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeShortElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        short[] sArr = (short[]) obj2;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new s1(sArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new short[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        short[] content = (short[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeShortElement(this.f247678b, i2, content[i2]);
        }
    }
}
