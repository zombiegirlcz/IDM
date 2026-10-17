package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sq0 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33108c;

    public sq0(String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33107b = name;
        this.f33108c = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sq0)) {
            return false;
        }
        sq0 sq0Var = (sq0) obj2;
        return Intrinsics.f(this.f33107b, sq0Var.f33107b) && this.f33108c == sq0Var.f33108c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.k(new Pair("name", this.f33107b), new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public long getElapsedTime() {
        return this.f33108c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "process_failed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/process_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f33107b.hashCode() * 31) + Long.hashCode(this.f33108c);
    }

    public String toString() {
        return "ProcessFailed(name=" + this.f33107b + ", elapsedTime=" + this.f33108c + ")";
    }
}
