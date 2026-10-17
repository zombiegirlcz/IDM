package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import m4.d;
import org.jetbrains.annotations.NotNull;
import rsl.p;
import s1.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0012\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001c\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010#\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J9\u0010(\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020'2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020'2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b*\u0010+J7\u0010-\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b/\u00100JA\u00102\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\"\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b2\u00103J9\u00105\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u0002042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b5\u00106JA\u00108\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\"\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b8\u00109J3\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020;2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b<\u0010=J5\u0010B\u001a\u00020\r2\u0006\u0010?\u001a\u00020>2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b@\u0010AJ;\u0010F\u001a\u00020\r2\u0006\u0010?\u001a\u00020>2\u0006\u0010\"\u001a\u00020!2\u0006\u0010C\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\bD\u0010EJ+\u0010G\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010L\u001a\u00020I*\u00020\u000fH\u0002¢\u0006\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "<init>", "()V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "editCommandConsumer", "", "performHandwritingGesture$foundation", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "performHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture$foundation", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "previewHandwritingGesture", "Landroid/view/inputmethod/SelectGesture;", "textSelectionManager", "performSelectGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "previewSelectGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteGesture;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "performDeleteGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "previewDeleteGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "performSelectRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "previewSelectRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeleteRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "previewDeleteRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "performJoinOrSplitGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/InsertGesture;", "performInsertGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performRemoveSpaceGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "offset", "", "performInsertionOnLegacyTextField", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/text/TextRange;", "range", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "performSelectionOnLegacyTextField", "adjustRange", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "performDeletionOnLegacyTextField", "fallbackOnLegacyTextField", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "toTextGranularity", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandwritingGestureApi34 {

    @NotNull
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, Function1<? super EditCommand, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM1080toTextGranularityNUwxegE = m1080toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM1093getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM1080toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m2953getCollapsedimpl(jM1093getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(c.m(deleteGesture), function1);
        }
        m1078performDeletionOnLegacyTextFieldvJH6DeI(jM1093getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m2931equalsimpl0(iM1080toTextGranularityNUwxegE, TextGranularity.INSTANCE.m2933getWordDRrd7Zo()), function1);
        return 1;
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM1080toTextGranularityNUwxegE = m1080toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM1094getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1094getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM1080toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m2953getCollapsedimpl(jM1094getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(c.m(deleteRangeGesture), function1);
        }
        m1078performDeletionOnLegacyTextFieldvJH6DeI(jM1094getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m2931equalsimpl0(iM1080toTextGranularityNUwxegE, TextGranularity.INSTANCE.m2933getWordDRrd7Zo()), function1);
        return 1;
    }

    /* JADX INFO: renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1078performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, Function1<? super EditCommand, Unit> editCommandConsumer) {
        if (adjustRange) {
            range = HandwritingGesture_androidKt.m1086adjustHandwritingDeleteGestureRange72CqOWE(range, text);
        }
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m2954getEndimpl(range), TextRange.m2954getEndimpl(range)), new DeleteSurroundingTextCommand(TextRange.m2955getLengthimpl(range), 0)));
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration == null) {
            return fallbackOnLegacyTextField(c.m(insertGesture), function1);
        }
        int iM1089getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1089getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM1089getOffsetForHandwritingGestured4ec7I == -1 || !((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM1089getOffsetForHandwritingGestured4ec7I))) {
            return fallbackOnLegacyTextField(c.m(insertGesture), function1);
        }
        performInsertionOnLegacyTextField(iM1089getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration == null) {
            return fallbackOnLegacyTextField(c.m(joinOrSplitGesture), function1);
        }
        int iM1089getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1089getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM1089getOffsetForHandwritingGestured4ec7I == -1 || !((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM1089getOffsetForHandwritingGestured4ec7I))) {
            return fallbackOnLegacyTextField(c.m(joinOrSplitGesture), function1);
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM1089getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m2953getCollapsedimpl(jRangeOfWhitespaces)) {
            performInsertionOnLegacyTextField(TextRange.m2959getStartimpl(jRangeOfWhitespaces), " ", function1);
            return 1;
        }
        m1078performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, function1);
        return 1;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM1091getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1091getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m2953getCollapsedimpl(jM1091getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(c.m(removeSpaceGesture), function1);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f186408a = -1;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f186408a = -1;
        String strH = new Regex("\\s+").h(TextRangeKt.m2966substringFDrldGo(annotatedString, jM1091getRangeForRemoveSpaceGesture5iVPX68), new p(ref$IntRef, ref$IntRef2, 28));
        if (ref$IntRef.f186408a == -1 || ref$IntRef2.f186408a == -1) {
            return fallbackOnLegacyTextField(c.m(removeSpaceGesture), function1);
        }
        int iM2959getStartimpl = TextRange.m2959getStartimpl(jM1091getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.f186408a;
        int iM2959getStartimpl2 = TextRange.m2959getStartimpl(jM1091getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.f186408a;
        String strSubstring = strH.substring(ref$IntRef.f186408a, strH.length() - (TextRange.m2955getLengthimpl(jM1091getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.f186408a));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM2959getStartimpl, iM2959getStartimpl2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence performRemoveSpaceGesture$lambda$3(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, MatchResult matchResult) {
        if (ref$IntRef.f186408a == -1) {
            ref$IntRef.f186408a = matchResult.getRange().f186448a;
        }
        ref$IntRef2.f186408a = matchResult.getRange().f186449b + 1;
        return "";
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM1093getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1080toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m2953getCollapsedimpl(jM1093getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(c.m(selectGesture), function1);
        }
        m1079performSelectionOnLegacyTextField8ffj60Q(jM1093getRangeForScreenRectOH9lIzo, textFieldSelectionManager, function1);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM1094getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1094getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1080toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m2953getCollapsedimpl(jM1094getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(c.m(selectRangeGesture), function1);
        }
        m1079performSelectionOnLegacyTextField8ffj60Q(jM1094getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    /* JADX INFO: renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1079performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.m2959getStartimpl(range), TextRange.m2954getEndimpl(range)));
        if (textSelectionManager != null) {
            textSelectionManager.enterSelectionMode$foundation(true);
        }
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1168setDeletionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1080toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1168setDeletionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m1094getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1080toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation();
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1170setSelectionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1080toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1170setSelectionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m1094getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1080toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    /* JADX INFO: renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1080toTextGranularityNUwxegE(int i) {
        return i != 1 ? i != 2 ? TextGranularity.INSTANCE.m2932getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m2932getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m2933getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, @NotNull Function1<? super EditCommand, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (d.w(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, c.q(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (c.v(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, c.k(handwritingGesture), untransformedText, function1);
        }
        if (c.z(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, c.r(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (c.A(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, c.l(handwritingGesture), untransformedText, function1);
        }
        if (c.D(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, c.o(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        if (c.B(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, c.n(handwritingGesture), viewConfiguration, function1);
        }
        if (c.C(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, c.p(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (d.w(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, c.q(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (c.v(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, c.k(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (c.z(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, c.r(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!c.A(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, c.l(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new s1.d(textFieldSelectionManager, 0));
        return true;
    }
}
