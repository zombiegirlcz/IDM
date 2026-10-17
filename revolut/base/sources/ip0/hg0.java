package ip0;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hg0 implements kg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f164550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.x6 f164551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f164552c;
    public final TextLocalisedClause d;
    public final aw0.u6 e;

    public hg0(ArrayList chartItems, aw0.x6 chartColorScheme, CompositeClause chartTopLabel, TextLocalisedClause chartBottomLabel, aw0.u6 u6Var) {
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(chartColorScheme, "chartColorScheme");
        Intrinsics.checkNotNullParameter(chartTopLabel, "chartTopLabel");
        Intrinsics.checkNotNullParameter(chartBottomLabel, "chartBottomLabel");
        this.f164550a = chartItems;
        this.f164551b = chartColorScheme;
        this.f164552c = chartTopLabel;
        this.d = chartBottomLabel;
        this.e = u6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hg0)) {
            return false;
        }
        hg0 hg0Var = (hg0) obj2;
        return this.f164550a.equals(hg0Var.f164550a) && this.f164551b.equals(hg0Var.f164551b) && this.f164552c.equals(hg0Var.f164552c) && this.d.equals(hg0Var.d) && this.e.equals(hg0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(h30.l.c(this.f164552c, p.a.d(this.f164550a.hashCode() * 31, 31, this.f164551b.f10606a), 31), 31, this.d);
    }
}
