package xpf;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307963c;
    public final boolean d;

    public c(Clause clause, List items, List navBarItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarItems, "navBarItems");
        this.f307961a = items;
        this.f307962b = navBarItems;
        this.f307963c = clause;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f307961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f307961a, cVar.f307961a) && Intrinsics.f(this.f307962b, cVar.f307962b) && Intrinsics.f(this.f307963c, cVar.f307963c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f307961a.hashCode() * 31, 31, this.f307962b);
        Clause clause = this.f307963c;
        return Boolean.hashCode(this.d) + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
