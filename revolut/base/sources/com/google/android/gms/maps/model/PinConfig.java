package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PinConfigCreator")
@SafeParcelable.Reserved({1})
public class PinConfig extends AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;

    @NonNull
    public static final Parcelable.Creator<PinConfig> CREATOR = new zzo();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 2)
    private final int f46682zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBorderColor", id = 3)
    private final int f46683zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGlyph", id = 4)
    private final Glyph f46684zzc;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f46685zza = PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f46686zzb = PinConfig.DEFAULT_PIN_BORDER_COLOR;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private Glyph f46687zzc = new Glyph(PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        @NonNull
        public PinConfig build() {
            return new PinConfig(this.f46685zza, this.f46686zzb, this.f46687zzc);
        }

        @NonNull
        public Builder setBackgroundColor(int i) {
            this.f46685zza = i;
            return this;
        }

        @NonNull
        public Builder setBorderColor(int i) {
            this.f46686zzb = i;
            return this;
        }

        @NonNull
        public Builder setGlyph(@NonNull Glyph glyph) {
            this.f46687zzc = glyph;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GlyphCreator")
    @SafeParcelable.Reserved({1})
    public static class Glyph extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Glyph> CREATOR = new zzf();
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getText", id = 2)
        private String f46688zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorBinder", id = 3, type = "android.os.IBinder")
        private BitmapDescriptor f46689zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getGlyphColor", id = 4)
        private int f46690zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTextColor", id = 5)
        private int f46691zzd;

        public Glyph(int i) {
            this.f46691zzd = -16777216;
            this.f46690zzc = i;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj2;
            if (this.f46690zzc != glyph.f46690zzc || !zzn.zza(this.f46688zza, glyph.f46688zza) || this.f46691zzd != glyph.f46691zzd) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor = this.f46689zzb;
            if ((bitmapDescriptor == null && glyph.f46689zzb != null) || (bitmapDescriptor != null && glyph.f46689zzb == null)) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor2 = glyph.f46689zzb;
            if (bitmapDescriptor == null || bitmapDescriptor2 == null) {
                return true;
            }
            return zzn.zza(ObjectWrapper.unwrap(bitmapDescriptor.zza()), ObjectWrapper.unwrap(bitmapDescriptor2.zza()));
        }

        public BitmapDescriptor getBitmapDescriptor() {
            return this.f46689zzb;
        }

        public int getGlyphColor() {
            return this.f46690zzc;
        }

        public String getText() {
            return this.f46688zza;
        }

        public int getTextColor() {
            return this.f46691zzd;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f46688zza, this.f46689zzb, Integer.valueOf(this.f46690zzc)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, getText(), false);
            BitmapDescriptor bitmapDescriptor = this.f46689zzb;
            SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
            SafeParcelWriter.writeInt(parcel, 4, getGlyphColor());
            SafeParcelWriter.writeInt(parcel, 5, getTextColor());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public Glyph(BitmapDescriptor bitmapDescriptor) {
            this.f46690zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f46691zzd = -16777216;
            this.f46689zzb = bitmapDescriptor;
        }

        public Glyph(@NonNull String str) {
            this(str, -16777216);
        }

        public Glyph(@NonNull String str, int i) {
            this.f46690zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f46688zza = str;
            this.f46691zzd = i;
        }

        @SafeParcelable.Constructor
        public Glyph(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) int i2) {
            this.f46690zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f46691zzd = -16777216;
            this.f46688zza = str;
            this.f46689zzb = iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
            this.f46690zzc = i;
            this.f46691zzd = i2;
        }
    }

    @SafeParcelable.Constructor
    public PinConfig(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) Glyph glyph) {
        this.f46682zza = i;
        this.f46683zzb = i2;
        this.f46684zzc = glyph;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public int getBackgroundColor() {
        return this.f46682zza;
    }

    public int getBorderColor() {
        return this.f46683zzb;
    }

    @NonNull
    public Glyph getGlyph() {
        return this.f46684zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 3, getBorderColor());
        SafeParcelWriter.writeParcelable(parcel, 4, getGlyph(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
