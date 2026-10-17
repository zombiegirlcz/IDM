package dsh;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f117332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f117333b;

    public n(ViewController controller, Function1 mapper) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f117332a = controller;
        this.f117333b = mapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f117332a, nVar.f117332a) && Intrinsics.f(this.f117333b, nVar.f117333b);
    }

    public final int hashCode() {
        return this.f117333b.hashCode() + (this.f117332a.hashCode() * 31);
    }
}
