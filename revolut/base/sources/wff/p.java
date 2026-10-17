package wff;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f297096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f297097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f297098c;

    public p(TextClause title, LargeActionButton.ButtonStyle style, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f297096a = title;
        this.f297097b = style;
        this.f297098c = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f297096a, pVar.f297096a) && Intrinsics.f(this.f297097b, pVar.f297097b) && Intrinsics.f(this.f297098c, pVar.f297098c);
    }

    public final int hashCode() {
        int iD = r6.b.d(this.f297097b, this.f297096a.hashCode() * 31, 31);
        AnalyticsContext analyticsContext = this.f297098c;
        return iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
