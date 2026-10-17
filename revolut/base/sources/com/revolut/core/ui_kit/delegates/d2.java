package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsAttachmentDelegate.Model f54009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw0.a f54010b;

    public d2(CellDetailsAttachmentDelegate.Model model, cw0.a action) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f54009a = model;
        this.f54010b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f54009a, d2Var.f54009a) && Intrinsics.f(this.f54010b, d2Var.f54010b);
    }

    public final int hashCode() {
        return this.f54010b.hashCode() + (this.f54009a.hashCode() * 31);
    }
}
