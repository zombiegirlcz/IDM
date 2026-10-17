package a2j;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f884b;

    public b(Clause disclaimer, Clause accountName) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.f883a = disclaimer;
        this.f884b = accountName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f883a, bVar.f883a) && Intrinsics.f(this.f884b, bVar.f884b);
    }

    public final int hashCode() {
        return this.f884b.hashCode() + (this.f883a.hashCode() * 31);
    }
}
