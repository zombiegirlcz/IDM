package com.revolut.feature.external_accounts.api;

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

/* JADX INFO: loaded from: classes3.dex */
public final class CrossBorderOpenBankingApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/api/CrossBorderOpenBankingApi$Toggles$CrossBorderInstitutionFlowImprovements;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CrossBorderInstitutionFlowImprovements extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CrossBorderInstitutionFlowImprovements f72200c = new CrossBorderInstitutionFlowImprovements();

        @NotNull
        public static final Parcelable.Creator<CrossBorderInstitutionFlowImprovements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CrossBorderInstitutionFlowImprovements.f72200c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossBorderInstitutionFlowImprovements[i];
            }
        }

        private CrossBorderInstitutionFlowImprovements() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("crossBorderInstitutionFlowImprovements");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/api/CrossBorderOpenBankingApi$Toggles$CrossBorderOpenBankingEnabled;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CrossBorderOpenBankingEnabled extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CrossBorderOpenBankingEnabled f72201c = new CrossBorderOpenBankingEnabled();

        @NotNull
        public static final Parcelable.Creator<CrossBorderOpenBankingEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CrossBorderOpenBankingEnabled.f72201c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossBorderOpenBankingEnabled[i];
            }
        }

        private CrossBorderOpenBankingEnabled() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("crossBorderOB");
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

    private CrossBorderOpenBankingApi$Toggles() {
    }

    public static List a() {
        return v.k(CrossBorderOpenBankingEnabled.f72201c, CrossBorderInstitutionFlowImprovements.f72200c);
    }
}
