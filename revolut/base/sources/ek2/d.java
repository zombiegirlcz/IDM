package ek2;

import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f126933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126934c;
    public final aw0.k d;

    public d(List headers, CompositeClause subtitleClause, List actions, aw0.k kVar) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f126932a = headers;
        this.f126933b = subtitleClause;
        this.f126934c = actions;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126932a, dVar.f126932a) && this.f126933b.equals(dVar.f126933b) && Intrinsics.f(this.f126934c, dVar.f126934c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(h30.l.c(this.f126933b, this.f126932a.hashCode() * 31, 31), 31, this.f126934c);
        aw0.k kVar = this.d;
        return iD + (kVar == null ? 0 : kVar.hashCode());
    }
}
