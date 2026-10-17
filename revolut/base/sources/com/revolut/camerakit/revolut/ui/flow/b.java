package com.revolut.camerakit.revolut.ui.flow;

import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$Step;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import ly.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends h implements ly.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f50798p;

    public b(c inputData, y80.a permissionProvider) {
        FlowStep permissions;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        CameraKitFlowContract$FlowType cameraKitFlowContract$FlowType = inputData.f200604a;
        if (!(cameraKitFlowContract$FlowType instanceof CameraKitFlowContract$FlowType.ActiveLiveness) && !(cameraKitFlowContract$FlowType instanceof CameraKitFlowContract$FlowType.Document) && !(cameraKitFlowContract$FlowType instanceof CameraKitFlowContract$FlowType.QrCode) && !(cameraKitFlowContract$FlowType instanceof CameraKitFlowContract$FlowType.Selfie)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = !hy.c.a(inputData.f200606c.f50706a) || permissionProvider.c("android.permission.RECORD_AUDIO");
        boolean zC = permissionProvider.c("android.permission.CAMERA");
        if (zC && z) {
            permissions = CameraKitFlowContract$Step.Camera.f50796a;
        } else {
            PermissionsControllerContract$Permission[] elements = {!zC ? new PermissionsControllerContract$Permission("android.permission.CAMERA", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.vision_permissions_no_camera_access_title, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_camera_access_subtitle, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_camera_access_open_app_settings, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), null), true, 2) : null, z ? null : new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_title, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_subtitle, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_open_app_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true, 2)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            permissions = new CameraKitFlowContract$Step.Permissions(d.L(elements));
        }
        this.f50798p = cp5.d.a(this, permissions, f0.f322471a, new lp2.c(this, 16));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50798p;
    }
}
