package androidx.compose.foundation.text.contextmenu.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuKeys;", "", "<init>", "()V", "CutKey", "getCutKey", "()Ljava/lang/Object;", "CopyKey", "getCopyKey", "PasteKey", "getPasteKey", "SelectAllKey", "getSelectAllKey", "AutofillKey", "getAutofillKey", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextContextMenuKeys {

    @NotNull
    public static final TextContextMenuKeys INSTANCE = new TextContextMenuKeys();

    @NotNull
    private static final Object CutKey = new Object();

    @NotNull
    private static final Object CopyKey = new Object();

    @NotNull
    private static final Object PasteKey = new Object();

    @NotNull
    private static final Object SelectAllKey = new Object();

    @NotNull
    private static final Object AutofillKey = new Object();
    public static final int $stable = 8;

    private TextContextMenuKeys() {
    }

    @NotNull
    public final Object getAutofillKey() {
        return AutofillKey;
    }

    @NotNull
    public final Object getCopyKey() {
        return CopyKey;
    }

    @NotNull
    public final Object getCutKey() {
        return CutKey;
    }

    @NotNull
    public final Object getPasteKey() {
        return PasteKey;
    }

    @NotNull
    public final Object getSelectAllKey() {
        return SelectAllKey;
    }
}
