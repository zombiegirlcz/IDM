package com.revolut.retail.trading.core.domain.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "AccountClosureInProgress", "AccountClosureProgressBlocked", "AccountClosed", "BackendRequestedAccountClosure", "NoAccountClosure", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosed;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosureInProgress;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosureProgressBlocked;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$BackendRequestedAccountClosure;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$NoAccountClosure;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountClosureStatus implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosed;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountClosed extends AccountClosureStatus {

        @NotNull
        public static final Parcelable.Creator<AccountClosed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f104499a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountClosed((Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClosed[i];
            }
        }

        public AccountClosed(Instant instant) {
            this.f104499a = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountClosed) && Intrinsics.f(this.f104499a, ((AccountClosed) obj2).f104499a);
        }

        public final int hashCode() {
            Instant instant = this.f104499a;
            if (instant == null) {
                return 0;
            }
            return instant.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104499a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosureInProgress;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountClosureInProgress extends AccountClosureStatus {

        @NotNull
        public static final Parcelable.Creator<AccountClosureInProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureProgress f104500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104501b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountClosureInProgress(AccountClosureProgress.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClosureInProgress[i];
            }
        }

        public AccountClosureInProgress(AccountClosureProgress progress, boolean z) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f104500a = progress;
            this.f104501b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountClosureInProgress)) {
                return false;
            }
            AccountClosureInProgress accountClosureInProgress = (AccountClosureInProgress) obj2;
            return Intrinsics.f(this.f104500a, accountClosureInProgress.f104500a) && this.f104501b == accountClosureInProgress.f104501b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104501b) + (this.f104500a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104500a.writeToParcel(dest, i);
            dest.writeInt(this.f104501b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$AccountClosureProgressBlocked;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountClosureProgressBlocked extends AccountClosureStatus {

        @NotNull
        public static final Parcelable.Creator<AccountClosureProgressBlocked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureProgress f104502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f104503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104504c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountClosureProgressBlocked(AccountClosureProgress.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClosureProgressBlocked[i];
            }
        }

        public AccountClosureProgressBlocked(AccountClosureProgress progress, b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f104502a = progress;
            this.f104503b = bVar;
            this.f104504c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountClosureProgressBlocked)) {
                return false;
            }
            AccountClosureProgressBlocked accountClosureProgressBlocked = (AccountClosureProgressBlocked) obj2;
            return Intrinsics.f(this.f104502a, accountClosureProgressBlocked.f104502a) && Intrinsics.f(this.f104503b, accountClosureProgressBlocked.f104503b) && this.f104504c == accountClosureProgressBlocked.f104504c;
        }

        public final int hashCode() {
            int iHashCode = this.f104502a.hashCode() * 31;
            b bVar = this.f104503b;
            return Boolean.hashCode(this.f104504c) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104502a.writeToParcel(dest, i);
            dest.writeSerializable(this.f104503b);
            dest.writeInt(this.f104504c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$BackendRequestedAccountClosure;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackendRequestedAccountClosure extends AccountClosureStatus {

        @NotNull
        public static final Parcelable.Creator<BackendRequestedAccountClosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureBackendRequestedDetails f104505a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackendRequestedAccountClosure(parcel.readInt() == 0 ? null : AccountClosureBackendRequestedDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackendRequestedAccountClosure[i];
            }
        }

        public BackendRequestedAccountClosure(AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails) {
            this.f104505a = accountClosureBackendRequestedDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BackendRequestedAccountClosure) && Intrinsics.f(this.f104505a, ((BackendRequestedAccountClosure) obj2).f104505a);
        }

        public final int hashCode() {
            AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = this.f104505a;
            if (accountClosureBackendRequestedDetails == null) {
                return 0;
            }
            return accountClosureBackendRequestedDetails.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = this.f104505a;
            if (accountClosureBackendRequestedDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                accountClosureBackendRequestedDetails.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus$NoAccountClosure;", "Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureStatus;", "<init>", "()V", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoAccountClosure extends AccountClosureStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoAccountClosure f104506a = new NoAccountClosure();

        @NotNull
        public static final Parcelable.Creator<NoAccountClosure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoAccountClosure.f104506a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoAccountClosure[i];
            }
        }

        private NoAccountClosure() {
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

    private AccountClosureStatus() {
    }
}
