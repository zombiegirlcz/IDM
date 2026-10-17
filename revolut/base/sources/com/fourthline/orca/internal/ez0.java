package com.fourthline.orca.internal;

import io.ktor.client.engine.HttpClientEngine;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ez0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientEngine f28296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final db0 f28297b;

    public ez0(HttpClientEngine engine, db0 db0Var) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f28296a = engine;
        this.f28297b = db0Var;
    }

    public final HttpClientEngine a() {
        return this.f28296a;
    }

    public final db0 b() {
        return this.f28297b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ez0)) {
            return false;
        }
        ez0 ez0Var = (ez0) obj2;
        return Intrinsics.f(this.f28296a, ez0Var.f28296a) && Intrinsics.f(this.f28297b, ez0Var.f28297b);
    }

    public int hashCode() {
        int iHashCode = this.f28296a.hashCode() * 31;
        db0 db0Var = this.f28297b;
        return iHashCode + (db0Var == null ? 0 : db0Var.hashCode());
    }

    public String toString() {
        return "ResolvedFourthlineKtorEngine(engine=" + this.f28296a + ", okHttpMetricsSink=" + this.f28297b + ")";
    }
}
