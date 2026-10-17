package n87;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h87.f f213254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f213255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f213256c;
    public final String d;
    public final Data e;

    public k(h87.f collectionKey, Data data, boolean z, String str, Data wealthDisclaimersDomainState) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        this.f213254a = collectionKey;
        this.f213255b = data;
        this.f213256c = z;
        this.d = str;
        this.e = wealthDisclaimersDomainState;
    }

    public static k a(k kVar, Data data, boolean z, String str, Data data2, int i) {
        Data data3 = data;
        h87.f collectionKey = kVar.f213254a;
        if ((i & 2) != 0) {
            data3 = kVar.f213255b;
        }
        if ((i & 4) != 0) {
            z = kVar.f213256c;
        }
        if ((i & 8) != 0) {
            str = kVar.d;
        }
        if ((i & 16) != 0) {
            data2 = kVar.e;
        }
        Data wealthDisclaimersDomainState = data2;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        String str2 = str;
        return new k(collectionKey, data3, z, str2, wealthDisclaimersDomainState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f213254a == kVar.f213254a && Intrinsics.f(this.f213255b, kVar.f213255b) && this.f213256c == kVar.f213256c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f213254a.hashCode() * 31;
        Data data = this.f213255b;
        int iC = j6.a.c((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f213256c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
