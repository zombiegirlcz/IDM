package xj0;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import ulm.i1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk0.c f306442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.c f306443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hmi.a f306444c;

    public d(bk0.c headersProvider, ij0.c revolutHostChecker, hmi.a requestAuthorizer) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        Intrinsics.checkNotNullParameter(requestAuthorizer, "requestAuthorizer");
        this.f306442a = headersProvider;
        this.f306443b = revolutHostChecker;
        this.f306444c = requestAuthorizer;
    }

    public static void a(i1 i1Var, Pair pair) {
        i1Var.a((String) pair.f186385a, (String) pair.f186386b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:11:0x00bf, B:13:0x00c5, B:16:0x00cd, B:19:0x00d7, B:21:0x00dd, B:25:0x00e6, B:27:0x00ec, B:33:0x010d, B:35:0x0112, B:37:0x011a, B:40:0x0122, B:43:0x012c, B:45:0x0134, B:46:0x0154, B:47:0x0158, B:50:0x0169, B:62:0x0186, B:53:0x0172, B:56:0x0179, B:59:0x0180, B:63:0x0193, B:64:0x0198, B:28:0x00f4, B:30:0x0100, B:32:0x0106), top: B:69:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:11:0x00bf, B:13:0x00c5, B:16:0x00cd, B:19:0x00d7, B:21:0x00dd, B:25:0x00e6, B:27:0x00ec, B:33:0x010d, B:35:0x0112, B:37:0x011a, B:40:0x0122, B:43:0x012c, B:45:0x0134, B:46:0x0154, B:47:0x0158, B:50:0x0169, B:62:0x0186, B:53:0x0172, B:56:0x0179, B:59:0x0180, B:63:0x0193, B:64:0x0198, B:28:0x00f4, B:30:0x0100, B:32:0x0106), top: B:69:0x00bf }] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r13) throws com.revolut.core.error.data.model.NoAuthTokenException {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj0.d.intercept(ulm.y0):okhttp3.Response");
    }
}
