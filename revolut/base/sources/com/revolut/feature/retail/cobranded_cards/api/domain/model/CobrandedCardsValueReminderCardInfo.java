package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderCardInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderCardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderCardInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsValueReminderCardInfoDetails f82465c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsValueReminderCardInfoItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsValueReminderCardInfo(string, arrayList, parcel.readInt() == 0 ? null : CobrandedCardsValueReminderCardInfoDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderCardInfo[i];
        }
    }

    public CobrandedCardsValueReminderCardInfo(String title, ArrayList items, CobrandedCardsValueReminderCardInfoDetails cobrandedCardsValueReminderCardInfoDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f82463a = title;
        this.f82464b = items;
        this.f82465c = cobrandedCardsValueReminderCardInfoDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderCardInfo)) {
            return false;
        }
        CobrandedCardsValueReminderCardInfo cobrandedCardsValueReminderCardInfo = (CobrandedCardsValueReminderCardInfo) obj2;
        return Intrinsics.f(this.f82463a, cobrandedCardsValueReminderCardInfo.f82463a) && this.f82464b.equals(cobrandedCardsValueReminderCardInfo.f82464b) && Intrinsics.f(this.f82465c, cobrandedCardsValueReminderCardInfo.f82465c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f82464b, this.f82463a.hashCode() * 31, 31);
        CobrandedCardsValueReminderCardInfoDetails cobrandedCardsValueReminderCardInfoDetails = this.f82465c;
        return iB + (cobrandedCardsValueReminderCardInfoDetails == null ? 0 : cobrandedCardsValueReminderCardInfoDetails.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82463a);
        Iterator itY = j6.a.y(this.f82464b, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsValueReminderCardInfoItem) itY.next()).writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderCardInfoDetails cobrandedCardsValueReminderCardInfoDetails = this.f82465c;
        if (cobrandedCardsValueReminderCardInfoDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderCardInfoDetails.writeToParcel(dest, i);
        }
    }
}
