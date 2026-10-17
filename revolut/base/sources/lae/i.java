package lae;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f193371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f193372c;

    public i(aim.e items, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193370a = items;
        this.f193371b = textLocalisedClause;
        this.f193372c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f193370a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f193370a, iVar.f193370a) && Intrinsics.f(this.f193371b, iVar.f193371b) && this.f193372c == iVar.f193372c;
    }

    public final int hashCode() {
        int iHashCode = this.f193370a.hashCode() * 31;
        Clause clause = this.f193371b;
        return Boolean.hashCode(this.f193372c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
