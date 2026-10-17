package com.revolut.feature.wealth.analytics.widgetised.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Landroid/os/Parcelable;", "kzg/a", "AllInvestments", "AllInvestAccounts", "Crypto", "Commodities", "Brokerage", "JointBrokerage", "Isa", "Jisa", "Pea", "Robo", "Cfd", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$AllInvestAccounts;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$AllInvestments;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Brokerage;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Cfd;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Commodities;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Crypto;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Isa;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Jisa;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$JointBrokerage;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Pea;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Robo;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WidgetisedAnalyticsType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$AllInvestAccounts;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "<init>", "()V", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllInvestAccounts implements WidgetisedAnalyticsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllInvestAccounts f95142a = new AllInvestAccounts();

        @NotNull
        public static final Parcelable.Creator<AllInvestAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllInvestAccounts.f95142a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllInvestAccounts[i];
            }
        }

        private AllInvestAccounts() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$AllInvestments;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "<init>", "()V", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllInvestments implements WidgetisedAnalyticsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllInvestments f95143a = new AllInvestments();

        @NotNull
        public static final Parcelable.Creator<AllInvestments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllInvestments.f95143a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllInvestments[i];
            }
        }

        private AllInvestments() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Brokerage;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Brokerage implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Brokerage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95144a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Brokerage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Brokerage[i];
            }
        }

        public Brokerage(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95144a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Brokerage) && Intrinsics.f(this.f95144a, ((Brokerage) obj2).f95144a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95144a;
        }

        public final int hashCode() {
            return this.f95144a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95144a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Cfd;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95145a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        public Cfd(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95145a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cfd) && Intrinsics.f(this.f95145a, ((Cfd) obj2).f95145a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95145a;
        }

        public final int hashCode() {
            return this.f95145a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95145a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Commodities;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "<init>", "()V", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities implements WidgetisedAnalyticsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Commodities f95146a = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.f95146a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Crypto;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "<init>", "()V", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Crypto implements WidgetisedAnalyticsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Crypto f95147a = new Crypto();

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Crypto.f95147a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        private Crypto() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Isa;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Isa implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Isa> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95148a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Isa(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Isa[i];
            }
        }

        public Isa(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95148a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Isa) && Intrinsics.f(this.f95148a, ((Isa) obj2).f95148a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95148a;
        }

        public final int hashCode() {
            return this.f95148a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95148a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Jisa;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Jisa implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Jisa> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95151c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Jisa(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Jisa[i];
            }
        }

        public Jisa(String portfolioId, String beneficiaryName, String beneficiaryId, boolean z) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f95149a = portfolioId;
            this.f95150b = beneficiaryName;
            this.f95151c = beneficiaryId;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Jisa)) {
                return false;
            }
            Jisa jisa = (Jisa) obj2;
            return Intrinsics.f(this.f95149a, jisa.f95149a) && Intrinsics.f(this.f95150b, jisa.f95150b) && Intrinsics.f(this.f95151c, jisa.f95151c) && this.d == jisa.d;
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95149a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f95149a.hashCode() * 31, 31, this.f95150b), 31, this.f95151c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95149a);
            dest.writeString(this.f95150b);
            dest.writeString(this.f95151c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$JointBrokerage;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointBrokerage implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<JointBrokerage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95152a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointBrokerage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointBrokerage[i];
            }
        }

        public JointBrokerage(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95152a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointBrokerage) && Intrinsics.f(this.f95152a, ((JointBrokerage) obj2).f95152a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95152a;
        }

        public final int hashCode() {
            return this.f95152a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95152a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Pea;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pea implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Pea> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pea(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pea[i];
            }
        }

        public Pea(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95153a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pea) && Intrinsics.f(this.f95153a, ((Pea) obj2).f95153a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95153a;
        }

        public final int hashCode() {
            return this.f95153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95153a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType$Robo;", "Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsType;", "Lkzg/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Robo implements WidgetisedAnalyticsType, kzg.a {

        @NotNull
        public static final Parcelable.Creator<Robo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Robo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Robo[i];
            }
        }

        public Robo(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95154a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Robo) && Intrinsics.f(this.f95154a, ((Robo) obj2).f95154a);
        }

        @Override // kzg.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95154a() {
            return this.f95154a;
        }

        public final int hashCode() {
            return this.f95154a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95154a);
        }
    }
}
