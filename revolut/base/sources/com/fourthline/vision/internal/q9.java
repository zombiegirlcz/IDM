package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class q9 implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9 f36731a = new q9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36732b = "iglu:com.fourthline.sdk/not_supported_device_state/jsonschema/1-0-0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36733c = "not_supported_device_state";
    private static final Map d = zhm.q0.c(new Pair("device_compromised", Boolean.TRUE));
    public static final int e = 8;

    private q9() {
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return d;
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return f36733c;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return f36732b;
    }
}
