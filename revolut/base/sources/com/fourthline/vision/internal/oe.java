package com.fourthline.vision.internal;

import android.util.Size;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes23.dex */
public abstract class oe {
    private static final String getClosestResolutionCategory(int i, int i2) {
        Object obj2;
        String str;
        Iterator it8 = zhm.r0.k(new Pair("HD", new Pair(1280, 720)), new Pair("FHD", new Pair(1920, 1080)), new Pair("QHD", new Pair(2560, Integer.valueOf(DateTimeConstants.MINUTES_PER_DAY))), new Pair("UHD", new Pair(3840, 2160))).entrySet().iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                Pair pair = (Pair) ((Map.Entry) next).getValue();
                int iIntValue = i - ((Number) pair.f186385a).intValue();
                int iIntValue2 = i2 - ((Number) pair.f186386b).intValue();
                int i3 = (iIntValue * iIntValue) + (iIntValue2 * iIntValue2);
                do {
                    Object next2 = it8.next();
                    Pair pair2 = (Pair) ((Map.Entry) next2).getValue();
                    int iIntValue3 = i - ((Number) pair2.f186385a).intValue();
                    int iIntValue4 = i2 - ((Number) pair2.f186386b).intValue();
                    int i5 = (iIntValue3 * iIntValue3) + (iIntValue4 * iIntValue4);
                    if (i3 > i5) {
                        next = next2;
                        i3 = i5;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        Map.Entry entry = (Map.Entry) obj2;
        return (entry == null || (str = (String) entry.getKey()) == null) ? "n/a" : str;
    }

    @NotNull
    public static final String getThrowableDescription(@NotNull Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        String simpleName = th10.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        String message = th10.getMessage();
        if (message != null) {
            String str = simpleName + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return simpleName;
    }

    public static final void setVideoRecordingAttributes(@NotNull ib.b bVar, @NotNull Size resolution, int i, @NotNull String codec) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(codec, "codec");
        bVar.set("video_bitrate_target", Integer.valueOf(i));
        bVar.set("video_codec", toCodecAnalyticsValue(codec));
        bVar.set("video_resolution", resolution.getWidth() + "x" + resolution.getHeight());
        bVar.set("video_resolution_target", getClosestResolutionCategory(resolution.getHeight(), resolution.getWidth()));
    }

    private static final String toCodecAnalyticsValue(String str) {
        return kotlin.text.d0.J(str, "h264", true) ? "H264" : kotlin.text.d0.J(str, "h265", true) ? "H265" : kotlin.text.d0.J(str, "avc", true) ? "AVC" : "n/a";
    }
}
