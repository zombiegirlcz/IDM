package eic;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f126481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f126482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126483c;

    public s(l header, g button, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126481a = header;
        this.f126482b = button;
        this.f126483c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f126483c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f126481a, sVar.f126481a) && Intrinsics.f(this.f126482b, sVar.f126482b) && Intrinsics.f(this.f126483c, sVar.f126483c);
    }

    public final int hashCode() {
        return this.f126483c.hashCode() + ((this.f126482b.hashCode() + (this.f126481a.hashCode() * 31)) * 31);
    }
}
