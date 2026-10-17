package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nf implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kd1 f31406c;
    private final String d;
    private final String e;
    private final Map f;

    public nf(String name, kd1 intent) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f31405b = name;
        this.f31406c = intent;
        this.d = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
        this.e = "dialog_action";
        this.f = zhm.r0.k(new Pair("name", a()), new Pair("intent", ld1.a(intent)));
    }

    public String a() {
        return this.f31405b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nf)) {
            return false;
        }
        nf nfVar = (nf) obj2;
        return Intrinsics.f(this.f31405b, nfVar.f31405b) && Intrinsics.f(this.f31406c, nfVar.f31406c);
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
        return (this.f31405b.hashCode() * 31) + this.f31406c.hashCode();
    }

    public String toString() {
        return "DialogAction(name=" + this.f31405b + ", intent=" + this.f31406c + ")";
    }
}
