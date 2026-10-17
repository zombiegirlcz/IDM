package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import android.os.Parcelable;
import c84.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import cwj.h;
import da4.g;
import dc4.j;
import dc4.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.z;
import uy3.i;
import vkm.j2;
import wli.x;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements dc4.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kx3.a f67782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HomeInsuranceFlowContract$InputData f67783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f67784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f67785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f67786t;
    public final yki.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kx3.a interactor, HomeInsuranceFlowContract$InputData inputData, x deeplinkHandler, g documentsUploadSuccessDialogMapper, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(documentsUploadSuccessDialogMapper, "documentsUploadSuccessDialogMapper");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67782p = interactor;
        this.f67783q = inputData;
        this.f67784r = deeplinkHandler;
        this.f67785s = documentsUploadSuccessDialogMapper;
        this.f67786t = hx7.e.b(this, new HomeInsuranceFlowContract$State(null));
        h hVar = new h(this, 20);
        this.u = cp5.d.a(this, HomeInsuranceFlowContract$Step.Initial.f67776a, f0.f322471a, hVar);
    }

    public static final z P2(e eVar, i iVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_insurance_partner_error_title, u.c(iVar.f284067a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.home_insurance_partner_error_description, u.c(iVar.f284068b), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.home_insurance_partner_error_primary_button, u.c(iVar.f284069c.f284065a), null, 12);
        uy3.h hVar = iVar.d;
        return new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, hVar != null ? new TextLocalisedClause(R$string.home_insurance_partner_error_secondary_button, u.c(hVar.f284065a), null, 12) : null, null, null, false, null, null, null, null, null, null, 32724);
    }

    public static final void Q2(e eVar, n1 n1Var, i iVar) {
        if (n1Var instanceof l1) {
            eVar.R2(iVar.f284069c.f284066b);
            return;
        }
        if (!(n1Var instanceof m1)) {
            if (!(n1Var instanceof k1) && !(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            uy3.h hVar = iVar.d;
            if (hVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            eVar.R2(hVar.f284066b);
        }
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null, 3), new yi5.b(26));
    }

    public final void R2(uy3.g gVar) {
        int i = dc4.h.f112795b[gVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                n2(new j(this, null, 2), new whi.b(6));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                uy3.e eVar = ((HomeInsuranceFlowContract$State) ((j2) this.f67786t.f22677a).getValue()).f67771a;
                if (eVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                T2(eVar.f284062a);
            }
        }
    }

    public final void S2(dc4.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event instanceof dc4.b) {
            l2(new k(this, ((dc4.b) event).f112785a, continuation, 2), new yi5.b(26));
        } else {
            if (!(event instanceof dc4.a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new k(this, ((dc4.a) event).f112784a, continuation, 1), new yi5.b(26));
        }
    }

    public final void T2(String str) {
        pgi.k.Companion.getClass();
        C1(new BridgeDestination(new ActivityNavigateCommand(pgi.h.f235963b, new WebViewContract$WebViewConfiguration(str, (Clause) null, R$drawable.uikit_icn_24_cross, false, false, true, (String) null, (Parcelable) null, "HOME_INSURANCE_PARTNER_WEB_VIEW_FLOW", false, false, (String) null, (String) null, (String) null, false, true, 62874), null, 10, 0, null, null, null, null, false, 1012)));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f67786t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
