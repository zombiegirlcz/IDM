package uek;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap9.b f279471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f279472b;

    public g(ap9.b status, ArrayList distributedNominees) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(distributedNominees, "distributedNominees");
        this.f279471a = status;
        this.f279472b = distributedNominees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f279471a.equals(gVar.f279471a) && this.f279472b.equals(gVar.f279472b);
    }

    public final int hashCode() {
        return this.f279472b.hashCode() + (this.f279471a.hashCode() * 31);
    }
}
