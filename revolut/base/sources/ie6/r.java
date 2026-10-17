package ie6;

import cli.y;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.extension_auth.impl.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends oki.h implements b {

    @NotNull
    public static final k Companion = new k();
    public final fe6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f160647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f160648q;

    public r(fe6.a interactor, jvh.a workflowInteractor, s stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f160647p = workflowInteractor;
        this.f160648q = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    public static final void I2(r rVar) {
        yji.l.b1(rVar, rVar.X1(new y0("TIMEOUT_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_secure_sign_in_timeout_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, new p(rVar, null, 4), 3);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f160648q, new id8.a(9));
        l2(new n(this, null), new j(this, 2));
    }

    public final boolean J2(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        boolean z = th10 instanceof MsApiException;
        int i = 0;
        y yVar = this.f160648q;
        if (z) {
            H2(yVar, new id8.a(11));
            yji.l.b1(this, X1(new y0("APPROVE_FAILURE_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_incorrect_location_mismatch_title, null, null, 14), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_incorrect_location_mismatch_description, null, null, 14), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_incorrect_location_mismatch_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new p(this, continuation, i), 3);
            return true;
        }
        if (!(th10 instanceof ServerErrorException)) {
            H2(yVar, new id8.a(13));
            return false;
        }
        H2(yVar, new id8.a(12));
        K2();
        return true;
    }

    public final void K2() {
        yji.l.b1(this, X1(new y0("STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_secure_sign_in_failure_title, null, null, 14), new TextLocalisedClause(R$string.revolut_secure_sign_in_failure_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, new p(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160648q;
    }
}
