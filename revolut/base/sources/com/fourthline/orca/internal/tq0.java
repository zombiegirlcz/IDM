package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tq0 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33832b;

    public tq0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33832b = name;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof tq0) && Intrinsics.f(this.f33832b, ((tq0) obj2).f33832b);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.q0.c(new Pair("name", this.f33832b));
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "process_started";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/process_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return this.f33832b.hashCode();
    }

    public String toString() {
        return "ProcessStarted(name=" + this.f33832b + ")";
    }
}
