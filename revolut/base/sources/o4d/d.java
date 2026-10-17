package o4d;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222200c;
    public final String d;
    public final ZonedDateTime e;
    public final String f;

    public d(String watchlistId, String assetTypeKey, String from, String to6, ZonedDateTime addedTime, String syncState) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(addedTime, "addedTime");
        Intrinsics.checkNotNullParameter(syncState, "syncState");
        this.f222198a = watchlistId;
        this.f222199b = assetTypeKey;
        this.f222200c = from;
        this.d = to6;
        this.e = addedTime;
        this.f = syncState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f222198a, dVar.f222198a) && Intrinsics.f(this.f222199b, dVar.f222199b) && Intrinsics.f(this.f222200c, dVar.f222200c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + l.h(this.e, p.a.c(p.a.c(p.a.c(this.f222198a.hashCode() * 31, 31, this.f222199b), 31, this.f222200c), 31, this.d), 31);
    }
}
