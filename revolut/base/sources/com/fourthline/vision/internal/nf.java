package com.fourthline.vision.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nf f36604a = new nf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f36605b = zhm.r0.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36606c = 8;

    private nf() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof nf);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return f36605b;
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_started";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return -794352128;
    }

    @NotNull
    public String toString() {
        return "ScanStarted";
    }
}
