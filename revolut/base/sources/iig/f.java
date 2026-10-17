package iig;

import com.revolut.core.error.data.model.ServerError;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import ofm.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f161614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f161615b;

    public f(sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f161614a = serverErrorParser;
        this.f161615b = serverErrorsProvider;
    }

    public final y0 a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f161614a.a(error);
        v60.d dVarB = ((ao0.a) this.f161615b).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            dVarB = new v60.b();
        }
        return new y0("FLIGHT_ERROR_DIALOG_ID", new z(q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }
}
