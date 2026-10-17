package cd4;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f23180c;
    public final boolean d;

    public j(Clause title, Clause subtitle, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f23178a = items;
        this.f23179b = title;
        this.f23180c = subtitle;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f23178a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f23178a, jVar.f23178a) && Intrinsics.f(this.f23179b, jVar.f23179b) && Intrinsics.f(this.f23180c, jVar.f23180c) && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.a(p.a.a(this.f23178a.hashCode() * 31, 31, this.f23179b), 31, this.f23180c);
    }
}
