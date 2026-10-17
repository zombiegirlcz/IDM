package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetGlobalActionCardsRequestCreator")
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMaxCards", id = 1)
    private int f48579zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardWidthPx", id = 2)
    private int f48580zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardHeightPx", id = 3)
    private int f48581zzc;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final GetGlobalActionCardsRequest f48582zza;

        public Builder() {
            this.f48582zza = new GetGlobalActionCardsRequest(null);
        }

        @NonNull
        public GetGlobalActionCardsRequest build() {
            return this.f48582zza;
        }

        @NonNull
        public Builder setCardHeightPx(int i) {
            this.f48582zza.f48581zzc = i;
            return this;
        }

        @NonNull
        public Builder setCardWidthPx(int i) {
            this.f48582zza.f48580zzb = i;
            return this;
        }

        @NonNull
        public Builder setMaxCards(int i) {
            this.f48582zza.f48579zza = i;
            return this;
        }

        public Builder(@NonNull GetGlobalActionCardsRequest getGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest2 = new GetGlobalActionCardsRequest(null);
            this.f48582zza = getGlobalActionCardsRequest2;
            getGlobalActionCardsRequest2.f48579zza = getGlobalActionCardsRequest.f48579zza;
            getGlobalActionCardsRequest2.f48580zzb = getGlobalActionCardsRequest.f48580zzb;
            getGlobalActionCardsRequest2.f48581zzc = getGlobalActionCardsRequest.f48581zzc;
        }
    }

    private GetGlobalActionCardsRequest() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj2;
            if (Objects.equal(Integer.valueOf(this.f48579zza), Integer.valueOf(getGlobalActionCardsRequest.f48579zza)) && Objects.equal(Integer.valueOf(this.f48580zzb), Integer.valueOf(getGlobalActionCardsRequest.f48580zzb)) && Objects.equal(Integer.valueOf(this.f48581zzc), Integer.valueOf(getGlobalActionCardsRequest.f48581zzc))) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.f48581zzc;
    }

    public int getCardWidthPx() {
        return this.f48580zzb;
    }

    public int getMaxCards() {
        return this.f48579zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48579zza), Integer.valueOf(this.f48580zzb), Integer.valueOf(this.f48581zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMaxCards());
        SafeParcelWriter.writeInt(parcel, 2, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 3, getCardHeightPx());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GetGlobalActionCardsRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f48579zza = i;
        this.f48580zzb = i2;
        this.f48581zzc = i3;
    }

    public /* synthetic */ GetGlobalActionCardsRequest(zza zzaVar) {
    }
}
