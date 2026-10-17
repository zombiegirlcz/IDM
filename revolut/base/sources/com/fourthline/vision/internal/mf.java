package com.fourthline.vision.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mf f36581a = new mf();

    private mf() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof mf);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.g();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_reset";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_reset/jsonschema/1-0-0";
    }

    public int hashCode() {
        return 1016813198;
    }

    @NotNull
    public String toString() {
        return "ScanReset";
    }
}
