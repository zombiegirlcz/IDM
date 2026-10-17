package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
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

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GlobalActionCardCreator")
public final class GlobalActionCard extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardType", id = 1)
    private int f48586zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardId", id = 2)
    private String f48587zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardImage", id = 3)
    private Bitmap f48588zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContentDescription", id = 4)
    private String f48589zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageText", id = 5)
    private String f48590zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceLockedMessageText", id = 8)
    private String f48591zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageIcon", id = 6)
    private Bitmap f48592zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent f48593zzh;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final GlobalActionCard f48594zza;

        public Builder() {
            this.f48594zza = new GlobalActionCard(null);
        }

        @NonNull
        public GlobalActionCard build() {
            return this.f48594zza;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.f48594zza.f48587zzb = str;
            return this;
        }

        @NonNull
        public Builder setCardImage(@NonNull Bitmap bitmap) {
            this.f48594zza.f48588zzc = bitmap;
            return this;
        }

        @NonNull
        public Builder setCardType(int i) {
            this.f48594zza.f48586zza = i;
            return this;
        }

        @NonNull
        public Builder setContentDescription(@NonNull String str) {
            this.f48594zza.f48589zzd = str;
            return this;
        }

        @NonNull
        public Builder setDeviceLockedMessageText(String str) {
            this.f48594zza.f48591zzf = str;
            return this;
        }

        @NonNull
        public Builder setMessageIcon(Bitmap bitmap) {
            this.f48594zza.f48592zzg = bitmap;
            return this;
        }

        @NonNull
        public Builder setMessageText(String str) {
            this.f48594zza.f48590zze = str;
            return this;
        }

        @NonNull
        public Builder setPendingIntent(@NonNull PendingIntent pendingIntent) {
            this.f48594zza.f48593zzh = pendingIntent;
            return this;
        }

        public Builder(@NonNull GlobalActionCard globalActionCard) {
            GlobalActionCard globalActionCard2 = new GlobalActionCard(null);
            this.f48594zza = globalActionCard2;
            globalActionCard2.f48586zza = globalActionCard.f48586zza;
            globalActionCard2.f48587zzb = globalActionCard.f48587zzb;
            globalActionCard2.f48588zzc = globalActionCard.f48588zzc;
            globalActionCard2.f48589zzd = globalActionCard.f48589zzd;
            globalActionCard2.f48590zze = globalActionCard.f48590zze;
            globalActionCard2.f48591zzf = globalActionCard.f48591zzf;
            globalActionCard2.f48592zzg = globalActionCard.f48592zzg;
            globalActionCard2.f48593zzh = globalActionCard.f48593zzh;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
        public static final int CAR_KEY = 8;
        public static final int CTA = 3;
        public static final int GLOBAL_ACTIONS_DISMISSED = 4;
        public static final int PASS = 1;
        public static final int PAYMENT = 2;
        public static final int STUDENT_ID = 6;
        public static final int TILE = 9;
        public static final int TRANSIT = 7;
        public static final int UNKNOWN = 0;
        public static final int VALUABLE = 5;
    }

    private GlobalActionCard() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj2;
            if (Objects.equal(Integer.valueOf(this.f48586zza), Integer.valueOf(globalActionCard.f48586zza)) && Objects.equal(this.f48587zzb, globalActionCard.f48587zzb) && Objects.equal(this.f48588zzc, globalActionCard.f48588zzc) && Objects.equal(this.f48589zzd, globalActionCard.f48589zzd) && Objects.equal(this.f48590zze, globalActionCard.f48590zze) && Objects.equal(this.f48591zzf, globalActionCard.f48591zzf) && Objects.equal(this.f48592zzg, globalActionCard.f48592zzg) && Objects.equal(this.f48593zzh, globalActionCard.f48593zzh)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getCardId() {
        return this.f48587zzb;
    }

    @NonNull
    public Bitmap getCardImage() {
        return this.f48588zzc;
    }

    public int getCardType() {
        return this.f48586zza;
    }

    @NonNull
    public String getContentDescription() {
        return this.f48589zzd;
    }

    public String getDeviceLockedMessageText() {
        return this.f48591zzf;
    }

    public Bitmap getMessageIcon() {
        return this.f48592zzg;
    }

    public String getMessageText() {
        return this.f48590zze;
    }

    @NonNull
    public PendingIntent getPendingIntent() {
        return this.f48593zzh;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48586zza), this.f48587zzb, this.f48588zzc, this.f48589zzd, this.f48590zze, this.f48591zzf, this.f48592zzg, this.f48593zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardType());
        SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i, false);
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GlobalActionCard(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Bitmap bitmap, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 6) Bitmap bitmap2, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent) {
        this.f48586zza = i;
        this.f48587zzb = str;
        this.f48588zzc = bitmap;
        this.f48589zzd = str2;
        this.f48590zze = str3;
        this.f48591zzf = str4;
        this.f48592zzg = bitmap2;
        this.f48593zzh = pendingIntent;
    }

    public /* synthetic */ GlobalActionCard(zze zzeVar) {
    }
}
