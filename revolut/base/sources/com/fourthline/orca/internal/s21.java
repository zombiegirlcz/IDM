package com.fourthline.orca.internal;

import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class s21 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f32887a = com.bumptech.glide.c.d("ShadowElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r21 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of ShadowElement.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        Pair pair = jsonObjectK.containsKey("opacity") ? new Pair((ea) s40.a().a(new fa(), s40.a(jsonObjectK, "color")), Float.valueOf(((Number) s40.a().a(qlm.e0.f247634a, s40.a(jsonObjectK, "opacity"))).floatValue())) : new Pair((ea) s40.a().a(new fa(), jsonObjectK), Float.valueOf(1.0f));
        return new r21((ea) pair.f186385a, ((Number) pair.f186386b).floatValue());
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f32887a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, r21 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
