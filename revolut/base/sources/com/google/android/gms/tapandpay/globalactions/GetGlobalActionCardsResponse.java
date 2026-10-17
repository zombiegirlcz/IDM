package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetGlobalActionCardsResponseCreator")
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCards", id = 1)
    private GlobalActionCard[] f48583zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSelectedIndex", id = 2)
    private int f48584zzb;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final GetGlobalActionCardsResponse f48585zza;

        public Builder() {
            this.f48585zza = new GetGlobalActionCardsResponse(null);
        }

        @NonNull
        public GetGlobalActionCardsResponse build() {
            return this.f48585zza;
        }

        @NonNull
        public Builder setCards(@NonNull GlobalActionCard[] globalActionCardArr) {
            this.f48585zza.f48583zza = globalActionCardArr;
            return this;
        }

        @NonNull
        public Builder setSelectedIndex(int i) {
            this.f48585zza.f48584zzb = i;
            return this;
        }

        public Builder(@NonNull GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new GetGlobalActionCardsResponse(null);
            this.f48585zza = getGlobalActionCardsResponse2;
            getGlobalActionCardsResponse2.f48583zza = getGlobalActionCardsResponse.f48583zza;
            getGlobalActionCardsResponse2.f48584zzb = getGlobalActionCardsResponse.f48584zzb;
        }
    }

    private GetGlobalActionCardsResponse() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj2;
            if (Arrays.equals(this.f48583zza, getGlobalActionCardsResponse.f48583zza) && Objects.equal(Integer.valueOf(this.f48584zzb), Integer.valueOf(getGlobalActionCardsResponse.f48584zzb))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public GlobalActionCard[] getCards() {
        return this.f48583zza;
    }

    public int getSelectedIndex() {
        return this.f48584zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f48583zza)), Integer.valueOf(this.f48584zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, getCards(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getSelectedIndex());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ GetGlobalActionCardsResponse(zzc zzcVar) {
    }

    @SafeParcelable.Constructor
    public GetGlobalActionCardsResponse(@SafeParcelable.Param(id = 1) GlobalActionCard[] globalActionCardArr, @SafeParcelable.Param(id = 2) int i) {
        this.f48583zza = globalActionCardArr;
        this.f48584zzb = i;
    }
}
