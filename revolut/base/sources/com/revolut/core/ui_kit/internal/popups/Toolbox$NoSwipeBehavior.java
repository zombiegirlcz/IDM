package com.revolut.core.ui_kit.internal.popups;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/popups/Toolbox$NoSwipeBehavior", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Toolbox$NoSwipeBehavior extends BaseTransientBottomBar.Behavior {
    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.Behavior, com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean canSwipeDismissView(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return false;
    }
}
