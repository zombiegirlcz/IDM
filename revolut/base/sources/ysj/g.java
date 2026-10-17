package ysj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316479c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f316480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f316481h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f316482j;

    public g(String id10, String walletId, String baseTransactionId, String state, String type, long j2, long j3, List destinations, String str, y yVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(baseTransactionId, "baseTransactionId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f316477a = id10;
        this.f316478b = walletId;
        this.f316479c = baseTransactionId;
        this.d = state;
        this.e = type;
        this.f = j2;
        this.f316480g = j3;
        this.f316481h = destinations;
        this.i = str;
        this.f316482j = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f316477a, gVar.f316477a) && Intrinsics.f(this.f316478b, gVar.f316478b) && Intrinsics.f(this.f316479c, gVar.f316479c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f316480g == gVar.f316480g && Intrinsics.f(this.f316481h, gVar.f316481h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f316482j, gVar.f316482j);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c(a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f316477a.hashCode() * 31, 31, this.f316478b), 31, this.f316479c), 31, this.d), 31, this.e), 31, this.f), 31, this.f316480g), 31, this.f316481h);
        String str = this.i;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        y yVar = this.f316482j;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }
}
