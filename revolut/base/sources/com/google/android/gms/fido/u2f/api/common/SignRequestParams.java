package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SignRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final Integer f38725zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final Double f38726zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final Uri f38727zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDefaultSignChallenge", id = 5)
    private final byte[] f38728zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisteredKeys", id = 6)
    private final List f38729zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChannelIdValue", id = 7)
    private final ChannelIdValue f38730zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDisplayHint", id = 8)
    private final String f38731zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Set f38732zzh;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        Integer f38733zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        Double f38734zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        Uri f38735zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        byte[] f38736zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        List f38737zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        ChannelIdValue f38738zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        String f38739zzg;

        @NonNull
        public SignRequestParams build() {
            return new SignRequestParams(this.f38733zza, this.f38734zzb, this.f38735zzc, this.f38736zzd, this.f38737zze, this.f38738zzf, this.f38739zzg);
        }

        @NonNull
        public Builder setAppId(@NonNull Uri uri2) {
            this.f38735zzc = uri2;
            return this;
        }

        @NonNull
        public Builder setChannelIdValue(@NonNull ChannelIdValue channelIdValue) {
            this.f38738zzf = channelIdValue;
            return this;
        }

        @NonNull
        public Builder setDefaultSignChallenge(@NonNull byte[] bArr) {
            this.f38736zzd = bArr;
            return this;
        }

        @NonNull
        public Builder setDisplayHint(@NonNull String str) {
            this.f38739zzg = str;
            return this;
        }

        @NonNull
        public Builder setRegisteredKeys(@NonNull List<RegisteredKey> list) {
            this.f38737zze = list;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull Integer num) {
            this.f38733zza = num;
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(Double d) {
            this.f38734zzb = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SignRequestParams(@SafeParcelable.Param(id = 2) Integer num, @SafeParcelable.Param(id = 3) Double d, @SafeParcelable.Param(id = 4) Uri uri2, @SafeParcelable.Param(id = 5) byte[] bArr, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) ChannelIdValue channelIdValue, @SafeParcelable.Param(id = 8) String str) {
        this.f38725zza = num;
        this.f38726zzb = d;
        this.f38727zzc = uri2;
        this.f38728zzd = bArr;
        this.f38729zze = list;
        this.f38730zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri2 != null) {
            hashSet.add(uri2);
        }
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it8.next();
                Preconditions.checkArgument((registeredKey.getAppId() == null && uri2 == null) ? false : true, "registered key has null appId and no request appId is provided");
                registeredKey.getChallengeValue();
                Preconditions.checkArgument(true, "register request has null challenge and no default challenge isprovided");
                if (registeredKey.getAppId() != null) {
                    hashSet.add(Uri.parse(registeredKey.getAppId()));
                }
            }
        }
        this.f38732zzh = hashSet;
        Preconditions.checkArgument(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f38731zzg = str;
    }

    public boolean equals(@NonNull Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj2;
        return Objects.equal(this.f38725zza, signRequestParams.f38725zza) && Objects.equal(this.f38726zzb, signRequestParams.f38726zzb) && Objects.equal(this.f38727zzc, signRequestParams.f38727zzc) && Arrays.equals(this.f38728zzd, signRequestParams.f38728zzd) && this.f38729zze.containsAll(signRequestParams.f38729zze) && signRequestParams.f38729zze.containsAll(this.f38729zze) && Objects.equal(this.f38730zzf, signRequestParams.f38730zzf) && Objects.equal(this.f38731zzg, signRequestParams.f38731zzg);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Set<Uri> getAllAppIds() {
        return this.f38732zzh;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Uri getAppId() {
        return this.f38727zzc;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public ChannelIdValue getChannelIdValue() {
        return this.f38730zzf;
    }

    @NonNull
    public byte[] getDefaultSignChallenge() {
        return this.f38728zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public String getDisplayHint() {
        return this.f38731zzg;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public List<RegisteredKey> getRegisteredKeys() {
        return this.f38729zze;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Integer getRequestId() {
        return this.f38725zza;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public Double getTimeoutSeconds() {
        return this.f38726zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38725zza, this.f38727zzc, this.f38726zzb, this.f38729zze, this.f38730zzf, this.f38731zzg, Integer.valueOf(Arrays.hashCode(this.f38728zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getRequestId(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getAppId(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getDefaultSignChallenge(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getRegisteredKeys(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getChannelIdValue(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getDisplayHint(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
