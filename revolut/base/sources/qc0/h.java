package qc0;

import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;

/* JADX INFO: loaded from: classes19.dex */
public interface h extends zc0.g, com.revolut.feature.chooser.c, f5l.a, e0m.d {
    pfm.a N1(Address address);

    pfm.a P2(String str, BackendFlowUploadResult backendFlowUploadResult);

    pfm.a Q0(DocumentItem documentItem);

    pfm.a c0(PermissionFlowResult permissionFlowResult);

    ufm.c l0(int i);

    pfm.h n0(BackendFlowExitDialog backendFlowExitDialog);

    efm.r o1();

    pfm.a p1();

    pfm.a y0(Action.Submit submit);
}
