package rq4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i f256468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256470c;
    public final List d;

    public l(aw0.e eVar, CompositeClause compositeClause, boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256468a = eVar;
        this.f256469b = compositeClause;
        this.f256470c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f256468a, lVar.f256468a) && Intrinsics.f(this.f256469b, lVar.f256469b) && this.f256470c == lVar.f256470c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        aw0.i iVar = this.f256468a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        Clause clause = this.f256469b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f256470c);
    }

    public l(List list) {
        this(null, null, false, list);
    }
}
