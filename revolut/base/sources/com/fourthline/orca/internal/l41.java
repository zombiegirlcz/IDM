package com.fourthline.orca.internal;

import com.fourthline.orca.internal.br0;
import kotlin.KotlinNothingValueException;
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
public final class l41 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f30518a = com.bumptech.glide.c.d("StatefulButtonElement", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k41 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            wz.a("Incorrect decoder type found for serialization of StatefulTextInputElement.");
            throw new KotlinNothingValueException();
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        JsonElement jsonElementA = s40.a(jsonObjectK, "default");
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("disabled");
        if (jsonElement == null) {
            jsonElement = jsonElementA;
        }
        Json jsonA = s40.a();
        jsonA.getClass();
        z8 z8Var = (z8) jsonA.a(z8.INSTANCE.serializer(), jsonElementA);
        JsonElement jsonElement2 = (JsonElement) jsonObjectK.get("radius");
        int iIntValue = jsonElement2 != null ? ((Number) s40.a().a(new ny0(), jsonElement2)).intValue() : 0;
        Json jsonA2 = s40.a();
        JsonElement jsonElement3 = (JsonElement) jsonObjectK.get("spinner");
        br0.Companion companion = br0.INSTANCE;
        Object objA = companion.a();
        if (jsonElement3 != null) {
            try {
                jsonA2.getClass();
                objA = jsonA2.a(companion.serializer(), jsonElement3);
            } catch (Exception unused) {
            }
        }
        br0 br0Var = (br0) objA;
        JsonObject jsonObjectK2 = rlm.j.k(jsonElement);
        Json jsonA3 = s40.a();
        JsonElement jsonElement4 = (JsonElement) jsonObjectK2.get("background");
        Object background = z8Var.getBackground();
        if (jsonElement4 != null) {
            try {
                jsonA3.getClass();
                background = jsonA3.a(ea.INSTANCE.serializer(), jsonElement4);
            } catch (Exception unused2) {
            }
        }
        ea eaVar = (ea) background;
        Json jsonA4 = s40.a();
        JsonElement jsonElement5 = (JsonElement) jsonObjectK2.get("text");
        Object text = z8Var.getText();
        if (jsonElement5 != null) {
            try {
                jsonA4.getClass();
                text = jsonA4.a(a81.INSTANCE.serializer(), jsonElement5);
            } catch (Exception unused3) {
            }
        }
        a81 a81Var = (a81) text;
        Json jsonA5 = s40.a();
        JsonElement jsonElement6 = (JsonElement) jsonObjectK2.get("border");
        Object border = z8Var.getBorder();
        if (jsonElement6 != null) {
            try {
                jsonA5.getClass();
                border = jsonA5.a(i8.INSTANCE.serializer(), jsonElement6);
            } catch (Exception unused4) {
            }
        }
        i8 i8Var = (i8) border;
        Json jsonA6 = s40.a();
        JsonElement jsonElement7 = (JsonElement) jsonObjectK2.get("opacity");
        Object objValueOf = Float.valueOf(z8Var.getOpacity());
        if (jsonElement7 != null) {
            try {
                jsonA6.getClass();
                objValueOf = jsonA6.a(qlm.e0.f247634a, jsonElement7);
            } catch (Exception unused5) {
            }
        }
        return new k41(iIntValue, br0Var, z8Var, new z8(a81Var, eaVar, i8Var, ((Number) objValueOf).floatValue()));
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f30518a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, k41 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
