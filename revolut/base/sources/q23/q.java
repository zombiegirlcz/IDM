package q23;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f241511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f241512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f241513c;
    public final Address d;
    public final Address e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f241514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f241515h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f241516j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CardDeliveryRecipient f241517l;

    public q(Data address, boolean z, Data addressLocation, Address address2, Address address3, Data restrictedDeliveryPostcodes, Data addressLocalisationsConfig, boolean z3, Data user, Boolean bool, boolean z4, CardDeliveryRecipient cardDeliveryRecipient) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(addressLocation, "addressLocation");
        Intrinsics.checkNotNullParameter(restrictedDeliveryPostcodes, "restrictedDeliveryPostcodes");
        Intrinsics.checkNotNullParameter(addressLocalisationsConfig, "addressLocalisationsConfig");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f241511a = address;
        this.f241512b = z;
        this.f241513c = addressLocation;
        this.d = address2;
        this.e = address3;
        this.f = restrictedDeliveryPostcodes;
        this.f241514g = addressLocalisationsConfig;
        this.f241515h = z3;
        this.i = user;
        this.f241516j = bool;
        this.k = z4;
        this.f241517l = cardDeliveryRecipient;
    }

    public static q a(q qVar, Data data, boolean z, Data data2, Address address, Address address2, Data data3, Data data4, Data data5, Boolean bool, boolean z3, CardDeliveryRecipient cardDeliveryRecipient, int i) {
        if ((i & 1) != 0) {
            data = qVar.f241511a;
        }
        Data address3 = data;
        if ((i & 2) != 0) {
            z = qVar.f241512b;
        }
        boolean z4 = z;
        Data addressLocation = (i & 4) != 0 ? qVar.f241513c : data2;
        Address address4 = (i & 8) != 0 ? qVar.d : address;
        Address address5 = (i & 16) != 0 ? qVar.e : address2;
        Data restrictedDeliveryPostcodes = (i & 32) != 0 ? qVar.f : data3;
        Data addressLocalisationsConfig = (i & 64) != 0 ? qVar.f241514g : data4;
        boolean z6 = (i & 128) != 0 ? qVar.f241515h : true;
        Data user = (i & 256) != 0 ? qVar.i : data5;
        Boolean bool2 = (i & 512) != 0 ? qVar.f241516j : bool;
        boolean z11 = (i & 1024) != 0 ? qVar.k : z3;
        CardDeliveryRecipient cardDeliveryRecipient2 = (i & 2048) != 0 ? qVar.f241517l : cardDeliveryRecipient;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(address3, "address");
        Intrinsics.checkNotNullParameter(addressLocation, "addressLocation");
        Intrinsics.checkNotNullParameter(restrictedDeliveryPostcodes, "restrictedDeliveryPostcodes");
        Intrinsics.checkNotNullParameter(addressLocalisationsConfig, "addressLocalisationsConfig");
        Intrinsics.checkNotNullParameter(user, "user");
        return new q(address3, z4, addressLocation, address4, address5, restrictedDeliveryPostcodes, addressLocalisationsConfig, z6, user, bool2, z11, cardDeliveryRecipient2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f241511a, qVar.f241511a) && this.f241512b == qVar.f241512b && Intrinsics.f(this.f241513c, qVar.f241513c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f241514g, qVar.f241514g) && this.f241515h == qVar.f241515h && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f241516j, qVar.f241516j) && this.k == qVar.k && Intrinsics.f(this.f241517l, qVar.f241517l);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f241513c, j6.a.c(this.f241511a.hashCode() * 31, 31, this.f241512b), 31);
        Address address = this.d;
        int iHashCode = (iC + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.e;
        int iC2 = kii.e.c(this.i, j6.a.c(kii.e.c(this.f241514g, kii.e.c(this.f, (iHashCode + (address2 == null ? 0 : address2.hashCode())) * 31, 31), 31), 31, this.f241515h), 31);
        Boolean bool = this.f241516j;
        int iC3 = j6.a.c((iC2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.k);
        CardDeliveryRecipient cardDeliveryRecipient = this.f241517l;
        return iC3 + (cardDeliveryRecipient != null ? cardDeliveryRecipient.hashCode() : 0);
    }
}
