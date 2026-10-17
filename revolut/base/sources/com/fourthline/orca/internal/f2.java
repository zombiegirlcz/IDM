package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class f2 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28319b;

    public f2(long j2) {
        this.f28319b = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && this.f28319b == ((f2) obj2).f28319b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.q0.c(new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f28319b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "play_integrity_warmup_failed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/play_integrity_warmup_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f28319b);
    }

    public String toString() {
        return "PlayIntegrityWarmupFailed(elapsedTime=" + this.f28319b + ")";
    }
}
