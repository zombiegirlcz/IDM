package v03;

import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f284722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f284724c;
    public final List d;

    public h(TextLocalisedClause header, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f284722a = header;
        this.f284723b = items;
        this.f284724c = z;
        this.d = menuItems;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof h)) {
            return null;
        }
        return new g(!r6.f284722a.equals(this.f284722a), ((h) oldState).f284724c != this.f284724c, !Intrinsics.f(r6.d, this.d));
    }

    @Override // cli.p
    public final List c() {
        return this.f284723b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f284722a.equals(hVar.f284722a) && Intrinsics.f(this.f284723b, hVar.f284723b) && this.f284724c == hVar.f284724c && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.d(this.f284722a.hashCode() * 31, 31, this.f284723b), 31, this.f284724c);
    }
}
