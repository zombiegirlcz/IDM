package com.onfido.api.client;

import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.InternalDocSide;
import com.onfido.api.client.data.SdkUploadMetaData;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import ulm.c1;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h {
    public c1 e(String str, DocType docType, String str2, byte[] bArr, Map map, InternalDocSide internalDocSide, String str3, SdkUploadMetaData sdkUploadMetaData, String str4) {
        b(str, str2, bArr);
        c("type", docType.getId());
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(((ValidationType) entry.getKey()).getId(), rlm.j.c(((ValidationLevel) entry.getValue()).getId()));
            }
        }
        c("sdk_validations", new JsonObject(map2).toString());
        if (internalDocSide != null) {
            c("side", internalDocSide.getId());
        }
        if (str3 != null && !str3.isEmpty()) {
            c("issuing_country", str3);
        }
        if (str4 != null && !str4.isEmpty()) {
            c("media_type", str4);
        }
        d(sdkUploadMetaData);
        return this.f50136a;
    }
}
