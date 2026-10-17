package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\t\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u001a\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001f\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u0000*\u00020\u00012\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010(\u001a\u00020\u0006*\u00020\u00112\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020\u0007*\u00020)2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a7\u0010\u001a\u001a\u00020\u0000*\u0004\u0018\u00010,2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u00100\u001a/\u0010(\u001a\u00020\u0006*\u00020,2\u0006\u0010#\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b1\u00102\u001a9\u00107\u001a\u00020\u0000*\u0004\u0018\u00010)2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b5\u00106\u001a%\u0010;\u001a\u00020\u0006*\u00020,2\u0006\u00108\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b9\u0010:\u001a#\u0010?\u001a\u00020=2\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0<\"\u00020=H\u0002¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010E\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000H\u0002¢\u0006\u0004\bC\u0010D¨\u0006F"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "text", "adjustHandwritingDeleteGestureRange-72CqOWE", "(JLjava/lang/CharSequence;)J", "adjustHandwritingDeleteGestureRange", "", "", "isNewline", "(I)Z", "isWhitespace", "isWhitespaceExceptNewline", "isPunctuation", "Landroid/graphics/PointF;", "Landroidx/compose/ui/geometry/Offset;", "toOffset", "(Landroid/graphics/PointF;)J", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/ui/geometry/Rect;", "rectInScreen", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "getRangeForScreenRect-OH9lIzo", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect", "startRectInScreen", "endRectInScreen", "getRangeForScreenRects-O048IG0", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects", "offset", "rangeOfWhitespaces", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getOffsetForHandwritingGesture-d-4ec7I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getOffsetForHandwritingGesture", "Landroidx/compose/ui/text/TextLayoutResult;", "isBiDiBoundary", "(Landroidx/compose/ui/text/TextLayoutResult;I)Z", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "getRangeForScreenRect-O048IG0", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getOffsetForHandwritingGesture-ubNVwUQ", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "startPointInScreen", "endPointerInScreen", "getRangeForRemoveSpaceGesture-5iVPX68", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "getRangeForRemoveSpaceGesture", "localPoint", "getLineForHandwritingGesture-d-4ec7I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getLineForHandwritingGesture", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "compoundEditCommand", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", "a", "b", "enclosure-pWDy79M", "(JJ)J", "enclosure", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class HandwritingGesture_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m1086adjustHandwritingDeleteGestureRange72CqOWE(long j2, CharSequence charSequence) {
        int iM2959getStartimpl = TextRange.m2959getStartimpl(j2);
        int iM2954getEndimpl = TextRange.m2954getEndimpl(j2);
        int iCodePointBefore = iM2959getStartimpl > 0 ? Character.codePointBefore(charSequence, iM2959getStartimpl) : 10;
        int iCodePointAt = iM2954getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM2954getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM2959getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM2959getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM2959getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM2959getStartimpl, iM2954getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j2;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j2;
        }
        do {
            iM2954getEndimpl += Character.charCount(iCodePointAt);
            if (iM2954getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM2954getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM2959getStartimpl, iM2954getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.ui.text.input.EditCommand
            public void applyTo(EditingBuffer buffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(buffer);
                }
            }
        };
    }

    /* JADX INFO: renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m1087enclosurepWDy79M(long j2, long j3) {
        return TextRangeKt.TextRange(Math.min(TextRange.m2959getStartimpl(j2), TextRange.m2959getStartimpl(j2)), Math.max(TextRange.m2954getEndimpl(j3), TextRange.m2954getEndimpl(j3)));
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1088getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : BitmapDescriptorFactory.HUE_RED;
        int i = (int) (BodyPartID.bodyIdMax & j2);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i2 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i2) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i2) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1089getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j2, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m1090getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m1090getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo2539screenToLocalMKHz9U;
        int iM1088getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM1088getLineForHandwritingGestured4ec7I = m1088getLineForHandwritingGestured4ec7I(multiParagraph, (jMo2539screenToLocalMKHz9U = layoutCoordinates.mo2539screenToLocalMKHz9U(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m2888getOffsetForPositionk4lQ0M(Offset.m1829copydBAh8RU$default(jMo2539screenToLocalMKHz9U, BitmapDescriptorFactory.HUE_RED, (multiParagraph.getLineBottom(iM1088getLineForHandwritingGestured4ec7I) + multiParagraph.getLineTop(iM1088getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m1091getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m2964getZerod9O1mEE();
        }
        long jMo2539screenToLocalMKHz9U = layoutCoordinates.mo2539screenToLocalMKHz9U(j2);
        long jMo2539screenToLocalMKHz9U2 = layoutCoordinates.mo2539screenToLocalMKHz9U(j3);
        int iM1088getLineForHandwritingGestured4ec7I = m1088getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo2539screenToLocalMKHz9U, viewConfiguration);
        int iM1088getLineForHandwritingGestured4ec7I2 = m1088getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo2539screenToLocalMKHz9U2, viewConfiguration);
        if (iM1088getLineForHandwritingGestured4ec7I != -1) {
            if (iM1088getLineForHandwritingGestured4ec7I2 != -1) {
                iM1088getLineForHandwritingGestured4ec7I = Math.min(iM1088getLineForHandwritingGestured4ec7I, iM1088getLineForHandwritingGestured4ec7I2);
            }
            iM1088getLineForHandwritingGestured4ec7I2 = iM1088getLineForHandwritingGestured4ec7I;
        } else if (iM1088getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.INSTANCE.m2964getZerod9O1mEE();
        }
        float lineBottom = (textLayoutResult.getLineBottom(iM1088getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineTop(iM1088getLineForHandwritingGestured4ec7I2)) / 2;
        int i = (int) (jMo2539screenToLocalMKHz9U >> 32);
        int i2 = (int) (jMo2539screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m2889getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom + 0.1f), TextGranularity.INSTANCE.m2932getCharacterDRrd7Zo(), TextInclusionStrategy.INSTANCE.getAnyOverlap());
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m1092getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.INSTANCE.m2964getZerod9O1mEE() : multiParagraph.m2889getRangeForRect86BmAI(rect.m1852translatek4lQ0M(layoutCoordinates.mo2539screenToLocalMKHz9U(Offset.INSTANCE.m1845getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1093getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m1092getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1094getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long jM1093getRangeForScreenRectOH9lIzo = m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (TextRange.m2953getCollapsedimpl(jM1093getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m2964getZerod9O1mEE();
        }
        long jM1093getRangeForScreenRectOH9lIzo2 = m1093getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return TextRange.m2953getCollapsedimpl(jM1093getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m2964getZerod9O1mEE() : m1087enclosurepWDy79M(jM1093getRangeForScreenRectOH9lIzo, jM1093getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return (i == textLayoutResult.getLineStart(lineForOffset) || i == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    private static final boolean isNewline(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean isPunctuation(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i) {
        return isWhitespace(i) && !isNewline(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f = pointF.x;
        float f4 = pointF.y;
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & BodyPartID.bodyIdMax));
    }
}
