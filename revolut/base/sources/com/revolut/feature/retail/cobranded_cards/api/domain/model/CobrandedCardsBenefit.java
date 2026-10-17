package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsBenefit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsBenefit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsBenefit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsBenefitInformation f82295c;
    public final Boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            CobrandedCardsBenefitInformation cobrandedCardsBenefitInformationCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsBenefitInformation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CobrandedCardsBenefit(string, string2, cobrandedCardsBenefitInformationCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsBenefit[i];
        }
    }

    public CobrandedCardsBenefit(String icon, String description, CobrandedCardsBenefitInformation cobrandedCardsBenefitInformation, Boolean bool) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f82293a = icon;
        this.f82294b = description;
        this.f82295c = cobrandedCardsBenefitInformation;
        this.d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsBenefit)) {
            return false;
        }
        CobrandedCardsBenefit cobrandedCardsBenefit = (CobrandedCardsBenefit) obj2;
        return Intrinsics.f(this.f82293a, cobrandedCardsBenefit.f82293a) && Intrinsics.f(this.f82294b, cobrandedCardsBenefit.f82294b) && Intrinsics.f(this.f82295c, cobrandedCardsBenefit.f82295c) && Intrinsics.f(this.d, cobrandedCardsBenefit.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82293a.hashCode() * 31, 31, this.f82294b);
        CobrandedCardsBenefitInformation cobrandedCardsBenefitInformation = this.f82295c;
        int iHashCode = (iC + (cobrandedCardsBenefitInformation == null ? 0 : cobrandedCardsBenefitInformation.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82293a);
        dest.writeString(this.f82294b);
        CobrandedCardsBenefitInformation cobrandedCardsBenefitInformation = this.f82295c;
        if (cobrandedCardsBenefitInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsBenefitInformation.writeToParcel(dest, i);
        }
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
