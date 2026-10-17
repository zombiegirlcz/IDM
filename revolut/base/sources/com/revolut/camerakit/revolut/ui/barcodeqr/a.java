package com.revolut.camerakit.revolut.ui.barcodeqr;

import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$Step;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wtj.c;
import wx.b;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends h implements b {
    public final BarcodeQrReaderFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f50770p;

    public a(BarcodeQrReaderFlowContract$InputData inputData, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        this.f50770p = d.a(this, permissionProvider.c("android.permission.CAMERA") ? BarcodeQrReaderFlowContract$Step.Camera.f50768a : new BarcodeQrReaderFlowContract$Step.Permissions(u.c(new PermissionsControllerContract$Permission("android.permission.CAMERA", null, inputData.f50767b, true, 2))), f0.f322471a, new c(this, 18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50770p;
    }
}
