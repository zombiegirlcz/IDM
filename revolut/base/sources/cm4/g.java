package cm4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f25124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f25125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f25126c;
    public final CircleBadgeModel d;
    public final dj0.d e;
    public final TextLocalisedClause f;

    public g(Image icon, TextLocalisedClause title, Clause clause, DangerCircleBadge dangerCircleBadge, dj0.d balance, TextLocalisedClause balanceDescription) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(balanceDescription, "balanceDescription");
        this.f25124a = icon;
        this.f25125b = title;
        this.f25126c = clause;
        this.d = dangerCircleBadge;
        this.e = balance;
        this.f = balanceDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f25124a, gVar.f25124a) && this.f25125b.equals(gVar.f25125b) && Intrinsics.f(this.f25126c, gVar.f25126c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f.equals(gVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f25124a.hashCode() * 31, 31, this.f25125b);
        Clause clause = this.f25126c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.d;
        return this.f.hashCode() + v7.c((iHashCode + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31, 31, this.e);
    }
}
