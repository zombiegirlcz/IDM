package mx0;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f209625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f209626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f209627c;
    public final TagViewData d;
    public final AnalyticsContext e;

    public c2(UrlVideo urlVideo, Clause title, TextClause subtitle, TagViewData tagViewData, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(urlVideo, "urlVideo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f209625a = urlVideo;
        this.f209626b = title;
        this.f209627c = subtitle;
        this.d = tagViewData;
        this.e = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return this.f209625a.equals(c2Var.f209625a) && this.f209626b.equals(c2Var.f209626b) && this.f209627c.equals(c2Var.f209627c) && Intrinsics.f(this.d, c2Var.d) && this.e.equals(c2Var.e);
    }

    public final int hashCode() {
        int iB = ip0.v7.b(p.a.b(this.f209625a.hashCode() * 31, 31, this.f209626b), 31, this.f209627c);
        TagViewData tagViewData = this.d;
        return AnalyticsContext.a(this.e.f50296a) + ((iB + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31);
    }
}
