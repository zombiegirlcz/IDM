package kcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f182742c;
    public final jo3.b d;
    public final lcl.b e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f182743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f182744h;
    public final DateTime i;

    public b(String id10, String state, List assetTypes, jo3.b bVar, lcl.b kyc2, a disclosures, c info, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f182740a = id10;
        this.f182741b = state;
        this.f182742c = assetTypes;
        this.d = bVar;
        this.e = kyc2;
        this.f = disclosures;
        this.f182743g = info;
        this.f182744h = dateTime;
        this.i = dateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f182740a, bVar.f182740a) && Intrinsics.f(this.f182741b, bVar.f182741b) && Intrinsics.f(this.f182742c, bVar.f182742c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f182743g, bVar.f182743g) && Intrinsics.f(this.f182744h, bVar.f182744h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f182740a.hashCode() * 31, 31, this.f182741b), 31, this.f182742c);
        jo3.b bVar = this.d;
        int iHashCode = (this.f182743g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        DateTime dateTime = this.f182744h;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.i;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
