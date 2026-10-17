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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderActionConfirmationSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderActionConfirmationSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderActionConfirmationSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82458a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsValueReminderActionConfirmationItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsValueReminderActionConfirmationSection(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderActionConfirmationSection[i];
        }
    }

    public CobrandedCardsValueReminderActionConfirmationSection(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f82458a = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CobrandedCardsValueReminderActionConfirmationSection) && Intrinsics.f(this.f82458a, ((CobrandedCardsValueReminderActionConfirmationSection) obj2).f82458a);
    }

    public final int hashCode() {
        return this.f82458a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f82458a, dest);
        while (itV.hasNext()) {
            ((CobrandedCardsValueReminderActionConfirmationItem) itV.next()).writeToParcel(dest, i);
        }
    }
}
