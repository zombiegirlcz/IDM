package zw7;

import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f325752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f325753b;

    public a(Address newAddress, ArrayList pets) {
        Intrinsics.checkNotNullParameter(newAddress, "newAddress");
        Intrinsics.checkNotNullParameter(pets, "pets");
        this.f325752a = newAddress;
        this.f325753b = pets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f325752a.equals(aVar.f325752a) && this.f325753b.equals(aVar.f325753b);
    }

    public final int hashCode() {
        return this.f325753b.hashCode() + (this.f325752a.hashCode() * 31);
    }
}
