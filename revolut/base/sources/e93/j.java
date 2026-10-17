package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f123873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f123874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f123875c;

    public j(h hVar, g gVar, e0 e0Var) {
        this.f123873a = hVar;
        this.f123874b = gVar;
        this.f123875c = e0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f123873a, jVar.f123873a) && Intrinsics.f(this.f123874b, jVar.f123874b) && Intrinsics.f(this.f123875c, jVar.f123875c);
    }

    public final int hashCode() {
        h hVar = this.f123873a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        g gVar = this.f123874b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e0 e0Var = this.f123875c;
        return iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
