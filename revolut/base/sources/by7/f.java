package by7;

import a08.o0;
import a08.p0;
import aw0.o9;
import bnj.n;
import bs9.i0;
import bxg.t;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackActivity;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration;
import efm.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import okl.m;
import te0.w;
import tx0.j0;
import zh9.u0;
import zhm.d0;
import zhm.u;
import zw7.w0;
import zw7.y0;
import zx7.l;
import zx7.q;
import zx7.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends bsi.a implements i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f19766j;
    public final tpi.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f19767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f19768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iqi.h f19769n;
    public final tri.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ln.a f19770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CancellationFeedbackScreenContract$Configuration f19771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a f19772r;

    public f(q presentationModel, tpi.j progressView, f9b.f errorView, xpi.g navBarWithToolbarView, iqi.h twinVerticalButtonView, tri.c backButtonView, ln.a navigationCommandsDispatcher, CancellationFeedbackScreenContract$Configuration configuration, com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a presenterDelegate) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
        this.f19766j = presentationModel;
        this.k = progressView;
        this.f19767l = errorView;
        this.f19768m = navBarWithToolbarView;
        this.f19769n = twinVerticalButtonView;
        this.o = backButtonView;
        this.f19770p = navigationCommandsDispatcher;
        this.f19771q = configuration;
        this.f19772r = presenterDelegate;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        y0 policyCancellationReasonType;
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        CancellationFeedbackScreenContract$Configuration withConfig = this.f19771q;
        if (withConfig instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
            policyCancellationReasonType = y0.CANCELLATION;
        } else {
            if (!(withConfig instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal)) {
                throw new NoWhenBranchMatchedException();
            }
            policyCancellationReasonType = y0.RENEWAL_OPT_OUT;
        }
        q qVar = this.f19766j;
        qVar.getClass();
        l lVar = qVar.f326086c;
        Intrinsics.checkNotNullParameter(policyCancellationReasonType, "policyCancellationReasonType");
        qVar.e.a(policyCancellationReasonType);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_cancellation_feedback_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f19768m;
        cVar.n0(textLocalisedClause);
        cVar.p0(new TextLocalisedClause(R$string.pets_cancellation_feedback_title, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        cVar.Z(true);
        cVar.c0(j0.MULTILINE);
        cVar.Y(new TextLocalisedClause(R$string.pets_cancellation_feedback_subtitle, u.c(new TextClause(withConfig.getF76254b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        r rVarMerge = r.merge(cVar.Q(), this.o.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        final int i = 0;
        pfm.a aVar2 = new pfm.a(w.D(rVarMerge, new Function1(this) { // from class: by7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f19761b;

            {
                this.f19761b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i) {
                    case 0:
                        return m.w(null, null, null, 7, this.f19761b.f19770p);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar3 = fVar.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig2 = fVar.f19771q;
                        mm.d dVar = aVar3.f76258c;
                        Intrinsics.checkNotNullParameter(withConfig2, "withConfig");
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
                            return dVar.c0(zx7.f.f326073a);
                        }
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                            return dVar.c0(zx7.i.f326077a);
                        }
                        throw new NoWhenBranchMatchedException();
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        f fVar2 = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar4 = fVar2.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig3 = fVar2.f19771q;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(withConfig3, "withConfig");
                        if (!(withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy)) {
                            if (withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                                return ((zx7.r) aVar4.f76257b).f326087a.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        CancellationFeedbackScreenContract$Configuration.CancelPolicy cancelPolicy = (CancellationFeedbackScreenContract$Configuration.CancelPolicy) withConfig3;
                        throw new IllegalStateException(v0.a.i(v0.a.m("Secondary button click is not expected to be handled for CancelPolicy(policyId=", cancelPolicy.f76250a, ", petName=", cancelPolicy.f76251b, ", petId="), cancelPolicy.f76252c, ")"));
                    default:
                        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.i;
                        if (!(obj3 instanceof h)) {
                            throw new IllegalArgumentException(v0.a.h(obj3, "Parcel=", " must be instance of PolicyCancellationReason").toString());
                        }
                        q qVar2 = this.f19761b.f19766j;
                        h feedback = (h) obj3;
                        w0 w0Var = feedback.f19775a;
                        qVar2.getClass();
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        s sVar = (s) qVar2.f326086c;
                        ArrayList arrayListF1 = d0.f1((Collection) sVar.y0().get());
                        Iterator it10 = arrayListF1.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((h) next).f19775a, w0Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        h hVar = (h) next;
                        if (hVar == null) {
                            throw new IllegalStateException(("Feedback reason must be initialised: code=" + w0Var.f325859a + ", name=" + w0Var.f325860b).toString());
                        }
                        boolean z = hVar.f19777c;
                        boolean z3 = !hVar.f19776b;
                        if (z) {
                            te0.e eVarZ0 = sVar.z0();
                            m70.a.c(t0.f186434a);
                            eVarZ0.set("");
                        }
                        int iIndexOf = arrayListF1.indexOf(hVar);
                        w0 reason = hVar.f19775a;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        arrayListF1.set(iIndexOf, new h(reason, z3, z));
                        return w.z0(sVar.y0(), arrayListF1);
                }
            }
        }), new p0(3, new b9i.h(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a08.q qVar2 = new a08.q(12, b.f19762a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(5, sVar), qVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        iqi.b bVar2 = (iqi.b) this.f19769n;
        bVar2.setVisible(true);
        bVar2.a0(new TextLocalisedClause(R$string.pets_cancellation_feedback_confirmation_button, null, null, 14));
        bVar2.Z(false);
        iqi.h hVar = this.f19772r.f76256a;
        Intrinsics.checkNotNullParameter(withConfig, "withConfig");
        if (withConfig instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
            ((iqi.b) hVar).e0(false);
        } else {
            if (!(withConfig instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal)) {
                throw new NoWhenBranchMatchedException();
            }
            iqi.b bVar3 = (iqi.b) hVar;
            bVar3.e0(true);
            bVar3.b0(true);
            bVar3.c0(LargeActionButton.ButtonStyle.f58726b);
            bVar3.d0(new TextLocalisedClause(R$string.pets_renewal_opt_out_feedback_secondary_button_title, null, null, 14));
        }
        final int i2 = 1;
        pfm.a aVar3 = new pfm.a(w.D(bVar2.O(), new Function1(this) { // from class: by7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f19761b;

            {
                this.f19761b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i2) {
                    case 0:
                        return m.w(null, null, null, 7, this.f19761b.f19770p);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar32 = fVar.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig2 = fVar.f19771q;
                        mm.d dVar = aVar32.f76258c;
                        Intrinsics.checkNotNullParameter(withConfig2, "withConfig");
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
                            return dVar.c0(zx7.f.f326073a);
                        }
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                            return dVar.c0(zx7.i.f326077a);
                        }
                        throw new NoWhenBranchMatchedException();
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        f fVar2 = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar4 = fVar2.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig3 = fVar2.f19771q;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(withConfig3, "withConfig");
                        if (!(withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy)) {
                            if (withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                                return ((zx7.r) aVar4.f76257b).f326087a.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        CancellationFeedbackScreenContract$Configuration.CancelPolicy cancelPolicy = (CancellationFeedbackScreenContract$Configuration.CancelPolicy) withConfig3;
                        throw new IllegalStateException(v0.a.i(v0.a.m("Secondary button click is not expected to be handled for CancelPolicy(policyId=", cancelPolicy.f76250a, ", petName=", cancelPolicy.f76251b, ", petId="), cancelPolicy.f76252c, ")"));
                    default:
                        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.i;
                        if (!(obj3 instanceof h)) {
                            throw new IllegalArgumentException(v0.a.h(obj3, "Parcel=", " must be instance of PolicyCancellationReason").toString());
                        }
                        q qVar22 = this.f19761b.f19766j;
                        h feedback = (h) obj3;
                        w0 w0Var = feedback.f19775a;
                        qVar22.getClass();
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        s sVar2 = (s) qVar22.f326086c;
                        ArrayList arrayListF1 = d0.f1((Collection) sVar2.y0().get());
                        Iterator it10 = arrayListF1.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((h) next).f19775a, w0Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        h hVar2 = (h) next;
                        if (hVar2 == null) {
                            throw new IllegalStateException(("Feedback reason must be initialised: code=" + w0Var.f325859a + ", name=" + w0Var.f325860b).toString());
                        }
                        boolean z = hVar2.f19777c;
                        boolean z3 = !hVar2.f19776b;
                        if (z) {
                            te0.e eVarZ0 = sVar2.z0();
                            m70.a.c(t0.f186434a);
                            eVarZ0.set("");
                        }
                        int iIndexOf = arrayListF1.indexOf(hVar2);
                        w0 reason = hVar2.f19775a;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        arrayListF1.set(iIndexOf, new h(reason, z3, z));
                        return w.z0(sVar2.y0(), arrayListF1);
                }
            }
        }), new p0(3, new b9i.h(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(5, sVar), new a08.q(12, d.f19764a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        final int i3 = 2;
        pfm.a aVar4 = new pfm.a(w.D(bVar2.Q(), new Function1(this) { // from class: by7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f19761b;

            {
                this.f19761b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i3) {
                    case 0:
                        return m.w(null, null, null, 7, this.f19761b.f19770p);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar32 = fVar.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig2 = fVar.f19771q;
                        mm.d dVar = aVar32.f76258c;
                        Intrinsics.checkNotNullParameter(withConfig2, "withConfig");
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
                            return dVar.c0(zx7.f.f326073a);
                        }
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                            return dVar.c0(zx7.i.f326077a);
                        }
                        throw new NoWhenBranchMatchedException();
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        f fVar2 = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar42 = fVar2.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig3 = fVar2.f19771q;
                        aVar42.getClass();
                        Intrinsics.checkNotNullParameter(withConfig3, "withConfig");
                        if (!(withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy)) {
                            if (withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                                return ((zx7.r) aVar42.f76257b).f326087a.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        CancellationFeedbackScreenContract$Configuration.CancelPolicy cancelPolicy = (CancellationFeedbackScreenContract$Configuration.CancelPolicy) withConfig3;
                        throw new IllegalStateException(v0.a.i(v0.a.m("Secondary button click is not expected to be handled for CancelPolicy(policyId=", cancelPolicy.f76250a, ", petName=", cancelPolicy.f76251b, ", petId="), cancelPolicy.f76252c, ")"));
                    default:
                        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.i;
                        if (!(obj3 instanceof h)) {
                            throw new IllegalArgumentException(v0.a.h(obj3, "Parcel=", " must be instance of PolicyCancellationReason").toString());
                        }
                        q qVar22 = this.f19761b.f19766j;
                        h feedback = (h) obj3;
                        w0 w0Var = feedback.f19775a;
                        qVar22.getClass();
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        s sVar2 = (s) qVar22.f326086c;
                        ArrayList arrayListF1 = d0.f1((Collection) sVar2.y0().get());
                        Iterator it10 = arrayListF1.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((h) next).f19775a, w0Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        h hVar2 = (h) next;
                        if (hVar2 == null) {
                            throw new IllegalStateException(("Feedback reason must be initialised: code=" + w0Var.f325859a + ", name=" + w0Var.f325860b).toString());
                        }
                        boolean z = hVar2.f19777c;
                        boolean z3 = !hVar2.f19776b;
                        if (z) {
                            te0.e eVarZ0 = sVar2.z0();
                            m70.a.c(t0.f186434a);
                            eVarZ0.set("");
                        }
                        int iIndexOf = arrayListF1.indexOf(hVar2);
                        w0 reason = hVar2.f19775a;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        arrayListF1.set(iIndexOf, new h(reason, z3, z));
                        return w.z0(sVar2.y0(), arrayListF1);
                }
            }
        }), new p0(3, new b9i.h(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(5, sVar), new a08.q(12, e.f19765a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        s sVar2 = (s) lVar;
        te0.e eVarY0 = sVar2.y0();
        te0.s sVar3 = te0.s.f270018a;
        r map = w.l(eVarY0.c(sVar3), sVar2.z0().c(sVar3)).map(new i0(15, new t(this, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarT = mo3.a.t(o70.a.f(map), this.k);
        Intrinsics.h(rVarT);
        r rVarN = hx7.a.N(rVarT, this.f19767l, false, false);
        n nVar = new n(view, this, 29);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new p0(3, new b9i.h(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(5, nVar), new o0(5, sVar), new a08.q(12, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        CancellationFeedbackActivity cancellationFeedbackActivity = (CancellationFeedbackActivity) view;
        final int i5 = 3;
        pfm.a aVar5 = new pfm.a(w.D(((InputChecklistDelegate) cancellationFeedbackActivity.u0.getValue()).f52518c, new Function1(this) { // from class: by7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f19761b;

            {
                this.f19761b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i5) {
                    case 0:
                        return m.w(null, null, null, 7, this.f19761b.f19770p);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar32 = fVar.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig2 = fVar.f19771q;
                        mm.d dVar = aVar32.f76258c;
                        Intrinsics.checkNotNullParameter(withConfig2, "withConfig");
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
                            return dVar.c0(zx7.f.f326073a);
                        }
                        if (withConfig2 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                            return dVar.c0(zx7.i.f326077a);
                        }
                        throw new NoWhenBranchMatchedException();
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        f fVar2 = this.f19761b;
                        com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a aVar42 = fVar2.f19772r;
                        CancellationFeedbackScreenContract$Configuration withConfig3 = fVar2.f19771q;
                        aVar42.getClass();
                        Intrinsics.checkNotNullParameter(withConfig3, "withConfig");
                        if (!(withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy)) {
                            if (withConfig3 instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal) {
                                return ((zx7.r) aVar42.f76257b).f326087a.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        CancellationFeedbackScreenContract$Configuration.CancelPolicy cancelPolicy = (CancellationFeedbackScreenContract$Configuration.CancelPolicy) withConfig3;
                        throw new IllegalStateException(v0.a.i(v0.a.m("Secondary button click is not expected to be handled for CancelPolicy(policyId=", cancelPolicy.f76250a, ", petName=", cancelPolicy.f76251b, ", petId="), cancelPolicy.f76252c, ")"));
                    default:
                        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.i;
                        if (!(obj3 instanceof h)) {
                            throw new IllegalArgumentException(v0.a.h(obj3, "Parcel=", " must be instance of PolicyCancellationReason").toString());
                        }
                        q qVar22 = this.f19761b.f19766j;
                        h feedback = (h) obj3;
                        w0 w0Var = feedback.f19775a;
                        qVar22.getClass();
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        s sVar22 = (s) qVar22.f326086c;
                        ArrayList arrayListF1 = d0.f1((Collection) sVar22.y0().get());
                        Iterator it10 = arrayListF1.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((h) next).f19775a, w0Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        h hVar2 = (h) next;
                        if (hVar2 == null) {
                            throw new IllegalStateException(("Feedback reason must be initialised: code=" + w0Var.f325859a + ", name=" + w0Var.f325860b).toString());
                        }
                        boolean z = hVar2.f19777c;
                        boolean z3 = !hVar2.f19776b;
                        if (z) {
                            te0.e eVarZ0 = sVar22.z0();
                            m70.a.c(t0.f186434a);
                            eVarZ0.set("");
                        }
                        int iIndexOf = arrayListF1.indexOf(hVar2);
                        w0 reason = hVar2.f19775a;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        arrayListF1.set(iIndexOf, new h(reason, z3, z));
                        return w.z0(sVar22.y0(), arrayListF1);
                }
            }
        }), new p0(3, new b9i.h(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(5, sVar), new a08.q(12, c.f19763a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        r map2 = ((InputChecklistDelegate) cancellationFeedbackActivity.u0.getValue()).e.f121375b.map(new i0(16, new t(5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        bwc.i iVar = new bwc.i(1, this.f19766j, q.class, "updateUserInput", "updateUserInput(Ljava/lang/String;)V", 0, 1);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = map2.onErrorResumeNext(new p0(3, new b9i.h(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(5, iVar), new o0(5, sVar), new a08.q(12, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
