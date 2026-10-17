package com.revolut.feature.wealth.ui.api.navigation.investment_plans_collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/investment_plans_collection/RecurringBuyHubCollectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringBuyHubCollectionDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecurringBuyHubCollectionDestination f95936a = new RecurringBuyHubCollectionDestination();

    @NotNull
    public static final Parcelable.Creator<RecurringBuyHubCollectionDestination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return RecurringBuyHubCollectionDestination.f95936a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringBuyHubCollectionDestination[i];
        }
    }

    private RecurringBuyHubCollectionDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
