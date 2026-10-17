package o2j;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f221640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f221641b;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f221640a, jVar.f221640a) && Intrinsics.f(this.f221641b, jVar.f221641b);
    }

    public final int hashCode() {
        return this.f221641b.hashCode() + (this.f221640a.hashCode() * 31);
    }

    public j(int i) {
        LinkedHashMap proAccounts = new LinkedHashMap();
        LinkedHashMap proVaults = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(proAccounts, "proAccounts");
        Intrinsics.checkNotNullParameter(proVaults, "proVaults");
        this.f221640a = proAccounts;
        this.f221641b = proVaults;
    }
}
