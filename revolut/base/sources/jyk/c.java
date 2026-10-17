package jyk;

import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.FreeStocksDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f179462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f179463c;

    public /* synthetic */ c(g gVar, boolean z, int i) {
        this.f179461a = i;
        this.f179462b = gVar;
        this.f179463c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.b bVarB;
        switch (this.f179461a) {
            case 0:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    ufm.b bVarM = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                kotlinx.coroutines.d dVar = p0.f264003c;
                g gVar = this.f179462b;
                return new ufm.i(new ufm.i(te0.w.o0(dVar, new ji1.m(gVar, null, 19)), new jy2.a(new c(gVar, this.f179463c, 1), 6), 0), new jy2.a(new jud.d(gVar, 14), 7), 0);
            default:
                yzg.d it8 = (yzg.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i = e.f179468a[it8.f318105a.ordinal()];
                g gVar2 = this.f179462b;
                if (i == 1 || i == 2) {
                    bVarB = gVar2.b();
                } else if (i == 3) {
                    bVarB = efm.d0.m(u0.f(FreeStocksDestination.f104162a));
                    Intrinsics.checkNotNullExpressionValue(bVarB, "just(...)");
                } else {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVarB = efm.d0.m(DummyCommand.f98635a);
                    Intrinsics.checkNotNullExpressionValue(bVarB, "just(...)");
                }
                ufm.i iVar = new ufm.i(bVarB, new jy2.a(new jck.y(gVar2, this.f179463c, 6), 8), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
        }
    }
}
