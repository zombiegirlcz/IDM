package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardLargeButtonModel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModel;", "", "toString", "()Ljava/lang/String;", "tl4/a", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardLargeButtonModel implements CreditCardModel {

    @NotNull
    public static final Parcelable.Creator<CreditCardLargeButtonModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardModelAction f68845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl4.a f68846c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardLargeButtonModel(parcel.readString(), (CreditCardModelAction) parcel.readParcelable(CreditCardLargeButtonModel.class.getClassLoader()), tl4.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardLargeButtonModel[i];
        }
    }

    public CreditCardLargeButtonModel(String title, CreditCardModelAction creditCardModelAction, tl4.a style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f68844a = title;
        this.f68845b = creditCardModelAction;
        this.f68846c = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardLargeButtonModel)) {
            return false;
        }
        CreditCardLargeButtonModel creditCardLargeButtonModel = (CreditCardLargeButtonModel) obj2;
        return Intrinsics.f(this.f68844a, creditCardLargeButtonModel.f68844a) && Intrinsics.f(this.f68845b, creditCardLargeButtonModel.f68845b) && this.f68846c == creditCardLargeButtonModel.f68846c;
    }

    public final int hashCode() {
        int iHashCode = this.f68844a.hashCode() * 31;
        CreditCardModelAction creditCardModelAction = this.f68845b;
        return this.f68846c.hashCode() + ((iHashCode + (creditCardModelAction == null ? 0 : creditCardModelAction.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68844a);
        dest.writeParcelable(this.f68845b, i);
        dest.writeString(this.f68846c.name());
    }
}
