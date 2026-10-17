package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pi0 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31972c;
    private final String d;
    private final Map e;

    public pi0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f31971b = name;
        this.f31972c = "iglu:com.fourthline.sdk/screen_started/jsonschema/1-0-0";
        this.d = "screen_started";
        this.e = zhm.q0.c(new Pair("name", a()));
    }

    public String a() {
        return this.f31971b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof pi0) && Intrinsics.f(this.f31971b, ((pi0) obj2).f31971b);
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
        return this.f31972c;
    }

    public int hashCode() {
        return this.f31971b.hashCode();
    }

    public String toString() {
        return "ScreenStarted(name=" + this.f31971b + ")";
    }
}
