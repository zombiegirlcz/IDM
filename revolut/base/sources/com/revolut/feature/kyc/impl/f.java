package com.revolut.feature.kyc.impl;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import cu8.e1;
import cu8.f1;
import cu8.g1;
import cu8.i1;
import cu8.j1;
import cu8.k1;
import cu8.n;
import cu8.n1;
import cu8.t0;
import cu8.u;
import cu8.u0;
import cu8.v0;
import cu8.x0;
import cu8.y0;
import efm.d0;
import efm.r;
import ihm.j;
import ihm.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import my8.i;
import my8.l;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.m;
import rp0.t;
import rp0.y;
import te0.s;
import te0.w;
import wli.x;
import zhm.a1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends nri.a implements i1 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f77667m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f77668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f77669c;
    public final ifm.b d;
    public final wm.e e;
    public final e1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1 f77670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tu8.d f77671h;
    public final g3l.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f77672j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f77673l;

    static {
        p0 p0Var = o0.f186429a;
        f77667m = r0.k(new Pair(p0Var.b(KycScreenContract$Step.RemoteDocs.class), 0), new Pair(p0Var.b(KycScreenContract$Step.MoreDocs.class), 1));
    }

    public f(j1 state, g1 presentationModel, ifm.b compositeDisposable, wm.e expandableDialogActionDispatcher, e1 kycAutomaticEventsConfigurationProvider, f1 kycNavigationProvider, tu8.d kycCommonConsentUiProvider, g3l.a statusDialogViewConfigurationDispatcher, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(kycAutomaticEventsConfigurationProvider, "kycAutomaticEventsConfigurationProvider");
        Intrinsics.checkNotNullParameter(kycNavigationProvider, "kycNavigationProvider");
        Intrinsics.checkNotNullParameter(kycCommonConsentUiProvider, "kycCommonConsentUiProvider");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f77668b = state;
        this.f77669c = presentationModel;
        this.d = compositeDisposable;
        this.e = expandableDialogActionDispatcher;
        this.f = kycAutomaticEventsConfigurationProvider;
        this.f77670g = kycNavigationProvider;
        this.f77671h = kycCommonConsentUiProvider;
        this.i = statusDialogViewConfigurationDispatcher;
        this.f77672j = deeplinkHandler;
        this.k = p.a.D("toSerialized(...)");
        this.f77673l = p.a.D("toSerialized(...)");
    }

    public final efm.b goBack() {
        d0 d0VarFirstOrError = ((b) this.f77669c).r3().flatMapSingle(new n(19, new t0(this, 1))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        n nVar = new n(18, new t0(this, 0));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, nVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // nri.a
    public final void i3() {
        r rVarFilter = w.q0(((b) this.f77669c).r3()).filter(new u0(0, new cs.a(28)));
        int i = 1;
        r rVarFlatMapSingle = rVarFilter.flatMapSingle(new u0(i, new t0(this, 8)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        cn7.c cVar = new cn7.c(i, this.k, k.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 14);
        r rVarOnErrorResumeNext = rVarFlatMapSingle.onErrorResumeNext(new o7.b(new u(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(13, cVar), new a08.r(13, y0.f108912a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.d, cVarSubscribe);
    }

    public final efm.b j3(l lVar) {
        j1 j1Var;
        Object next;
        TextClause textClause;
        if (lVar.k.isEmpty()) {
            return o3(lVar);
        }
        Iterator it8 = lVar.k.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            j1Var = this.f77668b;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it8.next();
            n1 n1Var = (n1) j1Var;
            if (!((Set) n1Var.f108871q.getValue(n1Var, n1.f108861y[16]).get()).contains((i) next)) {
                break;
            }
        }
        i iVar = (i) next;
        if (iVar == null) {
            return o3(lVar);
        }
        String str = iVar.f210381b;
        my8.a aVar = iVar.f210382c;
        if (aVar != null) {
            String str2 = aVar.f210360a;
            List<my8.u> list = aVar.f210361b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (my8.u uVar : list) {
                String str3 = uVar.f210401b;
                arrayList.add(new TextClause(str3, (Style) new Click(28, (Integer) null, (Object) uVar, j6.a.q("clickIdHints_", str3), false), (Integer) null, false, (o9) null, (List) null, 124));
            }
            textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
        } else {
            textClause = null;
        }
        Clause textClause2 = !kotlin.text.d0.W(str) ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.kyc_document_us_visa_disclosure_proceed_title, null, null, 14);
        t tVar = new t(new TextClause(iVar.f210380a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause, null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("click_id_hint_large_button", LargeActionButton.ButtonStyle.f58725a, null, textClause2, false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model, i, i, i2, i2, null, false, 48);
        efm.b bVarC0 = this.e.c0(new wm.c(new y(zhm.u.c(model), tVar, null, null, null, null, 1020)));
        n1 n1Var2 = (n1) j1Var;
        te0.j jVar = n1Var2.f108871q;
        KProperty[] kPropertyArr = n1.f108861y;
        return bVarC0.e(w.z0(jVar.getValue(n1Var2, kPropertyArr[16]), a1.m((Set) n1Var2.f108871q.getValue(n1Var2, kPropertyArr[16]).get(), iVar)));
    }

    public final ufm.i k3() {
        n1 n1Var = (n1) ((b) this.f77669c).e;
        d0 d0VarFirstOrError = n1Var.f108863c.getValue(n1Var, n1.f108861y[1]).c(s.f270018a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        n nVar = new n(23, new cs.a(27));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, nVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final pfm.a l3() {
        d0 d0VarZ0 = ((n1) this.f77668b).z0();
        n nVar = new n(27, new t0(this, 6));
        d0VarZ0.getClass();
        pfm.a aVar = new pfm.a(d0VarZ0, nVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a m3() {
        b bVar = (b) this.f77669c;
        bVar.getClass();
        h hVar = new h(new a08.d(bVar, 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = hVar.e(new h(new ufm.f(k3(), new n(20, new t0(this, 2)), 3), 4));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final efm.b n3(my8.s submissionResult) {
        Intrinsics.checkNotNullParameter(submissionResult, "submissionResult");
        int i = x0.f108909a[submissionResult.f210398a.ordinal()];
        if (i == 1 || i == 2) {
            m mVar = m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (i != 3) {
            if (i == 4) {
                return (h) ((b) this.f77669c).f77569g.c0(k1.f108851a);
            }
            throw new NoWhenBranchMatchedException();
        }
        Clause textLocalisedClause = submissionResult.f210399b;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.auto_kyc_vendors_reviewing_error_applicant, null, null, 14);
        }
        return this.i.c0(new StatusViewConfiguration.Error("ONFIDO_ERROR_DIALOG_ID", textLocalisedClause, null, null, null, null, null, 8188));
    }

    public final pfm.a o3(l lVar) {
        d0 d0VarFirstOrError = ((b) this.f77669c).v3().firstOrError();
        n nVar = new n(24, new cma.b(this, lVar, 29));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, nVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
