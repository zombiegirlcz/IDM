package rmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f255222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255223c;

    public e(List items, HtmlClause htmlClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255221a = items;
        this.f255222b = htmlClause;
        this.f255223c = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof e)) {
            return null;
        }
        return new d(!Intrinsics.f(this.f255222b, r5.f255222b), this.f255223c != ((e) oldState).f255223c);
    }

    @Override // cli.p
    public final List c() {
        return this.f255221a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f255221a, eVar.f255221a) && Intrinsics.f(this.f255222b, eVar.f255222b) && this.f255223c == eVar.f255223c;
    }

    public final int hashCode() {
        int iHashCode = this.f255221a.hashCode() * 31;
        Clause clause = this.f255222b;
        return Boolean.hashCode(this.f255223c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
