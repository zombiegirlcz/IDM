package rlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes14.dex */
public final class s implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f255119a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final olm.g f255120b = com.bumptech.glide.c.e("kotlinx.serialization.json.JsonNull", olm.j.f226486b, new SerialDescriptor[0], new okk.d(13));

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i26.l.b(decoder);
        if (!decoder.decodeNotNullMark()) {
            decoder.decodeNull();
            return JsonNull.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new JsonDecodingException("Expected 'null' literal");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255120b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        JsonNull value = (JsonNull) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        encoder.encodeNull();
    }
}
