package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "parentValue", "childValue", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class SemanticsActions$CustomActions$1 extends u implements Function2<List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>> {
    public static final SemanticsActions$CustomActions$1 INSTANCE = new SemanticsActions$CustomActions$1();

    public SemanticsActions$CustomActions$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CustomAccessibilityAction> invoke(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
        if (list == null) {
            list = f0.f322471a;
        }
        return d0.E0(list2, list);
    }
}
