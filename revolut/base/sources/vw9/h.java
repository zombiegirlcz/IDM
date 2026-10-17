package vw9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.navbar.d f292660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f292661b;

    public h(com.revolut.core.ui_kit.views.navbar.d content, List menuItems) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f292660a = content;
        this.f292661b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f292660a, hVar.f292660a) && Intrinsics.f(this.f292661b, hVar.f292661b);
    }

    public final int hashCode() {
        return this.f292661b.hashCode() + (this.f292660a.hashCode() * 31);
    }
}
