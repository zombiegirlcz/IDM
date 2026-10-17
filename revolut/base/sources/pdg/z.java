package pdg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f235225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a f235226c;
    public final List d;

    public z(List items, n navBarConfig, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a nextButtonConfig, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(nextButtonConfig, "nextButtonConfig");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f235224a = items;
        this.f235225b = navBarConfig;
        this.f235226c = nextButtonConfig;
        this.d = menuItems;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof z)) {
            return null;
        }
        z zVar = (z) oldState;
        return new y(!zVar.f235225b.equals(this.f235225b), !Intrinsics.f(zVar.f235226c, this.f235226c), !Intrinsics.f(zVar.d, this.d));
    }

    @Override // cli.p
    public final List c() {
        return this.f235224a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f235224a, zVar.f235224a) && Intrinsics.f(this.f235225b, zVar.f235225b) && Intrinsics.f(this.f235226c, zVar.f235226c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f235226c.hashCode() + p.a.d(this.f235224a.hashCode() * 31, 31, this.f235225b.f235210a)) * 31);
    }
}
