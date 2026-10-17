package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f293307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f293308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f293309c;
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data d;
    public final boolean e;

    public f(TextClause title, TextClause textClause, Image logo, EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
        this.f293307a = title;
        this.f293308b = textClause;
        this.f293309c = logo;
        this.d = preselectedInstitutionInfo;
        this.e = z;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293309c;
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
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f293307a.equals(fVar.f293307a) && this.f293308b.equals(fVar.f293308b) && this.f293309c.equals(fVar.f293309c) && this.d.equals(fVar.d) && this.e == fVar.e;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293308b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293307a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + a10.b.c(this.f293309c, v7.b(this.f293307a.hashCode() * 31, 31, this.f293308b), 961)) * 31);
    }
}
