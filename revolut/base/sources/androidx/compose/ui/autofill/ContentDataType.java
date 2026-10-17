package androidx.compose.ui.autofill;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "Companion", "Landroidx/compose/ui/autofill/AndroidContentDataType;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContentDataType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/ContentDataType;", "None", "Landroidx/compose/ui/autofill/ContentDataType;", "getNone", "()Landroidx/compose/ui/autofill/ContentDataType;", "Text", "getText", "List", "getList", "Date", "getDate", "Toggle", "getToggle", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContentDataType None = ContentDataType_androidKt.ContentDataType(0);

        @NotNull
        private static final ContentDataType Text = ContentDataType_androidKt.ContentDataType(1);

        @NotNull
        private static final ContentDataType List = ContentDataType_androidKt.ContentDataType(3);

        @NotNull
        private static final ContentDataType Date = ContentDataType_androidKt.ContentDataType(4);

        @NotNull
        private static final ContentDataType Toggle = ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        @NotNull
        public final ContentDataType getText() {
            return Text;
        }

        @NotNull
        public final ContentDataType getToggle() {
            return Toggle;
        }
    }
}
