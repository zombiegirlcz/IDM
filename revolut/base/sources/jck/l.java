package jck;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f172857c;

    public l(Data allBirthdaysMonthlyGroups, Data allContacts, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(allBirthdaysMonthlyGroups, "allBirthdaysMonthlyGroups");
        Intrinsics.checkNotNullParameter(allContacts, "allContacts");
        this.f172855a = searchQuery;
        this.f172856b = allBirthdaysMonthlyGroups;
        this.f172857c = allContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f172855a, lVar.f172855a) && Intrinsics.f(this.f172856b, lVar.f172856b) && Intrinsics.f(this.f172857c, lVar.f172857c);
    }

    public final int hashCode() {
        return this.f172857c.hashCode() + kii.e.c(this.f172856b, this.f172855a.hashCode() * 31, 31);
    }
}
