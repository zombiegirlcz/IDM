package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoRewardChallenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoRewardChallenge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoRewardChallenge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82388c;
    public final String d;
    public final Float e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoRewardInfo f82389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82390h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoRewardChallenge(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0, parcel.readInt() != 0 ? CobrandedCardsPlanHubInfoRewardInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoRewardChallenge[i];
        }
    }

    public CobrandedCardsPlanHubInfoRewardChallenge(String title, String str, String icon, String str2, Float f, boolean z, CobrandedCardsPlanHubInfoRewardInfo cobrandedCardsPlanHubInfoRewardInfo, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f82386a = title;
        this.f82387b = str;
        this.f82388c = icon;
        this.d = str2;
        this.e = f;
        this.f = z;
        this.f82389g = cobrandedCardsPlanHubInfoRewardInfo;
        this.f82390h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoRewardChallenge)) {
            return false;
        }
        CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge = (CobrandedCardsPlanHubInfoRewardChallenge) obj2;
        return Intrinsics.f(this.f82386a, cobrandedCardsPlanHubInfoRewardChallenge.f82386a) && Intrinsics.f(this.f82387b, cobrandedCardsPlanHubInfoRewardChallenge.f82387b) && Intrinsics.f(this.f82388c, cobrandedCardsPlanHubInfoRewardChallenge.f82388c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoRewardChallenge.d) && Intrinsics.f(this.e, cobrandedCardsPlanHubInfoRewardChallenge.e) && this.f == cobrandedCardsPlanHubInfoRewardChallenge.f && Intrinsics.f(this.f82389g, cobrandedCardsPlanHubInfoRewardChallenge.f82389g) && Intrinsics.f(this.f82390h, cobrandedCardsPlanHubInfoRewardChallenge.f82390h);
    }

    public final int hashCode() {
        int iHashCode = this.f82386a.hashCode() * 31;
        String str = this.f82387b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f82388c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.e;
        int iC2 = j6.a.c((iHashCode2 + (f == null ? 0 : f.hashCode())) * 31, 31, this.f);
        CobrandedCardsPlanHubInfoRewardInfo cobrandedCardsPlanHubInfoRewardInfo = this.f82389g;
        int iHashCode3 = (iC2 + (cobrandedCardsPlanHubInfoRewardInfo == null ? 0 : cobrandedCardsPlanHubInfoRewardInfo.hashCode())) * 31;
        String str3 = this.f82390h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82386a);
        dest.writeString(this.f82387b);
        dest.writeString(this.f82388c);
        dest.writeString(this.d);
        Float f = this.e;
        if (f == null) {
            dest.writeInt(0);
        } else {
            b.p(dest, 1, f);
        }
        dest.writeInt(this.f ? 1 : 0);
        CobrandedCardsPlanHubInfoRewardInfo cobrandedCardsPlanHubInfoRewardInfo = this.f82389g;
        if (cobrandedCardsPlanHubInfoRewardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoRewardInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.f82390h);
    }
}
