package com.revolut.retail.feature.junior_upgrade.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;
import z9h.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/api/navigation/KompotJuniorUpgradeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "JuniorUpgrade", "JuniorUpgradeDestination", "Lcom/revolut/retail/feature/junior_upgrade/api/navigation/KompotJuniorUpgradeFeatureConfig$JuniorUpgrade;", "feature_junior_upgrade_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KompotJuniorUpgradeFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/api/navigation/KompotJuniorUpgradeFeatureConfig$JuniorUpgrade;", "Lcom/revolut/retail/feature/junior_upgrade/api/navigation/KompotJuniorUpgradeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_upgrade_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorUpgrade extends KompotJuniorUpgradeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<JuniorUpgrade> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f101742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f101743h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f101744j;
        public final b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final NaviCommand f101745l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final NaviCommand f101746m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorUpgrade(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(JuniorUpgrade.class.getClassLoader()), b.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(JuniorUpgrade.class.getClassLoader()), (NaviCommand) parcel.readParcelable(JuniorUpgrade.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorUpgrade[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JuniorUpgrade(int i, int i2, int i3, Clause userPlanClause, b analyticSource, NaviCommand nextCommand, NaviCommand naviCommand) {
            super(null, new JuniorUpgradeDestination(i, i2, i3, userPlanClause, analyticSource, nextCommand, naviCommand), false, null, 0, 61);
            Intrinsics.checkNotNullParameter(userPlanClause, "userPlanClause");
            Intrinsics.checkNotNullParameter(analyticSource, "analyticSource");
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f101742g = i;
            this.f101743h = i2;
            this.i = i3;
            this.f101744j = userPlanClause;
            this.k = analyticSource;
            this.f101745l = nextCommand;
            this.f101746m = naviCommand;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorUpgrade)) {
                return false;
            }
            JuniorUpgrade juniorUpgrade = (JuniorUpgrade) obj2;
            return this.f101742g == juniorUpgrade.f101742g && this.f101743h == juniorUpgrade.f101743h && this.i == juniorUpgrade.i && Intrinsics.f(this.f101744j, juniorUpgrade.f101744j) && this.k == juniorUpgrade.k && Intrinsics.f(this.f101745l, juniorUpgrade.f101745l) && Intrinsics.f(this.f101746m, juniorUpgrade.f101746m);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iA = n.a(this.f101745l, c.c(this.k, p.a.a(j6.a.b(this.i, j6.a.b(this.f101743h, Integer.hashCode(this.f101742g) * 31, 31), 31), 31, this.f101744j), 31), 31);
            NaviCommand naviCommand = this.f101746m;
            return iA + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101742g);
            dest.writeInt(this.f101743h);
            dest.writeInt(this.i);
            dest.writeParcelable(this.f101744j, i);
            dest.writeString(this.k.name());
            dest.writeParcelable(this.f101745l, i);
            dest.writeParcelable(this.f101746m, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/api/navigation/KompotJuniorUpgradeFeatureConfig$JuniorUpgradeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_upgrade_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorUpgradeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<JuniorUpgradeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f101748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f101749c;
        public final Clause d;
        public final b e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f101750g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorUpgradeDestination(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(JuniorUpgradeDestination.class.getClassLoader()), b.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(JuniorUpgradeDestination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(JuniorUpgradeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorUpgradeDestination[i];
            }
        }

        public JuniorUpgradeDestination(int i, int i2, int i3, Clause userPlanClause, b analyticSource, NaviCommand nextCommand, NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(userPlanClause, "userPlanClause");
            Intrinsics.checkNotNullParameter(analyticSource, "analyticSource");
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f101747a = i;
            this.f101748b = i2;
            this.f101749c = i3;
            this.d = userPlanClause;
            this.e = analyticSource;
            this.f = nextCommand;
            this.f101750g = naviCommand;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF101747a() {
            return this.f101747a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF101749c() {
            return this.f101749c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF101748b() {
            return this.f101748b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final NaviCommand getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorUpgradeDestination)) {
                return false;
            }
            JuniorUpgradeDestination juniorUpgradeDestination = (JuniorUpgradeDestination) obj2;
            return this.f101747a == juniorUpgradeDestination.f101747a && this.f101748b == juniorUpgradeDestination.f101748b && this.f101749c == juniorUpgradeDestination.f101749c && Intrinsics.f(this.d, juniorUpgradeDestination.d) && this.e == juniorUpgradeDestination.e && Intrinsics.f(this.f, juniorUpgradeDestination.f) && Intrinsics.f(this.f101750g, juniorUpgradeDestination.f101750g);
        }

        public final int hashCode() {
            int iA = n.a(this.f, c.c(this.e, p.a.a(j6.a.b(this.f101749c, j6.a.b(this.f101748b, Integer.hashCode(this.f101747a) * 31, 31), 31), 31, this.d), 31), 31);
            NaviCommand naviCommand = this.f101750g;
            return iA + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final NaviCommand getF101750g() {
            return this.f101750g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101747a);
            dest.writeInt(this.f101748b);
            dest.writeInt(this.f101749c);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f101750g, i);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final Clause getD() {
            return this.d;
        }
    }
}
