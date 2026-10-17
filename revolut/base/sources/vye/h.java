package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f293314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f293315c;
    public final Image d;
    public final Clause e;

    public h(CompositeClause compositeClause, TextClause title, TextClause textClause, Image logo, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f293313a = id10;
        this.f293314b = title;
        this.f293315c = textClause;
        this.d = logo;
        this.e = compositeClause;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.d;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: a */
    public final Clause getF() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f293313a, hVar.f293313a) && this.f293314b.equals(hVar.f293314b) && Intrinsics.f(this.f293315c, hVar.f293315c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293315c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293314b;
    }

    public final int hashCode() {
        int iB = v7.b(this.f293313a.hashCode() * 31, 31, this.f293314b);
        Clause clause = this.f293315c;
        int iC = a10.b.c(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.e;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }
}
