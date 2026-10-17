package yc8;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f312566b;

    public b(String juniorId, Map consentsTrack) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentsTrack, "consentsTrack");
        this.f312565a = juniorId;
        this.f312566b = consentsTrack;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f312565a, bVar.f312565a) && Intrinsics.f(this.f312566b, bVar.f312566b);
    }

    public final int hashCode() {
        return this.f312566b.hashCode() + (this.f312565a.hashCode() * 31);
    }
}
