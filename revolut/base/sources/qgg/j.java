package qgg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f245837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f245838c;
    public final Clause d;

    public j(List items, CompositeClause compositeClause, boolean z, TextClause textClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f245836a = items;
        this.f245837b = compositeClause;
        this.f245838c = z;
        this.d = textClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f245836a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f245836a.equals(jVar.f245836a) && this.f245837b.equals(jVar.f245837b) && this.f245838c == jVar.f245838c && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(h30.l.c(this.f245837b, this.f245836a.hashCode() * 31, 31), 31, this.f245838c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
