package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends NavBarWithToolbar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f59547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f59549c;

    public s(Clause text, Image startImage) {
        r state = r.ACTIVE;
        Intrinsics.checkNotNullParameter(startImage, "startImage");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59547a = startImage;
        this.f59548b = text;
        this.f59549c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f59547a, sVar.f59547a) && Intrinsics.f(this.f59548b, sVar.f59548b) && this.f59549c == sVar.f59549c;
    }

    public final int hashCode() {
        return this.f59549c.hashCode() + p.a.b(this.f59547a.hashCode() * 31, 31, this.f59548b);
    }
}
