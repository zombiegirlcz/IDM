package yld;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f314701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f314702b;

    public j(Map scheduled, Map projected) {
        Intrinsics.checkNotNullParameter(scheduled, "scheduled");
        Intrinsics.checkNotNullParameter(projected, "projected");
        this.f314701a = scheduled;
        this.f314702b = projected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f314701a, jVar.f314701a) && Intrinsics.f(this.f314702b, jVar.f314702b);
    }

    public final int hashCode() {
        return this.f314702b.hashCode() + (this.f314701a.hashCode() * 31);
    }
}
