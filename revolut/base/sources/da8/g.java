package da8;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112477c;
    public final String d;
    public final Address e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112478g;

    public g(Data juniorProfile, Data termsClause, String firstName, String lastName, Address address, Map consentUiState, boolean z) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(termsClause, "termsClause");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(consentUiState, "consentUiState");
        this.f112475a = juniorProfile;
        this.f112476b = termsClause;
        this.f112477c = firstName;
        this.d = lastName;
        this.e = address;
        this.f = consentUiState;
        this.f112478g = z;
    }

    public static g a(g gVar, Data data, Data data2, String str, String str2, Address address, Map map, boolean z, int i) {
        if ((i & 1) != 0) {
            data = gVar.f112475a;
        }
        Data juniorProfile = data;
        if ((i & 2) != 0) {
            data2 = gVar.f112476b;
        }
        Data termsClause = data2;
        if ((i & 4) != 0) {
            str = gVar.f112477c;
        }
        String firstName = str;
        if ((i & 8) != 0) {
            str2 = gVar.d;
        }
        String lastName = str2;
        if ((i & 16) != 0) {
            address = gVar.e;
        }
        Address address2 = address;
        if ((i & 32) != 0) {
            map = gVar.f;
        }
        Map consentUiState = map;
        if ((i & 64) != 0) {
            z = gVar.f112478g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(termsClause, "termsClause");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(consentUiState, "consentUiState");
        return new g(juniorProfile, termsClause, firstName, lastName, address2, consentUiState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f112475a, gVar.f112475a) && Intrinsics.f(this.f112476b, gVar.f112476b) && Intrinsics.f(this.f112477c, gVar.f112477c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f112478g == gVar.f112478g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112478g) + p.a.e((this.e.hashCode() + p.a.c(p.a.c(kii.e.c(this.f112476b, this.f112475a.hashCode() * 31, 31), 31, this.f112477c), 31, this.d)) * 31, 31, this.f);
    }
}
