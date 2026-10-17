package mz0;

import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    static IllegalStateException c(String expectedClassName) {
        Intrinsics.checkNotNullParameter(expectedClassName, "expectedClassName");
        return new IllegalStateException("Unable to handle video of the wrong type. The type must be ".concat(expectedClassName));
    }

    boolean a(Video video);

    void b(Video video, c cVar, jz0.c cVar2);
}
