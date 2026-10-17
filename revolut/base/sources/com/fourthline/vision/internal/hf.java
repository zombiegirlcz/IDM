package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hf extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(@NotNull String visionFramework, @NotNull SelfieScannerConfig config, Map<String, Boolean> map) {
        super("selfie");
        Intrinsics.checkNotNullParameter(visionFramework, "visionFramework");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f36334a = ib.b.Scanner;
        this.f36335b = "iglu:com.fourthline.sdk/scanner/jsonschema/1-0-0";
        set("vision", visionFramework);
        set("video_recording", getNameLowerCased(config.getRecordingType()));
        List<SelfieScannerStep> steps = config.getSteps();
        ArrayList arrayList = new ArrayList(zhm.w.t(steps, 10));
        Iterator<T> it8 = steps.iterator();
        while (it8.hasNext()) {
            arrayList.add(bd.getStepType((SelfieScannerStep) it8.next()));
        }
        set("steps", arrayList);
        set("motion_data_enabled", Boolean.valueOf(config.getIncludeMotionData()));
        if (config.getSteps().contains(SelfieScannerStep.HAND_MOVEMENT)) {
            set("tensorflow_available", Boolean.valueOf(yd.f37153n.isAvailable()));
        }
        if (map != null) {
            set("available_sensors", map);
        }
    }

    private final String getNameLowerCased(Enum<?> r3) {
        String strName = r3.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // ib.b
    @NotNull
    public String getIdentifier() {
        return this.f36334a;
    }

    @Override // ib.b
    @NotNull
    public String getSchema() {
        return this.f36335b;
    }

    public /* synthetic */ hf(String str, SelfieScannerConfig selfieScannerConfig, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, selfieScannerConfig, (i & 4) != 0 ? null : map);
    }
}
