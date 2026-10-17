package com.revolut.feature.subaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/subaccount/api/SubAccountsEditNameFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Destination", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubAccountsEditNameFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subaccount/api/SubAccountsEditNameFeatureConfig$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "EditNameDestination", "Lcom/revolut/feature/subaccount/api/SubAccountsEditNameFeatureConfig$Destination$EditNameDestination;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Destination implements KompotDestination {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/SubAccountsEditNameFeatureConfig$Destination$EditNameDestination;", "Lcom/revolut/feature/subaccount/api/SubAccountsEditNameFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EditNameDestination extends Destination {

            @NotNull
            public static final Parcelable.Creator<EditNameDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f88940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f88941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final SubaccountType f88942c;

            /* JADX INFO: loaded from: classes8.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EditNameDestination((SubaccountType) parcel.readParcelable(EditNameDestination.class.getClassLoader()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EditNameDestination[i];
                }
            }

            public EditNameDestination(SubaccountType subAccountType, String subAccountName, String subAccountId) {
                Intrinsics.checkNotNullParameter(subAccountName, "subAccountName");
                Intrinsics.checkNotNullParameter(subAccountId, "subAccountId");
                Intrinsics.checkNotNullParameter(subAccountType, "subAccountType");
                this.f88940a = subAccountName;
                this.f88941b = subAccountId;
                this.f88942c = subAccountType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EditNameDestination)) {
                    return false;
                }
                EditNameDestination editNameDestination = (EditNameDestination) obj2;
                return Intrinsics.f(this.f88940a, editNameDestination.f88940a) && Intrinsics.f(this.f88941b, editNameDestination.f88941b) && Intrinsics.f(this.f88942c, editNameDestination.f88942c);
            }

            public final int hashCode() {
                return this.f88942c.hashCode() + p.a.c(this.f88940a.hashCode() * 31, 31, this.f88941b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f88940a);
                dest.writeString(this.f88941b);
                dest.writeParcelable(this.f88942c, i);
            }
        }

        private Destination() {
        }
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF102903g() {
        return null;
    }
}
