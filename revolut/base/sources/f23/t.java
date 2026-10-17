package f23;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f131412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f131413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131414c;
    public final List d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131415g;

    public t(Clause title, Clause clause, String str, List menuItems, List tabs, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f131412a = title;
        this.f131413b = clause;
        this.f131414c = menuItems;
        this.d = tabs;
        this.e = z;
        this.f = str;
        this.f131415g = z3;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        t tVar = oldState instanceof t ? (t) oldState : null;
        if (tVar == null) {
            return null;
        }
        return new s(!Intrinsics.f(tVar.f131412a, this.f131412a), !Intrinsics.f(tVar.f131413b, this.f131413b), !Intrinsics.f(tVar.f131414c, this.f131414c), !Intrinsics.f(tVar.d, this.d), tVar.e != this.e, !Intrinsics.f(tVar.f, this.f), tVar.f131415g != this.f131415g);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f131412a, tVar.f131412a) && Intrinsics.f(this.f131413b, tVar.f131413b) && Intrinsics.f(this.f131414c, tVar.f131414c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && Intrinsics.f(this.f, tVar.f) && this.f131415g == tVar.f131415g;
    }

    public final int hashCode() {
        int iHashCode = this.f131412a.hashCode() * 31;
        Clause clause = this.f131413b;
        int iC = j6.a.c(p.a.d(p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f131414c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.f131415g) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
