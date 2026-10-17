package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272961b;

    public o1(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f272960a = firstName;
        this.f272961b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f272960a, o1Var.f272960a) && Intrinsics.f(this.f272961b, o1Var.f272961b);
    }

    public final int hashCode() {
        return this.f272961b.hashCode() + (this.f272960a.hashCode() * 31);
    }
}
