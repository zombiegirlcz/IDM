package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoRewardSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoRewardSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoRewardSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoRewardSectionInfo f82401c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanHubInfoRewardChallenge.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsPlanHubInfoRewardSection(string, arrayList, parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoRewardSectionInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoRewardSection[i];
        }
    }

    public CobrandedCardsPlanHubInfoRewardSection(String sectionTitle, ArrayList challenges, CobrandedCardsPlanHubInfoRewardSectionInfo cobrandedCardsPlanHubInfoRewardSectionInfo, boolean z) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f82399a = sectionTitle;
        this.f82400b = challenges;
        this.f82401c = cobrandedCardsPlanHubInfoRewardSectionInfo;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoRewardSection)) {
            return false;
        }
        CobrandedCardsPlanHubInfoRewardSection cobrandedCardsPlanHubInfoRewardSection = (CobrandedCardsPlanHubInfoRewardSection) obj2;
        return Intrinsics.f(this.f82399a, cobrandedCardsPlanHubInfoRewardSection.f82399a) && this.f82400b.equals(cobrandedCardsPlanHubInfoRewardSection.f82400b) && Intrinsics.f(this.f82401c, cobrandedCardsPlanHubInfoRewardSection.f82401c) && this.d == cobrandedCardsPlanHubInfoRewardSection.d;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f82400b, this.f82399a.hashCode() * 31, 31);
        CobrandedCardsPlanHubInfoRewardSectionInfo cobrandedCardsPlanHubInfoRewardSectionInfo = this.f82401c;
        return Boolean.hashCode(this.d) + ((iB + (cobrandedCardsPlanHubInfoRewardSectionInfo == null ? 0 : cobrandedCardsPlanHubInfoRewardSectionInfo.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82399a);
        Iterator itY = j6.a.y(this.f82400b, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsPlanHubInfoRewardChallenge) itY.next()).writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoRewardSectionInfo cobrandedCardsPlanHubInfoRewardSectionInfo = this.f82401c;
        if (cobrandedCardsPlanHubInfoRewardSectionInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoRewardSectionInfo.writeToParcel(dest, i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
