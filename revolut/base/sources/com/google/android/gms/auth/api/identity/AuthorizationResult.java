package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthorizationResultCreator")
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbf();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final String f37374zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccessToken", id = 2)
    private final String f37375zbb;

    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final String zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 4)
    private final List f37376zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "toGoogleSignInAccount", id = 5)
    private final GoogleSignInAccount f37377zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 6)
    private final PendingIntent f37378zbf;

    @SafeParcelable.Constructor
    public AuthorizationResult(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @NonNull @SafeParcelable.Param(id = 4) List<String> list, @SafeParcelable.Param(id = 5) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 6) PendingIntent pendingIntent) {
        this.f37374zba = str;
        this.f37375zbb = str2;
        this.zbc = str3;
        this.f37376zbd = (List) Preconditions.checkNotNull(list);
        this.f37378zbf = pendingIntent;
        this.f37377zbe = googleSignInAccount;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj2;
        return Objects.equal(this.f37374zba, authorizationResult.f37374zba) && Objects.equal(this.f37375zbb, authorizationResult.f37375zbb) && Objects.equal(this.zbc, authorizationResult.zbc) && Objects.equal(this.f37376zbd, authorizationResult.f37376zbd) && Objects.equal(this.f37378zbf, authorizationResult.f37378zbf) && Objects.equal(this.f37377zbe, authorizationResult.f37377zbe);
    }

    public String getAccessToken() {
        return this.f37375zbb;
    }

    @NonNull
    public List<String> getGrantedScopes() {
        return this.f37376zbd;
    }

    public PendingIntent getPendingIntent() {
        return this.f37378zbf;
    }

    public String getServerAuthCode() {
        return this.f37374zba;
    }

    public boolean hasResolution() {
        return this.f37378zbf != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37374zba, this.f37375zbb, this.zbc, this.f37376zbd, this.f37378zbf, this.f37377zbe);
    }

    public GoogleSignInAccount toGoogleSignInAccount() {
        return this.f37377zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeStringList(parcel, 4, getGrantedScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, toGoogleSignInAccount(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
