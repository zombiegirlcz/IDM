package androidx.compose.ui.text;

import a0.d;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e1.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.m0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import pjl.e0;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J%\u00108\u001a\u0002052\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020/2\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J'\u0010B\u001a\u00020=2\u0006\u0010<\u001a\u0002052\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u001d\u0010E\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u00062\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020G2\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020G2\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010IJ\u0015\u0010M\u001a\u0002052\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020/2\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bN\u0010;J\u0015\u0010O\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bT\u0010SJ\u0015\u0010U\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bU\u0010SJ\u0015\u0010V\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bV\u0010SJ\u0015\u0010W\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bW\u0010SJ\u0015\u0010X\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bX\u0010PJ\u001f\u0010Z\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\b\b\u0002\u0010Y\u001a\u00020C¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u0006¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010_J\u0017\u0010a\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010_R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010h\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010l\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010p\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bq\u0010oR\u0017\u0010r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\br\u0010e\u001a\u0004\bs\u0010gR\u001f\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR \u0010z\u001a\b\u0012\u0004\u0012\u00020y0t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010v\u001a\u0004\b{\u0010xR\u0011\u0010}\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b|\u0010oR\u0011\u0010\u007f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b~\u0010oR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "paint", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "offset", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "requireIndexInRange", "(I)V", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "I", "getMaxLines", "()I", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "width", "F", "getWidth", "()F", "height", "getHeight", "lineCount", "getLineCount", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiParagraph {
    private final boolean didExceedMaxLines;
    private final float height;

    @NotNull
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;

    @NotNull
    private final List<ParagraphInfo> paragraphInfoList;

    @NotNull
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillBoundingBoxes_8ffj60Q$lambda$0(long j2, float[] fArr, Ref$IntRef ref$IntRef, m0 m0Var, ParagraphInfo paragraphInfo) {
        long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m2957getMinimpl(j2) ? paragraphInfo.getStartIndex() : TextRange.m2957getMinimpl(j2)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m2956getMaximpl(j2) ? paragraphInfo.getEndIndex() : TextRange.m2956getMaximpl(j2)));
        paragraphInfo.getParagraph().mo2853fillBoundingBoxes8ffj60Q(jTextRange, fArr, ref$IntRef.f186408a);
        int iM2955getLengthimpl = (TextRange.m2955getLengthimpl(jTextRange) * 4) + ref$IntRef.f186408a;
        for (int i = ref$IntRef.f186408a; i < iM2955getLengthimpl; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f4 = m0Var.f186427a;
            fArr[i2] = f + f4;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f4;
        }
        ref$IntRef.f186408a = iM2955getLengthimpl;
        m0Var.f186427a = paragraphInfo.getParagraph().getHeight() + m0Var.f186427a;
        return Unit.f186387a;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPathForRange$lambda$1(Path path, int i, int i2, ParagraphInfo paragraphInfo) {
        Path.m2078addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m2886painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        multiParagraph.m2892painthn5TExg(canvas, brush, f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2213getDefaultBlendMode0nO6VwU() : i);
    }

    private final void requireIndexInRange(int offset) {
        boolean z = false;
        if (offset >= 0 && offset < getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = d.w(offset, "offset(", ") is out of bounds [0, ");
        sbW.append(getAnnotatedString().length());
        sbW.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        InlineClassHelperKt.throwIllegalArgumentException(sbW.toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        boolean z = false;
        if (offset >= 0 && offset <= getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = d.w(offset, "offset(", ") is out of bounds [0, ");
        sbW.append(getAnnotatedString().length());
        sbW.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(sbW.toString());
    }

    private final void requireLineIndexInRange(int lineIndex) {
        boolean z = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = d.w(lineIndex, "lineIndex(", ") is out of bounds [0, ");
        sbW.append(this.lineCount);
        sbW.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        InlineClassHelperKt.throwIllegalArgumentException(sbW.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m2887fillBoundingBoxes8ffj60Q(long range, @NotNull float[] array, int arrayStart) {
        requireIndexInRange(TextRange.m2957getMinimpl(range));
        requireIndexInRangeInclusiveEnd(TextRange.m2956getMaximpl(range));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f186408a = arrayStart;
        MultiParagraphKt.m2893findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new e(range, array, ref$IntRef, new m0(), 7));
        return array;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? v.j(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    @NotNull
    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? v.j(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        return this.paragraphInfoList.isEmpty() ? BitmapDescriptorFactory.HUE_RED : this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? v.j(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) d0.m0(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final int getLineForOffset(int offset) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? v.j(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m2888getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & position))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo2854getOffsetForPositionk4lQ0M(paragraphInfo.m2898toLocalMKHz9U(position)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? v.j(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    @NotNull
    public final Path getPathForRange(int start, int end2) {
        if (start < 0 || start > end2 || end2 > getAnnotatedString().getText().length()) {
            StringBuilder sbW = a.w("Start(", start, end2, ") or End(", ") is out of range [0..");
            sbW.append(getAnnotatedString().getText().length());
            sbW.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sbW.toString());
        }
        if (start == end2) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m2893findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(start, end2), new e0(Path, start, end2, 2));
        return Path;
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m2889getRangeForRect86BmAI(@NotNull Rect rect, int granularity, @NotNull TextInclusionStrategy inclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == v.j(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m2896toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo2855getRangeForRect86BmAI(paragraphInfo.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM2964getZerod9O1mEE = TextRange.INSTANCE.m2964getZerod9O1mEE();
        while (true) {
            companion = TextRange.INSTANCE;
            if (!TextRange.m2952equalsimpl0(jM2964getZerod9O1mEE, companion.m2964getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM2964getZerod9O1mEE = ParagraphInfo.m2896toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo2855getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m2952equalsimpl0(jM2964getZerod9O1mEE, companion.m2964getZerod9O1mEE())) {
            return companion.m2964getZerod9O1mEE();
        }
        long jM2964getZerod9O1mEE2 = companion.m2964getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.INSTANCE;
            if (!TextRange.m2952equalsimpl0(jM2964getZerod9O1mEE2, companion2.m2964getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM2964getZerod9O1mEE2 = ParagraphInfo.m2896toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo2855getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m2952equalsimpl0(jM2964getZerod9O1mEE2, companion2.m2964getZerod9O1mEE()) ? jM2964getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m2959getStartimpl(jM2964getZerod9O1mEE), TextRange.m2954getEndimpl(jM2964getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m2890getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? v.j(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m2897toGlobalxdX6G0(paragraphInfo.getParagraph().mo2856getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)), false);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m2891paintLG529CI(@NotNull Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo2857paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(BitmapDescriptorFactory.HUE_RED, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m2892painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        AndroidMultiParagraphDraw_androidKt.m3108drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i, int i2) {
        boolean z;
        int iM3278getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m3281getMinWidthimpl(j2) != 0 || Constraints.m3280getMinHeightimpl(j2) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text = multiParagraphIntrinsics.getInfoList$ui_text();
        int size = infoList$ui_text.size();
        int i3 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text.get(i5);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
            if (Constraints.m3274getHasBoundedHeightimpl(j2)) {
                iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2) - ParagraphKt.ceilToInt(f);
                if (iM3278getMaxHeightimpl < 0) {
                    iM3278getMaxHeightimpl = 0;
                }
            } else {
                iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
            }
            Paragraph paragraphM2901ParagraphczeNHc = ParagraphKt.m2901ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM3279getMaxWidthimpl, 0, iM3278getMaxHeightimpl, 5, null), this.maxLines - i3, i2);
            float height = paragraphM2901ParagraphczeNHc.getHeight() + f;
            int lineCount = paragraphM2901ParagraphczeNHc.getLineCount() + i3;
            arrayList.add(new ParagraphInfo(paragraphM2901ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i3, lineCount, f, height));
            if (paragraphM2901ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i5 != v.j(this.intrinsics.getInfoList$ui_text()))) {
                z = true;
                i3 = lineCount;
                f = height;
                break;
            } else {
                i5++;
                i3 = lineCount;
                f = height;
            }
        }
        z = false;
        this.height = f;
        this.lineCount = i3;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m3279getMaxWidthimpl(j2);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i21 = 0; i21 < size3; i21++) {
                Rect rect = placeholderRects.get(i21);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            a0.x(arrayList3, arrayList2);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i22 = 0; i22 < size4; i22++) {
                arrayList4.add(null);
            }
            arrayList2 = d0.E0(arrayList4, arrayList2);
        }
        this.placeholderRects = arrayList2;
    }
}
