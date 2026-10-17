package svi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265943a;

    public l1(List airports) {
        Intrinsics.checkNotNullParameter(airports, "airports");
        this.f265943a = airports;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l1) && Intrinsics.f(this.f265943a, ((l1) obj2).f265943a);
    }

    public final int hashCode() {
        return this.f265943a.hashCode();
    }
}
