package t2k;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267587a;

    public b(List beneficiaries) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f267587a = beneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f267587a, ((b) obj2).f267587a);
    }

    public final int hashCode() {
        return this.f267587a.hashCode();
    }
}
