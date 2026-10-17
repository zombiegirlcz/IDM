package gic;

import aii.o;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import f0d.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bgc.e f144117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f144118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c70.a f144119n;
    public final ajk.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lic.g f144120p;

    public h(bgc.e rewardsInteractor, o eventsDispatcher, c70.a clipboard, ajk.b outOfAppNavigationProvider, lic.g externalRegistrationActionHandler) {
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(externalRegistrationActionHandler, "externalRegistrationActionHandler");
        this.f144117l = rewardsInteractor;
        this.f144118m = eventsDispatcher;
        this.f144119n = clipboard;
        this.o = outOfAppNavigationProvider;
        this.f144120p = externalRegistrationActionHandler;
    }

    public static final Object Z2(h hVar, String str, gim.i iVar) {
        return pu7.a.B(hVar.e, "REDEEM_REWARD_TASK_ID", new gi2.i(hVar, str, null, 1), iVar);
    }

    public final void b3(String promoCode) {
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        this.f144119n.c(null, promoCode, false, new g8i.h(this, 10));
    }

    public final efm.b c3(RewardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof RewardAction.OpenUrl) {
            return new pfm.h(w.o0(kotlin.coroutines.g.f186406a, new d(this, action, null)), 4);
        }
        if (action instanceof RewardAction.RedeemPromocodeAndOpenUrl) {
            return new pfm.h(w.o0(kotlin.coroutines.g.f186406a, new e(this, action, null)), 4);
        }
        if (action instanceof RewardAction.OpenPromoUrl) {
            return new pfm.h(w.o0(kotlin.coroutines.g.f186406a, new f(this, action, null)), 4);
        }
        if (action instanceof RewardAction.OpenMap) {
            return new pfm.h(new m(this, action, 26), 2);
        }
        if (action instanceof RewardAction.ExternalRegistration) {
            return this.f144120p.a3(new kic.f(((RewardAction.ExternalRegistration) action).f84819c));
        }
        if (!(action instanceof RewardAction.Activate) && !(action instanceof RewardAction.EmptyAction) && !(action instanceof RewardAction.ComplexAction) && !(action instanceof RewardAction.Footer) && !(action instanceof RewardAction.PartnerMembershipAction.RequestActivation) && !(action instanceof RewardAction.PartnerMembershipAction.Activated)) {
            throw new NoWhenBranchMatchedException();
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
