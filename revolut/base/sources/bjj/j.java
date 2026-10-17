package bjj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.v1;
import dej.w1;
import dfj.t3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.u1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends f {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t3 f15688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f15689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f15690n;

    public j(t3 purchaseInteractor, k statusDialogProvider) {
        Intrinsics.checkNotNullParameter(purchaseInteractor, "purchaseInteractor");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        this.f15688l = purchaseInteractor;
        this.f15689m = statusDialogProvider;
        this.f15690n = q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    public static final Object c3(j jVar, w1 w1Var, String str, String str2, h hVar) {
        y0 y0Var;
        k kVar = jVar.f15689m;
        if (Intrinsics.f(w1Var, w1.c.f113679a)) {
            kVar.getClass();
            jVar.L2(new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_LOADING_DIALOG", new c0(null, null, null, false, null, false, false, null, 1919), false, 4));
            return Unit.f186387a;
        }
        if (Intrinsics.f(w1Var, w1.b.f113678a)) {
            kVar.getClass();
            Object objCollect = ((rv6.e) jVar.L2(new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_INSUFFICIENT_FUNDS_DIALOG", new z(new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_insufficient_balance_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_insufficient_balance_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_insufficient_balance_cta, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4))).collect(new i(jVar, w1Var, str, str2, 0), hVar);
            return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
        }
        if (Intrinsics.f(w1Var, w1.d.f113680a)) {
            kVar.getClass();
            Object objCollect2 = ((rv6.e) jVar.L2(new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_TIMEOUT_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_pending_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_pending_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4))).collect(new i(jVar, w1Var, str, str2, 1), hVar);
            return objCollect2 == fim.a.COROUTINE_SUSPENDED ? objCollect2 : Unit.f186387a;
        }
        if (Intrinsics.f(w1Var, w1.a.f113677a)) {
            kVar.getClass();
            Object objCollect3 = ((rv6.e) jVar.L2(new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_FAILURE_DIALOG", new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4))).collect(new i(jVar, w1Var, str, str2, 2), hVar);
            return objCollect3 == fim.a.COROUTINE_SUSPENDED ? objCollect3 : Unit.f186387a;
        }
        if (!(w1Var instanceof v1)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((v1) w1Var).f113670a == null) {
            kVar.getClass();
            y0Var = new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_COMPLETED_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_already_installed_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_already_installed_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new nii.w1(6, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
        } else {
            kVar.getClass();
            y0Var = new y0("ID_ESIM_SUBSCRIPTION_ACTIVATION_COMPLETED_WITH_ESIM_PROFILE_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_install_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new nii.w1(6, new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_success_install_cta, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078), false, 4);
        }
        Object objCollect4 = ((rv6.e) jVar.L2(y0Var)).collect(new i(jVar, w1Var, str, str2, 3), hVar);
        return objCollect4 == fim.a.COROUTINE_SUSPENDED ? objCollect4 : Unit.f186387a;
    }

    public static final void d3(j jVar, n1 n1Var, w1 w1Var, String str, String str2) {
        z1 z1Var = jVar.f15690n;
        boolean z = n1Var instanceof l1;
        b bVar = b.f15680a;
        if (!z) {
            if ((n1Var instanceof k1) || (n1Var instanceof m1)) {
                z1Var.k(bVar);
                return;
            } else {
                if (!(n1Var instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (Intrinsics.f(w1Var, w1.b.f113678a)) {
            z1Var.k(c.f15681a);
            return;
        }
        if (w1Var instanceof v1) {
            EsimProfile esimProfile = ((v1) w1Var).f113670a;
            if (esimProfile != null) {
                z1Var.k(new d(esimProfile));
                return;
            } else {
                z1Var.k(bVar);
                return;
            }
        }
        if (Intrinsics.f(w1Var, w1.d.f113680a)) {
            z1Var.k(bVar);
        } else if (Intrinsics.f(w1Var, w1.a.f113677a)) {
            jVar.Z2(str, str2);
        } else if (!Intrinsics.f(w1Var, w1.c.f113679a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // bjj.f
    public final void Z2(String subscriptionId, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        T2(new h(this, subscriptionId, idempotencyKey, null), new yi5.b(27));
    }

    @Override // bjj.f
    public final Flow b3() {
        return this.f15690n;
    }
}
