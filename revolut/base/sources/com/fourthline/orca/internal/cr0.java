package com.fourthline.orca.internal;

import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class cr0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f27539a = com.bumptech.glide.c.d("ProgressElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public br0 deserialize(Decoder decoder) {
        ar0 ar0Var;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of ProgressElement.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        ea eaVar = (ea) s40.a().a(new fa(), s40.a(jsonObjectK, "highlight"));
        JsonElement jsonElementA = s40.a(jsonObjectK, "background");
        if ((jsonElementA instanceof JsonObject) && ((JsonObject) jsonElementA).containsKey("opacity")) {
            ar0Var = (ar0) s40.a().a(ar0.INSTANCE.serializer(), jsonElementA);
        } else {
            ea eaVar2 = (ea) s40.a().a(new fa(), jsonElementA);
            JsonElement jsonElement = (JsonElement) jsonObjectK.get("background_opacity");
            ar0Var = new ar0(eaVar2, jsonElement != null ? ((Number) s40.a().a(qlm.e0.f247634a, jsonElement)).floatValue() : 1.0f);
        }
        return new br0(eaVar, ar0Var);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f27539a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, br0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
