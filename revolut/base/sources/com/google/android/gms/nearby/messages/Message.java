package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzni;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MessageCreator")
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int MAX_CONTENT_SIZE_BYTES = 102400;
    public static final int MAX_TYPE_LENGTH = 32;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f48010zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    @Deprecated
    final zzni[] f48011zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContent", id = 1)
    private final byte[] f48012zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final String f48013zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNamespace", id = 3)
    private final String f48014zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProjectId", id = 5)
    private final long f48015zzg;

    @NonNull
    public static final String MESSAGE_TYPE_I_BEACON_ID = "__i_beacon_id";

    @NonNull
    public static final String MESSAGE_NAMESPACE_RESERVED = "__reserved_namespace";

    @NonNull
    public static final String MESSAGE_TYPE_EDDYSTONE_UID = "__eddystone_uid";

    @NonNull
    @Deprecated
    public static final String MESSAGE_TYPE_AUDIO_BYTES = "__audio_bytes";

    @NonNull
    public static final Parcelable.Creator<Message> CREATOR = new zza();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzni[] f48009zzc = {zzni.f45511zza};

    @SafeParcelable.Constructor
    public Message(@SafeParcelable.Param(id = 1000) int i, @NonNull @SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 4) zzni[] zzniVarArr, @SafeParcelable.Param(id = 5) long j2) {
        this.f48010zza = i;
        this.f48013zze = (String) Preconditions.checkNotNull(str2);
        this.f48014zzf = str == null ? "" : str;
        this.f48015zzg = j2;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        Preconditions.checkArgument(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), Integer.valueOf(MAX_CONTENT_SIZE_BYTES));
        this.f48012zzd = bArr;
        this.f48011zzb = (zzniVarArr == null || zzniVarArr.length == 0) ? f48009zzc : zzniVarArr;
        Preconditions.checkArgument(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Message)) {
            return false;
        }
        Message message = (Message) obj2;
        return TextUtils.equals(this.f48014zzf, message.f48014zzf) && TextUtils.equals(this.f48013zze, message.f48013zze) && Arrays.equals(this.f48012zzd, message.f48012zzd) && this.f48015zzg == message.f48015zzg;
    }

    @NonNull
    public byte[] getContent() {
        return this.f48012zzd;
    }

    @NonNull
    public String getNamespace() {
        return this.f48014zzf;
    }

    @NonNull
    public String getType() {
        return this.f48013zze;
    }

    public int hashCode() {
        return Objects.hashCode(this.f48014zzf, this.f48013zze, Integer.valueOf(Arrays.hashCode(this.f48012zzd)), Long.valueOf(this.f48015zzg));
    }

    @NonNull
    public String toString() {
        byte[] bArr = this.f48012zzd;
        return a.v(v0.a.m("Message{namespace='", this.f48014zzf, "', type='", this.f48013zze, "', content=["), " bytes]}", bArr == null ? 0 : bArr.length);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getContent(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeString(parcel, 3, getNamespace(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f48011zzb, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f48015zzg);
        SafeParcelWriter.writeInt(parcel, 1000, this.f48010zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(@NonNull String str) {
        return "__reserved_namespace".equals(getNamespace()) && str.equals(getType());
    }

    public Message(@NonNull byte[] bArr) {
        this(bArr, "", "", f48009zzc, 0L);
    }

    public Message(@NonNull byte[] bArr, @NonNull String str) {
        this(bArr, "", str, f48009zzc, 0L);
    }

    public Message(@NonNull byte[] bArr, @NonNull String str, @NonNull String str2) {
        this(bArr, "__reserved_namespace", "__audio_bytes", f48009zzc, 0L);
    }

    public Message(byte[] bArr, String str, String str2, zzni[] zzniVarArr, long j2) {
        this(2, bArr, str, str2, zzniVarArr, 0L);
    }
}
