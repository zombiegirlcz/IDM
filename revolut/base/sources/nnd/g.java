package nnd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217545a;

    public g(Set linkedAccounts) {
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f217545a = linkedAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217545a, ((g) obj2).f217545a);
    }

    public final int hashCode() {
        return this.f217545a.hashCode();
    }
}
