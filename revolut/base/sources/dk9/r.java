package dk9;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f115476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f115477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f115478c;
    public final TimeClause d;
    public final Image e;
    public final List f;

    public r(MoneyClause title, TextClause toolbarTitle, CompositeClause description, TimeClause planStartDateText, Image icon, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(planStartDateText, "planStartDateText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f115476a = title;
        this.f115477b = toolbarTitle;
        this.f115478c = description;
        this.d = planStartDateText;
        this.e = icon;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f115476a.equals(rVar.f115476a) && this.f115477b.equals(rVar.f115477b) && this.f115478c.equals(rVar.f115478c) && this.d.equals(rVar.d) && this.e.equals(rVar.e) && Intrinsics.f(this.f, rVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a10.b.c(this.e, h30.l.d(this.d, h30.l.c(this.f115478c, v7.b(this.f115476a.hashCode() * 31, 31, this.f115477b), 31), 31), 31);
    }
}
