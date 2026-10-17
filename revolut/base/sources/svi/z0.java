package svi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f266020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266021b;

    public z0(String str, ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f266020a = events;
        this.f266021b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return this.f266020a.equals(z0Var.f266020a) && Intrinsics.f(this.f266021b, z0Var.f266021b);
    }

    public final int hashCode() {
        int iHashCode = this.f266020a.hashCode() * 31;
        String str = this.f266021b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
