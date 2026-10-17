package com.fourthline.orca.internal;

import androidx.compose.ui.text.font.AndroidFontKt;
import androidx.compose.ui.text.font.FontFamilyKt;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class jj0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f29929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f29931c;

    public jj0(Map fonts, String fontPath) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        Intrinsics.checkNotNullParameter(fontPath, "fontPath");
        this.f29929a = fonts;
        this.f29930b = fontPath;
        this.f29931c = com.bumptech.glide.c.d("OrcaTypographySerializer", new SerialDescriptor[0], new jm1(11));
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of OrcaTypographyDefaults.");
        }
        Map map = rlm.j.k(((rlm.i) decoder).c()).f187951a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            JsonObject jsonObjectK = rlm.j.k((JsonElement) entry.getValue());
            String strA = rlm.j.l(a(jsonObjectK, "font")).a();
            nh0 nh0Var = (nh0) this.f29929a.get(strA);
            if (nh0Var == null) {
                throw new IllegalStateException(("FL Developer Error. No configured font with name '" + strA + "' found.").toString());
            }
            linkedHashMap.put(key, new kj0(FontFamilyKt.FontFamily(AndroidFontKt.m2990FontEj4NQ78$default(new File(this.f29930b, nh0Var.getFile()), null, 0, null, 14, null)), rlm.j.l(a(jsonObjectK, "weight")).a(), rlm.j.h(rlm.j.l(a(jsonObjectK, "size"))), rlm.j.h(rlm.j.l(a(jsonObjectK, "line_height")))));
        }
        return linkedHashMap;
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f29931c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(olm.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        zhm.f0 f0Var = zhm.f0.f322471a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.n1 n1Var = qlm.v1.f247719b;
        buildClassSerialDescriptor.a("light", n1Var, f0Var, false);
        buildClassSerialDescriptor.a("dark", n1Var, f0Var, false);
        return Unit.f186387a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Map value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }

    private final JsonElement a(JsonObject jsonObject, String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalStateException(("FL Developer Error. Missing key '" + str + "' during serialization of OrcaStylingDefaults.").toString());
    }
}
