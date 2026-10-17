package d3j;

import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import f5j.k;
import f5j.n;
import f5j.p;
import f5j.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5h.g f111218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f111219b;

    static {
        Intrinsics.checkNotNullParameter("HIDDEN_BENEFICIARY_SUGGESTIONS", "id");
    }

    public j(a5h.g beneficiarySuggestionsRepository, f beneficiarySuggestionsHiddenKeysProvider, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsRepository, "beneficiarySuggestionsRepository");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsHiddenKeysProvider, "beneficiarySuggestionsHiddenKeysProvider");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f111218a = beneficiarySuggestionsRepository;
        this.f111219b = personalisationStorage;
    }

    public final KompotDestination a(k suggestionData) {
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        int i = h.f111216a[suggestionData.f132353a.f132350a.ordinal()];
        if (i == 1) {
            return new RemittanceBridgeFeatureConfig.BridgeDestination(new RemittanceInputData(null, 7));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, null, 15);
    }

    public final Flow b(q requestParams) {
        vkm.d dVarB;
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean z = requestParams instanceof n;
        a5h.g gVar = this.f111218a;
        if (z) {
            n requestParams2 = (n) requestParams;
            Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            dVarB = ((x4l.c) gVar.f).b(requestParams2, loadingStrategy);
        } else {
            if (!(requestParams instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            p requestParams3 = (p) requestParams;
            Intrinsics.checkNotNullParameter(requestParams3, "requestParams");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            dVarB = ((x4l.c) gVar.e).b(requestParams3, loadingStrategy);
        }
        return c6d.b.i(dVarB, new d3i.k(requestParams, this, 4));
    }

    public final Object c(k kVar, gim.i iVar) {
        String strA = f.a(kVar);
        mk0.a aVar = this.f111219b;
        List list = (List) kii.e.n("HIDDEN_BENEFICIARY_SUGGESTIONS", aVar);
        if (list == null) {
            list = f0.f322471a;
        }
        if (list.contains(strA)) {
            return Unit.f186387a;
        }
        Object objE = aVar.e(new tk0.e("HIDDEN_BENEFICIARY_SUGGESTIONS"), d0.E0(u.c(strA), list), iVar);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }
}
