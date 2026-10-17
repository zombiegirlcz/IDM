package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.api.accounts.RevolutAccount;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential;", "Landroid/os/Parcelable;", "SessionToken", "Account", "Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential$Account;", "Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential$SessionToken;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InitialAuthenticationCredential extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential$Account;", "Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential;", "account", "Lcom/revolut/sso/api/accounts/RevolutAccount;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Account implements InitialAuthenticationCredential {

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutAccount f106153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                RevolutAccount account = (RevolutAccount) j6.a.f(parcel, "parcel", Account.class);
                Intrinsics.checkNotNullParameter(account, "account");
                return new Account(account);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        public /* synthetic */ Account(RevolutAccount revolutAccount) {
            this.f106153a = revolutAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Account) {
                return Intrinsics.f(this.f106153a, ((Account) obj2).f106153a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106153a.hashCode();
        }

        public final String toString() {
            return "Account(account=" + this.f106153a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106153a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential$SessionToken;", "Lcom/revolut/sso/impl/domain/models/InitialAuthenticationCredential;", "sessionToken", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SessionToken implements InitialAuthenticationCredential {

        @NotNull
        public static final Parcelable.Creator<SessionToken> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SessionToken(v7.t(parcel, "parcel", "sessionToken"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SessionToken[i];
            }
        }

        public /* synthetic */ SessionToken(String str) {
            this.f106154a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof SessionToken) {
                return Intrinsics.f(this.f106154a, ((SessionToken) obj2).f106154a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106154a.hashCode();
        }

        public final String toString() {
            return p.a.p("SessionToken(sessionToken=", this.f106154a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106154a);
        }
    }
}
