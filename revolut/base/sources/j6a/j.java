package j6a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f171705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar.b f171706b;

    public j(TextLocalisedClause title, s sVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f171705a = title;
        this.f171706b = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f171705a.equals(jVar.f171705a) && Intrinsics.f(this.f171706b, jVar.f171706b);
    }

    public final int hashCode() {
        int iHashCode = this.f171705a.hashCode() * 31;
        NavBarWithToolbar.b bVar = this.f171706b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
