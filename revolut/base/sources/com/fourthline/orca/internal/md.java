package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class md implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f31162a = com.bumptech.glide.c.d("CountryNetworkModel", new SerialDescriptor[0], new okk.d(12));

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CountryNetworkModel deserialize(Decoder decoder) {
        String strA;
        DocumentType documentType;
        String strA2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalStateException("No valid JsonDecoder found.");
        }
        JsonObject jsonObjectK = rlm.j.k(((rlm.i) decoder).c());
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("issuingCountry");
        if (jsonElement == null || (strA = a(jsonElement)) == null) {
            throw new IllegalStateException("Missing field 'issuingCountry' during deserialization of CountryNetworkModel.");
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectK.get("idDocuments");
        if (jsonElement2 == null) {
            throw new IllegalStateException("Missing field 'idDocuments' during deserialization of CountryNetworkModel.");
        }
        kotlinx.serialization.json.a aVarJ = rlm.j.j(jsonElement2);
        ArrayList arrayList = new ArrayList(zhm.w.t(aVarJ, 10));
        Iterator it8 = aVarJ.f187952a.iterator();
        while (it8.hasNext()) {
            JsonObject jsonObjectK2 = rlm.j.k((JsonElement) it8.next());
            JsonElement jsonElement3 = (JsonElement) jsonObjectK2.get("type");
            Integer numI = null;
            String strA3 = jsonElement3 != null ? a(jsonElement3) : null;
            JsonElement jsonElement4 = (JsonElement) jsonObjectK2.get("nationalities");
            if (jsonElement4 == null) {
                throw new IllegalStateException("Missing field 'nationalities' during deserialization of CountryNetworkModel.Document.");
            }
            kotlinx.serialization.json.a aVarJ2 = rlm.j.j(jsonElement4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = aVarJ2.f187952a.iterator();
            while (it9.hasNext()) {
                String strA4 = a((JsonElement) it9.next());
                if (strA4 != null) {
                    arrayList2.add(strA4);
                }
            }
            if (strA3 == null || (documentType = CountryNetworkModelKt.toDocumentType(strA3, strA)) == null) {
                throw new IllegalStateException("Missing valid value for 'type' during deserialization of CountryNetworkModel.Document.");
            }
            JsonElement jsonElement5 = (JsonElement) jsonObjectK2.get("nfcIssueDate");
            Date dateA = (jsonElement5 == null || (strA2 = a(jsonElement5)) == null) ? null : a(strA2);
            JsonElement jsonElement6 = (JsonElement) jsonObjectK2.get("validityPeriod");
            if (jsonElement6 != null) {
                numI = rlm.j.i(rlm.j.l(jsonElement6));
            }
            arrayList.add(new CountryNetworkModel.Document(documentType, arrayList2, dateA, numI));
        }
        return new CountryNetworkModel(strA, arrayList);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f31162a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, CountryNetworkModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }

    private final Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    private final String a(JsonElement jsonElement) {
        if (!(jsonElement instanceof kotlinx.serialization.json.b)) {
            return null;
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElement;
        if (bVar.b()) {
            return bVar.a();
        }
        return null;
    }
}
