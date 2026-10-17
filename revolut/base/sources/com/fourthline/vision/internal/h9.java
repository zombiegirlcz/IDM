package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface h9 {
    @NotNull
    Pair<Long, List<MotionFrame>> trimMotionData(@NotNull List<MotionFrame> list);
}
