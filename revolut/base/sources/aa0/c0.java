package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowCheckboxItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonItem;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        NoneApplyItem targetItem = (NoneApplyItem) inputItem;
        Unit updatedValue = (Unit) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        return NoneApplyItem.d(targetItem, true);
    }

    @Override // aa0.c
    public final BackendItem b(BackendItem item, InputItem inputItem) {
        NoneApplyItem changedItem = (NoneApplyItem) inputItem;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(changedItem, "changedItem");
        if (item instanceof RadioButtonItem) {
            return RadioButtonItem.J((RadioButtonItem) item, false);
        }
        if (!(item instanceof BackendFlowCheckboxItem)) {
            super.b(item, changedItem);
            return item;
        }
        BackendFlowCheckboxItem backendFlowCheckboxItem = (BackendFlowCheckboxItem) item;
        boolean e = backendFlowCheckboxItem.getE();
        String id10 = backendFlowCheckboxItem.getId();
        Intrinsics.checkNotNullParameter(backendFlowCheckboxItem, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (backendFlowCheckboxItem instanceof CheckboxItem) {
            return CheckboxItem.T((CheckboxItem) backendFlowCheckboxItem, id10, false, e, 78);
        }
        if (!(backendFlowCheckboxItem instanceof CheckboxTextInputItem)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckboxTextInputItem checkboxTextInputItem = (CheckboxTextInputItem) backendFlowCheckboxItem;
        return CheckboxTextInputItem.T(checkboxTextInputItem, id10, e, false, null, null, checkboxTextInputItem, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
