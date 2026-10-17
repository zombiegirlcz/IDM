package com.fourthline.orca.internal;

import com.fourthline.orca.internal.b6;
import com.fourthline.orca.internal.g6;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class f6 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f6 f28345a = new f6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f28346b = com.bumptech.glide.c.d("BavStartPaymentResult", new SerialDescriptor[0], new bi1(23));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28347c = 8;

    private f6() {
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, g6.a value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Serialization not implemented - this is typically used for deserialization only");
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return f28346b;
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g6.a deserialize(Decoder decoder) {
        String strA;
        b6 b6VarA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof rlm.i) {
            rlm.i iVar = (rlm.i) decoder;
            JsonElement jsonElementC = iVar.c();
            if (jsonElementC instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElementC;
                JsonElement jsonElement = (JsonElement) jsonObject.get("provider");
                if (jsonElement != null && (strA = rlm.j.l(jsonElement).a()) != null) {
                    JsonElement jsonElement2 = (JsonElement) jsonObject.get("values");
                    if (jsonElement2 != null) {
                        JsonObject jsonObjectK = rlm.j.k(jsonElement2);
                        String lowerCase = strA.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode == -1081415738) {
                            if (lowerCase.equals("manual")) {
                                b6VarA = (b6) iVar.a().a(b6.b.INSTANCE.serializer(), jsonObjectK);
                                return new g6.a(strA, b6VarA);
                            }
                            throw new SerializationException("Unknown provider: ".concat(strA));
                        }
                        if (iHashCode == 3526595) {
                            if (lowerCase.equals("sepa")) {
                                b6VarA = a(jsonObjectK);
                                return new g6.a(strA, b6VarA);
                            }
                            throw new SerializationException("Unknown provider: ".concat(strA));
                        }
                        if (iHashCode == 3560178 && lowerCase.equals("tink")) {
                            b6VarA = (b6) iVar.a().a(b6.d.INSTANCE.serializer(), jsonObjectK);
                            return new g6.a(strA, b6VarA);
                        }
                        throw new SerializationException("Unknown provider: ".concat(strA));
                    }
                    throw new SerializationException("Missing 'values' field");
                }
                throw new SerializationException("Missing 'provider' field");
            }
            throw new IllegalArgumentException("Expected JsonObject");
        }
        throw new IllegalArgumentException("This serializer can only be used with JSON");
    }

    private final b6.c a(JsonObject jsonObject) {
        String strA;
        JsonElement jsonElement = (JsonElement) jsonObject.get("amount");
        if (jsonElement != null) {
            kotlinx.serialization.json.b bVarL = rlm.j.l(jsonElement);
            Intrinsics.checkNotNullParameter(bVarL, "<this>");
            double d = Double.parseDouble(bVarL.a());
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("preferredMarket");
            if (jsonElement2 != null && (strA = rlm.j.l(jsonElement2).a()) != null) {
                JsonElement jsonElement3 = (JsonElement) jsonObject.get("iban");
                String strG = jsonElement3 != null ? rlm.j.g(rlm.j.l(jsonElement3)) : null;
                JsonElement jsonElement4 = (JsonElement) jsonObject.get("ibanConfiguration");
                if (jsonElement4 != null) {
                    Set<Map.Entry> setEntrySet = rlm.j.k(jsonElement4).f187951a.entrySet();
                    ArrayList arrayList = new ArrayList(zhm.w.t(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        String str = (String) entry.getKey();
                        JsonElement jsonElement5 = (JsonElement) rlm.j.k((JsonElement) entry.getValue()).get("length");
                        if (jsonElement5 != null) {
                            arrayList.add(new f5(str, rlm.j.h(rlm.j.l(jsonElement5))));
                        } else {
                            throw new SerializationException("Missing 'length' field for country " + str);
                        }
                    }
                    return new b6.c(d, strA, strG, arrayList);
                }
                throw new SerializationException("Missing 'ibanConfiguration' field in Sepa values");
            }
            throw new SerializationException("Missing 'preferredMarket' field in Sepa values");
        }
        throw new SerializationException("Missing 'amount' field in Sepa values");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(olm.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        zhm.f0 f0Var = zhm.f0.f322471a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        buildClassSerialDescriptor.a("provider", qlm.v1.f247719b, f0Var, false);
        buildClassSerialDescriptor.a("values", JsonElement.INSTANCE.serializer().getDescriptor(), f0Var, false);
        return Unit.f186387a;
    }
}
