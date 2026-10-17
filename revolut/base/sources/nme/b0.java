package nme;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f217283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final itb.a f217284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jme.c f217285c;
    public final List d;
    public final boolean e;
    public final SmallActionButtonDelegate.Model f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f217286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NavBarMessage f217287h;

    public b0(ArrayList items, itb.a profileAvatar, jme.c headerContent, List menuItems, boolean z, SmallActionButtonDelegate.Model model, boolean z3, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profileAvatar, "profileAvatar");
        Intrinsics.checkNotNullParameter(headerContent, "headerContent");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f217283a = items;
        this.f217284b = profileAvatar;
        this.f217285c = headerContent;
        this.d = menuItems;
        this.e = z;
        this.f = model;
        this.f217286g = z3;
        this.f217287h = navBarMessage;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof b0)) {
            return null;
        }
        b0 b0Var = (b0) oldState;
        jme.c cVar = b0Var.f217285c;
        boolean z12 = true;
        boolean z29 = !Intrinsics.f(b0Var.f217284b, this.f217284b);
        jme.c cVar2 = this.f217285c;
        boolean z31 = !Intrinsics.f(cVar, cVar2);
        if (cVar.getClass() != cVar2.getClass()) {
            z = true;
        } else {
            z = true;
            z12 = false;
        }
        boolean zF = Intrinsics.f(b0Var.d, this.d) ^ z;
        if (b0Var.e != this.e) {
            z3 = z;
            z4 = z29;
            z6 = z31;
            z11 = z3;
        } else {
            z3 = z;
            z4 = z29;
            z6 = z31;
            z11 = false;
        }
        return new a0(z4, z6, z12, zF, z11, Intrinsics.f(b0Var.f, this.f) ^ z3, b0Var.f217286g != this.f217286g ? z3 : false, Intrinsics.f(b0Var.f217287h, this.f217287h) ^ z3);
    }

    @Override // cli.p
    public final List c() {
        return this.f217283a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f217283a.equals(b0Var.f217283a) && Intrinsics.f(this.f217284b, b0Var.f217284b) && Intrinsics.f(this.f217285c, b0Var.f217285c) && Intrinsics.f(this.d, b0Var.d) && this.e == b0Var.e && Intrinsics.f(this.f, b0Var.f) && this.f217286g == b0Var.f217286g && Intrinsics.f(this.f217287h, b0Var.f217287h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d((this.f217285c.hashCode() + ((this.f217284b.f168357a.hashCode() + (this.f217283a.hashCode() * 31)) * 31)) * 31, 31, this.d), 961, this.e);
        SmallActionButtonDelegate.Model model = this.f;
        int iC2 = j6.a.c((iC + (model == null ? 0 : model.hashCode())) * 31, 31, this.f217286g);
        NavBarMessage navBarMessage = this.f217287h;
        return iC2 + (navBarMessage != null ? navBarMessage.hashCode() : 0);
    }
}
