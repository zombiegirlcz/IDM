package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsTransactionBadge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsTransactionBadge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsTransactionBadge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f82430c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsTransactionBadge(parcel.readString(), parcel.readString(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsTransactionBadge[i];
        }
    }

    public CobrandedCardsTransactionBadge(String str, String text, l planTier) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f82428a = str;
        this.f82429b = text;
        this.f82430c = planTier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsTransactionBadge)) {
            return false;
        }
        CobrandedCardsTransactionBadge cobrandedCardsTransactionBadge = (CobrandedCardsTransactionBadge) obj2;
        return Intrinsics.f(this.f82428a, cobrandedCardsTransactionBadge.f82428a) && Intrinsics.f(this.f82429b, cobrandedCardsTransactionBadge.f82429b) && this.f82430c == cobrandedCardsTransactionBadge.f82430c;
    }

    public final int hashCode() {
        String str = this.f82428a;
        return this.f82430c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f82429b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82428a);
        dest.writeString(this.f82429b);
        dest.writeString(this.f82430c.name());
    }
}
