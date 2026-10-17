package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel.CircleActionButtonModel f58161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f58162b;

    public x(ProfileCardModel.CircleActionButtonModel button, b0 label) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f58161a = button;
        this.f58162b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f58161a, xVar.f58161a) && Intrinsics.f(this.f58162b, xVar.f58162b);
    }

    public final int hashCode() {
        return this.f58162b.hashCode() + (this.f58161a.hashCode() * 31);
    }
}
