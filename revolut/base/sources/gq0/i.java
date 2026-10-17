package gq0;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.revolut.core.ui_kit.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends AccessibilityDelegateCompat {

    @NotNull
    public static final a Companion = new a();
    public static final int[] d = {R$id.internal_accessibility_custom_action_0, R$id.internal_accessibility_custom_action_1, R$id.internal_accessibility_custom_action_2, R$id.internal_accessibility_custom_action_3, R$id.internal_accessibility_custom_action_4, R$id.internal_accessibility_custom_action_5, R$id.internal_accessibility_custom_action_6, R$id.internal_accessibility_custom_action_7, R$id.internal_accessibility_custom_action_8, R$id.internal_accessibility_custom_action_9, R$id.internal_accessibility_custom_action_10, R$id.internal_accessibility_custom_action_11, R$id.internal_accessibility_custom_action_12, R$id.internal_accessibility_custom_action_13, R$id.internal_accessibility_custom_action_14, R$id.internal_accessibility_custom_action_15, R$id.internal_accessibility_custom_action_16, R$id.internal_accessibility_custom_action_17, R$id.internal_accessibility_custom_action_18, R$id.internal_accessibility_custom_action_19, R$id.internal_accessibility_custom_action_20};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f145499a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f145500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f145501c;

    public static final class a {
        private a() {
        }
    }

    public final boolean a(m mVar) {
        if (Intrinsics.f(mVar, this.f145500b)) {
            return false;
        }
        this.f145500b = mVar;
        return true;
    }

    public final void b(boolean z) {
        this.f145501c = Boolean.valueOf(z);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        for (Map.Entry entry : this.f145499a.entrySet()) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(((Number) entry.getKey()).intValue(), ((h) entry.getValue()).f145497a));
        }
        m mVar = this.f145500b;
        if (mVar instanceof j) {
            Intrinsics.checkNotNullParameter(info, "info");
            info.setClassName("android.widget.Button");
        } else if (mVar instanceof l) {
            g.e(info, ((l) mVar).f145504a, null);
        } else if (mVar instanceof k) {
            g.c(info, ((k) mVar).f145503a);
        } else if (mVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = this.f145501c;
        if (bool != null) {
            info.setEnabled(bool.booleanValue());
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        h hVar = (h) this.f145499a.get(Integer.valueOf(i));
        if (hVar == null) {
            return super.performAccessibilityAction(host, i, bundle);
        }
        hVar.f145498b.invoke();
        return true;
    }
}
