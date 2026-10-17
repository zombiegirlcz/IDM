package wkk;

import cli.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f298294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f298295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f298296c;
    public final AnalyticsContext d;

    public g(Clause title, AnimatedBackgroundType background, List items, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298294a = title;
        this.f298295b = background;
        this.f298296c = items;
        this.d = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f298296c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298294a, gVar.f298294a) && Intrinsics.f(this.f298295b, gVar.f298295b) && Intrinsics.f(this.f298296c, gVar.f298296c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f298295b.hashCode() + (this.f298294a.hashCode() * 31)) * 31, 31, this.f298296c);
        AnalyticsContext analyticsContext = this.d;
        return iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
