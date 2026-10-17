package q3j;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import vge.t3;
import vge.x;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f241978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f241979c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, FlowCollector flowCollector, int i) {
        this.f241977a = i;
        this.f241979c = obj2;
        this.d = obj3;
        this.f241978b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r41, kotlin.coroutines.Continuation r42) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof t38.d
            if (r0 == 0) goto L13
            r0 = r14
            t38.d r0 = (t38.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            t38.d r0 = new t38.d
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto La8
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            yhm.o.b(r14)
            v38.e r13 = (v38.e) r13
            java.util.List r13 = r13.f285858a
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r4 = new java.util.ArrayList
            r14 = 10
            int r14 = zhm.w.t(r13, r14)
            r4.<init>(r14)
            java.util.Iterator r13 = r13.iterator()
        L48:
            boolean r14 = r13.hasNext()
            r2 = 0
            if (r14 == 0) goto L76
            java.lang.Object r14 = r13.next()
            io3.g r14 = (io3.g) r14
            java.lang.Object r5 = r12.f241979c
            t38.p r5 = (t38.p) r5
            xea.c r5 = r5.f267702r
            r6 = 0
            com.revolut.core.ui_kit.delegates.AccountCellItemDelegate$Model r14 = r5.a(r14, r6)
            t38.b r5 = new t38.b
            java.lang.Object r6 = r12.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.f51565t
            r5.<init>(r6, r7)
            r6 = 3145727(0x2fffff, float:4.408102E-39)
            com.revolut.core.ui_kit.delegates.AccountCellItemDelegate$Model r14 = com.revolut.core.ui_kit.delegates.AccountCellItemDelegate.Model.e(r14, r2, r5, r2, r6)
            r4.add(r14)
            goto L48
        L76:
            r8 = 0
            r9 = 31
            r5 = 0
            r6 = 0
            r7 = 0
            yp0.b.k(r4, r5, r6, r7, r8, r9)
            rp0.y r13 = new rp0.y
            rp0.t r6 = new rp0.t
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.joint.impl.R$string.joint_home_currency_account_title_choose_account
            r7 = 14
            r14.<init>(r5, r2, r2, r7)
            r5 = 30
            r6.<init>(r14, r2, r2, r5)
            rp0.l r7 = rp0.l.WINDOW
            r10 = 0
            r11 = 1016(0x3f8, float:1.424E-42)
            r8 = 0
            r9 = 0
            r5 = r4
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r12.f241978b
            java.lang.Object r13 = r13.emit(r4, r0)
            if (r13 != r1) goto La8
            return r1
        La8:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof t82.e
            if (r0 == 0) goto L13
            r0 = r10
            t82.e r0 = (t82.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            t82.e r0 = new t82.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L5e
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            hrf.h r9 = (hrf.h) r9
            u82.e r10 = new u82.e
            java.lang.Object r2 = r8.f241979c
            t82.f r2 = (t82.f) r2
            opf.c0 r2 = r2.e
            java.lang.Object r4 = r8.d
            t82.a r4 = (t82.a) r4
            r4.getClass()
            dj0.d r5 = new dj0.d
            long r6 = r4.f268799b
            xi0.b r4 = w62.a.f295373a
            r5.<init>(r6, r4)
            java.util.ArrayList r2 = r2.a(r5)
            r10.<init>(r9, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r8.f241978b
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tk6.a
            if (r0 == 0) goto L13
            r0 = r8
            tk6.a r0 = (tk6.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tk6.a r0 = new tk6.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L8b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r7.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.f186386b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            zhm.a0.x(r2, r8)
            goto L3f
        L53:
            java.util.Iterator r7 = r8.iterator()
        L57:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto L72
            java.lang.Object r8 = r7.next()
            r4 = r8
            io3.d r4 = (io3.d) r4
            java.lang.String r4 = r4.f163145a
            java.lang.Object r5 = r6.f241979c
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L57
            goto L73
        L72:
            r8 = r2
        L73:
            io3.d r8 = (io3.d) r8
            if (r8 == 0) goto L80
            com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseAuthorisationRequestPaymentFrom r2 = new com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseAuthorisationRequestPaymentFrom
            java.lang.Object r7 = r6.d
            fo3.d r7 = (fo3.d) r7
            r2.<init>(r8, r7)
        L80:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f241978b
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L8b
            return r1
        L8b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x029e, code lost:
    
        if (r7.emit(r1, r3) != r4) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r47, kotlin.coroutines.Continuation r48) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ttl.t
            if (r0 == 0) goto L13
            r0 = r7
            ttl.t r0 = (ttl.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ttl.t r0 = new ttl.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L86
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.time.LocalDate r6 = (java.time.LocalDate) r6
            java.lang.Object r7 = r5.f241979c
            ttl.x r7 = (ttl.x) r7
            v60.g r2 = r7.f274480s
            java.lang.Object r4 = r5.d
            com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r4 = (com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker) r4
            ttl.o r7 = r7.o
            java.util.List r7 = r7.f274462c
            java.util.Map r6 = r2.b(r4, r6, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            int r2 = r6.size()
            int r2 = zhm.q0.b(r2)
            r7.<init>(r2)
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.time.ZonedDateTime r2 = (java.time.ZonedDateTime) r2
            java.time.LocalDate r2 = r2.toLocalDate()
            r7.put(r4, r2)
            goto L5d
        L7b:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r5.f241978b
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L86
            return r1
        L86:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ugc.j
            if (r0 == 0) goto L13
            r0 = r9
            ugc.j r0 = (ugc.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ugc.j r0 = new ugc.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L98
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r8 = r0.f280015y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f280014x
            yhm.o.b(r9)
            goto L8a
        L3a:
            yhm.o.b(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            java.lang.Object r8 = r7.f241979c
            ugc.n r8 = (ugc.n) r8
            phc.a r8 = r8.f280020a
            java.lang.Object r9 = r7.d
            java.lang.String r9 = (java.lang.String) r9
            phc.j r8 = (phc.j) r8
            java.lang.String r2 = "perkId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            com.revolut.feature.rewards.impl.data.network.services.RewardsService r8 = r8.f236272a
            efm.d0 r8 = r8.getSubscriptionCancellationState(r9)
            phc.e r9 = new phc.e
            r2 = 4
            r9.<init>(r2)
            phc.b r2 = new phc.b
            r5 = 5
            r2.<init>(r5, r9)
            r8.getClass()
            ufm.i r9 = new ufm.i
            r5 = 1
            r9.<init>(r8, r2, r5)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            ufm.n r8 = te0.w.i0(r9)
            kotlinx.coroutines.flow.FlowCollector r2 = r7.f241978b
            r0.f280014x = r2
            r9 = 0
            r0.f280015y = r9
            r0.v = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L87
            goto L97
        L87:
            r6 = r9
            r9 = r8
            r8 = r6
        L8a:
            r4 = 0
            r0.f280014x = r4
            r0.f280015y = r8
            r0.v = r3
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object n(Object obj2, Continuation continuation) {
        Object objEmit;
        return (((LinkedHashSet) this.d).add(((Function1) this.f241979c).invoke(obj2)) && (objEmit = this.f241978b.emit(obj2, continuation)) == fim.a.COROUTINE_SUSPENDED) ? objEmit : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r2.emit(r4, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vgc.j
            if (r0 == 0) goto L13
            r0 = r10
            vgc.j r0 = (vgc.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vgc.j r0 = new vgc.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto L96
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r9 = r0.f288827y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f288826x
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L3c
            goto L73
        L3c:
            r10 = move-exception
            goto L7e
        L3e:
            yhm.o.b(r10)
            kotlinx.coroutines.flow.FlowCollector r2 = r8.f241978b
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            java.lang.Object r9 = r8.f241979c
            vgc.m r9 = (vgc.m) r9
            r10 = 0
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L7c
            nhc.a r9 = r9.f288831a     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r6 = r8.d     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7c
            r0.f288826x = r2     // Catch: java.lang.Throwable -> L7c
            r0.f288827y = r10     // Catch: java.lang.Throwable -> L7c
            r0.v = r4     // Catch: java.lang.Throwable -> L7c
            nhc.i r9 = (nhc.i) r9     // Catch: java.lang.Throwable -> L7c
            r9.getClass()     // Catch: java.lang.Throwable -> L7c
            nhc.g r4 = new nhc.g     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r9, r6, r5)     // Catch: java.lang.Throwable -> L7c
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L7c
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r9 = skm.e0.J(r9, r4, r0)     // Catch: java.lang.Throwable -> L7c
            if (r9 != r1) goto L70
            goto L95
        L70:
            r7 = r10
            r10 = r9
            r9 = r7
        L73:
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment r10 = (com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments.Category.LinkedPayment) r10     // Catch: java.lang.Throwable -> L3c
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3c
            goto L84
        L78:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7e
        L7c:
            r9 = move-exception
            goto L78
        L7e:
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
        L84:
            yhm.m r4 = new yhm.m
            r4.<init>(r10)
            r0.f288826x = r5
            r0.f288827y = r9
            r0.v = r3
            java.lang.Object r9 = r2.emit(r4, r0)
            if (r9 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r2.emit(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r2.emit(vgc.h.f288824a, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vgc.k
            if (r0 == 0) goto L13
            r0 = r7
            vgc.k r0 = (vgc.k) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vgc.k r0 = new vgc.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            goto L7f
        L33:
            yhm.o.b(r7)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            boolean r7 = r6 instanceof yhm.n
            kotlinx.coroutines.flow.FlowCollector r2 = r5.f241978b
            if (r7 != 0) goto L53
            vgc.g r7 = new vgc.g
            yhm.o.b(r6)
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment r6 = (com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments.Category.LinkedPayment) r6
            r7.<init>(r6)
            r0.v = r4
            java.lang.Object r6 = r2.emit(r7, r0)
            if (r6 != r1) goto L7f
            goto L78
        L53:
            java.lang.Throwable r6 = yhm.m.a(r6)
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L82
            java.lang.Object r7 = r5.f241979c
            vgc.m r7 = (vgc.m) r7
            sf0.h r7 = r7.f288832b
            com.revolut.core.error.data.model.ServerError r7 = r7.a(r6)
            if (r7 == 0) goto L79
            int r7 = r7.f51362a
            r4 = 74602(0x1236a, float:1.0454E-40)
            if (r7 != r4) goto L79
            r0.v = r3
            vgc.h r6 = vgc.h.f288824a
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L7f
        L78:
            return r1
        L79:
            java.lang.Object r7 = r5.d
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            r7.f186409a = r6
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object r(Object obj2, Continuation continuation) throws Throwable {
        vge.e eVar = (vge.e) obj2;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f241979c;
        vge.b observation = eVar.f288887b;
        if (observation != null && observation != ref$ObjectRef.f186409a) {
            t3 t3Var = (t3) ((x) this.d).d;
            t3Var.getClass();
            Intrinsics.checkNotNullParameter(observation, "observation");
            t3Var.f289025p.b(observation);
        }
        ref$ObjectRef.f186409a = observation;
        Object objEmit = this.f241978b.emit(eVar.f288886a, continuation);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vge.n1
            if (r0 == 0) goto L13
            r0 = r7
            vge.n1 r0 = (vge.n1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vge.n1 r0 = new vge.n1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r7 = r6
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r2 = r5.f241979c
            vge.o1 r2 = (vge.o1) r2
            vge.e2 r2 = r2.f288963a
            java.lang.String r4 = "ACCOUNTS_CONTENT_CACHE_KEY"
            vge.t2 r2 = (vge.t2) r2
            java.lang.Object r2 = r2.i(r4)
            if (r2 != 0) goto L49
            java.lang.Object r2 = r5.d
            if (r2 == 0) goto L50
        L49:
            java.lang.Object r7 = r7.getContent()
            if (r7 != 0) goto L50
            goto L5b
        L50:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f241978b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.s(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof vge.j3
            if (r0 == 0) goto L13
            r0 = r9
            vge.j3 r0 = (vge.j3) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vge.j3 r0 = new vge.j3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto Lc3
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r9)
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L40:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r8.next()
            r4 = r2
            vfe.a r4 = (vfe.a) r4
            java.lang.Object r5 = vge.t3.f289015r
            java.util.Set r5 = r5.keySet()
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r4 = r4.f288606a
            pie.a r4 = r4.f89741a
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L40
            r9.add(r2)
            goto L40
        L61:
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r9, r2)
            r8.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r9.next()
            vfe.a r2 = (vfe.a) r2
            com.revolut.feature.tab.accounts.api.model.spaces.ProductContext r4 = new com.revolut.feature.tab.accounts.api.model.spaces.ProductContext
            java.lang.Object r5 = vge.t3.f289015r
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r6 = r2.f288606a
            pie.a r6 = r6.f89741a
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto Lb0
            com.revolut.feature.tab.accounts.models.ProductId r5 = (com.revolut.feature.tab.accounts.models.ProductId) r5
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r2 = r2.f288606a
            pie.v r6 = pie.v.ACCOUNTS
            r4.<init>(r5, r2, r6)
            java.lang.Object r2 = r7.f241979c
            vge.t3 r2 = (vge.t3) r2
            vge.u3 r2 = r2.f289018c
            java.lang.Object r5 = r7.d
            sfe.a r5 = (sfe.a) r5
            kotlinx.coroutines.flow.Flow r2 = r2.a(r4, r5)
            ro7.n r5 = new ro7.n
            r6 = 17
            r5.<init>(r4, r6)
            akg.n r2 = nim.a.v(r2, r5)
            r8.add(r2)
            goto L70
        Lb0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        Lb8:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f241978b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto Lc3
            return r1
        Lc3:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.t(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:480:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instruction units count: 3476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b(FlowCollector flowCollector, Object obj2, Object obj3, int i) {
        this.f241977a = i;
        this.f241978b = flowCollector;
        this.f241979c = obj2;
        this.d = obj3;
    }

    public b(FlowCollector flowCollector, rw4.h hVar, HomeFeedWidgetContext.Collateral collateral, String str) {
        this.f241977a = 6;
        this.f241978b = flowCollector;
        this.f241979c = collateral;
        this.d = str;
    }
}
