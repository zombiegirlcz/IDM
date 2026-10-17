package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"androidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "getLineEdgeIndex", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/semantics/SemanticsNode;)V", "current", "", "following", "(I)[I", "preceding", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "tempRect", "Landroid/graphics/Rect;", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityIterators$PageTextSegmentIterator extends AccessibilityIterators$AbstractTextSegmentIterator {
    private static AccessibilityIterators$PageTextSegmentIterator pageInstance;
    private TextLayoutResult layoutResult;
    private SemanticsNode node;

    @NotNull
    private Rect tempRect;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

    @NotNull
    private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "<init>", "()V", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "DirectionStart", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "getInstance", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AccessibilityIterators$PageTextSegmentIterator getInstance() {
            if (AccessibilityIterators$PageTextSegmentIterator.pageInstance == null) {
                AccessibilityIterators$PageTextSegmentIterator.pageInstance = new AccessibilityIterators$PageTextSegmentIterator(null);
            }
            AccessibilityIterators$PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator = AccessibilityIterators$PageTextSegmentIterator.pageInstance;
            Intrinsics.i(accessibilityIterators$PageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return accessibilityIterators$PageTextSegmentIterator;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccessibilityIterators$PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
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
        int lineCount;
        if (getText().length() <= 0 || current >= getText().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.r("node");
                throw null;
            }
            androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
            int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
            if (current <= 0) {
                current = 0;
            }
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int lineForOffset = textLayoutResult.getLineForOffset(current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            float lineTop = textLayoutResult2.getLineTop(lineForOffset) + iRound;
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            if (textLayoutResult3 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            if (lineTop < textLayoutResult3.getLineTop(textLayoutResult3.getLineCount() - 1)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                lineCount = textLayoutResult4.getLineForVerticalPosition(lineTop);
            } else {
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                lineCount = textLayoutResult5.getLineCount();
            }
            return getRange(current, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult, @NotNull SemanticsNode node) {
        setText(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    @Override // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
    public int[] preceding(int current) {
        int lineForVerticalPosition;
        if (getText().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.r("node");
                throw null;
            }
            androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
            int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
            int length = getText().length();
            if (length <= current) {
                current = length;
            }
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int lineForOffset = textLayoutResult.getLineForOffset(current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            float lineTop = textLayoutResult2.getLineTop(lineForOffset) - iRound;
            if (lineTop > BitmapDescriptorFactory.HUE_RED) {
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                lineForVerticalPosition = textLayoutResult3.getLineForVerticalPosition(lineTop);
            } else {
                lineForVerticalPosition = 0;
            }
            if (current == getText().length() && lineForVerticalPosition < lineForOffset) {
                lineForVerticalPosition++;
            }
            return getRange(getLineEdgeIndex(lineForVerticalPosition, DirectionStart), current);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private AccessibilityIterators$PageTextSegmentIterator() {
        this.tempRect = new Rect();
    }
}
