package o23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f221462c;
    public final List d;
    public final Map e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gk3.e f221463g;

    public v(List postcodeLookup, List autoCompletion, List withoutZip, List countriesWithSelectableRegion, Map map, ArrayList allCountries, gk3.e addressConfig) {
        Intrinsics.checkNotNullParameter(postcodeLookup, "postcodeLookup");
        Intrinsics.checkNotNullParameter(autoCompletion, "autoCompletion");
        Intrinsics.checkNotNullParameter(withoutZip, "withoutZip");
        Intrinsics.checkNotNullParameter(countriesWithSelectableRegion, "countriesWithSelectableRegion");
        Intrinsics.checkNotNullParameter(allCountries, "allCountries");
        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
        this.f221460a = postcodeLookup;
        this.f221461b = autoCompletion;
        this.f221462c = withoutZip;
        this.d = countriesWithSelectableRegion;
        this.e = map;
        this.f = allCountries;
        this.f221463g = addressConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f221460a, vVar.f221460a) && Intrinsics.f(this.f221461b, vVar.f221461b) && Intrinsics.f(this.f221462c, vVar.f221462c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && this.f.equals(vVar.f) && Intrinsics.f(this.f221463g, vVar.f221463g);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(this.f221460a.hashCode() * 31, 31, this.f221461b), 31, this.f221462c), 31, this.d);
        Map map = this.e;
        return this.f221463g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iD + (map == null ? 0 : map.hashCode())) * 31, 31);
    }
}
