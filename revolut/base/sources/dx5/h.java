package dx5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f120876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f120877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f120878c;
    public final boolean d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f120879g;

    public h(MoneyClause toolbarTitle, Clause toolbarDescription, PairedImage pairedImage, boolean z, Clause clause, Clause clause2, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120876a = toolbarTitle;
        this.f120877b = toolbarDescription;
        this.f120878c = pairedImage;
        this.d = z;
        this.e = clause;
        this.f = clause2;
        this.f120879g = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f120879g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f120876a.equals(hVar.f120876a) && Intrinsics.f(this.f120877b, hVar.f120877b) && Intrinsics.f(this.f120878c, hVar.f120878c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f120879g, hVar.f120879g);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f120876a.hashCode() * 31, 31, this.f120877b);
        Image image = this.f120878c;
        int iC = j6.a.c((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        Clause clause = this.e;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f;
        return this.f120879g.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
