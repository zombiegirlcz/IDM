package u2i;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import gld.p0;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tx0.p4;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends pri.c implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f276672h;
    public final c1i.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f276673j;
    public final mkd.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tga.k f276674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l4i.a f276675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f276676n;
    public r0i.a o;

    public h(gte.a featureToggleInteractor, c1i.g fxOrderRepository, r presentationModel, mkd.e slotManagerFeedDelegate, tga.k upgradeEntryPointItemProvider, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(fxOrderRepository, "fxOrderRepository");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(slotManagerFeedDelegate, "slotManagerFeedDelegate");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f276672h = featureToggleInteractor;
        this.i = fxOrderRepository;
        this.f276673j = presentationModel;
        this.k = slotManagerFeedDelegate;
        this.f276674l = upgradeEntryPointItemProvider;
        this.f276675m = amountConverter;
        this.f276676n = yhm.j.b(new tyl.a(this, 2));
    }

    public static j N(List list) {
        Object f53564b;
        Object objD0 = d0.d0(list);
        qv0.p pVar = objD0 instanceof qv0.p ? (qv0.p) objD0 : null;
        if (pVar != null && (f53564b = pVar.getF55191g()) != null && (f53564b instanceof mga.k)) {
        }
        return new j(list, null);
    }

    public final efm.r O(dj0.d transactionAmount, wd6.h orderType) {
        ufm.b bVarO0;
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        boolean zBooleanValue = ((Boolean) this.f276676n.getValue()).booleanValue();
        r rVar = this.f276673j;
        Continuation continuation = null;
        if (!zBooleanValue) {
            efm.r rVarSwitchMap = rVar.T1().switchMap(new u21.a(14, new toh.h(this, 9, transactionAmount, orderType)));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            return m70.a.h(rVarSwitchMap, new sr8.a(this, 27), null, new tw8.g(21), 2);
        }
        efm.r rVarSwitchMap2 = rVar.T1().switchMap(new u21.a(14, new toh.h(this, 9, transactionAmount, orderType)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarC = rd0.e.c(((p0) this.k).f144670h.h(), kotlin.coroutines.g.f186406a);
        r0i.a aVar = this.o;
        if (aVar != null) {
            od0.i.Companion.getClass();
            bVarO0 = efm.d0.m(od0.h.a(aVar));
            Intrinsics.checkNotNullExpressionValue(bVarO0, "just(...)");
        } else {
            bVarO0 = te0.w.o0(skm.p0.f264003c, new tjf.p0(this, continuation, 25));
        }
        efm.r rVarX = new ufm.i(bVarO0, new u21.a(15, new u21.b(15)), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarDoOnNext = nim.a.w(kli.a.i(rVarSwitchMap2, rVarC, rVarX), new u21.b(this, 16)).doOnNext(new u21.a(16, new p4(this, 20)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return m70.a.h(rVarDoOnNext, new sr8.a(28), null, new tw8.g(22), 2);
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        if (((Boolean) this.f276676n.getValue()).booleanValue()) {
            mkd.a screen = new mkd.a(new SlotContext(akd.s.CRYPTO_TRADE));
            p0 p0Var = (p0) this.k;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            gld.a0 a0Var = p0Var.f144670h;
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            a0Var.o.setValue(screen);
        }
    }
}
