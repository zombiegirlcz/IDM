package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f247677c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f186431a, "<this>");
        f247677c = new m0(n0.f247680a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        int[] iArr = (int[]) obj2;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        l0 builder = (l0) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeIntElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        int[] iArr = (int[]) obj2;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new l0(iArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new int[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        int[] content = (int[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeIntElement(this.f247678b, i2, content[i2]);
        }
    }
}
