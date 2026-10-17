package v4k;

import ax9.o;
import com.revolut.feature.crypto.convert.disclaimer.api.footer.CryptoConvertFooterDisclaimerDelegate$ClickTextParcel;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import v2e.h0;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sh5.d f286132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f286133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aah.h f286134n;
    public final b5k.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z4k.a f286135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final be5.e f286136q;

    public l(sh5.d cryptoFcaDisclaimerWidget, gte.a featureToggleInteractor, aah.h wealthDisclaimersExtension, b5k.a transferDataObservable, z4k.a transferReviewTypeObservable, be5.e cryptoConvertFooterDisclaimerDelegate) {
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(transferReviewTypeObservable, "transferReviewTypeObservable");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerDelegate, "cryptoConvertFooterDisclaimerDelegate");
        this.f286132l = cryptoFcaDisclaimerWidget;
        this.f286133m = featureToggleInteractor;
        this.f286134n = wealthDisclaimersExtension;
        this.o = transferDataObservable;
        this.f286135p = transferReviewTypeObservable;
        this.f286136q = cryptoConvertFooterDisclaimerDelegate;
    }

    @Override // v4k.a
    public final o Z2() {
        Flow gVar;
        if (((jte.d) this.f286133m).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c)) {
            r rVarX = ((gi5.d) this.f286132l).c(null).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            gVar = new h0(rd0.e.b(rVarX), 2);
        } else {
            gVar = new go.g(null, 2);
        }
        return new o(yh5.b.d(gVar, q.Q(yh5.b.d(rd0.e.b(this.o.f255130a), rd0.e.b(this.f286135p.f255130a)), new sdi.a((Continuation) null, this, 17))), 17);
    }

    @Override // v4k.a
    public final void b3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (clickData.d instanceof CryptoConvertFooterDisclaimerDelegate$ClickTextParcel) {
            V2(new v06.i(this, clickData, null, 10), new yi5.b(29));
        }
    }

    @Override // v4k.a
    public final void c3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.f286132l).d(clickData);
        if (cryptoFcaRisksDestinationD != null) {
            A2(cryptoFcaRisksDestinationD);
        }
    }
}
