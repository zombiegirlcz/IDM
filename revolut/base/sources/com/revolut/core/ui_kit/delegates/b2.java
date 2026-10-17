package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b2 extends CellDetailsActionListDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f53704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f53705b;

    public b2(Clause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f53704a = text;
        this.f53705b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f53704a, b2Var.f53704a) && Intrinsics.f(this.f53705b, b2Var.f53705b);
    }

    public final int hashCode() {
        int iHashCode = this.f53704a.hashCode() * 31;
        Image image = this.f53705b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
