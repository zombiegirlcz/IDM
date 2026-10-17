package ed9;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f124954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f124955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f124956c;

    public f(Clause title, Clause subtitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124954a = title;
        this.f124955b = subtitle;
        this.f124956c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f124956c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f124954a, fVar.f124954a) && Intrinsics.f(this.f124955b, fVar.f124955b) && Intrinsics.f(this.f124956c, fVar.f124956c);
    }

    public final int hashCode() {
        return this.f124956c.hashCode() + p.a.a(this.f124954a.hashCode() * 31, 31, this.f124955b);
    }
}
