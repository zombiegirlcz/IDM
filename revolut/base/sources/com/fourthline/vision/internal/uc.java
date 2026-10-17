package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.fourthline.core.VideoRecording;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class uc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Pair f36988c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36986a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableState f36987b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final Map d = new LinkedHashMap();

    public final void addVideoRecording(@NotNull me videoType, @NotNull VideoRecording videoRecording) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Intrinsics.checkNotNullParameter(videoRecording, "videoRecording");
        this.d.put(videoType, videoRecording);
    }

    public final long getLastFoundFaceTimestamp() {
        return this.f36986a;
    }

    public final Pair<o, fa> getLatestFullBitmap() {
        return this.f36988c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fa getRecognizedBounds() {
        return (fa) this.f36987b.getValue();
    }

    public final VideoRecording getVideoRecording(@NotNull me videoType) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        return (VideoRecording) this.d.get(videoType);
    }

    public final void setLastFoundFaceTimestamp(long j2) {
        this.f36986a = j2;
    }

    public final void setLatestFullBitmap(Pair<o, fa> pair) {
        this.f36988c = pair;
    }

    public final void setRecognizedBounds(fa faVar) {
        this.f36987b.setValue(faVar);
    }
}
