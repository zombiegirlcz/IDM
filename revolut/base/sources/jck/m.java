package jck;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f172860c;
    public final Data d;
    public final Data e;
    public final Data f;

    public m(String searchQuery, Data upcomingBirthdays, Data allBirthdaysCount, Data allContacts, Data birthdaySharingEnabled, Data upcomingBirthdaysState) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(upcomingBirthdays, "upcomingBirthdays");
        Intrinsics.checkNotNullParameter(allBirthdaysCount, "allBirthdaysCount");
        Intrinsics.checkNotNullParameter(allContacts, "allContacts");
        Intrinsics.checkNotNullParameter(birthdaySharingEnabled, "birthdaySharingEnabled");
        Intrinsics.checkNotNullParameter(upcomingBirthdaysState, "upcomingBirthdaysState");
        this.f172858a = searchQuery;
        this.f172859b = upcomingBirthdays;
        this.f172860c = allBirthdaysCount;
        this.d = allContacts;
        this.e = birthdaySharingEnabled;
        this.f = upcomingBirthdaysState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f172858a, mVar.f172858a) && Intrinsics.f(this.f172859b, mVar.f172859b) && Intrinsics.f(this.f172860c, mVar.f172860c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f172860c, kii.e.c(this.f172859b, this.f172858a.hashCode() * 31, 31), 31), 31), 31);
    }
}
