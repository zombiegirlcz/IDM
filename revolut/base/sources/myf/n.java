package myf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f210484a;

    public n(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f210484a = routes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f210484a.equals(((n) obj2).f210484a);
    }

    public final int hashCode() {
        return this.f210484a.hashCode();
    }
}
