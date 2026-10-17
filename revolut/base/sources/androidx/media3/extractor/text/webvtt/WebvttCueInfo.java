package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;

/* JADX INFO: loaded from: classes15.dex */
public final class WebvttCueInfo {

    /* JADX INFO: renamed from: cue, reason: collision with root package name */
    public final Cue f7640cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue2, long j2, long j3) {
        this.f7640cue = cue2;
        this.startTimeUs = j2;
        this.endTimeUs = j3;
    }
}
