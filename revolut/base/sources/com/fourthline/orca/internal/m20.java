package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m20 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30927c;
    private final String d;
    private final Map e;

    public m20(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30926b = identifier;
        this.f30927c = "iglu:com.fourthline.sdk/input_changed/jsonschema/1-0-0";
        this.d = "input_changed";
        this.e = zhm.q0.c(new Pair("name", identifier));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m20) && Intrinsics.f(this.f30926b, ((m20) obj2).f30926b);
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
        return this.f30927c;
    }

    public int hashCode() {
        return this.f30926b.hashCode();
    }

    public String toString() {
        return "InputChanged(identifier=" + this.f30926b + ")";
    }
}
