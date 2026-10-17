package bg5;

import akd.s;
import bb2.t;
import cli.n;
import cli.y;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import gld.f0;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements c {
    public final mkd.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jr5.a f15133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f15134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sd5.c f15135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f15136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f15137t;

    public h(n stateMapper, CryptoExchangeFees cryptoExchangeFees, CryptoExchangeFeesMode mode, mkd.d slotManagerFeedControllerModelExtension, jr5.a cryptoZeroFeesInteractor, gte.a featureToggleInteractor, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(cryptoZeroFeesInteractor, "cryptoZeroFeesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.o = slotManagerFeedControllerModelExtension;
        this.f15133p = cryptoZeroFeesInteractor;
        this.f15134q = featureToggleInteractor;
        this.f15135r = cryptoConfigInteractor;
        this.f15136s = mra.d.b(this, new d(cryptoExchangeFees, null, mode, CryptoZeroFeesPromotion.NotAvailable.f71354a, null), stateMapper, null, false, 12);
        this.f15137t = hx7.e.a(this, new t(21));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f15137t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (((jte.d) this.f15134q).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c) && (((d) ((j2) this.f15136s.f22677a).getValue()).f15128c instanceof CryptoExchangeFeesMode.UpgradePlan)) {
            mkd.a aVar = new mkd.a(new SlotContext(s.CRYPTO_EXCHANGE_FEES));
            f0 f0Var = (f0) this.o;
            f0Var.c3(aVar);
            l.b1(this, f0Var.f144638l.h(), null, new g(this, null, 2), 3);
        }
        l.b1(this, ((lr5.c) this.f15133p).a(), null, new g(this, null, 0), 3);
        l.b1(this, mo3.a.g(rd0.e.b(this.f15135r.a(false)), null, null, 3), null, new g(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15136s;
    }
}
