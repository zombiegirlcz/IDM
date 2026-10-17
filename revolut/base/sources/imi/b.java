package imi;

import kotlin.jvm.internal.Intrinsics;
import ulm.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f162495a;

    public b(x0 tokenRefreshUrl) {
        Intrinsics.checkNotNullParameter(tokenRefreshUrl, "tokenRefreshUrl");
        Intrinsics.checkNotNullParameter("PUT", "httpMethod");
        this.f162495a = tokenRefreshUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f162495a.equals(((b) obj2).f162495a);
    }

    public final int hashCode() {
        return (this.f162495a.i.hashCode() * 31) + 79599;
    }
}
