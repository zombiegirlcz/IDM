package d7d;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.consent.prompt.builder.impl.R$string;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rp0.f1;
import rp0.g1;
import rp0.k1;
import skm.a2;
import vkm.q;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends jki.g implements f {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConsentPromptScreenContract$InputData f111929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ld8.c f111930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1 f111931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f111932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f111933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, ConsentPromptScreenContract$InputData inputData, ld8.c consentInteractor, g1 shotDialogDisplayer) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentInteractor, "consentInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f111929p = inputData;
        this.f111930q = consentInteractor;
        this.f111931r = shotDialogDisplayer;
        this.f111933t = new d(inputData.f86101a);
    }

    public static final void y2(n nVar) {
        ShotDialogDisplayer$Configuration shotDialogDisplayer$ConfigurationF = ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ID_PROMPT_RESULT_STATUS", new TextLocalisedClause(R$string.consents_prompt_success_title, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 44);
        k1 k1Var = (k1) nVar.f111931r;
        k1Var.d(shotDialogDisplayer$ConfigurationF);
        yji.l.a1(nVar, q.J(rd0.e.b(k1Var.d), new v1(new d3i.g(nVar, shotDialogDisplayer$ConfigurationF, null, 6))), null, null, new m(nVar, null), 3);
    }

    @Override // yji.l
    public final void I1() {
        l2(new cvi.j(this, (Continuation) null, 25), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f111933t;
    }

    public final void z2(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        Flow flowX1 = X1(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
        Intrinsics.checkNotNullParameter(flowX1, "<this>");
        Intrinsics.checkNotNullParameter("HANDLER_ERROR_FULL_SCREEN", "taskId");
        yji.l.a1(this, pu7.a.C(flowX1, this.k, "HANDLER_ERROR_FULL_SCREEN"), null, null, new j(this, null), 3);
    }
}
