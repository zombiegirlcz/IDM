package ijd;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161772c;
    public final int d;
    public final Map e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f161773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f161774h;

    public c(String productName, String description, String imageUrl, int i, Map map, Address address, double d, Data data) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f161770a = productName;
        this.f161771b = description;
        this.f161772c = imageUrl;
        this.d = i;
        this.e = map;
        this.f = address;
        this.f161773g = d;
        this.f161774h = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161770a, cVar.f161770a) && Intrinsics.f(this.f161771b, cVar.f161771b) && Intrinsics.f(this.f161772c, cVar.f161772c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Double.compare(this.f161773g, cVar.f161773g) == 0 && Intrinsics.f(this.f161774h, cVar.f161774h);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f161770a.hashCode() * 31, 31, this.f161771b), 31, this.f161772c), 31);
        Map map = this.e;
        int iHashCode = (iB + (map == null ? 0 : map.hashCode())) * 31;
        Address address = this.f;
        int iC = m72.b.c((iHashCode + (address == null ? 0 : address.hashCode())) * 31, this.f161773g, 31);
        Data data = this.f161774h;
        return iC + (data != null ? data.hashCode() : 0);
    }
}
