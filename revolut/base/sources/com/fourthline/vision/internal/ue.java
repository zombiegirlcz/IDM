package com.fourthline.vision.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ue implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ue f36989a = new ue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36990b = "document_scan_started";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36991c = "iglu:com.fourthline.sdk/document_scan_started/jsonschema/1-0-0";
    private static final Map d = zhm.r0.g();
    public static final int e = 8;

    private ue() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof ue);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return d;
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return f36990b;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return f36991c;
    }

    public int hashCode() {
        return 118085862;
    }

    @NotNull
    public String toString() {
        return "ScanStarted";
    }
}
