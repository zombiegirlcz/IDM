package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/meshconnect/link/entity/AccountToken;", "Landroid/os/Parcelable;", "account", "Lcom/meshconnect/link/entity/Account;", "accessToken", "", "refreshToken", "<init>", "(Lcom/meshconnect/link/entity/Account;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Lcom/meshconnect/link/entity/Account;", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccountToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountToken> CREATOR = new Creator();

    @NotNull
    private final String accessToken;

    @NotNull
    private final Account account;
    private final String refreshToken;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountToken(Account.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountToken[] newArray(int i) {
            return new AccountToken[i];
        }
    }

    public AccountToken(@NotNull Account account, @NotNull String accessToken, String str) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.account = account;
        this.accessToken = accessToken;
        this.refreshToken = str;
    }

    public static /* synthetic */ AccountToken copy$default(AccountToken accountToken, Account account, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            account = accountToken.account;
        }
        if ((i & 2) != 0) {
            str = accountToken.accessToken;
        }
        if ((i & 4) != 0) {
            str2 = accountToken.refreshToken;
        }
        return accountToken.copy(account, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final AccountToken copy(@NotNull Account account, @NotNull String accessToken, String refreshToken) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new AccountToken(account, accessToken, refreshToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountToken)) {
            return false;
        }
        AccountToken accountToken = (AccountToken) other;
        return Intrinsics.f(this.account, accountToken.account) && Intrinsics.f(this.accessToken, accountToken.accessToken) && Intrinsics.f(this.refreshToken, accountToken.refreshToken);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final Account getAccount() {
        return this.account;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        int iC = a.c(this.account.hashCode() * 31, 31, this.accessToken);
        String str = this.refreshToken;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("AccountToken(account=");
        sb6.append(this.account);
        sb6.append(", accessToken=");
        sb6.append(this.accessToken);
        sb6.append(", refreshToken=");
        return j6.a.u(sb6, this.refreshToken, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.account.writeToParcel(dest, flags);
        dest.writeString(this.accessToken);
        dest.writeString(this.refreshToken);
    }
}
