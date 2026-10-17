package com.fourthline.core.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super("accessibility");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26287a = context;
        this.f26288b = "accessibility";
        this.f26289c = "iglu:com.fourthline.sdk/accessibility/jsonschema/1-0-0";
        boolean z = true;
        try {
            Object systemService = context.getSystemService("accessibility");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            set("enabled", Boolean.valueOf(accessibilityManager.isEnabled()));
            set("touch_exploration_enabled", Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            set("spoken_feedback", a(accessibilityManager, 1));
            set("haptic_feedback", a(accessibilityManager, 2));
            set("audio_feedback", a(accessibilityManager, 4));
            set("visual_feedback", a(accessibilityManager, 8));
            set("generic_feedback", a(accessibilityManager, 16));
            set("braille_feedback", a(accessibilityManager, 32));
        } catch (Exception unused) {
        }
        try {
            set("color_space_adjusted", Boolean.valueOf(Settings.Secure.getInt(this.f26287a.getContentResolver(), "accessibility_display_daltonizer_enabled") == 1));
        } catch (Exception unused2) {
            set("color_space_adjusted", Boolean.FALSE);
        }
        try {
            if (Settings.Secure.getInt(this.f26287a.getContentResolver(), "accessibility_display_inversion_enabled") != 1) {
                z = false;
            }
            set("color_inverted", Boolean.valueOf(z));
        } catch (Exception unused3) {
            set("color_inverted", Boolean.FALSE);
        }
    }

    private final List a(AccessibilityManager accessibilityManager, int i) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(i);
        Intrinsics.h(enabledAccessibilityServiceList);
        if (enabledAccessibilityServiceList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(enabledAccessibilityServiceList, 10));
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            aim.f builder = new aim.f();
            String id10 = accessibilityServiceInfo.getId();
            Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
            builder.put("identifier", id10);
            String[] packageNames = accessibilityServiceInfo.packageNames;
            Intrinsics.checkNotNullExpressionValue(packageNames, "packageNames");
            builder.put("packageName", packageNames);
            if (Build.VERSION.SDK_INT >= 31) {
                builder.put("is_accessibility_tool", Boolean.valueOf(accessibilityServiceInfo.isAccessibilityTool()));
            }
            CharSequence charSequenceLoadSummary = accessibilityServiceInfo.loadSummary(this.f26287a.getPackageManager());
            Intrinsics.checkNotNullExpressionValue(charSequenceLoadSummary, "loadSummary(...)");
            builder.put("summary", charSequenceLoadSummary);
            Intrinsics.checkNotNullParameter(builder, "builder");
            arrayList.add(builder.b());
        }
        return arrayList;
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f26288b;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f26289c;
    }
}
