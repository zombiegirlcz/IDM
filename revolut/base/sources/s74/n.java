package s74;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f260517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f260518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f260519c;
    public final Clause d;
    public final aw0.i e;
    public final ArrayList f;

    public n(ResourceImage navigationIcon, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, CompositeClause compositeClause, aw0.i iVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260517a = navigationIcon;
        this.f260518b = title;
        this.f260519c = textLocalisedClause;
        this.d = compositeClause;
        this.e = iVar;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f260517a.equals(nVar.f260517a) && this.f260518b.equals(nVar.f260518b) && Intrinsics.f(this.f260519c, nVar.f260519c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f260517a.hashCode() * 31, 31, this.f260518b);
        Clause clause = this.f260519c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        aw0.i iVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
