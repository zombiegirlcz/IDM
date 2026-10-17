package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f28101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sc f28102c;
    private final bb0 d;

    public eb0(int i, Map headers, sc body, bb0 bb0Var) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f28100a = i;
        this.f28101b = headers;
        this.f28102c = body;
        this.d = bb0Var;
    }

    public final sc a() {
        return this.f28102c;
    }

    public final Map b() {
        return this.f28101b;
    }

    public final bb0 c() {
        return this.d;
    }

    public final int d() {
        return this.f28100a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj2;
        return this.f28100a == eb0Var.f28100a && Intrinsics.f(this.f28101b, eb0Var.f28101b) && Intrinsics.f(this.f28102c, eb0Var.f28102c) && Intrinsics.f(this.d, eb0Var.d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f28100a) * 31) + this.f28101b.hashCode()) * 31) + this.f28102c.hashCode()) * 31;
        bb0 bb0Var = this.d;
        return iHashCode + (bb0Var == null ? 0 : bb0Var.hashCode());
    }

    public String toString() {
        return "NetworkResponse(statusCode=" + this.f28100a + ", headers=" + this.f28101b + ", body=" + this.f28102c + ", metrics=" + this.d + ")";
    }
}
