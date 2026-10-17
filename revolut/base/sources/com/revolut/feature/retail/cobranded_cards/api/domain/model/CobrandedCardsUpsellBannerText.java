package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsUpsellBannerText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsUpsellBannerText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsUpsellBannerText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82439b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsUpsellBannerTextParam.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsUpsellBannerText(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsUpsellBannerText[i];
        }
    }

    public CobrandedCardsUpsellBannerText(String text, ArrayList params) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f82438a = text;
        this.f82439b = params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsUpsellBannerText)) {
            return false;
        }
        CobrandedCardsUpsellBannerText cobrandedCardsUpsellBannerText = (CobrandedCardsUpsellBannerText) obj2;
        return Intrinsics.f(this.f82438a, cobrandedCardsUpsellBannerText.f82438a) && this.f82439b.equals(cobrandedCardsUpsellBannerText.f82439b);
    }

    public final int hashCode() {
        return this.f82439b.hashCode() + (this.f82438a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82438a);
        Iterator itY = j6.a.y(this.f82439b, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsUpsellBannerTextParam) itY.next()).writeToParcel(dest, i);
        }
    }
}
