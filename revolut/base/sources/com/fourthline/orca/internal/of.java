package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class of implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31658c;
    private final String d;
    private final Map e;

    public of(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f31657b = name;
        this.f31658c = "iglu:com.fourthline.sdk/dialog_started/jsonschema/1-0-0";
        this.d = "dialog_started";
        this.e = zhm.q0.c(new Pair("name", a()));
    }

    public String a() {
        return this.f31657b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof of) && Intrinsics.f(this.f31657b, ((of) obj2).f31657b);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return this.f31658c;
    }

    public int hashCode() {
        return this.f31657b.hashCode();
    }

    public String toString() {
        return "DialogStarted(name=" + this.f31657b + ")";
    }
}
