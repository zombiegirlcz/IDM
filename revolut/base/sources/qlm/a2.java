package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import yhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class a2 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f247613c;

    static {
        Intrinsics.checkNotNullParameter(yhm.u.INSTANCE, "<this>");
        f247613c = new a2(b2.f247619a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        int[] collectionSize = ((yhm.v) obj2).f314207a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        z1 builder = (z1) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iDecodeInt = decoder.decodeInlineElement(this.f247678b, i).decodeInt();
        u.Companion companion = yhm.u.INSTANCE;
        builder.e(iDecodeInt);
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        int[] toBuilder = ((yhm.v) obj2).f314207a;
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new z1(toBuilder);
    }

    @Override // qlm.m1
    public final Object j() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.v(storage);
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        int[] content = ((yhm.v) obj2).f314207a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f247678b, i2);
            int i3 = content[i2];
            u.Companion companion = yhm.u.INSTANCE;
            encoderEncodeInlineElement.encodeInt(i3);
        }
    }
}
