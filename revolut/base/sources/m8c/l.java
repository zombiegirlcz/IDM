package m8c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f203474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f203475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f203476c;
    public final Image d;
    public final List e;

    public l(MoneyClause moneyClause, TextClause textClause, TextLocalisedClause textLocalisedClause, Image image, List navBarActions) {
        Intrinsics.checkNotNullParameter(navBarActions, "navBarActions");
        this.f203474a = moneyClause;
        this.f203475b = textClause;
        this.f203476c = textLocalisedClause;
        this.d = image;
        this.e = navBarActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f203474a, lVar.f203474a) && Intrinsics.f(this.f203475b, lVar.f203475b) && Intrinsics.f(this.f203476c, lVar.f203476c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f203474a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f203475b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f203476c;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Image image = this.d;
        return this.e.hashCode() + ((iHashCode3 + (image != null ? image.hashCode() : 0)) * 31);
    }
}
