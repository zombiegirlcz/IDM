package smd;

import com.google.android.gms.maps.model.Marker;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseControllerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.ServiceState;
import g48.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import up5.a0;
import vkm.j2;
import wf0.f0;
import wtc.q0;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements zp0.c, xki.d, ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f264432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f264433b;

    public s(ang.f userInteractor, q0 userCountryInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        this.f264432a = userInteractor;
        this.f264433b = userCountryInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static usb.c a0(f0h.a aVar, boolean z) {
        return new usb.c(new TextLocalisedClause(R$string.wealth_robo_withdraw_to_main, null, null, 14), new CurrencyImage(aVar.f131122a.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14), z, z, null, aVar.f131122a, usb.b.CURRENCY);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(smd.s r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof xn2.b
            if (r0 == 0) goto L13
            r0 = r5
            xn2.b r0 = (xn2.b) r0
            int r1 = r0.f307309w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307309w = r1
            goto L18
        L13:
            xn2.b r0 = new xn2.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f307309w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            java.lang.Object r4 = r4.f264433b
            ang.f r4 = (ang.f) r4
            zmg.d r4 = r4.d
            efm.k r4 = r4.c()
            r0.f307309w = r3
            java.lang.Object r5 = nim.a.i(r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            do3.n r5 = (do3.n) r5
            java.lang.String r4 = ""
            if (r5 == 0) goto L4f
            java.lang.String r0 = r5.f116410c
            if (r0 != 0) goto L55
        L4f:
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r0)
            r0 = r4
        L55:
            if (r5 == 0) goto L5e
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L5c
            goto L5e
        L5c:
            r4 = r5
            goto L63
        L5e:
            kotlin.jvm.internal.t0 r5 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r5)
        L63:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.CharSequence r4 = kotlin.text.d0.F0(r4)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: smd.s.b(smd.s, gim.c):java.lang.Object");
    }

    public static CountryProfile i(String str, t1j.d dVar) {
        CountryProfile countryProfile = null;
        Object obj2 = null;
        countryProfile = null;
        CountryProfile countryProfile2 = dVar != null ? dVar.f267384c : null;
        if (str != null && dVar != null) {
            Iterator it8 = dVar.f267383b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((CountryProfile) next).f92231a, str)) {
                    obj2 = next;
                    break;
                }
            }
            countryProfile = (CountryProfile) obj2;
        }
        return countryProfile == null ? countryProfile2 : countryProfile;
    }

    public Object B(gim.i iVar) {
        return vkm.q.z(new wyd.f(((r0) this.f264432a).h(w4l.h.f294642c), this, 15), iVar);
    }

    public cxe.u E() {
        return nim.a.y(nim.a.v(rd0.e.b(hng.g.b(((ang.b) ((l61.a) this.f264432a)).f7765a)), new yo7.p(this, 3)), new yjj.j(28));
    }

    public boolean J(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (((String) this.f264433b) == null) {
            BackendFlow backendFlowA = ((la0.c) this.f264432a).a();
            BackendScreen backendScreen = (BackendScreen) nkm.y.w(nkm.t.g(ta6.a.r(backendFlowA), new la0.a(backendFlowA, 4)));
            this.f264433b = backendScreen != null ? backendScreen.getF63711a() : null;
        }
        return Intrinsics.f((String) this.f264433b, screen.getF63711a());
    }

    public efm.r M() {
        a0 a0Var = (a0) ((up5.b) this.f264432a);
        final int i = 1;
        efm.r rVarDistinctUntilChanged = pd.b.r(mif.a.e(a0Var.n3(), a0Var.p3(), (efm.r) a0Var.f281863s.getValue()), new Function1(this) { // from class: up5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ smd.s f281851b;

            {
                this.f281851b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return rd0.e.c(((zjh.j) this.f281851b.f264433b).m((dj0.d) pair.f186386b, (xi0.b) pair.f186385a), kotlin.coroutines.g.f186406a);
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        CryptoAddress cryptoAddress = (CryptoAddress) rVar.f314201a;
                        eq5.q qVar = (eq5.q) rVar.f314202b;
                        return qVar.d.f71113b.f115082a < qVar.f128302b.e.f71113b.f115082a ? zi0.c.j(wp5.b.LowBalance) : rd0.e.c(((zjh.j) this.f281851b.f264433b).l(cryptoAddress, (List) rVar.f314203c, qVar.f128301a), kotlin.coroutines.g.f186406a);
                }
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = nim.a.w(a0Var.v3(), new umc.c(24)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarW = nim.a.w(mif.a.d(rVarDistinctUntilChanged2, a0Var.p3()), new umc.c(25));
        efm.r map = a0Var.C3().map(new uoe.a(3, new umc.c(22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        final int i2 = 0;
        efm.r rVarDistinctUntilChanged3 = pd.b.r(kli.a.h(map, nim.a.w(a0Var.v3(), new umc.c(23))), new Function1(this) { // from class: up5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ smd.s f281851b;

            {
                this.f281851b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return rd0.e.c(((zjh.j) this.f281851b.f264433b).m((dj0.d) pair.f186386b, (xi0.b) pair.f186385a), kotlin.coroutines.g.f186406a);
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        CryptoAddress cryptoAddress = (CryptoAddress) rVar.f314201a;
                        eq5.q qVar = (eq5.q) rVar.f314202b;
                        return qVar.d.f71113b.f115082a < qVar.f128302b.e.f71113b.f115082a ? zi0.c.j(wp5.b.LowBalance) : rd0.e.c(((zjh.j) this.f281851b.f264433b).l(cryptoAddress, (List) rVar.f314203c, qVar.f128301a), kotlin.coroutines.g.f186406a);
                }
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        return nim.a.w(mif.a.f(rVarDistinctUntilChanged, rVarW, rVarDistinctUntilChanged3, a0Var.p3()), new umc.c(this, 21));
    }

    public Flow O(t1j.e inputData) {
        jx0.a aVar = (jx0.a) this.f264432a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return xam.a.h(new qqj.g(this, inputData, (Continuation) null, 17), inputData.b() ? aVar.q() : nim.a.v(aVar.t(), new szb.g(22)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r3 != r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(gim.c r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f264432a
            hng.b r0 = (hng.b) r0
            boolean r1 = r8 instanceof zmg.b
            if (r1 == 0) goto L17
            r1 = r8
            zmg.b r1 = (zmg.b) r1
            int r2 = r1.f323507w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f323507w = r2
            goto L1c
        L17:
            zmg.b r1 = new zmg.b
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f323507w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L42
            if (r3 == r6) goto L3e
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            yhm.o.b(r8)
            goto La3
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            yhm.o.b(r8)
            goto L86
        L3e:
            yhm.o.b(r8)
            goto L56
        L42:
            yhm.o.b(r8)
            vkm.d r8 = r0.a()
            zfd.e r8 = zi0.c.w(r8)
            r1.f323507w = r6
            java.lang.Object r8 = vkm.q.x(r8, r1)
            if (r8 != r2) goto L56
            goto La2
        L56:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L65
            java.lang.Object r8 = r8.f224257a
            java.lang.String r8 = (java.lang.String) r8
            goto L66
        L65:
            r8 = 0
        L66:
            if (r8 != 0) goto La6
            java.lang.Object r8 = r7.f264433b
            ang.f r8 = (ang.f) r8
            zmg.d r8 = r8.d
            efm.r r8 = r8.e()
            vkm.d r8 = rd0.e.b(r8)
            z75.f r3 = new z75.f
            r6 = 11
            r3.<init>(r8, r6)
            r1.f323507w = r5
            java.lang.Object r8 = vkm.q.x(r3, r1)
            if (r8 != r2) goto L86
            goto La2
        L86:
            do3.n r8 = (do3.n) r8
            java.lang.String r8 = r8.f116408a
            r1.f323507w = r4
            x4l.c r0 = r0.f154094c
            kotlin.Unit r3 = kotlin.Unit.f186387a
            od0.h r4 = od0.i.Companion
            r4.getClass()
            od0.i r8 = od0.h.a(r8)
            java.lang.Object r8 = r0.f(r3, r8, r1)
            if (r8 != r2) goto La0
            r3 = r8
        La0:
            if (r3 != r2) goto La3
        La2:
            return r2
        La3:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La6:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: smd.s.S(gim.c):java.lang.Object");
    }

    public void V(Marker marker) {
        HashMap map = (HashMap) this.f264433b;
        Object obj2 = map.get(marker);
        map.remove(marker);
        ((HashMap) this.f264432a).remove(obj2);
    }

    public zi2.c W() {
        return (zi2.c) ((Lazy) this.f264433b).getValue();
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public yc.c b0() {
        Map map = (Map) this.f264433b;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f264433b = mapUnmodifiableMap;
        return new yc.c((Integer) this.f264432a, (Map) this.f264433b);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f264432a, ViewController.class);
        vc.s.h((OfflineLicenseControllerContract$InputData) this.f264433b, OfflineLicenseControllerContract$InputData.class);
        return new z09.c((OfflineLicenseControllerContract$InputData) this.f264433b);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f264433b
            wtc.q0 r0 = (wtc.q0) r0
            boolean r1 = r7 instanceof wtc.g
            if (r1 == 0) goto L17
            r1 = r7
            wtc.g r1 = (wtc.g) r1
            int r2 = r1.f299868w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f299868w = r2
            goto L1c
        L17:
            wtc.g r1 = new wtc.g
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f299868w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2c
            yhm.o.b(r7)
            goto L48
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f264432a
            ang.f r7 = (ang.f) r7
            efm.d0 r7 = r7.f(r4)
            r1.f299868w = r5
            java.lang.Object r7 = nim.a.b(r7, r1)
            if (r7 != r2) goto L48
            return r2
        L48:
            do3.n r7 = (do3.n) r7
            r0.getClass()
            boolean r0 = wtc.q0.b(r7)
            if (r0 != 0) goto L6c
            boolean r0 = wtc.q0.a(r7)
            if (r0 == 0) goto L5a
            goto L6c
        L5a:
            if (r7 == 0) goto L65
            com.revolut.feature.address.models.Address r7 = r7.k
            if (r7 == 0) goto L65
            wi0.b r7 = nz8.d.g(r7)
            goto L66
        L65:
            r7 = 0
        L66:
            boolean r7 = com.bumptech.glide.d.u(r7)
            if (r7 == 0) goto L6d
        L6c:
            r4 = r5
        L6d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: smd.s.c(gim.c):java.lang.Object");
    }

    public wkm.l d(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return vkm.q.Q(((x8h.k) this.f264432a).a(), new f0((Continuation) null, money, this, 6));
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        defpackage.a aVar = (defpackage.a) this.f264433b;
        if (taskEvent == TaskEvent.PROGRESS) {
            return;
        }
        TaskEvent taskEvent2 = TaskEvent.FAILED;
        if (taskEvent == taskEvent2) {
            aVar.d = (defpackage.c) this.f264432a;
            aVar.notifyMonitor(taskEvent2, this);
            return;
        }
        aVar.I = (List) objArr[0];
        aVar.b(ServiceState.CHECK_UPDATE, new Object[0]);
        defpackage.d dVar = new defpackage.d(aVar.H, aVar.I);
        dVar.K = aVar.K;
        dVar.L = aVar.J;
        aVar.notifyMonitor(TaskEvent.SUCCESS, aVar.I, dVar.c());
    }

    @Override // zp0.c
    public void k(String amount, String formattedValue, boolean z) {
        List list;
        Object next;
        dj0.d dVar;
        Object objA;
        Intrinsics.checkNotNullParameter(amount, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (z) {
            u uVarE3 = ((CategoryBudgetsController) this.f264432a).R2();
            String categoryId = ((i) this.f264433b).f264420a;
            uVarE3.getClass();
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            cli.y yVar = uVarE3.u;
            h hVar = (h) ((j) ((j2) yVar.f22677a).getValue()).f264423a.getContent();
            if (hVar == null || (list = hVar.f264419c) == null) {
                return;
            }
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((g) next).f264414a.getId(), categoryId)) {
                        break;
                    }
                }
            }
            g gVar = (g) next;
            if (gVar == null || (dVar = gVar.d) == null) {
                return;
            }
            xi0.b bVar = dVar.f115083b;
            long jLongValue = 0;
            if (amount.length() != 0) {
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    long jB = uVarE3.f264435p.b(amount, bVar.f306286a);
                    if (jB >= 0) {
                        jLongValue = jB;
                    }
                    objA = Long.valueOf(jLongValue);
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Long l2 = (Long) (objA instanceof yhm.n ? null : objA);
                if (l2 == null) {
                    return;
                } else {
                    jLongValue = l2.longValue();
                }
            }
            uVarE3.H2(yVar, new qu4.o(uVarE3, new dj0.d(jLongValue, bVar), categoryId));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof xcb.a
            if (r0 == 0) goto L13
            r0 = r9
            xcb.a r0 = (xcb.a) r0
            int r1 = r0.f304109w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304109w = r1
            goto L18
        L13:
            xcb.a r0 = new xcb.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304109w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto La6
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            yhm.o.b(r9)
            java.lang.Object r9 = r8.f264433b
            o9f.f r9 = (o9f.f) r9
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            ybl.k r2 = r9.f223263a
            cfl.k r5 = cfl.k.f23744a
            r6 = 2
            r7 = 0
            kotlinx.coroutines.flow.Flow r2 = ybl.k.k(r2, r4, r7, r5, r6)
            java.lang.String r4 = "TransferInvestmentsAvailabilityInteractorImpl"
            java.lang.String r5 = "isTransferInAvailable"
            vkm.q0 r2 = ip0.v7.y(r4, r5, r2)
            o9f.d r4 = o9f.d.IN
            o54.a r5 = new o54.a
            r6 = 10
            r5.<init>(r9, r4, r6)
            akg.n r9 = nim.a.v(r2, r5)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r9 = rd0.e.c(r9, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            efm.r r9 = zi0.c.q(r9, r2)
            efm.d0 r9 = r9.first(r2)
            java.lang.String r2 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.Object r2 = r8.f264432a
            xoj.a r2 = (xoj.a) r2
            yoj.c r4 = yoj.c.CRYPTO
            yoj.d r5 = yoj.d.DISABLED
            cpj.b r2 = (cpj.b) r2
            ufm.i r2 = r2.f(r4, r5)
            efm.d0 r9 = te0.w.H0(r9, r2)
            x8i.h r2 = new x8i.h
            r4 = 26
            r2.<init>(r4)
            x9h.d r4 = new x9h.d
            r5 = 17
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r9, r4, r5)
            java.lang.String r9 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            r0.f304109w = r3
            java.lang.Object r9 = nim.a.b(r2, r0)
            if (r9 != r1) goto La6
            return r1
        La6:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: smd.s.q(gim.c):java.lang.Object");
    }

    public s(zyh.d limitErrorDialogMapper, azh.a cryptoTradeUsageLimitBottomSheetMapper) {
        Intrinsics.checkNotNullParameter(limitErrorDialogMapper, "limitErrorDialogMapper");
        Intrinsics.checkNotNullParameter(cryptoTradeUsageLimitBottomSheetMapper, "cryptoTradeUsageLimitBottomSheetMapper");
        this.f264432a = limitErrorDialogMapper;
        this.f264433b = cryptoTradeUsageLimitBottomSheetMapper;
    }

    public s(la0.c backendFlowProvider) {
        Intrinsics.checkNotNullParameter(backendFlowProvider, "backendFlowProvider");
        this.f264432a = backendFlowProvider;
    }

    public s(jx0.a transferCountryProfilesInteractor, t1j.b balanceGroupsByCountryProfileProvider) {
        Intrinsics.checkNotNullParameter(transferCountryProfilesInteractor, "transferCountryProfilesInteractor");
        Intrinsics.checkNotNullParameter(balanceGroupsByCountryProfileProvider, "balanceGroupsByCountryProfileProvider");
        this.f264432a = transferCountryProfilesInteractor;
        this.f264433b = balanceGroupsByCountryProfileProvider;
    }

    public s(al4.m creditInteractor, al4.e debitInteractor) {
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(debitInteractor, "debitInteractor");
        this.f264432a = creditInteractor;
        this.f264433b = debitInteractor;
    }

    public s(r0 jointAccountsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f264432a = jointAccountsInteractor;
        this.f264433b = userInteractor;
    }

    public s(z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        u96.c googleApiAvailabilityProvider = u96.c.f;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(googleApiAvailabilityProvider, "googleApiAvailabilityProvider");
        this.f264432a = contextProvider;
        this.f264433b = googleApiAvailabilityProvider;
    }

    public s(x8h.k displayCurrencyInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f264432a = displayCurrencyInteractor;
        this.f264433b = ratesInteractor;
    }

    public s(up5.b presentationModel, zjh.j cryptoSendAmountInputScreenValidator) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(cryptoSendAmountInputScreenValidator, "cryptoSendAmountInputScreenValidator");
        this.f264432a = presentationModel;
        this.f264433b = cryptoSendAmountInputScreenValidator;
    }

    public s() {
        this.f264432a = new HashMap();
        this.f264433b = new HashMap();
    }
}
