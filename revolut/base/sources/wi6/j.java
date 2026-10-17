package wi6;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f297817b;

    public j(LinkedHashSet accountIds, String str) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        this.f297816a = str;
        this.f297817b = accountIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f297816a, jVar.f297816a) && this.f297817b.equals(jVar.f297817b);
    }

    public final int hashCode() {
        String str = this.f297816a;
        return this.f297817b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
