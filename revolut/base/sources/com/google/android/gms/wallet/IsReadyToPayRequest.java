package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
public final class IsReadyToPayRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    ArrayList f48864zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f48865zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48866zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    ArrayList f48867zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    boolean f48868zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String f48869zzf;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzp zzpVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48864zza == null) {
                isReadyToPayRequest.f48864zza = new ArrayList();
            }
            IsReadyToPayRequest.this.f48864zza.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48864zza == null) {
                isReadyToPayRequest.f48864zza = new ArrayList();
            }
            IsReadyToPayRequest.this.f48864zza.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48867zzd == null) {
                isReadyToPayRequest.f48867zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.f48867zzd.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48867zzd == null) {
                isReadyToPayRequest.f48867zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.f48867zzd.addAll(collection);
            return this;
        }

        @NonNull
        public IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        @NonNull
        public Builder setExistingPaymentMethodRequired(boolean z) {
            IsReadyToPayRequest.this.f48868zze = z;
            return this;
        }
    }

    public IsReadyToPayRequest() {
    }

    @NonNull
    public static IsReadyToPayRequest fromJson(@NonNull String str) {
        Builder builderNewBuilder = newBuilder();
        IsReadyToPayRequest.this.f48869zzf = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new IsReadyToPayRequest().new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.f48864zza;
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.f48867zzd;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.f48868zze;
    }

    @NonNull
    public String toJson() {
        return this.f48869zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.f48864zza, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48865zzb, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48866zzc, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f48867zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f48868zze);
        SafeParcelWriter.writeString(parcel, 8, this.f48869zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public IsReadyToPayRequest(@SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) ArrayList arrayList2, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) String str3) {
        this.f48864zza = arrayList;
        this.f48865zzb = str;
        this.f48866zzc = str2;
        this.f48867zzd = arrayList2;
        this.f48868zze = z;
        this.f48869zzf = str3;
    }
}
