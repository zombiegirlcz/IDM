package eh8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f125748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f125749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f125750c;

    public d(Data accountsData, Data guardian, Data currentUserData) {
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(guardian, "guardian");
        Intrinsics.checkNotNullParameter(currentUserData, "currentUserData");
        this.f125748a = accountsData;
        this.f125749b = guardian;
        this.f125750c = currentUserData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f125748a, dVar.f125748a) && Intrinsics.f(this.f125749b, dVar.f125749b) && Intrinsics.f(this.f125750c, dVar.f125750c);
    }

    public final int hashCode() {
        return this.f125750c.hashCode() + kii.e.c(this.f125749b, this.f125748a.hashCode() * 31, 31);
    }
}
