package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$ModalStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import cq9.m;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n09.j0;
import n33.v0;
import n3j.b0;
import n3j.c0;
import n3j.l;
import n3j.n;
import n3j.r;
import n3j.v;
import n3j.w;
import n3j.x;
import n4j.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sgm.e3;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements r {

    @NotNull
    public static final v Companion = new v();
    public final q3j.c A;
    public final n60.a B;
    public final g4j.a C;
    public final AccountFieldsScreenContract$InputData D;
    public final d4j.c E;
    public final q3j.h F;
    public final al9.a G;
    public final ry9.a H;
    public final r3j.a I;
    public final z1 J;
    public final y K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public final p3j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f99685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t3j.c f99686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u3j.b f99687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e3 f99688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s3j.d f99689t;
    public final v3j.b u;
    public final w3j.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v3j.a f99690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y3j.b f99691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a4j.a f99692y;
    public final ldd.b z;

    public d(p3j.b accountFieldsDelegate, i modalScreenDataProvider, t3j.c countryChangeDelegate, u3j.b currencyChangeDelegate, e3 routeChangeDelegate, s3j.d accountTypeDelegate, v3j.b searchListSelectionDelegate, w3j.b expansionFieldChangeDelegate, v3j.a definitionSelectorDelegate, y3j.b maskedInputChangeExtension, a4j.a unmaskedInputChangeDelegate, ldd.b focusRequesterDelegate, q3j.c bankInformationDelegate, n60.a keyboardControllerExtension, g4j.a dialogsExtension, AccountFieldsScreenContract$InputData inputData, d4j.c beneficiarySuggestionsDataDelegate, q3j.h validFieldsDelegate, al9.a payWithPhotoExtension, ry9.a bankTransferClipboardExtension, r3j.a clipboardPrefillDelegate, m stateMapper) {
        Intrinsics.checkNotNullParameter(accountFieldsDelegate, "accountFieldsDelegate");
        Intrinsics.checkNotNullParameter(modalScreenDataProvider, "modalScreenDataProvider");
        Intrinsics.checkNotNullParameter(countryChangeDelegate, "countryChangeDelegate");
        Intrinsics.checkNotNullParameter(currencyChangeDelegate, "currencyChangeDelegate");
        Intrinsics.checkNotNullParameter(routeChangeDelegate, "routeChangeDelegate");
        Intrinsics.checkNotNullParameter(accountTypeDelegate, "accountTypeDelegate");
        Intrinsics.checkNotNullParameter(searchListSelectionDelegate, "searchListSelectionDelegate");
        Intrinsics.checkNotNullParameter(expansionFieldChangeDelegate, "expansionFieldChangeDelegate");
        Intrinsics.checkNotNullParameter(definitionSelectorDelegate, "definitionSelectorDelegate");
        Intrinsics.checkNotNullParameter(maskedInputChangeExtension, "maskedInputChangeExtension");
        Intrinsics.checkNotNullParameter(unmaskedInputChangeDelegate, "unmaskedInputChangeDelegate");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(bankInformationDelegate, "bankInformationDelegate");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(dialogsExtension, "dialogsExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsDataDelegate, "beneficiarySuggestionsDataDelegate");
        Intrinsics.checkNotNullParameter(validFieldsDelegate, "validFieldsDelegate");
        Intrinsics.checkNotNullParameter(payWithPhotoExtension, "payWithPhotoExtension");
        Intrinsics.checkNotNullParameter(bankTransferClipboardExtension, "bankTransferClipboardExtension");
        Intrinsics.checkNotNullParameter(clipboardPrefillDelegate, "clipboardPrefillDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = accountFieldsDelegate;
        this.f99685p = modalScreenDataProvider;
        this.f99686q = countryChangeDelegate;
        this.f99687r = currencyChangeDelegate;
        this.f99688s = routeChangeDelegate;
        this.f99689t = accountTypeDelegate;
        this.u = searchListSelectionDelegate;
        this.v = expansionFieldChangeDelegate;
        this.f99690w = definitionSelectorDelegate;
        this.f99691x = maskedInputChangeExtension;
        this.f99692y = unmaskedInputChangeDelegate;
        this.z = focusRequesterDelegate;
        this.A = bankInformationDelegate;
        this.B = keyboardControllerExtension;
        this.C = dialogsExtension;
        this.D = inputData;
        this.E = beneficiarySuggestionsDataDelegate;
        this.F = validFieldsDelegate;
        this.G = payWithPhotoExtension;
        this.H = bankTransferClipboardExtension;
        this.I = clipboardPrefillDelegate;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.J = z1VarB;
        Data data = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.K = mra.d.b(this, new n(data, null, 0, new Data(od0.i.f224256b, null, false, 6, null), false, f0.f322471a), stateMapper, null, false, 12);
        this.L = e.a(this, new mz3.r(this, 14));
    }

    public static final void I2(d dVar, BeneficiaryInfoState beneficiaryInfoState) {
        y yVar = dVar.K;
        l lVar = (l) ((n) ((j2) yVar.f22677a).getValue()).f212146a.getContent();
        if (lVar == null) {
            return;
        }
        dVar.H2(yVar, new j0(lVar, beneficiaryInfoState, 25));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.J, new x(0, this, continuation)), null, null, new n3j.y(0, this, continuation), 3);
    }

    public final void J2(Object obj2) {
        boolean z = obj2 instanceof Field$Currency;
        ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.L;
        if (z) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.CurrencyPicker((Field$Currency) obj2), fullscreen_slide_from_bottom);
            return;
        }
        if (obj2 instanceof Field$Country) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.CountryPicker((Field$Country) obj2), fullscreen_slide_from_bottom);
            return;
        }
        boolean z3 = obj2 instanceof Field$RouteSelector;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z3) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.RouteSelector((Field$RouteSelector) obj2), bottom_dialog);
            return;
        }
        if (obj2 instanceof Field$BackendDefinition.DropdownDefinition) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.DefinitionSelector((Field$BackendDefinition.DropdownDefinition) obj2), bottom_dialog);
        } else if (obj2 instanceof Field$BackendDefinition.SearchList) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.SearchList((Field$BackendDefinition.SearchList) obj2), fullscreen_slide_from_bottom);
        } else if (obj2 instanceof Field$ExpansionDefinition) {
            h.v2(aVar, new AccountFieldsScreenContract$ModalStep.ExpansionSelector((Field$ExpansionDefinition) obj2), bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    public final BeneficiaryInfoState K2() {
        l lVar = (l) ((n) ((j2) this.K.f22677a).getValue()).f212146a.getContent();
        BeneficiaryInfoState beneficiaryInfoState = lVar != null ? lVar.f212142a : null;
        if (beneficiaryInfoState != null) {
            return beneficiaryInfoState;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void L2(Function1 function1) {
        l2(new w(this, (Continuation) null, function1), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        v0 v0Var = new v0(17);
        y yVar = this.K;
        Continuation continuation = null;
        yji.l.b1(this, q.Q(yVar.B(v0Var), new x(3, this, continuation)), null, new c0(this, null), 3);
        int i = 1;
        yji.l.b1(this, q.Q(yVar.B(new v0(16)), new x(i, this, continuation)), null, new n3j.y(i, this, continuation), 3);
        int i2 = 2;
        yji.l.b1(this, q.Q(yVar.B(new v0(15)), new x(i2, this, continuation)), null, new n3j.y(i2, this, continuation), 3);
        yji.l.b1(this, this.H.Z2(), null, new b0(this, null), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.K;
    }
}
