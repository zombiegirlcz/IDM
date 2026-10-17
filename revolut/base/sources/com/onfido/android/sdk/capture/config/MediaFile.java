package com.onfido.android.sdk.capture.config;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/config/MediaFile;", "", "fileData", "", "fileType", "", "fileName", "([BLjava/lang/String;Ljava/lang/String;)V", "getFileData", "()[B", "getFileName", "()Ljava/lang/String;", "getFileType", "equals", "", "other", "hashCode", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaFile {

    @NotNull
    private final byte[] fileData;

    @NotNull
    private final String fileName;

    @NotNull
    private final String fileType;

    public MediaFile(@NotNull byte[] fileData, @NotNull String fileType, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileData = fileData;
        this.fileType = fileType;
        this.fileName = fileName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MediaFile.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.config.MediaFile");
        MediaFile mediaFile = (MediaFile) other;
        return Arrays.equals(this.fileData, mediaFile.fileData) && Intrinsics.f(this.fileType, mediaFile.fileType) && Intrinsics.f(this.fileName, mediaFile.fileName);
    }

    @NotNull
    public final byte[] getFileData() {
        return this.fileData;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    public int hashCode() {
        return this.fileName.hashCode() + a.c(Arrays.hashCode(this.fileData) * 31, 31, this.fileType);
    }
}
