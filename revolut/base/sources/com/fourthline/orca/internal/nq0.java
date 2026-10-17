package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class nq0 {
    public static final ie1 a(mq0 mq0Var, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(mq0Var, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(506206124, i, -1, "com.fourthline.orca.core.internal.viewmodel.viewStateValue (Presenter.kt:60)");
        }
        ie1 ie1Var = (ie1) SnapshotStateKt.collectAsState(mq0Var.a(), null, composer, 0, 1).getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ie1Var;
    }
}
