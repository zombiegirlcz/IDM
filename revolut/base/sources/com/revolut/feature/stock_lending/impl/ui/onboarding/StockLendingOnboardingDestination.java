package com.revolut.feature.stock_lending.impl.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/onboarding/StockLendingOnboardingDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockLendingOnboardingDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StockLendingOnboardingDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockLendingOnboardingContract$Configuration f88402b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockLendingOnboardingDestination(StockLendingOnboardingContract$Configuration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockLendingOnboardingDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockLendingOnboardingDestination(StockLendingOnboardingContract$Configuration configuration) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f88402b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof StockLendingOnboardingDestination) && Intrinsics.f(this.f88402b, ((StockLendingOnboardingDestination) obj2).f88402b);
    }

    public final int hashCode() {
        return this.f88402b.f88401a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88402b.writeToParcel(dest, i);
    }
}
