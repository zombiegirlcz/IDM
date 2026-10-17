package androidx.compose.foundation.text;

import android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/ContextMenuStrings;", "", "", "value", "constructor-impl", "(I)I", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ContextMenuStrings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/ContextMenuStrings$Companion;", "", "<init>", "()V", "Cut", "Landroidx/compose/foundation/text/ContextMenuStrings;", "getCut-9Hzcbyc", "()I", "Copy", "getCopy-9Hzcbyc", "Paste", "getPaste-9Hzcbyc", "SelectAll", "getSelectAll-9Hzcbyc", "Autofill", "getAutofill-9Hzcbyc", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAutofill-9Hzcbyc, reason: not valid java name */
        public final int m987getAutofill9Hzcbyc() {
            return ContextMenuStrings.m986constructorimpl(R.string.autofill);
        }

        /* JADX INFO: renamed from: getCopy-9Hzcbyc, reason: not valid java name */
        public final int m988getCopy9Hzcbyc() {
            return ContextMenuStrings.m986constructorimpl(R.string.copy);
        }

        /* JADX INFO: renamed from: getCut-9Hzcbyc, reason: not valid java name */
        public final int m989getCut9Hzcbyc() {
            return ContextMenuStrings.m986constructorimpl(R.string.cut);
        }

        /* JADX INFO: renamed from: getPaste-9Hzcbyc, reason: not valid java name */
        public final int m990getPaste9Hzcbyc() {
            return ContextMenuStrings.m986constructorimpl(R.string.paste);
        }

        /* JADX INFO: renamed from: getSelectAll-9Hzcbyc, reason: not valid java name */
        public final int m991getSelectAll9Hzcbyc() {
            return ContextMenuStrings.m986constructorimpl(R.string.selectAll);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m986constructorimpl(int i) {
        return i;
    }
}
