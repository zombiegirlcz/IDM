package com.revolut.feature.tab.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter;", "Landroid/os/Parcelable;", "Crypto", "Invest", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Crypto;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NonProductAccountFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Crypto;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Crypto implements NonProductAccountFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Crypto f89715a = new Crypto();

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Crypto.f89715a;
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter;", "Securities", "JointSecurities", "Cfd", "Commodities", "Robo", "Isa", "Pea", "PersonalJisa", "CustodianJisa", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Cfd;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Commodities;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$CustodianJisa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Isa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$JointSecurities;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Pea;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$PersonalJisa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Robo;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Securities;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Invest extends NonProductAccountFilter {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Cfd;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Cfd implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Cfd f89716a = new Cfd();

            @NotNull
            public static final Parcelable.Creator<Cfd> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Cfd.f89716a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cfd[i];
                }
            }

            private Cfd() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Commodities;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Commodities implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Commodities f89717a = new Commodities();

            @NotNull
            public static final Parcelable.Creator<Commodities> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Commodities.f89717a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$CustodianJisa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CustodianJisa implements Invest {

            @NotNull
            public static final Parcelable.Creator<CustodianJisa> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f89718a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustodianJisa(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustodianJisa[i];
                }
            }

            public CustodianJisa(String str) {
                this.f89718a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CustodianJisa) && Intrinsics.f(this.f89718a, ((CustodianJisa) obj2).f89718a);
            }

            public final int hashCode() {
                String str = this.f89718a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f89718a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Isa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Isa implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Isa f89719a = new Isa();

            @NotNull
            public static final Parcelable.Creator<Isa> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Isa.f89719a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Isa[i];
                }
            }

            private Isa() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$JointSecurities;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class JointSecurities implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final JointSecurities f89720a = new JointSecurities();

            @NotNull
            public static final Parcelable.Creator<JointSecurities> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return JointSecurities.f89720a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointSecurities[i];
                }
            }

            private JointSecurities() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Pea;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Pea implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Pea f89721a = new Pea();

            @NotNull
            public static final Parcelable.Creator<Pea> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Pea.f89721a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pea[i];
                }
            }

            private Pea() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$PersonalJisa;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PersonalJisa implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PersonalJisa f89722a = new PersonalJisa();

            @NotNull
            public static final Parcelable.Creator<PersonalJisa> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PersonalJisa.f89722a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PersonalJisa[i];
                }
            }

            private PersonalJisa() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Robo;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Robo implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Robo f89723a = new Robo();

            @NotNull
            public static final Parcelable.Creator<Robo> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Robo.f89723a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Robo[i];
                }
            }

            private Robo() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest$Securities;", "Lcom/revolut/feature/tab/accounts/models/NonProductAccountFilter$Invest;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Securities implements Invest {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Securities f89724a = new Securities();

            @NotNull
            public static final Parcelable.Creator<Securities> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Securities.f89724a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Securities[i];
                }
            }

            private Securities() {
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
}
