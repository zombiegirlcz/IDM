package com.revolut.feature.topup_screen.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/topup_screen/common/CardDetails;", "Landroid/os/Parcelable;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpireDateFormatter$CardExpire f90567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90568c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDetails(parcel.readString(), ExpireDateFormatter$CardExpire.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDetails[i];
        }
    }

    public CardDetails(String cardNumber, ExpireDateFormatter$CardExpire expiryDate, String cardCvv, String str) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(cardCvv, "cardCvv");
        this.f90566a = cardNumber;
        this.f90567b = expiryDate;
        this.f90568c = cardCvv;
        this.d = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF90566a() {
        return this.f90566a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ExpireDateFormatter$CardExpire getF90567b() {
        return this.f90567b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) obj2;
        return Intrinsics.f(this.f90566a, cardDetails.f90566a) && Intrinsics.f(this.f90567b, cardDetails.f90567b) && Intrinsics.f(this.f90568c, cardDetails.f90568c) && Intrinsics.f(this.d, cardDetails.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f90567b.hashCode() + (this.f90566a.hashCode() * 31)) * 31, 31, this.f90568c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("CardDetails(cardNumber=****, expiryDate=**, cardCvv=***, ");
        sb6.append("postalCode=" + this.d);
        sb6.append(")");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90566a);
        this.f90567b.writeToParcel(dest, i);
        dest.writeString(this.f90568c);
        dest.writeString(this.d);
    }
}
