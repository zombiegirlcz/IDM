package neg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f214523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f214524c;

    public o(List list, k kVar) {
        this(list, kVar, f0.f322471a);
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof o) {
            return new m(!Intrinsics.f(((o) oldState).f214524c, this.f214524c));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f214522a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f214522a, oVar.f214522a) && this.f214523b == oVar.f214523b && Intrinsics.f(this.f214524c, oVar.f214524c);
    }

    public final int hashCode() {
        return this.f214524c.hashCode() + ((this.f214523b.hashCode() + (this.f214522a.hashCode() * 31)) * 31);
    }

    public o(List items, k buttonState, List toolbarMenu) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(toolbarMenu, "toolbarMenu");
        this.f214522a = items;
        this.f214523b = buttonState;
        this.f214524c = toolbarMenu;
    }
}
