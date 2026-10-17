package com.fourthline.vision.internal;

import android.view.Surface;
import com.fourthline.core.internal.Try;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface zf {
    Object start(@NotNull List<? extends Surface> list, @NotNull Continuation<? super Try<l0>> continuation);

    void stop();
}
