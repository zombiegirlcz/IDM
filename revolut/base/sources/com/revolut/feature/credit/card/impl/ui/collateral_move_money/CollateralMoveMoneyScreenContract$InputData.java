package com.revolut.feature.credit.card.impl.ui.collateral_move_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/collateral_move_money/CollateralMoveMoneyScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollateralMoveMoneyScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CollateralMoveMoneyScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f69167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.credit.card.api.navigation.a f69168c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollateralMoveMoneyScreenContract$InputData(parcel.readString(), (b) parcel.readSerializable(), com.revolut.feature.credit.card.api.navigation.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollateralMoveMoneyScreenContract$InputData[i];
        }
    }

    public CollateralMoveMoneyScreenContract$InputData(String facilityId, b currency, com.revolut.feature.credit.card.api.navigation.a mode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f69166a = facilityId;
        this.f69167b = currency;
        this.f69168c = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollateralMoveMoneyScreenContract$InputData)) {
            return false;
        }
        CollateralMoveMoneyScreenContract$InputData collateralMoveMoneyScreenContract$InputData = (CollateralMoveMoneyScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69166a, collateralMoveMoneyScreenContract$InputData.f69166a) && Intrinsics.f(this.f69167b, collateralMoveMoneyScreenContract$InputData.f69167b) && this.f69168c == collateralMoveMoneyScreenContract$InputData.f69168c;
    }

    public final int hashCode() {
        return this.f69168c.hashCode() + l.j(this.f69167b, this.f69166a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69166a);
        dest.writeSerializable(this.f69167b);
        dest.writeString(this.f69168c.name());
    }
}
