package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ua0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(j41 j41Var) {
        return new JSONObject().put("deviceMetaData", a(j41Var.a()));
    }

    private static final JSONObject a(i41 i41Var) {
        return new JSONObject().put("language", i41Var.a()).put("region", i41Var.d()).put("model", i41Var.c()).put("latitude", i41Var.b().getLatitude()).put("longitude", i41Var.b().getLongitude());
    }
}
