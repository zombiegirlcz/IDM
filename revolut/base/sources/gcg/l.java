package gcg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142460a;

    public l(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f142460a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f142460a, ((l) obj2).f142460a);
    }

    public final int hashCode() {
        return this.f142460a.hashCode();
    }
}
