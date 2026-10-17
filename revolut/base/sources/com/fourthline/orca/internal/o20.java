package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o20 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y20 f31545c;
    private final String d;
    private final String e;
    private final Map f;

    public o20(String identifier, y20 error) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f31544b = identifier;
        this.f31545c = error;
        this.d = "iglu:com.fourthline.sdk/input_invalid/jsonschema/1-0-0";
        this.e = "input_invalid";
        aim.f builder = new aim.f();
        builder.put("name", identifier);
        builder.put("reason", error.getAlias());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f = builder.b();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj2;
        return Intrinsics.f(this.f31544b, o20Var.f31544b) && Intrinsics.f(this.f31545c, o20Var.f31545c);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return this.d;
    }

    public int hashCode() {
        return (this.f31544b.hashCode() * 31) + this.f31545c.hashCode();
    }

    public String toString() {
        return "InputValidated(identifier=" + this.f31544b + ", error=" + this.f31545c + ")";
    }
}
