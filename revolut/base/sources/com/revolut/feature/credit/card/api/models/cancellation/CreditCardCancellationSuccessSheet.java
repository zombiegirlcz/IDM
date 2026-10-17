package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/CreditCardCancellationSuccessSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationSuccessSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationSuccessSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68714b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellationSuccessSheet(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationSuccessSheet[i];
        }
    }

    public CreditCardCancellationSuccessSheet(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f68713a = title;
        this.f68714b = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationSuccessSheet)) {
            return false;
        }
        CreditCardCancellationSuccessSheet creditCardCancellationSuccessSheet = (CreditCardCancellationSuccessSheet) obj2;
        return Intrinsics.f(this.f68713a, creditCardCancellationSuccessSheet.f68713a) && Intrinsics.f(this.f68714b, creditCardCancellationSuccessSheet.f68714b);
    }

    public final int hashCode() {
        return this.f68714b.hashCode() + (this.f68713a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68713a);
        dest.writeString(this.f68714b);
    }
}
