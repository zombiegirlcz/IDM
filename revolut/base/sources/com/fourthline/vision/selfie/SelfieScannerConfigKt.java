package com.fourthline.vision.selfie;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"isBioAuthEnabled", "", "Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "(Lcom/fourthline/vision/selfie/SelfieScannerConfig;)Z", "isPassiveLivenessAnalysisEnabled", "fourthline-vision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SelfieScannerConfigKt {
    public static final boolean isBioAuthEnabled(@NotNull SelfieScannerConfig selfieScannerConfig) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "<this>");
        return selfieScannerConfig.getInternalConfig().getStrategies().contains("BioAuthPOC");
    }

    public static final boolean isPassiveLivenessAnalysisEnabled(@NotNull SelfieScannerConfig selfieScannerConfig) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "<this>");
        return selfieScannerConfig.getInternalConfig().getStrategies().contains("PassiveLivenessAnalysis");
    }
}
