package qp7;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f248305b;

    public i(Data reservation, Set acceptedConditions) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Intrinsics.checkNotNullParameter(acceptedConditions, "acceptedConditions");
        this.f248304a = reservation;
        this.f248305b = acceptedConditions;
    }

    public static i a(i iVar, Data reservation, Set acceptedConditions, int i) {
        if ((i & 1) != 0) {
            reservation = iVar.f248304a;
        }
        if ((i & 2) != 0) {
            acceptedConditions = iVar.f248305b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Intrinsics.checkNotNullParameter(acceptedConditions, "acceptedConditions");
        return new i(reservation, acceptedConditions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248304a, iVar.f248304a) && Intrinsics.f(this.f248305b, iVar.f248305b);
    }

    public final int hashCode() {
        return this.f248305b.hashCode() + (this.f248304a.hashCode() * 31);
    }
}
