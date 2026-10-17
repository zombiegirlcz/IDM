package u7k;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f277949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f277950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f277951c;
    public final yy0.l d;
    public final AccentCircleBadge e;
    public final boolean f;

    public c(MoneyClause title, TextLocalisedClause subtitle, TimeClause date, yy0.l lVar, AccentCircleBadge accentCircleBadge, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f277949a = title;
        this.f277950b = subtitle;
        this.f277951c = date;
        this.d = lVar;
        this.e = accentCircleBadge;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f277949a.equals(cVar.f277949a) && this.f277950b.equals(cVar.f277950b) && this.f277951c.equals(cVar.f277951c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.f58049a.hashCode() + ((this.d.hashCode() + h30.l.d(this.f277951c, t61.a.a(this.f277949a.hashCode() * 31, 31, this.f277950b), 31)) * 31)) * 31);
    }
}
