package com.google.android.gms.tapandpay.quickaccesswallet;

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
@SafeParcelable.Class(creator = "QuickAccessWalletConfigCreator")
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardWidthPx", id = 1)
    private int f48717zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardHeightPx", id = 2)
    private int f48718zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMaxCards", id = 3)
    private int f48719zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCurrentWalletCardIds", id = 5)
    private String[] f48720zzd;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final QuickAccessWalletConfig f48721zza;

        public Builder() {
            this.f48721zza = new QuickAccessWalletConfig(null);
        }

        @NonNull
        public QuickAccessWalletConfig build() {
            return this.f48721zza;
        }

        @NonNull
        public Builder setCardHeightPx(int i) {
            this.f48721zza.f48718zzb = i;
            return this;
        }

        @NonNull
        public Builder setCardWidthPx(int i) {
            this.f48721zza.f48717zza = i;
            return this;
        }

        @NonNull
        public Builder setCurrentWalletCardIds(@NonNull String[] strArr) {
            this.f48721zza.f48720zzd = strArr;
            return this;
        }

        @NonNull
        public Builder setMaxCards(int i) {
            this.f48721zza.f48719zzc = i;
            return this;
        }

        public Builder(@NonNull QuickAccessWalletConfig quickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig2 = new QuickAccessWalletConfig(null);
            this.f48721zza = quickAccessWalletConfig2;
            quickAccessWalletConfig2.f48717zza = quickAccessWalletConfig.f48717zza;
            quickAccessWalletConfig2.f48718zzb = quickAccessWalletConfig.f48718zzb;
            quickAccessWalletConfig2.f48719zzc = quickAccessWalletConfig.f48719zzc;
            quickAccessWalletConfig2.f48720zzd = quickAccessWalletConfig.f48720zzd;
        }
    }

    private QuickAccessWalletConfig() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj2;
            if (Objects.equal(Integer.valueOf(this.f48717zza), Integer.valueOf(quickAccessWalletConfig.f48717zza)) && Objects.equal(Integer.valueOf(this.f48718zzb), Integer.valueOf(quickAccessWalletConfig.f48718zzb)) && Objects.equal(Integer.valueOf(this.f48719zzc), Integer.valueOf(quickAccessWalletConfig.f48719zzc)) && Arrays.equals(this.f48720zzd, quickAccessWalletConfig.f48720zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.f48718zzb;
    }

    public int getCardWidthPx() {
        return this.f48717zza;
    }

    @NonNull
    public String[] getCurrentWalletCardIds() {
        return this.f48720zzd;
    }

    public int getMaxCards() {
        return this.f48719zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48717zza), Integer.valueOf(this.f48718zzb), Integer.valueOf(this.f48719zzc), Integer.valueOf(Arrays.hashCode(this.f48720zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public QuickAccessWalletConfig(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 5) String[] strArr) {
        this.f48717zza = i;
        this.f48718zzb = i2;
        this.f48719zzc = i3;
        this.f48720zzd = strArr;
    }

    public /* synthetic */ QuickAccessWalletConfig(zzg zzgVar) {
    }
}
