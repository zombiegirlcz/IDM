package com.revolut.camerakit.revolut.ui.previewless_selfie;

import aii.m;
import aii.n;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$Step;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import d8l.d;
import iz.b;
import iz.f;
import jz.c;
import jz.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends h implements b {
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f50817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PreviewlessSelfieFlowContract$InputData f50818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f50819r;

    public a(y80.a permissionProvider, c previewlessSelfieExtension, PreviewlessSelfieFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(previewlessSelfieExtension, "previewlessSelfieExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = permissionProvider;
        this.f50817p = previewlessSelfieExtension;
        this.f50818q = inputData;
        this.f50819r = d.a(this, new in1.a(this, 24));
    }

    @Override // yki.j
    public final void M0() {
        boolean zA = hy.c.a(this.f50818q.f50813a);
        y80.a aVar = this.o;
        boolean z = !zA || aVar.c("android.permission.RECORD_AUDIO");
        boolean zC = aVar.c("android.permission.CAMERA");
        if (zC && z) {
            this.f50817p.Z2();
            return;
        }
        PermissionsControllerContract$Permission[] elements = {!zC ? new PermissionsControllerContract$Permission("android.permission.CAMERA", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_title, null, null, 14), new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_description, null, null, 14), new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), null), true, 2) : null, !z ? new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_title, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_subtitle, null, null, 14), new TextLocalisedClause(R$string.vision_permissions_no_microphone_access_open_app_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true, 2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        h.u2(this, this.f50819r, new PreviewlessSelfieFlowContract$Step.Permissions(kotlin.collections.d.L(elements)), null, 6);
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof jz.m)) {
            return super.o2(event);
        }
        jz.m mVar = (jz.m) event;
        if (mVar instanceof m.a) {
            C2(iz.d.f169804a);
        } else if (mVar instanceof jz.n) {
            C2(new iz.c(((jz.n) event).f179558b));
        } else {
            if (!mVar.equals(m.b.f179557b)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(this.f50819r);
        }
        return f.f169805a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50819r;
    }
}
