package tdc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269957c;
    public final dj0.d d;
    public final u6c.l e;

    public k(boolean z, String baseId, String str, dj0.d dVar, u6c.l moveMoneyTarget) {
        Intrinsics.checkNotNullParameter(baseId, "baseId");
        Intrinsics.checkNotNullParameter(moveMoneyTarget, "moveMoneyTarget");
        this.f269955a = z;
        this.f269956b = baseId;
        this.f269957c = str;
        this.d = dVar;
        this.e = moveMoneyTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f269955a == kVar.f269955a && Intrinsics.f(this.f269956b, kVar.f269956b) && Intrinsics.f(this.f269957c, kVar.f269957c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f269955a) * 31, 31, this.f269956b);
        String str = this.f269957c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.d;
        return this.e.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public /* synthetic */ k(boolean z, String str) {
        this(z, str, null, null, u6c.l.UNDEFINED);
    }
}
