package zz9;

import aw0.j8;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f326637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f326638c;
    public final n d;
    public final fu9.a e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f326639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NavBarWithContainerBackground f326640h;
    public final r i;

    public z(List items, List topAlignedItems, j8 navBarModel, n bottomBarState, fu9.a chatInputIconState, boolean z, boolean z3, NavBarWithContainerBackground navBarWithContainerBackground, r keyboardAnimationState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(topAlignedItems, "topAlignedItems");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(chatInputIconState, "chatInputIconState");
        Intrinsics.checkNotNullParameter(keyboardAnimationState, "keyboardAnimationState");
        this.f326636a = items;
        this.f326637b = topAlignedItems;
        this.f326638c = navBarModel;
        this.d = bottomBarState;
        this.e = chatInputIconState;
        this.f = z;
        this.f326639g = z3;
        this.f326640h = navBarWithContainerBackground;
        this.i = keyboardAnimationState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        z zVar = oldState instanceof z ? (z) oldState : null;
        if (zVar != null) {
            r rVar = zVar.i;
            r rVar2 = this.i;
            if (rVar2 != rVar) {
                return new y(rVar2);
            }
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f326636a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f326636a, zVar.f326636a) && Intrinsics.f(this.f326637b, zVar.f326637b) && Intrinsics.f(this.f326638c, zVar.f326638c) && Intrinsics.f(this.d, zVar.d) && this.e == zVar.e && this.f == zVar.f && this.f326639g == zVar.f326639g && Intrinsics.f(this.f326640h, zVar.f326640h) && this.i == zVar.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.e.hashCode() + ((this.d.hashCode() + ((this.f326638c.hashCode() + p.a.d(this.f326636a.hashCode() * 31, 31, this.f326637b)) * 31)) * 31)) * 31, 31, this.f), 31, this.f326639g);
        NavBarWithContainerBackground navBarWithContainerBackground = this.f326640h;
        return this.i.hashCode() + ((iC + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31);
    }
}
