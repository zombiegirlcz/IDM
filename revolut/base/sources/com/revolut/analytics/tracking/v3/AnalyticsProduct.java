package com.revolut.analytics.tracking.v3;

import android.os.Parcel;
import android.os.Parcelable;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import no.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "Landroid/os/Parcelable;", "Companion", "Retail", "Business", "Junior", "RevolutX", "Terminal", "Shared", "a", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Business;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Junior;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Retail;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$RevolutX;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Terminal;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsProduct extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f50306a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Business;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "value", "Lgrl/x0;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Business implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<Business> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f50298a;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                x0 value = x0.valueOf(parcel.readString());
                Parcelable.Creator<Business> creator = Business.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new Business(value);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Business[i];
            }
        }

        public /* synthetic */ Business(x0 x0Var) {
            this.f50298a = x0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Business) {
                return this.f50298a == ((Business) obj2).f50298a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50298a.hashCode();
        }

        public final String toString() {
            return "Business(value=" + this.f50298a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50298a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Junior;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "value", "Lgrl/q6;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Junior implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q6 f50299a;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                q6 value = q6.valueOf(parcel.readString());
                Parcelable.Creator<Junior> creator = Junior.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new Junior(value);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public /* synthetic */ Junior(q6 q6Var) {
            this.f50299a = q6Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Junior) {
                return this.f50299a == ((Junior) obj2).f50299a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50299a.hashCode();
        }

        public final String toString() {
            return "Junior(value=" + this.f50299a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50299a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Retail;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "value", "Lgrl/k9;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Retail implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<Retail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k9 f50300a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                k9 k9VarValueOf = k9.valueOf(parcel.readString());
                Parcelable.Creator<Retail> creator = Retail.CREATOR;
                return com.google.android.gms.internal.mlkit_vision_face.a.h(k9VarValueOf, "value", k9VarValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Retail[i];
            }
        }

        public /* synthetic */ Retail(k9 k9Var) {
            this.f50300a = k9Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Retail) {
                return this.f50300a == ((Retail) obj2).f50300a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50300a.hashCode();
        }

        public final String toString() {
            return "Retail(value=" + this.f50300a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50300a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$RevolutX;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "value", "Lgrl/w2;", "Lcom/revolut/analytics/tracking/v3/RevolutXProduct;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutX implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<RevolutX> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w2 f50301a;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                w2 value = w2.valueOf(parcel.readString());
                Parcelable.Creator<RevolutX> creator = RevolutX.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new RevolutX(value);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutX[i];
            }
        }

        public /* synthetic */ RevolutX(w2 w2Var) {
            this.f50301a = w2Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof RevolutX) {
                return this.f50301a == ((RevolutX) obj2).f50301a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50301a.hashCode();
        }

        public final String toString() {
            return "RevolutX(value=" + this.f50301a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50301a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "AppDefault", "Analytics", "Environment", "FinCrime", "MobilePlatform", "Onboarding", "RevolutUIKit", "Vision", "Crypto", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Shared implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<Shared> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k9 f50302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0 f50303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q6 f50304c;
        public final w2 d;
        public final od e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$Analytics;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Analytics extends Shared {
            public static final Analytics f = new Analytics();

            @NotNull
            public static final Parcelable.Creator<Analytics> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Analytics.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Analytics[i];
                }
            }

            private Analytics() {
                super(k9.Analytics, x0.Analytics, q6.Analytics, w2.Analytics, od.Analytics);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$AppDefault;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AppDefault extends Shared {
            public static final AppDefault f = new AppDefault();

            @NotNull
            public static final Parcelable.Creator<AppDefault> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AppDefault.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AppDefault[i];
                }
            }

            private AppDefault() {
                super(k9.Retail, x0.Business, q6.Junior, w2.RevolutX, od.Terminal);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$Crypto;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Crypto extends Shared {
            public static final Crypto f = new Crypto();

            @NotNull
            public static final Parcelable.Creator<Crypto> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Crypto.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            private Crypto() {
                super(k9.Crypto, x0.Crypto, q6.ProductUnspecified, w2.Crypto, od.ProductUnspecified);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$Environment;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Environment extends Shared {
            public static final Environment f = new Environment();

            @NotNull
            public static final Parcelable.Creator<Environment> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Environment.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Environment[i];
                }
            }

            private Environment() {
                super(k9.Environment, x0.Environment, q6.Environment, w2.Environment, od.Environment);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$FinCrime;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FinCrime extends Shared {
            public static final FinCrime f = new FinCrime();

            @NotNull
            public static final Parcelable.Creator<FinCrime> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FinCrime.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FinCrime[i];
                }
            }

            private FinCrime() {
                super(k9.FinCrime, x0.Fincrime, q6.FinCrime, w2.FinCrime, od.Fincrime);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$MobilePlatform;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MobilePlatform extends Shared {
            public static final MobilePlatform f = new MobilePlatform();

            @NotNull
            public static final Parcelable.Creator<MobilePlatform> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MobilePlatform.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MobilePlatform[i];
                }
            }

            private MobilePlatform() {
                super(k9.MobilePlatform, x0.MobilePlatform, q6.MobilePlatform, w2.MobilePlatform, od.MobilePlatform);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$Onboarding;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Onboarding extends Shared {
            public static final Onboarding f = new Onboarding();

            @NotNull
            public static final Parcelable.Creator<Onboarding> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Onboarding.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Onboarding[i];
                }
            }

            private Onboarding() {
                super(k9.Onboarding, x0.Onboarding, q6.Onboarding, w2.Onboarding, od.Onboarding);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$RevolutUIKit;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @yhm.d
        public static final class RevolutUIKit extends Shared {
            public static final RevolutUIKit f = new RevolutUIKit();

            @NotNull
            public static final Parcelable.Creator<RevolutUIKit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RevolutUIKit.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RevolutUIKit[i];
                }
            }

            private RevolutUIKit() {
                super(k9.RevolutUIKit, x0.RevolutUIKit, q6.RevolutUiKit, w2.RevolutUiKit, od.RevolutUIKit);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared$Vision;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Shared;", "<init>", "()V", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Vision extends Shared {
            public static final Vision f = new Vision();

            @NotNull
            public static final Parcelable.Creator<Vision> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Vision.f;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Vision[i];
                }
            }

            private Vision() {
                super(k9.Vision, x0.Vision, q6.Vision, w2.Vision, od.Vision);
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shared(k9.valueOf(parcel.readString()), x0.valueOf(parcel.readString()), q6.valueOf(parcel.readString()), w2.valueOf(parcel.readString()), od.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Shared[i];
            }
        }

        public Shared(k9 retailProduct, x0 businessProduct, q6 juniorProduct, w2 revolutXProduct, od terminalProduct) {
            Intrinsics.checkNotNullParameter(retailProduct, "retailProduct");
            Intrinsics.checkNotNullParameter(businessProduct, "businessProduct");
            Intrinsics.checkNotNullParameter(juniorProduct, "juniorProduct");
            Intrinsics.checkNotNullParameter(revolutXProduct, "revolutXProduct");
            Intrinsics.checkNotNullParameter(terminalProduct, "terminalProduct");
            this.f50302a = retailProduct;
            this.f50303b = businessProduct;
            this.f50304c = juniorProduct;
            this.d = revolutXProduct;
            this.e = terminalProduct;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Shared)) {
                return false;
            }
            Shared shared = (Shared) obj2;
            return this.f50302a == shared.f50302a && this.f50303b == shared.f50303b && this.f50304c == shared.f50304c && this.d == shared.d && this.e == shared.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f50304c.hashCode() + ((this.f50303b.hashCode() + (this.f50302a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Shared(retail=" + this.f50302a + ", business=" + this.f50303b + ", junior=" + this.f50304c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50302a.name());
            dest.writeString(this.f50303b.name());
            dest.writeString(this.f50304c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsProduct$Terminal;", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "value", "Lgrl/od;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terminal implements AnalyticsProduct {

        @NotNull
        public static final Parcelable.Creator<Terminal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final od f50305a;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                od value = od.valueOf(parcel.readString());
                Parcelable.Creator<Terminal> creator = Terminal.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new Terminal(value);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminal[i];
            }
        }

        public /* synthetic */ Terminal(od odVar) {
            this.f50305a = odVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Terminal) {
                return this.f50305a == ((Terminal) obj2).f50305a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50305a.hashCode();
        }

        public final String toString() {
            return "Terminal(value=" + this.f50305a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50305a.name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.analytics.tracking.v3.AnalyticsProduct$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f50306a = new Companion();

        private Companion() {
        }

        public static void a(k9 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Parcelable.Creator<Retail> creator = Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
        }

        public static AnalyticsProduct b(Object obj2) {
            if (obj2 instanceof AnalyticsProduct) {
                return (AnalyticsProduct) obj2;
            }
            if (obj2 instanceof k9) {
                k9 k9Var = (k9) obj2;
                Parcelable.Creator<Retail> creator = Retail.CREATOR;
                return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            }
            if (obj2 instanceof x0) {
                x0 value = (x0) obj2;
                Parcelable.Creator<Business> creator2 = Business.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new Business(value);
            }
            if (obj2 instanceof q6) {
                q6 value2 = (q6) obj2;
                Parcelable.Creator<Junior> creator3 = Junior.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                return new Junior(value2);
            }
            if (obj2 instanceof w2) {
                w2 value3 = (w2) obj2;
                Parcelable.Creator<RevolutX> creator4 = RevolutX.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                return new RevolutX(value3);
            }
            if (!(obj2 instanceof od)) {
                return null;
            }
            od value4 = (od) obj2;
            Parcelable.Creator<Terminal> creator5 = Terminal.CREATOR;
            Intrinsics.checkNotNullParameter(value4, "value");
            return new Terminal(value4);
        }
    }

    default AnalyticsProduct J3(n productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        if (!(this instanceof Shared)) {
            return this;
        }
        int i = no.l.f217809a[productType.ordinal()];
        if (i == 1) {
            x0 value = ((Shared) this).f50303b;
            Intrinsics.checkNotNullParameter(value, "value");
            return new Business(value);
        }
        if (i == 2) {
            k9 k9Var = ((Shared) this).f50302a;
            return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        if (i == 3) {
            q6 value2 = ((Shared) this).f50304c;
            Intrinsics.checkNotNullParameter(value2, "value");
            return new Junior(value2);
        }
        if (i == 4) {
            w2 value3 = ((Shared) this).d;
            Intrinsics.checkNotNullParameter(value3, "value");
            return new RevolutX(value3);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        od value4 = ((Shared) this).e;
        Intrinsics.checkNotNullParameter(value4, "value");
        return new Terminal(value4);
    }

    default String M3(n productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        if (this instanceof Retail) {
            return ((Retail) this).f50300a.name();
        }
        if (this instanceof Business) {
            return ((Business) this).f50298a.name();
        }
        if (this instanceof Junior) {
            return ((Junior) this).f50299a.name();
        }
        if (this instanceof RevolutX) {
            return ((RevolutX) this).f50301a.name();
        }
        if (this instanceof Terminal) {
            return ((Terminal) this).f50305a.name();
        }
        if (!(this instanceof Shared)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = no.l.f217809a[productType.ordinal()];
        if (i == 1) {
            x0 value = ((Shared) this).f50303b;
            Intrinsics.checkNotNullParameter(value, "value");
            return value.name();
        }
        if (i == 2) {
            k9 value2 = ((Shared) this).f50302a;
            Intrinsics.checkNotNullParameter(value2, "value");
            return value2.name();
        }
        if (i == 3) {
            q6 value3 = ((Shared) this).f50304c;
            Intrinsics.checkNotNullParameter(value3, "value");
            return value3.name();
        }
        if (i == 4) {
            w2 value4 = ((Shared) this).d;
            Intrinsics.checkNotNullParameter(value4, "value");
            return value4.name();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        od value5 = ((Shared) this).e;
        Intrinsics.checkNotNullParameter(value5, "value");
        return value5.name();
    }

    default boolean k2(n productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        if (this instanceof Retail) {
            if (((Retail) this).f50300a != k9.ProductUnspecified) {
                return false;
            }
        } else if (this instanceof Business) {
            if (((Business) this).f50298a != x0.ProductUnspecified) {
                return false;
            }
        } else if (this instanceof Junior) {
            if (((Junior) this).f50299a != q6.ProductUnspecified) {
                return false;
            }
        } else if (this instanceof RevolutX) {
            if (((RevolutX) this).f50301a != w2.ProductUnspecified) {
                return false;
            }
        } else if (this instanceof Terminal) {
            if (((Terminal) this).f50305a != od.ProductUnspecified) {
                return false;
            }
        } else {
            if (!(this instanceof Shared)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = no.l.f217809a[productType.ordinal()];
            if (i == 1) {
                x0 value = ((Shared) this).f50303b;
                Intrinsics.checkNotNullParameter(value, "value");
                if (value != x0.ProductUnspecified) {
                    return false;
                }
            } else if (i == 2) {
                k9 value2 = ((Shared) this).f50302a;
                Intrinsics.checkNotNullParameter(value2, "value");
                if (value2 != k9.ProductUnspecified) {
                    return false;
                }
            } else if (i == 3) {
                q6 value3 = ((Shared) this).f50304c;
                Intrinsics.checkNotNullParameter(value3, "value");
                if (value3 != q6.ProductUnspecified) {
                    return false;
                }
            } else if (i == 4) {
                w2 value4 = ((Shared) this).d;
                Intrinsics.checkNotNullParameter(value4, "value");
                if (value4 != w2.ProductUnspecified) {
                    return false;
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                od value5 = ((Shared) this).e;
                Intrinsics.checkNotNullParameter(value5, "value");
                if (value5 != od.ProductUnspecified) {
                    return false;
                }
            }
        }
        return true;
    }

    default boolean v3(n productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        if (this instanceof Retail) {
            if (((Retail) this).f50300a != k9.UNRECOGNIZED) {
                return false;
            }
        } else if (this instanceof Business) {
            if (((Business) this).f50298a != x0.UNRECOGNIZED) {
                return false;
            }
        } else if (this instanceof Junior) {
            if (((Junior) this).f50299a != q6.UNRECOGNIZED) {
                return false;
            }
        } else if (this instanceof RevolutX) {
            if (((RevolutX) this).f50301a != w2.UNRECOGNIZED) {
                return false;
            }
        } else if (this instanceof Terminal) {
            if (((Terminal) this).f50305a != od.UNRECOGNIZED) {
                return false;
            }
        } else {
            if (!(this instanceof Shared)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = no.l.f217809a[productType.ordinal()];
            if (i == 1) {
                x0 value = ((Shared) this).f50303b;
                Intrinsics.checkNotNullParameter(value, "value");
                if (value != x0.UNRECOGNIZED) {
                    return false;
                }
            } else if (i == 2) {
                k9 value2 = ((Shared) this).f50302a;
                Intrinsics.checkNotNullParameter(value2, "value");
                if (value2 != k9.UNRECOGNIZED) {
                    return false;
                }
            } else if (i == 3) {
                q6 value3 = ((Shared) this).f50304c;
                Intrinsics.checkNotNullParameter(value3, "value");
                if (value3 != q6.UNRECOGNIZED) {
                    return false;
                }
            } else if (i == 4) {
                w2 value4 = ((Shared) this).d;
                Intrinsics.checkNotNullParameter(value4, "value");
                if (value4 != w2.UNRECOGNIZED) {
                    return false;
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                od value5 = ((Shared) this).e;
                Intrinsics.checkNotNullParameter(value5, "value");
                if (value5 != od.UNRECOGNIZED) {
                    return false;
                }
            }
        }
        return true;
    }
}
