package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.z2;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionPhoneNumber;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionPhoneNumber implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionPhoneNumber> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f100471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100472c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f100473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f100474h;
    public final EsimSubscriptionPhoneNumberPorting i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberPortOutEligibility f100475j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            z2 z2VarValueOf = z2.valueOf(parcel.readString());
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new EsimSubscriptionPhoneNumber(string, z2VarValueOf, string2, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : EsimSubscriptionPhoneNumberPorting.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimSubscriptionPhoneNumberPortOutEligibility.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionPhoneNumber[i];
        }
    }

    public EsimSubscriptionPhoneNumber(String id10, z2 state, String phoneNumber, boolean z, boolean z3, String str, Instant instant, Instant instant2, EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting, EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f100470a = id10;
        this.f100471b = state;
        this.f100472c = phoneNumber;
        this.d = z;
        this.e = z3;
        this.f = str;
        this.f100473g = instant;
        this.f100474h = instant2;
        this.i = esimSubscriptionPhoneNumberPorting;
        this.f100475j = esimSubscriptionPhoneNumberPortOutEligibility;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionPhoneNumber)) {
            return false;
        }
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) obj2;
        return Intrinsics.f(this.f100470a, esimSubscriptionPhoneNumber.f100470a) && this.f100471b == esimSubscriptionPhoneNumber.f100471b && Intrinsics.f(this.f100472c, esimSubscriptionPhoneNumber.f100472c) && this.d == esimSubscriptionPhoneNumber.d && this.e == esimSubscriptionPhoneNumber.e && Intrinsics.f(this.f, esimSubscriptionPhoneNumber.f) && Intrinsics.f(this.f100473g, esimSubscriptionPhoneNumber.f100473g) && Intrinsics.f(this.f100474h, esimSubscriptionPhoneNumber.f100474h) && Intrinsics.f(this.i, esimSubscriptionPhoneNumber.i) && Intrinsics.f(this.f100475j, esimSubscriptionPhoneNumber.f100475j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c((this.f100471b.hashCode() + (this.f100470a.hashCode() * 31)) * 31, 31, this.f100472c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.f100473g;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f100474h;
        int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = this.i;
        int iHashCode4 = (iHashCode3 + (esimSubscriptionPhoneNumberPorting == null ? 0 : esimSubscriptionPhoneNumberPorting.hashCode())) * 31;
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = this.f100475j;
        return iHashCode4 + (esimSubscriptionPhoneNumberPortOutEligibility != null ? esimSubscriptionPhoneNumberPortOutEligibility.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100470a);
        dest.writeString(this.f100471b.name());
        dest.writeString(this.f100472c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        dest.writeSerializable(this.f100473g);
        dest.writeSerializable(this.f100474h);
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = this.i;
        if (esimSubscriptionPhoneNumberPorting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberPorting.writeToParcel(dest, i);
        }
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = this.f100475j;
        if (esimSubscriptionPhoneNumberPortOutEligibility == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberPortOutEligibility.writeToParcel(dest, i);
        }
    }
}
