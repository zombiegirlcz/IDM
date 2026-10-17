package com.revolut.feature.topup_screen.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pte.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "PreselectedTopUpMethod", "pte/a", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f90473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f90474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PreselectedTopUpMethod f90475c;
    public final TopUpTarget d;
    public final a e;
    public final boolean f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TopUpConfig> CREATOR = new b();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "ExternalPocket", "ExternalOneOff", "McyStoredMethod", "PayNow", "GooglePay", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$ExternalOneOff;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$ExternalPocket;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$GooglePay;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$McyStoredMethod;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$PayNow;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PreselectedTopUpMethod implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$ExternalOneOff;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "<init>", "()V", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ExternalOneOff extends PreselectedTopUpMethod {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ExternalOneOff f90476a = new ExternalOneOff();

            @NotNull
            public static final Parcelable.Creator<ExternalOneOff> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ExternalOneOff.f90476a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExternalOneOff[i];
                }
            }

            private ExternalOneOff() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$ExternalPocket;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExternalPocket extends PreselectedTopUpMethod {

            @NotNull
            public static final Parcelable.Creator<ExternalPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f90477a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ExternalPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExternalPocket[i];
                }
            }

            public ExternalPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f90477a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ExternalPocket) && Intrinsics.f(this.f90477a, ((ExternalPocket) obj2).f90477a);
            }

            public final int hashCode() {
                return this.f90477a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f90477a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$GooglePay;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "<init>", "()V", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class GooglePay extends PreselectedTopUpMethod {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final GooglePay f90478a = new GooglePay();

            @NotNull
            public static final Parcelable.Creator<GooglePay> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GooglePay.f90478a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GooglePay[i];
                }
            }

            private GooglePay() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$McyStoredMethod;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class McyStoredMethod extends PreselectedTopUpMethod {

            @NotNull
            public static final Parcelable.Creator<McyStoredMethod> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f90479a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new McyStoredMethod(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new McyStoredMethod[i];
                }
            }

            public McyStoredMethod(String storedMethodId) {
                Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
                this.f90479a = storedMethodId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof McyStoredMethod) && Intrinsics.f(this.f90479a, ((McyStoredMethod) obj2).f90479a);
            }

            public final int hashCode() {
                return this.f90479a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f90479a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod$PayNow;", "Lcom/revolut/feature/topup_screen/api/config/TopUpConfig$PreselectedTopUpMethod;", "<init>", "()V", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PayNow extends PreselectedTopUpMethod {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PayNow f90480a = new PayNow();

            @NotNull
            public static final Parcelable.Creator<PayNow> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PayNow.f90480a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PayNow[i];
                }
            }

            private PayNow() {
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

        private PreselectedTopUpMethod() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.api.config.TopUpConfig$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static TopUpConfig a(Companion companion, d amountMoney, TopUpTarget.Savings savings, a aVar, int i) {
            TopUpTarget topUpTarget = savings;
            if ((i & 4) != 0) {
                topUpTarget = TopUpTarget.Main.f90573a;
            }
            TopUpTarget topUpTarget2 = topUpTarget;
            if ((i & 8) != 0) {
                aVar = a.STANDARD;
            }
            a topUpFlow = aVar;
            companion.getClass();
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            Intrinsics.checkNotNullParameter(topUpTarget2, "topUpTarget");
            Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
            return new TopUpConfig(amountMoney.f115083b, amountMoney, null, topUpTarget2, topUpFlow, false);
        }

        public static TopUpConfig b(xi0.b currency, TopUpTarget topUpTarget) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            return new TopUpConfig(currency, null, null, topUpTarget, a.STANDARD, false);
        }

        public static TopUpConfig c(Companion companion, xi0.b bVar, PreselectedTopUpMethod preselectedTopUpMethod, TopUpTarget topUpTarget, a aVar, int i) {
            xi0.b bVar2 = (i & 1) != 0 ? null : bVar;
            PreselectedTopUpMethod preselectedTopUpMethod2 = (i & 2) != 0 ? null : preselectedTopUpMethod;
            if ((i & 4) != 0) {
                topUpTarget = TopUpTarget.Main.f90573a;
            }
            TopUpTarget topUpTarget2 = topUpTarget;
            if ((i & 8) != 0) {
                aVar = a.STANDARD;
            }
            a topUpFlow = aVar;
            boolean z = (i & 16) == 0;
            companion.getClass();
            Intrinsics.checkNotNullParameter(topUpTarget2, "topUpTarget");
            Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
            return new TopUpConfig(bVar2, null, preselectedTopUpMethod2, topUpTarget2, topUpFlow, z);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopUpConfig((xi0.b) parcel.readSerializable(), (d) parcel.readSerializable(), (PreselectedTopUpMethod) parcel.readParcelable(TopUpConfig.class.getClassLoader()), (TopUpTarget) parcel.readParcelable(TopUpConfig.class.getClassLoader()), a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopUpConfig[i];
        }
    }

    public TopUpConfig(xi0.b bVar, d dVar, PreselectedTopUpMethod preselectedTopUpMethod, TopUpTarget topUpTarget, a aVar, boolean z) {
        this.f90473a = bVar;
        this.f90474b = dVar;
        this.f90475c = preselectedTopUpMethod;
        this.d = topUpTarget;
        this.e = aVar;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopUpConfig)) {
            return false;
        }
        TopUpConfig topUpConfig = (TopUpConfig) obj2;
        return Intrinsics.f(this.f90473a, topUpConfig.f90473a) && Intrinsics.f(this.f90474b, topUpConfig.f90474b) && Intrinsics.f(this.f90475c, topUpConfig.f90475c) && Intrinsics.f(this.d, topUpConfig.d) && this.e == topUpConfig.e && this.f == topUpConfig.f;
    }

    public final int hashCode() {
        xi0.b bVar = this.f90473a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        d dVar = this.f90474b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PreselectedTopUpMethod preselectedTopUpMethod = this.f90475c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (preselectedTopUpMethod != null ? preselectedTopUpMethod.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90473a);
        dest.writeSerializable(this.f90474b);
        dest.writeParcelable(this.f90475c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
    }
}
