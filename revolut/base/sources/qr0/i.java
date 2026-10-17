package qr0;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import c12.z;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.repository.network.EarlyCreditService;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.impl.data.network.WarrantDetailsService;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import ffk.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q87.q;
import qp5.x;
import sgm.v;
import t33.r;
import up5.s;
import zh9.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements aq0.j, o, b2b.e, igm.o, kfm.c, uc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f248595b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f248594a = i;
        this.f248595b = obj2;
    }

    public Integer a(xdh.b rebalanceStatus) {
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        ((nmc.g) this.f248595b).getClass();
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        switch (nmc.f.f217268a[rebalanceStatus.ordinal()]) {
            case 1:
                return Integer.valueOf(R$string.wealth_robo_portfolio_rebalance_state_pending_initial_funding);
            case 2:
                return Integer.valueOf(R$string.wealth_robo_portfolio_rebalance_state_pending_cash_allocation);
            case 3:
                return Integer.valueOf(R$string.wealth_robo_portfolio_rebalance_state_pending_rebalancing);
            case 4:
                return Integer.valueOf(R$string.wealth_robo_portfolio_rebalance_state_pending_template_change);
            case 5:
                return Integer.valueOf(R$string.wealth_robo_portfolio_rebalance_state_pending_template_allocation_change);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f248594a) {
            case 1:
                return ((x) this.f248595b).invoke(obj2);
            case 9:
                return ((s9h.g) this.f248595b).invoke(obj2);
            case 10:
                Object objApply = ((igm.o) this.f248595b).apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null Iterable");
                return new mgm.j((Iterable) objApply, 7);
            case 11:
                Object objApply2 = ((v) this.f248595b).f263210c.apply(new Object[]{obj2});
                Objects.requireNonNull(objApply2, "The combiner returned a null value");
                return objApply2;
            case 22:
                return ((r) this.f248595b).invoke(obj2);
            case 24:
                return ((r) this.f248595b).invoke(obj2);
            default:
                return ((s) this.f248595b).invoke(obj2);
        }
    }

    @Override // uc.f
    public void b(uc.g gVar, File file, boolean z) {
        prl.e eVar = (prl.e) this.f248595b;
        ((HashSet) eVar.f239326c).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) eVar.d).set(false);
    }

    @Override // b2b.e
    public SwipeToActionDelegate c() {
        return (SwipeToActionDelegate) this.f248595b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r7a.b d(com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission... r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f248595b
            com.revolut.kompot.navigable.vc.ViewController r0 = (com.revolut.kompot.navigable.vc.ViewController) r0
            java.lang.String r1 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            int r1 = r14.length
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        Le:
            if (r2 >= r1) goto L50
            r6 = r14[r2]
            android.app.Activity r7 = r0.m2()
            java.lang.String r8 = r6.f80329a
            java.lang.String r9 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            java.lang.String r9 = "permission"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r7, r8)
            r8 = -1
            if (r7 != r8) goto L40
            android.app.Activity r10 = r0.m2()
            java.lang.String r11 = r6.f80329a
            java.lang.String r12 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r9)
            boolean r9 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r10, r11)
            if (r9 != 0) goto L40
            int r3 = r3 + 1
            goto L4d
        L40:
            if (r7 != r8) goto L49
            boolean r6 = r6.d
            if (r6 == 0) goto L49
            int r4 = r4 + 1
            goto L4d
        L49:
            if (r7 != r8) goto L4d
            int r5 = r5 + 1
        L4d:
            int r2 = r2 + 1
            goto Le
        L50:
            if (r3 > 0) goto L5d
            if (r4 <= 0) goto L55
            goto L5d
        L55:
            if (r5 <= 0) goto L5a
            r7a.b r14 = r7a.b.DENIED
            return r14
        L5a:
            r7a.b r14 = r7a.b.ALLOWED
            return r14
        L5d:
            r7a.b r14 = r7a.b.EXPLANATION
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qr0.i.d(com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission[]):r7a.b");
    }

    public c12.x e(hrf.f direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new c12.x(new ApmRecipientListInputData(ApmBizum.f61808c, direction, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_select_contact_search_placeholder, null, null, 14)), (z) this.f248595b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable f(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sxc.a
            if (r0 == 0) goto L13
            r0 = r6
            sxc.a r0 = (sxc.a) r0
            int r1 = r0.f266415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266415w = r1
            goto L18
        L13:
            sxc.a r0 = new sxc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266415w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f248595b
            com.revolut.feature.selfserve.entity.config.impl.data.network.WarrantDetailsService r6 = (com.revolut.feature.selfserve.entity.config.impl.data.network.WarrantDetailsService) r6
            r0.f266415w = r3
            java.lang.Object r6 = r6.getWarrantDetailsByTicket(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r0 = r6.size()
            int r0 = zhm.q0.b(r0)
            r5.<init>(r0)
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            jo3.a r0 = (jo3.a) r0
            dj0.d r0 = mo3.a.o(r0)
            xi0.b r2 = r0.f115083b
            java.lang.String r2 = cp5.d.J(r2)
            java.math.BigDecimal r0 = pyd.c.x(r0)
            java.lang.String r0 = r0.toPlainString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.put(r1, r0)
            goto L5d
        L98:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qr0.i.f(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r4.f248595b
            ij0.a r0 = (ij0.a) r0
            java.lang.String r0 = r0.getBaseUrl()
            ulm.w0 r1 = ulm.x0.Companion
            r1.getClass()
            ulm.x0 r0 = ulm.w0.d(r0)
            r2 = 0
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.d
            boolean r3 = vlm.g.a(r0)
            if (r3 == 0) goto L22
            goto L2e
        L22:
            hmm.c r3 = hmm.d.Companion
            r3.getClass()
            hmm.d r3 = hmm.d.d
            java.lang.String r0 = r3.a(r0)
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 != 0) goto L32
            goto L51
        L32:
            r1.getClass()
            ulm.x0 r5 = ulm.w0.d(r5)
            if (r5 == 0) goto L4f
            java.lang.String r5 = r5.d
            boolean r1 = vlm.g.a(r5)
            if (r1 == 0) goto L44
            goto L4f
        L44:
            hmm.c r1 = hmm.d.Companion
            r1.getClass()
            hmm.d r1 = hmm.d.d
            java.lang.String r2 = r1.a(r5)
        L4f:
            if (r2 != 0) goto L53
        L51:
            r5 = 0
            return r5
        L53:
            boolean r5 = r2.equals(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qr0.i.g(java.lang.String):boolean");
    }

    public vkm.d h(String agentId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k1f.h hVar = (k1f.h) this.f248595b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(hVar.e.e(agentId, loadingStrategy));
    }

    public vkm.d i(u2f.j product) {
        Intrinsics.checkNotNullParameter(product, "product");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k1f.h hVar = (k1f.h) this.f248595b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(hVar.d.e(product, loadingStrategy));
    }

    public q j() {
        t tVar = (t) this.f248595b;
        return new q(nim.a.v(u0.m(rd0.e.b(tVar.q()), nim.a.v(rd0.e.b(tVar.t(true)), new uv1.c(10))), new uv1.c(11)), 8);
    }

    public boolean k(String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        String[] strArr = (String[]) Arrays.copyOf(keys, keys.length);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (l(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ((ViewController) this.f248595b).L2(YearClass.CLASS_2008, arrayList);
        return true;
    }

    public boolean l(String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (keys.length != 0) {
            for (String permission : keys) {
                Activity context = ((ViewController) this.f248595b).m2();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(permission, "permission");
                if (ContextCompat.checkSelfPermission(context, permission) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public i(x function) {
        this.f248594a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f248595b = function;
    }

    public i(s9h.g function) {
        this.f248594a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f248595b = function;
    }

    public i(r function) {
        this.f248594a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f248595b = function;
    }

    public i(r function, byte b4) {
        this.f248594a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f248595b = function;
    }

    public i(s function) {
        this.f248594a = 29;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f248595b = function;
    }

    public i(sm6.b packageVerificationManager) {
        this.f248594a = 12;
        Intrinsics.checkNotNullParameter(packageVerificationManager, "packageVerificationManager");
        this.f248595b = packageVerificationManager;
    }

    @Override // kfm.c
    public Object apply(Object obj2, Object obj3) {
        ((kfm.b) this.f248595b).accept(obj2, (efm.h) obj3);
        return obj2;
    }

    public i(WarrantDetailsService service) {
        this.f248594a = 14;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f248595b = service;
    }

    public i(ViewController controller, r7a.a activityCompatPermissionsWrapper) {
        this.f248594a = 3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(activityCompatPermissionsWrapper, "activityCompatPermissionsWrapper");
        this.f248595b = controller;
    }

    public i(ij0.a networkConfiguration) {
        this.f248594a = 25;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f248595b = networkConfiguration;
    }

    public i(nmc.g rebalanceStatusResourceMapper) {
        this.f248594a = 19;
        Intrinsics.checkNotNullParameter(rebalanceStatusResourceMapper, "rebalanceStatusResourceMapper");
        this.f248595b = rebalanceStatusResourceMapper;
    }

    public i(ntb.c mainScreenTabEventDispatcher) {
        this.f248594a = 4;
        Intrinsics.checkNotNullParameter(mainScreenTabEventDispatcher, "mainScreenTabEventDispatcher");
        this.f248595b = mainScreenTabEventDispatcher;
    }

    public i(q7c.s shippingInteractor) {
        this.f248594a = 16;
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        this.f248595b = shippingInteractor;
    }

    public i(ah0.c msLatLngBoundsFactory) {
        this.f248594a = 7;
        Intrinsics.checkNotNullParameter(msLatLngBoundsFactory, "msLatLngBoundsFactory");
        this.f248595b = msLatLngBoundsFactory;
    }

    public i(RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData inputData) {
        this.f248594a = 5;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f248595b = inputData;
    }

    public i(z0h.d disclaimersDataProvider) {
        this.f248594a = 20;
        Intrinsics.checkNotNullParameter(disclaimersDataProvider, "disclaimersDataProvider");
        this.f248595b = disclaimersDataProvider;
    }

    public i(srf.h transferValidator) {
        this.f248594a = 13;
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        this.f248595b = transferValidator;
    }

    public i(EarlyCreditService service) {
        this.f248594a = 18;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f248595b = service;
    }

    public i(k1f.h repository) {
        this.f248594a = 21;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f248595b = repository;
    }

    public i(xoj.a featuresInteractor) {
        this.f248594a = 15;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f248595b = featuresInteractor;
    }

    public i(z apmRecipientListExtension) {
        this.f248594a = 6;
        Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
        this.f248595b = apmRecipientListExtension;
    }

    public i(t pricingPlanInteractor) {
        this.f248594a = 28;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f248595b = pricingPlanInteractor;
    }

    public i(bm0.a cryptoWrapper) {
        this.f248594a = 27;
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        this.f248595b = cryptoWrapper;
    }

    public i(CreditApplicationFlowContract$InputData inputData) {
        this.f248594a = 8;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f248595b = inputData;
    }

    public i(CfdTradingHomeScreen cfdTradingHomeScreen) {
        this.f248594a = 2;
        this.f248595b = cfdTradingHomeScreen.W;
    }
}
