package com.revolut.feature.slot_manager.impl.ui.screen.checklist;

import ahe.m0;
import boe.k;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistData;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import kkd.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lld.c;
import lld.i;
import lld.u;
import oki.h;
import rd0.e;
import skd.j;
import sqb.d;
import vkm.q;
import vkm.q0;
import vkm.z1;
import wli.x;
import yji.l;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements i {
    public final y A;
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f87365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f87366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lld.b f87367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f87368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pak.h f87369t;
    public final b u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f87370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SlotChecklistControllerContract$InputData f87371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f87372y;
    public final z1 z;

    public a(n stateMapper, u slotChecklistDelegate, x deeplinkHandler, j slotsUpdateRelay, lld.b checklistAnimationModelExtension, f customEventHandler, pak.h eventsTracker, b slotsChecklistVisibilityTracker, gte.a featureToggleInteractor, d inAppRecommendationsProvider, SlotChecklistControllerContract$InputData inputData) {
        SlotChecklist slotChecklistB;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(slotChecklistDelegate, "slotChecklistDelegate");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(slotsUpdateRelay, "slotsUpdateRelay");
        Intrinsics.checkNotNullParameter(checklistAnimationModelExtension, "checklistAnimationModelExtension");
        Intrinsics.checkNotNullParameter(customEventHandler, "customEventHandler");
        Intrinsics.checkNotNullParameter(eventsTracker, "eventsTracker");
        Intrinsics.checkNotNullParameter(slotsChecklistVisibilityTracker, "slotsChecklistVisibilityTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inAppRecommendationsProvider, "inAppRecommendationsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = slotChecklistDelegate;
        this.f87365p = deeplinkHandler;
        this.f87366q = slotsUpdateRelay;
        this.f87367r = checklistAnimationModelExtension;
        this.f87368s = customEventHandler;
        this.f87369t = eventsTracker;
        this.u = slotsChecklistVisibilityTracker;
        this.v = featureToggleInteractor;
        this.f87370w = inAppRecommendationsProvider;
        this.f87371x = inputData;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f87372y = q.b(0, 2, fVar);
        z1 z1VarB = q.b(0, 2, fVar);
        z1VarB.k(c.INPUT_DATA);
        this.z = z1VarB;
        ald.a aVar = slotChecklistDelegate.f196735b.f263836b;
        SlotChecklistPayload slotChecklistPayload = slotChecklistDelegate.f196734a.f87361a;
        if (slotChecklistPayload instanceof SlotChecklistData) {
            SlotChecklistData slotChecklistData = (SlotChecklistData) slotChecklistPayload;
            String campaignId = slotChecklistData.f87294a.f87261a.f87271b;
            String str = (String) d0.c0(slotChecklistData.f87295b.f87255b);
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            slotChecklistB = aVar.b(campaignId, str);
        } else {
            if (!(slotChecklistPayload instanceof SlotChecklistFetchConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            SlotChecklistFetchConfig slotChecklistFetchConfig = (SlotChecklistFetchConfig) slotChecklistPayload;
            String campaignId2 = slotChecklistFetchConfig.f87299c;
            String str2 = slotChecklistFetchConfig.f87298b;
            Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
            slotChecklistB = aVar.b(campaignId2, str2);
        }
        this.A = mra.d.b(this, new lld.h(new Data(slotChecklistB, null, true, 2, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        b bVar = this.u;
        SlotChecklistPayload slotChecklistPayload = this.f87371x.f87361a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(slotChecklistPayload, "slotChecklistPayload");
        bVar.f87374b = true;
        if (slotChecklistPayload instanceof SlotChecklistData) {
            SlotChecklistData slotChecklistData = (SlotChecklistData) slotChecklistPayload;
            if (!slotChecklistData.f87296c) {
                bVar.f87375c.put(slotChecklistData.f87295b, new SlotsChecklistVisibilityTracker$ChecklistDisplayRecord(((l80.f) bVar.f87373a).b().toEpochMilli(), slotChecklistData.hashCode()));
            }
        } else if (!(slotChecklistPayload instanceof SlotChecklistFetchConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = this.f87366q;
        Continuation continuation = null;
        l.a1(this, new q0(q.g(jVar.f263838a), new se4.c(jVar, continuation, 9), 1), null, null, new kze.h(this, continuation, 24), 3);
        hy9.b bVar2 = new hy9.b(zi0.c.w(e.b(this.f87370w.f265040a.b())), 2);
        h0 h0Var = h0.f322473a;
        l.a1(this, new akf.u(q.t(q.q(new m0(e.d(bVar2, h0Var), 20)), 1), 2), null, null, new la8.h(this, continuation, 20), 3);
        l.a1(this, e.n(q.Q(this.z, new li2.f(continuation, this, 1)), h0Var), null, null, new lld.n(this, null), 3);
    }

    public final Object I2(String str, Function1 function1, gim.i iVar) {
        if (str != null) {
            Object objB0 = u0.b0(X(), str, new k(12, null, function1), iVar);
            return objB0 == fim.a.COROUTINE_SUSPENDED ? objB0 : Unit.f186387a;
        }
        Object objP2 = p2(iVar, new k(13, null, function1));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yji.l
    public final void K1() {
        this.u.f87374b = false;
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
