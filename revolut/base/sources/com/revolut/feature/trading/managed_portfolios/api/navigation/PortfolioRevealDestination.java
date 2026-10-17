package com.revolut.feature.trading.managed_portfolios.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\tJ\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/api/navigation/PortfolioRevealDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/trading/managed_portfolios/api/navigation/PortfolioRevealDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Laii/e;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_trading_managed_portfolios_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioRevealDestination extends InternalDestination<InputData> implements KompotDestination, e {

    @NotNull
    public static final Parcelable.Creator<PortfolioRevealDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f91234b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/api/navigation/PortfolioRevealDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91236b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(String templateId, String portfolioId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f91235a = templateId;
            this.f91236b = portfolioId;
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
            return Intrinsics.f(this.f91235a, inputData.f91235a) && Intrinsics.f(this.f91236b, inputData.f91236b);
        }

        public final int hashCode() {
            return this.f91236b.hashCode() + (this.f91235a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91235a);
            dest.writeString(this.f91236b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioRevealDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioRevealDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91234b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f91234b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PortfolioRevealDestination) && Intrinsics.f(this.f91234b, ((PortfolioRevealDestination) obj2).f91234b);
    }

    public final int hashCode() {
        return this.f91234b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91234b.writeToParcel(dest, i);
    }
}
