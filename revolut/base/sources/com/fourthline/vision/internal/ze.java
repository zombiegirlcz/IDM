package com.fourthline.vision.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ze implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ze f37201a = new ze();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37202b = "document_scan_take_snapshot";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37203c = "iglu:com.fourthline.sdk/document_scan_take_snapshot/jsonschema/1-0-0";

    private ze() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof ze);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.g();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return f37202b;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return f37203c;
    }

    public int hashCode() {
        return -821162487;
    }

    @NotNull
    public String toString() {
        return "TakeSnapshot";
    }
}
