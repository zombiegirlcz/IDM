package com.revolut.feature.revolutpay.promoted_merchants.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/api/navigation/PromotedMerchantsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_revolut_pay_promoted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotedMerchantsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PromotedMerchantsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputData f84666a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/api/navigation/PromotedMerchantsDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_promoted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84669c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(boolean z, boolean z3, boolean z4, boolean z6) {
            this.f84667a = z;
            this.f84668b = z3;
            this.f84669c = z4;
            this.d = z6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return this.f84667a == inputData.f84667a && this.f84668b == inputData.f84668b && this.f84669c == inputData.f84669c && this.d == inputData.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f84667a) * 31, 31, this.f84668b), 31, this.f84669c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f84667a ? 1 : 0);
            dest.writeInt(this.f84668b ? 1 : 0);
            dest.writeInt(this.f84669c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromotedMerchantsDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromotedMerchantsDestination[i];
        }
    }

    public PromotedMerchantsDestination(InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f84666a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PromotedMerchantsDestination) && Intrinsics.f(this.f84666a, ((PromotedMerchantsDestination) obj2).f84666a);
    }

    public final int hashCode() {
        return this.f84666a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84666a.writeToParcel(dest, i);
    }
}
