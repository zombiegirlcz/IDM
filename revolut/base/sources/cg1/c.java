package cg1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.e f23858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f23859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23860c;

    public c(qf1.e id10, Clause title, List items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23858a = id10;
        this.f23859b = title;
        this.f23860c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f23858a == cVar.f23858a && Intrinsics.f(this.f23859b, cVar.f23859b) && Intrinsics.f(this.f23860c, cVar.f23860c);
    }

    public final int hashCode() {
        return this.f23860c.hashCode() + p.a.a(this.f23858a.hashCode() * 31, 31, this.f23859b);
    }
}
