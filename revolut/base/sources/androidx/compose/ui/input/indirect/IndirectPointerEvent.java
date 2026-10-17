package androidx.compose.ui.input.indirect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "", "", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getChanges", "()Ljava/util/List;", "changes", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "getPrimaryDirectionalMotionAxis-nZO2Niw", "()I", "primaryDirectionalMotionAxis", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IndirectPointerEvent {
    @NotNull
    List<IndirectPointerInputChange> getChanges();

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw */
    int mo2332getPrimaryDirectionalMotionAxisnZO2Niw();
}
