package hrf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final h d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yqi.b f154819c;

    static {
        f0 f0Var = f0.f322471a;
        d = new h(f0Var, f0Var, null);
    }

    public h(List transferErrors, List balanceErrors, yqi.b bVar) {
        Intrinsics.checkNotNullParameter(transferErrors, "transferErrors");
        Intrinsics.checkNotNullParameter(balanceErrors, "balanceErrors");
        this.f154817a = transferErrors;
        this.f154818b = balanceErrors;
        this.f154819c = bVar;
    }

    public final boolean a() {
        return !this.f154818b.isEmpty();
    }

    public final boolean b() {
        return this.f154817a.isEmpty() && this.f154818b.isEmpty();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154817a, hVar.f154817a) && Intrinsics.f(this.f154818b, hVar.f154818b) && Intrinsics.f(this.f154819c, hVar.f154819c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f154817a.hashCode() * 31, 31, this.f154818b);
        yqi.b bVar = this.f154819c;
        return iD + (bVar == null ? 0 : bVar.hashCode());
    }
}
