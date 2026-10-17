package pwb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240384a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240384a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f240384a, ((j) obj2).f240384a);
    }

    public final int hashCode() {
        return this.f240384a.hashCode();
    }
}
