package hqe;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.teen.accounts.impl.R$string;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import hp3.r;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.v;
import vkm.q;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f154689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xqe.b f154690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iqe.f f154691c;
    public final z d;
    public final v e;
    public final wa7.m f;

    public o(wsg.b newWalletInteractor, xqe.b teenProfileInteractor, fqe.b teenAccountUiStateInteractor, iqe.f teenProductAccountsMapper, z delistedPocketsInteractor, iqe.e teenDashboardConfigMapper, v teenAggregatedAccountDataProvider, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(teenAccountUiStateInteractor, "teenAccountUiStateInteractor");
        Intrinsics.checkNotNullParameter(teenProductAccountsMapper, "teenProductAccountsMapper");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(teenDashboardConfigMapper, "teenDashboardConfigMapper");
        Intrinsics.checkNotNullParameter(teenAggregatedAccountDataProvider, "teenAggregatedAccountDataProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f154689a = newWalletInteractor;
        this.f154690b = teenProfileInteractor;
        this.f154691c = teenProductAccountsMapper;
        this.d = delistedPocketsInteractor;
        this.e = teenAggregatedAccountDataProvider;
        this.f = hiddenAccountsInteractor;
    }

    public final gqe.c a(TeenProfile teenProfile) {
        gqe.b accountUiState;
        tqe.a kycStatus = teenProfile.i;
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        int i = fqe.a.f137251a[kycStatus.ordinal()];
        if (i == 1) {
            accountUiState = gqe.b.ACTIVE;
        } else if (i == 2 || i == 3 || i == 4) {
            accountUiState = gqe.b.DOCUMENTS_REQUIRED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            accountUiState = gqe.b.REVIEWING_DOCUMENTS;
        }
        Intrinsics.checkNotNullParameter(accountUiState, "accountUiState");
        int i2 = iqe.d.f167821a[accountUiState.ordinal()];
        if (i2 == 1) {
            return new gqe.c(null, null, true, gqe.a.a());
        }
        if (i2 == 2) {
            return new gqe.c(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.teen_home_header_subtitle_kyc_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), false, u.c(gqe.a.MANAGE));
        }
        if (i2 == 3) {
            return new gqe.c(new AccentCircleBadge(dw0.a.Pending), new TextLocalisedClause(R$string.teen_home_header_subtitle_reviewing_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), false, u.c(gqe.a.MANAGE));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final akg.n b(String str, w4l.k kVar) {
        wsg.b bVar = this.f154689a;
        Flow flowE = boh.f.e(bVar.b(kVar), new j(this, str, 1));
        h0 h0Var = h0.f322473a;
        return nim.a.v(boh.f.e(u0.i(rd0.e.n(flowE, h0Var), rd0.e.n(this.f154690b.b(kVar), h0Var), q.q(nim.a.v(bVar.e(w4l.j.f294644c), new r(29)))), new k(this, 0)), new k(this, 1));
    }
}
