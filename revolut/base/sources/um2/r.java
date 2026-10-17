package um2;

import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f281215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f281216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f281217c;
    public final g d;
    public final ThemeCustomisationContract$SandboxAppearance e;

    public r(o navBar, j mainScroller, n menu, g buttons, ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(mainScroller, "mainScroller");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f281215a = navBar;
        this.f281216b = mainScroller;
        this.f281217c = menu;
        this.d = buttons;
        this.e = themeCustomisationContract$SandboxAppearance;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof r)) {
            return null;
        }
        r rVar = (r) oldState;
        return new q(!rVar.f281215a.equals(this.f281215a), !Intrinsics.f(rVar.f281216b, this.f281216b), !Intrinsics.f(rVar.f281217c, this.f281217c), !Intrinsics.f(rVar.e, this.e));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f281215a.equals(rVar.f281215a) && Intrinsics.f(this.f281216b, rVar.f281216b) && Intrinsics.f(this.f281217c, rVar.f281217c) && this.d.equals(rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f281217c.hashCode() + ((this.f281216b.hashCode() + (this.f281215a.hashCode() * 31)) * 31)) * 31)) * 31;
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = this.e;
        return iHashCode + (themeCustomisationContract$SandboxAppearance == null ? 0 : themeCustomisationContract$SandboxAppearance.hashCode());
    }
}
