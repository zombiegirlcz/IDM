package com.fourthline.orca.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class za0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(ox0 ox0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("otp", ox0Var.a());
        return jSONObject;
    }
}
