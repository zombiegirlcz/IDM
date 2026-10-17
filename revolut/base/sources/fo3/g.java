package fo3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136809b;

    public g(String updateId, ArrayList updates) {
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        Intrinsics.checkNotNullParameter(updates, "updates");
        this.f136808a = updateId;
        this.f136809b = updates;
    }

    public final List a() {
        return this.f136809b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f136808a.equals(gVar.f136808a) && this.f136809b.equals(gVar.f136809b);
    }

    public final int hashCode() {
        return this.f136809b.hashCode() + (this.f136808a.hashCode() * 31);
    }
}
