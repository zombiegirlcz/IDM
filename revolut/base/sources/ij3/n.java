package ij3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f161684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f161685c;
    public final String d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f161686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f161687h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, yhm.j.c(kVar, new igb.j(4)), yhm.j.c(kVar, new igb.j(5)), null, yhm.j.c(kVar, new igb.j(6)), yhm.j.c(kVar, new igb.j(7)), null, null};
    }

    public n(int i2, String str, p pVar, k kVar, String str2, List list, List list2, String str3, t tVar) {
        if (39 != (i2 & 39)) {
            j1.f(l.f161682a.getDescriptor(), i2, 39);
            throw null;
        }
        this.f161683a = str;
        this.f161684b = pVar;
        this.f161685c = kVar;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = f0.f322471a;
        } else {
            this.e = list;
        }
        this.f = list2;
        if ((i2 & 64) == 0) {
            this.f161686g = null;
        } else {
            this.f161686g = str3;
        }
        if ((i2 & 128) == 0) {
            this.f161687h = new t(0);
        } else {
            this.f161687h = tVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f161683a, nVar.f161683a) && this.f161684b == nVar.f161684b && this.f161685c == nVar.f161685c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f161686g, nVar.f161686g) && Intrinsics.f(this.f161687h, nVar.f161687h);
    }

    public final int hashCode() {
        int iHashCode = (this.f161685c.hashCode() + ((this.f161684b.hashCode() + (this.f161683a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iD = p.a.d(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.f161686g;
        return this.f161687h.hashCode() + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public n(String id10, p layout, k ctaPlacement, String str, ArrayList buttons, ArrayList screens, String str2, t timeouts) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(ctaPlacement, "ctaPlacement");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(timeouts, "timeouts");
        this.f161683a = id10;
        this.f161684b = layout;
        this.f161685c = ctaPlacement;
        this.d = str;
        this.e = buttons;
        this.f = screens;
        this.f161686g = str2;
        this.f161687h = timeouts;
    }
}
