package my8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f210398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f210399b;

    public s(t status, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f210398a = status;
        this.f210399b = textLocalisedClause;
    }

    public final t a() {
        return this.f210398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f210398a == sVar.f210398a && Intrinsics.f(this.f210399b, sVar.f210399b);
    }

    public final int hashCode() {
        int iHashCode = this.f210398a.hashCode() * 31;
        Clause clause = this.f210399b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
