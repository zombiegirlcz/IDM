package ueg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f279408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f279410c;
    public final u d;
    public final List e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f279411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f279412h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsContext f279413j;

    public o0(List items, List horizontalItems, l0 toolbarState, u bottomSheetState, List filters, z mapState, List toolbarMenu, boolean z, boolean z3, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(horizontalItems, "horizontalItems");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(toolbarMenu, "toolbarMenu");
        this.f279408a = items;
        this.f279409b = horizontalItems;
        this.f279410c = toolbarState;
        this.d = bottomSheetState;
        this.e = filters;
        this.f = mapState;
        this.f279411g = toolbarMenu;
        this.f279412h = z;
        this.i = z3;
        this.f279413j = analyticsContext;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        z zVar;
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof o0)) {
            return null;
        }
        o0 o0Var = (o0) oldState;
        z zVar2 = o0Var.f;
        boolean z4 = !o0Var.f279410c.equals(this.f279410c);
        if (o0Var.d != this.d) {
            zVar = zVar2;
            z = z4;
            z3 = true;
        } else {
            zVar = zVar2;
            z = z4;
            z3 = false;
        }
        boolean z6 = !Intrinsics.f(o0Var.e, this.e);
        x xVar = zVar.f279447a;
        z zVar3 = this.f;
        return new d0(z, z3, z6, !xVar.equals(zVar3.f279447a), !zVar.f279448b.equals(zVar3.f279448b), !Intrinsics.f(zVar.f279449c, zVar3.f279449c), !Intrinsics.f(o0Var.f279411g, this.f279411g), o0Var.f279412h != this.f279412h);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f279408a, o0Var.f279408a) && Intrinsics.f(this.f279409b, o0Var.f279409b) && Intrinsics.f(this.f279410c, o0Var.f279410c) && this.d == o0Var.d && Intrinsics.f(this.e, o0Var.e) && Intrinsics.f(this.f, o0Var.f) && Intrinsics.f(this.f279411g, o0Var.f279411g) && this.f279412h == o0Var.f279412h && this.i == o0Var.i && Intrinsics.f(this.f279413j, o0Var.f279413j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d((this.f.hashCode() + p.a.d((this.d.hashCode() + ((this.f279410c.hashCode() + p.a.d(this.f279408a.hashCode() * 31, 31, this.f279409b)) * 31)) * 31, 31, this.e)) * 31, 31, this.f279411g), 31, this.f279412h), 31, this.i);
        AnalyticsContext analyticsContext = this.f279413j;
        return iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
