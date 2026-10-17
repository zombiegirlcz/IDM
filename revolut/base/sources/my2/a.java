package my2;

import efm.b;
import efm.d0;
import h93.f0;
import jy2.j;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import okl.m;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a extends nri.a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f210298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s70.a f210299c;

    public a(ln.a navigationDispatcher, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f210298b = navigationDispatcher;
        this.f210299c = intentProvider;
    }

    @Override // jy2.j
    public b B0(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return m.w(null, null, null, 7, this.f210298b);
    }

    @Override // jy2.j
    public ufm.b J1(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        i.Companion.getClass();
        ufm.b bVarM = d0.m(i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // nri.a
    public void i3() {
    }
}
