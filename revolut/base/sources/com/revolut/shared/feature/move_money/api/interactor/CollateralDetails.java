package com.revolut.shared.feature.move_money.api.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/interactor/CollateralDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollateralDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollateralDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f104795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f104796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f104797c;
    public final BigDecimal d;
    public final BigDecimal e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollateralDetails((b) parcel.readSerializable(), i8l.a.a(parcel), i8l.a.a(parcel), i8l.a.a(parcel), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollateralDetails[i];
        }
    }

    public CollateralDetails(b currency, BigDecimal totalCollateralBalance, BigDecimal totalUnrealizedPnl, BigDecimal portfolioMaintenanceMargin, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalCollateralBalance, "totalCollateralBalance");
        Intrinsics.checkNotNullParameter(totalUnrealizedPnl, "totalUnrealizedPnl");
        Intrinsics.checkNotNullParameter(portfolioMaintenanceMargin, "portfolioMaintenanceMargin");
        this.f104795a = currency;
        this.f104796b = totalCollateralBalance;
        this.f104797c = totalUnrealizedPnl;
        this.d = portfolioMaintenanceMargin;
        this.e = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollateralDetails)) {
            return false;
        }
        CollateralDetails collateralDetails = (CollateralDetails) obj2;
        return Intrinsics.f(this.f104795a, collateralDetails.f104795a) && Intrinsics.f(this.f104796b, collateralDetails.f104796b) && Intrinsics.f(this.f104797c, collateralDetails.f104797c) && Intrinsics.f(this.d, collateralDetails.d) && Intrinsics.f(this.e, collateralDetails.e);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.d, t61.a.d(this.f104797c, t61.a.d(this.f104796b, this.f104795a.hashCode() * 31, 31), 31), 31);
        BigDecimal bigDecimal = this.e;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104795a);
        i8l.a.b(this.f104796b, dest);
        i8l.a.b(this.f104797c, dest);
        i8l.a.b(this.d, dest);
        dest.writeSerializable(this.e);
    }
}
