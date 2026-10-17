package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyRequestCreator")
public class ProxyRequest extends AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;

    @NonNull
    @SafeParcelable.Field(id = 4)
    public final byte[] body;

    @SafeParcelable.Field(id = 2)
    public final int httpMethod;

    @SafeParcelable.Field(id = 3)
    public final long timeoutMillis;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 1)
    public final String f37461url;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f37462zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final Bundle f37463zzb;

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f37464zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f37465zzb = ProxyRequest.HTTP_METHOD_GET;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private long f37466zzc = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private byte[] f37467zzd = new byte[0];

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final Bundle f37468zze = new Bundle();

        public Builder(@NonNull String str) {
            Preconditions.checkNotEmpty(str);
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                throw new IllegalArgumentException(a.p("The supplied url [ ", str, "] is not match Patterns.WEB_URL!"));
            }
            this.f37464zza = str;
        }

        @NonNull
        public ProxyRequest build() {
            if (this.f37467zzd == null) {
                this.f37467zzd = new byte[0];
            }
            return new ProxyRequest(2, this.f37464zza, this.f37465zzb, this.f37466zzc, this.f37467zzd, this.f37468zze);
        }

        @NonNull
        public Builder putHeader(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            Bundle bundle = this.f37468zze;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        @NonNull
        public Builder setBody(@NonNull byte[] bArr) {
            this.f37467zzd = bArr;
            return this;
        }

        @NonNull
        public Builder setHttpMethod(int i) {
            boolean z = false;
            if (i >= 0 && i <= ProxyRequest.LAST_CODE) {
                z = true;
            }
            Preconditions.checkArgument(z, "Unrecognized http method code.");
            this.f37465zzb = i;
            return this;
        }

        @NonNull
        public Builder setTimeoutMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "The specified timeout must be non-negative.");
            this.f37466zzc = j2;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ProxyRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Bundle bundle) {
        this.f37462zza = i;
        this.f37461url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j2;
        this.body = bArr;
        this.f37463zzb = bundle;
    }

    @NonNull
    public Map<String, String> getHeaderMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f37463zzb.size());
        for (String str : this.f37463zzb.keySet()) {
            String string = this.f37463zzb.getString(str);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(str, string);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @NonNull
    public String toString() {
        return "ProxyRequest[ url: " + this.f37461url + ", method: " + this.httpMethod + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f37461url, false);
        SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.f37463zzb, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f37462zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
