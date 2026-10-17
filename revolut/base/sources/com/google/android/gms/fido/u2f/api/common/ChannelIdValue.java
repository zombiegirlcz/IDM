package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType f38674zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final String f38675zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final String f38676zzc;

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();

    @NonNull
    public static final ChannelIdValue ABSENT = new ChannelIdValue();

    @NonNull
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");

    @NonNull
    public static final ChannelIdValue UNUSED = new ChannelIdValue("unused");

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final int f38678zzb;

        ChannelIdValueType(int i) {
            this.f38678zzb = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f38678zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i) {
            super(a.l(i, "ChannelIdValueType ", " not supported"));
        }
    }

    private ChannelIdValue() {
        this.f38674zza = ChannelIdValueType.ABSENT;
        this.f38676zzc = null;
        this.f38675zzb = null;
    }

    @NonNull
    public static ChannelIdValueType toChannelIdValueType(int i) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.f38678zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(i);
    }

    public boolean equals(@NonNull Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj2;
        if (!this.f38674zza.equals(channelIdValue.f38674zza)) {
            return false;
        }
        int iOrdinal = this.f38674zza.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f38675zzb.equals(channelIdValue.f38675zzb);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f38676zzc.equals(channelIdValue.f38676zzc);
    }

    @NonNull
    public JSONObject getObjectValue() {
        if (this.f38676zzc == null) {
            return null;
        }
        try {
            return new JSONObject(this.f38676zzc);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String getObjectValueAsString() {
        return this.f38676zzc;
    }

    @NonNull
    public String getStringValue() {
        return this.f38675zzb;
    }

    @NonNull
    public ChannelIdValueType getType() {
        return this.f38674zza;
    }

    public int getTypeAsInt() {
        return this.f38674zza.f38678zzb;
    }

    public int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2 = this.f38674zza.hashCode() + 31;
        int iOrdinal = this.f38674zza.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.f38675zzb.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.f38676zzc.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getTypeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getStringValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getObjectValueAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ChannelIdValue(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        try {
            this.f38674zza = toChannelIdValueType(i);
            this.f38675zzb = str;
            this.f38676zzc = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.f38675zzb = (String) Preconditions.checkNotNull(str);
        this.f38674zza = ChannelIdValueType.STRING;
        this.f38676zzc = null;
    }

    public ChannelIdValue(@NonNull JSONObject jSONObject) {
        this.f38676zzc = (String) Preconditions.checkNotNull(jSONObject.toString());
        this.f38674zza = ChannelIdValueType.OBJECT;
        this.f38675zzb = null;
    }
}
