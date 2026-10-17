package androidx.view.compose;

import androidx.view.compose.internal.BackHandlerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/activity/compose/ComposeBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Landroidx/activity/compose/BackHandlerInfo;", "info", "<init>", "(Landroidx/activity/compose/BackHandlerInfo;)V", "", "onBackCompleted", "()V", "Lkotlin/Function0;", "currentOnBackCompleted", "Lkotlin/jvm/functions/Function0;", "getCurrentOnBackCompleted", "()Lkotlin/jvm/functions/Function0;", "setCurrentOnBackCompleted", "(Lkotlin/jvm/functions/Function0;)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposeBackHandler extends BackHandlerCompat {

    @NotNull
    private Function0<Unit> currentOnBackCompleted;

    public ComposeBackHandler(@NotNull BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.currentOnBackCompleted = new e();
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void onBackCompleted() {
        this.currentOnBackCompleted.invoke();
    }

    public final void setCurrentOnBackCompleted(@NotNull Function0<Unit> function0) {
        this.currentOnBackCompleted = function0;
    }
}
