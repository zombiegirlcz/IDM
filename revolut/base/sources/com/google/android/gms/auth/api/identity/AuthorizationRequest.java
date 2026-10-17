package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthorizationRequestCreator")
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbe();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestedScopes", id = 1)
    private final List f37358zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServerClientId", id = 2)
    private final String f37359zbb;

    @SafeParcelable.Field(getter = "isOfflineAccessRequested", id = 3)
    private final boolean zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private final boolean f37360zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccount", id = 5)
    private final Account f37361zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHostedDomain", id = 6)
    private final String f37362zbf;

    /* JADX INFO: renamed from: zbg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 7)
    private final String f37363zbg;

    /* JADX INFO: renamed from: zbh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 8)
    private final boolean f37364zbh;

    /* JADX INFO: renamed from: zbi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResourceParameters", id = 9)
    private final Bundle f37365zbi;

    public static final class Builder {

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        private List f37366zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        private String f37367zbb;
        private boolean zbc;

        /* JADX INFO: renamed from: zbd, reason: collision with root package name */
        private boolean f37368zbd;

        /* JADX INFO: renamed from: zbe, reason: collision with root package name */
        private Account f37369zbe;

        /* JADX INFO: renamed from: zbf, reason: collision with root package name */
        private String f37370zbf;

        /* JADX INFO: renamed from: zbg, reason: collision with root package name */
        private String f37371zbg;

        /* JADX INFO: renamed from: zbh, reason: collision with root package name */
        private boolean f37372zbh;

        /* JADX INFO: renamed from: zbi, reason: collision with root package name */
        private Bundle f37373zbi;

        private final String zbd(String str) {
            Preconditions.checkNotNull(str);
            String str2 = this.f37367zbb;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        @NonNull
        public AuthorizationRequest build() {
            return new AuthorizationRequest(this.f37366zba, this.f37367zbb, this.zbc, this.f37368zbd, this.f37369zbe, this.f37370zbf, this.f37371zbg, this.f37372zbh, this.f37373zbi);
        }

        @NonNull
        public Builder filterByHostedDomain(@NonNull String str) {
            this.f37370zbf = Preconditions.checkNotEmpty(str);
            return this;
        }

        @NonNull
        public Builder requestOfflineAccess(@NonNull String str) {
            requestOfflineAccess(str, false);
            return this;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.f37369zbe = (Account) Preconditions.checkNotNull(account);
            return this;
        }

        @NonNull
        public Builder setRequestedScopes(@NonNull List<Scope> list) {
            boolean z = false;
            if (list != null && !list.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "requestedScopes cannot be null or empty");
            this.f37366zba = list;
            return this;
        }

        public final Builder zba(@NonNull zbd zbdVar, @NonNull String str) {
            Preconditions.checkNotNull(zbdVar, "Resource parameter cannot be null");
            Preconditions.checkNotNull(str, "Resource parameter value cannot be null");
            if (this.f37373zbi == null) {
                this.f37373zbi = new Bundle();
            }
            this.f37373zbi.putString(zbdVar.zbc, str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public final Builder zbb(@NonNull String str) {
            zbd(str);
            this.f37367zbb = str;
            this.f37368zbd = true;
            return this;
        }

        @NonNull
        public final Builder zbc(@NonNull String str) {
            this.f37371zbg = str;
            return this;
        }

        @NonNull
        public Builder requestOfflineAccess(@NonNull String str, boolean z) {
            zbd(str);
            this.f37367zbb = str;
            this.zbc = true;
            this.f37372zbh = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AuthorizationRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z3, @SafeParcelable.Param(id = 5) Account account, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) Bundle bundle) {
        boolean z6 = false;
        if (list != null && !list.isEmpty()) {
            z6 = true;
        }
        Preconditions.checkArgument(z6, "requestedScopes cannot be null or empty");
        this.f37358zba = list;
        this.f37359zbb = str;
        this.zbc = z;
        this.f37360zbd = z3;
        this.f37361zbe = account;
        this.f37362zbf = str2;
        this.f37363zbg = str3;
        this.f37364zbh = z4;
        this.f37365zbi = bundle;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        Preconditions.checkNotNull(authorizationRequest);
        Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        Bundle bundle = authorizationRequest.f37365zbi;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] zbdVarArrValues = zbd.values();
                int length = zbdVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        zbdVar = null;
                        break;
                    }
                    zbdVar = zbdVarArrValues[i];
                    if (zbdVar.zbc.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && zbdVar != null) {
                    builder.zba(zbdVar, string);
                }
            }
        }
        boolean zIsForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        String str2 = authorizationRequest.f37363zbg;
        String hostedDomain = authorizationRequest.getHostedDomain();
        Account account = authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (str2 != null) {
            builder.zbc(str2);
        }
        if (hostedDomain != null) {
            builder.filterByHostedDomain(hostedDomain);
        }
        if (account != null) {
            builder.setAccount(account);
        }
        if (authorizationRequest.f37360zbd && serverClientId != null) {
            builder.zbb(serverClientId);
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            builder.requestOfflineAccess(serverClientId, zIsForceCodeForRefreshToken);
        }
        return builder;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj2;
        if (this.f37358zba.size() == authorizationRequest.f37358zba.size() && this.f37358zba.containsAll(authorizationRequest.f37358zba)) {
            Bundle bundle = authorizationRequest.f37365zbi;
            Bundle bundle2 = this.f37365zbi;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : this.f37365zbi.keySet()) {
                        if (!Objects.equal(this.f37365zbi.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.zbc == authorizationRequest.zbc && this.f37364zbh == authorizationRequest.f37364zbh && this.f37360zbd == authorizationRequest.f37360zbd && Objects.equal(this.f37359zbb, authorizationRequest.f37359zbb) && Objects.equal(this.f37361zbe, authorizationRequest.f37361zbe) && Objects.equal(this.f37362zbf, authorizationRequest.f37362zbf) && Objects.equal(this.f37363zbg, authorizationRequest.f37363zbg)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Account getAccount() {
        return this.f37361zbe;
    }

    public String getHostedDomain() {
        return this.f37362zbf;
    }

    @NonNull
    public List<Scope> getRequestedScopes() {
        return this.f37358zba;
    }

    public String getServerClientId() {
        return this.f37359zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37358zba, this.f37359zbb, Boolean.valueOf(this.zbc), Boolean.valueOf(this.f37364zbh), Boolean.valueOf(this.f37360zbd), this.f37361zbe, this.f37362zbf, this.f37363zbg, this.f37365zbi);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.f37364zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getRequestedScopes(), false);
        SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isOfflineAccessRequested());
        SafeParcelWriter.writeBoolean(parcel, 4, this.f37360zbd);
        SafeParcelWriter.writeParcelable(parcel, 5, getAccount(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getHostedDomain(), false);
        SafeParcelWriter.writeString(parcel, 7, this.f37363zbg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, isForceCodeForRefreshToken());
        SafeParcelWriter.writeBundle(parcel, 9, this.f37365zbi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
