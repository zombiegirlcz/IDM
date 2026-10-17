package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82369c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoCard[i];
        }
    }

    public CobrandedCardsPlanHubInfoCard(String str, String title, String deeplink, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f82367a = str;
        this.f82368b = title;
        this.f82369c = deeplink;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoCard)) {
            return false;
        }
        CobrandedCardsPlanHubInfoCard cobrandedCardsPlanHubInfoCard = (CobrandedCardsPlanHubInfoCard) obj2;
        return Intrinsics.f(this.f82367a, cobrandedCardsPlanHubInfoCard.f82367a) && Intrinsics.f(this.f82368b, cobrandedCardsPlanHubInfoCard.f82368b) && Intrinsics.f(this.f82369c, cobrandedCardsPlanHubInfoCard.f82369c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoCard.d);
    }

    public final int hashCode() {
        String str = this.f82367a;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f82368b), 31, this.f82369c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82367a);
        dest.writeString(this.f82368b);
        dest.writeString(this.f82369c);
        dest.writeString(this.d);
    }
}
