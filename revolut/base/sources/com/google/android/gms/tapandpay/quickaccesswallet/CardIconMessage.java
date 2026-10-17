package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CardIconMessageCreator")
public final class CardIconMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardIconMessage> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConditions", id = 1)
    private int[] f48701zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIcon", id = 2)
    private int f48702zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessage", id = 3)
    private String f48703zzc;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final CardIconMessage f48704zza;

        public Builder() {
            this.f48704zza = new CardIconMessage(null);
        }

        @NonNull
        public CardIconMessage build() {
            return this.f48704zza;
        }

        @NonNull
        public Builder setConditions(@NonNull int[] iArr) {
            this.f48704zza.f48701zza = iArr;
            return this;
        }

        @NonNull
        public Builder setIcon(int i) {
            this.f48704zza.f48702zzb = i;
            return this;
        }

        @NonNull
        public Builder setMessage(@NonNull String str) {
            this.f48704zza.f48703zzc = str;
            return this;
        }

        public Builder(@NonNull CardIconMessage cardIconMessage) {
            CardIconMessage cardIconMessage2 = new CardIconMessage(null);
            this.f48704zza = cardIconMessage2;
            cardIconMessage2.f48701zza = cardIconMessage.f48701zza;
            cardIconMessage2.f48702zzb = cardIconMessage.f48702zzb;
            cardIconMessage2.f48703zzc = cardIconMessage.f48703zzc;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Condition {
        public static final int NFC_OFF = 3;
        public static final int NFC_ON = 2;
        public static final int PHONE_LOCKED = 4;
        public static final int TRUE = 1;
        public static final int UNKNOWN_CONDITION = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Icon {
        public static final int LOCK = 4;
        public static final int NFC = 2;
        public static final int NFC_DISABLED = 3;
        public static final int NONE = 1;
        public static final int UNKNOWN_ICON = 0;
    }

    private CardIconMessage() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof CardIconMessage) {
            CardIconMessage cardIconMessage = (CardIconMessage) obj2;
            if (Arrays.equals(this.f48701zza, cardIconMessage.f48701zza) && Objects.equal(Integer.valueOf(this.f48702zzb), Integer.valueOf(cardIconMessage.f48702zzb)) && Objects.equal(this.f48703zzc, cardIconMessage.f48703zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public int[] getConditions() {
        return this.f48701zza;
    }

    public int getIcon() {
        return this.f48702zzb;
    }

    @NonNull
    public String getMessage() {
        return this.f48703zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f48701zza)), Integer.valueOf(this.f48702zzb), this.f48703zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 1, getConditions(), false);
        SafeParcelWriter.writeInt(parcel, 2, getIcon());
        SafeParcelWriter.writeString(parcel, 3, getMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ CardIconMessage(zza zzaVar) {
    }

    @SafeParcelable.Constructor
    public CardIconMessage(@SafeParcelable.Param(id = 1) int[] iArr, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.f48701zza = iArr;
        this.f48702zzb = i;
        this.f48703zzc = str;
    }
}
