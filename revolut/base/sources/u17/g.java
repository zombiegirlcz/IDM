package u17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static ActionsView.Item a(int i, String listId, ResourceImage removeIcon, Function0 singleChoiceLabelProvider, Function0 multipleChoiceLabelProvider) {
        Clause clause;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(singleChoiceLabelProvider, "singleChoiceLabelProvider");
        Intrinsics.checkNotNullParameter(multipleChoiceLabelProvider, "multipleChoiceLabelProvider");
        if (i < 1) {
            return null;
        }
        mx0.d dVar = mx0.d.SEMIBLACK;
        if (i == 1) {
            clause = (Clause) singleChoiceLabelProvider.invoke();
            if (clause == null) {
                return null;
            }
        } else {
            clause = (Clause) multipleChoiceLabelProvider.invoke();
        }
        return new ActionsView.Item(listId, dVar, false, null, null, clause, removeIcon, null, null, null, false, null, null, null, null, 32668);
    }
}
