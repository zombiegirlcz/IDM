package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n20 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31317c;
    private final String d;
    private final Map e;

    public n20(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f31316b = identifier;
        this.f31317c = "iglu:com.fourthline.sdk/input_prefilled/jsonschema/1-0-0";
        this.d = "input_prefilled";
        this.e = zhm.q0.c(new Pair("name", identifier));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n20) && Intrinsics.f(this.f31316b, ((n20) obj2).f31316b);
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
        return this.f31317c;
    }

    public int hashCode() {
        return this.f31316b.hashCode();
    }

    public String toString() {
        return "InputPrefilled(identifier=" + this.f31316b + ")";
    }
}
