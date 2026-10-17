package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoRewardInfoItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoRewardInfoItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoRewardInfoItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82396c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanHubInfoRewardInfoItemLink.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new CobrandedCardsPlanHubInfoRewardInfoItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoRewardInfoItem[i];
        }
    }

    public CobrandedCardsPlanHubInfoRewardInfoItem(String title, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82394a = title;
        this.f82395b = str;
        this.f82396c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoRewardInfoItem)) {
            return false;
        }
        CobrandedCardsPlanHubInfoRewardInfoItem cobrandedCardsPlanHubInfoRewardInfoItem = (CobrandedCardsPlanHubInfoRewardInfoItem) obj2;
        return Intrinsics.f(this.f82394a, cobrandedCardsPlanHubInfoRewardInfoItem.f82394a) && Intrinsics.f(this.f82395b, cobrandedCardsPlanHubInfoRewardInfoItem.f82395b) && Intrinsics.f(this.f82396c, cobrandedCardsPlanHubInfoRewardInfoItem.f82396c);
    }

    public final int hashCode() {
        int iHashCode = this.f82394a.hashCode() * 31;
        String str = this.f82395b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f82396c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82394a);
        dest.writeString(this.f82395b);
        List list = this.f82396c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((CobrandedCardsPlanHubInfoRewardInfoItemLink) itQ.next()).writeToParcel(dest, i);
        }
    }
}
