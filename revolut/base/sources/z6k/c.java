package z6k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.RawAccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f319784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f319785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f319786c;
    public final Image d;
    public final RawAccentCircleBadge e;
    public final List f;

    public c(MoneyClause title, TextLocalisedClause textLocalisedClause, TimeClause date, Image avatar, RawAccentCircleBadge rawAccentCircleBadge, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f319784a = title;
        this.f319785b = textLocalisedClause;
        this.f319786c = date;
        this.d = avatar;
        this.e = rawAccentCircleBadge;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f319784a.equals(cVar.f319784a) && Intrinsics.f(this.f319785b, cVar.f319785b) && this.f319786c.equals(cVar.f319786c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f319784a.hashCode() * 31;
        Clause clause = this.f319785b;
        return this.f.hashCode() + j6.a.b(this.e.f58063a, a10.b.c(this.d, h30.l.d(this.f319786c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31), 31);
    }
}
