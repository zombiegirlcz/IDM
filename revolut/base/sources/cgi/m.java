package cgi;

import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f24003c;
    public final int d;
    public final ArrayList e;
    public final CancellationPolicy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f24005h;

    public m(String id10, e type, d paymentMode, int i, ArrayList amenities, CancellationPolicy cancellationPolicy, ArrayList occupancyRates) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(occupancyRates, "occupancyRates");
        this.f24001a = id10;
        this.f24002b = type;
        this.f24003c = paymentMode;
        this.d = i;
        this.e = amenities;
        this.f = cancellationPolicy;
        this.f24004g = occupancyRates;
        this.f24005h = u.c(paymentMode);
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: a */
    public final CancellationPolicy getE() {
        return this.f;
    }

    @Override // cgi.r
    public final List b() {
        return this.e;
    }

    @Override // cgi.r
    public final List c() {
        return this.f24005h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f24001a, mVar.f24001a) && this.f24002b == mVar.f24002b && this.f24003c == mVar.f24003c && this.d == mVar.d && this.e.equals(mVar.e) && this.f.equals(mVar.f) && this.f24004g.equals(mVar.f24004g);
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: getId */
    public final String getF98115a() {
        return this.f24001a;
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: getType */
    public final e getF98116b() {
        return this.f24002b;
    }

    public final int hashCode() {
        return this.f24004g.hashCode() + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.b(this.d, (this.f24003c.hashCode() + ((this.f24002b.hashCode() + (this.f24001a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31);
    }
}
