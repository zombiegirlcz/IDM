package jqg;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f177721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f177722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f177723c;
    public final Clause d;
    public final boolean e;

    public k(h documentState, Clause title, List menuItems, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(documentState, "documentState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f177721a = documentState;
        this.f177722b = title;
        this.f177723c = menuItems;
        this.d = clause;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f177721a, kVar.f177721a) && Intrinsics.f(this.f177722b, kVar.f177722b) && Intrinsics.f(this.f177723c, kVar.f177723c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.a(this.f177721a.hashCode() * 31, 31, this.f177722b), 31, this.f177723c);
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
