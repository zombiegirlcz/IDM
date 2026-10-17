package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o4 extends CounterTextDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54531b;

    public o4(TextLocalisedClause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54530a = resourceImage;
        this.f54531b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj2;
        return Intrinsics.f(this.f54530a, o4Var.f54530a) && this.f54531b.equals(o4Var.f54531b);
    }

    public final int hashCode() {
        Image image = this.f54530a;
        return this.f54531b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }
}
