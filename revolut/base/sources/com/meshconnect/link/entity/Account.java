package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015¨\u0006+"}, d2 = {"Lcom/meshconnect/link/entity/Account;", "Landroid/os/Parcelable;", "accountId", "", "accountName", "frontAccountId", "fund", "", "cash", "isReconnected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getAccountId", "()Ljava/lang/String;", "getAccountName", "getFrontAccountId", "getFund", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCash", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/meshconnect/link/entity/Account;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Account implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Account> CREATOR = new Creator();

    @NotNull
    private final String accountId;

    @NotNull
    private final String accountName;
    private final Double cash;

    @NotNull
    private final String frontAccountId;
    private final Double fund;
    private final Boolean isReconnected;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Account> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Account(string, string2, string3, dValueOf, dValueOf2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account[] newArray(int i) {
            return new Account[i];
        }
    }

    public Account(@NotNull String accountId, @NotNull String accountName, @NotNull String frontAccountId, Double d, Double d5, Boolean bool) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(frontAccountId, "frontAccountId");
        this.accountId = accountId;
        this.accountName = accountName;
        this.frontAccountId = frontAccountId;
        this.fund = d;
        this.cash = d5;
        this.isReconnected = bool;
    }

    public static /* synthetic */ Account copy$default(Account account, String str, String str2, String str3, Double d, Double d5, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = account.accountId;
        }
        if ((i & 2) != 0) {
            str2 = account.accountName;
        }
        if ((i & 4) != 0) {
            str3 = account.frontAccountId;
        }
        if ((i & 8) != 0) {
            d = account.fund;
        }
        if ((i & 16) != 0) {
            d5 = account.cash;
        }
        if ((i & 32) != 0) {
            bool = account.isReconnected;
        }
        Double d6 = d5;
        Boolean bool2 = bool;
        return account.copy(str, str2, str3, d, d6, bool2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFrontAccountId() {
        return this.frontAccountId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getFund() {
        return this.fund;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getCash() {
        return this.cash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsReconnected() {
        return this.isReconnected;
    }

    @NotNull
    public final Account copy(@NotNull String accountId, @NotNull String accountName, @NotNull String frontAccountId, Double fund, Double cash, Boolean isReconnected) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(frontAccountId, "frontAccountId");
        return new Account(accountId, accountName, frontAccountId, fund, cash, isReconnected);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        return Intrinsics.f(this.accountId, account.accountId) && Intrinsics.f(this.accountName, account.accountName) && Intrinsics.f(this.frontAccountId, account.frontAccountId) && Intrinsics.f(this.fund, account.fund) && Intrinsics.f(this.cash, account.cash) && Intrinsics.f(this.isReconnected, account.isReconnected);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    public final Double getCash() {
        return this.cash;
    }

    @NotNull
    public final String getFrontAccountId() {
        return this.frontAccountId;
    }

    public final Double getFund() {
        return this.fund;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.accountId.hashCode() * 31, 31, this.accountName), 31, this.frontAccountId);
        Double d = this.fund;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.cash;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Boolean bool = this.isReconnected;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isReconnected() {
        return this.isReconnected;
    }

    @NotNull
    public String toString() {
        return "Account(accountId=" + this.accountId + ", accountName=" + this.accountName + ", frontAccountId=" + this.frontAccountId + ", fund=" + this.fund + ", cash=" + this.cash + ", isReconnected=" + this.isReconnected + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountId);
        dest.writeString(this.accountName);
        dest.writeString(this.frontAccountId);
        Double d = this.fund;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        Double d5 = this.cash;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
        }
        Boolean bool = this.isReconnected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            a.A(dest, 1, bool);
        }
    }
}
