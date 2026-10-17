package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowCheckboxItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import com.youTransactor.uCube.rpc.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        BackendFlowCheckboxItem targetItem = (BackendFlowCheckboxItem) inputItem;
        c1 updatedValue = (c1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof z0) {
            if (targetItem instanceof CheckboxTextInputItem) {
                CheckboxTextInputItem checkboxTextInputItem = (CheckboxTextInputItem) targetItem;
                return CheckboxTextInputItem.T(checkboxTextInputItem, null, false, true, ((z0) updatedValue).f2753a, null, checkboxTextInputItem, Constants.TAG_KSL_ID);
            }
            if (targetItem instanceof CheckboxItem) {
                return targetItem;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (updatedValue instanceof a1) {
            if (targetItem instanceof CheckboxTextInputItem) {
                CheckboxTextInputItem checkboxTextInputItem2 = (CheckboxTextInputItem) targetItem;
                return CheckboxTextInputItem.T(checkboxTextInputItem2, null, false, !checkboxTextInputItem2.f63354c, null, null, checkboxTextInputItem2, Constants.TAG_FB_CHARGING_STATUS);
            }
            if (!(targetItem instanceof CheckboxItem)) {
                throw new NoWhenBranchMatchedException();
            }
            return CheckboxItem.T((CheckboxItem) targetItem, null, !r11.e, false, LDSFile.EF_DG15_TAG);
        }
        if (!(updatedValue instanceof b1)) {
            throw new NoWhenBranchMatchedException();
        }
        if (targetItem instanceof CheckboxTextInputItem) {
            CheckboxTextInputItem checkboxTextInputItem3 = (CheckboxTextInputItem) targetItem;
            return CheckboxTextInputItem.T(checkboxTextInputItem3, null, false, false, null, ((b1) updatedValue).f2725a, checkboxTextInputItem3, CertificateBody.profileType);
        }
        if (!(targetItem instanceof CheckboxItem)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("CheckboxItem does not support validation");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return targetItem;
    }

    @Override // aa0.c
    public final BackendItem b(BackendItem item, InputItem inputItem) {
        BackendFlowCheckboxItem changedItem = (BackendFlowCheckboxItem) inputItem;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(changedItem, "changedItem");
        if (item instanceof NoneApplyItem) {
            return NoneApplyItem.d((NoneApplyItem) item, false);
        }
        super.b(item, changedItem);
        return item;
    }
}
