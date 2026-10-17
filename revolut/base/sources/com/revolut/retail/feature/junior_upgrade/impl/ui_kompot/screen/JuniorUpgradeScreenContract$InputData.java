package com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/junior_upgrade/impl/ui_kompot/screen/JuniorUpgradeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_upgrade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorUpgradeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorUpgradeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101763c;
    public final Clause d;
    public final b e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NaviCommand f101764g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorUpgradeScreenContract$InputData(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(JuniorUpgradeScreenContract$InputData.class.getClassLoader()), b.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(JuniorUpgradeScreenContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(JuniorUpgradeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorUpgradeScreenContract$InputData[i];
        }
    }

    public JuniorUpgradeScreenContract$InputData(int i, int i2, int i3, Clause userPlanClause, b analyticSource, NaviCommand nextCommand, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(userPlanClause, "userPlanClause");
        Intrinsics.checkNotNullParameter(analyticSource, "analyticSource");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f101761a = i;
        this.f101762b = i2;
        this.f101763c = i3;
        this.d = userPlanClause;
        this.e = analyticSource;
        this.f = nextCommand;
        this.f101764g = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorUpgradeScreenContract$InputData)) {
            return false;
        }
        JuniorUpgradeScreenContract$InputData juniorUpgradeScreenContract$InputData = (JuniorUpgradeScreenContract$InputData) obj2;
        return this.f101761a == juniorUpgradeScreenContract$InputData.f101761a && this.f101762b == juniorUpgradeScreenContract$InputData.f101762b && this.f101763c == juniorUpgradeScreenContract$InputData.f101763c && Intrinsics.f(this.d, juniorUpgradeScreenContract$InputData.d) && this.e == juniorUpgradeScreenContract$InputData.e && Intrinsics.f(this.f, juniorUpgradeScreenContract$InputData.f) && Intrinsics.f(this.f101764g, juniorUpgradeScreenContract$InputData.f101764g);
    }

    public final int hashCode() {
        int iA = n.a(this.f, c.c(this.e, p.a.a(j6.a.b(this.f101763c, j6.a.b(this.f101762b, Integer.hashCode(this.f101761a) * 31, 31), 31), 31, this.d), 31), 31);
        NaviCommand naviCommand = this.f101764g;
        return iA + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f101761a);
        dest.writeInt(this.f101762b);
        dest.writeInt(this.f101763c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f101764g, i);
    }
}
