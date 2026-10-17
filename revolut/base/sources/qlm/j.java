package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f247664c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f186419a, "<this>");
        f247664c = new j(k.f247670a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        byte[] bArr = (byte[]) obj2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        i builder = (i) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.decodeByteElement(this.f247678b, i));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        byte[] bArr = (byte[]) obj2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new i(bArr);
    }

    @Override // qlm.m1
    public final Object j() {
        return new byte[0];
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        byte[] content = (byte[]) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeByteElement(this.f247678b, i2, content[i2]);
        }
    }
}
