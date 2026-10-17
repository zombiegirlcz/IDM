package com.revolut.feature.kyc.impl.hyperverge.videoconference;

import bhi.c;
import bw8.b;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$Step;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final HypervergeVideoKycFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77776p;

    public a(HypervergeVideoKycFlowContract$InputData inputData, y80.a permissionProvider) {
        FlowStep requestPermission;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        boolean zC = permissionProvider.c("android.permission.CAMERA");
        boolean zC2 = permissionProvider.c("android.permission.RECORD_AUDIO");
        boolean zC3 = permissionProvider.c("android.permission.ACCESS_FINE_LOCATION");
        if (zC && zC2 && zC3) {
            requestPermission = HypervergeVideoKycFlowContract$Step.Portal.f77774a;
        } else {
            PermissionsControllerContract$Permission[] elements = {!zC ? new PermissionsControllerContract$Permission("android.permission.CAMERA", null, I2(), true, 2) : null, !zC2 ? new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", null, I2(), true, 2) : null, zC3 ? null : new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, I2(), true, 2)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            requestPermission = new HypervergeVideoKycFlowContract$Step.RequestPermission(d.L(elements));
        }
        this.f77776p = cp5.d.a(this, requestPermission, f0.f322471a, new c(this, 28));
    }

    public static PermissionsControllerContract$Explanation.PromptScreen I2() {
        return new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.hyperverge_permission_explanation_generic_title, null, null, 14), new TextLocalisedClause(R$string.hyperverge_permission_explanation_generic_subtitle, null, null, 14), new TextLocalisedClause(R$string.hyperverge_permission_explanation_generic_primary_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30), null);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77776p;
    }
}
