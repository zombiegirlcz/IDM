package com.revolut.feature.referrals.promo.api.invitation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/promo/api/invitation/models/RecipientData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_promo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecipientData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f81812c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecipientData(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientData[i];
        }
    }

    public RecipientData(String recipientFirstName, String recipientLastName, b recipientCountry) {
        Intrinsics.checkNotNullParameter(recipientFirstName, "recipientFirstName");
        Intrinsics.checkNotNullParameter(recipientLastName, "recipientLastName");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        this.f81810a = recipientFirstName;
        this.f81811b = recipientLastName;
        this.f81812c = recipientCountry;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientData)) {
            return false;
        }
        RecipientData recipientData = (RecipientData) obj2;
        return Intrinsics.f(this.f81810a, recipientData.f81810a) && Intrinsics.f(this.f81811b, recipientData.f81811b) && Intrinsics.f(this.f81812c, recipientData.f81812c);
    }

    public final int hashCode() {
        return this.f81812c.f297794a.hashCode() + p.a.c(this.f81810a.hashCode() * 31, 31, this.f81811b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81810a);
        dest.writeString(this.f81811b);
        dest.writeSerializable(this.f81812c);
    }
}
