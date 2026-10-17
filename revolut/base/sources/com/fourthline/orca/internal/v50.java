package com.fourthline.orca.internal;

import com.fourthline.orca.internal.o41;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class v50 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f34247a = com.bumptech.glide.c.d("LinkElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o41.c deserialize(Decoder decoder) {
        w50 w50Var;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of LinkElement.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        JsonObject jsonObjectK2 = rlm.j.k(s40.a(jsonObjectK, "link"));
        if (jsonObjectK2.containsKey("opacity")) {
            w50Var = (w50) s40.a().a(w50.INSTANCE.serializer(), jsonObjectK2);
        } else {
            a81 a81Var = (a81) s40.a().a(a81.INSTANCE.serializer(), jsonObjectK2);
            JsonElement jsonElement = (JsonElement) jsonObjectK.get("link_opacity");
            w50Var = new w50(a81Var.getTypography(), a81Var.getColor(), jsonElement != null ? ((Number) s40.a().a(qlm.e0.f247634a, jsonElement)).floatValue() : 1.0f);
        }
        return new o41.c(w50Var);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f34247a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, o41.c value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
