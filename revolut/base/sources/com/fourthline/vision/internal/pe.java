package com.fourthline.vision.internal;

import com.fourthline.core.DocumentTypeKt;
import com.fourthline.vision.document.DocumentScannerConfig;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pe extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(@NotNull String visionFramework, @NotNull DocumentScannerConfig config, Map<String, Boolean> map) {
        super("document");
        Intrinsics.checkNotNullParameter(visionFramework, "visionFramework");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f36710a = ib.b.Scanner;
        this.f36711b = "iglu:com.fourthline.sdk/scanner/jsonschema/1-0-0";
        set("vision", visionFramework);
        set("mrz_policy", getNameLowerCased(config.getMrzValidationPolicy()));
        set("video_recording", getNameLowerCased(config.getRecordingType()));
        set("video_duration", config.getVideoDuration().getAlias());
        set("video_duration_target", Long.valueOf(config.getVideoDuration().getDuration()));
        set("document_type", DocumentTypeKt.toFourthlineValue(config.getType()));
        set("tilted_steps_enabled", Boolean.valueOf(config.getIncludeAngledSteps()));
        set("motion_data_enabled", Boolean.valueOf(config.getIncludeMotionData()));
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
        return this.f36710a;
    }

    @Override // ib.b
    @NotNull
    public String getSchema() {
        return this.f36711b;
    }

    public /* synthetic */ pe(String str, DocumentScannerConfig documentScannerConfig, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, documentScannerConfig, (i & 4) != 0 ? null : map);
    }
}
