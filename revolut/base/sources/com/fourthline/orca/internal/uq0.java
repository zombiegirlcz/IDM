package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class uq0 implements ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uq0 f34161b = new uq0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34162c = "iglu:com.fourthline.sdk/not_supported_device_state/jsonschema/1-0-0";
    private static final String d = "not_supported_device_state";
    private static final Map e = zhm.q0.c(new Pair("device_compromised", Boolean.TRUE));
    public static final int f = 8;

    private uq0() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof uq0);
    }

    @Override // ib.f
    public Map getAttributes() {
        return e;
    }

    @Override // ib.f
    public String getEventName() {
        return d;
    }

    @Override // ib.f
    public String getSchema() {
        return f34162c;
    }

    public int hashCode() {
        return -910370345;
    }

    public String toString() {
        return "NotSupportedDeviceState";
    }
}
