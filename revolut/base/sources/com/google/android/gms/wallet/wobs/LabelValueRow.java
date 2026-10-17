package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
public final class LabelValueRow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    @Deprecated
    String f48978zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    @Deprecated
    String f48979zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 4)
    final ArrayList f48980zzc;

    public final class Builder {
        public /* synthetic */ Builder(zze zzeVar) {
        }

        @NonNull
        public Builder addColumn(@NonNull LabelValue labelValue) {
            LabelValueRow.this.f48980zzc.add(labelValue);
            return this;
        }

        @NonNull
        public Builder addColumns(@NonNull Collection<LabelValue> collection) {
            LabelValueRow.this.f48980zzc.addAll(collection);
            return this;
        }

        @NonNull
        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @NonNull
        @Deprecated
        public Builder setHexBackgroundColor(@NonNull String str) {
            LabelValueRow.this.f48979zzb = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setHexFontColor(@NonNull String str) {
            LabelValueRow.this.f48978zza = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.f48980zzc = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new LabelValueRow().new Builder(null);
    }

    @NonNull
    public ArrayList<LabelValue> getColumns() {
        return this.f48980zzc;
    }

    @NonNull
    @Deprecated
    public String getHexBackgroundColor() {
        return this.f48979zzb;
    }

    @NonNull
    @Deprecated
    public String getHexFontColor() {
        return this.f48978zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48978zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48979zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f48980zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) ArrayList arrayList) {
        this.f48978zza = str;
        this.f48979zzb = str2;
        this.f48980zzc = arrayList;
    }
}
