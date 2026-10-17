package androidx.compose.foundation.text.contextmenu.data;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuItem;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "key", "", "label", "", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "", "onClick", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "I", "getLeadingIcon", "()I", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextContextMenuItem extends TextContextMenuComponent {

    @NotNull
    private final String label;
    private final int leadingIcon;

    @NotNull
    private final Function1<TextContextMenuSession, Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuItem(@NotNull Object obj2, @NotNull String str, int i, @NotNull Function1<? super TextContextMenuSession, Unit> function1) {
        super(obj2);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = function1;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    @NotNull
    public final Function1<TextContextMenuSession, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("TextContextMenuItem(key=");
        sb6.append(getKey());
        sb6.append(", label=\"");
        sb6.append(this.label);
        sb6.append("\", leadingIcon=");
        return a.t(sb6, this.leadingIcon, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
