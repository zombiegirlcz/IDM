package a2m;

import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.domain.model.AppError;
import kotlin.jvm.internal.Intrinsics;
import u1m.f0;
import u1m.m;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2m.e f948a;

    public g(g2m.e transactionApiRepository) {
        Intrinsics.checkNotNullParameter(transactionApiRepository, "transactionApiRepository");
        this.f948a = transactionApiRepository;
    }

    public final Object a(gim.c cVar) {
        return d(x2m.d.ABORTED, null, cVar);
    }

    public final Object b(m mVar) {
        return d(x2m.d.COMPLETED, null, mVar);
    }

    public final Object c(AppError appError, gim.c cVar) {
        return appError instanceof AppError.Canceled ? a(cVar) : d(x2m.d.ERROR, appError, cVar);
    }

    public final Object d(x2m.d dVar, AppError e, gim.c cVar) {
        String message = "executeImpl(" + dVar + ", " + e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        Intrinsics.checkNotNullParameter(message, "message");
        f0 f0Var = f0.VERBOSE;
        if (e != null) {
            Intrinsics.checkNotNullParameter(e, "e");
        }
        return ((m2m.m) this.f948a).e(dVar, e != null ? e.b() : null, cVar);
    }
}
