package chj;

import android.net.Uri;
import android.telephony.euicc.EuiccManager;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.utils.EsimInstallationDialogBuilder;
import dej.m1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oej.c f24247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ynj.l f24248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EsimInstallationDialogBuilder f24249n;
    public final r10.w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f24250p;

    public g(oej.c esimInstallationInteractor, ynj.l esimInstallationErrorResolver, EsimInstallationDialogBuilder esimInstallationDialogBuilder, r10.w esimInstallationEventsTracker) {
        Intrinsics.checkNotNullParameter(esimInstallationInteractor, "esimInstallationInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationErrorResolver, "esimInstallationErrorResolver");
        Intrinsics.checkNotNullParameter(esimInstallationDialogBuilder, "esimInstallationDialogBuilder");
        Intrinsics.checkNotNullParameter(esimInstallationEventsTracker, "esimInstallationEventsTracker");
        this.f24247l = esimInstallationInteractor;
        this.f24248m = esimInstallationErrorResolver;
        this.f24249n = esimInstallationDialogBuilder;
        this.o = esimInstallationEventsTracker;
        this.f24250p = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    @Override // chj.d
    public final Flow Z2() {
        return this.f24250p;
    }

    @Override // chj.d
    public final void b3(String esimProfileId, EsimProfileDetails.InstallationType installationType) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        if (installationType instanceof EsimProfileDetails.InstallationType.InstallationLink) {
            String str = ((EsimProfileDetails.InstallationType.InstallationLink) installationType).f100439a;
            d3(esimProfileId, m1.STARTED);
            A2(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(str), 0, null, 494));
            this.f24250p.k(a.f24241a);
            return;
        }
        if (installationType instanceof EsimProfileDetails.InstallationType.ActivationCode) {
            e3(esimProfileId, ((EsimProfileDetails.InstallationType.ActivationCode) installationType).f100437a);
            return;
        }
        if (installationType instanceof EsimProfileDetails.InstallationType.ActivationCodeIccId) {
            e3(esimProfileId, ((EsimProfileDetails.InstallationType.ActivationCodeIccId) installationType).f100438a);
            return;
        }
        if (installationType != null) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot perform installation: InstallationType not provided");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimInstallationControllerModelExtensionImpl", null, illegalStateException, h0Var);
        c3(null, false);
    }

    public final void c3(EsimInstallationDialogBuilder.TryAgainPayload tryAgainPayload, boolean z) {
        nii.z zVar;
        this.f24249n.getClass();
        if (z) {
            zVar = new nii.z(new TextLocalisedClause(R$string.esim_installation_dialog_error_title, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_error_description_work_profile, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
        } else {
            zVar = new nii.z(new TextLocalisedClause(R$string.esim_installation_dialog_error_title, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_error_description, null, null, 14), tryAgainPayload != null ? new TextLocalisedClause(R$string.esim_installation_dialog_error_try_again, null, null, 14) : null, new TextLocalisedClause(R$string.esim_installation_dialog_error_install_manually, null, null, 14), null, tryAgainPayload, false, null, null, null, null, null, null, 32596);
        }
        yji.n.j2(this, L2(new y0("esimInstallationError", zVar, false, 4)), null, new f(this, null), 3);
    }

    public final void d3(String str, m1 m1Var) {
        T2(new c34.d(17, this, m1Var, str, (Continuation) null), new yi5.b(27));
    }

    public final void e3(String esimProfileId, String esimActivationCode) {
        Flow gVar;
        d3(esimProfileId, m1.STARTED);
        oej.c cVar = this.f24247l;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        Intrinsics.checkNotNullParameter(esimActivationCode, "esimActivationCode");
        qej.e eVar = cVar.f224612a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        Intrinsics.checkNotNullParameter(esimActivationCode, "esimActivationCode");
        EuiccManager euiccManagerA = eVar.a();
        Continuation continuation = null;
        if (euiccManagerA == null || !euiccManagerA.isEnabled()) {
            eVar.d.k(new pej.e(esimProfileId));
            gVar = new go.g(new pej.e(esimProfileId), 2);
        } else {
            gVar = new vkm.y(new vkm.q0(vkm.q.k(new qej.d(esimProfileId, esimActivationCode, null, eVar)), new qc3.c(eVar, continuation, 11), 1), new mki.d(esimProfileId, esimActivationCode, null, eVar));
        }
        yji.n.j2(this, gVar, null, new cbh.g(this, continuation, 20), 3);
    }
}
