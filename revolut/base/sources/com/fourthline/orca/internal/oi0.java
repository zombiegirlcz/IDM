package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class oi0 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31670c;
    private final String d;
    private final String e;
    private final Map f;

    public oi0(String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f31669b = name;
        this.f31670c = j2;
        this.d = "iglu:com.fourthline.sdk/screen_forward/jsonschema/1-0-0";
        this.e = "screen_forward";
        this.f = zhm.r0.k(new Pair("name", a()), new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
    }

    public String a() {
        return this.f31669b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj2;
        return Intrinsics.f(this.f31669b, oi0Var.f31669b) && this.f31670c == oi0Var.f31670c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return this.f;
    }

    public long getElapsedTime() {
        return this.f31670c;
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
        return (this.f31669b.hashCode() * 31) + Long.hashCode(this.f31670c);
    }

    public String toString() {
        return "ScreenForward(name=" + this.f31669b + ", elapsedTime=" + this.f31670c + ")";
    }
}
