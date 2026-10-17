package b88;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f13117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f13118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f13119c;
    public final Data d;

    public c(Data walletsWithSavings, Data juniorProfiles, Data accountUiStates, Data creationAvailable) {
        Intrinsics.checkNotNullParameter(walletsWithSavings, "walletsWithSavings");
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        Intrinsics.checkNotNullParameter(accountUiStates, "accountUiStates");
        Intrinsics.checkNotNullParameter(creationAvailable, "creationAvailable");
        this.f13117a = walletsWithSavings;
        this.f13118b = juniorProfiles;
        this.f13119c = accountUiStates;
        this.d = creationAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f13117a, cVar.f13117a) && Intrinsics.f(this.f13118b, cVar.f13118b) && Intrinsics.f(this.f13119c, cVar.f13119c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f13119c, kii.e.c(this.f13118b, this.f13117a.hashCode() * 31, 31), 31);
    }
}
