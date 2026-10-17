package nuc;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f219289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219290c;
    public final boolean d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f219291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f219292h;

    public static abstract class a implements q {

        /* JADX INFO: renamed from: nuc.m$a$a, reason: collision with other inner class name */
        public static final class C1219a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1219a f219293a = new C1219a();

            private C1219a() {
            }
        }

        private a() {
        }
    }

    public m() {
        this(null, false, false, false, null, false, 255);
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof m)) {
            return null;
        }
        if (this.d != ((m) oldState).d) {
            return a.C1219a.f219293a;
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f219288a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f219288a, mVar.f219288a) && this.f219289b == mVar.f219289b && this.f219290c == mVar.f219290c && this.d == mVar.d && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f && Intrinsics.f(this.f219291g, mVar.f219291g) && this.f219292h == mVar.f219292h;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f219288a.hashCode() * 31, 31, this.f219289b), 31, this.f219290c), 31, this.d);
        Clause clause = this.e;
        return Boolean.hashCode(this.f219292h) + p.a.d(j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31, this.f219291g);
    }

    public m(List items, boolean z, boolean z3, boolean z4, TextLocalisedClause textLocalisedClause, boolean z6, List menuItems, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f219288a = items;
        this.f219289b = z;
        this.f219290c = z3;
        this.d = z4;
        this.e = textLocalisedClause;
        this.f = z6;
        this.f219291g = menuItems;
        this.f219292h = z11;
    }

    public m(List list, boolean z, boolean z3, boolean z4, List list2, boolean z6, int i) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, null, false, (i & 64) != 0 ? f0.f322471a : list2, (i & 128) != 0 ? false : z6);
    }
}
