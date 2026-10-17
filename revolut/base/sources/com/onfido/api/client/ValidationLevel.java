package com.onfido.api.client;

/* JADX INFO: loaded from: classes17.dex */
public enum ValidationLevel {
    ERROR("error"),
    WARNING("warn");


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f50118id;

    ValidationLevel(String str) {
        this.f50118id = str;
    }

    public static ValidationLevel a(String str) {
        for (ValidationLevel validationLevel : values()) {
            if (validationLevel.f50118id.equalsIgnoreCase(str)) {
                return validationLevel;
            }
        }
        return null;
    }

    public final String getId() {
        return this.f50118id;
    }
}
