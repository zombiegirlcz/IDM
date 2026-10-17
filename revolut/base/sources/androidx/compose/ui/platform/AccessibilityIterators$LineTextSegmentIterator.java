package androidx.compose.ui.platform;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "getLineEdgeIndex", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;)V", "current", "", "following", "(I)[I", "preceding", "Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityIterators$LineTextSegmentIterator extends AccessibilityIterators$AbstractTextSegmentIterator {
    private static AccessibilityIterators$LineTextSegmentIterator lineInstance;
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

    @NotNull
    private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "<init>", "()V", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "DirectionStart", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "getInstance", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AccessibilityIterators$LineTextSegmentIterator getInstance() {
            if (AccessibilityIterators$LineTextSegmentIterator.lineInstance == null) {
                AccessibilityIterators$LineTextSegmentIterator.lineInstance = new AccessibilityIterators$LineTextSegmentIterator(null);
            }
            AccessibilityIterators$LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator = AccessibilityIterators$LineTextSegmentIterator.lineInstance;
            Intrinsics.i(accessibilityIterators$LineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return accessibilityIterators$LineTextSegmentIterator;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccessibilityIterators$LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int getLineEdgeIndex(int lineNumber, ResolvedTextDirection direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        int lineStart = textLayoutResult.getLineStart(lineNumber);
        TextLayoutResult textLayoutResult2 = this.layoutResult;
        if (textLayoutResult2 == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (direction != textLayoutResult2.getParagraphDirection(lineStart)) {
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 != null) {
                return textLayoutResult3.getLineStart(lineNumber);
            }
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (this.layoutResult != null) {
            return TextLayoutResult.getLineEnd$default(r6, lineNumber, false, 2, null) - 1;
        }
        Intrinsics.r("layoutResult");
        throw null;
    }

    @Override // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
    public int[] following(int current) {
        int lineForOffset;
        if (getText().length() <= 0 || current >= getText().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            lineForOffset = textLayoutResult.getLineForOffset(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int lineForOffset2 = textLayoutResult2.getLineForOffset(current);
            lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionStart) == current ? lineForOffset2 : lineForOffset2 + 1;
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (lineForOffset >= textLayoutResult3.getLineCount()) {
            return null;
        }
        return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
    }

    public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult) {
        setText(text);
        this.layoutResult = layoutResult;
    }

    @Override // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
    public int[] preceding(int current) {
        int lineForOffset;
        if (getText().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > getText().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            lineForOffset = textLayoutResult.getLineForOffset(getText().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int lineForOffset2 = textLayoutResult2.getLineForOffset(current);
            lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionEnd) + 1 == current ? lineForOffset2 : lineForOffset2 - 1;
        }
        if (lineForOffset < 0) {
            return null;
        }
        return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
    }

    private AccessibilityIterators$LineTextSegmentIterator() {
    }
}
