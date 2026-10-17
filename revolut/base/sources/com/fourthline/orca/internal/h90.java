package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h90 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29186c;

    public h90(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f29185b = name;
        this.f29186c = i;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj2;
        return Intrinsics.f(this.f29185b, h90Var.f29185b) && this.f29186c == h90Var.f29186c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.k(new Pair("name", this.f29185b), new Pair("request_size", Integer.valueOf(this.f29186c)));
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "network_request_started";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f29185b.hashCode() * 31) + Integer.hashCode(this.f29186c);
    }

    public String toString() {
        return "RequestStarted(name=" + this.f29185b + ", requestSize=" + this.f29186c + ")";
    }
}
