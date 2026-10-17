package fem;

import ch.qos.logback.core.CoreConstants;
import kem.b0;
import kem.d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f134668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qem.d f134669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zdm.h f134670c;
    public final b0 d;
    public final Object e;
    public final CoroutineContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qem.d f134671g;

    public h(d0 statusCode, qem.d requestTime, zdm.h headers, b0 version, Object body, CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f134668a = statusCode;
        this.f134669b = requestTime;
        this.f134670c = headers;
        this.d = version;
        this.e = body;
        this.f = callContext;
        this.f134671g = qem.a.a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f134668a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
