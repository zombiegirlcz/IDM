package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int f46680zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float f46681zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String f46679zza = "PatternItem";

    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzm();

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < BitmapDescriptorFactory.HUE_RED)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.f46680zzb = i;
        this.f46681zzc = f;
    }

    public static List zza(List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            PatternItem dot = (PatternItem) it8.next();
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.f46680zzb;
                if (i == 0) {
                    Preconditions.checkState(dot.f46681zzc != null, "length must not be null.");
                    dash = new Dash(dot.f46681zzc.floatValue());
                } else if (i == 1) {
                    dot = new Dot();
                } else if (i != 2) {
                    String str = f46679zza;
                    String str2 = "Unknown PatternItem type: " + i;
                } else {
                    Preconditions.checkState(dot.f46681zzc != null, "length must not be null.");
                    dash = new Gap(dot.f46681zzc.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj2;
        return this.f46680zzb == patternItem.f46680zzb && Objects.equal(this.f46681zzc, patternItem.f46681zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46680zzb), this.f46681zzc);
    }

    @NonNull
    public String toString() {
        return "[PatternItem: type=" + this.f46680zzb + " length=" + this.f46681zzc + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f46680zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.f46681zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
