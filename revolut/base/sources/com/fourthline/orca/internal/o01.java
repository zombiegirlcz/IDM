package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o01 {
    public static final SelfieScannerConfig a(n01 n01Var, boolean z) {
        List listC;
        Intrinsics.checkNotNullParameter(n01Var, "<this>");
        iz biometricsStrategy = n01Var.getBiometricsStrategy();
        x7 x7Var = x7.f34906a;
        if (biometricsStrategy.a(x7Var.a())) {
            listC = zhm.u.c(SelfieScannerStep.SELFIE);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(SelfieScannerStep.SELFIE);
            if (n01Var.getBiometricsStrategy().a(x7Var.b())) {
                arrayList.add(SelfieScannerStep.HAND_MOVEMENT);
            }
            if (n01Var.getLiveness().getEnabled()) {
                if (n01Var.getLiveness().getRandomness().getEnabled()) {
                    arrayList.add(SelfieScannerStep.ORCHESTRATED_LIVENESS);
                } else {
                    List listK = zhm.v.k(SelfieScannerStep.TURN_HEAD_LEFT, SelfieScannerStep.TURN_HEAD_RIGHT);
                    Intrinsics.checkNotNullParameter(listK, "<this>");
                    List listG1 = zhm.d0.g1(listK);
                    Collections.shuffle(listG1);
                    arrayList.addAll(listG1);
                }
            }
            if (n01Var.getBiometricsStrategy().a(x7Var.c())) {
                arrayList.add(SelfieScannerStep.HAND_MOVEMENT);
            }
            listC = arrayList;
        }
        SelfieScannerConfig selfieScannerConfig = new SelfieScannerConfig(false, n01Var.i(), null, n01Var.g(), z, listC, 4, null);
        selfieScannerConfig.setInternalConfig(new SelfieScannerInternalConfig(n01Var.getBiometricsStrategy().getValues(), (b(n01Var) || a(n01Var) || c(n01Var)) ? true : n01Var.getCameraX().getEnabled(), n01Var.getVideo().getBitrate(), null, 8, null));
        return selfieScannerConfig;
    }

    public static final boolean b(n01 n01Var) {
        Intrinsics.checkNotNullParameter(n01Var, "<this>");
        iz biometricsStrategy = n01Var.getBiometricsStrategy();
        x7 x7Var = x7.f34906a;
        return biometricsStrategy.a(x7Var.b()) || n01Var.getBiometricsStrategy().a(x7Var.c());
    }

    public static final boolean c(n01 n01Var) {
        Intrinsics.checkNotNullParameter(n01Var, "<this>");
        return n01Var.getBiometricsStrategy().a(x7.f34906a.d());
    }

    public static final boolean a(n01 n01Var) {
        Intrinsics.checkNotNullParameter(n01Var, "<this>");
        return n01Var.getBiometricsStrategy().a(x7.f34906a.a());
    }
}
