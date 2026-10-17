package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.junior.account_activation.impl.R$string;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreenContract$ModalStep;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.a;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import fad.i;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mx5.g;
import n68.k;
import n68.o;
import n68.p;
import n68.r;
import n68.t;
import n68.x;
import oki.h;
import rh8.o0;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends r {
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f76690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i68.b f76691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f76692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vh8.c f76693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f76694t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76695w;

    public c(o inputData, j60.a bottomDialogExtension, i68.b pickerDialogProvider, o0 juniorTermsProvider, vh8.c onboardingConfigurationProvider, f userInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(pickerDialogProvider, "pickerDialogProvider");
        Intrinsics.checkNotNullParameter(juniorTermsProvider, "juniorTermsProvider");
        Intrinsics.checkNotNullParameter(onboardingConfigurationProvider, "onboardingConfigurationProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f76690p = bottomDialogExtension;
        this.f76691q = pickerDialogProvider;
        this.f76692r = juniorTermsProvider;
        this.f76693s = onboardingConfigurationProvider;
        this.f76694t = userInteractor;
        this.u = new vii.b();
        this.v = mra.d.b(this, new k(inputData.f212729a, inputData.f212730b, inputData.f212731c, inputData.d, inputData.e, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, new n68.a(), false, 8);
        this.f76695w = e.a(this, new mz3.r(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new mk0.f(continuation, this, 17)), null, null, new g(this, continuation, 20), 3);
    }

    @Override // n68.r
    public final void I2() {
        OnboardingTerms onboardingTerms = ((k) ((j2) this.v.f22677a).getValue()).f;
        if (onboardingTerms == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot approve activation request. Onboarding terms are not provided");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (onboardingTerms.f76954a) {
            C2(new n68.q(R2()));
        } else {
            C2(new p(R2()));
        }
    }

    @Override // n68.r
    public final void J2(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_BUTTON_CONFIRM_TERMS")) {
            j60.a.v(this.f76690p, false, null, 3);
            C2(new p(R2()));
        } else {
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException(j6.a.q("Cannot handle bottom dialog button with id ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, noWhenBranchMatchedException, h0Var);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76695w;
    }

    @Override // n68.r
    public final void K2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int i = 0;
        if (a0.H(str, "ID_GENDER_PICKER_ITEM_", false)) {
            H2(this.v, new t(model, i));
            j60.a.v(this.f76690p, false, null, 3);
        } else {
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException("Cannot handle bottom dialog item with id ".concat(str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, noWhenBranchMatchedException, h0Var);
        }
    }

    @Override // n68.r
    public final void L2(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51781a;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        if (iHashCode == -1450446825) {
            if (str.equals("ID_FULL_NAME")) {
                n2(new x(this, continuation, 0), new whi.b(6));
                return;
            }
            return;
        }
        if (iHashCode == -863925983) {
            if (str.equals("ID_BIRTHDAY")) {
                h.v2(this.f76695w, new ActivationRequestScreenContract$ModalStep.EditBirthDate(((k) ((j2) this.v.f22677a).getValue()).f212723c), ModalDestination.Style.POPUP.f98311a);
                return;
            }
            return;
        }
        if (iHashCode == -35883419 && str.equals("ID_GENDER")) {
            Object obj2 = model.f51787l;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.gender.Gender");
            bj0.b currentGender = (bj0.b) obj2;
            i68.d dVar = (i68.d) this.f76691q;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(currentGender, "currentGender");
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.junior_signup_details_activation_gender, null, null, 14), new TextLocalisedClause(R$string.junior_signup_details_activation_gender_hint, null, null, 14), null, 28);
            rp0.l lVar = rp0.l.WINDOW;
            List<bj0.b> listN0 = kotlin.collections.d.n0(new i(dVar, 23), bj0.b.values());
            ArrayList arrayList = new ArrayList(w.t(listN0, 10));
            for (bj0.b bVar : listN0) {
                String strQ = j6.a.q("ID_GENDER_PICKER_ITEM_", bVar.name());
                CompositeClause compositeClause = new CompositeClause(u.c(h68.b.a(bVar)), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 10);
                boolean z = bVar == currentGender;
                arrayList.add(new RowDelegate.Model(strQ, null, compositeClause, null, 0, null, null, null, 0, z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, false, null, z, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532667386));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            this.f76690p.x(new rp0.y(arrayList, tVar, lVar, null, null, null, 1016));
        }
    }

    @Override // n68.r
    public final void M2(SelectableDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = ((TextDelegate.Model) model.f53305b).f53531a;
        y yVar = this.v;
        List list = (List) ((k) ((j2) yVar.f22677a).getValue()).f212725h.getContent();
        if (list == null) {
            throw new IllegalStateException(a10.b.s("Cannot update checkbox state for ", str, ". Checkboxes are not initialised"));
        }
        if (list.isEmpty()) {
            throw new IllegalStateException(a10.b.s("Cannot update checkbox state for ", str, ". Checkboxes are empty"));
        }
        List<ActivationRequestScreenContract$MandatoryCheckbox> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ActivationRequestScreenContract$MandatoryCheckbox activationRequestScreenContract$MandatoryCheckbox : list2) {
            if (activationRequestScreenContract$MandatoryCheckbox.f76675a.f76669a.equals(str)) {
                boolean z = !activationRequestScreenContract$MandatoryCheckbox.f76676b;
                ActivationRequestScreenContract$CheckboxData checkboxData = activationRequestScreenContract$MandatoryCheckbox.f76675a;
                Intrinsics.checkNotNullParameter(checkboxData, "checkboxData");
                activationRequestScreenContract$MandatoryCheckbox = new ActivationRequestScreenContract$MandatoryCheckbox(checkboxData, z);
            }
            arrayList.add(activationRequestScreenContract$MandatoryCheckbox);
        }
        H2(yVar, new jeg.i(16, arrayList));
    }

    @Override // n68.r
    public final void N2() {
        C2(a.C0509a.f76686a);
    }

    @Override // n68.r
    public final void O2() {
        this.u.a();
    }

    @Override // yji.l
    public final void P1() {
        j60.a.v(this.f76690p, false, null, 3);
    }

    @Override // n68.r
    public final void P2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            throw new IllegalArgumentException(j6.a.s("Cannot handle click on terms id=", clickData.f275445a, ", text=", clickData.f275446b, ". Parcel is not a valid link."));
        }
        C1(new ExternalDestination.Browser(str, null));
    }

    public final ArrayList Q2(List list) {
        Object next;
        Iterable iterable = (List) ((k) ((j2) this.v.f22677a).getValue()).f212725h.getContent();
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        List<ActivationRequestScreenContract$CheckboxData> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ActivationRequestScreenContract$CheckboxData activationRequestScreenContract$CheckboxData : list2) {
            Iterator it8 = iterable.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((ActivationRequestScreenContract$MandatoryCheckbox) next).f76675a.f76669a.equals(activationRequestScreenContract$CheckboxData.f76669a)) {
                    break;
                }
            }
            ActivationRequestScreenContract$MandatoryCheckbox activationRequestScreenContract$MandatoryCheckbox = (ActivationRequestScreenContract$MandatoryCheckbox) next;
            arrayList.add(new ActivationRequestScreenContract$MandatoryCheckbox(activationRequestScreenContract$CheckboxData, activationRequestScreenContract$MandatoryCheckbox != null ? activationRequestScreenContract$MandatoryCheckbox.f76676b : this.o.e));
        }
        return arrayList;
    }

    public final JuniorAccountActivationFeatureConfig.Request.InputState R2() {
        y yVar = this.v;
        String str = ((k) ((j2) yVar.f22677a).getValue()).f212721a;
        j2 j2Var = (j2) yVar.f22677a;
        return new JuniorAccountActivationFeatureConfig.Request.InputState(str, ((k) j2Var.getValue()).f212722b, ((k) j2Var.getValue()).f212723c, null, ((k) j2Var.getValue()).d, ((k) j2Var.getValue()).e);
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.v;
        if (((k) ((j2) yVar.f22677a).getValue()).e) {
            H2(yVar, new n5k.c(9));
            C2(new p(R2()));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
