package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ButtonOptionsCreator")
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonType", id = 1)
    int f48951zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonTheme", id = 2)
    int f48952zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getCornerRadius", id = 3)
    int f48953zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowedPaymentMethods", id = 4)
    String f48954zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    boolean f48955zze = false;

    public final class Builder {
        public /* synthetic */ Builder(zza zzaVar) {
        }

        @NonNull
        public ButtonOptions build() {
            return ButtonOptions.this;
        }

        @NonNull
        public Builder setAllowedPaymentMethods(@NonNull String str) {
            ButtonOptions.this.f48954zzd = str;
            return this;
        }

        @NonNull
        public Builder setButtonTheme(int i) {
            ButtonOptions.this.f48952zzb = i;
            return this;
        }

        @NonNull
        public Builder setButtonType(int i) {
            ButtonOptions.this.f48951zza = i;
            return this;
        }

        @NonNull
        public Builder setCornerRadius(int i) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f48953zzc = i;
            buttonOptions.f48955zze = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new ButtonOptions().new Builder(null);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj2;
            if (Objects.equal(Integer.valueOf(this.f48951zza), Integer.valueOf(buttonOptions.f48951zza)) && Objects.equal(Integer.valueOf(this.f48952zzb), Integer.valueOf(buttonOptions.f48952zzb)) && Objects.equal(Integer.valueOf(this.f48953zzc), Integer.valueOf(buttonOptions.f48953zzc)) && Objects.equal(this.f48954zzd, buttonOptions.f48954zzd)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAllowedPaymentMethods() {
        return this.f48954zzd;
    }

    public int getButtonTheme() {
        return this.f48952zzb;
    }

    public int getButtonType() {
        return this.f48951zza;
    }

    public int getCornerRadius() {
        return this.f48953zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48951zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getButtonType());
        SafeParcelWriter.writeInt(parcel, 2, getButtonTheme());
        SafeParcelWriter.writeInt(parcel, 3, getCornerRadius());
        SafeParcelWriter.writeString(parcel, 4, getAllowedPaymentMethods(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ButtonOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str) {
        this.f48951zza = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.f48952zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i2))).intValue();
        this.f48953zzc = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i3))).intValue();
        this.f48954zzd = (String) Preconditions.checkNotNull(str);
    }
}
