package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273142b;

    public w4(String id10, String lastFour) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f273141a = id10;
        this.f273142b = lastFour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return Intrinsics.f(this.f273141a, w4Var.f273141a) && Intrinsics.f(this.f273142b, w4Var.f273142b);
    }

    public final int hashCode() {
        return this.f273142b.hashCode() + (this.f273141a.hashCode() * 31);
    }
}
