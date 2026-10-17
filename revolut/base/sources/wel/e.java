package wel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f296819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xel.b f296820c;
    public final dj0.d d;
    public final ArrayList e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f296821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f296822h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f296823j;

    public e(String id10, i state, xel.b kyc2, dj0.d dVar, ArrayList holdings, g info, f disclosures, List assetTypes, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        this.f296818a = id10;
        this.f296819b = state;
        this.f296820c = kyc2;
        this.d = dVar;
        this.e = holdings;
        this.f = info;
        this.f296821g = disclosures;
        this.f296822h = assetTypes;
        this.i = dateTime;
        this.f296823j = dateTime2;
    }

    public static e a(e eVar, ArrayList holdings) {
        String id10 = eVar.f296818a;
        i state = eVar.f296819b;
        xel.b kyc2 = eVar.f296820c;
        dj0.d dVar = eVar.d;
        g info = eVar.f;
        f disclosures = eVar.f296821g;
        List assetTypes = eVar.f296822h;
        DateTime dateTime = eVar.i;
        DateTime dateTime2 = eVar.f296823j;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        return new e(id10, state, kyc2, dVar, holdings, info, disclosures, assetTypes, dateTime, dateTime2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f296818a, eVar.f296818a) && this.f296819b == eVar.f296819b && Intrinsics.f(this.f296820c, eVar.f296820c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f296821g, eVar.f296821g) && Intrinsics.f(this.f296822h, eVar.f296822h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f296823j, eVar.f296823j);
    }

    public final int hashCode() {
        int iHashCode = (this.f296820c.hashCode() + ((this.f296819b.hashCode() + (this.f296818a.hashCode() * 31)) * 31)) * 31;
        dj0.d dVar = this.d;
        int iD = p.a.d((this.f296821g.hashCode() + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31)) * 31)) * 31, 31, this.f296822h);
        DateTime dateTime = this.i;
        int iHashCode2 = (iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f296823j;
        return (iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
    }
}
