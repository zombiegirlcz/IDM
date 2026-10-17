package com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;
import z9h.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/junior_upgrade/impl/ui_kompot/flow/JuniorUpgradeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_upgrade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorUpgradeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorUpgradeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101755c;
    public final Clause d;
    public final b e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NaviCommand f101756g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorUpgradeFlowContract$InputData(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(JuniorUpgradeFlowContract$InputData.class.getClassLoader()), b.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(JuniorUpgradeFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(JuniorUpgradeFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorUpgradeFlowContract$InputData[i];
        }
    }

    public JuniorUpgradeFlowContract$InputData(int i, int i2, int i3, Clause userPlanClause, b analyticSource, NaviCommand nextCommand, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(userPlanClause, "userPlanClause");
        Intrinsics.checkNotNullParameter(analyticSource, "analyticSource");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f101753a = i;
        this.f101754b = i2;
        this.f101755c = i3;
        this.d = userPlanClause;
        this.e = analyticSource;
        this.f = nextCommand;
        this.f101756g = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorUpgradeFlowContract$InputData)) {
            return false;
        }
        JuniorUpgradeFlowContract$InputData juniorUpgradeFlowContract$InputData = (JuniorUpgradeFlowContract$InputData) obj2;
        return this.f101753a == juniorUpgradeFlowContract$InputData.f101753a && this.f101754b == juniorUpgradeFlowContract$InputData.f101754b && this.f101755c == juniorUpgradeFlowContract$InputData.f101755c && Intrinsics.f(this.d, juniorUpgradeFlowContract$InputData.d) && this.e == juniorUpgradeFlowContract$InputData.e && Intrinsics.f(this.f, juniorUpgradeFlowContract$InputData.f) && Intrinsics.f(this.f101756g, juniorUpgradeFlowContract$InputData.f101756g);
    }

    public final int hashCode() {
        int iA = n.a(this.f, c.c(this.e, p.a.a(j6.a.b(this.f101755c, j6.a.b(this.f101754b, Integer.hashCode(this.f101753a) * 31, 31), 31), 31, this.d), 31), 31);
        NaviCommand naviCommand = this.f101756g;
        return iA + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f101753a);
        dest.writeInt(this.f101754b);
        dest.writeInt(this.f101755c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f101756g, i);
    }
}
