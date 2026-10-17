package sgm;

import android.os.Parcelable;
import aw0.o9;
import com.fasterxml.jackson.databind.JavaType;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.groups.api.R$plurals;
import com.revolut.feature.payments.groups.api.R$string;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class e3 implements igm.o, Callback, kfm.o, fgm.p, ITaskMonitor, OnCompleteListener, yl0.a, zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f262806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f262807c;

    public /* synthetic */ e3(Object obj2, Object obj3, int i) {
        this.f262805a = i;
        this.f262806b = obj2;
        this.f262807c = obj3;
    }

    @Override // yl0.a
    public rm0.i a() {
        return ((dn0.b) this.f262806b).b((hn0.e) this.f262807c);
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f262805a) {
            case 0:
                Object objApply = ((igm.o) this.f262807c).apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                return new f1((ObservableSource) objApply, new ryc.a((igm.c) this.f262806b, obj2), 3);
            default:
                return ((kfm.c) this.f262806b).apply(this.f262807c, obj2);
        }
    }

    public efm.b b(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        zr8.h hVar = (zr8.h) ((zr8.b) this.f262806b);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        pfm.a aVarE = hVar.f.j(requestId).e(hVar.a(requestId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        efm.b bVarH = aVarE.h(sjg.a.b((eli.j) this.f262807c));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        return bVarH;
    }

    public yb.q c() {
        return new yb.q((byte[]) this.f262806b, (byte[]) this.f262807c);
    }

    public List d() {
        return (ArrayList) this.f262806b;
    }

    public Class e() {
        return (Class) this.f262807c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState r9, com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.e3.f(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState, com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List g(wp9.v domainState) throws Throwable {
        Object objA;
        Iterable iterableC;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wp9.x xVar = domainState.f299205g;
        if (xVar.f299207a.isEmpty()) {
            zp9.g gVar = (zp9.g) this.f262807c;
            int i = 52;
            Integer num = null;
            ComplexImage.Regular regular = new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_16_list_number, (Integer) null, num, (Integer) (null == true ? 1 : 0), (List) (null == true ? 1 : 0), new ImageTransformations(num, null, null, null, null, i, i, 31), (Clause) (null == true ? 1 : 0), 190));
            zj zjVar = zj.AVATAR;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.split_bill_summary_itemize_empty_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.split_bill_summary_itemize_empty_subtitle, null, null, 14);
            com.revolut.core.ui_kit.delegates.l6 l6Var = new com.revolut.core.ui_kit.delegates.l6(12, new TextLocalisedClause(R$string.split_bill_summary_itemize_empty_action_enter, null, null, 14), null, ms0.h4.SEMIACCENT);
            Collection collection = gVar.f324205a.f79201h;
            if (collection == null) {
                collection = zhm.f0.f322471a;
            }
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ITEMIZATION_EMPTY_STATE_ID", textLocalisedClause, textLocalisedClause2, regular, !collection.isEmpty() ? l6Var : new com.revolut.core.ui_kit.delegates.m6(new com.revolut.core.ui_kit.delegates.l6(12, new TextLocalisedClause(R$string.split_bill_summary_itemize_empty_action_scan, null, null, 14), null, ms0.h4.ACCENT), l6Var), zjVar, false, null, null, null, 1856);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        zp9.j jVar = (zp9.j) this.f262806b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = xVar.f299207a;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            objA = com.revolut.feature.payments.bills_chooser.api.common.a.c(jVar.f324207b.f79198b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        xi0.b bVar = (xi0.b) objA;
        if (bVar == null) {
            return zhm.f0.f322471a;
        }
        List listX7 = domainState.d.getF79224b();
        int iB = zhm.q0.b(zhm.w.t(listX7, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : listX7) {
            linkedHashMap.put(((SplitMemberType) obj2).O7(), obj2);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
            SplitBillItem splitBillItem = (SplitBillItem) it8.next();
            Set set = splitBillItem.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = set.iterator();
            while (it9.hasNext()) {
                SplitMemberType splitMemberType = (SplitMemberType) linkedHashMap.get((String) it9.next());
                if (splitMemberType != null) {
                    arrayList2.add(splitMemberType);
                }
            }
            arrayList.add(new RowDelegate.Model(splitBillItem.f79225a, null, new TextClause(splitBillItem.f79226b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new MoneyClause(new dj0.d(splitBillItem.f79227c, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null == true ? 1 : 0, null, 12), null, null, 0, new tf(new yy0.h(new TextLocalisedClause(R$string.split_bill_itemize_assign_payer_screen_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_add_contact, (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), true, null, false, null, null, null, jVar.f324206a.a(arrayList2), null, null, splitBillItem, null, 0, 0, 0, 0, 532149210));
            bVar = bVar;
            list = list;
        }
        boolean z = false;
        ArrayList arrayListG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("ITEMIZATION_ITEMS_HEADER", (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.split_bill_summary_itemize_header_title, Integer.valueOf(list.size()), (List) null, (Style) null, 28), (Image) null, (Clause) new TextLocalisedClause(R$string.split_bill_summary_itemize_header_action, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), null, 0, 0, 126);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ItemizedBillData.ScanData scanData = xVar.f299208b;
        if (scanData == null || !scanData.f79183c) {
            iterableC = zhm.f0.f322471a;
        } else {
            RowDelegate.Model model2 = new RowDelegate.Model("ITEMIZATION_DISCOUNT_BANNER", null, new TextLocalisedClause(R$string.split_bill_summary_itemize_discount_banner_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.split_bill_summary_itemize_discount_banner_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            iterableC = zhm.u.c(model2);
        }
        return zhm.d0.E0(iterableC, arrayListG);
    }

    public efm.r h(cl3.c[] useGroups) {
        Intrinsics.checkNotNullParameter(useGroups, "useGroups");
        efm.r rVarSwitchMap = ((ihm.j) this.f262807c).distinctUntilChanged().switchMap(new wl3.b(new wg2.g(this, useGroups, 15), 7));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        defpackage.u1 u1Var = (defpackage.u1) this.f262807c;
        int i = defpackage.r1.f250807a[taskEvent.ordinal()];
        if (i == 1) {
            u1Var.d = (defpackage.c) this.f262806b;
            u1Var.notifyMonitor(TaskEvent.FAILED, this);
        } else {
            if (i != 2) {
                return;
            }
            u1Var.getClass();
            u1Var.notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
        }
    }

    public efm.r i(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return nim.a.w(((ypg.p) ((ppg.b) this.f262806b)).i(vaultId), new tjf.e(this, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(s0h.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vbh.a
            if (r0 == 0) goto L13
            r0 = r7
            vbh.a r0 = (vbh.a) r0
            int r1 = r0.f287527w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287527w = r1
            goto L18
        L13:
            vbh.a r0 = new vbh.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287527w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L75
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            zel.f r7 = r6.f258958a
            java.lang.Object r2 = r5.f262807c
            gte.a r2 = (gte.a) r2
            com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection r4 = com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r4)
            if (r2 != 0) goto L59
            java.lang.String r7 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            com.revolut.feature.wealth.api.declaration.PopularAssetsDestination r7 = new com.revolut.feature.wealth.api.declaration.PopularAssetsDestination
            mzg.d r0 = mzg.d.STOCKS
            zel.f r6 = r6.f258958a
            java.util.List r6 = kp0.w0.q(r6)
            r7.<init>(r0, r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r7)
            return r6
        L59:
            java.lang.Object r6 = r5.f262806b
            su9.c r6 = (su9.c) r6
            wgl.a r2 = new wgl.a
            r2.<init>(r7)
            vkm.d r6 = r6.h(r2)
            r7 = 3
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r2, r7)
            r0.f287527w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r7 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r7
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination r6 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination
            java.lang.String r0 = r7.f105154a
            r6.<init>(r0, r7)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.e3.j(s0h.a, gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        ((yrb.g) this.f262806b).e.g3(formattedValue, z, (yrb.u) this.f262807c);
    }

    public void l(byte[] bArr) {
        this.f262806b = bArr;
    }

    public void m(byte[] bArr) {
        this.f262807c = bArr;
    }

    public efm.r n(List list, Set set) {
        e9h.d dVar = (e9h.d) this.f262807c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new vel.g(((xzg.f0) it8.next()).f309988a, vel.h.STOCK, (dj0.d) null, 12));
        }
        return nim.a.w(h0h.b.a(dVar, arrayList, h0h.a.ONE_DAY, set, false, 8), new x8h.h(11));
    }

    public k9.k o(JavaType javaType) {
        k9.k kVar;
        synchronized (this) {
            kVar = (k9.k) ((HashMap) this.f262806b).get(new x9.s(javaType));
        }
        return kVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        wc.c cVar = (wc.c) this.f262806b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f262807c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        ((fgm.p) this.f262807c).onError(th10);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable throwable) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Callback callback = (Callback) this.f262806b;
        if (((sz3.a) this.f262807c).f266748b.a(throwable)) {
            throwable = new CreditApplicationException(throwable);
        }
        callback.onFailure(call, throwable);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Callback callback = (Callback) this.f262806b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            callback.onResponse(call, response);
            return;
        }
        Throwable httpException = new HttpException(response);
        if (((sz3.a) this.f262807c).f266748b.a(httpException)) {
            httpException = new CreditApplicationException(httpException);
        }
        callback.onFailure(call, httpException);
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        jgm.b.c((tgm.f) this.f262806b, disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((fgm.p) this.f262807c).onSuccess(obj2);
    }

    public k9.k p(Class cls) {
        k9.k kVar;
        synchronized (this) {
            kVar = (k9.k) ((HashMap) this.f262806b).get(new x9.s(cls, false));
        }
        return kVar;
    }

    public e3(defpackage.u1 u1Var, defpackage.c cVar) {
        this.f262805a = 11;
        this.f262806b = cVar;
        this.f262807c = u1Var;
    }

    public e3(zp9.j itemizationItemsMapper, zp9.g itemizationEmptyStateMapper) {
        this.f262805a = 22;
        Intrinsics.checkNotNullParameter(itemizationItemsMapper, "itemizationItemsMapper");
        Intrinsics.checkNotNullParameter(itemizationEmptyStateMapper, "itemizationEmptyStateMapper");
        this.f262806b = itemizationItemsMapper;
        this.f262807c = itemizationEmptyStateMapper;
    }

    public e3(n4j.h fieldDefinitionTransformer, x3j.b routePatcher) {
        this.f262805a = 14;
        Intrinsics.checkNotNullParameter(fieldDefinitionTransformer, "fieldDefinitionTransformer");
        Intrinsics.checkNotNullParameter(routePatcher, "routePatcher");
        this.f262806b = fieldDefinitionTransformer;
        this.f262807c = routePatcher;
    }

    public e3(dn0.b signatureProvider, hn0.e alias) {
        this.f262805a = 18;
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f262806b = signatureProvider;
        this.f262807c = alias;
    }

    public e3(ppg.b vaultsInteractor, kpg.a vaultProductAccountsNavigationProvider) {
        this.f262805a = 5;
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(vaultProductAccountsNavigationProvider, "vaultProductAccountsNavigationProvider");
        this.f262806b = vaultsInteractor;
        this.f262807c = vaultProductAccountsNavigationProvider;
    }

    public e3(f01.c uiKitResources, t70.b currenciesLocalization) {
        this.f262805a = 7;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f262806b = uiKitResources;
        this.f262807c = currenciesLocalization;
    }

    public e3(y2i.c tpslDetailsItemsDelegate, u2i.k bannerManager, y2i.d mapper) {
        this.f262805a = 20;
        Intrinsics.checkNotNullParameter(tpslDetailsItemsDelegate, "tpslDetailsItemsDelegate");
        Intrinsics.checkNotNullParameter(bannerManager, "bannerManager");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f262806b = tpslDetailsItemsDelegate;
        this.f262807c = bannerManager;
    }

    public e3(zr8.b repository, eli.j twoFaErrorHandler) {
        this.f262805a = 8;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f262806b = repository;
        this.f262807c = twoFaErrorHandler;
    }

    public e3(e8h.u popularFirstBuyRepository, e9h.d performanceAssetsTransformer) {
        this.f262805a = 15;
        Intrinsics.checkNotNullParameter(popularFirstBuyRepository, "popularFirstBuyRepository");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        this.f262806b = popularFirstBuyRepository;
        this.f262807c = performanceAssetsTransformer;
    }

    public e3(cl3.a contactsInteractor) {
        this.f262805a = 13;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f262806b = contactsInteractor;
        ihm.j jVarD = ihm.b.e(new cl3.d("")).d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f262807c = jVarD;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
    }

    public e3(m0k.a instrumentScopedSymbolsInteractor, ImmutableSet trendPreviewProviders) {
        this.f262805a = 16;
        Intrinsics.checkNotNullParameter(instrumentScopedSymbolsInteractor, "instrumentScopedSymbolsInteractor");
        Intrinsics.checkNotNullParameter(trendPreviewProviders, "trendPreviewProviders");
        this.f262806b = instrumentScopedSymbolsInteractor;
        this.f262807c = trendPreviewProviders;
    }

    public e3(g26.b assetDetailsInteractor, k18.c deFiAccountsInteractor) {
        this.f262805a = 6;
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        this.f262806b = assetDetailsInteractor;
        this.f262807c = deFiAccountsInteractor;
    }

    public e3(ppk.f ratesInteractor, xua.a recurringPaymentInteractor) {
        this.f262805a = 10;
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f262806b = ratesInteractor;
        this.f262807c = recurringPaymentInteractor;
    }

    public e3(g9h.c assetDetailsNotAvailableProvider, su9.c metaCollectionInteractor, gte.a featureToggleInteractor) {
        this.f262805a = 9;
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f262806b = metaCollectionInteractor;
        this.f262807c = featureToggleInteractor;
    }

    public e3(int i) {
        this.f262805a = i;
        switch (i) {
            case 17:
                break;
            default:
                this.f262806b = new HashMap(64);
                this.f262807c = new AtomicReference();
                break;
        }
    }

    public e3(ArrayList parameters, Class cls) {
        this.f262805a = 21;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f262806b = parameters;
        this.f262807c = cls;
    }
}
