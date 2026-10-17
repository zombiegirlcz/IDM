package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface r70 extends ch1 {
    @Override // com.fourthline.orca.internal.ch1
    default void a(eg1 session) {
        Intrinsics.checkNotNullParameter(session, "session");
    }

    lg1 b();

    default boolean c() {
        mb.d dVarB;
        lg1 lg1VarB = b();
        return (lg1VarB == null || (dVarB = lg1VarB.b()) == null || !a1m.e.B(dVarB)) ? false : true;
    }

    default WorkflowDataDelegate d() {
        return null;
    }

    ny e();

    ye1 f();

    OrcaFlavor getFlavor();

    default ff a() {
        return f().getTenant().getDeviceDataCollection();
    }
}
