package com.fourthline.kyc.internal;

import android.media.MediaMetadataRetriever;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j implements i {
    @Override // com.fourthline.kyc.internal.i
    public boolean a(VideoRecording videoRecording) {
        Intrinsics.checkNotNullParameter(videoRecording, "videoRecording");
        Coordinate location = videoRecording.getLocation();
        if (location == null) {
            return true;
        }
        double latitude = location.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = location.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    @Override // com.fourthline.kyc.internal.i
    public boolean b(VideoRecording videoRecording) {
        String strExtractMetadata;
        Intrinsics.checkNotNullParameter(videoRecording, "videoRecording");
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(videoRecording.getUrl().getPath());
            strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        } catch (Throwable unused) {
        }
        Integer numValueOf = strExtractMetadata != null ? Integer.valueOf(Integer.parseInt(strExtractMetadata)) : null;
        return numValueOf != null && ((long) numValueOf.intValue()) <= videoRecording.getDuration().getDuration();
    }
}
