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
public final class x50 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f34887a = com.bumptech.glide.c.d("LinkStyleElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w50 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of LinkStyleElement.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        mz mzVar = (mz) s40.a().a(new nz(), s40.a(jsonObjectK, "typography"));
        ea eaVar = (ea) s40.a().a(new fa(), s40.a(jsonObjectK, "color"));
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("opacity");
        return new w50(mzVar, eaVar, jsonElement != null ? ((Number) s40.a().a(qlm.e0.f247634a, jsonElement)).floatValue() : 1.0f);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f34887a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, w50 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
