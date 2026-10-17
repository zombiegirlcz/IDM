package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 1)
    final Intent f37570zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Map f37571zzb;

    /* JADX INFO: loaded from: classes16.dex */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public CloudMessage(@NonNull @SafeParcelable.Param(id = 1) Intent intent) {
        this.f37570zza = intent;
    }

    private static int zzb(String str) {
        if (Objects.equals(str, "high")) {
            return 1;
        }
        return Objects.equals(str, "normal") ? 2 : 0;
    }

    public String getCollapseKey() {
        return this.f37570zza.getStringExtra("collapse_key");
    }

    @NonNull
    public synchronized Map<String, String> getData() {
        try {
            if (this.f37571zzb == null) {
                Bundle extras = this.f37570zza.getExtras();
                ArrayMap arrayMap = new ArrayMap();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj2 = extras.get(str);
                        if (obj2 instanceof String) {
                            String str2 = (String) obj2;
                            if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                                arrayMap.put(str, str2);
                            }
                        }
                    }
                }
                this.f37571zzb = arrayMap;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f37571zzb;
    }

    public String getFrom() {
        return this.f37570zza.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.f37570zza;
    }

    public String getMessageId() {
        String stringExtra = this.f37570zza.getStringExtra("google.message_id");
        return stringExtra == null ? this.f37570zza.getStringExtra("message_id") : stringExtra;
    }

    public String getMessageType() {
        return this.f37570zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String stringExtra = this.f37570zza.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.f37570zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.f37570zza.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if (Objects.equals(this.f37570zza.getStringExtra("google.priority_reduced"), "1")) {
                return 2;
            }
            stringExtra = this.f37570zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    public byte[] getRawData() {
        return this.f37570zza.getByteArrayExtra("rawData");
    }

    public String getSenderId() {
        return this.f37570zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle extras = this.f37570zza.getExtras();
        Object obj2 = extras != null ? extras.get("google.sent_time") : null;
        if (obj2 instanceof Long) {
            return ((Long) obj2).longValue();
        }
        if (!(obj2 instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj2);
        } catch (NumberFormatException unused) {
            "Invalid sent time: ".concat(String.valueOf(obj2));
            return 0L;
        }
    }

    public String getTo() {
        return this.f37570zza.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle extras = this.f37570zza.getExtras();
        Object obj2 = extras != null ? extras.get("google.ttl") : null;
        if (obj2 instanceof Integer) {
            return ((Integer) obj2).intValue();
        }
        if (!(obj2 instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj2);
        } catch (NumberFormatException unused) {
            "Invalid TTL: ".concat(String.valueOf(obj2));
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f37570zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Integer zza() {
        if (this.f37570zza.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f37570zza.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
