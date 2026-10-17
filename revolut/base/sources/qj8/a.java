package qj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246773b;

    public a(String juniorRegId, String parentRegId) {
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(parentRegId, "parentRegId");
        this.f246772a = juniorRegId;
        this.f246773b = parentRegId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246772a, aVar.f246772a) && Intrinsics.f(this.f246773b, aVar.f246773b);
    }

    public final int hashCode() {
        return this.f246773b.hashCode() + (this.f246772a.hashCode() * 31);
    }
}
