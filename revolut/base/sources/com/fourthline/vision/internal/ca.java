package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.internal.da;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ca extends k8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2 f36071c;
    private final int d;
    private final da.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(@NotNull d2 metadataSource, @NotNull Function0<? extends VideoDuration> videoDurationFactory, int i, @NotNull da.a recordingPlan) {
        super(metadataSource, new mg(0, videoDurationFactory));
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(videoDurationFactory, "videoDurationFactory");
        Intrinsics.checkNotNullParameter(recordingPlan, "recordingPlan");
        this.f36071c = metadataSource;
        this.d = i;
        this.e = recordingPlan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(Function0 function0) {
        return ((VideoDuration) function0.invoke()).getDuration();
    }

    private final List<z8> getMetadataEvents() {
        return (List) this.f36071c.get();
    }

    private final long startOfManualTriggerTimestamp(int i) {
        Object next;
        Iterator<T> it8 = getMetadataEvents().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            z8 z8Var = (z8) next;
            if (z8Var instanceof t8) {
                Object stepType = ((t8) z8Var).getStepConfig().getStepType();
                if ((stepType instanceof DocumentScannerStep) && ((DocumentScannerStep) stepType).getIndex() == i) {
                    break;
                }
            }
        }
        z8 z8Var2 = (z8) next;
        return z8Var2 != null ? z8Var2.getTimestamp() : startOfStepTimestamp(i);
    }

    private final long startOfStepTimestamp(int i) {
        Object next;
        Iterator<T> it8 = getMetadataEvents().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            z8 z8Var = (z8) next;
            if (z8Var instanceof w8) {
                Object stepType = ((w8) z8Var).getStepConfig().getStepType();
                if ((stepType instanceof DocumentScannerStep) && ((DocumentScannerStep) stepType).getIndex() == i) {
                    break;
                }
            }
        }
        z8 z8Var2 = (z8) next;
        if (z8Var2 != null) {
            return z8Var2.getTimestamp();
        }
        return 0L;
    }

    @Override // com.fourthline.vision.internal.k8
    public long getTrimmedVideoStartMs(@NotNull List<? extends z8> list) {
        long jStartOfStepTimestamp;
        long recordingStartTimestamp;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (this.d == 1) {
            return 0L;
        }
        if (this.e.getStartTrigger() == da.b.f36111b) {
            jStartOfStepTimestamp = startOfManualTriggerTimestamp(this.e.getStartRecordingStepIndex());
            recordingStartTimestamp = getRecordingStartTimestamp();
        } else {
            jStartOfStepTimestamp = startOfStepTimestamp(this.e.getStartRecordingStepIndex());
            recordingStartTimestamp = getRecordingStartTimestamp();
        }
        return jStartOfStepTimestamp - recordingStartTimestamp;
    }
}
