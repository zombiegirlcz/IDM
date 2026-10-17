package com.fourthline.vision.internal;

import com.fourthline.vision.RecordingType;
import com.fourthline.vision.internal.o8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ma {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordingType.values().length];
            try {
                iArr[RecordingType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordingType.VIDEO_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordingType.VIDEO_WITH_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final o8.a toInternalType(@NotNull RecordingType recordingType) {
        Intrinsics.checkNotNullParameter(recordingType, "<this>");
        int i = a.$EnumSwitchMapping$0[recordingType.ordinal()];
        if (i == 1) {
            return o8.a.f36623a;
        }
        if (i == 2) {
            return o8.a.f36624b;
        }
        if (i == 3) {
            return o8.a.f36625c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
