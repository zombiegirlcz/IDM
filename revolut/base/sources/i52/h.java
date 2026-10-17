package i52;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f158560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f158561c;
    public final Clause d;

    public h(List items, a aVar, TextLocalisedClause title, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f158559a = items;
        this.f158560b = aVar;
        this.f158561c = title;
        this.d = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f158559a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f158559a, hVar.f158559a) && this.f158560b.equals(hVar.f158560b) && this.f158561c.equals(hVar.f158561c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a((this.f158560b.hashCode() + (this.f158559a.hashCode() * 31)) * 31, 31, this.f158561c), 31, false);
        Clause clause = this.d;
        return iC + (clause != null ? clause.hashCode() : 0);
    }
}
