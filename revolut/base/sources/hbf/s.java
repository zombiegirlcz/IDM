package hbf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f150676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f150678c;

    public s(r header, List items, List toolbarActions) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarActions, "toolbarActions");
        this.f150676a = header;
        this.f150677b = items;
        this.f150678c = toolbarActions;
    }

    @Override // cli.p
    public final List c() {
        return this.f150677b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f150676a, sVar.f150676a) && Intrinsics.f(this.f150677b, sVar.f150677b) && Intrinsics.f(this.f150678c, sVar.f150678c);
    }

    public final int hashCode() {
        return this.f150678c.hashCode() + p.a.d(this.f150676a.hashCode() * 31, 31, this.f150677b);
    }
}
