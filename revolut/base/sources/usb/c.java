package usb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f282863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f282864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f282865c;
    public final boolean d;
    public final PocketInfo e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f282866g;

    public c(Clause selectedTargetClause, Image icon, boolean z, boolean z3, PocketInfo pocketInfo, xi0.b pocketCurrency, b currencyFormat) {
        Intrinsics.checkNotNullParameter(selectedTargetClause, "selectedTargetClause");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(currencyFormat, "currencyFormat");
        this.f282863a = selectedTargetClause;
        this.f282864b = icon;
        this.f282865c = z;
        this.d = z3;
        this.e = pocketInfo;
        this.f = pocketCurrency;
        this.f282866g = currencyFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282863a, cVar.f282863a) && Intrinsics.f(this.f282864b, cVar.f282864b) && this.f282865c == cVar.f282865c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f282866g == cVar.f282866g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(a10.b.c(this.f282864b, this.f282863a.hashCode() * 31, 31), 31, this.f282865c), 31, this.d);
        PocketInfo pocketInfo = this.e;
        return this.f282866g.hashCode() + h30.l.j(this.f, (iC + (pocketInfo == null ? 0 : pocketInfo.hashCode())) * 31, 31);
    }
}
