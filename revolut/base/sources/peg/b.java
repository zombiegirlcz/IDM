package peg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235377a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f235377a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f235377a, ((b) obj2).f235377a);
    }

    public final int hashCode() {
        return this.f235377a.hashCode();
    }
}
