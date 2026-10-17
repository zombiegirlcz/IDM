package uag;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f278651c;

    public p(String selectedTabId, List menuItems, f navigation) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f278649a = selectedTabId;
        this.f278650b = menuItems;
        this.f278651c = navigation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f278649a, pVar.f278649a) && Intrinsics.f(this.f278650b, pVar.f278650b) && Intrinsics.f(this.f278651c, pVar.f278651c);
    }

    public final int hashCode() {
        return this.f278651c.f278640a.hashCode() + p.a.d(this.f278649a.hashCode() * 31, 31, this.f278650b);
    }
}
