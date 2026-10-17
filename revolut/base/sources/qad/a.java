package qad;

import cng.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f244026a;

    public a(b registeredIdentityInterceptor) {
        Intrinsics.checkNotNullParameter(registeredIdentityInterceptor, "registeredIdentityInterceptor");
        this.f244026a = registeredIdentityInterceptor;
    }

    public final List a() {
        return u.c(this.f244026a);
    }
}
