package fnc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f136650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f136651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136652c;
    public final Image d;
    public final Clause e;

    public q(TextClause portfolioName, TextLocalisedClause riskClause, List actions, Image icon, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(riskClause, "riskClause");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f136650a = portfolioName;
        this.f136651b = riskClause;
        this.f136652c = actions;
        this.d = icon;
        this.e = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f136650a.equals(qVar.f136650a) && this.f136651b.equals(qVar.f136651b) && Intrinsics.f(this.f136652c, qVar.f136652c) && this.d.equals(qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, p.a.d(t61.a.a(this.f136650a.hashCode() * 31, 31, this.f136651b), 31, this.f136652c), 31);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
