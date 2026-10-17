package qc6;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f244570b;

    public c(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f244569a = items;
        this.f244570b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f244569a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f244569a, cVar.f244569a) && this.f244570b.equals(cVar.f244570b);
    }

    public final int hashCode() {
        return this.f244570b.hashCode() + (this.f244569a.hashCode() * 31);
    }
}
