package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanAdditionalValueRow implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanAdditionalValueRow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPlanAdditionalValueRowContent f82322b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanAdditionalValueRow(parcel.readString(), (CobrandedCardsPlanAdditionalValueRowContent) parcel.readParcelable(CobrandedCardsPlanAdditionalValueRow.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanAdditionalValueRow[i];
        }
    }

    public CobrandedCardsPlanAdditionalValueRow(String label, CobrandedCardsPlanAdditionalValueRowContent content) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f82321a = label;
        this.f82322b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanAdditionalValueRow)) {
            return false;
        }
        CobrandedCardsPlanAdditionalValueRow cobrandedCardsPlanAdditionalValueRow = (CobrandedCardsPlanAdditionalValueRow) obj2;
        return Intrinsics.f(this.f82321a, cobrandedCardsPlanAdditionalValueRow.f82321a) && Intrinsics.f(this.f82322b, cobrandedCardsPlanAdditionalValueRow.f82322b);
    }

    public final int hashCode() {
        return this.f82322b.hashCode() + (this.f82321a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82321a);
        dest.writeParcelable(this.f82322b, i);
    }
}
