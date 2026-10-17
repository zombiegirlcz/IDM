package iek;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.pod_nominees.impl.details.a f160758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f160759b;

    public j(com.revolut.retail.feature.pod_nominees.impl.details.a navBarState, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160758a = navBarState;
        this.f160759b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f160759b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f160758a, jVar.f160758a) && Intrinsics.f(this.f160759b, jVar.f160759b);
    }

    public final int hashCode() {
        return this.f160759b.hashCode() + (this.f160758a.hashCode() * 31);
    }
}
