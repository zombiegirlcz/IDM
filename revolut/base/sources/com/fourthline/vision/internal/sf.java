package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface sf {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onComplete$default(sf sfVar, Object obj2, Object obj3, Map map, int i, Object obj4) {
        if (obj4 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
        }
        if ((i & 4) != 0) {
            map = null;
        }
        sfVar.onComplete(obj2, obj3, map);
    }

    void onComplete(Object obj2, Object obj3, Map<String, ? extends Object> map);

    void onEvent(Object obj2, Object obj3);

    void onProcessingResult(Object obj2);

    Object onStartVideoRecordingRequired(Object obj2, @NotNull me meVar, @NotNull Continuation<? super Unit> continuation);

    Object onStopVideoRecordingRequired(Object obj2, @NotNull me meVar, @NotNull Continuation<? super Unit> continuation);
}
