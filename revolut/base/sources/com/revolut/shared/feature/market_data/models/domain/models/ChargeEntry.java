package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeEntry;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChargeEntry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChargeEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104727c;
    public final ChargeEntryDetails d;
    public final Amount e;
    public final Amount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Amount f104728g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ChargeEntryDetails chargeEntryDetailsCreateFromParcel = parcel.readInt() == 0 ? null : ChargeEntryDetails.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<Amount> creator = Amount.CREATOR;
            return new ChargeEntry(string, string2, string3, chargeEntryDetailsCreateFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChargeEntry[i];
        }
    }

    public ChargeEntry(String title, String shortDescription, String description, ChargeEntryDetails chargeEntryDetails, Amount amount, Amount amount2, Amount amount3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f104725a = title;
        this.f104726b = shortDescription;
        this.f104727c = description;
        this.d = chargeEntryDetails;
        this.e = amount;
        this.f = amount2;
        this.f104728g = amount3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChargeEntry)) {
            return false;
        }
        ChargeEntry chargeEntry = (ChargeEntry) obj2;
        return Intrinsics.f(this.f104725a, chargeEntry.f104725a) && Intrinsics.f(this.f104726b, chargeEntry.f104726b) && Intrinsics.f(this.f104727c, chargeEntry.f104727c) && Intrinsics.f(this.d, chargeEntry.d) && Intrinsics.f(this.e, chargeEntry.e) && Intrinsics.f(this.f, chargeEntry.f) && Intrinsics.f(this.f104728g, chargeEntry.f104728g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f104725a.hashCode() * 31, 31, this.f104726b), 31, this.f104727c);
        ChargeEntryDetails chargeEntryDetails = this.d;
        int iD = y.d(this.e, (iC + (chargeEntryDetails == null ? 0 : chargeEntryDetails.hashCode())) * 31, 31);
        Amount amount = this.f;
        int iHashCode = (iD + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.f104728g;
        return iHashCode + (amount2 != null ? amount2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104725a);
        dest.writeString(this.f104726b);
        dest.writeString(this.f104727c);
        ChargeEntryDetails chargeEntryDetails = this.d;
        if (chargeEntryDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            chargeEntryDetails.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        Amount amount = this.f;
        if (amount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount.writeToParcel(dest, i);
        }
        Amount amount2 = this.f104728g;
        if (amount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount2.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ ChargeEntry(String str, String str2, String str3, Amount amount, Amount amount2) {
        this(str, str2, str3, null, amount, amount2, null);
    }
}
