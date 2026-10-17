package com.onfido.api.client;

/* JADX INFO: loaded from: classes17.dex */
public enum ValidationType {
    DOCUMENT("detect_document"),
    CUTOFF("detect_cutoff"),
    GLARE("detect_glare"),
    BLUR("detect_blur");


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f50119id;

    ValidationType(String str) {
        this.f50119id = str;
    }

    public static ValidationType a(String str) {
        for (ValidationType validationType : values()) {
            if (validationType.f50119id.equalsIgnoreCase(str)) {
                return validationType;
            }
        }
        return null;
    }

    public final String getId() {
        return this.f50119id;
    }
}
