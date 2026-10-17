package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f293301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f293303c;
    public final Clause d;
    public final c e;

    public d(TextClause title, TextClause textClause, Image logo, CompositeClause compositeClause, c type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f293301a = title;
        this.f293302b = textClause;
        this.f293303c = logo;
        this.d = compositeClause;
        this.e = type;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293303c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: a */
    public final Clause getF() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f293301a.equals(dVar.f293301a) && Intrinsics.f(this.f293302b, dVar.f293302b) && this.f293303c.equals(dVar.f293303c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293302b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293301a;
    }

    public final int hashCode() {
        int iHashCode = this.f293301a.hashCode() * 31;
        Clause clause = this.f293302b;
        int iC = a10.b.c(this.f293303c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        return this.e.hashCode() + ((iC + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
