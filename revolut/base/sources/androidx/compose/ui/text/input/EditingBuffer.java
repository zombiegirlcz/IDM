package androidx.compose.ui.text.input;

import a0.d;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0015H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u00105\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R$\u00107\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\u0016\u0010;\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010>\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R\u0014\u0010B\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010/¨\u0006D"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition$ui_text", "()Z", "hasComposition", "", "index", "", "get$ui_text", "(I)C", "get", "start", "end", "", "", "replace$ui_text", "(IILjava/lang/String;)V", "replace", "delete$ui_text", "(II)V", "delete", "setSelection$ui_text", "setSelection", "setComposition$ui_text", "setComposition", "commitComposition$ui_text", "()V", "commitComposition", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "value", "selectionStart", "I", "getSelectionStart$ui_text", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text", "setSelectionEnd", "compositionStart", "getCompositionStart$ui_text", "compositionEnd", "getCompositionEnd$ui_text", "getComposition-MzsxiRA$ui_text", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text", "()J", "cursor", "getCursor$ui_text", "setCursor$ui_text", "getLength$ui_text", "length", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditingBuffer {
    private int compositionEnd;
    private int compositionStart;

    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    private final void setSelectionEnd(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void setSelectionStart(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int start, int end2) {
        long jTextRange = TextRangeKt.TextRange(start, end2);
        this.gapBuffer.replace(start, end2, "");
        long jM3050updateRangeAfterDeletepWDy79M = EditingBufferKt.m3050updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m2957getMinimpl(jM3050updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m2956getMaximpl(jM3050updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long jM3050updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m3050updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m2953getCollapsedimpl(jM3050updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m2957getMinimpl(jM3050updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m2956getMaximpl(jM3050updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text(int index) {
        return this.gapBuffer.get(index);
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m3048getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m2947boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getCompositionEnd$ui_text, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: getCompositionStart$ui_text, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m3049getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: getSelectionEnd$ui_text, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: getSelectionStart$ui_text, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text(int start, int end2, @NotNull String text) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbW = d.w(start, "start (", ") offset is outside of text region ");
            sbW.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (end2 < 0 || end2 > this.gapBuffer.getLength()) {
            StringBuilder sbW2 = d.w(end2, "end (", ") offset is outside of text region ");
            sbW2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (start > end2) {
            throw new IllegalArgumentException(d.g(start, end2, "Do not set reversed range: ", " > "));
        }
        this.gapBuffer.replace(start, end2, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition$ui_text(int start, int end2) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbW = d.w(start, "start (", ") offset is outside of text region ");
            sbW.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (end2 < 0 || end2 > this.gapBuffer.getLength()) {
            StringBuilder sbW2 = d.w(end2, "end (", ") offset is outside of text region ");
            sbW2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (start >= end2) {
            throw new IllegalArgumentException(d.g(start, end2, "Do not set reversed or empty range: ", " > "));
        }
        this.compositionStart = start;
        this.compositionEnd = end2;
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final void setSelection$ui_text(int start, int end2) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbW = d.w(start, "start (", ") offset is outside of text region ");
            sbW.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (end2 < 0 || end2 > this.gapBuffer.getLength()) {
            StringBuilder sbW2 = d.w(end2, "end (", ") offset is outside of text region ");
            sbW2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (start > end2) {
            throw new IllegalArgumentException(d.g(start, end2, "Do not set reversed range: ", " > "));
        }
        setSelectionStart(start);
        setSelectionEnd(end2);
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, null);
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m2957getMinimpl(j2);
        this.selectionEnd = TextRange.m2956getMaximpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM2957getMinimpl = TextRange.m2957getMinimpl(j2);
        int iM2956getMaximpl = TextRange.m2956getMaximpl(j2);
        if (iM2957getMinimpl < 0 || iM2957getMinimpl > annotatedString.length()) {
            StringBuilder sbW = d.w(iM2957getMinimpl, "start (", ") offset is outside of text region ");
            sbW.append(annotatedString.length());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (iM2956getMaximpl < 0 || iM2956getMaximpl > annotatedString.length()) {
            StringBuilder sbW2 = d.w(iM2956getMaximpl, "end (", ") offset is outside of text region ");
            sbW2.append(annotatedString.length());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (iM2957getMinimpl > iM2956getMaximpl) {
            throw new IllegalArgumentException(d.g(iM2957getMinimpl, iM2956getMaximpl, "Do not set reversed range: ", " > "));
        }
    }
}
