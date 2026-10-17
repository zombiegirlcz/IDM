package com.revolut.camerakit.revolut.ui.barcode;

import aii.o;
import android.content.Context;
import android.content.Intent;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$Step;
import com.revolut.camerakit.revolut.ui.barcode.standalone_entry.BarcodeReaderEntryActivity;
import com.revolut.camerakit.revolut.ui.barcode.standalone_entry.BarcodeReaderScreenDestination;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import tp8.l;
import tx.e;
import tx.f;
import vkm.j2;
import yki.i;
import zhm.u;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends h implements e {
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f50758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BarcodeReaderFlowContract$InputData f50759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f50760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f50761s;

    public a(y80.a permissionProvider, Context context, BarcodeReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = permissionProvider;
        this.f50758p = context;
        this.f50759q = inputData;
        this.f50760r = hx7.e.b(this, new BarcodeReaderFlowContract$FlowState(false));
        this.f50761s = d8l.d.a(this, new l(this, 16));
    }

    public static PermissionsControllerContract$Permission I2() {
        return new PermissionsControllerContract$Permission("android.permission.CAMERA", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_title, null, null, 14), new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_description, null, null, 14), new TextLocalisedClause(R$string.camerakit_ui_camera_permission_prompt_action, null, null, 14), b.c("3D019", null, null, null, 30), null), true, 2);
    }

    public final void J2() {
        d dVar = this.f50760r;
        if (((BarcodeReaderFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f50753a) {
            return;
        }
        H2(dVar, new f(0));
        o oVarL1 = l1();
        Intent intent = new Intent(this.f50758p, (Class<?>) BarcodeReaderEntryActivity.class);
        intent.putExtra("CONFIGURATION_ARG", new KompotFlowContract$Configuration.Standalone(new BarcodeReaderScreenDestination(this.f50759q), true, false));
        knm.b.j(oVarL1, new ExternalDestination.ByIntent(intent, 1245));
    }

    @Override // yki.j
    public final void M0() {
        if (this.o.c("android.permission.CAMERA")) {
            J2();
        } else {
            h.t2(this, this.f50761s, new BarcodeReaderFlowContract$Step.Permissions(u.c(I2())), false, null, false, 12);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f50760r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50761s;
    }
}
