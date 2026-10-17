package ru5;

import aw0.e4;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f257424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f257425c;
    public final List d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f257426g;

    public l(List items, e4 navBarFiltersState, List navBarMenuItems, List monthTabsItems, String str, Integer num, Clause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarFiltersState, "navBarFiltersState");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(monthTabsItems, "monthTabsItems");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f257423a = items;
        this.f257424b = navBarFiltersState;
        this.f257425c = navBarMenuItems;
        this.d = monthTabsItems;
        this.e = str;
        this.f = num;
        this.f257426g = title;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new i(!Intrinsics.f(this.f, r5.f), this.d.size() != ((l) oldState).d.size());
    }

    @Override // jki.n
    public final List c() {
        return this.f257423a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f257423a, lVar.f257423a) && this.f257424b == lVar.f257424b && Intrinsics.f(this.f257425c, lVar.f257425c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f257426g, lVar.f257426g);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d((this.f257424b.hashCode() + (this.f257423a.hashCode() * 31)) * 31, 31, this.f257425c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return this.f257426g.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
