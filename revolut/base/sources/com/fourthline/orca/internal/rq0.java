package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rq0 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32801c;

    public rq0(String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32800b = name;
        this.f32801c = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rq0)) {
            return false;
        }
        rq0 rq0Var = (rq0) obj2;
        return Intrinsics.f(this.f32800b, rq0Var.f32800b) && this.f32801c == rq0Var.f32801c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.k(new Pair("name", this.f32800b), new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f32801c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "process_completed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/process_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f32800b.hashCode() * 31) + Long.hashCode(this.f32801c);
    }

    public String toString() {
        return "ProcessCompleted(name=" + this.f32800b + ", elapsedTime=" + this.f32801c + ")";
    }
}
