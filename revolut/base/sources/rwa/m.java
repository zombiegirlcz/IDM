package rwa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257875a;

    public m(List created) {
        Intrinsics.checkNotNullParameter(created, "created");
        this.f257875a = created;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f257875a, ((m) obj2).f257875a);
    }

    public final int hashCode() {
        return this.f257875a.hashCode();
    }
}
