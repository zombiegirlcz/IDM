package androidx.compose.ui.autofill;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "<init>", "()V", "", "id", "", "value", "", "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
@d
public final class AutofillTree {

    @NotNull
    private final Map<Integer, Object> children = new LinkedHashMap();

    @NotNull
    public final Map<Integer, Object> getChildren() {
        return this.children;
    }

    public final Unit performAutofill(int id10, @NotNull String value) {
        if (this.children.get(Integer.valueOf(id10)) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
