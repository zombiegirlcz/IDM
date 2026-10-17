package jo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se6.d f176881a;

    public m(se6.d institution) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f176881a = institution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f176881a, ((m) obj2).f176881a);
    }

    public final int hashCode() {
        return this.f176881a.hashCode();
    }
}
