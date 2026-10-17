package com.revolut.feature.credit.direct.debit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/credit/direct/debit/navigation/DirectDebitFeatureConfig$Guarantee$NavigationDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitFeatureConfig$Guarantee$NavigationDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DirectDebitFeatureConfig$Guarantee$NavigationDestination f69911a = new DirectDebitFeatureConfig$Guarantee$NavigationDestination();

    @NotNull
    public static final Parcelable.Creator<DirectDebitFeatureConfig$Guarantee$NavigationDestination> CREATOR = new a();

    /* JADX INFO: loaded from: classes22.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return DirectDebitFeatureConfig$Guarantee$NavigationDestination.f69911a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitFeatureConfig$Guarantee$NavigationDestination[i];
        }
    }

    private DirectDebitFeatureConfig$Guarantee$NavigationDestination() {
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
