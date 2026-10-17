package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeEntryDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChargeEntryDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChargeEntryDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104730b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChargeEntryDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChargeEntryDetails[i];
        }
    }

    public ChargeEntryDetails(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f104729a = title;
        this.f104730b = deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChargeEntryDetails)) {
            return false;
        }
        ChargeEntryDetails chargeEntryDetails = (ChargeEntryDetails) obj2;
        return Intrinsics.f(this.f104729a, chargeEntryDetails.f104729a) && Intrinsics.f(this.f104730b, chargeEntryDetails.f104730b);
    }

    public final int hashCode() {
        return this.f104730b.hashCode() + (this.f104729a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104729a);
        dest.writeString(this.f104730b);
    }
}
