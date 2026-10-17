package cg1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.c f23855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f23856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23857c;

    public b(qf1.c id10, Clause title, List items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23855a = id10;
        this.f23856b = title;
        this.f23857c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f23855a == bVar.f23855a && Intrinsics.f(this.f23856b, bVar.f23856b) && Intrinsics.f(this.f23857c, bVar.f23857c);
    }

    public final int hashCode() {
        return this.f23857c.hashCode() + p.a.a(this.f23855a.hashCode() * 31, 31, this.f23856b);
    }
}
