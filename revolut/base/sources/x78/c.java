package x78;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f303161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f303162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f303163c;

    public c(Data juniorProfiles, Data pocketsAvailable, Data creationAvailable) {
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        Intrinsics.checkNotNullParameter(pocketsAvailable, "pocketsAvailable");
        Intrinsics.checkNotNullParameter(creationAvailable, "creationAvailable");
        this.f303161a = juniorProfiles;
        this.f303162b = pocketsAvailable;
        this.f303163c = creationAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f303161a, cVar.f303161a) && Intrinsics.f(this.f303162b, cVar.f303162b) && Intrinsics.f(this.f303163c, cVar.f303163c);
    }

    public final int hashCode() {
        return this.f303163c.hashCode() + kii.e.c(this.f303162b, this.f303161a.hashCode() * 31, 31);
    }
}
