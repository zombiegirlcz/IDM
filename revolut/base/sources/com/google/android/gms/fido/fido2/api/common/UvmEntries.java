package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UvmEntriesCreator")
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new zzbd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUvmEntryList", id = 1)
    private final List f38609zza;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final List f38610zza = new ArrayList();

        @NonNull
        public Builder addAll(@NonNull List<UvmEntry> list) {
            zzbm.zzc(list.size() + this.f38610zza.size() <= 3);
            this.f38610zza.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUvmEntry(UvmEntry uvmEntry) {
            if (this.f38610zza.size() >= 3) {
                throw new IllegalStateException();
            }
            if (uvmEntry != null) {
                this.f38610zza.add(uvmEntry);
            }
            return this;
        }

        @NonNull
        public UvmEntries build() {
            return new UvmEntries(this.f38610zza);
        }
    }

    @SafeParcelable.Constructor
    public UvmEntries(@SafeParcelable.Param(id = 1) List list) {
        this.f38609zza = list;
    }

    public boolean equals(Object obj2) {
        List list;
        if (!(obj2 instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj2;
        List list2 = this.f38609zza;
        if (list2 == null && uvmEntries.f38609zza == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.f38609zza) != null && list2.containsAll(list) && uvmEntries.f38609zza.containsAll(this.f38609zza);
    }

    public List<UvmEntry> getUvmEntryList() {
        return this.f38609zza;
    }

    public int hashCode() {
        List list = this.f38609zza;
        return Objects.hashCode(list == null ? null : new HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getUvmEntryList(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONArray zza() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f38609zza != null) {
                for (int i = 0; i < this.f38609zza.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) this.f38609zza.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray2.put((int) uvmEntry.getKeyProtectionType());
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }
}
