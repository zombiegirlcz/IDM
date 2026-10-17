package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.kompot.common.IOData$Input;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Selection", "Direct", "AddOtherAsset", "CustomAssetDetails", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$AddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$CustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$Direct;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$Selection;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TotalWealthFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$AddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddOtherAsset extends TotalWealthFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AddOtherAsset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87955a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddOtherAsset((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddOtherAsset[i];
            }
        }

        public AddOtherAsset(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87955a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddOtherAsset) && Intrinsics.f(this.f87955a, ((AddOtherAsset) obj2).f87955a);
        }

        public final int hashCode() {
            return this.f87955a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87955a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$CustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAssetDetails extends TotalWealthFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CustomAssetDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87956a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAssetDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAssetDetails[i];
            }
        }

        public CustomAssetDetails(String customAssetId) {
            Intrinsics.checkNotNullParameter(customAssetId, "customAssetId");
            this.f87956a = customAssetId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomAssetDetails) && Intrinsics.f(this.f87956a, ((CustomAssetDetails) obj2).f87956a);
        }

        public final int hashCode() {
            return this.f87956a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87956a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$Direct;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Direct extends TotalWealthFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Direct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f87957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NetWorthAccount f87958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final amd.b f87959c;
        public final amd.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Direct(g.valueOf(parcel.readString()), (NetWorthAccount) parcel.readParcelable(Direct.class.getClassLoader()), parcel.readInt() == 0 ? null : amd.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? amd.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Direct[i];
            }
        }

        public Direct(g netWorthType, NetWorthAccount netWorthAccount, amd.b bVar, amd.a aVar) {
            Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
            Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
            this.f87957a = netWorthType;
            this.f87958b = netWorthAccount;
            this.f87959c = bVar;
            this.d = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Direct)) {
                return false;
            }
            Direct direct = (Direct) obj2;
            return this.f87957a == direct.f87957a && Intrinsics.f(this.f87958b, direct.f87958b) && this.f87959c == direct.f87959c && this.d == direct.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f87958b.hashCode() + (this.f87957a.hashCode() * 31)) * 31;
            amd.b bVar = this.f87959c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            amd.a aVar = this.d;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87957a.name());
            dest.writeParcelable(this.f87958b, i);
            amd.b bVar = this.f87959c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            amd.a aVar = this.d;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData$Selection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selection extends TotalWealthFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Selection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f87960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f87961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f87962c;
        public final int d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                return new Selection(parcel.readInt(), parcel.readInt(), dVar, (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selection[i];
            }
        }

        public Selection(int i, int i2, dj0.d assetsTotal, dj0.d liabilitiesTotal) {
            Intrinsics.checkNotNullParameter(assetsTotal, "assetsTotal");
            Intrinsics.checkNotNullParameter(liabilitiesTotal, "liabilitiesTotal");
            this.f87960a = assetsTotal;
            this.f87961b = i;
            this.f87962c = liabilitiesTotal;
            this.d = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) obj2;
            return Intrinsics.f(this.f87960a, selection.f87960a) && this.f87961b == selection.f87961b && Intrinsics.f(this.f87962c, selection.f87962c) && this.d == selection.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + v7.c(j6.a.b(this.f87961b, this.f87960a.hashCode() * 31, 31), 31, this.f87962c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87960a);
            dest.writeInt(this.f87961b);
            dest.writeSerializable(this.f87962c);
            dest.writeInt(this.d);
        }
    }

    private TotalWealthFlowContract$InputData() {
    }
}
