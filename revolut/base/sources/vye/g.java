package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f293310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f293311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f293312c;
    public final String d;
    public final String e;
    public final String f;

    public g(TextClause title, TextClause textClause, Image logo, String institutionId, String institutionName, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f293310a = title;
        this.f293311b = textClause;
        this.f293312c = logo;
        this.d = institutionId;
        this.e = institutionName;
        this.f = str;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293312c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: a */
    public final Clause getF() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f293310a.equals(gVar.f293310a) && this.f293311b.equals(gVar.f293311b) && this.f293312c.equals(gVar.f293312c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293311b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293310a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a10.b.c(this.f293312c, v7.b(this.f293310a.hashCode() * 31, 31, this.f293311b), 961), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PreselectedPixSmartTransferInstitution(title=");
        sb6.append(this.f293310a);
        sb6.append(", description=");
        sb6.append(this.f293311b);
        sb6.append(", logo=");
        sb6.append(this.f293312c);
        sb6.append(", fundsArrivalTimeDescription=null, institutionId=");
        sb6.append(this.d);
        sb6.append(", institutionName=");
        return j6.a.w(sb6, this.e, ", branchId=", this.f, ")");
    }
}
