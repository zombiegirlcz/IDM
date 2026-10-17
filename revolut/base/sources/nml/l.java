package nml;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f217387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f217388c;
    public final j d;

    public l(List items, k navBar, Clause disclaimer, j mainButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        this.f217386a = items;
        this.f217387b = navBar;
        this.f217388c = disclaimer;
        this.d = mainButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f217386a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f217386a, lVar.f217386a) && Intrinsics.f(this.f217387b, lVar.f217387b) && Intrinsics.f(this.f217388c, lVar.f217388c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a((this.f217387b.hashCode() + (this.f217386a.hashCode() * 31)) * 31, 31, this.f217388c);
    }
}
