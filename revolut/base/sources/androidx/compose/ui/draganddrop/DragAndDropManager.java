package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropManager;", "", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "target", "", "registerTargetInterest", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "", "isInterestedTarget", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DragAndDropManager {
    boolean isInterestedTarget(@NotNull DragAndDropTarget target);

    void registerTargetInterest(@NotNull DragAndDropTarget target);
}
