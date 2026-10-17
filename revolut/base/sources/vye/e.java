package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f293304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f293305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293306c;
    public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData d;

    public e(TextClause title, TextClause textClause, Image logo, CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData preselectedInstitutionData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(preselectedInstitutionData, "preselectedInstitutionData");
        this.f293304a = title;
        this.f293305b = textClause;
        this.f293306c = logo;
        this.d = preselectedInstitutionData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293306c;
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
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f293304a.equals(eVar.f293304a) && this.f293305b.equals(eVar.f293305b) && this.f293306c.equals(eVar.f293306c) && Intrinsics.f(this.d, eVar.d);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293305b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293304a;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(v7.b(this.f293304a.hashCode() * 31, 31, this.f293305b), 961, this.f293306c);
    }
}
