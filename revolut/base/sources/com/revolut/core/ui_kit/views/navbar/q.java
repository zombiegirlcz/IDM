package com.revolut.core.ui_kit.views.navbar;

import au0.c0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends NavBarWithToolbar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f59545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f59546c;

    public q(int i, Clause clause, Image image) {
        c0 clickableMode = c0.NONE;
        image = (i & 8) != 0 ? null : image;
        Intrinsics.checkNotNullParameter(clickableMode, "clickableMode");
        this.f59544a = clause;
        this.f59545b = clickableMode;
        this.f59546c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f59544a, qVar.f59544a) && this.f59545b == qVar.f59545b && Intrinsics.f(this.f59546c, qVar.f59546c);
    }

    public final int hashCode() {
        Object obj2 = this.f59544a;
        int iHashCode = (this.f59545b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 961)) * 31;
        Image image = this.f59546c;
        return Boolean.hashCode(false) + ((iHashCode + (image == null ? 0 : image.hashCode())) * 961);
    }
}
