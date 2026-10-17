package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new zbr();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent f37437zba;

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.f37437zba = pendingIntent;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof SaveAccountLinkingTokenResult) {
            return Objects.equal(this.f37437zba, ((SaveAccountLinkingTokenResult) obj2).f37437zba);
        }
        return false;
    }

    public PendingIntent getPendingIntent() {
        return this.f37437zba;
    }

    public boolean hasResolution() {
        return this.f37437zba != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37437zba);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
