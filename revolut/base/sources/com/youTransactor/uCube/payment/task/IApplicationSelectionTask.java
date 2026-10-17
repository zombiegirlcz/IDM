package com.youTransactor.uCube.payment.task;

import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface IApplicationSelectionTask extends IPaymentTask {
    List<EMVApplicationDescriptor> getSelection();

    void setAvailableApplication(List<EMVApplicationDescriptor> list);
}
