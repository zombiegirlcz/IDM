package rul;

import ahe.m0;
import android.view.View;
import aw0.v1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.slot_manager.impl.network.RetailSlotManagerChecklistService;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import dej.l2;
import efm.d0;
import efm.f0;
import efm.r;
import ep6.n;
import ffk.t;
import io.reactivex.exceptions.CompositeException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pfm.z;
import qgk.u3;
import retrofit2.Response;
import sgm.e3;
import te0.w;
import tif.g;
import tij.o;
import tnb.g0;
import tse.i;
import tx0.u2;
import ufm.f;
import uo7.k;
import vcc.b;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.t1;
import w4l.h;
import xlb.l;
import xnd.p;
import xnd.s;
import y4g.j;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f0, u2, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f257629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f257630b;

    public /* synthetic */ e(zc.c cVar, TaskCompletionSource taskCompletionSource) {
        this.f257629a = cVar;
        this.f257630b = taskCompletionSource;
    }

    public static i b(e eVar, n feedbackExtension, y9l.a actionControllerExtension, p3c.a aVar, boolean z, int i) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        use.d dVar = (use.d) eVar.f257629a;
        if (aVar == null) {
            aVar = (p3c.a) eVar.f257630b;
        }
        return new i(aVar, dVar, actionControllerExtension, feedbackExtension, z3, loadingStrategy);
    }

    public static /* synthetic */ tij.n h(e eVar, l2 l2Var, Function1 function1, int i) {
        int i2 = R$attr.uikit_colorGreyTone50;
        if ((i & 4) != 0) {
            function1 = new g(4);
        }
        return eVar.g(l2Var, i2, function1);
    }

    @Override // tx0.u2
    public void a(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        vx0.a aVar = new vx0.a(colorScheme, i, i2, i3);
        vx0.b bVar = (vx0.b) this.f257630b;
        LinkedHashMap linkedHashMap = bVar.f292771a;
        View view = (View) this.f257629a;
        linkedHashMap.put(view, aVar);
        if (bVar.d == view) {
            bVar.a(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (nim.a.a(r10, r1) == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable c(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState r9, java.lang.String r10, gim.c r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f257629a
            d3j.b r0 = (d3j.b) r0
            boolean r1 = r11 instanceof v4j.a
            if (r1 == 0) goto L17
            r1 = r11
            v4j.a r1 = (v4j.a) r1
            int r2 = r1.f286100y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f286100y = r2
            goto L1c
        L17:
            v4j.a r1 = new v4j.a
            r1.<init>(r8, r11)
        L1c:
            java.lang.Object r11 = r1.f286098w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f286100y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            f5j.a r9 = r1.v
            yhm.o.b(r11)
            goto L89
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r10 = r1.u
            yhm.o.b(r11)
            goto L69
        L3e:
            yhm.o.b(r11)
            java.lang.Object r11 = r8.f257630b
            w4j.a r11 = (w4j.a) r11
            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState r3 = r9.f99737a
            java.util.List r6 = r9.f99738b
            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CopState r7 = r9.f99739c
            com.revolut.feature.address.models.Address r9 = r9.d
            n61.b r9 = r11.a(r3, r6, r7, r9)
            efm.r r9 = r0.f(r9, r5)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r11 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
            r1.u = r10
            r1.f286100y = r5
            java.lang.Object r11 = nim.a.b(r9, r1)
            if (r11 != r2) goto L69
            goto L88
        L69:
            r9 = r11
            f5j.a r9 = (f5j.a) r9
            if (r10 == 0) goto L89
            java.lang.String r11 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            o71.a r11 = r0.f111211a
            r21.h r11 = (r21.h) r11
            pfm.r r10 = r11.d(r10)
            r11 = 0
            r1.u = r11
            r1.v = r9
            r1.f286100y = r4
            java.lang.Object r10 = nim.a.a(r10, r1)
            if (r10 != r2) goto L89
        L88:
            return r2
        L89:
            kotlin.jvm.internal.Intrinsics.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rul.e.c(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState, java.lang.String, gim.c):java.io.Serializable");
    }

    public f d(Boolean bool, Integer num) {
        s1c.f fVar = (s1c.f) this.f257629a;
        d0<r1c.e> d0VarEditSpareChange = fVar.f259131a.editSpareChange(new r1c.i(bool, num));
        s08.g gVar = new s08.g(6, new s1c.a(0));
        d0VarEditSpareChange.getClass();
        ufm.i iVar = new ufm.i(d0VarEditSpareChange, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        f fVar2 = new f(w.i0(iVar), new yzc.a(16, new z1c.a(this, 0)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
        return fVar2;
    }

    public ufm.n e() {
        d0<Response<r1c.a>> maxRefundablePurchaseAge = ((s1c.f) this.f257629a).f259131a.getMaxRefundablePurchaseAge();
        s08.g gVar = new s08.g(11, new s1c.a(4));
        maxRefundablePurchaseAge.getClass();
        z zVar = new z(new ufm.i(maxRefundablePurchaseAge, gVar, 1), 1, new s1c.d(0), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return w.i0(zVar);
    }

    public boolean f(y4g.g contact) {
        j jVar;
        Intrinsics.checkNotNullParameter(contact, "contact");
        return ((zzl.c) ((zzl.b) this.f257629a)).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", contact.f310921a) && (jVar = contact.f310922b) != null && ((z80.b) this.f257630b).k(jVar.f310930c, jVar.f310928a.f297794a);
    }

    public tij.n g(l2 item, int i, Function1 parcelMapper) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(parcelMapper, "parcelMapper");
        EsimHyperText esimHyperText = item.f113587a;
        String str = item.f113588b;
        int i2 = o.f271564a[item.f113589c.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorStatusWarning;
        } else if (i2 == 2) {
            i = R$attr.uikit_colorStatusDanger;
        } else if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new tij.n(i, ((wnj.a) this.f257630b).a(esimHyperText.f100276a, esimHyperText.f100277b, Integer.valueOf(i), parcelMapper), str != null ? Integer.valueOf(((p56.a) this.f257629a).l(str)) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(gim.c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof wik.h
            if (r0 == 0) goto L13
            r0 = r12
            wik.h r0 = (wik.h) r0
            int r1 = r0.f297915w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297915w = r1
            goto L18
        L13:
            wik.h r0 = new wik.h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297915w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L90
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L93
            goto L5c
        L36:
            yhm.o.b(r12)
            java.lang.Object r12 = r11.f257629a     // Catch: java.lang.Exception -> L93
            ffk.t r12 = (ffk.t) r12     // Catch: java.lang.Exception -> L93
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Exception -> L93
            efm.r r12 = r12.v(r2)     // Catch: java.lang.Exception -> L93
            efm.r r12 = zi0.c.J(r12)     // Catch: java.lang.Exception -> L93
            wf0.b r2 = new wf0.b     // Catch: java.lang.Exception -> L93
            r5 = 13
            r2.<init>(r5)     // Catch: java.lang.Exception -> L93
            r5 = 0
            efm.r r12 = m70.a.g(r12, r5, r2, r4)     // Catch: java.lang.Exception -> L93
            r0.f297915w = r4     // Catch: java.lang.Exception -> L93
            java.lang.Object r12 = nim.a.c(r12, r0)     // Catch: java.lang.Exception -> L93
            if (r12 != r1) goto L5c
            goto L8f
        L5c:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r12 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r12     // Catch: java.lang.Exception -> L93
            hha.d r12 = r12.f81129a
            hha.w0 r6 = hha.s.f(r12)
            hha.w0 r12 = hha.w0.UNKNOWN
            if (r6 != r12) goto L6b
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L6b:
            java.lang.Object r12 = r11.f257630b
            r5 = r12
            kjk.t r5 = (kjk.t) r5
            long r7 = java.lang.System.currentTimeMillis()
            r0.f297915w = r3
            r5.getClass()
            kjk.s r4 = new kjk.s
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L8b
            goto L8d
        L8b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L8d:
            if (r12 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L93:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rul.e.i(gim.c):java.lang.Object");
    }

    public r j(boolean z) {
        return ((s1c.f) this.f257629a).d.f(Unit.f186387a, z);
    }

    public akg.n k(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return nim.a.v(u0.m(rd0.e.b(xvh.c.c((xvh.c) this.f257629a, null, h.f294642c, 1)), glc.a.a((qmc.h) this.f257630b, portfolioId)), new k(portfolioId, this));
    }

    public Flow l(AnalyticsAccountsSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        s sVar = (s) this.f257630b;
        p pVar = new p(selection);
        ConcurrentHashMap concurrentHashMap = sVar.f307446b;
        Object obj2 = concurrentHashMap.get(pVar);
        if (obj2 == null) {
            m0 m0Var = new m0(rd0.e.e(q.q(mo3.a.g(((xnd.a) this.f257629a).a(selection), null, new l(6), 1)), h0.f322473a, new x18.c(3, 17, null)), 24);
            zkm.d dVar = sVar.f307445a;
            d2.Companion.getClass();
            t1 t1VarM = q.M(m0Var, dVar, c2.f290008b, 1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pVar, t1VarM);
            obj2 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
        }
        return (Flow) obj2;
    }

    public wkm.l m(w4l.k loadingStrategy, boolean z) {
        r rVarJ;
        xoj.a aVar = (xoj.a) this.f257629a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (z) {
            yoj.c name = yoj.c.JUNIOR_GRADUATION;
            Intrinsics.checkNotNullParameter(name, "name");
            fpj.e eVar = ((cpj.b) aVar).f107969a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            pfm.h hVar = new pfm.h(new a08.d(eVar, 21), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            r rVarFilter = hVar.g(eVar.a(name, w4l.i.f294643c)).filter(new fjj.b(new fo9.a(7), 20));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            rVarJ = zi0.c.q(rVarFilter, hx7.l.x(name, yoj.d.DISABLED)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarJ, "distinctUntilChanged(...)");
        } else {
            rVarJ = ((cpj.b) aVar).j(yoj.c.JUNIOR_GRADUATION, h.f294642c);
        }
        return q.Q(rd0.e.b(rVarJ), new sdi.a(null, this, loadingStrategy, 6));
    }

    public r o() {
        return nim.a.w(xvh.c.c((xvh.c) this.f257630b, null, h.f294642c, 1), new yy9.s(28));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zc.c cVar = (zc.c) this.f257629a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f257630b;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        try {
            ((rzc.b) ((rfm.l) this.f257630b).f253964c).run();
        } catch (Throwable th11) {
            m70.a.u(th11);
            th10 = new CompositeException(th10, th11);
        }
        ((f0) this.f257629a).onError(th10);
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        ((f0) this.f257629a).onSubscribe(cVar);
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        f0 f0Var = (f0) this.f257629a;
        try {
            ((rzc.b) ((rfm.l) this.f257630b).f253964c).run();
            f0Var.onSuccess(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            f0Var.onError(th10);
        }
    }

    public RampOrderDetails p(String encodedBase64Json) {
        wk5.a aVar;
        Intrinsics.checkNotNullParameter(encodedBase64Json, "encodedBase64Json");
        Object objC = ((kg.o) this.f257630b).c(new String(((tl0.a) this.f257629a).a(encodedBase64Json), Charsets.UTF_8), vcc.b.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        vcc.b bVar = (vcc.b) objC;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b.c cVar = (b.c) zhm.d0.b0(bVar.getItems());
        long jA = cVar.getCryptoAmount();
        xi0.a aVar2 = xi0.b.Companion;
        String strA = bVar.getCrypto().getCurrency();
        aVar2.getClass();
        dj0.d dVar = new dj0.d(jA, xi0.a.a(strA));
        long jB = cVar.getTotalAmount();
        long jB2 = bVar.getFees();
        b.d dVarG = bVar.getTo();
        Intrinsics.checkNotNullParameter(dVarG, "<this>");
        RampOrderDetails.Recipient recipient = new RampOrderDetails.Recipient(dVarG.getName(), dVarG.getAddress());
        String strD = bVar.getNetwork();
        wk5.a[] aVarArrValues = wk5.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), strD, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = wk5.a.UNSPECIFIED;
        }
        b.C1591b c1591bE = bVar.getPrice();
        Intrinsics.checkNotNullParameter(c1591bE, "<this>");
        return new RampOrderDetails(dVar, jB, jB2, recipient, aVar, new RampOrderDetails.ExchangeRate(c1591bE.getUnits(), c1591bE.getAmount()), bVar.getShowFcaNotice());
    }

    public f q(int i) {
        s1c.f fVar = (s1c.f) this.f257629a;
        d0<r1c.e> spareChange = fVar.f259131a.setSpareChange(new r1c.i(2, Integer.valueOf(i)));
        s08.g gVar = new s08.g(7, new s1c.a(1));
        spareChange.getClass();
        ufm.i iVar = new ufm.i(spareChange, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        f fVar2 = new f(w.i0(iVar), new yzc.a(17, new z1c.a(this, 1)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
        return fVar2;
    }

    public e(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f257629a = regexMatcher;
        this.f257630b = phoneToolsProvider;
    }

    public e(d3j.b beneficiaryInteractor, w4j.a creationStateToRequestDataMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(creationStateToRequestDataMapper, "creationStateToRequestDataMapper");
        this.f257629a = beneficiaryInteractor;
        this.f257630b = creationStateToRequestDataMapper;
    }

    public e(kg.o gson, tl0.a base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f257629a = base64;
        this.f257630b = gson;
    }

    public e(use.d ticketsInteractor, p3c.a defaultTicketsWidgetInteractor) {
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(defaultTicketsWidgetInteractor, "defaultTicketsWidgetInteractor");
        this.f257629a = ticketsInteractor;
        this.f257630b = defaultTicketsWidgetInteractor;
    }

    public e(RetailSlotManagerChecklistService service, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter("", "basePath");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f257629a = service;
        this.f257630b = coroutineScope;
    }

    public e(jla.h productCatalogueInteractor, ptc.a wealthProtectionInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        this.f257629a = productCatalogueInteractor;
        this.f257630b = wealthProtectionInteractor;
    }

    public e(o36.b repository, xv5.c baseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        this.f257629a = repository;
        this.f257630b = baseCurrencyInteractor;
    }

    public e(e3 popularFirstBuyInteractor, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(popularFirstBuyInteractor, "popularFirstBuyInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f257629a = popularFirstBuyInteractor;
        this.f257630b = tradingTransactionsInteractor;
    }

    public e(bsl.c orderLimitsInteractor, f7j.p targetPriceBuilder, ogm.i marketPriceBuilder, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(orderLimitsInteractor, "orderLimitsInteractor");
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        Intrinsics.checkNotNullParameter(marketPriceBuilder, "marketPriceBuilder");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f257629a = targetPriceBuilder;
        this.f257630b = marketPriceBuilder;
    }

    public e(su9.c metaCollectionInteractor, ugl.c screenerInteractor) {
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        this.f257629a = metaCollectionInteractor;
        this.f257630b = screenerInteractor;
    }

    public e(p56.a iconMapper, wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f257629a = iconMapper;
        this.f257630b = descriptorApplier;
    }

    public e(o4a.c newTransferGridAvailableTransferMethodsProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(newTransferGridAvailableTransferMethodsProvider, "newTransferGridAvailableTransferMethodsProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f257629a = newTransferGridAvailableTransferMethodsProvider;
        this.f257630b = userInteractor;
    }

    public e(xnd.a analyticsAccountExtraDataProvider, s analyticsWidgetCacheProvider) {
        Intrinsics.checkNotNullParameter(analyticsAccountExtraDataProvider, "analyticsAccountExtraDataProvider");
        Intrinsics.checkNotNullParameter(analyticsWidgetCacheProvider, "analyticsWidgetCacheProvider");
        this.f257629a = analyticsAccountExtraDataProvider;
        this.f257630b = analyticsWidgetCacheProvider;
    }

    public e(t planInteractor, kjk.t planOnboardingRepository, u3 timeProvider) {
        Intrinsics.checkNotNullParameter(planInteractor, "planInteractor");
        Intrinsics.checkNotNullParameter(planOnboardingRepository, "planOnboardingRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f257629a = planInteractor;
        this.f257630b = planOnboardingRepository;
    }

    public e(neh.b repository, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f257629a = repository;
        this.f257630b = instrumentTickerInteractor;
    }

    public e(ang.f userInteractor, r10.q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f257629a = userInteractor;
        this.f257630b = userRegisteredIdentitiesInteractor;
    }

    public e(ff8.e juniorConfigRepository, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorConfigRepository, "juniorConfigRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f257629a = juniorConfigRepository;
        this.f257630b = productCatalogueInteractor;
    }

    public e(xvh.c autoInvestInteractor, qmc.h roboPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f257629a = autoInvestInteractor;
        this.f257630b = roboPortfolioInfoProvider;
    }

    public e(xoj.a featuresInteractor, xg8.a juniorGraduationRepository) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationRepository, "juniorGraduationRepository");
        this.f257629a = featuresInteractor;
        this.f257630b = juniorGraduationRepository;
    }

    public e(s1c.f revPointsSpareChangeRepository, xvh.c autoInvestInteractor) {
        Intrinsics.checkNotNullParameter(revPointsSpareChangeRepository, "revPointsSpareChangeRepository");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        this.f257629a = revPointsSpareChangeRepository;
        this.f257630b = autoInvestInteractor;
    }

    public e(y2f.a tradingTransactionsInteractor, x8h.q investTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        this.f257629a = tradingTransactionsInteractor;
        this.f257630b = investTransactionsInteractor;
    }

    public e(rfm.l lVar, f0 f0Var) {
        this.f257630b = lVar;
        this.f257629a = f0Var;
    }

    public e(vx0.b bVar, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f257630b = bVar;
        this.f257629a = view;
    }

    public e(wsg.n walletInteractor, g0 tradingCurrencyCompatibilityInteractor, zoc.i sourcePocketCurrencyResolver) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketCurrencyResolver, "sourcePocketCurrencyResolver");
        this.f257629a = walletInteractor;
        this.f257630b = tradingCurrencyCompatibilityInteractor;
    }
}
