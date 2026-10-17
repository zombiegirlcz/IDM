package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTravelPreviewDelegate.Model f54683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButtonDelegate.Model f54684b;

    public s3(ChatTravelPreviewDelegate.Model model, SmallActionButtonDelegate.Model buttonModel) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f54683a = model;
        this.f54684b = buttonModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f54683a, s3Var.f54683a) && Intrinsics.f(this.f54684b, s3Var.f54684b);
    }

    public final int hashCode() {
        return this.f54684b.hashCode() + (this.f54683a.hashCode() * 31);
    }
}
