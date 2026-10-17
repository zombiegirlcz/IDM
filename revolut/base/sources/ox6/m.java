package ox6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f230630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f230631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f230632c;
    public final LayeredImage d;
    public final Image e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f230633g;

    public m(MoneyClause title, TextClause textClause, TimeClause timeClause, LayeredImage headerImage, ResourceImage resourceImage, List actions, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230630a = title;
        this.f230631b = textClause;
        this.f230632c = timeClause;
        this.d = headerImage;
        this.e = resourceImage;
        this.f = actions;
        this.f230633g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f230633g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f230630a.equals(mVar.f230630a) && Intrinsics.f(this.f230631b, mVar.f230631b) && Intrinsics.f(this.f230632c, mVar.f230632c) && this.d.equals(mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f230633g, mVar.f230633g);
    }

    public final int hashCode() {
        int iHashCode = this.f230630a.hashCode() * 31;
        Clause clause = this.f230631b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f230632c;
        int iE = h30.l.e(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Image image = this.e;
        return this.f230633g.hashCode() + p.a.d((iE + (image != null ? image.hashCode() : 0)) * 31, 31, this.f);
    }
}
