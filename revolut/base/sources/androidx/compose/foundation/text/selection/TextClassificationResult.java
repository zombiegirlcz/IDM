package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.compose.ui.text.TextRange;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/TextClassificationResult;", "", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroid/view/textclassifier/TextClassification;", "textClassification", "<init>", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "J", "getSelection-d9O1mEE", "()J", "Landroid/view/textclassifier/TextClassification;", "getTextClassification", "()Landroid/view/textclassifier/TextClassification;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class TextClassificationResult {
    private final long selection;

    @NotNull
    private final CharSequence text;

    @NotNull
    private final TextClassification textClassification;

    public /* synthetic */ TextClassificationResult(CharSequence charSequence, long j2, TextClassification textClassification, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j2, textClassification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) other;
        return Intrinsics.f(this.text, textClassificationResult.text) && TextRange.m2952equalsimpl0(this.selection, textClassificationResult.selection) && Intrinsics.f(this.textClassification, textClassificationResult.textClassification);
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    @NotNull
    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public int hashCode() {
        return this.textClassification.hashCode() + ((TextRange.m2960hashCodeimpl(this.selection) + (this.text.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.text) + ", selection=" + ((Object) TextRange.m2962toStringimpl(this.selection)) + ", textClassification=" + this.textClassification + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TextClassificationResult(CharSequence charSequence, long j2, TextClassification textClassification) {
        this.text = charSequence;
        this.selection = j2;
        this.textClassification = textClassification;
    }
}
