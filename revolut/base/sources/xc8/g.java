package xc8;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f304108b;

    public g(String juniorId, Map consents) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f304107a = juniorId;
        this.f304108b = consents;
    }

    public static g a(g gVar, Map consents) {
        String juniorId = gVar.f304107a;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consents, "consents");
        return new g(juniorId, consents);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f304107a, gVar.f304107a) && Intrinsics.f(this.f304108b, gVar.f304108b);
    }

    public final int hashCode() {
        return this.f304108b.hashCode() + (this.f304107a.hashCode() * 31);
    }
}
