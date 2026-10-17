package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import kotlin.jvm.internal.Intrinsics;
import tx0.q4;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends StoryNavBarContentView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground.ImageBackground f59559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f59560c;
    public final Clause d;
    public final boolean e;

    public z(String listId, NavBarWithContainerBackground.ImageBackground background, Clause title, Clause clause, int i) {
        clause = (i & 8) != 0 ? null : clause;
        boolean z = (i & 16) != 0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59558a = listId;
        this.f59559b = background;
        this.f59560c = title;
        this.d = clause;
        this.e = z;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53832y() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f59558a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f59558a, zVar.f59558a) && this.f59559b.equals(zVar.f59559b) && this.f59560c.equals(zVar.f59560c) && Intrinsics.f(this.d, zVar.d) && this.e == zVar.e;
    }

    public final int hashCode() {
        int iB = p.a.b((this.f59559b.hashCode() + (this.f59558a.hashCode() * 31)) * 31, 31, this.f59560c);
        Clause clause = this.d;
        return j6.a.c((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof z ? (z) oldItem : null) == null) {
            return null;
        }
        return new q4(!r7.f59560c.equals(this.f59560c), !Intrinsics.f(r7.d, this.d), ((z) oldItem).e != this.e, !r7.f59559b.equals(this.f59559b));
    }
}
