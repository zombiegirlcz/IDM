package bb8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14186c;
    public final boolean d;

    public f(Data juniorFullNames, String firstName, String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(juniorFullNames, "juniorFullNames");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f14184a = juniorFullNames;
        this.f14185b = firstName;
        this.f14186c = lastName;
        this.d = z;
    }

    public static f a(f fVar, Data juniorFullNames, String firstName, String lastName, boolean z, int i) {
        if ((i & 1) != 0) {
            juniorFullNames = fVar.f14184a;
        }
        if ((i & 2) != 0) {
            firstName = fVar.f14185b;
        }
        if ((i & 4) != 0) {
            lastName = fVar.f14186c;
        }
        if ((i & 8) != 0) {
            z = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(juniorFullNames, "juniorFullNames");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new f(juniorFullNames, firstName, lastName, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f14184a, fVar.f14184a) && Intrinsics.f(this.f14185b, fVar.f14185b) && Intrinsics.f(this.f14186c, fVar.f14186c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f14184a.hashCode() * 31, 31, this.f14185b), 31, this.f14186c);
    }
}
