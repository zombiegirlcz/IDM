package w56;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f294707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f294708c;

    public k(aw0.e footerModel, TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f294706a = items;
        this.f294707b = navBarTitle;
        this.f294708c = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f294706a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f294706a, kVar.f294706a) && this.f294707b.equals(kVar.f294707b) && this.f294708c.equals(kVar.f294708c);
    }

    public final int hashCode() {
        return this.f294708c.hashCode() + t61.a.a(this.f294706a.hashCode() * 31, 31, this.f294707b);
    }
}
