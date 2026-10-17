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
@SafeParcelable.Class(creator = "CardRequirementsCreator")
public final class CardRequirements extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    ArrayList f48828zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", id = 2)
    boolean f48829zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    boolean f48830zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    int f48831zzd;

    public final class Builder {
        public /* synthetic */ Builder(zzf zzfVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.f48828zza == null) {
                cardRequirements.f48828zza = new ArrayList();
            }
            CardRequirements.this.f48828zza.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.f48828zza == null) {
                cardRequirements.f48828zza = new ArrayList();
            }
            CardRequirements.this.f48828zza.addAll(collection);
            return this;
        }

        @NonNull
        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.f48828zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        @NonNull
        public Builder setAllowPrepaidCards(boolean z) {
            CardRequirements.this.f48829zzb = z;
            return this;
        }

        @NonNull
        public Builder setBillingAddressFormat(int i) {
            CardRequirements.this.f48831zzd = i;
            return this;
        }

        @NonNull
        public Builder setBillingAddressRequired(boolean z) {
            CardRequirements.this.f48830zzc = z;
            return this;
        }
    }

    private CardRequirements() {
        this.f48829zzb = true;
    }

    @NonNull
    public static Builder newBuilder() {
        return new CardRequirements().new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.f48829zzb;
    }

    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.f48828zza;
    }

    public int getBillingAddressFormat() {
        return this.f48831zzd;
    }

    public boolean isBillingAddressRequired() {
        return this.f48830zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.f48828zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48829zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48830zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f48831zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(id = 1) ArrayList arrayList, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i) {
        this.f48828zza = arrayList;
        this.f48829zzb = z;
        this.f48830zzc = z3;
        this.f48831zzd = i;
    }
}
