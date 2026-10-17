package x88;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f303301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f303302c;
    public final LayeredImage d;
    public final RowDelegate.Model.c e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final of f303303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeModel f303304h;
    public final boolean i;

    public e(String listId, TextLocalisedClause title, Clause clause, LayeredImage image, RowDelegate.Model.c cVar, Object obj2, of titleStyle, AccentCircleBadge accentCircleBadge, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        this.f303300a = listId;
        this.f303301b = title;
        this.f303302c = clause;
        this.d = image;
        this.e = cVar;
        this.f = obj2;
        this.f303303g = titleStyle;
        this.f303304h = accentCircleBadge;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f303300a, eVar.f303300a) && Intrinsics.f(this.f303301b, eVar.f303301b) && Intrinsics.f(this.f303302c, eVar.f303302c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f303303g == eVar.f303303g && Intrinsics.f(this.f303304h, eVar.f303304h) && this.i == eVar.i;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f303300a.hashCode() * 31, 31, this.f303301b);
        Clause clause = this.f303302c;
        int iE = l.e(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        RowDelegate.Model.c cVar = this.e;
        int iHashCode = (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f;
        int iHashCode2 = (this.f303303g.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31;
        CircleBadgeModel circleBadgeModel = this.f303304h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31);
    }

    public /* synthetic */ e(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, LayeredImage layeredImage, RowDelegate.Model.c cVar, Object obj2, boolean z) {
        this(str, textLocalisedClause, textLocalisedClause2, layeredImage, cVar, obj2, of.DEFAULT, null, z);
    }
}
