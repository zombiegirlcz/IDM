package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.IconizedSingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SingleChoiceButtonItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem targetItem, Object obj2) {
        c1 updatedValue = (c1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (targetItem instanceof RadioButtonItem) {
            RadioButtonItem radioButtonItem = (RadioButtonItem) targetItem;
            if ((updatedValue instanceof z0) || (updatedValue instanceof a1)) {
                return RadioButtonItem.J(radioButtonItem, true);
            }
            if (updatedValue instanceof b1) {
                return radioButtonItem;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (targetItem instanceof SingleChoiceButtonItem) {
            SingleChoiceButtonItem singleChoiceButtonItem = (SingleChoiceButtonItem) targetItem;
            if ((updatedValue instanceof z0) || (updatedValue instanceof a1)) {
                return SingleChoiceButtonItem.J(singleChoiceButtonItem, true);
            }
            if (updatedValue instanceof b1) {
                return singleChoiceButtonItem;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (targetItem instanceof IconizedSingleChoiceButtonItem) {
            IconizedSingleChoiceButtonItem iconizedSingleChoiceButtonItem = (IconizedSingleChoiceButtonItem) targetItem;
            if ((updatedValue instanceof z0) || (updatedValue instanceof a1)) {
                return IconizedSingleChoiceButtonItem.J(iconizedSingleChoiceButtonItem, true);
            }
            if (updatedValue instanceof b1) {
                return iconizedSingleChoiceButtonItem;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (targetItem instanceof ProductSelectionItem) {
            ProductSelectionItem productSelectionItem = (ProductSelectionItem) targetItem;
            if ((updatedValue instanceof z0) || (updatedValue instanceof a1)) {
                return ProductSelectionItem.J(productSelectionItem, true);
            }
            if (updatedValue instanceof b1) {
                return productSelectionItem;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(targetItem instanceof RadioButtonTextInputItem)) {
            throw new IllegalArgumentException(String.valueOf(targetItem));
        }
        RadioButtonTextInputItem radioButtonTextInputItem = (RadioButtonTextInputItem) targetItem;
        if (!(updatedValue instanceof z0)) {
            if (updatedValue instanceof a1) {
                return RadioButtonTextInputItem.J(radioButtonTextInputItem, true, null, null, 503);
            }
            if (updatedValue instanceof b1) {
                return RadioButtonTextInputItem.J(radioButtonTextInputItem, false, null, ((b1) updatedValue).f2725a, 255);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((z0) updatedValue).f2753a;
        if (kotlin.text.d0.W(str)) {
            str = null;
        }
        if (str == null) {
            str = radioButtonTextInputItem.f63596g;
        }
        return RadioButtonTextInputItem.J(radioButtonTextInputItem, true, str, null, 439);
    }

    @Override // aa0.c
    public final BackendItem b(BackendItem item, InputItem changedItem) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(changedItem, "changedItem");
        if (!(changedItem instanceof xl2.l)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (item instanceof NoneApplyItem) {
            return NoneApplyItem.d((NoneApplyItem) item, false);
        }
        if (item instanceof RadioButtonItem) {
            RadioButtonItem radioButtonItem = (RadioButtonItem) item;
            if (Intrinsics.f(radioButtonItem.f63591b, ((xl2.l) changedItem).getF63595c())) {
                return RadioButtonItem.J(radioButtonItem, false);
            }
        }
        if (item instanceof SingleChoiceButtonItem) {
            SingleChoiceButtonItem singleChoiceButtonItem = (SingleChoiceButtonItem) item;
            if (Intrinsics.f(singleChoiceButtonItem.f63634b, ((xl2.l) changedItem).getF63595c())) {
                return SingleChoiceButtonItem.J(singleChoiceButtonItem, false);
            }
        }
        if (item instanceof ProductSelectionItem) {
            ProductSelectionItem productSelectionItem = (ProductSelectionItem) item;
            if (Intrinsics.f(productSelectionItem.e, ((xl2.l) changedItem).getF63595c())) {
                return ProductSelectionItem.J(productSelectionItem, false);
            }
        }
        if (item instanceof IconizedSingleChoiceButtonItem) {
            IconizedSingleChoiceButtonItem iconizedSingleChoiceButtonItem = (IconizedSingleChoiceButtonItem) item;
            if (Intrinsics.f(iconizedSingleChoiceButtonItem.f63484b, ((xl2.l) changedItem).getF63595c())) {
                return IconizedSingleChoiceButtonItem.J(iconizedSingleChoiceButtonItem, false);
            }
        }
        if (!(item instanceof RadioButtonTextInputItem)) {
            return item;
        }
        RadioButtonTextInputItem radioButtonTextInputItem = (RadioButtonTextInputItem) item;
        return Intrinsics.f(radioButtonTextInputItem.f63595c, ((xl2.l) changedItem).getF63595c()) ? RadioButtonTextInputItem.J(radioButtonTextInputItem, false, null, null, 503) : item;
    }
}
