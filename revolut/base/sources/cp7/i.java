package cp7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f107898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f107899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107900c;
    public final boolean d;
    public final boolean e;

    public i(ArrayList items, TextLocalisedClause title, Clause buttonText, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f107898a = items;
        this.f107899b = title;
        this.f107900c = buttonText;
        this.d = z;
        this.e = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f107898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f107898a.equals(iVar.f107898a) && this.f107899b.equals(iVar.f107899b) && this.f107900c.equals(iVar.f107900c) && this.d == iVar.d && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.b(t61.a.a(this.f107898a.hashCode() * 31, 31, this.f107899b), 31, this.f107900c), 31, this.d);
    }
}
