package bk9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4.a f16287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16289c;

    public h(hx4.a navBarModel, boolean z, List items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16287a = navBarModel;
        this.f16288b = z;
        this.f16289c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f16289c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f16287a.equals(hVar.f16287a) && this.f16288b == hVar.f16288b && Intrinsics.f(this.f16289c, hVar.f16289c);
    }

    public final int hashCode() {
        return this.f16289c.hashCode() + j6.a.c(this.f16287a.hashCode() * 31, 31, this.f16288b);
    }
}
