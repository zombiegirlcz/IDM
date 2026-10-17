package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class b2 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26962b;

    public b2(long j2) {
        this.f26962b = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b2) && this.f26962b == ((b2) obj2).f26962b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.q0.c(new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f26962b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "attestation_completed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/attestation_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f26962b);
    }

    public String toString() {
        return "AttestationCompleted(elapsedTime=" + this.f26962b + ")";
    }
}
