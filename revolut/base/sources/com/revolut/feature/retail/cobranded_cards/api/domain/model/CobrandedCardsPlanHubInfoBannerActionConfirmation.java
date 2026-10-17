package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerActionConfirmation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoBannerActionConfirmation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoBannerActionConfirmation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82351c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoBannerActionConfirmation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoBannerActionConfirmation[i];
        }
    }

    public CobrandedCardsPlanHubInfoBannerActionConfirmation(String title, String subtitle, String confirmActionText, String cancelActionText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmActionText, "confirmActionText");
        Intrinsics.checkNotNullParameter(cancelActionText, "cancelActionText");
        this.f82349a = title;
        this.f82350b = subtitle;
        this.f82351c = confirmActionText;
        this.d = cancelActionText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoBannerActionConfirmation)) {
            return false;
        }
        CobrandedCardsPlanHubInfoBannerActionConfirmation cobrandedCardsPlanHubInfoBannerActionConfirmation = (CobrandedCardsPlanHubInfoBannerActionConfirmation) obj2;
        return Intrinsics.f(this.f82349a, cobrandedCardsPlanHubInfoBannerActionConfirmation.f82349a) && Intrinsics.f(this.f82350b, cobrandedCardsPlanHubInfoBannerActionConfirmation.f82350b) && Intrinsics.f(this.f82351c, cobrandedCardsPlanHubInfoBannerActionConfirmation.f82351c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoBannerActionConfirmation.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f82349a.hashCode() * 31, 31, this.f82350b), 31, this.f82351c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82349a);
        dest.writeString(this.f82350b);
        dest.writeString(this.f82351c);
        dest.writeString(this.d);
    }
}
