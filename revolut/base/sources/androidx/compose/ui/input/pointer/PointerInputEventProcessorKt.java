package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "dispatchedToAPointerInputModifier", "anyMovementConsumed", "anyChangeConsumed", "Landroidx/compose/ui/input/pointer/ProcessResult;", "ProcessResult", "(ZZZ)I", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z, boolean z3, boolean z4) {
        return ProcessResult.m2504constructorimpl((z ? 1 : 0) | ((z3 ? 1 : 0) << 1) | ((z4 ? 1 : 0) << 2));
    }
}
