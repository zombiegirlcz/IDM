package com.revolut.feature.topup_screen.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "Landroid/os/Parcelable;", "Savings", "Joint", "Invest", "Pro", "Main", "RevXFiat", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$Invest;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$Joint;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$Main;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$Pro;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$RevXFiat;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget$Savings;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopUpTarget extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$Invest;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invest implements TopUpTarget {

        @NotNull
        public static final Parcelable.Creator<Invest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90571a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invest(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invest[i];
            }
        }

        public Invest(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f90571a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invest) && Intrinsics.f(this.f90571a, ((Invest) obj2).f90571a);
        }

        public final int hashCode() {
            return this.f90571a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90571a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$Joint;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements TopUpTarget {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId.Joint f90572a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint((AccountId.Joint) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(AccountId.Joint accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f90572a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f90572a, ((Joint) obj2).f90572a);
        }

        public final int hashCode() {
            return this.f90572a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90572a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$Main;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "<init>", "()V", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Main implements TopUpTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Main f90573a = new Main();

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Main.f90573a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        private Main() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$Pro;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "<init>", "()V", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro implements TopUpTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f90574a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f90574a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$RevXFiat;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "<init>", "()V", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevXFiat implements TopUpTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevXFiat f90575a = new RevXFiat();

        @NotNull
        public static final Parcelable.Creator<RevXFiat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevXFiat.f90575a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXFiat[i];
            }
        }

        private RevXFiat() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/common/TopUpTarget$Savings;", "Lcom/revolut/feature/topup_screen/common/TopUpTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements TopUpTarget {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f90577b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings(parcel.readParcelable(Savings.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(Parcelable parcelable, String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f90576a = id10;
            this.f90577b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj2;
            return Intrinsics.f(this.f90576a, savings.f90576a) && Intrinsics.f(this.f90577b, savings.f90577b);
        }

        public final int hashCode() {
            int iHashCode = this.f90576a.hashCode() * 31;
            Parcelable parcelable = this.f90577b;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90576a);
            dest.writeParcelable(this.f90577b, i);
        }
    }
}
