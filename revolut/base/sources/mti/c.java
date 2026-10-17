package mti;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90.b f208845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f208846b;

    public c(i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f208845a = uuidUtils;
        this.f208846b = y.u(uuidUtils, "toString(...)");
    }

    public final void a() {
        this.f208846b = y.u(this.f208845a, "toString(...)");
    }
}
