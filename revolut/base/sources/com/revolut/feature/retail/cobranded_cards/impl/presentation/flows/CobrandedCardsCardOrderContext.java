package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsCardOrderContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsCardOrderContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsCardOrderAction f82516c;
    public final CobrandedCardsCardConfiguration d;
    public final CobrandedCardsCardConfiguration e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsCardOrderContext(parcel.readString(), parcel.readString(), (CobrandedCardsCardOrderAction) parcel.readParcelable(CobrandedCardsCardOrderContext.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CobrandedCardsCardOrderContext.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CobrandedCardsCardOrderContext.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsCardOrderContext[i];
        }
    }

    public CobrandedCardsCardOrderContext(String productId, String tier, CobrandedCardsCardOrderAction action, CobrandedCardsCardConfiguration physicalCardConfiguration, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration, String str) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
        this.f82514a = productId;
        this.f82515b = tier;
        this.f82516c = action;
        this.d = physicalCardConfiguration;
        this.e = cobrandedCardsCardConfiguration;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsCardOrderContext)) {
            return false;
        }
        CobrandedCardsCardOrderContext cobrandedCardsCardOrderContext = (CobrandedCardsCardOrderContext) obj2;
        return Intrinsics.f(this.f82514a, cobrandedCardsCardOrderContext.f82514a) && Intrinsics.f(this.f82515b, cobrandedCardsCardOrderContext.f82515b) && Intrinsics.f(this.f82516c, cobrandedCardsCardOrderContext.f82516c) && Intrinsics.f(this.d, cobrandedCardsCardOrderContext.d) && Intrinsics.f(this.e, cobrandedCardsCardOrderContext.e) && Intrinsics.f(this.f, cobrandedCardsCardOrderContext.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f82516c.hashCode() + p.a.c(this.f82514a.hashCode() * 31, 31, this.f82515b)) * 31)) * 31;
        CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = this.e;
        int iHashCode2 = (iHashCode + (cobrandedCardsCardConfiguration == null ? 0 : cobrandedCardsCardConfiguration.hashCode())) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82514a);
        dest.writeString(this.f82515b);
        dest.writeParcelable(this.f82516c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
    }
}
