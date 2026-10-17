package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229640b;

    public /* synthetic */ g0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e0.f229630a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229639a = str;
        this.f229640b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f229639a, g0Var.f229639a) && Intrinsics.f(this.f229640b, g0Var.f229640b);
    }

    public final int hashCode() {
        return this.f229640b.hashCode() + (this.f229639a.hashCode() * 31);
    }

    public g0(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f229639a = firstName;
        this.f229640b = lastName;
    }
}
