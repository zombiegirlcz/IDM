package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class s0 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f247702c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.v.f186436a, "<this>");
        f247702c = new s0(t0.f247706a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        long[] jArr = (long[]) obj2;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        r0 builder = (r0) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeLongElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        long[] jArr = (long[]) obj2;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new r0(jArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new long[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        long[] content = (long[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeLongElement(this.f247678b, i2, content[i2]);
        }
    }
}
