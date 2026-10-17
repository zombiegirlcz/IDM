package com.revolut.feature_move_money.impl.topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/topup/MoveMoneyTopupScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyTopupScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyTopupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartUpPocket f97413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f97415c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StartUpPocket startUpPocket = (StartUpPocket) parcel.readParcelable(MoveMoneyTopupScreenContract$InputData.class.getClassLoader());
            d dVar = (d) parcel.readSerializable();
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(MoveMoneyTopupScreenContract$InputData.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new MoveMoneyTopupScreenContract$InputData(startUpPocket, dVar, analyticsProduct, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyTopupScreenContract$InputData[i];
        }
    }

    public MoveMoneyTopupScreenContract$InputData(StartUpPocket targetPocket, d dVar, AnalyticsProduct analyticsProduct, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97413a = targetPocket;
        this.f97414b = dVar;
        this.f97415c = analyticsProduct;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyTopupScreenContract$InputData)) {
            return false;
        }
        MoveMoneyTopupScreenContract$InputData moveMoneyTopupScreenContract$InputData = (MoveMoneyTopupScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97413a, moveMoneyTopupScreenContract$InputData.f97413a) && Intrinsics.f(this.f97414b, moveMoneyTopupScreenContract$InputData.f97414b) && Intrinsics.f(this.f97415c, moveMoneyTopupScreenContract$InputData.f97415c) && this.d == moveMoneyTopupScreenContract$InputData.d && this.e == moveMoneyTopupScreenContract$InputData.e;
    }

    public final int hashCode() {
        int iHashCode = this.f97413a.hashCode() * 31;
        d dVar = this.f97414b;
        return Boolean.hashCode(this.e) + j6.a.c(l.a((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f97415c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97413a, i);
        dest.writeSerializable(this.f97414b);
        dest.writeParcelable(this.f97415c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
