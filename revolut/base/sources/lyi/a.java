package lyi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import svi.s;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200831c;
    public final s d;

    public a(Data passengers, String firstName, String lastName, s sVar) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f200829a = passengers;
        this.f200830b = firstName;
        this.f200831c = lastName;
        this.d = sVar;
    }

    public static a a(a aVar, Data passengers, String firstName, String lastName, s sVar, int i) {
        if ((i & 1) != 0) {
            passengers = aVar.f200829a;
        }
        if ((i & 2) != 0) {
            firstName = aVar.f200830b;
        }
        if ((i & 4) != 0) {
            lastName = aVar.f200831c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new a(passengers, firstName, lastName, sVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200829a, aVar.f200829a) && Intrinsics.f(this.f200830b, aVar.f200830b) && Intrinsics.f(this.f200831c, aVar.f200831c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f200829a.hashCode() * 31, 31, this.f200830b), 31, this.f200831c);
        s sVar = this.d;
        return iC + (sVar == null ? 0 : sVar.hashCode());
    }
}
