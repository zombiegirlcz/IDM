package b6i;

import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6i.e f12783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12785c;
    public final z5i.a d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f12786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OrderMode f12787h;
    public final int i;

    public h(s6i.e eVar, j inputPosition, l mode, z5i.a footer, boolean z, boolean z3, e buttonMode, OrderMode orderMode, int i) {
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        this.f12783a = eVar;
        this.f12784b = inputPosition;
        this.f12785c = mode;
        this.d = footer;
        this.e = z;
        this.f = z3;
        this.f12786g = buttonMode;
        this.f12787h = orderMode;
        this.i = i;
    }

    public static h a(h hVar, s6i.e eVar, j jVar, l lVar, z5i.a aVar, boolean z, boolean z3, e eVar2, OrderMode orderMode, int i, int i2) {
        if ((i2 & 1) != 0) {
            eVar = hVar.f12783a;
        }
        s6i.e eVar3 = eVar;
        if ((i2 & 2) != 0) {
            jVar = hVar.f12784b;
        }
        j inputPosition = jVar;
        if ((i2 & 4) != 0) {
            lVar = hVar.f12785c;
        }
        l mode = lVar;
        if ((i2 & 8) != 0) {
            aVar = hVar.d;
        }
        z5i.a footer = aVar;
        if ((i2 & 16) != 0) {
            z = hVar.e;
        }
        boolean z4 = z;
        boolean z6 = (i2 & 32) != 0 ? hVar.f : z3;
        e buttonMode = (i2 & 64) != 0 ? hVar.f12786g : eVar2;
        OrderMode orderMode2 = (i2 & 128) != 0 ? hVar.f12787h : orderMode;
        int i3 = (i2 & 256) != 0 ? hVar.i : i;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(orderMode2, "orderMode");
        return new h(eVar3, inputPosition, mode, footer, z4, z6, buttonMode, orderMode2, i3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f12783a, hVar.f12783a) && this.f12784b == hVar.f12784b && this.f12785c == hVar.f12785c && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f12786g, hVar.f12786g) && Intrinsics.f(this.f12787h, hVar.f12787h) && this.i == hVar.i;
    }

    public final int hashCode() {
        s6i.e eVar = this.f12783a;
        return Integer.hashCode(this.i) + ((this.f12787h.hashCode() + ((this.f12786g.hashCode() + j6.a.c(j6.a.c((this.d.hashCode() + ((this.f12785c.hashCode() + ((this.f12784b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31)) * 31);
    }
}
