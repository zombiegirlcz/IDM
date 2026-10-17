package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b+\u0010)J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b.\u0010)J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b/\u0010)J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u0010)J\u001d\u00103\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00042\u0006\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\u000f¢\u0006\u0004\b9\u00108J\u0015\u0010:\u001a\u00020\b2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b:\u0010)J\u0015\u0010;\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b;\u0010-J\u0015\u0010<\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b<\u0010)J%\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ9\u0010I\u001a\u0004\u0018\u00010\u00182\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\b2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0G¢\u0006\u0004\bI\u0010JJ\u001f\u0010O\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ-\u0010S\u001a\u00020A2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010L\u001a\u00020K2\u0006\u0010R\u001a\u00020\b¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020D2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020A2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u000f\u0010]\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u0010aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u0010\\R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\be\u0010\\R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010i\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bi\u0010c\u001a\u0004\bj\u0010\\R\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR \u0010o\u001a\u00020n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u0010t\u001a\u0004\bq\u0010rR\u0017\u0010u\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR \u0010y\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\by\u0010v\u0012\u0004\b{\u0010t\u001a\u0004\bz\u0010xR \u0010|\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010v\u0012\u0004\b~\u0010t\u001a\u0004\b}\u0010xR\u0015\u0010\u007f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0081\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010cR\u001a\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010vR!\u0010\u0089\u0001\u001a\f\u0012\u0005\u0012\u00030\u0088\u0001\u0018\u00010\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010E\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u008c\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0014\u0010\u0092\u0001\u001a\u00020k8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0095\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0013\u0010\u0097\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010xR\u0018\u0010\u009a\u0001\u001a\u00030\u008d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineBaseline", "getLineHeight", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", "offset", "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "getRangeForRect", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "array", "fillLineHorizontalBounds$ui_text", "(I[F)V", "fillLineHorizontalBounds", "startOffset", "endOffset", "arrayStart", "fillBoundingBoxes", "(II[FI)V", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text", "()Z", "isFallbackLinespacingApplied", "getHorizontalPadding", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "Z", "getIncludePadding", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroidx/compose/ui/text/android/selection/WordIterator;", "backingWordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text", "getTopPadding$ui_text$annotations", "bottomPadding", "getBottomPadding$ui_text", "getBottomPadding$ui_text$annotations", "leftPadding", "F", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "backingLayoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextLayout {
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;

    @NotNull
    private final Layout layout;

    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;

    @NotNull
    private final Rect rect;
    private final float rightPadding;

    @NotNull
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    public TextLayout(@NotNull CharSequence charSequence, float f, @NotNull TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f4, float f5, boolean z, boolean z3, int i3, int i5, int i6, int i21, int i22, int i32, int[] iArr, int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        boolean z4;
        int i33;
        boolean z6;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutCreate;
        boolean z11;
        long jVerticalPaddings;
        LineHeightStyleSpan lineHeightStyleSpan;
        LineHeightStyleSpan lineHeightStyleSpan2;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z3;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z12) {
                z4 = true;
                this.isBoringLayout = false;
                i33 = i3;
                z6 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                textPaint2 = textPaint;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignment, i33, truncateAt, (int) Math.ceil(d), f4, f5, i32, z, z3, i5, i6, i21, i22, iArr, iArr2);
            } else {
                z4 = true;
                this.isBoringLayout = true;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, z3, truncateAt, iCeil);
                textPaint2 = textPaint;
                i33 = i3;
                textDirectionHeuristic = textDirectionHeuristic2;
                z6 = false;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i33);
            this.lineCount = iMin;
            int i43 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i33 && (layoutCreate.getEllipsisCount(i43) > 0 || layoutCreate.getLineEnd(i43) != charSequence.length())) ? z4 : z6;
            LineHeightStyleSpan[] lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            if (lineHeightSpans == null || (lineHeightStyleSpan2 = (LineHeightStyleSpan) d.P(lineHeightSpans)) == null) {
                z11 = z6;
            } else {
                z11 = (lineHeightStyleSpan2.getTrimFirstLineTop() && LineHeightStyle.Mode.m3198equalsimpl0(lineHeightStyleSpan2.getMode(), LineHeightStyle.Mode.INSTANCE.m3204getTightlzQqcRY())) ? z4 : z6;
            }
            boolean z29 = (lineHeightSpans == null || (lineHeightStyleSpan = (LineHeightStyleSpan) d.P(lineHeightSpans)) == null || !lineHeightStyleSpan.getTrimLastLineBottom() || !LineHeightStyle.Mode.m3198equalsimpl0(lineHeightStyleSpan.getMode(), LineHeightStyle.Mode.INSTANCE.m3204getTightlzQqcRY())) ? z6 : z4;
            if (z11 && z29) {
                jVerticalPaddings = TextLayout_androidKt.ZeroVerticalPadding;
            } else {
                long verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
                jVerticalPaddings = TextLayout_androidKt.VerticalPaddings(z11 ? z6 : VerticalPaddings.m2986getTopPaddingimpl(verticalPaddings), z29 ? z6 : VerticalPaddings.m2985getBottomPaddingimpl(verticalPaddings));
            }
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m2986getTopPaddingimpl(jVerticalPaddings), VerticalPaddings.m2986getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m2985getBottomPaddingimpl(jVerticalPaddings), VerticalPaddings.m2985getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i43)) : z6;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(layoutCreate, i43, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(layoutCreate, i43, null, 2, null);
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    private final float getHorizontalPadding(int line) {
        return line == this.lineCount + (-1) ? this.leftPadding + this.rightPadding : BitmapDescriptorFactory.HUE_RED;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            Intrinsics.h(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final void fillBoundingBoxes(int startOffset, int endOffset, @NotNull float[] array, int arrayStart) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (!(startOffset >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(startOffset);
        int lineForOffset2 = getLineForOffset(endOffset - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i = lineForOffset;
        int i2 = arrayStart;
        while (true) {
            int lineStart = getLineStart(i);
            int lineEnd = getLineEnd(i);
            int iMin = Math.min(endOffset, lineEnd);
            float lineTop = getLineTop(i);
            float lineBottom = getLineBottom(i);
            boolean z = getParagraphDirection(i) == 1;
            for (int iMax = Math.max(startOffset, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (z && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (z || !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                }
                array[i2] = secondaryDownstream;
                array[i2 + 1] = lineTop;
                array[i2 + 2] = secondaryUpstream;
                array[i2 + 3] = lineBottom;
                i2 += 4;
            }
            if (i == lineForOffset2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text(int lineIndex, @NotNull float[] array) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(lineIndex);
        int lineEnd = getLineEnd(lineIndex);
        int i = 0;
        if (!(array.length >= (lineEnd - lineStart) * 2)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        boolean z = getParagraphDirection(lineIndex) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z && zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            array[i] = secondaryDownstream;
            array[i + 1] = secondaryUpstream;
            i += 2;
            lineStart++;
        }
    }

    @NotNull
    public final RectF getBoundingBox(int offset) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(offset);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(offset, false);
                primaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(offset, false);
                primaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(offset, false);
                secondaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(offset, false);
            secondaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final float getLineBaseline(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : getLineTop(line) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : BitmapDescriptorFactory.HUE_RED);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : BitmapDescriptorFactory.HUE_RED);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (!TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) || this.ellipsize != TextUtils.TruncateAt.END) {
            return getLayoutHelper().getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, ((-1) * getHorizontalPadding(line)) + horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final int[] getRangeForRect(@NotNull RectF rect, int granularity, @NotNull Function2<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text(this, rect, granularity, inclusionStrategy) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rect, granularity, inclusionStrategy);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final void getSelectionPath(int start, int end2, @NotNull Path dest) {
        this.layout.getSelectionPath(start, end2, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(BitmapDescriptorFactory.HUE_RED, this.topPadding);
    }

    @NotNull
    public final CharSequence getText() {
        return this.layout.getText();
    }

    @NotNull
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    @NotNull
    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            Intrinsics.i(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        Intrinsics.i(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(@NotNull Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, i);
            }
            ThreadLocal<TextAndroidCanvas> sharedTextAndroidCanvas = TextLayout_androidKt.getSharedTextAndroidCanvas();
            TextAndroidCanvas textAndroidCanvas = sharedTextAndroidCanvas.get();
            if (textAndroidCanvas == null) {
                textAndroidCanvas = new TextAndroidCanvas();
                sharedTextAndroidCanvas.set(textAndroidCanvas);
            }
            TextAndroidCanvas textAndroidCanvas2 = textAndroidCanvas;
            textAndroidCanvas2.set_nativeCanvas$ui_text(canvas);
            try {
                this.layout.draw(textAndroidCanvas2);
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                int i2 = this.topPadding;
                if (i2 != 0) {
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (-1) * i2);
                }
            } catch (Throwable th10) {
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                throw th10;
            }
        }
    }

    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f4, float f5, boolean z, boolean z3, int i3, int i5, int i6, int i21, int i22, int i32, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i33, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        LayoutIntrinsics layoutIntrinsics2;
        int i43 = (i33 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i33 & 16) != 0 ? null : truncateAt;
        int i59 = (i33 & 32) != 0 ? 2 : i2;
        float f6 = (i33 & 64) != 0 ? 1.0f : f4;
        float f32 = (i33 & 128) != 0 ? 0.0f : f5;
        boolean z4 = (i33 & 256) != 0 ? false : z;
        boolean z6 = (i33 & 512) != 0 ? true : z3;
        int i66 = (i33 & 1024) != 0 ? Integer.MAX_VALUE : i3;
        int i74 = (i33 & 2048) != 0 ? 0 : i5;
        int i92 = (i33 & 4096) != 0 ? 0 : i6;
        int i96 = (i33 & 8192) != 0 ? 0 : i21;
        int i99 = (i33 & 16384) != 0 ? 0 : i22;
        int i100 = (32768 & i33) != 0 ? 0 : i32;
        int[] iArr3 = (65536 & i33) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i33) != 0 ? null : iArr2;
        if ((i33 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = new LayoutIntrinsics(charSequence2, textPaint2, i59);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = layoutIntrinsics;
        }
        this(charSequence2, f, textPaint2, i43, truncateAt2, i59, f6, f32, z4, z6, i66, i74, i92, i96, i99, i100, iArr3, iArr4, layoutIntrinsics2);
    }
}
