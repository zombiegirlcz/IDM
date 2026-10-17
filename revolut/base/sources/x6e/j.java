package x6e;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f303070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f303071b;

    public j(Map accountUiStates, Map juniorProfiles) {
        Intrinsics.checkNotNullParameter(accountUiStates, "accountUiStates");
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        this.f303070a = accountUiStates;
        this.f303071b = juniorProfiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f303070a, jVar.f303070a) && Intrinsics.f(this.f303071b, jVar.f303071b);
    }

    public final int hashCode() {
        return this.f303071b.hashCode() + (this.f303070a.hashCode() * 31);
    }
}
