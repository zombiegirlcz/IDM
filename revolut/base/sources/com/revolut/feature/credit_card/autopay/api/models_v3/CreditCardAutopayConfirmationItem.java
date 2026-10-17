package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayConfirmationItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopayConfirmationItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopayConfirmationItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f70699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70701c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAutopayConfirmationItem(parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopayConfirmationItem[i];
        }
    }

    public CreditCardAutopayConfirmationItem(a1 a1Var, String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f70699a = a1Var;
        this.f70700b = title;
        this.f70701c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopayConfirmationItem)) {
            return false;
        }
        CreditCardAutopayConfirmationItem creditCardAutopayConfirmationItem = (CreditCardAutopayConfirmationItem) obj2;
        return this.f70699a == creditCardAutopayConfirmationItem.f70699a && Intrinsics.f(this.f70700b, creditCardAutopayConfirmationItem.f70700b) && Intrinsics.f(this.f70701c, creditCardAutopayConfirmationItem.f70701c);
    }

    public final int hashCode() {
        a1 a1Var = this.f70699a;
        int iC = p.a.c((a1Var == null ? 0 : a1Var.hashCode()) * 31, 31, this.f70700b);
        String str = this.f70701c;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a1 a1Var = this.f70699a;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        dest.writeString(this.f70700b);
        dest.writeString(this.f70701c);
    }
}
