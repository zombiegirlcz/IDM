package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f293295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f293297c;
    public final Clause d;
    public final String e;

    public a(CompositeClause compositeClause, TextClause title, TextClause textClause, Image logo, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f293295a = title;
        this.f293296b = textClause;
        this.f293297c = logo;
        this.d = compositeClause;
        this.e = str;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293297c;
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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f293295a.equals(aVar.f293295a) && Intrinsics.f(this.f293296b, aVar.f293296b) && this.f293297c.equals(aVar.f293297c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293296b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293295a;
    }

    public final int hashCode() {
        int iHashCode = this.f293295a.hashCode() * 31;
        Clause clause = this.f293296b;
        int iC = a10.b.c(this.f293297c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
