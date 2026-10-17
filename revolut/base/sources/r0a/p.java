package r0a;

import aw0.j8;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f250744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f250745c;
    public final j d;
    public final AppTipUIModel e;
    public final NavBarWithContainerBackground f;

    public p(List items, j8 navBarModel, g buttonsState, j jVar, AppTipUIModel appTipUIModel, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        this.f250743a = items;
        this.f250744b = navBarModel;
        this.f250745c = buttonsState;
        this.d = jVar;
        this.e = appTipUIModel;
        this.f = navBarWithContainerBackground;
    }

    @Override // cli.p
    public final List c() {
        return this.f250743a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f250743a, pVar.f250743a) && Intrinsics.f(this.f250744b, pVar.f250744b) && Intrinsics.f(this.f250745c, pVar.f250745c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f250745c.hashCode() + ((this.f250744b.hashCode() + (this.f250743a.hashCode() * 31)) * 31)) * 31;
        j jVar = this.d;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.f250738a.hashCode())) * 31;
        AppTipUIModel appTipUIModel = this.e;
        int iHashCode3 = (iHashCode2 + (appTipUIModel == null ? 0 : appTipUIModel.hashCode())) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f;
        return iHashCode3 + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0);
    }
}
