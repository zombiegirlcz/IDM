package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import yhm.s;

/* JADX INFO: loaded from: classes13.dex */
public final class x1 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f247726c;

    static {
        Intrinsics.checkNotNullParameter(yhm.s.INSTANCE, "<this>");
        f247726c = new x1(y1.f247729a);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        byte[] collectionSize = ((yhm.t) obj2).f314205a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qlm.t, qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        w1 builder = (w1) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bDecodeByte = decoder.decodeInlineElement(this.f247678b, i).decodeByte();
        s.Companion companion = yhm.s.INSTANCE;
        builder.e(bDecodeByte);
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        byte[] toBuilder = ((yhm.t) obj2).f314205a;
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new w1(toBuilder);
    }

    @Override // qlm.m1
    public final Object j() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new yhm.t(storage);
    }

    @Override // qlm.m1
    public final void k(CompositeEncoder encoder, Object obj2, int i) {
        byte[] content = ((yhm.t) obj2).f314205a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = encoder.encodeInlineElement(this.f247678b, i2);
            byte b4 = content[i2];
            s.Companion companion = yhm.s.INSTANCE;
            encoderEncodeInlineElement.encodeByte(b4);
        }
    }
}
