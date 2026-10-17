package pd4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f235075a;

    public j(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f235075a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f235075a, ((j) obj2).f235075a);
    }

    public final int hashCode() {
        return this.f235075a.hashCode();
    }
}
