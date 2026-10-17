package skd;

import akg.n;
import akl.s1;
import ald.m;
import ald.r;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements zjd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f263835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ald.a f263836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f263837c;
    public final yqb.b d;
    public final zqb.a e;
    public final j f;

    public i(r repository, ald.a checklistRepository, a slotActionFactory, l80.g timeProvider, yqb.b screenMapper, zqb.a toggleResolver, j slotsUpdateRelay) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(checklistRepository, "checklistRepository");
        Intrinsics.checkNotNullParameter(slotActionFactory, "slotActionFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(screenMapper, "screenMapper");
        Intrinsics.checkNotNullParameter(toggleResolver, "toggleResolver");
        Intrinsics.checkNotNullParameter(slotsUpdateRelay, "slotsUpdateRelay");
        this.f263835a = repository;
        this.f263836b = checklistRepository;
        this.f263837c = slotActionFactory;
        this.d = screenMapper;
        this.e = toggleResolver;
        this.f = slotsUpdateRelay;
    }

    public final n a(SlotContext slotContext, boolean z) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        return nim.a.v(this.f263835a.c(slotContext, z), new sk2.f(12));
    }

    public final n b(SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        return nim.a.v(this.f263835a.c(slotContext, true), new sk2.f(5));
    }

    public final n c(SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        return nim.a.v(this.f263835a.c(slotContext, true), new sk2.f(10));
    }

    public final Object d(SlotContext slotContext, boolean z, gim.c cVar) throws Throwable {
        r rVar = this.f263835a;
        rVar.getClass();
        m mVar = new m(rVar, slotContext, z, (Continuation) null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, mVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object e(SlotContext slotContext, List list, akd.a actionType, gim.c cVar) {
        if (list.isEmpty()) {
            return Unit.f186387a;
        }
        List<ekd.i> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ekd.i suggestion : list2) {
            Intrinsics.checkNotNullParameter(slotContext, "slotContext");
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            arrayList.add(new tkd.e(this.f263837c.f263817a.b(slotContext.getF87254a()), suggestion.a().a(), tkd.d.AIR_SUGGESTION, actionType, suggestion.a().b()));
        }
        Object objB = this.f263835a.f6244b.b(arrayList, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.f186387a;
        }
        return objB == aVar ? objB : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r11.f263835a.d(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.slot_manager.api.model.SlotContext r12, ckd.o r13, akd.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof skd.c
            if (r0 == 0) goto L13
            r0 = r15
            skd.c r0 = (skd.c) r0
            int r1 = r0.f263822x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263822x = r1
            goto L18
        L13:
            skd.c r0 = new skd.c
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263822x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L94
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            tkd.e r12 = r0.u
            yhm.o.b(r15)
            goto L85
        L38:
            yhm.o.b(r15)
            java.lang.String r15 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r15)
            java.lang.String r15 = "tile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.lang.String r15 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            tkd.e r5 = new tkd.e
            skd.a r15 = r11.f263837c
            yqb.b r15 = r15.f263817a
            akd.s r2 = r12.getF87254a()
            java.lang.String r6 = r15.b(r2)
            ckd.n r15 = r13.a()
            java.lang.String r7 = r15.a()
            tkd.d r8 = tkd.d.CROSS_SELL_TILES
            ckd.n r15 = r13.a()
            java.util.Map r10 = r15.b()
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            akd.a r14 = akd.a.DISCARD
            if (r9 != r14) goto L86
            scl.e r14 = new scl.e
            r15 = 22
            r14.<init>(r11, r13, r15)
            r0.u = r5
            r0.f263822x = r4
            java.lang.Object r12 = r11.l(r12, r14, r0)
            if (r12 != r1) goto L84
            goto L93
        L84:
            r12 = r5
        L85:
            r5 = r12
        L86:
            r12 = 0
            r0.u = r12
            r0.f263822x = r3
            ald.r r12 = r11.f263835a
            java.lang.Object r12 = r12.d(r5, r0)
            if (r12 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.f(com.revolut.feature.slot_manager.api.model.SlotContext, ckd.o, akd.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r11.f263835a.d(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.slot_manager.api.model.SlotContext r12, ekd.z r13, akd.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof skd.d
            if (r0 == 0) goto L13
            r0 = r15
            skd.d r0 = (skd.d) r0
            int r1 = r0.f263824x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263824x = r1
            goto L18
        L13:
            skd.d r0 = new skd.d
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263824x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L94
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            tkd.e r12 = r0.u
            yhm.o.b(r15)
            goto L85
        L38:
            yhm.o.b(r15)
            java.lang.String r15 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r15)
            java.lang.String r15 = "incentive"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.lang.String r15 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            tkd.e r5 = new tkd.e
            skd.a r15 = r11.f263837c
            yqb.b r15 = r15.f263817a
            akd.s r2 = r12.getF87254a()
            java.lang.String r6 = r15.b(r2)
            ekd.q r15 = r13.a()
            java.lang.String r7 = r15.b()
            tkd.d r8 = tkd.d.INCENTIVE_REWARD
            ekd.q r15 = r13.a()
            java.util.Map r10 = r15.c()
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            akd.a r14 = akd.a.DISCARD
            if (r9 != r14) goto L86
            scl.e r14 = new scl.e
            r15 = 27
            r14.<init>(r11, r13, r15)
            r0.u = r5
            r0.f263824x = r4
            java.lang.Object r12 = r11.l(r12, r14, r0)
            if (r12 != r1) goto L84
            goto L93
        L84:
            r12 = r5
        L85:
            r5 = r12
        L86:
            r12 = 0
            r0.u = r12
            r0.f263824x = r3
            ald.r r12 = r11.f263835a
            java.lang.Object r12 = r12.d(r5, r0)
            if (r12 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.g(com.revolut.feature.slot_manager.api.model.SlotContext, ekd.z, akd.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r11.f263835a.d(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.slot_manager.api.model.SlotContext r12, akd.r r13, akd.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof skd.e
            if (r0 == 0) goto L13
            r0 = r15
            skd.e r0 = (skd.e) r0
            int r1 = r0.f263826x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263826x = r1
            goto L18
        L13:
            skd.e r0 = new skd.e
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263826x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L94
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            tkd.e r12 = r0.u
            yhm.o.b(r15)
            goto L85
        L38:
            yhm.o.b(r15)
            java.lang.String r15 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r15)
            java.lang.String r15 = "promoBanner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.lang.String r15 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            tkd.e r5 = new tkd.e
            skd.a r15 = r11.f263837c
            yqb.b r15 = r15.f263817a
            akd.s r2 = r12.getF87254a()
            java.lang.String r6 = r15.b(r2)
            akd.m r15 = r13.a()
            java.lang.String r7 = r15.a()
            tkd.d r8 = tkd.d.PROMOS
            akd.m r15 = r13.a()
            java.util.Map r10 = r15.b()
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            akd.a r14 = akd.a.DISCARD
            if (r9 != r14) goto L86
            scl.e r14 = new scl.e
            r15 = 24
            r14.<init>(r11, r13, r15)
            r0.u = r5
            r0.f263826x = r4
            java.lang.Object r12 = r11.l(r12, r14, r0)
            if (r12 != r1) goto L84
            goto L93
        L84:
            r12 = r5
        L85:
            r5 = r12
        L86:
            r12 = 0
            r0.u = r12
            r0.f263826x = r3
            ald.r r12 = r11.f263835a
            java.lang.Object r12 = r12.d(r5, r0)
            if (r12 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.h(com.revolut.feature.slot_manager.api.model.SlotContext, akd.r, akd.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r11.f263835a.d(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.slot_manager.api.model.SlotContext r12, com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt r13, akd.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof skd.f
            if (r0 == 0) goto L13
            r0 = r15
            skd.f r0 = (skd.f) r0
            int r1 = r0.f263828x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263828x = r1
            goto L18
        L13:
            skd.f r0 = new skd.f
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263828x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L94
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            tkd.e r12 = r0.u
            yhm.o.b(r15)
            goto L85
        L38:
            yhm.o.b(r15)
            java.lang.String r15 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r15)
            java.lang.String r15 = "prompt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.lang.String r15 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            tkd.e r5 = new tkd.e
            skd.a r15 = r11.f263837c
            yqb.b r15 = r15.f263817a
            akd.s r2 = r12.getF87254a()
            java.lang.String r6 = r15.b(r2)
            com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt$Meta r15 = r13.getF87337a()
            java.lang.String r7 = r15.getF87340b()
            tkd.d r8 = tkd.d.PROMPTS
            com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt$Meta r15 = r13.getF87337a()
            java.util.Map r10 = r15.getD()
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            akd.a r14 = akd.a.DISCARD
            if (r9 != r14) goto L86
            scl.e r14 = new scl.e
            r15 = 23
            r14.<init>(r11, r13, r15)
            r0.u = r5
            r0.f263828x = r4
            java.lang.Object r12 = r11.l(r12, r14, r0)
            if (r12 != r1) goto L84
            goto L93
        L84:
            r12 = r5
        L85:
            r5 = r12
        L86:
            r12 = 0
            r0.u = r12
            r0.f263828x = r3
            ald.r r12 = r11.f263835a
            java.lang.Object r12 = r12.d(r5, r0)
            if (r12 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.i(com.revolut.feature.slot_manager.api.model.SlotContext, com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt, akd.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r10.f263835a.d(r4, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.slot_manager.api.model.SlotContext r11, ekd.n0 r12, akd.a r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof skd.g
            if (r0 == 0) goto L13
            r0 = r14
            skd.g r0 = (skd.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            skd.g r0 = new skd.g
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f263830x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L9f
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            akd.a r13 = r0.f263829w
            ekd.n0 r12 = r0.v
            com.revolut.feature.slot_manager.api.model.SlotContext r11 = r0.u
            yhm.o.b(r14)
            goto L5a
        L3d:
            yhm.o.b(r14)
            akd.a r14 = akd.a.DISCARD
            if (r13 != r14) goto L5a
            scl.e r14 = new scl.e
            r2 = 25
            r14.<init>(r10, r12, r2)
            r0.u = r11
            r0.v = r12
            r0.f263829w = r13
            r0.z = r4
            java.lang.Object r14 = r10.l(r11, r14, r0)
            if (r14 != r1) goto L5a
            goto L9e
        L5a:
            r8 = r13
            java.lang.String r13 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            java.lang.String r13 = "tile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            java.lang.String r13 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r13)
            tkd.e r4 = new tkd.e
            skd.a r13 = r10.f263837c
            yqb.b r13 = r13.f263817a
            akd.s r11 = r11.getF87254a()
            java.lang.String r5 = r13.b(r11)
            ekd.h0 r11 = r12.a()
            java.lang.String r6 = r11.b()
            tkd.d r7 = tkd.d.WIDE_SUGGESTED_TILE
            ekd.h0 r11 = r12.a()
            java.util.Map r9 = r11.c()
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            r0.u = r11
            r0.v = r11
            r0.f263829w = r11
            r0.z = r3
            ald.r r11 = r10.f263835a
            java.lang.Object r11 = r11.d(r4, r0)
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.j(com.revolut.feature.slot_manager.api.model.SlotContext, ekd.n0, akd.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (r11.f263835a.d(r5, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.slot_manager.api.model.SlotContext r12, fkd.w0 r13, akd.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof skd.h
            if (r0 == 0) goto L13
            r0 = r15
            skd.h r0 = (skd.h) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            skd.h r0 = new skd.h
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f263833x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)
            goto Lbc
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            int r12 = r0.f263832w
            int r13 = r0.v
            tkd.e r14 = r0.u
            yhm.o.b(r15)
            goto La7
        L3e:
            yhm.o.b(r15)
            java.lang.String r15 = "slotContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r15)
            java.lang.String r15 = "tile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.lang.String r15 = "actionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            tkd.e r5 = new tkd.e
            skd.a r15 = r11.f263837c
            yqb.b r15 = r15.f263817a
            akd.s r2 = r12.getF87254a()
            java.lang.String r6 = r15.b(r2)
            fkd.v0 r15 = r13.H()
            java.lang.String r7 = r15.a()
            tkd.d r8 = tkd.d.TODO_TILE
            fkd.v0 r15 = r13.H()
            java.util.Map r10 = r15.b()
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r14 = r13 instanceof fkd.f
            r15 = 0
            if (r14 != 0) goto L80
            boolean r14 = r13 instanceof fkd.x
            if (r14 == 0) goto L7e
            goto L80
        L7e:
            r14 = r15
            goto L81
        L80:
            r14 = r4
        L81:
            akd.a r2 = akd.a.DISCARD
            if (r9 == r2) goto L8b
            akd.a r2 = akd.a.OPEN
            if (r9 != r2) goto L8c
            if (r14 == 0) goto L8c
        L8b:
            r15 = r4
        L8c:
            if (r15 == 0) goto Laa
            scl.e r2 = new scl.e
            r6 = 26
            r2.<init>(r11, r13, r6)
            r0.u = r5
            r0.v = r14
            r0.f263832w = r15
            r0.z = r4
            java.lang.Object r12 = r11.l(r12, r2, r0)
            if (r12 != r1) goto La4
            goto Lbb
        La4:
            r13 = r14
            r12 = r15
            r14 = r5
        La7:
            r15 = r12
            r5 = r14
            r14 = r13
        Laa:
            r12 = 0
            r0.u = r12
            r0.v = r14
            r0.f263832w = r15
            r0.z = r3
            ald.r r12 = r11.f263835a
            java.lang.Object r12 = r12.d(r5, r0)
            if (r12 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: skd.i.k(com.revolut.feature.slot_manager.api.model.SlotContext, fkd.w0, akd.a, gim.c):java.lang.Object");
    }

    public final Object l(SlotContext slotContext, Function1 function1, gim.c cVar) {
        r rVar = this.f263835a;
        rVar.getClass();
        s1 s1Var = new s1(rVar, slotContext, function1, (Continuation) null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, s1Var, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
