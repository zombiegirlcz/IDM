package o9c;

import com.revolut.tracking.v3.RevolutPayBasicContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f223192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f223193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f223194c;
    public final String d;
    public final List e;
    public final RevolutPayBasicContext f;

    public f0(d0 navBar, q buttonData, List menuItems, String str, List items, RevolutPayBasicContext revolutPayBasicContext) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(buttonData, "buttonData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223192a = navBar;
        this.f223193b = buttonData;
        this.f223194c = menuItems;
        this.d = str;
        this.e = items;
        this.f = revolutPayBasicContext;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        f0 f0Var = oldState instanceof f0 ? (f0) oldState : null;
        if (f0Var == null) {
            return null;
        }
        return new e0(f0Var.f223192a.f223190c.getClass() != this.f223192a.f223190c.getClass());
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f223192a, f0Var.f223192a) && Intrinsics.f(this.f223193b, f0Var.f223193b) && Intrinsics.f(this.f223194c, f0Var.f223194c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f);
    }

    public final int hashCode() {
        int iD = p.a.d(ehe.n.c(this.f223193b.f223220a, this.f223192a.hashCode() * 31, 31), 31, this.f223194c);
        String str = this.d;
        int iD2 = p.a.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        RevolutPayBasicContext revolutPayBasicContext = this.f;
        return iD2 + (revolutPayBasicContext != null ? revolutPayBasicContext.hashCode() : 0);
    }
}
