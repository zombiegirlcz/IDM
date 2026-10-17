package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class g2 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g2 f28735b = new g2();

    private g2() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof g2);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.g();
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "play_integrity_warmup_started";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/play_integrity_warmup_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return 1214388052;
    }

    public String toString() {
        return "PlayIntegrityWarmupStarted";
    }
}
