package vk1;

import cli.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f289855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f289857c;

    public l(String selectedTabId, ArrayList tabs, List menuItems) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f289855a = tabs;
        this.f289856b = selectedTabId;
        this.f289857c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f289855a.equals(lVar.f289855a) && this.f289856b.equals(lVar.f289856b) && Intrinsics.f(this.f289857c, lVar.f289857c);
    }

    public final int hashCode() {
        return this.f289857c.hashCode() + p.a.c(this.f289855a.hashCode() * 31, 31, this.f289856b);
    }
}
