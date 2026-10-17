package xnd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f307423a;

    public m0(ArrayList accountIds) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        this.f307423a = accountIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && this.f307423a.equals(((m0) obj2).f307423a);
    }

    public final int hashCode() {
        return this.f307423a.hashCode();
    }
}
