package jja;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f174806a;

    public b(ArrayList interactions) {
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        this.f174806a = interactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f174806a.equals(((b) obj2).f174806a);
    }

    public final int hashCode() {
        return this.f174806a.hashCode();
    }
}
