package com.revolut.feature.vaults.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AddMoney", "AddMoneyWithResultNavigation", "DocumentsAcceptance", "WithdrawMoney", "RecurringTransfer", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoney;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoneyWithResultNavigation;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$DocumentsAcceptance;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$RecurringTransfer;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$WithdrawMoney;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VaultsKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoneyWithResultNavigation;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "Config", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMoneyWithResultNavigation extends VaultsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f94717g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoneyWithResultNavigation$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f94718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f94719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Long f94720c;
            public final int d;
            public final int e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f94721g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f94722h;
            public final Integer i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Long lValueOf;
                    Integer num;
                    boolean z;
                    boolean z3;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    s sVar = (s) parcel.readSerializable();
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        num = null;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(parcel.readLong());
                        num = null;
                    }
                    int i = parcel.readInt();
                    int i2 = parcel.readInt();
                    boolean z4 = false;
                    boolean z6 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z4 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z6 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z3 = z;
                    }
                    return new Config(i, i2, parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt()), lValueOf, string, sVar, z4, z6, z3);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(int i, int i2, Integer num, Long l2, String str, s vault, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(vault, "vault");
                this.f94718a = vault;
                this.f94719b = str;
                this.f94720c = l2;
                this.d = i;
                this.e = i2;
                this.f = z;
                this.f94721g = z3;
                this.f94722h = z4;
                this.i = num;
            }

            /* JADX INFO: renamed from: T5, reason: from getter */
            public final String getF94719b() {
                return this.f94719b;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF94722h() {
                return this.f94722h;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Integer getI() {
                return this.i;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getF94721g() {
                return this.f94721g;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Config)) {
                    return false;
                }
                Config config = (Config) obj2;
                return Intrinsics.f(this.f94718a, config.f94718a) && Intrinsics.f(this.f94719b, config.f94719b) && Intrinsics.f(this.f94720c, config.f94720c) && this.d == config.d && this.e == config.e && this.f == config.f && this.f94721g == config.f94721g && this.f94722h == config.f94722h && Intrinsics.f(this.i, config.i);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Long getF94720c() {
                return this.f94720c;
            }

            /* JADX INFO: renamed from: h0, reason: from getter */
            public final int getD() {
                return this.d;
            }

            public final int hashCode() {
                int iHashCode = this.f94718a.hashCode() * 31;
                String str = this.f94719b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l2 = this.f94720c;
                int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.e, j6.a.b(this.d, (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31), 31, this.f), 31, this.f94721g), 31, this.f94722h);
                Integer num = this.i;
                return iC + (num != null ? num.hashCode() : 0);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final s getF94718a() {
                return this.f94718a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f94718a);
                dest.writeString(this.f94719b);
                Long l2 = this.f94720c;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
                dest.writeInt(this.d);
                dest.writeInt(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f94721g ? 1 : 0);
                dest.writeInt(this.f94722h ? 1 : 0);
                Integer num = this.i;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoneyWithResultNavigation$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Config f94723a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(Config.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f94723a = config;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Config getF94723a() {
                return this.f94723a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f94723a, ((Destination) obj2).f94723a);
            }

            public final int hashCode() {
                return this.f94723a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f94723a.writeToParcel(dest, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoneyWithResultNavigation(Config config) {
            super(new Destination(config), config.i, 4);
            Intrinsics.checkNotNullParameter(config, "config");
            this.f94717g = config;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddMoneyWithResultNavigation) && Intrinsics.f(this.f94717g, ((AddMoneyWithResultNavigation) obj2).f94717g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f94717g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$DocumentsAcceptance;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "<init>", "()V", "Destination", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsAcceptance extends VaultsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final DocumentsAcceptance f94724g = new DocumentsAcceptance();

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$DocumentsAcceptance$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Destination implements KompotDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Destination f94725a = new Destination();

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Destination.f94725a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            private Destination() {
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

        private DocumentsAcceptance() {
            super(Destination.f94725a, null, 6);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$WithdrawMoney;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawMoney extends VaultsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s f94734g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$WithdrawMoney$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f94735a;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((s) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(s vault) {
                Intrinsics.checkNotNullParameter(vault, "vault");
                this.f94735a = vault;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f94735a, ((Destination) obj2).f94735a);
            }

            public final int hashCode() {
                return this.f94735a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f94735a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawMoney(s vault) {
            super(new Destination(vault), null, 6);
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f94734g = vault;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithdrawMoney) && Intrinsics.f(this.f94734g, ((WithdrawMoney) obj2).f94734g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f94734g.hashCode();
        }
    }

    public VaultsKompotFeatureConfig(KompotDestination kompotDestination, Integer num, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (i & 2) != 0 ? null : num, 0, 37);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$RecurringTransfer;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "Config", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringTransfer extends VaultsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f94727g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$RecurringTransfer$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Config f94731a;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(Config.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f94731a = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f94731a, ((Destination) obj2).f94731a);
            }

            public final int hashCode() {
                return this.f94731a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f94731a.writeToParcel(dest, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringTransfer(Config config) {
            super(new Destination(config), config.e, 4);
            Intrinsics.checkNotNullParameter(config, "config");
            this.f94727g = config;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringTransfer) && Intrinsics.f(this.f94727g, ((RecurringTransfer) obj2).f94727g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f94727g.hashCode();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$RecurringTransfer$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f94728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f94729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransferScheduleData f94730c;
            public final Long d;
            public final Integer e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    return new Config((TransferScheduleData) parcel.readParcelable(Config.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), string, string2, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(TransferScheduleData transferScheduleData, Integer num, Long l2, String vaultId, String currencyCode, String str) {
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                this.f94728a = vaultId;
                this.f94729b = currencyCode;
                this.f94730c = transferScheduleData;
                this.d = l2;
                this.e = num;
                this.f = str;
            }

            /* JADX INFO: renamed from: T5, reason: from getter */
            public final String getF() {
                return this.f;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF94729b() {
                return this.f94729b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final TransferScheduleData getF94730c() {
                return this.f94730c;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF94728a() {
                return this.f94728a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Config)) {
                    return false;
                }
                Config config = (Config) obj2;
                return Intrinsics.f(this.f94728a, config.f94728a) && Intrinsics.f(this.f94729b, config.f94729b) && Intrinsics.f(this.f94730c, config.f94730c) && Intrinsics.f(this.d, config.d) && Intrinsics.f(this.e, config.e) && Intrinsics.f(this.f, config.f);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Long getD() {
                return this.d;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f94728a.hashCode() * 31, 31, this.f94729b);
                TransferScheduleData transferScheduleData = this.f94730c;
                int iHashCode = (iC + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 31;
                Long l2 = this.d;
                int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                Integer num = this.e;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f;
                return iHashCode3 + (str != null ? str.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f94728a);
                dest.writeString(this.f94729b);
                dest.writeParcelable(this.f94730c, i);
                Long l2 = this.d;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
                Integer num = this.e;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeString(this.f);
            }

            public /* synthetic */ Config(int i, Long l2, String str, String str2, String str3) {
                this(null, null, (i & 8) != 0 ? null : l2, str, str2, str3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoney;", "Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "Config", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMoney extends VaultsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f94709g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoney$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Config f94716a;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(Config.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f94716a = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f94716a, ((Destination) obj2).f94716a);
            }

            public final int hashCode() {
                return this.f94716a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f94716a.writeToParcel(dest, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoney(Config config) {
            super(new Destination(config), config.i, 4);
            Intrinsics.checkNotNullParameter(config, "config");
            this.f94709g = config;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddMoney) && Intrinsics.f(this.f94709g, ((AddMoney) obj2).f94709g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f94709g.hashCode();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$AddMoney$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f94710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f94711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Long f94712c;
            public final int d;
            public final int e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f94713g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f94714h;
            public final Integer i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f94715j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Long lValueOf;
                    Integer numValueOf;
                    boolean z;
                    boolean z3;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    s sVar = (s) parcel.readSerializable();
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        numValueOf = null;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(parcel.readLong());
                        numValueOf = null;
                    }
                    int i = parcel.readInt();
                    int i2 = parcel.readInt();
                    boolean z6 = false;
                    boolean z11 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z6 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z11 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = z3;
                    } else {
                        z4 = z3;
                        z3 = z;
                    }
                    if (parcel.readInt() != 0) {
                        numValueOf = Integer.valueOf(parcel.readInt());
                    }
                    if (parcel.readInt() == 0) {
                        z4 = z;
                    }
                    return new Config(i, i2, numValueOf, lValueOf, string, sVar, z6, z11, z3, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(int i, int i2, Integer num, Long l2, String str, s vault, boolean z, boolean z3, boolean z4, boolean z6) {
                Intrinsics.checkNotNullParameter(vault, "vault");
                this.f94710a = vault;
                this.f94711b = str;
                this.f94712c = l2;
                this.d = i;
                this.e = i2;
                this.f = z;
                this.f94713g = z3;
                this.f94714h = z4;
                this.i = num;
                this.f94715j = z6;
            }

            public static Config a(Config config) {
                s vault = config.f94710a;
                String str = config.f94711b;
                Long l2 = config.f94712c;
                int i = config.d;
                int i2 = config.e;
                boolean z = config.f;
                boolean z3 = config.f94713g;
                boolean z4 = config.f94714h;
                Integer num = config.i;
                config.getClass();
                Intrinsics.checkNotNullParameter(vault, "vault");
                return new Config(i, i2, num, l2, str, vault, z, z3, z4, true);
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public final s getF94710a() {
                return this.f94710a;
            }

            /* JADX INFO: renamed from: T5, reason: from getter */
            public final String getF94711b() {
                return this.f94711b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF94714h() {
                return this.f94714h;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF94715j() {
                return this.f94715j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Integer getI() {
                return this.i;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Config)) {
                    return false;
                }
                Config config = (Config) obj2;
                return Intrinsics.f(this.f94710a, config.f94710a) && Intrinsics.f(this.f94711b, config.f94711b) && Intrinsics.f(this.f94712c, config.f94712c) && this.d == config.d && this.e == config.e && this.f == config.f && this.f94713g == config.f94713g && this.f94714h == config.f94714h && Intrinsics.f(this.i, config.i) && this.f94715j == config.f94715j;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Long getF94712c() {
                return this.f94712c;
            }

            /* JADX INFO: renamed from: h0, reason: from getter */
            public final int getD() {
                return this.d;
            }

            public final int hashCode() {
                int iHashCode = this.f94710a.hashCode() * 31;
                String str = this.f94711b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l2 = this.f94712c;
                int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.e, j6.a.b(this.d, (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31), 31, this.f), 31, this.f94713g), 31, this.f94714h);
                Integer num = this.i;
                return Boolean.hashCode(this.f94715j) + ((iC + (num != null ? num.hashCode() : 0)) * 31);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getF() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f94710a);
                dest.writeString(this.f94711b);
                Long l2 = this.f94712c;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
                dest.writeInt(this.d);
                dest.writeInt(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f94713g ? 1 : 0);
                dest.writeInt(this.f94714h ? 1 : 0);
                Integer num = this.i;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeInt(this.f94715j ? 1 : 0);
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final boolean getF94713g() {
                return this.f94713g;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Config(s sVar, String str, Long l2, boolean z, boolean z3, Integer num, int i) {
                Long l3 = (i & 4) != 0 ? null : l2;
                this(R$drawable.uikit_icn_24_back_button_arrow, R$string.vaults_funding_options_add_money, (i & 256) != 0 ? null : num, l3, str, sVar, true, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z3, false);
            }
        }
    }
}
