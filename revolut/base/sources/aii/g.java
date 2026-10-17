package aii;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f5285a;

    public g(ViewController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f5285a = controller;
    }

    public final ViewController a() {
        return this.f5285a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f5285a, ((g) obj2).f5285a);
    }

    public final int hashCode() {
        return this.f5285a.hashCode();
    }
}
