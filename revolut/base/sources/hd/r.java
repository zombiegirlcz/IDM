package hd;

import android.content.Context;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.javax.inject.Provider;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.credit_card.autopay.impl.v3.network.CreditCardAutopayService;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import eg.a0;
import eg.a1;
import hd.r;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m6i.h0;
import md.u1;
import md.w2;
import nl.c0;
import nl.x0;
import nl.y0;
import rp0.l0;
import sgm.e3;
import vkm.q0;
import vkm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements ut5.h, h8b.i, igm.o, el.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f151364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f151365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f151366c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ r(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f151364a = obj2;
        this.f151365b = obj3;
        this.f151366c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
    }

    public static final int a(r rVar, ly9.j jVar) {
        if (!(jVar instanceof ly9.d)) {
            if (jVar instanceof ly9.b) {
                return 100;
            }
            return jVar instanceof ly9.c ? 90 : 0;
        }
        zm3.a aVar = ((ly9.d) jVar).f200758a;
        if (aVar instanceof zm3.l) {
            return Integer.MAX_VALUE;
        }
        if (aVar instanceof zm3.p) {
            return 1000;
        }
        if (aVar instanceof zm3.g) {
            return 10;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(hd.r r8, android.content.Context r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof ie7.f
            if (r0 == 0) goto L13
            r0 = r10
            ie7.f r0 = (ie7.f) r0
            int r1 = r0.f160663w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160663w = r1
            goto L18
        L13:
            ie7.f r0 = new ie7.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160663w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            goto L7a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r10)
            vkm.f r10 = r8.A()     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            java.lang.Object r2 = r8.f     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            tf3.b r2 = (tf3.b) r2     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            vkm.d r2 = r2.a()     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            f23.g0 r4 = new f23.g0     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            r5 = 3
            r6 = 2
            r7 = 0
            r4.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            t38.e r5 = new t38.e     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            r6 = 24
            r5.<init>(r10, r6, r2, r4)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            kotlinx.coroutines.flow.Flow r10 = vkm.q.q(r5)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            i52.l r2 = new i52.l     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            r4 = 4
            r2.<init>(r8, r9, r4)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            r0.f160663w = r3     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            i8c.c r8 = new i8c.c     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            r9 = 11
            r8.<init>(r2, r9)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            java.lang.Object r8 = r10.collect(r8, r0)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
            if (r8 != r1) goto L67
            goto L69
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L7d
        L69:
            if (r8 != r1) goto L7a
            return r1
        L6c:
            r8 = move-exception
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            java.lang.String r0 = "Failed to observe Twilio module installation and user authorization"
            java.lang.String r1 = "InAppCalls"
            rd0.d.a(r10, r1, r0, r8, r9)
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7d:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.h(hd.r, android.content.Context, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d2 -> B:32:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(hd.r r11, int r12, om4.l0 r13, oh4.i r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.i(hd.r, int, om4.l0, oh4.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bc -> B:36:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(hd.r r9, com.revolut.feature_move_money.api.model.AccountWrapper r10, java.util.List r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.j(hd.r, com.revolut.feature_move_money.api.model.AccountWrapper, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (nim.a.a(r10, r2) == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(hd.r r10, android.content.Context r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.k(hd.r, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r0.f(r12, r6, r1) == r14) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(hd.r r11, java.lang.String r12, com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.l(hd.r, java.lang.String, com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment, gim.c):java.lang.Object");
    }

    public static r r(String str, com.google.crypto.tink.shaded.protobuf.j jVar, u1 u1Var, w2 w2Var, Integer num) throws GeneralSecurityException {
        if (w2Var == w2.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        r rVar = new r();
        rVar.f151364a = str;
        rVar.f151365b = w.b(str);
        rVar.f151366c = jVar;
        rVar.d = u1Var;
        rVar.e = w2Var;
        rVar.f = num;
        return rVar;
    }

    public static go.g v() {
        f0 f0Var = f0.f322471a;
        return new go.g(new Data(new rt5.h(f0Var, f0Var, f0Var), null, false, 6, null), 2);
    }

    public vkm.f A() {
        Continuation continuation = null;
        return vkm.q.J(new v1(new i44.a(this, continuation, 19)), new a6e.b(new q0(new ie7.h(((oi0.b) ((xg0.a) this.d)).d, this, 0), new hy2.e(this, continuation, 21), 1), 8));
    }

    @Override // ut5.h
    public Flow B() {
        return v();
    }

    public efm.r C(String searchQuery) {
        onh.b bVar = (onh.b) this.e;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        efm.r map = ((jul.o) bVar.f226950b).p(searchQuery).map(new pva.c(21, new px0.a(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public void D() {
        AtomicReference atomicReference = (AtomicReference) this.f151366c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
        while (atomicBoolean.compareAndSet(false, true)) {
            Boolean bool = (Boolean) atomicReference.get();
            if (bool != null && ((bool.booleanValue() && ((Boolean) this.e) == null) || (!bool.booleanValue() && Intrinsics.f((Boolean) this.e, Boolean.TRUE)))) {
                ym.d dVar = ((tm.g) this.f).f272147b;
                ym.b bVar = new ym.b((mm.a) this.f151365b, bool.booleanValue(), (String) this.f151364a);
                dVar.getClass();
                dVar.D(bVar);
            }
            this.e = bool;
            atomicBoolean.set(false);
            if (Intrinsics.f(atomicReference.get(), (Boolean) this.e)) {
                return;
            }
        }
    }

    public void E(cf.b bVar) {
        bVar.getClass();
        this.f = bVar;
    }

    @Override // ut5.h
    public Flow W() {
        return v();
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        tl.b backSideResult = (tl.b) obj2;
        Intrinsics.checkNotNullParameter(backSideResult, "backSideResult");
        nl.p pVar = (nl.p) this.f151364a;
        tl.m mVar = (tl.m) this.f151365b;
        Observable observable = (Observable) this.f151366c;
        sl.n nVar = (sl.n) this.d;
        DocumentType documentType = (DocumentType) this.e;
        CountryCode countryCode = (CountryCode) this.f;
        pVar.getClass();
        tl.m mVar2 = backSideResult.f271980b;
        tl.k kVar = null;
        tl.k kVar2 = mVar2 instanceof tl.k ? (tl.k) mVar2 : null;
        if (kVar2 != null) {
            kVar = kVar2;
        } else if (mVar instanceof tl.k) {
            kVar = (tl.k) mVar;
        }
        int i = 2;
        if (NFCOptionsKt.isRequired(nVar.f264052c) || kVar != null) {
            return pVar.b(observable, nVar, documentType, countryCode, nl.p.c(zhm.v.k(mVar, mVar2)), kVar != null ? kVar.d : nl.p.f, nVar.f264052c);
        }
        hx7.e.f(pVar.f216933c);
        Completable completableA = pVar.d.a(nVar, nl.p.c(zhm.v.k(mVar, mVar2)));
        completableA.getClass();
        ogm.a aVar = new ogm.a(completableA, nl.n.f216928a, i);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return aVar;
    }

    @Override // h8b.i
    public ListSubheaderDelegate b() {
        return (ListSubheaderDelegate) this.f151364a;
    }

    @Override // ut5.h
    public Flow b0() {
        return vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) this.f151366c)), new a0e.m((Continuation) null, this, 3));
    }

    @Override // h8b.i
    public CalendarRowDelegate c() {
        return (CalendarRowDelegate) this.f;
    }

    @Override // h8b.i
    public CellDetailsDelegate d() {
        return (CellDetailsDelegate) this.d;
    }

    @Override // h8b.i
    public ProgressStepVerticalDelegate e() {
        return (ProgressStepVerticalDelegate) this.f151365b;
    }

    @Override // h8b.i
    public LargeActionButtonDelegate f() {
        return (LargeActionButtonDelegate) this.f151366c;
    }

    @Override // h8b.i
    public TwinHorizontalButtonDelegate g() {
        return (TwinHorizontalButtonDelegate) this.e;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new c0((Context) ((il.a) this.f151364a).get(), (nl.q0) ((lal.a) this.f151365b).get(), (x0) ((y0) this.f151366c).get(), (Navigator) ((Provider) this.d).get(), (sl.f) ((Provider) this.e).get(), (OnfidoRemoteConfig) ((il.a) this.f).get());
    }

    public void m(Context context) {
        context.getClass();
        this.f151364a = context;
    }

    public void n(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f151365b = coroutineContext;
    }

    public void o(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f151366c = coroutineContext;
    }

    public eg.i p() {
        c6d.b.f((Context) this.f151364a, Context.class);
        c6d.b.f((CoroutineContext) this.f151365b, CoroutineContext.class);
        c6d.b.f((CoroutineContext) this.f151366c, CoroutineContext.class);
        c6d.b.f((pd.g) this.d, pd.g.class);
        c6d.b.f((df.e) this.e, df.e.class);
        c6d.b.f((cf.b) this.f, cf.b.class);
        Context context = (Context) this.f151364a;
        CoroutineContext coroutineContext = (CoroutineContext) this.f151365b;
        pd.g gVar = (pd.g) this.d;
        df.e eVar = (df.e) this.e;
        cf.b bVar = (cf.b) this.f;
        eg.i iVar = new eg.i();
        iVar.f125445a = hg.c.a(gVar);
        hg.c cVarA = hg.c.a(context);
        iVar.f125446b = cVarA;
        iVar.f125447c = hg.a.a(new eg.n(cVarA, 5));
        iVar.d = hg.c.a(coroutineContext);
        iVar.e = hg.c.a(eVar);
        phm.a aVarA = hg.a.a(new eg.n(iVar.f125445a, 1));
        iVar.f = aVarA;
        iVar.f125448g = hg.a.a(new eg.q0(aVarA, iVar.d, 2));
        iVar.f125449h = hg.a.a(new eg.q0(iVar.f125447c, hg.a.a(new a1((phm.a) iVar.d, (phm.a) iVar.e, iVar.f, iVar.f125448g, hg.a.a(new eg.n(hg.a.a(new eg.n(iVar.f125446b, 2)), 6)))), 3));
        iVar.i = hg.a.a(new a0(iVar.f125445a, iVar.f125449h, iVar.d, hg.a.a(new eg.n(iVar.f125446b, 4))));
        iVar.f125450j = hg.a.a(new eg.q0(iVar.d, hg.a.a(new eg.n(iVar.f125446b, 3)), 0));
        iVar.k = hg.a.a(new a1(iVar.f125445a, (phm.a) iVar.e, iVar.f125449h, hg.a.a(new eg.n(hg.c.a(bVar), 0)), (phm.a) iVar.d));
        iVar.f125451l = hg.a.a(eg.v.f125496a);
        iVar.f125452m = hg.a.a(new eg.q0(iVar.f125451l, hg.a.a(eg.v.f125497b), 1));
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df A[EDGE_INSN: B:154:0x02df->B:124:0x02df BREAK  A[LOOP:3: B:97:0x026f->B:155:?]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(yji.l r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, gim.c r35) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.q(yji.l, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public ku5.j s(ut5.l lVar, l0 l0Var, j60.a aVar, ut5.c cVar, r rVar, jx0.a aVar2, a26.n nVar, a26.t tVar) {
        kgm.c cVar2 = (kgm.c) this.f151364a;
        ut5.h hVar = rVar == null ? (h30.q) this.d : rVar;
        ut5.d dVar = aVar2 == null ? (kv5.a) this.f151365b : aVar2;
        SplitAccountsWidgetContract$AssetModelExtension splitAccountsWidgetContract$AssetModelExtension = nVar == null ? (iv5.c) this.f151366c : nVar;
        ut5.g gVar = tVar == null ? (kv5.k) this.e : tVar;
        kv5.b bVar = (kv5.b) this.f;
        lVar.getClass();
        l0Var.getClass();
        aVar.getClass();
        return new ku5.j((ku5.g) cVar2.f184018b, lVar, cVar, l0Var, aVar, hVar, dVar, splitAccountsWidgetContract$AssetModelExtension, gVar, bVar);
    }

    public void t(pd.g gVar) {
        gVar.getClass();
        this.d = gVar;
    }

    public void u(df.e eVar) {
        eVar.getClass();
        this.e = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(com.revolut.feature_move_money.api.model.AccountWrapper r9, java.util.List r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof m6i.b0
            if (r0 == 0) goto L13
            r0 = r11
            m6i.b0 r0 = (m6i.b0) r0
            int r1 = r0.f203128x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203128x = r1
            goto L18
        L13:
            m6i.b0 r0 = new m6i.b0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203128x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r11)
            return r11
        L3a:
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = r0.u
            yhm.o.b(r11)
            goto L59
        L40:
            yhm.o.b(r11)
            java.lang.Object r11 = r8.f
            jul.o r11 = (jul.o) r11
            lr.l r2 = new lr.l
            r7 = 14
            r2.<init>(r8, r9, r6, r7)
            r0.u = r9
            r0.f203128x = r5
            java.lang.Object r11 = r11.r(r10, r2, r0)
            if (r11 != r1) goto L59
            goto L81
        L59:
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r11 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r11
            if (r11 == 0) goto L73
            java.lang.Object r9 = r8.f151366c
            h6i.o r9 = (h6i.o) r9
            java.lang.String r10 = r11.f99404a
            k1j.a r11 = r11.getF99407g()
            r0.u = r6
            r0.f203128x = r4
            java.lang.Object r9 = r9.d(r0, r10, r11)
            if (r9 != r1) goto L72
            goto L81
        L72:
            return r9
        L73:
            java.lang.Object r10 = r8.d
            m6i.l r10 = (m6i.l) r10
            r0.u = r6
            r0.f203128x = r3
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.w(com.revolut.feature_move_money.api.model.AccountWrapper, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.revolut.feature_move_money.api.model.AccountWrapper r6, x5i.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m6i.a0
            if (r0 == 0) goto L13
            r0 = r8
            m6i.a0 r0 = (m6i.a0) r0
            int r1 = r0.f203124x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203124x = r1
            goto L18
        L13:
            m6i.a0 r0 = new m6i.a0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203124x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r0.u
            yhm.o.b(r8)
            goto L4a
        L38:
            yhm.o.b(r8)
            java.lang.Object r8 = r5.f151364a
            m6i.h0 r8 = (m6i.h0) r8
            r0.u = r6
            r0.f203124x = r4
            java.io.Serializable r8 = r8.a(r6, r7, r0)
            if (r8 != r1) goto L4a
            goto L57
        L4a:
            java.util.List r8 = (java.util.List) r8
            r7 = 0
            r0.u = r7
            r0.f203124x = r3
            java.lang.Object r6 = r5.w(r6, r8, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.x(com.revolut.feature_move_money.api.model.AccountWrapper, x5i.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(com.revolut.feature_move_money.api.model.AccountWrapper r12, com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r13, gim.c r14, x5i.d r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.y(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.StartUpPocket, gim.c, x5i.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof vh8.f
            if (r0 == 0) goto L13
            r0 = r6
            vh8.f r0 = (vh8.f) r0
            int r1 = r0.f289346w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289346w = r1
            goto L18
        L13:
            vh8.f r0 = new vh8.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289346w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f
            ang.f r6 = (ang.f) r6
            w4l.j r2 = w4l.j.f294644c
            akg.n r6 = r6.j(r2)
            vgg.a0 r2 = new vgg.a0
            r4 = 5
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f289346w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            do3.n r6 = (do3.n) r6
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.y0
            boolean r0 = te0.w.S(r6, r0)
            if (r0 == 0) goto L64
            java.lang.Object r6 = r5.e
            vh8.a r6 = (vh8.a) r6
            return r6
        L64:
            wi0.b r0 = wi0.b.y2
            boolean r0 = te0.w.S(r6, r0)
            if (r0 == 0) goto L71
            java.lang.Object r6 = r5.f151365b
            vh8.a r6 = (vh8.a) r6
            return r6
        L71:
            wi0.b r0 = wi0.b.O
            boolean r0 = te0.w.S(r6, r0)
            if (r0 == 0) goto L7e
            java.lang.Object r6 = r5.f151366c
            vh8.a r6 = (vh8.a) r6
            return r6
        L7e:
            wi0.b r0 = wi0.b.f297770q3
            boolean r6 = te0.w.S(r6, r0)
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.d
            vh8.a r6 = (vh8.a) r6
            return r6
        L8b:
            java.lang.Object r6 = r5.f151364a
            vh8.b r6 = (vh8.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.r.z(gim.c):java.lang.Object");
    }

    public r(kgm.c subcomponentFactory, kv5.a defaultFiatItemsDataProvider, iv5.c defaultSplitAssetModelExtension, h30.q defaultPocketsDataProvider, kv5.k defaultPerpetualsItemsProvider, kv5.b defaultSpotMarginTradingItemsProvider) {
        Intrinsics.checkNotNullParameter(subcomponentFactory, "subcomponentFactory");
        Intrinsics.checkNotNullParameter(defaultFiatItemsDataProvider, "defaultFiatItemsDataProvider");
        Intrinsics.checkNotNullParameter(defaultSplitAssetModelExtension, "defaultSplitAssetModelExtension");
        Intrinsics.checkNotNullParameter(defaultPocketsDataProvider, "defaultPocketsDataProvider");
        Intrinsics.checkNotNullParameter(defaultPerpetualsItemsProvider, "defaultPerpetualsItemsProvider");
        Intrinsics.checkNotNullParameter(defaultSpotMarginTradingItemsProvider, "defaultSpotMarginTradingItemsProvider");
        this.f151364a = subcomponentFactory;
        this.f151365b = defaultFiatItemsDataProvider;
        this.f151366c = defaultSplitAssetModelExtension;
        this.d = defaultPocketsDataProvider;
        this.e = defaultPerpetualsItemsProvider;
        this.f = defaultSpotMarginTradingItemsProvider;
    }

    public r(h0 moveMoneyStartupAccountProvider, wsg.n walletInteractor, h6i.o accountInteractor, m6i.l nonExistingCurrencySelector, k7i.i moveMoneyBalanceAccountEligibilityChecker, jul.o hiddenAccountFilter) {
        Intrinsics.checkNotNullParameter(moveMoneyStartupAccountProvider, "moveMoneyStartupAccountProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        Intrinsics.checkNotNullParameter(nonExistingCurrencySelector, "nonExistingCurrencySelector");
        Intrinsics.checkNotNullParameter(moveMoneyBalanceAccountEligibilityChecker, "moveMoneyBalanceAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountFilter, "hiddenAccountFilter");
        this.f151364a = moveMoneyStartupAccountProvider;
        this.f151365b = walletInteractor;
        this.f151366c = accountInteractor;
        this.d = nonExistingCurrencySelector;
        this.e = moveMoneyBalanceAccountEligibilityChecker;
        this.f = hiddenAccountFilter;
    }

    public r(os9.c groupChatMembersInteractor, c70.a clipboard, nd.o chooserCommandFactory, mq9.f groupsInteractor, wj0.a idempotencyKeyHolder, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(groupChatMembersInteractor, "groupChatMembersInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f151364a = groupChatMembersInteractor;
        this.f151365b = clipboard;
        this.f151366c = chooserCommandFactory;
        this.d = groupsInteractor;
        this.e = idempotencyKeyHolder;
        this.f = uiKitResources;
    }

    public r(nd1.n shoppingCartInteractor, nd1.i currencyInteractor, ad1.b prePaymentExtension, bd1.a catalogueLineItemMapper, hf1.d orderDescriptionProvider, gd1.a paymentActionHandler) {
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(prePaymentExtension, "prePaymentExtension");
        Intrinsics.checkNotNullParameter(catalogueLineItemMapper, "catalogueLineItemMapper");
        Intrinsics.checkNotNullParameter(orderDescriptionProvider, "orderDescriptionProvider");
        Intrinsics.checkNotNullParameter(paymentActionHandler, "paymentActionHandler");
        this.f151364a = shoppingCartInteractor;
        this.f151365b = currencyInteractor;
        this.f151366c = prePaymentExtension;
        this.d = catalogueLineItemMapper;
        this.e = orderDescriptionProvider;
        this.f = paymentActionHandler;
    }

    public r(ffk.t pricingPlanInteractor, wsg.n walletInteractor, yj2.l atmsInteractor, mt8.d kycInteractor, Set hiddenPricingPlanLimitTypes, zyj.a limitsPlanAppConfig, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(atmsInteractor, "atmsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(hiddenPricingPlanLimitTypes, "hiddenPricingPlanLimitTypes");
        Intrinsics.checkNotNullParameter(limitsPlanAppConfig, "limitsPlanAppConfig");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f151364a = pricingPlanInteractor;
        this.f151365b = walletInteractor;
        this.f151366c = atmsInteractor;
        this.d = kycInteractor;
        this.e = hiddenPricingPlanLimitTypes;
        this.f = userCompanyInteractor;
    }

    public r(ryc.a popularAssetsInteractor, ybl.l tradingConfigInteractor, jbh.e performanceAssetMapper, e3 naviCommandsProvider, e9h.d performanceAssetsTransformer, rul.e metaCollectionInstrumentsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(popularAssetsInteractor, "popularAssetsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(naviCommandsProvider, "naviCommandsProvider");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(metaCollectionInstrumentsInteractor, "metaCollectionInstrumentsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f151364a = popularAssetsInteractor;
        this.f151365b = tradingConfigInteractor;
        this.f151366c = naviCommandsProvider;
        this.d = performanceAssetsTransformer;
        this.e = metaCollectionInstrumentsInteractor;
        this.f = featureToggleInteractor;
    }

    public r(CreditCardAutopayService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f151364a = api2;
        this.f151365b = memoryCache;
        this.f151366c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new b6a.d(this, continuation, 9), new Function1(this) { // from class: bc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14382b;

            {
                this.f14382b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        c key = (c) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CreditCardAutopayPayments) ((xx4.d) this.f14382b.f151365b).a(key);
                    case 1:
                        a key2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CreditCardAutopayConfig) ((xx4.d) this.f14382b.f151365b).a(key2);
                    default:
                        b key3 = (b) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardDirectDebitMandate) ((xx4.d) this.f14382b.f151365b).a(key3);
                }
            }
        }, new Function2(this) { // from class: bc5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14384b;

            {
                this.f14384b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        c key = (c) obj2;
                        CreditCardAutopayPayments payment = (CreditCardAutopayPayments) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key, payment);
                        break;
                    case 1:
                        a key2 = (a) obj2;
                        CreditCardAutopayConfig payment2 = (CreditCardAutopayConfig) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key2, payment2);
                        break;
                    default:
                        b key3 = (b) obj2;
                        CreditCardDirectDebitMandate payment3 = (CreditCardDirectDebitMandate) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key3, payment3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new bc5.f(this, continuation, 2), new a0e.o(this, continuation, 27));
        final int i2 = 1;
        this.e = new x4l.c(new b6a.d(this, continuation, 7), new Function1(this) { // from class: bc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14382b;

            {
                this.f14382b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        c key = (c) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CreditCardAutopayPayments) ((xx4.d) this.f14382b.f151365b).a(key);
                    case 1:
                        a key2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CreditCardAutopayConfig) ((xx4.d) this.f14382b.f151365b).a(key2);
                    default:
                        b key3 = (b) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardDirectDebitMandate) ((xx4.d) this.f14382b.f151365b).a(key3);
                }
            }
        }, new Function2(this) { // from class: bc5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14384b;

            {
                this.f14384b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        c key = (c) obj2;
                        CreditCardAutopayPayments payment = (CreditCardAutopayPayments) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key, payment);
                        break;
                    case 1:
                        a key2 = (a) obj2;
                        CreditCardAutopayConfig payment2 = (CreditCardAutopayConfig) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key2, payment2);
                        break;
                    default:
                        b key3 = (b) obj2;
                        CreditCardDirectDebitMandate payment3 = (CreditCardDirectDebitMandate) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key3, payment3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new bc5.f(this, continuation, 0), new a0e.o(this, continuation, 25));
        final int i3 = 2;
        this.f = new x4l.c(new b6a.d(this, continuation, 8), new Function1(this) { // from class: bc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14382b;

            {
                this.f14382b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        c key = (c) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CreditCardAutopayPayments) ((xx4.d) this.f14382b.f151365b).a(key);
                    case 1:
                        a key2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CreditCardAutopayConfig) ((xx4.d) this.f14382b.f151365b).a(key2);
                    default:
                        b key3 = (b) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardDirectDebitMandate) ((xx4.d) this.f14382b.f151365b).a(key3);
                }
            }
        }, new Function2(this) { // from class: bc5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f14384b;

            {
                this.f14384b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        c key = (c) obj2;
                        CreditCardAutopayPayments payment = (CreditCardAutopayPayments) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key, payment);
                        break;
                    case 1:
                        a key2 = (a) obj2;
                        CreditCardAutopayConfig payment2 = (CreditCardAutopayConfig) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key2, payment2);
                        break;
                    default:
                        b key3 = (b) obj2;
                        CreditCardDirectDebitMandate payment3 = (CreditCardDirectDebitMandate) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        ((xx4.d) this.f14384b.f151365b).b(key3, payment3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new bc5.f(this, continuation, 1), new a0e.o(this, continuation, 26));
    }

    public r(tm.g gVar, mm.a action, String id10) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f = gVar;
        this.f151365b = action;
        this.f151364a = id10;
        this.f151366c = new AtomicReference(null);
        this.d = new AtomicBoolean(false);
    }
}
