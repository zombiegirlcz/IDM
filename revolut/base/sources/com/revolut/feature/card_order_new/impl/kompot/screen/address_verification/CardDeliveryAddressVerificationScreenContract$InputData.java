package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import h93.j0;
import h93.l0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryAddressVerificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryAddressVerificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f65139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f65141c;
    public final List d;
    public final j0 e;
    public final l0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccountId f65142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65143h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Address address = (Address) j6.a.f(parcel, "parcel", CardDeliveryAddressVerificationScreenContract$InputData.class);
            int iC = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CardDeliveryAddressVerificationScreenContract$InputData.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
            }
            return new CardDeliveryAddressVerificationScreenContract$InputData(address, z, analyticsProduct, arrayList, parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, (AccountId) parcel.readParcelable(CardDeliveryAddressVerificationScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryAddressVerificationScreenContract$InputData[i];
        }
    }

    public CardDeliveryAddressVerificationScreenContract$InputData(Address address, boolean z, AnalyticsProduct automaticEventProduct, List allowedCardDeliveryCountries, j0 j0Var, l0 l0Var, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(allowedCardDeliveryCountries, "allowedCardDeliveryCountries");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f65139a = address;
        this.f65140b = z;
        this.f65141c = automaticEventProduct;
        this.d = allowedCardDeliveryCountries;
        this.e = j0Var;
        this.f = l0Var;
        this.f65142g = accountId;
        this.f65143h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDeliveryAddressVerificationScreenContract$InputData)) {
            return false;
        }
        CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData = (CardDeliveryAddressVerificationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65139a, cardDeliveryAddressVerificationScreenContract$InputData.f65139a) && this.f65140b == cardDeliveryAddressVerificationScreenContract$InputData.f65140b && Intrinsics.f(this.f65141c, cardDeliveryAddressVerificationScreenContract$InputData.f65141c) && Intrinsics.f(this.d, cardDeliveryAddressVerificationScreenContract$InputData.d) && this.e == cardDeliveryAddressVerificationScreenContract$InputData.e && this.f == cardDeliveryAddressVerificationScreenContract$InputData.f && Intrinsics.f(this.f65142g, cardDeliveryAddressVerificationScreenContract$InputData.f65142g) && Intrinsics.f(this.f65143h, cardDeliveryAddressVerificationScreenContract$InputData.f65143h);
    }

    public final int hashCode() {
        Address address = this.f65139a;
        int iD = p.a.d(l.a(j6.a.c((address == null ? 0 : address.hashCode()) * 31, 31, this.f65140b), 31, this.f65141c), 31, this.d);
        j0 j0Var = this.e;
        int iHashCode = (iD + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f;
        int iB = l.b(this.f65142g, (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31);
        String str = this.f65143h;
        return iB + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65139a, i);
        dest.writeInt(this.f65140b ? 1 : 0);
        dest.writeParcelable(this.f65141c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        j0 j0Var = this.e;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeParcelable(this.f65142g, i);
        dest.writeString(this.f65143h);
    }
}
