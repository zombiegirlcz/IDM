package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Amount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Amount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Amount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f104717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Asset f104718b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Amount((BigDecimal) parcel.readSerializable(), Asset.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Amount[i];
        }
    }

    public Amount(BigDecimal value, Asset asset) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f104717a = value;
        this.f104718b = asset;
    }

    public static Amount a(Amount amount, BigDecimal value) {
        Asset asset = amount.f104718b;
        amount.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new Amount(value, asset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj2;
        return Intrinsics.f(this.f104717a, amount.f104717a) && Intrinsics.f(this.f104718b, amount.f104718b);
    }

    public final int hashCode() {
        return this.f104718b.hashCode() + (this.f104717a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104717a);
        this.f104718b.writeToParcel(dest, i);
    }
}
