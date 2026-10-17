package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @InstallState
    @SafeParcelable.Field(getter = "getInstallState", id = 2)
    private final int f38196zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBytesDownloaded", id = 3)
    private final Long f38197zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTotalBytesToDownload", id = 4)
    private final Long f38198zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorCode", id = 5)
    private final int f38199zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final ProgressInfo f38200zaf;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    public static class ProgressInfo {
        private final long zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private final long f38201zab;

        public ProgressInfo(long j2, long j3) {
            Preconditions.checkNotZero(j3);
            this.zaa = j2;
            this.f38201zab = j3;
        }

        public long getBytesDownloaded() {
            return this.zaa;
        }

        public long getTotalBytesToDownload() {
            return this.f38201zab;
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @InstallState int i2, @SafeParcelable.Param(id = 3) Long l2, @SafeParcelable.Param(id = 4) Long l3, @SafeParcelable.Param(id = 5) int i3) {
        this.zaa = i;
        this.f38196zab = i2;
        this.f38197zac = l2;
        this.f38198zad = l3;
        this.f38199zae = i3;
        this.f38200zaf = (l2 == null || l3 == null || l3.longValue() == 0) ? null : new ProgressInfo(l2.longValue(), l3.longValue());
    }

    public int getErrorCode() {
        return this.f38199zae;
    }

    @InstallState
    public int getInstallState() {
        return this.f38196zab;
    }

    public ProgressInfo getProgressInfo() {
        return this.f38200zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        SafeParcelWriter.writeLongObject(parcel, 3, this.f38197zac, false);
        SafeParcelWriter.writeLongObject(parcel, 4, this.f38198zad, false);
        SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
