package y7f;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f311508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f311509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f311510c;

    public d(Clause title, Clause subtitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311508a = title;
        this.f311509b = subtitle;
        this.f311510c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311510c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f311508a, dVar.f311508a) && Intrinsics.f(this.f311509b, dVar.f311509b) && Intrinsics.f(this.f311510c, dVar.f311510c);
    }

    public final int hashCode() {
        return this.f311510c.hashCode() + p.a.a(this.f311508a.hashCode() * 31, 31, this.f311509b);
    }
}
