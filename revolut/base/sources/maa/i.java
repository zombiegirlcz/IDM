package maa;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f203978c;

    public i(Map trustedAccounts, List allRecipients, List recentRecipients) {
        Intrinsics.checkNotNullParameter(allRecipients, "allRecipients");
        Intrinsics.checkNotNullParameter(recentRecipients, "recentRecipients");
        Intrinsics.checkNotNullParameter(trustedAccounts, "trustedAccounts");
        this.f203976a = allRecipients;
        this.f203977b = recentRecipients;
        this.f203978c = trustedAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f203976a, iVar.f203976a) && Intrinsics.f(this.f203977b, iVar.f203977b) && Intrinsics.f(this.f203978c, iVar.f203978c);
    }

    public final int hashCode() {
        return this.f203978c.hashCode() + p.a.d(this.f203976a.hashCode() * 31, 31, this.f203977b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i() {
        f0 f0Var = f0.f322471a;
        this(r0.g(), f0Var, f0Var);
    }
}
