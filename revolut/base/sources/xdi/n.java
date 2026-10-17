package xdi;

import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f304462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObjectCarouselNavBarContentView.c f304463c;
    public final List d;

    public n(List list, h hVar, ObjectCarouselNavBarContentView.c.a aVar) {
        this(list, hVar, aVar, f0.f322471a);
    }

    @Override // cli.p
    public final List c() {
        return this.f304461a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f304461a, nVar.f304461a) && Intrinsics.f(this.f304462b, nVar.f304462b) && Intrinsics.f(this.f304463c, nVar.f304463c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f304462b.hashCode() + (this.f304461a.hashCode() * 31)) * 31;
        ObjectCarouselNavBarContentView.c cVar = this.f304463c;
        return this.d.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public n(List items, h buttonState, ObjectCarouselNavBarContentView.c cVar, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f304461a = items;
        this.f304462b = buttonState;
        this.f304463c = cVar;
        this.d = menuItems;
    }
}
