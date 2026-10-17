package com.revolut.camerakit.core.settings;

import com.revolut.camerakit.core.settings.VideoWatermark;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw.h;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {
    public static final String a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        VideoWatermark videoWatermarkA = hVar.a();
        if (videoWatermarkA instanceof VideoWatermark.Enabled) {
            return ((VideoWatermark.Enabled) videoWatermarkA).f50746a;
        }
        if (Intrinsics.f(videoWatermarkA, VideoWatermark.Disabled.f50745a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
