package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RegisterRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new zzh();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final Integer f38704zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final Double f38705zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final Uri f38706zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisterRequests", id = 5)
    private final List f38707zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisteredKeys", id = 6)
    private final List f38708zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChannelIdValue", id = 7)
    private final ChannelIdValue f38709zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDisplayHint", id = 8)
    private final String f38710zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private Set f38711zzh;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        Integer f38712zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        Double f38713zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        Uri f38714zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        List f38715zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        List f38716zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        ChannelIdValue f38717zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        String f38718zzg;

        @NonNull
        public RegisterRequestParams build() {
            return new RegisterRequestParams(this.f38712zza, this.f38713zzb, this.f38714zzc, this.f38715zzd, this.f38716zze, this.f38717zzf, this.f38718zzg);
        }

        @NonNull
        public Builder setAppId(@NonNull Uri uri2) {
            this.f38714zzc = uri2;
            return this;
        }

        @NonNull
        public Builder setChannelIdValue(@NonNull ChannelIdValue channelIdValue) {
            this.f38717zzf = channelIdValue;
            return this;
        }

        @NonNull
        public Builder setDisplayHint(@NonNull String str) {
            this.f38718zzg = str;
            return this;
        }

        @NonNull
        public Builder setRegisterRequests(@NonNull List<RegisterRequest> list) {
            this.f38715zzd = list;
            return this;
        }

        @NonNull
        public Builder setRegisteredKeys(@NonNull List<RegisteredKey> list) {
            this.f38716zze = list;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull Integer num) {
            this.f38712zza = num;
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(@NonNull Double d) {
            this.f38713zzb = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public RegisterRequestParams(@SafeParcelable.Param(id = 2) Integer num, @SafeParcelable.Param(id = 3) Double d, @SafeParcelable.Param(id = 4) Uri uri2, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) List list2, @SafeParcelable.Param(id = 7) ChannelIdValue channelIdValue, @SafeParcelable.Param(id = 8) String str) {
        this.f38704zza = num;
        this.f38705zzb = d;
        this.f38706zzc = uri2;
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f38707zzd = list;
        this.f38708zze = list2;
        this.f38709zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri2 != null) {
            hashSet.add(uri2);
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it8.next();
            Preconditions.checkArgument((uri2 == null && registerRequest.getAppId() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (registerRequest.getAppId() != null) {
                hashSet.add(Uri.parse(registerRequest.getAppId()));
            }
        }
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it9.next();
            Preconditions.checkArgument((uri2 == null && registeredKey.getAppId() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (registeredKey.getAppId() != null) {
                hashSet.add(Uri.parse(registeredKey.getAppId()));
            }
        }
        this.f38711zzh = hashSet;
        Preconditions.checkArgument(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f38710zzg = str;
    }

    public boolean equals(@NonNull Object obj2) {
        List list;
        List list2;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj2;
        return Objects.equal(this.f38704zza, registerRequestParams.f38704zza) && Objects.equal(this.f38705zzb, registerRequestParams.f38705zzb) && Objects.equal(this.f38706zzc, registerRequestParams.f38706zzc) && Objects.equal(this.f38707zzd, registerRequestParams.f38707zzd) && (((list = this.f38708zze) == null && registerRequestParams.f38708zze == null) || (list != null && (list2 = registerRequestParams.f38708zze) != null && list.containsAll(list2) && registerRequestParams.f38708zze.containsAll(this.f38708zze))) && Objects.equal(this.f38709zzf, registerRequestParams.f38709zzf) && Objects.equal(this.f38710zzg, registerRequestParams.f38710zzg);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Set<Uri> getAllAppIds() {
        return this.f38711zzh;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Uri getAppId() {
        return this.f38706zzc;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public ChannelIdValue getChannelIdValue() {
        return this.f38709zzf;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public String getDisplayHint() {
        return this.f38710zzg;
    }

    @NonNull
    public List<RegisterRequest> getRegisterRequests() {
        return this.f38707zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public List<RegisteredKey> getRegisteredKeys() {
        return this.f38708zze;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Integer getRequestId() {
        return this.f38704zza;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Double getTimeoutSeconds() {
        return this.f38705zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38704zza, this.f38706zzc, this.f38705zzb, this.f38707zzd, this.f38708zze, this.f38709zzf, this.f38710zzg);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getRequestId(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getAppId(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, getRegisterRequests(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getRegisteredKeys(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getChannelIdValue(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getDisplayHint(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
