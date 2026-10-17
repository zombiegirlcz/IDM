package fij;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f135433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f135434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f135435c;

    public a0(z zVar, z zVar2, TextLocalisedClause textLocalisedClause) {
        this.f135433a = zVar;
        this.f135434b = zVar2;
        this.f135435c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f135433a, a0Var.f135433a) && Intrinsics.f(this.f135434b, a0Var.f135434b) && Intrinsics.f(this.f135435c, a0Var.f135435c);
    }

    public final int hashCode() {
        z zVar = this.f135433a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        z zVar2 = this.f135434b;
        int iHashCode2 = (iHashCode + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
        Clause clause = this.f135435c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
