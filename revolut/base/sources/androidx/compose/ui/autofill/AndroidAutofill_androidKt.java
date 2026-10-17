package androidx.compose.ui.autofill;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¨\u0006\t"}, d2 = {"populateViewStructure", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "root", "Landroid/view/ViewStructure;", "performAutofill", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidAutofill_androidKt {
    public static final void performAutofill(@NotNull AndroidAutofill androidAutofill, @NotNull SparseArray<AutofillValue> sparseArray) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValue)) {
                androidAutofill.getAutofillTree().performAutofill(iKeyAt, autofillApi26Helper.textValue(autofillValue).toString());
            } else {
                if (autofillApi26Helper.isDate(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillApi26Helper.isList(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillApi26Helper.isToggle(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void populateViewStructure(@NotNull AndroidAutofill androidAutofill, @NotNull ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        int iAddChildCount = autofillApi26Helper.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        Iterator<Map.Entry<Integer, Object>> it8 = androidAutofill.getAutofillTree().getChildren().entrySet().iterator();
        if (it8.hasNext()) {
            Map.Entry<Integer, Object> next = it8.next();
            int iIntValue = next.getKey().intValue();
            if (next.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure, iAddChildCount);
            autofillApi26Helper.setAutofillId(viewStructureNewChild, androidAutofill.getRootAutofillId(), iIntValue);
            autofillApi26Helper.setId(viewStructureNewChild, iIntValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            autofillApi26Helper.setAutofillType(viewStructureNewChild, ContentDataType_androidKt.getDataType(ContentDataType.INSTANCE.getText()));
            throw null;
        }
    }
}
