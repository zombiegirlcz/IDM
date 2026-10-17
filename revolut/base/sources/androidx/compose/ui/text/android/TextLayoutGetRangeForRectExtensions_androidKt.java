package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.c;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import v0.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\u001aH\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0000\u001aV\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\rH\u0002\u001af\u0010\u0013\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0002\u001af\u0010\u001d\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0002\u001a \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a \u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u001c\u0010!\u001a\u00020\r*\u00020\b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0002¨\u0006$"}, d2 = {"getRangeForRect", "", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "Landroid/text/Layout;", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "rect", "Landroid/graphics/RectF;", "granularity", "", "inclusionStrategy", "Lkotlin/Function2;", "", "getStartOrEndOffsetForRectWithinLine", "lineIndex", "segmentFinder", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "getStart", "getStartOffsetForRectWithinRun", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "lineStart", "lineTop", "lineBottom", "runLeft", "", "runRight", "horizontalBounds", "", "getEndOffsetForRectWithinRun", "getCharacterLeftBounds", "offset", "getCharacterRightBounds", "horizontalOverlap", "left", "right", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final float getCharacterRightBounds(int i, int i2, float[] fArr) {
        return fArr[a.a(i, i2, 2, 1)];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f4, float[] fArr, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f, f4)) {
            return -1;
        }
        if ((bidiRun.getIsRtl() || rectF.right < f4) && (!bidiRun.getIsRtl() || rectF.left > f)) {
            start = bidiRun.getStart();
            int end2 = bidiRun.getEnd();
            while (end2 - start > 1) {
                int i5 = (end2 + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i5, i, fArr);
                if ((bidiRun.getIsRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.getIsRtl() || characterLeftBounds >= rectF.left)) {
                    start = i5;
                } else {
                    end2 = i5;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end2;
            }
        } else {
            start = bidiRun.getEnd() - 1;
        }
        int iPreviousStartBoundary = segmentFinder.previousStartBoundary(start + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end3 = bidiRun.getEnd();
        if (iNextEndBoundary > end3) {
            iNextEndBoundary = end3;
        }
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED, i3);
        while (true) {
            rectF2.left = bidiRun.getIsRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.getIsRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iNextEndBoundary;
            }
            iNextEndBoundary = segmentFinder.previousEndBoundary(iNextEndBoundary);
            if (iNextEndBoundary == -1 || iNextEndBoundary <= bidiRun.getStart()) {
                break;
            }
            int iPreviousStartBoundary2 = segmentFinder.previousStartBoundary(iNextEndBoundary);
            int start3 = bidiRun.getStart();
            iPreviousStartBoundary = iPreviousStartBoundary2 < start3 ? start3 : iPreviousStartBoundary2;
        }
        return -1;
    }

    public static final int[] getRangeForRect(@NotNull TextLayout textLayout, @NotNull Layout layout, @NotNull LayoutHelper layoutHelper, @NotNull RectF rectF, int i, @NotNull Function2<? super RectF, ? super RectF, Boolean> function2) {
        int i2;
        SegmentFinder wordSegmentFinder = i == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i3, rectF, wordSegmentFinder, function2, true);
        while (true) {
            i2 = i3;
            if (startOrEndOffsetForRectWithinLine != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i3, rectF, wordSegmentFinder, function2, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, function2, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i2 < lineForVertical2) {
            int i5 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i5, rectF, wordSegmentFinder, function2, false);
            lineForVertical2 = i5;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f4, float[] fArr, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f, f4)) {
            return -1;
        }
        if ((bidiRun.getIsRtl() || rectF.left > f) && (!bidiRun.getIsRtl() || rectF.right < f4)) {
            start = bidiRun.getStart();
            int end2 = bidiRun.getEnd();
            while (end2 - start > 1) {
                int i5 = (end2 + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i5, i, fArr);
                if ((bidiRun.getIsRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.getIsRtl() || characterLeftBounds >= rectF.right)) {
                    start = i5;
                } else {
                    end2 = i5;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end2;
            }
        } else {
            start = bidiRun.getStart();
        }
        int iNextEndBoundary = segmentFinder.nextEndBoundary(start);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end3 = bidiRun.getEnd();
        if (iNextEndBoundary > end3) {
            iNextEndBoundary = end3;
        }
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED, i3);
        while (true) {
            rectF2.left = bidiRun.getIsRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.getIsRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iPreviousStartBoundary;
            }
            iPreviousStartBoundary = segmentFinder.nextStartBoundary(iPreviousStartBoundary);
            if (iPreviousStartBoundary == -1 || iPreviousStartBoundary >= bidiRun.getEnd()) {
                break;
            }
            int iNextEndBoundary2 = segmentFinder.nextEndBoundary(iPreviousStartBoundary);
            int end4 = bidiRun.getEnd();
            iNextEndBoundary = iNextEndBoundary2 > end4 ? end4 : iNextEndBoundary2;
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i, RectF rectF, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z) {
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        textLayout.fillLineHorizontalBounds$ui_text(i, fArr);
        LayoutHelper.BidiRun[] lineBidiRuns$ui_text = layoutHelper.getLineBidiRuns$ui_text(i);
        c cVarR = z ? d.R(lineBidiRuns$ui_text) : f.l(d.T(lineBidiRuns$ui_text), 0);
        int i2 = cVarR.f186448a;
        int i3 = cVarR.f186449b;
        int i5 = cVarR.f186450c;
        if ((i5 > 0 && i2 <= i3) || (i5 < 0 && i3 <= i2)) {
            int i6 = i2;
            while (true) {
                LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text[i6];
                float characterLeftBounds = bidiRun.getIsRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                float characterRightBounds = bidiRun.getIsRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                int startOffsetForRectWithinRun = z ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, function2) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, function2);
                if (startOffsetForRectWithinRun < 0) {
                    if (i6 == i3) {
                        break;
                    }
                    i6 += i5;
                } else {
                    return startOffsetForRectWithinRun;
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f, float f4) {
        return f4 >= rectF.left && f <= rectF.right;
    }
}
