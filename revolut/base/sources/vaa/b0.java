package vaa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f287180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287181b;

    public b0(z navBar, aim.e items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f287180a = navBar;
        this.f287181b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f287181b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f287180a, b0Var.f287180a) && Intrinsics.f(this.f287181b, b0Var.f287181b);
    }

    public final int hashCode() {
        return this.f287181b.hashCode() + (this.f287180a.hashCode() * 31);
    }
}
