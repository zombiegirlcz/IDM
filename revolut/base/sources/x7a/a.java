package x7a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f303175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f303176b;

    public a(ArrayList mostPopular, ArrayList otherCountries) {
        Intrinsics.checkNotNullParameter(mostPopular, "mostPopular");
        Intrinsics.checkNotNullParameter(otherCountries, "otherCountries");
        this.f303175a = mostPopular;
        this.f303176b = otherCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f303175a.equals(aVar.f303175a) && this.f303176b.equals(aVar.f303176b);
    }

    public final int hashCode() {
        return this.f303176b.hashCode() + (this.f303175a.hashCode() * 31);
    }
}
