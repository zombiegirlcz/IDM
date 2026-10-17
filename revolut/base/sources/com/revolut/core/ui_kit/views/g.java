package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends DialogHeaderView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f59060b;

    public g(String id10, Image icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f59059a = id10;
        this.f59060b = icon;
    }

    @Override // com.revolut.core.ui_kit.views.DialogHeaderView.b
    public final String a() {
        return this.f59059a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f59059a, gVar.f59059a) && Intrinsics.f(this.f59060b, gVar.f59060b);
    }

    public final int hashCode() {
        return this.f59060b.hashCode() + (this.f59059a.hashCode() * 31);
    }
}
