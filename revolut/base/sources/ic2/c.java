package ic2;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import sf0.h;
import v60.e;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f160202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f160203b;

    public c(h serverErrorParser, e serverErrorsProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f160202a = serverErrorParser;
                this.f160203b = serverErrorsProvider;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f160202a = serverErrorParser;
                this.f160203b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f160202a = serverErrorParser;
                this.f160203b = serverErrorsProvider;
                break;
        }
    }

    public y0 a() {
        new v60.b();
        return new y0("post_termination_plan_error_status_dialog", new z(new TextLocalisedClause("error.generic", (List) null, (Clause) null, false, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }

    public y0 b(Throwable th10) {
        if (th10 instanceof HandledNetworkException) {
            return null;
        }
        ServerError serverErrorA = this.f160202a.a(th10);
        if (serverErrorA == null) {
            return a();
        }
        v60.c cVarB = ((ao0.a) this.f160203b).b(Integer.valueOf(serverErrorA.f51362a));
        return cVarB == null ? a() : new y0("post_termination_plan_error_status_dialog", new z(new TextLocalisedClause(cVarB.a(), (List) null, (Clause) null, true, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }
}
