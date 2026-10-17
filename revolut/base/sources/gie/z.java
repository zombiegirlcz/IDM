package gie;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends t {

    @NotNull
    private static final u Companion = new u();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q89.e f144162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lfa.b f144163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w51.a f144164n;
    public final skd.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eie.a f144165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emg.a f144166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final emg.a f144167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cie.v f144168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zq.a f144169t;

    public z(q89.e onboardingInteractor, lfa.b postActivationInteractor, w51.a appEntryPointInteractor, skd.i slotManagerInteractor, eie.a tabAccountsSlotManagerPromptsObserver, emg.a adoptionJourneyInteractor, emg.a fincrimeChecklistInteractor, cie.v productAccountIntroChecker, zq.a tabAccountsSlotManagerScreenProvider) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(postActivationInteractor, "postActivationInteractor");
        Intrinsics.checkNotNullParameter(appEntryPointInteractor, "appEntryPointInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(tabAccountsSlotManagerPromptsObserver, "tabAccountsSlotManagerPromptsObserver");
        Intrinsics.checkNotNullParameter(adoptionJourneyInteractor, "adoptionJourneyInteractor");
        Intrinsics.checkNotNullParameter(fincrimeChecklistInteractor, "fincrimeChecklistInteractor");
        Intrinsics.checkNotNullParameter(productAccountIntroChecker, "productAccountIntroChecker");
        Intrinsics.checkNotNullParameter(tabAccountsSlotManagerScreenProvider, "tabAccountsSlotManagerScreenProvider");
        this.f144162l = onboardingInteractor;
        this.f144163m = postActivationInteractor;
        this.f144164n = appEntryPointInteractor;
        this.o = slotManagerInteractor;
        this.f144165p = tabAccountsSlotManagerPromptsObserver;
        this.f144166q = adoptionJourneyInteractor;
        this.f144167r = fincrimeChecklistInteractor;
        this.f144168s = productAccountIntroChecker;
        this.f144169t = tabAccountsSlotManagerScreenProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(gie.z r4, mkd.c r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof gie.v
            if (r0 == 0) goto L16
            r0 = r6
            gie.v r0 = (gie.v) r0
            int r1 = r0.f144158w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f144158w = r1
            goto L1b
        L16:
            gie.v r0 = new gie.v
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144158w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5a
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            boolean r6 = r5 instanceof mkd.a
            r2 = 0
            if (r6 == 0) goto L3d
            mkd.a r5 = (mkd.a) r5
            goto L3e
        L3d:
            r5 = r2
        L3e:
            if (r5 == 0) goto L42
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r5.f206217a
        L42:
            skd.i r5 = r4.o
            if (r2 != 0) goto L4d
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = new com.revolut.feature.slot_manager.api.model.SlotContext
            akd.s r6 = akd.s.HOME
            r2.<init>(r6)
        L4d:
            akg.n r5 = r5.b(r2)
            r0.f144158w = r3
            java.lang.Object r6 = c8g.a.h(r5, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            java.util.List r6 = (java.util.List) r6
            eie.a r4 = r4.f144165p
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L6a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt
            if (r2 == 0) goto L6a
            r0.add(r1)
            goto L6a
        L7c:
            java.lang.Object r5 = zhm.d0.d0(r0)
            com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt r5 = (com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt) r5
            eie.b r4 = (eie.b) r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f126588a
            boolean r1 = r0.get()
            if (r1 == 0) goto L95
            java.util.concurrent.atomic.AtomicReference r4 = r4.f126590c
            r4.set(r5)
            r4 = 0
            r0.set(r4)
        L95:
            java.lang.Object r4 = zhm.d0.d0(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.z.b3(gie.z, mkd.c, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        ((db9.d) this.f144162l).f112688a.f244139a.l("ONBOARDING_FLOW_PASSED_KEY", true);
        this.f144163m.f194837c.d();
    }

    @Override // gie.t
    public final void Z2(Flow currentAccountContentFlow) {
        Intrinsics.checkNotNullParameter(currentAccountContentFlow, "currentAccountContentFlow");
        if (this.f144164n.f294677a) {
            return;
        }
        T2(new y(this, currentAccountContentFlow, null), new ghk.r(19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gie.w
            if (r0 == 0) goto L13
            r0 = r6
            gie.w r0 = (gie.w) r0
            int r1 = r0.f144159w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144159w = r1
            goto L18
        L13:
            gie.w r0 = new gie.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144159w
            emg.a r3 = r5.f144166q
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            r0.f144159w = r4
            java.lang.Object r6 = r3.i(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L48
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            eie.a r6 = r5.f144165p
            eie.b r6 = (eie.b) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L57
            cmg.a r6 = cmg.a.SHOW
            r3.b(r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.z.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gie.x
            if (r0 == 0) goto L13
            r0 = r6
            gie.x r0 = (gie.x) r0
            int r1 = r0.f144160w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144160w = r1
            goto L18
        L13:
            gie.x r0 = new gie.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144160w
            emg.a r3 = r5.f144167r
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            r0.f144160w = r4
            java.lang.Object r6 = r3.i(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L48
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            eie.a r6 = r5.f144165p
            eie.b r6 = (eie.b) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L57
            cmg.a r6 = cmg.a.SHOW
            r3.b(r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.z.d3(gim.c):java.lang.Object");
    }
}
