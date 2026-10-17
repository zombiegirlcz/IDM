package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c10;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class d10 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f27621a = com.bumptech.glide.c.d("HintElementVariants", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c10 deserialize(Decoder decoder) {
        Object objA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of HintElementVariants.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        JsonElement jsonElementA = s40.a(jsonObjectK, "default");
        Json jsonA = s40.a();
        jsonA.getClass();
        c10.b.Companion companion = c10.b.INSTANCE;
        c10.b bVar = (c10.b) jsonA.a(companion.serializer(), jsonElementA);
        Json jsonA2 = s40.a();
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("warning");
        if (jsonElement != null) {
            try {
                jsonA2.getClass();
                objA = jsonA2.a(companion.serializer(), jsonElement);
            } catch (Exception unused) {
                objA = bVar;
            }
        } else {
            objA = bVar;
        }
        return new c10(bVar, (c10.b) objA);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f27621a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, c10 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
