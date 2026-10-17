package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import yhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d2 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f247632c;

    static {
        Intrinsics.checkNotNullParameter(yhm.w.INSTANCE, "<this>");
        f247632c = new d2(e2.f247637a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        long[] collectionSize = ((yhm.x) obj2).f314209a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        c2 builder = (c2) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jDecodeLong = decoder.decodeInlineElement(this.f247678b, i).decodeLong();
        w.Companion companion = yhm.w.INSTANCE;
        builder.e(jDecodeLong);
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        long[] toBuilder = ((yhm.x) obj2).f314209a;
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new c2(toBuilder);
    }

    @Override // qlm.m1
    public final Object j() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.x(storage);
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        long[] content = ((yhm.x) obj2).f314209a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f247678b, i2);
            long j2 = content[i2];
            w.Companion companion = yhm.w.INSTANCE;
            encoderEncodeInlineElement.encodeLong(j2);
        }
    }
}
