package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.icao.DG14File;
import org.jmrtd.lds.icao.DG15File;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDHelper;", "", "createDG14File", "Lorg/jmrtd/lds/icao/DG14File;", "bytes", "", "createDG15File", "Lorg/jmrtd/lds/icao/DG15File;", "createPassportService", "Lorg/jmrtd/PassportService;", "tag", "Landroid/nfc/Tag;", "readBytes", "passportService", "fid", "", "readCardAccessFile", "Lorg/jmrtd/lds/CardAccessFile;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface JMRTDHelper {
    @NotNull
    DG14File createDG14File(@NotNull byte[] bytes);

    @NotNull
    DG15File createDG15File(@NotNull byte[] bytes);

    @NotNull
    PassportService createPassportService(@NotNull Tag tag2);

    @NotNull
    byte[] readBytes(@NotNull PassportService passportService, short fid2);

    @NotNull
    CardAccessFile readCardAccessFile(@NotNull PassportService passportService);
}
