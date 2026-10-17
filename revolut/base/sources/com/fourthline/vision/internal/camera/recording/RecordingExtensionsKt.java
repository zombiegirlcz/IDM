package com.fourthline.vision.internal.camera.recording;

import com.fourthline.vision.RecordingType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"requiredPermissions", "", "", "Lcom/fourthline/vision/RecordingType;", "getRequiredPermissions", "(Lcom/fourthline/vision/RecordingType;)Ljava/util/List;", "fourthline-vision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecordingExtensionsKt {
    @NotNull
    public static final List<String> getRequiredPermissions(@NotNull RecordingType recordingType) {
        Intrinsics.checkNotNullParameter(recordingType, "<this>");
        String[] elements = {"android.permission.CAMERA", recordingType == RecordingType.VIDEO_WITH_AUDIO ? "android.permission.RECORD_AUDIO" : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }
}
