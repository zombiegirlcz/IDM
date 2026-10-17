package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/AmountSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AmountSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70689c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70690g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountSelection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountSelection[i];
        }
    }

    public AmountSelection(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f70687a = str;
        this.f70688b = str2;
        this.f70689c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f70690g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountSelection)) {
            return false;
        }
        AmountSelection amountSelection = (AmountSelection) obj2;
        return Intrinsics.f(this.f70687a, amountSelection.f70687a) && Intrinsics.f(this.f70688b, amountSelection.f70688b) && Intrinsics.f(this.f70689c, amountSelection.f70689c) && Intrinsics.f(this.d, amountSelection.d) && Intrinsics.f(this.e, amountSelection.e) && Intrinsics.f(this.f, amountSelection.f) && Intrinsics.f(this.f70690g, amountSelection.f70690g);
    }

    public final int hashCode() {
        String str = this.f70687a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70688b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70689c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f70690g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70687a);
        dest.writeString(this.f70688b);
        dest.writeString(this.f70689c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f70690g);
    }
}
