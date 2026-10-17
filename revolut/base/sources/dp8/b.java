package dp8;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116833c;
    public final String d;
    public final h e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f116834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f116835h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f116836j;
    public final DateTime k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f116837l;

    public b(String id10, String juniorId, String coparentId, String name, h state, dj0.d reward, String iconUrl, String str, DateTime createdDate, DateTime dateTime, DateTime dateTime2, d frequency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(coparentId, "coparentId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f116831a = id10;
        this.f116832b = juniorId;
        this.f116833c = coparentId;
        this.d = name;
        this.e = state;
        this.f = reward;
        this.f116834g = iconUrl;
        this.f116835h = str;
        this.i = createdDate;
        this.f116836j = dateTime;
        this.k = dateTime2;
        this.f116837l = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f116831a, bVar.f116831a) && Intrinsics.f(this.f116832b, bVar.f116832b) && Intrinsics.f(this.f116833c, bVar.f116833c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f116834g, bVar.f116834g) && Intrinsics.f(this.f116835h, bVar.f116835h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f116836j, bVar.f116836j) && Intrinsics.f(this.k, bVar.k) && this.f116837l == bVar.f116837l;
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f116831a.hashCode() * 31, 31, this.f116832b), 31, this.f116833c), 31, this.d)) * 31, 31, this.f), 31, this.f116834g);
        String str = this.f116835h;
        int iF = m72.b.f(this.i, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        DateTime dateTime = this.f116836j;
        int iHashCode = (iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.k;
        return this.f116837l.hashCode() + ((iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31);
    }
}
