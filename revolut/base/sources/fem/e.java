package fem;

import aem.z0;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import java.util.Set;
import kem.q0;
import kem.t;
import kem.y;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import zhm.h0;

/* JADX INFO: loaded from: classes23.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f134660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f134661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f134662c;
    public final nem.c d;
    public final Job e;
    public final oem.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f134663g;

    public e(q0 url2, y method, t headers, nem.c body, Job executionContext, oem.e attributes) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f134660a = url2;
        this.f134661b = method;
        this.f134662c = headers;
        this.d = body;
        this.e = executionContext;
        this.f = attributes;
        Map map = (Map) attributes.d(ydm.f.f312720a);
        this.f134663g = (map == null || (setKeySet = map.keySet()) == null) ? h0.f322473a : setKeySet;
    }

    public final Object a() {
        z0 key = z0.f3801a;
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f.d(ydm.f.f312720a);
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f134660a + ", method=" + this.f134661b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
