package uz7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$CoPaySelection;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$ExcessSelection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import uyd.z;
import zhm.d0;
import zhm.h0;
import zw7.g0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends ori.a implements a, fy7.d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g0 f284610j = g0.BASIC;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f284611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.f f284612c;
    public final fx7.a d;
    public final c e;
    public final l08.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f284613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fy7.d f284614h;
    public final ihm.b i;

    public p(ifm.b flowDisposable, fx7.f petInteractor, fx7.a petAnalyticsInteractor, c state, l08.a petLocalDocumentProvider, v petPlanQuotesConfigurator, fy7.d petDatePickerActionPresentationModel) {
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petLocalDocumentProvider, "petLocalDocumentProvider");
        Intrinsics.checkNotNullParameter(petPlanQuotesConfigurator, "petPlanQuotesConfigurator");
        Intrinsics.checkNotNullParameter(petDatePickerActionPresentationModel, "petDatePickerActionPresentationModel");
        this.f284611b = flowDisposable;
        this.f284612c = petInteractor;
        this.d = petAnalyticsInteractor;
        this.e = state;
        this.f = petLocalDocumentProvider;
        this.f284613g = petPlanQuotesConfigurator;
        this.f284614h = petDatePickerActionPresentationModel;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.i = bVarE;
    }

    @Override // fy7.d
    public final efm.b A0(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return this.f284614h.A0(date);
    }

    @Override // ori.a, nri.a
    public final void i3() {
        efm.b bVarIgnoreElements;
        ofm.h hVarW;
        r rVar = (r) this.e;
        Object objO = w.O(rVar.D0());
        if (objO != null) {
            efm.b bVarSwitchMapCompletable = m70.a.g(o3(), null, null, 3).map(new z(25, new uo7.k((String) objO, 9))).switchMapCompletable(new z(26, new e(this, 2)));
            Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
            pfm.a aVar = new pfm.a(ue0.e.r(bVarSwitchMapCompletable, h0.f322473a), new o0(21, new up5.s(new BreadcrumbException(), 18)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            hVarW = aVar.w(new twl.o(3, k.f284605a), j.f284604a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        } else {
            te0.e eVarC0 = rVar.C0();
            Intrinsics.checkNotNullParameter(eVarC0, "<this>");
            g0 value = f284610j;
            Intrinsics.checkNotNullParameter(value, "value");
            if (eVarC0.isInitialized()) {
                bVarIgnoreElements = pfm.m.f235744a;
            } else {
                bVarIgnoreElements = eVarC0.b(value).ignoreElements();
                Intrinsics.h(bVarIgnoreElements);
            }
            pfm.a aVar2 = new pfm.a(bVarIgnoreElements, new o0(21, new up5.s(new BreadcrumbException(), 19)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            hVarW = aVar2.w(new twl.o(3, m.f284607a), l.f284606a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        }
        ifm.b bVar = this.f284611b;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = m70.a.g(q3(), null, new uyh.s(8), 1).switchMapCompletable(new z(24, new e(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        pfm.a aVar3 = new pfm.a(ue0.e.r(bVarSwitchMapCompletable2, h0.f322473a), new o0(21, new up5.s(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new twl.o(3, o.f284609a), n.f284608a);
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }

    public final String j3(zw7.m mVar) {
        zw7.o oVar = mVar.f325815b;
        String str = mVar.f325816c;
        int i = h.f284601b[oVar.ordinal()];
        if (i == 1) {
            return this.f284612c.b(str);
        }
        if (i == 2 || i == 3) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final h1 k3(zw7.h0 plan, PetPlanBuilderContract$ExcessSelection selectedExcess, PetPlanBuilderContract$CoPaySelection selectedCoPay) {
        Object next;
        h1 h1Var;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(selectedExcess, "selectedExcess");
        Intrinsics.checkNotNullParameter(selectedCoPay, "selectedCoPay");
        this.f284613g.getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(selectedExcess, "selectedExcess");
        Intrinsics.checkNotNullParameter(selectedCoPay, "selectedCoPay");
        kotlin.text.m mVarC = v.c(plan);
        List listB = v.b(plan);
        ArrayList arrayList = plan.e;
        if (arrayList.size() <= 1) {
            h1Var = (h1) d0.d0(arrayList);
        } else {
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                h1 h1Var2 = (h1) next;
                if (Intrinsics.f(h1Var2.f325793c, mVarC.get(selectedExcess.f76380a)) && Intrinsics.f(h1Var2.d, listB.get(selectedCoPay.f76372a))) {
                    break;
                }
            }
            h1Var = (h1) next;
        }
        if (h1Var == null) {
            return null;
        }
        ((r) this.e).D0().set(h1Var.f325791a);
        return h1Var;
    }

    public final String l3() {
        return (String) ((r) this.e).x0().get();
    }

    public final zw7.h0 m3(List plans) {
        Object next;
        Intrinsics.checkNotNullParameter(plans, "plans");
        Iterator it8 = plans.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((zw7.h0) next).f325787b == ((r) this.e).C0().get()) {
                break;
            }
        }
        return (zw7.h0) next;
    }

    public final String n3() {
        return (String) w.O(((r) this.e).D0());
    }

    public final efm.r o3() {
        efm.r rVarSwitchMap = w.l(((r) this.e).f284618b.i0().a(), this.i).map(new z(29, new uyh.t(4))).switchMap(new f(0, new e(this, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.q(rVarSwitchMap, h0.f322473a);
    }

    public final efm.r p3() {
        efm.r rVarFlatMap = ((r) this.e).x0().c(te0.s.f270018a).flatMap(new f(1, new e(this, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final efm.r q3() {
        efm.r rVarFlatMap = o3().flatMap(new z(27, new e(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        efm.r map = rVarFlatMap.map(new o0(21, new i(this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // fy7.d
    public final efm.b s2() {
        return this.f284614h.s2();
    }

    @Override // fy7.d
    public final efm.r u0() {
        return this.f284614h.u0();
    }
}
