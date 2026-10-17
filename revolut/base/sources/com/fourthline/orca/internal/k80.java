package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface k80 extends b80, rz0 {
    sg0 a();

    default boolean a(String currentDestination, String targetDestination) {
        Intrinsics.checkNotNullParameter(currentDestination, "currentDestination");
        Intrinsics.checkNotNullParameter(targetDestination, "targetDestination");
        return !Intrinsics.f(targetDestination, "qes_document_viewer");
    }

    default boolean a(c80 targetContext) {
        Intrinsics.checkNotNullParameter(targetContext, "targetContext");
        ib.b bVarB = a().b(ib.b.Flow);
        return (Intrinsics.f(bVarB != null ? bVarB.getName() : null, targetContext.getName()) || Intrinsics.f(targetContext.getName(), "workflow_loading") || Intrinsics.f(targetContext.getName(), "workflow_uploading")) ? false : true;
    }

    default boolean a(c80 currentContext, oy currentFlow, ny nyVar) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        Intrinsics.checkNotNullParameter(currentFlow, "currentFlow");
        return ((currentFlow instanceof gp) || (currentFlow instanceof yb0) || Intrinsics.f(currentContext.getName(), "workflow_loading") || Intrinsics.f(currentContext.getName(), "workflow_uploading") || (nyVar instanceof nd0)) ? false : true;
    }

    default boolean a(c80 currentContext, oy currentFlow) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        Intrinsics.checkNotNullParameter(currentFlow, "currentFlow");
        return ((currentFlow instanceof fj) || (currentFlow instanceof yb0) || (currentFlow instanceof od0) || Intrinsics.f(currentContext.getName(), "workflow_loading") || Intrinsics.f(currentContext.getName(), "workflow_uploading")) ? false : true;
    }
}
