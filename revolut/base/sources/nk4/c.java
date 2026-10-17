package nk4;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f216646c;
    public final Clause d;
    public final boolean e;

    public c(Clause title, Clause description, Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f216644a = items;
        this.f216645b = title;
        this.f216646c = description;
        this.d = clause;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f216644a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f216644a, cVar.f216644a) && Intrinsics.f(this.f216645b, cVar.f216645b) && Intrinsics.f(this.f216646c, cVar.f216646c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f216644a.hashCode() * 31, 31, this.f216645b), 31, this.f216646c);
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
