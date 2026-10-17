package uo;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f281512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f281513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f281514c;
    public final g0 d;
    public final x0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f281515g;

    public u0(z0 z0Var, b1 b1Var, w0 w0Var, g0 g0Var, x0 startTimestamps, boolean z, Intent intent) {
        Intrinsics.checkNotNullParameter(startTimestamps, "startTimestamps");
        this.f281512a = z0Var;
        this.f281513b = b1Var;
        this.f281514c = w0Var;
        this.d = g0Var;
        this.e = startTimestamps;
        this.f = z;
        this.f281515g = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f281512a == u0Var.f281512a && this.f281513b == u0Var.f281513b && this.f281514c == u0Var.f281514c && this.d == u0Var.d && Intrinsics.f(this.e, u0Var.e) && this.f == u0Var.f && Intrinsics.f(this.f281515g, u0Var.f281515g);
    }

    public final int hashCode() {
        z0 z0Var = this.f281512a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        b1 b1Var = this.f281513b;
        int iHashCode2 = (iHashCode + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        w0 w0Var = this.f281514c;
        int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        g0 g0Var = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31)) * 31, 31, this.f);
        Intent intent = this.f281515g;
        return iC + (intent != null ? intent.hashCode() : 0);
    }
}
