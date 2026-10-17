package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qd0;
import ip0.vd0;
import ip0.wd0;
import ip0.xd0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lg extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd0 f54442a;

    public lg(xd0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f54442a = holder;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        koi.j jVar = this.f54442a.e;
        if (!(jVar instanceof SelectableDelegate.Model)) {
            jVar = null;
        }
        SelectableDelegate.Model model = (SelectableDelegate.Model) jVar;
        event.setChecked((model != null ? model.f53306c : null) == qd0.SELECTED);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        xd0 xd0Var = this.f54442a;
        koi.j jVar = xd0Var.e;
        if (!(jVar instanceof SelectableDelegate.Model)) {
            jVar = null;
        }
        SelectableDelegate.Model model = (SelectableDelegate.Model) jVar;
        boolean z = (model != null ? model.f53306c : null) == qd0.SELECTED;
        vd0 vd0Var = model != null ? model.e : null;
        int i = vd0Var == null ? -1 : wd0.f166990a[vd0Var.ordinal()];
        if (i == -1) {
            gq0.g.c(info, z);
        } else if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gq0.g.c(info, z);
        } else {
            gq0.g.e(info, z, null);
        }
        if (info.getContentDescription() == null && info.getText() == null) {
            View childAt = xd0Var.f167144h.getChildAt(0);
            info.setContentDescription(childAt != null ? or0.m.b(childAt) : null);
        }
        qd0 qd0Var = model != null ? model.f53306c : null;
        int i2 = qd0Var == null ? -1 : wd0.f166991b[qd0Var.ordinal()];
        if (i2 == -1) {
            textLocalisedClause = null;
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.uikit_selectable_indeterminate_accessibility_label, null, null, 14);
        }
        if (textLocalisedClause != null) {
            View view = xd0Var.itemView;
            ty0.c cVarX = h30.l.x(view, "itemView", view);
            Context context = xd0Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CharSequence charSequenceA = ty0.c.a(cVarX, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            if (Build.VERSION.SDK_INT >= 30) {
                info.setStateDescription(charSequenceA);
                return;
            }
            CharSequence contentDescription = info.getContentDescription();
            if (contentDescription != null) {
                charSequenceA = ((Object) charSequenceA) + ", " + ((Object) contentDescription);
            }
            info.setContentDescription(charSequenceA);
        }
    }
}
