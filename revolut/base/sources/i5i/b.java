package i5i;

import au6.k0;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import efm.r;
import g3e.s;
import hb4.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends pri.c implements p4i.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o5i.c f158839h;
    public final g i;

    public b(o5i.c presentationModel, g mapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f158839h = presentationModel;
        this.i = mapper;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.TransactionPriceDescription screen2 = (Screen.TransactionPriceDescription) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        if (a.f158838a[screen2.f97146a.ordinal()] != 1) {
            throw new IllegalStateException("Only TRADING_ORDER transaction type is supported, but type=" + screen2.f97146a);
        }
        String ref2 = screen2.f97147b.f104721c.f306286a;
        o5i.c cVar = this.f158839h;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        r rVarDistinctUntilChanged = m70.a.f(cVar.d.a(ref2, true), new n(this, screen2, 24), new s(26), new k0(this, 3)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
