package com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods;

import android.os.Parcel;
import android.os.Parcelable;
import c93.b;
import c93.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import d93.d;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/delivery_methods/DeliveryMethodsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMethodsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeliveryMethodsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f65185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65187c;
    public final b d;
    public final j e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f65189h;
    public final AccountId i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f65190j;
    public final AnalyticsProduct k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i93.d f65191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f65192m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Address address = (Address) j6.a.f(parcel, "parcel", DeliveryMethodsScreenContract$InputData.class);
            d dVar = (d) parcel.readSerializable();
            String string = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            j jVar = (j) parcel.readSerializable();
            j jVar2 = (j) parcel.readSerializable();
            String string2 = parcel.readString();
            h hVar = (h) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(DeliveryMethodsScreenContract$InputData.class.getClassLoader());
            String string3 = parcel.readString();
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(DeliveryMethodsScreenContract$InputData.class.getClassLoader());
            LinkedHashSet linkedHashSet = null;
            i93.d dVarValueOf = parcel.readInt() == 0 ? null : i93.d.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                    i = i;
                }
            }
            return new DeliveryMethodsScreenContract$InputData(address, dVar, string, bVar, jVar, jVar2, string2, hVar, accountId, string3, analyticsProduct, dVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryMethodsScreenContract$InputData[i];
        }
    }

    public DeliveryMethodsScreenContract$InputData(Address address, d deliveryMethods, String str, b card, j jVar, j jVar2, String str2, h hVar, AccountId accountId, String idempotencyKey, AnalyticsProduct automaticEventProduct, i93.d dVar, Set set) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65185a = address;
        this.f65186b = deliveryMethods;
        this.f65187c = str;
        this.d = card;
        this.e = jVar;
        this.f = jVar2;
        this.f65188g = str2;
        this.f65189h = hVar;
        this.i = accountId;
        this.f65190j = idempotencyKey;
        this.k = automaticEventProduct;
        this.f65191l = dVar;
        this.f65192m = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryMethodsScreenContract$InputData)) {
            return false;
        }
        DeliveryMethodsScreenContract$InputData deliveryMethodsScreenContract$InputData = (DeliveryMethodsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65185a, deliveryMethodsScreenContract$InputData.f65185a) && Intrinsics.f(this.f65186b, deliveryMethodsScreenContract$InputData.f65186b) && Intrinsics.f(this.f65187c, deliveryMethodsScreenContract$InputData.f65187c) && Intrinsics.f(this.d, deliveryMethodsScreenContract$InputData.d) && Intrinsics.f(this.e, deliveryMethodsScreenContract$InputData.e) && Intrinsics.f(this.f, deliveryMethodsScreenContract$InputData.f) && Intrinsics.f(this.f65188g, deliveryMethodsScreenContract$InputData.f65188g) && Intrinsics.f(this.f65189h, deliveryMethodsScreenContract$InputData.f65189h) && Intrinsics.f(this.i, deliveryMethodsScreenContract$InputData.i) && Intrinsics.f(this.f65190j, deliveryMethodsScreenContract$InputData.f65190j) && Intrinsics.f(this.k, deliveryMethodsScreenContract$InputData.k) && this.f65191l == deliveryMethodsScreenContract$InputData.f65191l && Intrinsics.f(this.f65192m, deliveryMethodsScreenContract$InputData.f65192m);
    }

    public final int hashCode() {
        int iHashCode = (this.f65186b.hashCode() + (this.f65185a.hashCode() * 31)) * 31;
        String str = this.f65187c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        j jVar = this.e;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        String str2 = this.f65188g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.f65189h;
        int iA = l.a(p.a.c(l.b(this.i, (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31), 31, this.f65190j), 31, this.k);
        i93.d dVar = this.f65191l;
        int iHashCode6 = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Set set = this.f65192m;
        return iHashCode6 + (set != null ? set.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65185a, i);
        dest.writeSerializable(this.f65186b);
        dest.writeString(this.f65187c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f65188g);
        dest.writeSerializable(this.f65189h);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f65190j);
        dest.writeParcelable(this.k, i);
        i93.d dVar = this.f65191l;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        Set set = this.f65192m;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = e.q(dest, 1, set);
        while (itQ.hasNext()) {
            dest.writeString((String) itQ.next());
        }
    }
}
