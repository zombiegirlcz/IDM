package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class c2 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27310b;

    public c2(long j2) {
        this.f27310b = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && this.f27310b == ((c2) obj2).f27310b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.q0.c(new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f27310b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "attestation_failed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/attestation_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f27310b);
    }

    public String toString() {
        return "AttestationFailed(elapsedTime=" + this.f27310b + ")";
    }
}
