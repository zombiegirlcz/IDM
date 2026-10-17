package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardButtonsModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardButtonsModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardButtonsModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardLargeButtonModel f68826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardLargeButtonModel f68827b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<CreditCardLargeButtonModel> creator = CreditCardLargeButtonModel.CREATOR;
            return new CreditCardButtonsModel(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardButtonsModel[i];
        }
    }

    public CreditCardButtonsModel(CreditCardLargeButtonModel primary, CreditCardLargeButtonModel creditCardLargeButtonModel) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f68826a = primary;
        this.f68827b = creditCardLargeButtonModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardButtonsModel)) {
            return false;
        }
        CreditCardButtonsModel creditCardButtonsModel = (CreditCardButtonsModel) obj2;
        return Intrinsics.f(this.f68826a, creditCardButtonsModel.f68826a) && Intrinsics.f(this.f68827b, creditCardButtonsModel.f68827b);
    }

    public final int hashCode() {
        int iHashCode = this.f68826a.hashCode() * 31;
        CreditCardLargeButtonModel creditCardLargeButtonModel = this.f68827b;
        return iHashCode + (creditCardLargeButtonModel == null ? 0 : creditCardLargeButtonModel.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68826a.writeToParcel(dest, i);
        CreditCardLargeButtonModel creditCardLargeButtonModel = this.f68827b;
        if (creditCardLargeButtonModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardLargeButtonModel.writeToParcel(dest, i);
        }
    }
}
