package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuTextClassificationItem;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "key", "", "textClassification", "Landroid/view/textclassifier/TextClassification;", "index", "", "<init>", "(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "getTextClassification", "()Landroid/view/textclassifier/TextClassification;", "getIndex", "()I", "toString", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextContextMenuTextClassificationItem extends TextContextMenuComponent {
    private final int index;

    @NotNull
    private final TextClassification textClassification;

    public TextContextMenuTextClassificationItem(@NotNull Object obj2, @NotNull TextClassification textClassification, int i) {
        super(obj2);
        this.textClassification = textClassification;
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb6.append(getKey());
        sb6.append(", textClassification=");
        sb6.append(this.textClassification);
        sb6.append(", index=");
        return a.t(sb6, this.index, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
