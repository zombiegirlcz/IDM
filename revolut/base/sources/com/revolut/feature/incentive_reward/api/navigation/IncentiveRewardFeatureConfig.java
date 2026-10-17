package com.revolut.feature.incentive_reward.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.incentive_reward.impl.navigation.IncentiveRewardDetailsDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/incentive_reward/api/navigation/IncentiveRewardFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "SelectionDestination", "feature_retail_incentive_reward_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncentiveRewardFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/incentive_reward/api/navigation/IncentiveRewardFeatureConfig$SelectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_incentive_reward_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectionDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SelectionDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f74843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedHashMap f74845c;
        public final NaviCommand d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iD = 0;
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new SelectionDestination(z, z3, linkedHashMap, (NaviCommand) parcel.readParcelable(SelectionDestination.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectionDestination[i];
            }
        }

        public SelectionDestination(boolean z, boolean z3, LinkedHashMap contextParams, NaviCommand naviCommand, String str) {
            Intrinsics.checkNotNullParameter(contextParams, "contextParams");
            this.f74843a = z;
            this.f74844b = z3;
            this.f74845c = contextParams;
            this.d = naviCommand;
            this.e = str;
        }

        public final Map a() {
            return this.f74845c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF74844b() {
            return this.f74844b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF74843a() {
            return this.f74843a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectionDestination)) {
                return false;
            }
            SelectionDestination selectionDestination = (SelectionDestination) obj2;
            return this.f74843a == selectionDestination.f74843a && this.f74844b == selectionDestination.f74844b && this.f74845c.equals(selectionDestination.f74845c) && Intrinsics.f(this.d, selectionDestination.d) && Intrinsics.f(this.e, selectionDestination.e);
        }

        public final int hashCode() {
            int iE = b.e(this.f74845c, j6.a.c(Boolean.hashCode(this.f74843a) * 31, 31, this.f74844b), 31);
            NaviCommand naviCommand = this.d;
            int iHashCode = (iE + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f74843a ? 1 : 0);
            dest.writeInt(this.f74844b ? 1 : 0);
            LinkedHashMap linkedHashMap = this.f74845c;
            dest.writeInt(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncentiveRewardFeatureConfig(IncentiveRewardDetailsDestination destination) {
        super((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 45);
        Intrinsics.checkNotNullParameter(destination, "destination");
    }
}
