package com.revolut.feature.credit.card.api.models.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/settings/CreditCardSettings$Action", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardSettings$Action implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardSettings$Action> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68860b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardSettings$Action(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardSettings$Action[i];
        }
    }

    public CreditCardSettings$Action(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f68859a = text;
        this.f68860b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardSettings$Action)) {
            return false;
        }
        CreditCardSettings$Action creditCardSettings$Action = (CreditCardSettings$Action) obj2;
        return Intrinsics.f(this.f68859a, creditCardSettings$Action.f68859a) && Intrinsics.f(this.f68860b, creditCardSettings$Action.f68860b);
    }

    public final int hashCode() {
        int iHashCode = this.f68859a.hashCode() * 31;
        String str = this.f68860b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68859a);
        dest.writeString(this.f68860b);
    }
}
