package xpl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f308011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f308012b;

    public c(Data revolutAccounts, Data connectedApps) {
        Intrinsics.checkNotNullParameter(revolutAccounts, "revolutAccounts");
        Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
        this.f308011a = revolutAccounts;
        this.f308012b = connectedApps;
    }

    public static c a(c cVar, Data revolutAccounts, Data connectedApps, int i) {
        if ((i & 1) != 0) {
            revolutAccounts = cVar.f308011a;
        }
        if ((i & 2) != 0) {
            connectedApps = cVar.f308012b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(revolutAccounts, "revolutAccounts");
        Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
        return new c(revolutAccounts, connectedApps);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308011a, cVar.f308011a) && Intrinsics.f(this.f308012b, cVar.f308012b);
    }

    public final int hashCode() {
        return this.f308012b.hashCode() + (this.f308011a.hashCode() * 31);
    }
}
