package c5a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f21532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21534c;
    public final NavBarWithContainerBackground d;

    public v(s navbarUiState, List npsContent, List items, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(navbarUiState, "navbarUiState");
        Intrinsics.checkNotNullParameter(npsContent, "npsContent");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f21532a = navbarUiState;
        this.f21533b = npsContent;
        this.f21534c = items;
        this.d = navBarWithContainerBackground;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        v vVar = (v) oldState;
        return new u((vVar.f21533b.isEmpty() || Intrinsics.f(this.f21533b, vVar.f21533b)) ? false : true);
    }

    @Override // cli.p
    public final List c() {
        return this.f21534c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f21532a, vVar.f21532a) && Intrinsics.f(this.f21533b, vVar.f21533b) && Intrinsics.f(this.f21534c, vVar.f21534c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f21532a.hashCode() * 31, 31, this.f21533b), 31, this.f21534c);
        NavBarWithContainerBackground navBarWithContainerBackground = this.d;
        return iD + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
    }
}
