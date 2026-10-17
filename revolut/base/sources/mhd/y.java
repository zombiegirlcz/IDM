package mhd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f205540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f205541c;
    public final String d;

    public y(List items, TextLocalisedClause navbarTitle, boolean z, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbarTitle, "navbarTitle");
        this.f205539a = items;
        this.f205540b = navbarTitle;
        this.f205541c = z;
        this.d = str;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof y ? (y) oldState : null) == null) {
            return null;
        }
        return new x(!Intrinsics.f(this.d, r3.d));
    }

    @Override // jki.n
    public final List c() {
        return this.f205539a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f205539a, yVar.f205539a) && this.f205540b.equals(yVar.f205540b) && this.f205541c == yVar.f205541c && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(this.f205539a.hashCode() * 31, 31, this.f205540b), 31, this.f205541c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
