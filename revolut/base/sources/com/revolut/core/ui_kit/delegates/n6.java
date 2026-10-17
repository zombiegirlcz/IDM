package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n6 extends FullScreenStateDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f54497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f54498c;
    public final boolean d;

    public n6(Clause text, LargeActionButton.ButtonStyle.DefaultFilledButton style, ResourceImage resourceImage, boolean z, int i) {
        resourceImage = (i & 4) != 0 ? null : resourceImage;
        z = (i & 16) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54496a = text;
        this.f54497b = style;
        this.f54498c = resourceImage;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj2;
        return Intrinsics.f(this.f54496a, n6Var.f54496a) && Intrinsics.f(this.f54497b, n6Var.f54497b) && Intrinsics.f(this.f54498c, n6Var.f54498c) && this.d == n6Var.d;
    }

    public final int hashCode() {
        int iD = r6.b.d(this.f54497b, this.f54496a.hashCode() * 31, 31);
        Image image = this.f54498c;
        return Boolean.hashCode(this.d) + ((iD + (image == null ? 0 : image.hashCode())) * 961);
    }
}
