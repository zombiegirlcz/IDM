package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import yhm.z;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g2 f247647c;

    static {
        Intrinsics.checkNotNullParameter(yhm.z.INSTANCE, "<this>");
        f247647c = new g2(h2.f247654a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        short[] collectionSize = ((yhm.a0) obj2).f314182a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        f2 builder = (f2) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sDecodeShort = decoder.decodeInlineElement(this.f247678b, i).decodeShort();
        z.Companion companion = yhm.z.INSTANCE;
        builder.e(sDecodeShort);
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        short[] toBuilder = ((yhm.a0) obj2).f314182a;
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new f2(toBuilder);
    }

    @Override // qlm.m1
    public final Object j() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.a0(storage);
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        short[] content = ((yhm.a0) obj2).f314182a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f247678b, i2);
            short s2 = content[i2];
            z.Companion companion = yhm.z.INSTANCE;
            encoderEncodeInlineElement.encodeShort(s2);
        }
    }
}
