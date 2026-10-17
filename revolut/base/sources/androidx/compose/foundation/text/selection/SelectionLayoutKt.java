package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import e1.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\b*\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextRange;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout-RcvT-LA", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "isCollapsed", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SelectionLayoutKt {
    @NotNull
    /* JADX INFO: renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m1150getTextFieldSelectionLayoutRcvTLA(@NotNull TextLayoutResult textLayoutResult, int i, int i2, int i3, long j2, boolean z, boolean z3) {
        return new SingleSelectionLayout(z3, 1, 1, z ? null : new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m2959getStartimpl(j2)), TextRange.m2959getStartimpl(j2), 1L), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m2954getEndimpl(j2)), TextRange.m2954getEndimpl(j2), 1L), TextRange.m2958getReversedimpl(j2)), new SelectableInfo(1L, 1, i, i2, i3, textLayoutResult));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        if (selection != null && selectionLayout != null) {
            if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) {
                if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
                    return false;
                }
                if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
                    return false;
                }
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.f186407a = true;
                selectionLayout.forEachMiddleInfo(new f(ref$BooleanRef, 4));
                return ref$BooleanRef.f186407a;
            }
            if (selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isCollapsed$lambda$0(Ref$BooleanRef ref$BooleanRef, SelectableInfo selectableInfo) {
        if (selectableInfo.getInputText().length() > 0) {
            ref$BooleanRef.f186407a = false;
        }
        return Unit.f186387a;
    }
}
