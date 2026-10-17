package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.navigable.flow.FlowStep;
import jel.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DealSourcingInfo", "TrackRecordInfo", "LiquidityGateInfo", "CoreTeamMemberInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$CoreTeamMemberInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$DealSourcingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$LiquidityGateInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$TrackRecordInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FundHighlightsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$CoreTeamMemberInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoreTeamMemberInfo implements FundHighlightsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CoreTeamMemberInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f95797c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoreTeamMemberInfo(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(CoreTeamMemberInfo.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoreTeamMemberInfo[i];
            }
        }

        public CoreTeamMemberInfo(String name, String role, Image image, String description) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f95795a = name;
            this.f95796b = role;
            this.f95797c = image;
            this.d = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoreTeamMemberInfo)) {
                return false;
            }
            CoreTeamMemberInfo coreTeamMemberInfo = (CoreTeamMemberInfo) obj2;
            return Intrinsics.f(this.f95795a, coreTeamMemberInfo.f95795a) && Intrinsics.f(this.f95796b, coreTeamMemberInfo.f95796b) && Intrinsics.f(this.f95797c, coreTeamMemberInfo.f95797c) && Intrinsics.f(this.d, coreTeamMemberInfo.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(this.f95797c, p.a.c(this.f95795a.hashCode() * 31, 31, this.f95796b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95795a);
            dest.writeString(this.f95796b);
            dest.writeParcelable(this.f95797c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$DealSourcingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DealSourcingInfo implements FundHighlightsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DealSourcingInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f95798a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DealSourcingInfo(a0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DealSourcingInfo[i];
            }
        }

        public DealSourcingInfo(a0 dealSourcing) {
            Intrinsics.checkNotNullParameter(dealSourcing, "dealSourcing");
            this.f95798a = dealSourcing;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DealSourcingInfo) && this.f95798a == ((DealSourcingInfo) obj2).f95798a;
        }

        public final int hashCode() {
            return this.f95798a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95798a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$LiquidityGateInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LiquidityGateInfo implements FundHighlightsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiquidityGateInfo f95799a = new LiquidityGateInfo();

        @NotNull
        public static final Parcelable.Creator<LiquidityGateInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LiquidityGateInfo.f95799a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LiquidityGateInfo[i];
            }
        }

        private LiquidityGateInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep$TrackRecordInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrackRecordInfo implements FundHighlightsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrackRecordInfo f95800a = new TrackRecordInfo();

        @NotNull
        public static final Parcelable.Creator<TrackRecordInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrackRecordInfo.f95800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackRecordInfo[i];
            }
        }

        private TrackRecordInfo() {
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
}
