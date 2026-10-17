package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class e2 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27973b;

    public e2(long j2) {
        this.f27973b = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e2) && this.f27973b == ((e2) obj2).f27973b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.q0.c(new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f27973b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "play_integrity_warmup_completed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/play_integrity_warmup_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f27973b);
    }

    public String toString() {
        return "PlayIntegrityWarmupCompleted(elapsedTime=" + this.f27973b + ")";
    }
}
