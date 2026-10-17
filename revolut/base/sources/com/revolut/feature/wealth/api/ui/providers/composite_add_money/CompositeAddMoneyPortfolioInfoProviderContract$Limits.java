package com.revolut.feature.wealth.api.ui.providers.composite_add_money;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/api/ui/providers/composite_add_money/CompositeAddMoneyPortfolioInfoProviderContract$Limits", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompositeAddMoneyPortfolioInfoProviderContract$Limits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CompositeAddMoneyPortfolioInfoProviderContract$Limits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95369c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CompositeAddMoneyPortfolioInfoProviderContract$Limits((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompositeAddMoneyPortfolioInfoProviderContract$Limits[i];
        }
    }

    public CompositeAddMoneyPortfolioInfoProviderContract$Limits(d minOneOffDeposit, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(minOneOffDeposit, "minOneOffDeposit");
        this.f95367a = minOneOffDeposit;
        this.f95368b = dVar;
        this.f95369c = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CompositeAddMoneyPortfolioInfoProviderContract$Limits)) {
            return false;
        }
        CompositeAddMoneyPortfolioInfoProviderContract$Limits compositeAddMoneyPortfolioInfoProviderContract$Limits = (CompositeAddMoneyPortfolioInfoProviderContract$Limits) obj2;
        return Intrinsics.f(this.f95367a, compositeAddMoneyPortfolioInfoProviderContract$Limits.f95367a) && Intrinsics.f(this.f95368b, compositeAddMoneyPortfolioInfoProviderContract$Limits.f95368b) && Intrinsics.f(this.f95369c, compositeAddMoneyPortfolioInfoProviderContract$Limits.f95369c);
    }

    public final int hashCode() {
        int iHashCode = this.f95367a.hashCode() * 31;
        d dVar = this.f95368b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f95369c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95367a);
        dest.writeSerializable(this.f95368b);
        dest.writeSerializable(this.f95369c);
    }
}
