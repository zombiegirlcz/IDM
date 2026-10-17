package rlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f255127a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final olm.g f255128b = com.bumptech.glide.c.e("kotlinx.serialization.json.JsonPrimitive", olm.e.f226474j, new SerialDescriptor[0], new okk.d(13));

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementC = i26.l.b(decoder).c();
        if (jsonElementC instanceof kotlinx.serialization.json.b) {
            return (kotlinx.serialization.json.b) jsonElementC;
        }
        StringBuilder sb6 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw slm.q.d(jsonElementC.toString(), -1, h30.l.t(o0.f186429a, jsonElementC.getClass(), sb6));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255128b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        kotlinx.serialization.json.b value = (kotlinx.serialization.json.b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        if (value instanceof JsonNull) {
            encoder.encodeSerializableValue(s.f255119a, JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(q.f255117a, (p) value);
        }
    }
}
