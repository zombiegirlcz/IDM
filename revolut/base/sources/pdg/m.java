package pdg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyPreview f235201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f235202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f235203c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f235204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f235205h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f235206j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f235207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f235208m;

    public m(HotelsPropertyPreview hotelsPropertyPreview, Data hotelsProperty, Data favoritesPropertiesIds, Data providersList, Data availableRooms, Data amenities, List propertyGuestsReviews, LocalDate checkInDate, LocalDate checkOutDate, List roomsOccupancy, boolean z, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(favoritesPropertiesIds, "favoritesPropertiesIds");
        Intrinsics.checkNotNullParameter(providersList, "providersList");
        Intrinsics.checkNotNullParameter(availableRooms, "availableRooms");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(propertyGuestsReviews, "propertyGuestsReviews");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f235201a = hotelsPropertyPreview;
        this.f235202b = hotelsProperty;
        this.f235203c = favoritesPropertiesIds;
        this.d = providersList;
        this.e = availableRooms;
        this.f = amenities;
        this.f235204g = propertyGuestsReviews;
        this.f235205h = checkInDate;
        this.i = checkOutDate;
        this.f235206j = roomsOccupancy;
        this.k = z;
        this.f235207l = z3;
        this.f235208m = str;
    }

    public static m a(m mVar, Data data, Data data2, Data data3, Data data4, Data data5, List list, LocalDate localDate, LocalDate localDate2, List list2, boolean z, int i) {
        HotelsPropertyPreview hotelsPropertyPreview = mVar.f235201a;
        Data hotelsProperty = (i & 2) != 0 ? mVar.f235202b : data;
        Data favoritesPropertiesIds = (i & 4) != 0 ? mVar.f235203c : data2;
        Data providersList = (i & 8) != 0 ? mVar.d : data3;
        Data availableRooms = (i & 16) != 0 ? mVar.e : data4;
        Data amenities = (i & 32) != 0 ? mVar.f : data5;
        List propertyGuestsReviews = (i & 64) != 0 ? mVar.f235204g : list;
        LocalDate checkInDate = (i & 128) != 0 ? mVar.f235205h : localDate;
        LocalDate checkOutDate = (i & 256) != 0 ? mVar.i : localDate2;
        List roomsOccupancy = (i & 512) != 0 ? mVar.f235206j : list2;
        boolean z3 = mVar.k;
        boolean z4 = (i & 2048) != 0 ? mVar.f235207l : z;
        String str = mVar.f235208m;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(favoritesPropertiesIds, "favoritesPropertiesIds");
        Intrinsics.checkNotNullParameter(providersList, "providersList");
        Intrinsics.checkNotNullParameter(availableRooms, "availableRooms");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(propertyGuestsReviews, "propertyGuestsReviews");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        return new m(hotelsPropertyPreview, hotelsProperty, favoritesPropertiesIds, providersList, availableRooms, amenities, propertyGuestsReviews, checkInDate, checkOutDate, roomsOccupancy, z3, z4, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f235201a, mVar.f235201a) && Intrinsics.f(this.f235202b, mVar.f235202b) && Intrinsics.f(this.f235203c, mVar.f235203c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f235204g, mVar.f235204g) && Intrinsics.f(this.f235205h, mVar.f235205h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f235206j, mVar.f235206j) && this.k == mVar.k && this.f235207l == mVar.f235207l && Intrinsics.f(this.f235208m, mVar.f235208m);
    }

    public final int hashCode() {
        HotelsPropertyPreview hotelsPropertyPreview = this.f235201a;
        int iC = j6.a.c(j6.a.c(p.a.d(wp5.y.a(wp5.y.a(p.a.d(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f235203c, kii.e.c(this.f235202b, (hotelsPropertyPreview == null ? 0 : hotelsPropertyPreview.hashCode()) * 31, 31), 31), 31), 31), 31), 31, this.f235204g), 31, this.f235205h), 31, this.i), 31, this.f235206j), 31, this.k), 31, this.f235207l);
        String str = this.f235208m;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
