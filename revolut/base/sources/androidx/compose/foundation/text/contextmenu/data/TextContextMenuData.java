package androidx.compose.foundation.text.contextmenu.data;

import androidx.compose.ui.util.ListUtilsKt;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "", "components", "", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "<init>", "(Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "toString", "", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextContextMenuData {

    @NotNull
    private final List<TextContextMenuComponent> components;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final TextContextMenuData Empty = new TextContextMenuData(f0.f322471a);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData$Companion;", "", "<init>", "()V", "Empty", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "getEmpty", "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextContextMenuData getEmpty() {
            return TextContextMenuData.Empty;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuData(@NotNull List<? extends TextContextMenuComponent> list) {
        this.components = list;
    }

    @NotNull
    public final List<TextContextMenuComponent> getComponents() {
        return this.components;
    }

    @NotNull
    public String toString() {
        return a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "TextContextMenuData(components=", ListUtilsKt.fastJoinToString$default(this.components, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null));
    }
}
