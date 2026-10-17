package ise;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f168229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f168230c;
    public final g0 d;
    public final com.revolut.feature.three_ds_verification.impl.ui.sceen.e e;
    public final aw0.i f;

    public p0(List items, h0 confirmButtonConfig, h0 rejectButtonConfig, g0 g0Var, com.revolut.feature.three_ds_verification.impl.ui.sceen.e eVar, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(confirmButtonConfig, "confirmButtonConfig");
        Intrinsics.checkNotNullParameter(rejectButtonConfig, "rejectButtonConfig");
        this.f168228a = items;
        this.f168229b = confirmButtonConfig;
        this.f168230c = rejectButtonConfig;
        this.d = g0Var;
        this.e = eVar;
        this.f = iVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof p0 ? (p0) oldState : null) == null) {
            return null;
        }
        return new o0(!this.f168229b.equals(r9.f168229b), !this.f168230c.equals(r9.f168230c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f, this.f));
    }

    @Override // cli.p
    public final List c() {
        return this.f168228a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f168228a, p0Var.f168228a) && Intrinsics.f(this.f168229b, p0Var.f168229b) && Intrinsics.f(this.f168230c, p0Var.f168230c) && Intrinsics.f(this.d, p0Var.d) && Intrinsics.f(this.e, p0Var.e) && Intrinsics.f(this.f, p0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f168230c.hashCode() + ((this.f168229b.hashCode() + (this.f168228a.hashCode() * 31)) * 31)) * 31;
        g0 g0Var = this.d;
        int iHashCode2 = (iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        com.revolut.feature.three_ds_verification.impl.ui.sceen.e eVar = this.e;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        aw0.i iVar = this.f;
        return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }
}
