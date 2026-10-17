package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ea;
import com.fourthline.orca.internal.i8;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
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
public final class r41 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f32630a = com.bumptech.glide.c.d("StatefulTextInputElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q41 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of StatefulTextInputElement.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        JsonElement jsonElementA = s40.a(jsonObjectK, "default");
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("focused");
        if (jsonElement == null) {
            jsonElement = jsonElementA;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectK.get("error");
        if (jsonElement2 == null) {
            jsonElement2 = jsonElementA;
        }
        JsonElement jsonElement3 = (JsonElement) jsonObjectK.get("disabled");
        if (jsonElement3 == null) {
            jsonElement3 = jsonElementA;
        }
        Json jsonA = s40.a();
        jsonA.getClass();
        b81 b81Var = (b81) jsonA.a(b81.INSTANCE.serializer(), jsonElementA);
        JsonObject jsonObjectK2 = rlm.j.k(jsonElement);
        Json jsonA2 = s40.a();
        JsonElement jsonElementA2 = s40.a(jsonObjectK2, "shadow");
        jsonA2.getClass();
        ea.Companion companion = ea.INSTANCE;
        ea eaVar = (ea) jsonA2.a(companion.serializer(), jsonElementA2);
        Json jsonA3 = s40.a();
        JsonElement jsonElementA3 = s40.a(jsonObjectK2, "border");
        jsonA3.getClass();
        i8.Companion companion2 = i8.INSTANCE;
        b81 b81VarA = b81.a(b81Var, null, null, null, null, null, eaVar, null, (i8) jsonA3.a(companion2.serializer(), jsonElementA3), 0, 351, null);
        JsonObject jsonObjectK3 = rlm.j.k(jsonElement2);
        Json jsonA4 = s40.a();
        JsonElement jsonElementA4 = s40.a(jsonObjectK3, "status");
        jsonA4.getClass();
        a81 a81Var = (a81) jsonA4.a(a81.INSTANCE.serializer(), jsonElementA4);
        Json jsonA5 = s40.a();
        JsonElement jsonElementA5 = s40.a(jsonObjectK3, "border");
        jsonA5.getClass();
        b81 b81VarA2 = b81.a(b81Var, null, null, null, a81Var, null, null, null, (i8) jsonA5.a(companion2.serializer(), jsonElementA5), 0, 375, null);
        JsonObject jsonObjectK4 = rlm.j.k(jsonElement3);
        Json jsonA6 = s40.a();
        JsonElement jsonElementA6 = s40.a(jsonObjectK4, "background");
        jsonA6.getClass();
        return new q41(b81Var, b81VarA, b81VarA2, b81.a(b81Var, null, null, null, null, null, null, (ea) jsonA6.a(companion.serializer(), jsonElementA6), null, 0, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG, null));
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f32630a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, q41 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
