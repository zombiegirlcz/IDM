package gie;

import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.api.UserChecklistDestination;
import com.revolut.feature.user.checklist.api.UserChecklistSource;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import gld.f0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.j2;
import vkm.o2;
import vkm.t0;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends j {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Set f144148x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final emg.a f144149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final emg.a f144150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final eie.a f144151n;
    public final cie.z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cie.v f144152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mkd.d f144153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f144154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sri.m f144155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f144156t;
    public final z1 u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f144157w;

    static {
        ProductId[] elements = {ProductId.CURRENCY, ProductId.TOTAL_WEALTH};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f144148x = kotlin.collections.d.y0(elements);
    }

    public s(emg.a adoptionJourneyInteractor, emg.a fincrimeChecklistInteractor, eie.a tabAccountsSlotManagerPromptShownState, cie.z slotChecklistProvider, cie.v productAccountIntroChecker, mkd.d slotManagerFeedControllerModelExtension, a planOnboardingControllerModelExtension, sri.m navigator) {
        Intrinsics.checkNotNullParameter(adoptionJourneyInteractor, "adoptionJourneyInteractor");
        Intrinsics.checkNotNullParameter(fincrimeChecklistInteractor, "fincrimeChecklistInteractor");
        Intrinsics.checkNotNullParameter(tabAccountsSlotManagerPromptShownState, "tabAccountsSlotManagerPromptShownState");
        Intrinsics.checkNotNullParameter(slotChecklistProvider, "slotChecklistProvider");
        Intrinsics.checkNotNullParameter(productAccountIntroChecker, "productAccountIntroChecker");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(planOnboardingControllerModelExtension, "planOnboardingControllerModelExtension");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f144149l = adoptionJourneyInteractor;
        this.f144150m = fincrimeChecklistInteractor;
        this.f144151n = tabAccountsSlotManagerPromptShownState;
        this.o = slotChecklistProvider;
        this.f144152p = productAccountIntroChecker;
        this.f144153q = slotManagerFeedControllerModelExtension;
        this.f144154r = planOnboardingControllerModelExtension;
        this.f144155s = navigator;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f144156t = vkm.q.b(1, 1, fVar);
        this.u = vkm.q.b(1, 1, fVar);
        this.v = vkm.q.c(null);
        this.f144157w = vkm.q.b(1, 1, fVar);
    }

    @Override // gie.j
    public final boolean Z2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!d0.J(deeplink, "adoption-journey", false)) {
            return false;
        }
        f3(UserChecklistSource.SlotTiles.f94601a);
        return true;
    }

    @Override // gie.j
    public final z1 b3() {
        return this.f144157w;
    }

    @Override // gie.j
    public final void c3() {
        this.v.setValue(Unit.f186387a);
    }

    @Override // gie.j
    public final void d3(Flow currentAccountContentFlow, boolean z) {
        Intrinsics.checkNotNullParameter(currentAccountContentFlow, "currentAccountContentFlow");
        Continuation continuation = null;
        Flow flowQ = vkm.q.Q(vkm.q.Q(new t0(this.v, 1), new n(this, (Continuation) null)), new n((Continuation) null, this));
        if (z) {
            flowQ = vkm.q.C(flowQ, p0.f264002b);
        }
        yji.n.l2(this, flowQ, null, new p(this, null), 3);
        int i = 2;
        Flow flowQ2 = vkm.q.q(vkm.q.Q(vkm.q.Q(new o2(this.f144156t, new g2d.c(i, 6, continuation)), new n(this, (Continuation) null)), new o(continuation, this, currentAccountContentFlow, 0)));
        if (z) {
            flowQ2 = vkm.q.C(flowQ2, p0.f264002b);
        }
        yji.n.l2(this, flowQ2, null, new q(this, null), 3);
        Flow flowQ3 = vkm.q.q(vkm.q.Q(vkm.q.Q(new o2(this.u, new g2d.c(i, 7, continuation)), new n(this, (Continuation) null)), new o(continuation, this, currentAccountContentFlow, 1)));
        if (z) {
            flowQ3 = vkm.q.C(flowQ3, p0.f264002b);
        }
        yji.n.l2(this, flowQ3, null, new r(this, null), 3);
    }

    @Override // gie.j
    public final void e3() {
        Unit unit = Unit.f186387a;
        this.f144156t.k(unit);
        this.u.k(unit);
        ((f0) this.f144153q).f144638l.f144625p.k(unit);
    }

    public final void f3(UserChecklistSource userChecklistSource) {
        this.f144155s.c(new FeatureCommand(new KompotOverlayFeatureConfig(new UserChecklistDestination(userChecklistSource, UserChecklistContentType.AdoptionJourney.f94595a, false), yhi.b.SOLID, (Integer) null, 12)));
    }
}
