package s9b;

import android.os.Parcelable;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import wli.x;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends oki.h implements h {

    @NotNull
    public static final k Companion = new k();
    public final r10.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f261164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f261165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p9b.e f261166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ogm.i f261167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u79.a f261168t;
    public final x u;
    public final e1l.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f261169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f261170x;

    public p(cli.n stateMapper, r10.q userRegisteredIdentitiesInteractor, ang.f userInteractor, g1 shotDialogDisplayer, p9b.e countryProfilesManagementBottomSheetMapper, ogm.i setDefaultProfileInteractor, u79.a offboardingInteractor, x deeplinkHandler, e1l.a countryProfilesManagementScreenErrorProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(countryProfilesManagementBottomSheetMapper, "countryProfilesManagementBottomSheetMapper");
        Intrinsics.checkNotNullParameter(setDefaultProfileInteractor, "setDefaultProfileInteractor");
        Intrinsics.checkNotNullParameter(offboardingInteractor, "offboardingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(countryProfilesManagementScreenErrorProvider, "countryProfilesManagementScreenErrorProvider");
        this.o = userRegisteredIdentitiesInteractor;
        this.f261164p = userInteractor;
        this.f261165q = shotDialogDisplayer;
        this.f261166r = countryProfilesManagementBottomSheetMapper;
        this.f261167s = setDefaultProfileInteractor;
        this.f261168t = offboardingInteractor;
        this.u = deeplinkHandler;
        this.v = countryProfilesManagementScreenErrorProvider;
        this.f261169w = new vii.b();
        this.f261170x = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f261169w, new n(continuation, this, 0)), h0.f322473a), null, null, new s56.i(this, continuation, 18), 3);
    }

    public final void I2(String registeredIdentityId, String country, p9b.c countryProfileState) {
        List listC;
        this.f261166r.getClass();
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryProfileState, "countryProfileState");
        wi0.b.Companion.getClass();
        CountryClause countryClause = new CountryClause(wi0.a.a(country), null);
        int i = p9b.d.f234291a[countryProfileState.ordinal()];
        if (i == 1) {
            listC = u.c(p9b.e.a(registeredIdentityId));
        } else if (i == 2) {
            listC = v.k(new eii.l((Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_sheet_positive_answer, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_check, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 4.0f, null, null, 48), null, null, false, null, true, 28), true, false, (RowDelegate.Model.c) null, (Object) new p9b.b(registeredIdentityId, p9b.a.SET_DEFAULT), 232), p9b.e.a(registeredIdentityId));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(new eii.l((Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_sheet_get_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_documents_pair, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 4.0f, null, null, 48), null, null, false, null, true, 28), true, false, (RowDelegate.Model.c) null, (Object) new p9b.b(registeredIdentityId, p9b.a.GET_DOCUMENTS), 232));
        }
        lw0.a aVar = new lw0.a(countryClause, null, null, null, false, 30);
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        f2(new RowActionsBottomSheetController(new eii.c(aVar, null, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new j(this, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f261170x;
    }
}
