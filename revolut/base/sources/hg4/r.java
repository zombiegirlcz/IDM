package hg4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f152101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f152102c;
    public final Object d;
    public final boolean e;
    public final boolean f;

    public r(List items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, Clause clause, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f152100a = items;
        this.f152101b = title;
        this.f152102c = textLocalisedClause;
        this.d = clause;
        this.e = z;
        this.f = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f152100a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f152100a, rVar.f152100a) && this.f152101b.equals(rVar.f152101b) && this.f152102c.equals(rVar.f152102c) && this.d.equals(rVar.d) && this.e == rVar.e && this.f == rVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(p.a.b(t61.a.a(t61.a.a(this.f152100a.hashCode() * 31, 31, this.f152101b), 31, this.f152102c), 31, this.d), 31, this.e);
    }
}
