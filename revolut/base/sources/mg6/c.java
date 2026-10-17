package mg6;

import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;
import efm.d0;
import hf6.i;
import if6.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ma2.s;
import mp.p;
import oe6.m;
import te0.w;
import ufm.n;
import w4l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f205160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f205161b;

    public c(d openBankingRepository, p streetModePaymentLocationInteractor) {
        Intrinsics.checkNotNullParameter(openBankingRepository, "openBankingRepository");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f205160a = openBankingRepository;
        this.f205161b = streetModePaymentLocationInteractor;
    }

    public final n a(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        i iVar = (i) this.f205160a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        d0<k> clientDetails = iVar.f151760a.getClientDetails(clientId);
        hae.k kVar = new hae.k(new hf6.b(iVar, 3), 18);
        clientDetails.getClass();
        ufm.i iVar2 = new ufm.i(clientDetails, kVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }

    public final akg.n b(String clientId, OpenBankingConsentsFilter consentState) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i iVar = (i) this.f205160a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(iVar.f151764h.b(Unit.f186387a, loadingStrategy), new s(consentState, clientId, 13));
    }
}
