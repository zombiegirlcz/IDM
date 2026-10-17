package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.re1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g90 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28810c;
    private final int d;
    private final Throwable e;
    private final long f;

    public g90(String name, int i, int i2, Throwable th10, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f28809b = name;
        this.f28810c = i;
        this.d = i2;
        this.e = th10;
        this.f = j2;
    }

    private final e90 a(Throwable th10) {
        return Intrinsics.f(th10, re1.a.f32703a) ? e90.f28078a : e90.f28080c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g90)) {
            return false;
        }
        g90 g90Var = (g90) obj2;
        return Intrinsics.f(this.f28809b, g90Var.f28809b) && this.f28810c == g90Var.f28810c && this.d == g90Var.d && Intrinsics.f(this.e, g90Var.e) && this.f == g90Var.f;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        String message;
        aim.f builder = new aim.f();
        builder.put("name", this.f28809b);
        builder.put("elapsed_time", Long.valueOf(getElapsedTime()));
        builder.put("status_code", Integer.valueOf(this.d));
        builder.put("request_size", Integer.valueOf(this.f28810c));
        e90 e90VarA = a(this.e);
        builder.put("error", wz.a(e90VarA));
        if (e90VarA == e90.f28080c) {
            Throwable th10 = this.e;
            if (th10 == null || (message = th10.getMessage()) == null) {
                message = "n/a";
            }
            builder.put("reason", message);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public long getElapsedTime() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "network_request_failed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_failed/jsonschema/1-0-1";
    }

    public int hashCode() {
        int iHashCode = ((((this.f28809b.hashCode() * 31) + Integer.hashCode(this.f28810c)) * 31) + Integer.hashCode(this.d)) * 31;
        Throwable th10 = this.e;
        return ((iHashCode + (th10 == null ? 0 : th10.hashCode())) * 31) + Long.hashCode(this.f);
    }

    public String toString() {
        return "RequestFailed(name=" + this.f28809b + ", requestSize=" + this.f28810c + ", statusCode=" + this.d + ", error=" + this.e + ", elapsedTime=" + this.f + ")";
    }
}
