package lal;

import al4.q;
import aqd.o1;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.javax.inject.Provider;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationVisionResourcesService;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenInfoSection;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenPromotionalPeriodSection;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreenContract$InputData;
import cp4.y;
import dp4.w;
import ix0.h2;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import mmm.q0;
import mmm.r0;
import mmm.s0;
import nl.x0;
import nl.y0;
import nvg.b0;
import om4.y3;
import pb2.v;
import r10.r;
import skm.p0;
import wli.x;
import wtc.g0;
import yhm.m;
import z6l.s;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements sji.a, l5i.h, s5i.h, el.b, r0, efm.d, gsi.g, xpi.d, ypi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f193426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f193427c;
    public Object d;
    public Object e;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f193425a = i;
        this.f193426b = obj2;
        this.f193427c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public static final String p(a aVar, t7h.d dVar) {
        return a0.d.s("margin_borrowing_interest_storage_", dVar.f268698a, "_", dVar.f268699b);
    }

    public static final boolean r(a aVar, String deeplink) {
        if (deeplink == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return !(((Set) aVar.e).contains(deeplink) || ((x) aVar.d).y1(deeplink));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:16:0x0037, B:79:0x014d, B:23:0x0053, B:62:0x011b, B:64:0x0122, B:69:0x012c, B:26:0x0062, B:52:0x00f0, B:58:0x0103, B:29:0x006f, B:43:0x00c6, B:48:0x00d4, B:32:0x007e, B:39:0x00a0, B:35:0x0088), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:16:0x0037, B:79:0x014d, B:23:0x0053, B:62:0x011b, B:64:0x0122, B:69:0x012c, B:26:0x0062, B:52:0x00f0, B:58:0x0103, B:29:0x006f, B:43:0x00c6, B:48:0x00d4, B:32:0x007e, B:39:0x00a0, B:35:0x0088), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145 A[PHI: r5 r11 r12
      0x0145: PHI (r5v6 lal.a) = (r5v4 lal.a), (r5v7 lal.a) binds: [B:63:0x0120, B:73:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r11v11 boolean) = (r11v9 boolean), (r11v14 boolean) binds: [B:63:0x0120, B:73:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r12v12 com.revolut.feature.location.api.domain.models.location.LocationDomain) = 
      (r12v9 com.revolut.feature.location.api.domain.models.location.LocationDomain)
      (r12v15 com.revolut.feature.location.api.domain.models.location.LocationDomain)
     binds: [B:63:0x0120, B:73:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(lal.a r11, wj0.b r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.s(lal.a, wj0.b, gim.c):java.lang.Object");
    }

    public Flow A(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        akg.n nVarV = nim.a.v(u0.m(((y3) ((q) this.e)).f(facilityId, w4l.h.f294642c), i6l.a.a((s) this.d, b93.d.CREDIT, 6)), new ok7.c(this, 8));
        Intrinsics.checkNotNullParameter(nVarV, "<this>");
        return vkm.q.q(new zfd.e(nVarV, 3));
    }

    public Object B(String str, gim.c cVar) {
        if (!v()) {
            return Unit.f186387a;
        }
        Object objD = ((w) this.f193426b).e.d(new y(str), false, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof om4.x0
            if (r0 == 0) goto L13
            r0 = r6
            om4.x0 r0 = (om4.x0) r0
            int r1 = r0.f226741w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226741w = r1
            goto L18
        L13:
            om4.x0 r0 = new om4.x0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226741w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L46
        L36:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.e
            al4.q r6 = (al4.q) r6
            r0.f226741w = r4
            java.lang.Object r6 = al4.q.a(r6, r0)
            if (r6 != r1) goto L46
            goto L64
        L46:
            java.lang.Object r6 = r5.d
            z6l.s r6 = (z6l.s) r6
            r0.f226741w = r3
            j6l.b r6 = r6.f319829a
            v6l.b1 r6 = (v6l.b1) r6
            w4l.f r6 = r6.f286432n
            v6l.h0$a r2 = v6l.h0.a.f286452a
            r3 = 0
            efm.b r6 = r6.g(r2, r3)
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L62:
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.C(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(gim.c r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lde.r
            if (r0 == 0) goto L13
            r0 = r7
            lde.r r0 = (lde.r) r0
            int r1 = r0.f194095x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194095x = r1
            goto L18
        L13:
            lde.r r0 = new lde.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194095x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r9 = r0.u
            yhm.o.b(r7)
            goto L55
        L38:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f193426b
            lde.m r7 = (lde.m) r7
            vkm.d r7 = r7.a(r8, r9)
            kx4.f0 r8 = new kx4.f0
            r2 = 13
            r8.<init>(r7, r2)
            r0.u = r9
            r0.f194095x = r4
            java.lang.Object r7 = vkm.q.x(r8, r0)
            if (r7 != r1) goto L55
            goto La3
        L55:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r7 = r7.getContent()
            k7d.b r7 = (k7d.b) r7
            if (r7 != 0) goto L62
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L62:
            java.lang.Object r8 = r6.f193427c
            hg0.p r8 = (hg0.p) r8
            ig0.a r7 = r7.f182033c
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            wf0.z0 r8 = r8.f152063a
            r8.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            w4l.f r8 = r8.f296950g
            r2 = 0
            efm.r r7 = r8.f(r7, r2)
            r8 = 0
            r2 = 3
            efm.r r7 = m70.a.g(r7, r8, r8, r2)
            vkm.d r7 = rd0.e.b(r7)
            im2.b r4 = new im2.b
            r5 = 9
            r4.<init>(r2, r5, r8)
            vkm.y r8 = new vkm.y
            r8.<init>(r7, r4)
            kkf.z7 r7 = new kkf.z7
            r2 = 24
            r7.<init>(r8, r6, r2)
            r0.u = r9
            r0.f194095x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto La4
        La3:
            return r1
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.D(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public Flow F(String facilityId, ArrayList revolverTransactions, vl4.f fVar, Integer num) throws Throwable {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(revolverTransactions, "revolverTransactions");
        if (revolverTransactions.isEmpty() && fVar == null) {
            return zi0.c.i(f0.f322471a);
        }
        if (num == null || num.intValue() > 0) {
            return vkm.q.q(boh.f.e(ngm.n.K(new ol8.e(this, facilityId, null, 1)), new kwg.e(this, revolverTransactions, num, fVar, facilityId)));
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalArgumentException("Limit must be greater than 0");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA != null) {
                hx7.e.n(thA);
            }
            return zi0.c.i(f0.f322471a);
        }
    }

    public void G() {
        efm.d dVar = (efm.d) this.f193426b;
        if (((AtomicInteger) this.e).decrementAndGet() == 0) {
            Throwable thB = zfm.h.b((zfm.c) this.d);
            if (thB == null) {
                dVar.onComplete();
            } else {
                dVar.onError(thB);
            }
        }
    }

    public ufm.b H(wj0.b idempotencyTag) {
        Intrinsics.checkNotNullParameter(idempotencyTag, "idempotencyTag");
        return te0.w.o0(p0.f264003c, new nyd.j(this, idempotencyTag, (Continuation) null, 29));
    }

    @Override // sji.a
    public Object S(BaseScreen baseScreen) {
        switch (this.f193425a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            default:
                throw null;
        }
    }

    @Override // ypi.f
    public Object b(ypi.h hVar) {
        throw null;
    }

    @Override // gsi.g
    public gsi.h build() {
        vc.s.h((xoi.d) this.f193427c, fsi.g.class);
        vc.s.h((xpi.f) this.d, xpi.f.class);
        vc.s.h((ypi.h) this.e, ypi.h.class);
        return new pma.a((pma.b) this.f193426b, (xoi.d) this.f193427c, (xpi.f) this.d, (ypi.h) this.e);
    }

    @Override // mmm.r0
    public void cancel() throws IOException {
        ((Socket) this.f193426b).close();
    }

    @Override // s5i.h
    public qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return ((s5i.k) this.f193426b).e(orderQuote, parcel, cellTitle, bVar);
    }

    @Override // mmm.r0
    public q0 g() {
        return (nmm.d) this.e;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f193425a) {
            case 17:
                return new nl.q0((Navigator) ((Provider) this.f193426b).get(), (sl.f) ((Provider) this.f193427c).get(), (x0) ((y0) this.d).get(), (OnfidoRemoteConfig) ((il.a) this.e).get());
            default:
                return new ol.p((sl.f) ((Provider) this.f193426b).get(), (String) ((il.e) this.f193427c).get(), (ol.f) ((r) this.d).get(), (OnfidoAnalytics) ((il.d) this.e).get());
        }
    }

    @Override // mmm.r0
    public s0 getSource() {
        return (nmm.e) this.d;
    }

    @Override // gsi.g
    public Object h(fsi.g gVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    @Override // d4i.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r12, d4i.h r13, com.revolut.feature_market_data_api.models.OrderQuoteExtraData r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, d4i.h, com.revolut.feature_market_data_api.models.OrderQuoteExtraData):java.util.List");
    }

    @Override // xpi.d
    public Object k() {
        throw null;
    }

    @Override // l5i.h
    public TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return ((aoa.k) this.d).a(quote);
    }

    @Override // s5i.h
    public qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return ((s5i.k) this.f193426b).o(orderQuote, z, parcel, cellTitle);
    }

    @Override // efm.d
    public void onComplete() {
        G();
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        zfm.c cVar = (zfm.c) this.d;
        cVar.getClass();
        if (zfm.h.a(cVar, th10)) {
            G();
        } else {
            mo3.a.m(th10);
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        ((ifm.b) this.f193427c).a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(xi0.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p1j.f
            if (r0 == 0) goto L13
            r0 = r6
            p1j.f r0 = (p1j.f) r0
            int r1 = r0.f231950x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231950x = r1
            goto L18
        L13:
            p1j.f r0 = new p1j.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231950x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f193426b
            ang.f r6 = (ang.f) r6
            zmg.d r6 = r6.d
            efm.k r6 = r6.c()
            r0.u = r5
            r0.f231950x = r3
            java.lang.Object r6 = nim.a.i(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            do3.n r6 = (do3.n) r6
            r0 = 0
            if (r6 != 0) goto L4f
            goto La1
        L4f:
            boolean r1 = te0.w.Z(r6)
            r2 = 14
            if (r1 == 0) goto L65
            boolean r1 = cp5.d.z(r5)
            if (r1 == 0) goto L65
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_crypto_uk
            r5.<init>(r6, r0, r0, r2)
            return r5
        L65:
            boolean r1 = te0.w.U(r6)
            if (r1 == 0) goto L79
            boolean r1 = cp5.d.z(r5)
            if (r1 == 0) goto L79
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_crypto_eea
            r5.<init>(r6, r0, r0, r2)
            return r5
        L79:
            boolean r1 = te0.w.Z(r6)
            if (r1 == 0) goto L8d
            boolean r1 = cp5.d.y(r5)
            if (r1 == 0) goto L8d
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_commodity_uk
            r5.<init>(r6, r0, r0, r2)
            return r5
        L8d:
            boolean r6 = te0.w.U(r6)
            if (r6 == 0) goto La1
            boolean r5 = cp5.d.y(r5)
            if (r5 == 0) goto La1
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_commodity_eea
            r5.<init>(r6, r0, r0, r2)
            return r5
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.t(xi0.b, gim.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f193425a) {
            case 18:
                String string = ((Socket) this.f193426b).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r11 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(gim.c r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            w39.b r0 = (w39.b) r0
            java.lang.Object r1 = r10.e
            j4e.a r1 = (j4e.a) r1
            boolean r2 = r11 instanceof opf.a0
            if (r2 == 0) goto L1b
            r2 = r11
            opf.a0 r2 = (opf.a0) r2
            int r3 = r2.f227601w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f227601w = r3
            goto L20
        L1b:
            opf.a0 r2 = new opf.a0
            r2.<init>(r10, r11)
        L20:
            java.lang.Object r11 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f227601w
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L33
            goto L7a
        L33:
            r11 = move-exception
            goto L85
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            yhm.o.b(r11)
            goto L54
        L41:
            yhm.o.b(r11)
            r11 = r0
            z39.b r11 = (z39.b) r11
            ufm.c r11 = r11.b()
            r2.f227601w = r6
            java.lang.Object r11 = nim.a.b(r11, r2)
            if (r11 != r3) goto L54
            goto L79
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L5d
            return r7
        L5d:
            g4e.a r11 = g4e.a.START
            r1.a(r11)
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L33
            java.lang.Long r11 = new java.lang.Long     // Catch: java.lang.Throwable -> L33
            r8 = 10000(0x2710, double:4.9407E-320)
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L33
            z39.b r0 = (z39.b) r0     // Catch: java.lang.Throwable -> L33
            ufm.i r11 = r0.c(r11)     // Catch: java.lang.Throwable -> L33
            r2.f227601w = r5     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = nim.a.b(r11, r2)     // Catch: java.lang.Throwable -> L33
            if (r11 != r3) goto L7a
        L79:
            return r3
        L7a:
            od0.i r11 = (od0.i) r11     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = r11.g()     // Catch: java.lang.Throwable -> L33
            com.revolut.feature.location.api.domain.models.location.LocationDomain r11 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r11     // Catch: java.lang.Throwable -> L33
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L33
            goto L8b
        L85:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L8b:
            boolean r0 = r11 instanceof yhm.n
            if (r0 == 0) goto L90
            r11 = r7
        L90:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r11 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r11
            if (r11 != 0) goto L9a
            g4e.a r11 = g4e.a.ERROR
            r1.a(r11)
            return r7
        L9a:
            g4e.a r0 = g4e.a.COMPLETE
            r1.a(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lal.a.u(gim.c):java.lang.Object");
    }

    public boolean v() {
        gte.a aVar = (gte.a) this.f193427c;
        if (((jte.d) aVar).c(CreditCardApi$Toggles$CreditCardBeDrivenPromotionalPeriodSection.f68677c)) {
            return true;
        }
        return ((jte.d) aVar).c(CreditCardApi$Toggles$CreditCardBeDrivenInfoSection.f68676c);
    }

    public akg.n w(String securityRef, String portfolioId) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        ybl.d dVar = (ybl.d) this.f193426b;
        ybl.c cVar = ybl.d.Companion;
        Flow flowQ = vkm.q.q(nim.a.v(((ael.y) dVar).f(3L, portfolioId), new nj8.b(securityRef, 14)));
        return nim.a.v(u0.m(flowQ, boh.f.e(flowQ, new neg.q(this, 3, securityRef, portfolioId))), new nnf.h(29));
    }

    public efm.r x() {
        return pd.b.r(u1.e(((bd3.a) this.d).g(w4l.h.f294642c), hng.g.b(((ang.b) ((l61.a) this.f193426b)).f7765a), ((ang.f) this.f193427c).k(false)), new v(this, 6));
    }

    public efm.r y(Set filter) {
        Intrinsics.checkNotNullParameter(filter, "initialFilters");
        o4a.d dVar = (o4a.d) this.d;
        Intrinsics.checkNotNullParameter(filter, "initialFilters");
        ufm.i iVar = new ufm.i(dVar.f222181a.a(filter), new o28.g(new o3k.a(dVar, 2), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        sfm.b bVar = new sfm.b(iVar, new o4a.e(0, new o3k.a(this, 3)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r rVarH = ue0.e.H(bVar, h0.f322473a, new o2g.f(22));
        o4a.h hVar = (o4a.h) this.f193427c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Map map = Intrinsics.f(filter, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a) ? (Map) hVar.f222185a.get("ALL_FILTERS_CACHE_KEY") : null;
        if (map != null && !map.isEmpty()) {
            rVarH = rVarH.startWith(new Data(map, null, true, 2, null)).map(new o4a.e(1, new o1(map, 14)));
        }
        efm.r rVarDoOnNext = rVarH.distinctUntilChanged().doOnNext(new o4a.e(2, new b0(this, filter, 27)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public efm.r z(xi0.b displayBaseCurrency) {
        Intrinsics.checkNotNullParameter(displayBaseCurrency, "displayBaseCurrency");
        efm.r rVarW = nim.a.w(((ang.f) this.f193427c).k(false), new msb.c(16));
        efm.r map = ((wsg.n) this.e).x(AccountId.Personal.f51414a).x().map(new msb.e(5, new i5f.g(27, displayBaseCurrency)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return pd.b.r(mif.a.d(rVarW, map), new mt9.c(this, displayBaseCurrency, 2));
    }

    public /* synthetic */ a(k kVar, l lVar, int i) {
        this.f193425a = i;
        this.f193426b = kVar;
        this.f193427c = lVar;
    }

    public a(wj0.a idempotencyKeyHolder) {
        this.f193425a = 29;
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f193426b = idempotencyKeyHolder;
    }

    public a(l3d.h0 watchlistInteractor, m3d.j watchlistNavigationDestinationProvider, m3d.k watchlistSortingTypesProvider, phd.a shotMessageFactory) {
        this.f193425a = 12;
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(watchlistNavigationDestinationProvider, "watchlistNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(watchlistSortingTypesProvider, "watchlistSortingTypesProvider");
        Intrinsics.checkNotNullParameter(shotMessageFactory, "shotMessageFactory");
        this.f193426b = watchlistInteractor;
        this.f193427c = watchlistNavigationDestinationProvider;
        this.d = watchlistSortingTypesProvider;
        this.e = shotMessageFactory;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public sji.b mo3800build() {
        switch (this.f193425a) {
            case 0:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((ActionsScreenContract$InputData) this.e, ActionsScreenContract$InputData.class);
                return new b((k) this.f193426b, (l) this.f193427c, (ActionsScreenContract$InputData) this.e);
            case 1:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((CancelScreenContract$InputData) this.e, CancelScreenContract$InputData.class);
                return new c((k) this.f193426b, (l) this.f193427c, (CancelScreenContract$InputData) this.e);
            case 2:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((LoadingScreenContract$InputData) this.e, LoadingScreenContract$InputData.class);
                return new e((k) this.f193426b, (l) this.f193427c, (LoadingScreenContract$InputData) this.e);
            case 3:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((QuestionScreenContract$InputData) this.e, QuestionScreenContract$InputData.class);
                return new f((k) this.f193426b, (l) this.f193427c, (QuestionScreenContract$InputData) this.e);
            case 4:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((RiskAgreementScreenContract$InputData) this.e, RiskAgreementScreenContract$InputData.class);
                return new g((k) this.f193426b, (l) this.f193427c, (RiskAgreementScreenContract$InputData) this.e);
            case 5:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((SimpleConfirmationScreenContract$InputData) this.e, SimpleConfirmationScreenContract$InputData.class);
                return new h((k) this.f193426b, (l) this.f193427c, (SimpleConfirmationScreenContract$InputData) this.e);
            default:
                vc.s.h((BaseScreen) this.d, BaseScreen.class);
                vc.s.h((WarningScreenContract$InputData) this.e, WarningScreenContract$InputData.class);
                return new m((k) this.f193426b, (l) this.f193427c, (WarningScreenContract$InputData) this.e);
        }
    }

    public a(g5k.e countrySelectionControllerFactory, ob0.a backendFlowInputItemInteractorProvider, lb0.p0 formScreenNavBarMapper, qa0.b externalNavigationExtension) {
        this.f193425a = 10;
        Intrinsics.checkNotNullParameter(countrySelectionControllerFactory, "countrySelectionControllerFactory");
        Intrinsics.checkNotNullParameter(backendFlowInputItemInteractorProvider, "backendFlowInputItemInteractorProvider");
        Intrinsics.checkNotNullParameter(formScreenNavBarMapper, "formScreenNavBarMapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        this.f193426b = countrySelectionControllerFactory;
        this.f193427c = backendFlowInputItemInteractorProvider;
        this.d = formScreenNavBarMapper;
        this.e = externalNavigationExtension;
    }

    public a(d3a.b paymentsSearchInteractor, o4a.h paymentsItemsDataProviderCache, o4a.d paymentsItemSearchSectionsProvider, vq8.a juniorIncludingModeProvider) {
        this.f193425a = 20;
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(paymentsItemsDataProviderCache, "paymentsItemsDataProviderCache");
        Intrinsics.checkNotNullParameter(paymentsItemSearchSectionsProvider, "paymentsItemSearchSectionsProvider");
        Intrinsics.checkNotNullParameter(juniorIncludingModeProvider, "juniorIncludingModeProvider");
        this.f193426b = paymentsSearchInteractor;
        this.f193427c = paymentsItemsDataProviderCache;
        this.d = paymentsItemSearchSectionsProvider;
        this.e = juniorIncludingModeProvider;
    }

    public a(lde.m sharedHelpTransactionItemsDelegate, hg0.p troubleshooterInteractor, x deeplinkHandler) {
        this.f193425a = 7;
        Intrinsics.checkNotNullParameter(sharedHelpTransactionItemsDelegate, "sharedHelpTransactionItemsDelegate");
        Intrinsics.checkNotNullParameter(troubleshooterInteractor, "troubleshooterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f193426b = sharedHelpTransactionItemsDelegate;
        this.f193427c = troubleshooterInteractor;
        this.d = deeplinkHandler;
        String[] elements = {"revolut://app/help-block-subscription", "revolut://app/help-unblock-subscription"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = kotlin.collections.d.y0(elements);
    }

    public a(ang.f userInteractor, w1j.f tradingDisclaimerProvider, w1j.c savingsDisclaimerProvider, p1j.g exchangeDisclaimerDelegate) {
        this.f193425a = 25;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingDisclaimerProvider, "tradingDisclaimerProvider");
        Intrinsics.checkNotNullParameter(savingsDisclaimerProvider, "savingsDisclaimerProvider");
        Intrinsics.checkNotNullParameter(exchangeDisclaimerDelegate, "exchangeDisclaimerDelegate");
        this.f193426b = userInteractor;
        this.f193427c = tradingDisclaimerProvider;
        this.d = savingsDisclaimerProvider;
        this.e = exchangeDisclaimerDelegate;
    }

    public a(g0 streetModeInteractor, ang.f userInteractor, w39.b locationInteractor, j4e.a streetModeLocationCollectionEventInteractor) {
        this.f193425a = 24;
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(streetModeLocationCollectionEventInteractor, "streetModeLocationCollectionEventInteractor");
        this.f193426b = streetModeInteractor;
        this.f193427c = userInteractor;
        this.d = locationInteractor;
        this.e = streetModeLocationCollectionEventInteractor;
    }

    public a(CoroutineScope scope, zw.e storage, BiometricVerificationVisionResourcesService service) {
        this.f193425a = 8;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f193426b = scope;
        this.f193427c = storage;
        this.d = service;
        this.e = new ConcurrentHashMap();
    }

    public a(hu5.d cryptoInvestmentsRepository, ang.f userInteractor, ppk.f ratesInteractor, wsg.n walletInteractor) {
        this.f193425a = 14;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsRepository, "cryptoInvestmentsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f193426b = cryptoInvestmentsRepository;
        this.f193427c = userInteractor;
        this.d = ratesInteractor;
        this.e = walletInteractor;
    }

    public a(l61.a userCompanyInteractor, ang.f userInteractor, bd3.a cashbackInteractor, hc5.a cryptoAccountInteractor) {
        this.f193425a = 26;
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        this.f193426b = userCompanyInteractor;
        this.f193427c = userInteractor;
        this.d = cashbackInteractor;
        this.e = cryptoAccountInteractor;
    }

    public a(ybl.d portfolioInteractor, kge.d cfdPositionsInteractor, ybl.b instrumentTickerInteractor, ael.q pnlInteractor) {
        this.f193425a = 19;
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        this.f193426b = portfolioInteractor;
        this.f193427c = cfdPositionsInteractor;
        this.d = instrumentTickerInteractor;
        this.e = pnlInteractor;
    }

    public a(s5i.k helper, gte.a featureToggleInteractor, aoa.k exchangeTitleProvider, p5k.p transferBreakdownInterestMapper) {
        this.f193425a = 15;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(exchangeTitleProvider, "exchangeTitleProvider");
        Intrinsics.checkNotNullParameter(transferBreakdownInterestMapper, "transferBreakdownInterestMapper");
        this.f193426b = helper;
        this.f193427c = featureToggleInteractor;
        this.d = exchangeTitleProvider;
        this.e = transferBreakdownInterestMapper;
    }

    public a(w repository, gte.a featureToggleInteractor, s cardsInteractor, q creditCardProductInteractor) {
        this.f193425a = 22;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f193426b = repository;
        this.f193427c = featureToggleInteractor;
        this.d = cardsInteractor;
        this.e = creditCardProductInteractor;
    }

    public a(d4m.a wealthMarginBorrowingService, ne0.j memoryCache, b80.c connectivityRepository, d4m.a storage) {
        this.f193425a = 16;
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingService, "wealthMarginBorrowingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f193426b = wealthMarginBorrowingService;
        this.f193427c = memoryCache;
        this.d = connectivityRepository;
        this.e = storage;
    }

    public a(whf.b transactionsContentProvider, hg2.h upiQrCodeInteractor, f80.a uriHelper, xx9.p recentRecipientInteractor) {
        this.f193425a = 11;
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(upiQrCodeInteractor, "upiQrCodeInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        this.f193426b = transactionsContentProvider;
        this.f193427c = upiQrCodeInteractor;
        this.d = uriHelper;
        this.e = recentRecipientInteractor;
    }

    public a(q creditCardProductInteractor, al4.m creditCardInstalmentInteractor, fm4.a creditCardInstalmentModelProvider, whf.b transactionItemsProvider) {
        this.f193425a = 23;
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentModelProvider, "creditCardInstalmentModelProvider");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        this.f193426b = creditCardProductInteractor;
        this.f193427c = creditCardInstalmentInteractor;
        this.d = creditCardInstalmentModelProvider;
        this.e = transactionItemsProvider;
    }

    public a(Socket socket) {
        this.f193425a = 18;
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f193426b = socket;
        this.f193427c = new AtomicInteger();
        this.d = new nmm.e(this);
        this.e = new nmm.d(this);
    }

    public a(ma1.x xVar, String str) {
        this.f193425a = 9;
        this.d = xVar;
        this.e = str;
    }

    public a(pma.b bVar) {
        this.f193425a = 28;
        this.f193426b = bVar;
    }

    public a(h2 alwaysHiddenViews, h2 loadingViews, h2 contentViews, h2 errorViews) {
        this.f193425a = 13;
        Intrinsics.checkNotNullParameter(alwaysHiddenViews, "alwaysHiddenViews");
        Intrinsics.checkNotNullParameter(loadingViews, "loadingViews");
        Intrinsics.checkNotNullParameter(contentViews, "contentViews");
        Intrinsics.checkNotNullParameter(errorViews, "errorViews");
        this.f193426b = alwaysHiddenViews;
        this.f193427c = loadingViews;
        this.d = contentViews;
        this.e = errorViews;
    }
}
