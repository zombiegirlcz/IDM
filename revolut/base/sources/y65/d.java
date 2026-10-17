package y65;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f311156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x35.e f311157c;

    public d(Data loan, Data currentUser, x35.e eVar) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        this.f311155a = loan;
        this.f311156b = currentUser;
        this.f311157c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f311155a, dVar.f311155a) && Intrinsics.f(this.f311156b, dVar.f311156b) && Intrinsics.f(this.f311157c, dVar.f311157c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f311156b, this.f311155a.hashCode() * 31, 31);
        x35.e eVar = this.f311157c;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }
}
