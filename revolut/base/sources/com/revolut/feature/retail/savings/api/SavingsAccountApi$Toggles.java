package com.revolut.feature.retail.savings.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class SavingsAccountApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/SavingsAccountApi$Toggles$SavingsMoneyboxAgnosticApi;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavingsMoneyboxAgnosticApi extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SavingsMoneyboxAgnosticApi f83073c = new SavingsMoneyboxAgnosticApi();

        @NotNull
        public static final Parcelable.Creator<SavingsMoneyboxAgnosticApi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SavingsMoneyboxAgnosticApi.f83073c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsMoneyboxAgnosticApi[i];
            }
        }

        private SavingsMoneyboxAgnosticApi() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("savingsMoneyBoxAgnosticApi");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/SavingsAccountApi$Toggles$SavingsUnder18NewFetchingApi;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavingsUnder18NewFetchingApi extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SavingsUnder18NewFetchingApi f83074c = new SavingsUnder18NewFetchingApi();

        @NotNull
        public static final Parcelable.Creator<SavingsUnder18NewFetchingApi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SavingsUnder18NewFetchingApi.f83074c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsUnder18NewFetchingApi[i];
            }
        }

        private SavingsUnder18NewFetchingApi() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("savingsUnder18NewFetchingApi");
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

    private SavingsAccountApi$Toggles() {
    }

    public static List a() {
        return v.k(SavingsMoneyboxAgnosticApi.f83073c, SavingsUnder18NewFetchingApi.f83074c);
    }
}
