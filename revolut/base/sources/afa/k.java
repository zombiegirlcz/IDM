package afa;

import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListScreen;
import fmf.o0;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PocketsListScreen f3994b;

    public /* synthetic */ k(PocketsListScreen pocketsListScreen, int i) {
        this.f3993a = i;
        this.f3994b = pocketsListScreen;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3993a;
        int i2 = 3;
        PocketsListScreen pocketsListScreen = this.f3994b;
        switch (i) {
            case 0:
                o0 o0Var = new o0(pocketsListScreen.Q, pocketsListScreen.R.i, new k(pocketsListScreen, i2));
                phm.a aVar = (phm.a) ue0.e.j(pocketsListScreen.m2()).a().get(oda.o.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", oda.o.class, " is not found"));
                }
                oda.o oVar = ((oda.o) ((bfa.a) aVar2.b())).P;
                PocketsListContract$InputData pocketsListContract$InputData = pocketsListScreen.K;
                pocketsListContract$InputData.getClass();
                return new oda.m(oVar, pocketsListScreen, pocketsListContract$InputData, o0Var);
            case 1:
                KProperty[] kPropertyArr = PocketsListScreen.Y;
                return (h) ((oda.m) pocketsListScreen.S.getValue()).f224393l.get();
            case 2:
                KProperty[] kPropertyArr2 = PocketsListScreen.Y;
                PocketsListScreen pocketsListScreen2 = this.f3994b;
                return dli.f.a(pocketsListScreen2, pocketsListScreen2.R2(), zhm.v.k(pocketsListScreen2.U, new ListSubheaderDelegate(), pocketsListScreen2.V, new RowLoadingDelegate(), pocketsListScreen2.R, pocketsListScreen2.P, new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
            default:
                KProperty[] kPropertyArr3 = PocketsListScreen.Y;
                return ((dli.c) pocketsListScreen.X.getValue()).w().f;
        }
    }
}
