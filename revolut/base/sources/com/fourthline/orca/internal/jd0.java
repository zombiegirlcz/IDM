package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jd0 {
    public static final int a(iz izVar) {
        JsonElement jsonElement;
        Integer numI;
        Intrinsics.checkNotNullParameter(izVar, "<this>");
        try {
            JsonObject config = izVar.getConfig();
            if (config != null && (jsonElement = (JsonElement) config.get("nfcErrorCount")) != null && (numI = rlm.j.i(rlm.j.l(jsonElement))) != null) {
                return numI.intValue();
            }
        } catch (Exception unused) {
        }
        return 4;
    }
}
