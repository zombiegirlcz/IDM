package androidx.compose.ui.focus;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "", "cancelFocusChange", "()V", "Landroidx/compose/ui/focus/FocusDirection;", "getRequestedFocusDirection-dhqQ-8s", "()I", "requestedFocusDirection", "Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FocusEnterExitScope {
    void cancelFocusChange();

    /* JADX INFO: renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo1750getRequestedFocusDirectiondhqQ8s();
}
