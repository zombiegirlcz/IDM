package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoRewardInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "r5b/k", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoRewardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoRewardInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f82391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82393c;
    public final ArrayList d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            k kVarValueOf = k.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanHubInfoRewardInfoItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsPlanHubInfoRewardInfo(kVarValueOf, string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoRewardInfo[i];
        }
    }

    public CobrandedCardsPlanHubInfoRewardInfo(k style, String title, String str, ArrayList items, String str2) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f82391a = style;
        this.f82392b = title;
        this.f82393c = str;
        this.d = items;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoRewardInfo)) {
            return false;
        }
        CobrandedCardsPlanHubInfoRewardInfo cobrandedCardsPlanHubInfoRewardInfo = (CobrandedCardsPlanHubInfoRewardInfo) obj2;
        return this.f82391a == cobrandedCardsPlanHubInfoRewardInfo.f82391a && Intrinsics.f(this.f82392b, cobrandedCardsPlanHubInfoRewardInfo.f82392b) && Intrinsics.f(this.f82393c, cobrandedCardsPlanHubInfoRewardInfo.f82393c) && this.d.equals(cobrandedCardsPlanHubInfoRewardInfo.d) && Intrinsics.f(this.e, cobrandedCardsPlanHubInfoRewardInfo.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82391a.hashCode() * 31, 31, this.f82392b);
        String str = this.f82393c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82391a.name());
        dest.writeString(this.f82392b);
        dest.writeString(this.f82393c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsPlanHubInfoRewardInfoItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.e);
    }
}
