package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class d2 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f27624b = new d2();

    private d2() {
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof d2);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.g();
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "attestation_started";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/attestation_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return 60570717;
    }

    public String toString() {
        return "AttestationStarted";
    }
}
