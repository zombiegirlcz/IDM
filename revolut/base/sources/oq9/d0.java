package oq9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f227811a;

    public d0(ArrayList members) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.f227811a = members;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && this.f227811a.equals(((d0) obj2).f227811a);
    }

    public final int hashCode() {
        return this.f227811a.hashCode();
    }
}
