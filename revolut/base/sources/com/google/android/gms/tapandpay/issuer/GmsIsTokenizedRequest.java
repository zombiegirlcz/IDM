package com.google.android.gms.tapandpay.issuer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/gms/tapandpay/issuer/GmsIsTokenizedRequest;", "", "Lcom/google/android/gms/tapandpay/issuer/IsTokenizedRequest;", "request", "<init>", "(Lcom/google/android/gms/tapandpay/issuer/IsTokenizedRequest;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/gms/tapandpay/issuer/IsTokenizedRequest;", "getRequest", "()Lcom/google/android/gms/tapandpay/issuer/IsTokenizedRequest;", "mobile_services_google_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GmsIsTokenizedRequest {

    @NotNull
    private final IsTokenizedRequest request;

    public GmsIsTokenizedRequest(@NotNull IsTokenizedRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!GmsIsTokenizedRequest.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.google.android.gms.tapandpay.issuer.GmsIsTokenizedRequest");
        GmsIsTokenizedRequest gmsIsTokenizedRequest = (GmsIsTokenizedRequest) other;
        if (!Intrinsics.f(this.request.f48615zza, gmsIsTokenizedRequest.request.f48615zza)) {
            return false;
        }
        IsTokenizedRequest isTokenizedRequest = this.request;
        int i = isTokenizedRequest.f48616zzb;
        IsTokenizedRequest isTokenizedRequest2 = gmsIsTokenizedRequest.request;
        return i == isTokenizedRequest2.f48616zzb && isTokenizedRequest.f48617zzc == isTokenizedRequest2.f48617zzc && Intrinsics.f(isTokenizedRequest.f48618zzd, isTokenizedRequest2.f48618zzd);
    }

    @NotNull
    public final IsTokenizedRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        String str = this.request.f48615zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        IsTokenizedRequest isTokenizedRequest = this.request;
        int i = ((((iHashCode * 31) + isTokenizedRequest.f48616zzb) * 31) + isTokenizedRequest.f48617zzc) * 31;
        String str2 = isTokenizedRequest.f48618zzd;
        return i + (str2 != null ? str2.hashCode() : 0);
    }
}
