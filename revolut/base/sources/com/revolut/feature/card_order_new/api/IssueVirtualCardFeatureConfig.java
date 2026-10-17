package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import e93.b;
import e93.e;
import e93.l0;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/IssueVirtualCardFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IssueVirtualCardFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<IssueVirtualCardFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f64969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f64970c;
    public final String d;
    public final l0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f64971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f64972h;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IssueVirtualCardFeatureConfig((e) parcel.readSerializable(), (AccountId) parcel.readParcelable(IssueVirtualCardFeatureConfig.class.getClassLoader()), (NaviCommand) parcel.readParcelable(IssueVirtualCardFeatureConfig.class.getClassLoader()), parcel.readString(), l0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), (h) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IssueVirtualCardFeatureConfig[i];
        }
    }

    public IssueVirtualCardFeatureConfig(e virtualDesign, AccountId accountId, NaviCommand naviCommand, String str, l0 virtualCardLabelType, boolean z, b bVar, h hVar) {
        Intrinsics.checkNotNullParameter(virtualDesign, "virtualDesign");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        this.f64968a = virtualDesign;
        this.f64969b = accountId;
        this.f64970c = naviCommand;
        this.d = str;
        this.e = virtualCardLabelType;
        this.f = z;
        this.f64971g = bVar;
        this.f64972h = hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IssueVirtualCardFeatureConfig)) {
            return false;
        }
        IssueVirtualCardFeatureConfig issueVirtualCardFeatureConfig = (IssueVirtualCardFeatureConfig) obj2;
        return Intrinsics.f(this.f64968a, issueVirtualCardFeatureConfig.f64968a) && Intrinsics.f(this.f64969b, issueVirtualCardFeatureConfig.f64969b) && Intrinsics.f(this.f64970c, issueVirtualCardFeatureConfig.f64970c) && Intrinsics.f(this.d, issueVirtualCardFeatureConfig.d) && this.e == issueVirtualCardFeatureConfig.e && this.f == issueVirtualCardFeatureConfig.f && this.f64971g == issueVirtualCardFeatureConfig.f64971g && Intrinsics.f(this.f64972h, issueVirtualCardFeatureConfig.f64972h);
    }

    public final int hashCode() {
        int iB = l.b(this.f64969b, this.f64968a.hashCode() * 31, 31);
        NaviCommand naviCommand = this.f64970c;
        int iHashCode = (iB + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
        b bVar = this.f64971g;
        int iHashCode2 = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h hVar = this.f64972h;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64968a);
        dest.writeParcelable(this.f64969b, i);
        dest.writeParcelable(this.f64970c, i);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        b bVar = this.f64971g;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeSerializable(this.f64972h);
    }
}
