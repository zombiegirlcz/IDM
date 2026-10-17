package rlm;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f255111a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final olm.g f255112b = com.bumptech.glide.c.e("kotlinx.serialization.json.JsonElement", olm.c.f226469c, new SerialDescriptor[0], new rj7.b(26));

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return i26.l.b(decoder).c();
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255112b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        JsonElement value = (JsonElement) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        if (value instanceof kotlinx.serialization.json.b) {
            encoder.encodeSerializableValue(w.f255127a, value);
        } else if (value instanceof JsonObject) {
            encoder.encodeSerializableValue(v.f255125a, value);
        } else {
            if (!(value instanceof kotlinx.serialization.json.a)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(e.f255097a, value);
        }
    }
}
