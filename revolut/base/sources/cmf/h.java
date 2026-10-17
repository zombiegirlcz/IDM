package cmf;

import aw0.i3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f25231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f25232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f25233c;
    public final Image d;
    public final CircleBadgeModel e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f25235h;
    public final NavBarWithContainerBackground i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AvatarModel.Border f25236j;

    public h(Clause title, Clause clause, Clause clause2, Image icon, CircleBadgeModel circleBadgeModel, boolean z, boolean z3, i3 i3Var, NavBarWithContainerBackground navBarWithContainerBackground, AvatarModel.Border border) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f25231a = title;
        this.f25232b = clause;
        this.f25233c = clause2;
        this.d = icon;
        this.e = circleBadgeModel;
        this.f = z;
        this.f25234g = z3;
        this.f25235h = i3Var;
        this.i = navBarWithContainerBackground;
        this.f25236j = border;
    }

    public static h a(h hVar, Clause clause, Clause clause2, Clause clause3, Image image, CircleBadgeModel circleBadgeModel, boolean z, boolean z3, i3 i3Var, NavBarWithContainerBackground navBarWithContainerBackground, AvatarModel.Border.StaticGradient staticGradient, int i) {
        if ((i & 1) != 0) {
            clause = hVar.f25231a;
        }
        Clause title = clause;
        if ((i & 2) != 0) {
            clause2 = hVar.f25232b;
        }
        Clause clause4 = clause2;
        if ((i & 4) != 0) {
            clause3 = hVar.f25233c;
        }
        Clause clause5 = clause3;
        if ((i & 8) != 0) {
            image = hVar.d;
        }
        Image icon = image;
        CircleBadgeModel circleBadgeModel2 = (i & 16) != 0 ? hVar.e : circleBadgeModel;
        boolean z4 = (i & 32) != 0 ? hVar.f : z;
        boolean z6 = (i & 64) != 0 ? hVar.f25234g : z3;
        hVar.getClass();
        i3 i3Var2 = (i & 256) != 0 ? hVar.f25235h : i3Var;
        NavBarWithContainerBackground navBarWithContainerBackground2 = (i & 512) != 0 ? hVar.i : navBarWithContainerBackground;
        AvatarModel.Border border = (i & 1024) != 0 ? hVar.f25236j : staticGradient;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new h(title, clause4, clause5, icon, circleBadgeModel2, z4, z6, i3Var2, navBarWithContainerBackground2, border);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f25231a, hVar.f25231a) && Intrinsics.f(this.f25232b, hVar.f25232b) && Intrinsics.f(this.f25233c, hVar.f25233c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && this.f25234g == hVar.f25234g && Intrinsics.f(this.f25235h, hVar.f25235h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f25236j, hVar.f25236j);
    }

    public final int hashCode() {
        int iHashCode = this.f25231a.hashCode() * 31;
        Clause clause = this.f25232b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f25233c;
        int iC = a10.b.c(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        CircleBadgeModel circleBadgeModel = this.e;
        int iC2 = j6.a.c(j6.a.c((iC + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31, this.f), 961, this.f25234g);
        i3 i3Var = this.f25235h;
        int iHashCode3 = (iC2 + (i3Var == null ? 0 : i3Var.f10352a.hashCode())) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.i;
        int iHashCode4 = (iHashCode3 + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31;
        AvatarModel.Border border = this.f25236j;
        return iHashCode4 + (border != null ? border.hashCode() : 0);
    }

    public /* synthetic */ h(MoneyClause moneyClause, Clause clause, TimeClause timeClause, Image image, CircleIconBadge circleIconBadge, boolean z, boolean z3) {
        this(moneyClause, clause, timeClause, image, circleIconBadge, z, z3, null, null, null);
    }
}
