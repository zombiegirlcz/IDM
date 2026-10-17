package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.internal.td;
import com.fourthline.orca.workflow.WorkflowBuilderFields;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowCustomizationConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fy implements wq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28694a;

    public fy(String validationCode) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        this.f28694a = validationCode;
    }

    @Override // com.fourthline.orca.internal.wq0
    public dh0 a(lg1 networkConfig, WorkflowConfig productConfig, WorkflowCustomizationConfig productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(productCustomization, "productCustomization");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(onProductCompleted, "onProductCompleted");
        td.g gVarB = td.b();
        String str = this.f28694a;
        Object obj2 = customFields.get(WorkflowBuilderFields.DATA_DELEGATE);
        vx vxVarA = gVarB.a(new wx(str, productConfig, obj2 instanceof WorkflowDataDelegate ? (WorkflowDataDelegate) obj2 : null, onProductCompleted, productCustomization)).a();
        Intrinsics.checkNotNullExpressionValue(vxVarA, "build(...)");
        return vxVarA;
    }
}
