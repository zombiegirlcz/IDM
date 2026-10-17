package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jd1 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f29859c;

    public jd1(String name, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29858b = name;
        this.f29859c = value;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jd1)) {
            return false;
        }
        jd1 jd1Var = (jd1) obj2;
        return Intrinsics.f(this.f29858b, jd1Var.f29858b) && Intrinsics.f(this.f29859c, jd1Var.f29859c);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.k(new Pair("name", this.f29858b), new Pair("value", this.f29859c.toString()));
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "value_selected";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/value_selected/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f29858b.hashCode() * 31) + this.f29859c.hashCode();
    }

    public String toString() {
        return "ValueSelected(name=" + this.f29858b + ", value=" + this.f29859c + ")";
    }
}
