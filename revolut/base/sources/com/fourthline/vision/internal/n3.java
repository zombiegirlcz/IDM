package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n3 extends k8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(@NotNull d2 metadataSource, @NotNull Function0<? extends VideoDuration> videoDurationFactory, int i) {
        super(metadataSource, new mg(1, videoDurationFactory));
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(videoDurationFactory, "videoDurationFactory");
        this.f36594c = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(Function0 function0) {
        return ((VideoDuration) function0.invoke()).getDuration();
    }

    @Override // com.fourthline.vision.internal.k8
    public long getTrimmedVideoStartMs(@NotNull List<? extends z8> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (this.f36594c == 1) {
            return 0L;
        }
        return getFirstImageTakenTimestamp(list) - getRecordingStartTimestamp();
    }
}
