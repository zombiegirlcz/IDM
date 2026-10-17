package bai;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcceptBankTermsScreenContract$InputData f14110a;

    public q(AcceptBankTermsScreenContract$InputData inputData, dai.a bankTermsDisclosuresProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bankTermsDisclosuresProvider, "bankTermsDisclosuresProvider");
        this.f14110a = inputData;
    }

    public static RowDelegate.Model a(Terms terms) {
        String str = terms.f90355a;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        TermsScope termsScope = terms.f;
        TermsScope.INSTANCE.getClass();
        int i = Intrinsics.f(termsScope, TermsScope.l0) ? R$drawable.uikit_icn_24_services : Intrinsics.f(termsScope, TermsScope.f90376p) ? R$drawable.uikit_icn_24_insurance : (Intrinsics.f(termsScope, TermsScope.f90389y) || Intrinsics.f(termsScope, TermsScope.U) || Intrinsics.f(termsScope, TermsScope.z)) ? R$drawable.uikit_icn_24_fees : Intrinsics.f(termsScope, TermsScope.Y) ? R$drawable.uikit_icn_24_info_outline : Intrinsics.f(termsScope, TermsScope.D) ? R$drawable.uikit_icn_24_bank : (Intrinsics.f(termsScope, TermsScope.f90360a0) || Intrinsics.f(termsScope, TermsScope.J) || !Intrinsics.f(termsScope, TermsScope.c0)) ? R$drawable.uikit_icn_24_document : R$drawable.uikit_icn_24_present;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(companion.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextClause(terms.f90359h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), true, null, false, null, null, null, null, null, null, terms, null, 0, 0, 0, 0, 532673528);
    }

    public static List b() {
        return u.c(new FullScreenStateDelegate.Model("ERROR_ITEM_ID", null, new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 31698));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f14100a, new b9i.f(this, 5), new b7d.c(this, 12), new b1c.p(this, domainState, 7));
    }

    public final m d(List list, boolean z, boolean z3) {
        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = this.f14110a;
        AcceptBankTermsScreenContract$Configuration acceptBankTermsScreenContract$Configuration = acceptBankTermsScreenContract$InputData.f97486a;
        AcceptBankTermsScreenContract$Configuration acceptBankTermsScreenContract$Configuration2 = acceptBankTermsScreenContract$InputData.f97486a;
        WorkflowScreenConfiguration f97484b = acceptBankTermsScreenContract$Configuration.getF97484b();
        Object textLocalisedClause = f97484b != null ? f97484b.f105668a : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = com.bumptech.glide.d.l(acceptBankTermsScreenContract$Configuration.getF97483a()) ? new TextLocalisedClause(R$string.signup_bank_terms_title_au, null, null, 14) : com.bumptech.glide.d.x(acceptBankTermsScreenContract$Configuration.getF97483a()) ? new TextLocalisedClause(R$string.terms_lead_header_title, null, null, 14) : new TextLocalisedClause(R$string.signup_bank_terms_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.declaration_terms_title, u.c(textLocalisedClause), null, 12);
        WorkflowScreenConfiguration f97484b2 = acceptBankTermsScreenContract$Configuration2.getF97484b();
        String str = f97484b2 != null ? f97484b2.f105669b : null;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        WorkflowScreenConfiguration f97484b3 = acceptBankTermsScreenContract$Configuration2.getF97484b();
        String str2 = f97484b3 != null ? f97484b3.f105670c : null;
        UrlImage urlImage = str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null;
        wi0.b f97483a = acceptBankTermsScreenContract$Configuration2.getF97483a();
        wi0.b.Companion.getClass();
        return new m(list, z, textLocalisedClause2, textClause, urlImage, Intrinsics.f(f97483a, wi0.b.f297756l) ? new TextLocalisedClause(R$string.common_action_sign_up, null, null, 14) : Intrinsics.f(f97483a, wi0.b.f297770q3) ? new TextLocalisedClause(R$string.terms_lead_action_title, null, null, 14) : new TextLocalisedClause(R$string.signup_bank_terms_accept_and_continue, null, null, 14), z3);
    }
}
