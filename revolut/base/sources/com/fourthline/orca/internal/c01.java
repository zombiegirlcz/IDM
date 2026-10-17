package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class c01 {
    public static final void a(b01 b01Var, SelfieScannerResult result) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        b01Var.a(result.getImage().getFull());
        b01Var.a(Long.valueOf(result.getMetadata().getTimestamp().getTime()));
        b01Var.a(result.getMetadata().getLocation());
        b01Var.a(result.getVideoRecording());
        b01Var.a(result.getExtraData());
    }
}
