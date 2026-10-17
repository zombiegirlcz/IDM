package com.revolut.feature.retail.cfd.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import java.math.BigDecimal;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CfdTradingDestination", "HomeScreen", "OrderFlow", "PositionDetails", "CashBalance", "Withdraw", "CfdRiskWarningFlowDestination", "CfdPositionsDestination", "WhatAreCfdDestination", "CfdClosePositionReviewDestination", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashBalance;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$HomeScreen;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OrderFlow;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$PositionDetails;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Withdraw;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CfdTradingFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashBalance;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashBalance extends CfdTradingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CashBalance> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f82127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f82128h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashBalance$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements CfdTradingDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f82129a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(b holding) {
                Intrinsics.checkNotNullParameter(holding, "holding");
                this.f82129a = holding;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getF82129a() {
                return this.f82129a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f82129a, ((Destination) obj2).f82129a);
            }

            public final int hashCode() {
                return this.f82129a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f82129a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashBalance((b) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(CashBalance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashBalance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CashBalance(b holding, ActivityAnimation activityAnimation) {
            super(activityAnimation, new Destination(holding), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(holding, "holding");
            this.f82127g = holding;
            this.f82128h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f82128h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashBalance)) {
                return false;
            }
            CashBalance cashBalance = (CashBalance) obj2;
            return Intrinsics.f(this.f82127g, cashBalance.f82127g) && Intrinsics.f(this.f82128h, cashBalance.f82128h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f82127g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f82128h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82127g);
            dest.writeParcelable(this.f82128h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdClosePositionReviewDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfdClosePositionReviewDestination implements CfdTradingDestination {

        @NotNull
        public static final Parcelable.Creator<CfdClosePositionReviewDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f82132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82133c;
        public final BigDecimal d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfdClosePositionReviewDestination(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdClosePositionReviewDestination[i];
            }
        }

        public CfdClosePositionReviewDestination(String portfolioId, String positionId, BigDecimal assetQuantity, n instrument) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
            this.f82131a = portfolioId;
            this.f82132b = instrument;
            this.f82133c = positionId;
            this.d = assetQuantity;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF82133c() {
            return this.f82133c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CfdClosePositionReviewDestination)) {
                return false;
            }
            CfdClosePositionReviewDestination cfdClosePositionReviewDestination = (CfdClosePositionReviewDestination) obj2;
            return Intrinsics.f(this.f82131a, cfdClosePositionReviewDestination.f82131a) && Intrinsics.f(this.f82132b, cfdClosePositionReviewDestination.f82132b) && Intrinsics.f(this.f82133c, cfdClosePositionReviewDestination.f82133c) && Intrinsics.f(this.d, cfdClosePositionReviewDestination.d);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF82131a() {
            return this.f82131a;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(a10.b.d(this.f82132b, this.f82131a.hashCode() * 31, 31), 31, this.f82133c);
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final n getF82132b() {
            return this.f82132b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82131a);
            dest.writeSerializable(this.f82132b);
            dest.writeString(this.f82133c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdPositionsDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfdPositionsDestination implements CfdTradingDestination {

        @NotNull
        public static final Parcelable.Creator<CfdPositionsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82136c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfdPositionsDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdPositionsDestination[i];
            }
        }

        public CfdPositionsDestination(String instrumentRef, String portfolioId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f82134a = instrumentRef;
            this.f82135b = portfolioId;
            this.f82136c = z;
            this.d = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF82134a() {
            return this.f82134a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF82136c() {
            return this.f82136c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CfdPositionsDestination)) {
                return false;
            }
            CfdPositionsDestination cfdPositionsDestination = (CfdPositionsDestination) obj2;
            return Intrinsics.f(this.f82134a, cfdPositionsDestination.f82134a) && Intrinsics.f(this.f82135b, cfdPositionsDestination.f82135b) && this.f82136c == cfdPositionsDestination.f82136c && Intrinsics.f(this.d, cfdPositionsDestination.d);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF82135b() {
            return this.f82135b;
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(this.f82134a.hashCode() * 31, 31, this.f82135b), 31, this.f82136c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82134a);
            dest.writeString(this.f82135b);
            dest.writeInt(this.f82136c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdRiskWarningFlowDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfdRiskWarningFlowDestination implements CfdTradingDestination {

        @NotNull
        public static final Parcelable.Creator<CfdRiskWarningFlowDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f82137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f82138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f82139c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfdRiskWarningFlowDestination((NaviCommand) parcel.readParcelable(CfdRiskWarningFlowDestination.class.getClassLoader()), (Clause) parcel.readParcelable(CfdRiskWarningFlowDestination.class.getClassLoader()), (Clause) parcel.readParcelable(CfdRiskWarningFlowDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdRiskWarningFlowDestination[i];
            }
        }

        public CfdRiskWarningFlowDestination(NaviCommand riskAcknowledgedDestinationCommand, Clause clause, Clause clause2) {
            Intrinsics.checkNotNullParameter(riskAcknowledgedDestinationCommand, "riskAcknowledgedDestinationCommand");
            this.f82137a = riskAcknowledgedDestinationCommand;
            this.f82138b = clause;
            this.f82139c = clause2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF82139c() {
            return this.f82139c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF82137a() {
            return this.f82137a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Clause getF82138b() {
            return this.f82138b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CfdRiskWarningFlowDestination)) {
                return false;
            }
            CfdRiskWarningFlowDestination cfdRiskWarningFlowDestination = (CfdRiskWarningFlowDestination) obj2;
            return Intrinsics.f(this.f82137a, cfdRiskWarningFlowDestination.f82137a) && Intrinsics.f(this.f82138b, cfdRiskWarningFlowDestination.f82138b) && Intrinsics.f(this.f82139c, cfdRiskWarningFlowDestination.f82139c);
        }

        public final int hashCode() {
            int iHashCode = this.f82137a.hashCode() * 31;
            Clause clause = this.f82138b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f82139c;
            return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82137a, i);
            dest.writeParcelable(this.f82138b, i);
            dest.writeParcelable(this.f82139c, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashBalance$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashTradeDetails$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdClosePositionReviewDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdPositionsDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdRiskWarningFlowDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$HomeScreen$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$MaintenanceMargin$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OrderFlow$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$PositionDetails$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Settings$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$WhatAreCfdDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Withdraw$Destination;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CfdTradingDestination extends KompotDestination {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$HomeScreen;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeScreen extends CfdTradingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<HomeScreen> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f82140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f82141h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$HomeScreen$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements CfdTradingDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82142a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String portfolioId) {
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                this.f82142a = portfolioId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f82142a, ((Destination) obj2).f82142a);
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getF82142a() {
                return this.f82142a;
            }

            public final int hashCode() {
                return this.f82142a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82142a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeScreen(parcel.readString(), (ActivityAnimation) parcel.readParcelable(HomeScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeScreen[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeScreen(String portfolioId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new Destination(portfolioId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f82140g = portfolioId;
            this.f82141h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f82141h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HomeScreen)) {
                return false;
            }
            HomeScreen homeScreen = (HomeScreen) obj2;
            return Intrinsics.f(this.f82140g, homeScreen.f82140g) && Intrinsics.f(this.f82141h, homeScreen.f82141h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f82140g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f82141h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82140g);
            dest.writeParcelable(this.f82141h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$PositionDetails;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PositionDetails extends CfdTradingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PositionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final kel.n f82152g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f82153h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$PositionDetails$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements CfdTradingDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final kel.n f82154a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((kel.n) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(kel.n holding) {
                Intrinsics.checkNotNullParameter(holding, "holding");
                this.f82154a = holding;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final kel.n getF82154a() {
                return this.f82154a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f82154a, ((Destination) obj2).f82154a);
            }

            public final int hashCode() {
                return this.f82154a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f82154a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PositionDetails((kel.n) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(PositionDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PositionDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PositionDetails(kel.n holding, ActivityAnimation activityAnimation) {
            super(activityAnimation, new Destination(holding), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(holding, "holding");
            this.f82152g = holding;
            this.f82153h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f82153h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PositionDetails)) {
                return false;
            }
            PositionDetails positionDetails = (PositionDetails) obj2;
            return Intrinsics.f(this.f82152g, positionDetails.f82152g) && Intrinsics.f(this.f82153h, positionDetails.f82153h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f82152g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f82153h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82152g);
            dest.writeParcelable(this.f82153h, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$WhatAreCfdDestination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "<init>", "()V", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WhatAreCfdDestination implements CfdTradingDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WhatAreCfdDestination f82156a = new WhatAreCfdDestination();

        @NotNull
        public static final Parcelable.Creator<WhatAreCfdDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WhatAreCfdDestination.f82156a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatAreCfdDestination[i];
            }
        }

        private WhatAreCfdDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Withdraw;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw extends CfdTradingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f82157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xi0.b f82158h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Withdraw$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements CfdTradingDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f82160b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), (xi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String portfolioId, xi0.b currency) {
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f82159a = portfolioId;
                this.f82160b = currency;
            }

            /* JADX INFO: renamed from: T8, reason: from getter */
            public final xi0.b getF82160b() {
                return this.f82160b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f82159a, destination.f82159a) && Intrinsics.f(this.f82160b, destination.f82160b);
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getF82159a() {
                return this.f82159a;
            }

            public final int hashCode() {
                return this.f82160b.hashCode() + (this.f82159a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82159a);
                dest.writeSerializable(this.f82160b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdraw(parcel.readString(), (xi0.b) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(Withdraw.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Withdraw(String portfolioId, xi0.b currency, ActivityAnimation activityAnimation) {
            super(activityAnimation, new Destination(portfolioId, currency), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f82157g = portfolioId;
            this.f82158h = currency;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Withdraw)) {
                return false;
            }
            Withdraw withdraw = (Withdraw) obj2;
            return Intrinsics.f(this.f82157g, withdraw.f82157g) && Intrinsics.f(this.f82158h, withdraw.f82158h) && Intrinsics.f(this.i, withdraw.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iJ = l.j(this.f82158h, this.f82157g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iJ + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82157g);
            dest.writeSerializable(this.f82158h);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OrderFlow;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderFlow extends CfdTradingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OrderFlow> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final g f82144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final n f82145h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final BigDecimal f82146j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ActivityAnimation f82147l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OrderFlow$Destination;", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements CfdTradingDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f82148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n f82149b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f82150c;
            public final BigDecimal d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(g.valueOf(parcel.readString()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (n) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(g tradeSide, String portfolioId, BigDecimal quantity, n instrument, boolean z) {
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                this.f82148a = tradeSide;
                this.f82149b = instrument;
                this.f82150c = portfolioId;
                this.d = quantity;
                this.e = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BigDecimal getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final g getF82148a() {
                return this.f82148a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return this.f82148a == destination.f82148a && Intrinsics.f(this.f82149b, destination.f82149b) && Intrinsics.f(this.f82150c, destination.f82150c) && Intrinsics.f(this.d, destination.d) && this.e == destination.e;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getF82150c() {
                return this.f82150c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + t61.a.d(this.d, p.a.c(a10.b.d(this.f82149b, this.f82148a.hashCode() * 31, 31), 31, this.f82150c), 31);
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final n getF82149b() {
                return this.f82149b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82148a.name());
                dest.writeSerializable(this.f82149b);
                dest.writeString(this.f82150c);
                dest.writeSerializable(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderFlow(g.valueOf(parcel.readString()), (n) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, (ActivityAnimation) parcel.readParcelable(OrderFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderFlow[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OrderFlow(g gVar, n nVar, String str, BigDecimal ZERO, int i) {
            if ((i & 8) != 0) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            this(gVar, nVar, str, ZERO, false, null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f82147l;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderFlow)) {
                return false;
            }
            OrderFlow orderFlow = (OrderFlow) obj2;
            return this.f82144g == orderFlow.f82144g && Intrinsics.f(this.f82145h, orderFlow.f82145h) && Intrinsics.f(this.i, orderFlow.i) && Intrinsics.f(this.f82146j, orderFlow.f82146j) && this.k == orderFlow.k && Intrinsics.f(this.f82147l, orderFlow.f82147l);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = j6.a.c(t61.a.d(this.f82146j, p.a.c(a10.b.d(this.f82145h, this.f82144g.hashCode() * 31, 31), 31, this.i), 31), 31, this.k);
            ActivityAnimation activityAnimation = this.f82147l;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82144g.name());
            dest.writeSerializable(this.f82145h);
            dest.writeString(this.i);
            dest.writeSerializable(this.f82146j);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeParcelable(this.f82147l, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderFlow(g tradeSide, n instrument, String portfolioId, BigDecimal quantity, boolean z, ActivityAnimation activityAnimation) {
            super(activityAnimation, new Destination(tradeSide, portfolioId, quantity, instrument, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.f82144g = tradeSide;
            this.f82145h = instrument;
            this.i = portfolioId;
            this.f82146j = quantity;
            this.k = z;
            this.f82147l = activityAnimation;
        }
    }
}
