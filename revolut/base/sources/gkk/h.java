package gkk;

import au0.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f144416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f144417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f144418c;

    public h(q0 q0Var, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f144416a = title;
        this.f144417b = textLocalisedClause;
        this.f144418c = q0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f144416a.equals(hVar.f144416a) && Intrinsics.f(this.f144417b, hVar.f144417b) && Intrinsics.f(this.f144418c, hVar.f144418c);
    }

    public final int hashCode() {
        int iHashCode = this.f144416a.hashCode() * 31;
        Clause clause = this.f144417b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        q0 q0Var = this.f144418c;
        return iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0);
    }
}
