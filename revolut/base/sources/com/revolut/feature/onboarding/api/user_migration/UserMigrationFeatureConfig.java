package com.revolut.feature.onboarding.api.user_migration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/UserMigrationFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "UserMigrationDestination", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserMigrationFeatureConfig extends KompotBridgeFeatureConfig {
    public UserMigrationFeatureConfig() {
        this(7, null, null);
    }

    public UserMigrationFeatureConfig(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        super((ActivityAnimation) null, (ParcelableDestination) new UserMigrationDestination((i & 2) != 0 ? null : textLocalisedClause, (i & 4) != 0 ? null : textLocalisedClause2), false, (Integer) null, 0, 60);
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/UserMigrationFeatureConfig$UserMigrationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserMigrationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<UserMigrationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f78223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f78224b;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserMigrationDestination((Clause) parcel.readParcelable(UserMigrationDestination.class.getClassLoader()), (Clause) parcel.readParcelable(UserMigrationDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserMigrationDestination[i];
            }
        }

        public UserMigrationDestination(Clause clause, Clause clause2) {
            this.f78223a = clause;
            this.f78224b = clause2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserMigrationDestination)) {
                return false;
            }
            UserMigrationDestination userMigrationDestination = (UserMigrationDestination) obj2;
            return Intrinsics.f(this.f78223a, userMigrationDestination.f78223a) && Intrinsics.f(this.f78224b, userMigrationDestination.f78224b);
        }

        public final int hashCode() {
            Clause clause = this.f78223a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f78224b;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78223a, i);
            dest.writeParcelable(this.f78224b, i);
        }

        public UserMigrationDestination() {
            this(null, null);
        }
    }
}
