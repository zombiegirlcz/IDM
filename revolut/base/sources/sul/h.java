package sul;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f265799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f265801c;
    public final e d;

    public h(g toolbar, List items, f nextButton, e footer) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f265799a = toolbar;
        this.f265800b = items;
        this.f265801c = nextButton;
        this.d = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f265800b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265799a, hVar.f265799a) && Intrinsics.f(this.f265800b, hVar.f265800b) && Intrinsics.f(this.f265801c, hVar.f265801c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(p.a.d(this.f265799a.hashCode() * 31, 31, this.f265800b), 31, this.f265801c.f265796a);
    }
}
