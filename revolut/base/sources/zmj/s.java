package zmj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f323588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f323589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f323590c;

    public s(TextLocalisedClause title, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f323588a = title;
        this.f323589b = clause;
        this.f323590c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f323588a.equals(sVar.f323588a) && Intrinsics.f(this.f323589b, sVar.f323589b) && Intrinsics.f(this.f323590c, sVar.f323590c);
    }

    public final int hashCode() {
        int iHashCode = this.f323588a.hashCode() * 31;
        Clause clause = this.f323589b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f323590c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
