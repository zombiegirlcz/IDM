package pg3;

import ahe.m0;
import akd.s;
import akf.u;
import amh.w;
import an9.g;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.feature.checklist_challenges.api.navigation.ChecklistCollectionDestination;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductCheckoutDestination;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import ivb.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n1g.p;
import n33.l0;
import n33.r0;
import n5b.d;
import okl.l1;
import om4.d0;
import qna.n;
import rbh.k;
import rd0.c;
import rd0.e;
import rg3.o;
import skd.i;
import vkm.q;
import vkm.q0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements lg3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f235795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f235796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f235797c;
    public final d d;

    public b(o checklistChallengesRepository, i slotManagerInteractor, d0 mainApplicationSlotContextProvider, d revPointsExclusiveStoreProvider) {
        Intrinsics.checkNotNullParameter(checklistChallengesRepository, "checklistChallengesRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        Intrinsics.checkNotNullParameter(revPointsExclusiveStoreProvider, "revPointsExclusiveStoreProvider");
        this.f235795a = checklistChallengesRepository;
        this.f235796b = slotManagerInteractor;
        this.f235797c = mainApplicationSlotContextProvider;
        this.d = revPointsExclusiveStoreProvider;
    }

    public static ChecklistChallengeCompleteCriteria a(List list) {
        Object obj2;
        Object next;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return ChecklistChallengeCompleteCriteria.Unknown.INSTANCE;
        }
        List list3 = list;
        Iterator it8 = list3.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ChecklistChallengeCompleteCriteria) next) instanceof ChecklistChallengeCompleteCriteria.RevPoints) {
                break;
            }
        }
        ChecklistChallengeCompleteCriteria checklistChallengeCompleteCriteria = (ChecklistChallengeCompleteCriteria) next;
        if (checklistChallengeCompleteCriteria != null) {
            return checklistChallengeCompleteCriteria;
        }
        Iterator it9 = list3.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (((ChecklistChallengeCompleteCriteria) next2) instanceof ChecklistChallengeCompleteCriteria.Checklist) {
                obj2 = next2;
                break;
            }
        }
        ChecklistChallengeCompleteCriteria checklistChallengeCompleteCriteria2 = (ChecklistChallengeCompleteCriteria) obj2;
        return checklistChallengeCompleteCriteria2 == null ? ChecklistChallengeCompleteCriteria.Unknown.INSTANCE : checklistChallengeCompleteCriteria2;
    }

    public final ChecklistChallengeCompleteCriteria b(ChecklistChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        ChecklistChallengeState checklistChallengeState = challenge.f65777c;
        return !(checklistChallengeState instanceof ChecklistChallengeState.OptIn) ? ChecklistChallengeCompleteCriteria.Unknown.INSTANCE : a(((ChecklistChallengeState.OptIn) checklistChallengeState).f65803a);
    }

    public final KompotOverlayFeatureConfig c(AnalyticsProduct analyticsProduct, String str, String str2) {
        if (str2 == null) {
            s screen = this.f235797c.h().f87254a;
            Intrinsics.checkNotNullParameter(screen, "screen");
            str2 = this.f235796b.d.b(screen);
        }
        return new KompotOverlayFeatureConfig(new SlotChecklistDestination(new SlotChecklistFetchConfig(str2, null, str), analyticsProduct), yhi.b.BOTTOM_DIALOG, (Integer) null, 12);
    }

    public final KompotFeatureConfig d(ChecklistChallenge challenge, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        ChecklistChallengeState checklistChallengeState = challenge.f65777c;
        String str = challenge.d;
        if (!(checklistChallengeState instanceof ChecklistChallengeState.OptIn)) {
            if (checklistChallengeState instanceof ChecklistChallengeState.Active) {
                return c(analyticsProduct, ((ChecklistChallengeState.Active) checklistChallengeState).f65797a, str);
            }
            if (checklistChallengeState instanceof ChecklistChallengeState.Completed) {
                return c(analyticsProduct, ((ChecklistChallengeState.Completed) checklistChallengeState).f65799a, str);
            }
            if ((checklistChallengeState instanceof ChecklistChallengeState.Purchased) || (checklistChallengeState instanceof ChecklistChallengeState.Unknown)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = challenge.f65775a;
        ChecklistChallengeCompleteCriteria checklistChallengeCompleteCriteriaA = a(((ChecklistChallengeState.OptIn) checklistChallengeState).f65803a);
        if (checklistChallengeCompleteCriteriaA instanceof ChecklistChallengeCompleteCriteria.RevPoints) {
            return e(((ChecklistChallengeCompleteCriteria.RevPoints) checklistChallengeCompleteCriteriaA).f65780a.f65781a);
        }
        if (checklistChallengeCompleteCriteriaA instanceof ChecklistChallengeCompleteCriteria.Checklist) {
            return u0.d(new ChecklistCollectionDestination(str2, analyticsProduct));
        }
        if (!Intrinsics.f(checklistChallengeCompleteCriteriaA, ChecklistChallengeCompleteCriteria.Unknown.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown complete criteria found");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
        return u0.d(new ChecklistCollectionDestination(str2, analyticsProduct));
    }

    public final KompotOverlayFeatureConfig e(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new KompotOverlayFeatureConfig(new RevPointsExclusiveStoreProductCheckoutDestination(productId), yhi.b.BOTTOM_DIALOG, (Integer) null, 12);
    }

    public final g f() {
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o oVar = this.f235795a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = oVar.f.b(Unit.f186387a, loadingStrategy);
        d dVar = oVar.e;
        Continuation continuation = null;
        r0 r0Var = new r0(mo3.a.g(zi0.c.w(e.b(dVar.f212570b.c(false))), null, new l0(14), 1), 1);
        h0 h0Var = h0.f322473a;
        int i = 3;
        return new g(q.J(dVarB, new l1(new q0(new u(q.t(q.q(e.d(r0Var, h0Var)), 1), i), new k(oVar, continuation, i), 1), 5), new w(q.Q(new n(new m0(e.d(new p(q.g(((l) dVar.f212569a.f200357a).f168819b), dVar, 6), h0Var), 18), oVar, 12), new r3k.c(continuation, oVar, 4)), 24)), 25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (vkm.q.n(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pg3.a
            if (r0 == 0) goto L13
            r0 = r9
            pg3.a r0 = (pg3.a) r0
            int r1 = r0.f235794x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235794x = r1
            goto L18
        L13:
            pg3.a r0 = new pg3.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235794x
            r3 = 0
            rg3.o r4 = r7.f235795a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            yhm.o.b(r9)
            goto L79
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5c
        L3b:
            yhm.o.b(r9)
            r0.u = r8
            r0.f235794x = r6
            r4.getClass()
            r83.g r9 = new r83.g
            r2 = 17
            r9.<init>(r4, r8, r3, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r2, r9, r0)
            if (r9 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L59:
            if (r9 != r1) goto L5c
            goto L78
        L5c:
            r4.getClass()
            java.lang.String r9 = "campaignId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            rg3.d r9 = new rg3.d
            r2 = 0
            r9.<init>(r2)
            vkm.y r8 = r4.a(r8, r9)
            r0.u = r3
            r0.f235794x = r5
            java.lang.Object r8 = vkm.q.n(r8, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pg3.b.g(java.lang.String, gim.c):java.lang.Object");
    }
}
