package hea;

import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PocketDetailsScreen f151630b;

    public /* synthetic */ e(PocketDetailsScreen pocketDetailsScreen, int i) {
        this.f151629a = i;
        this.f151630b = pocketDetailsScreen;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f151629a;
        int i2 = 3;
        PocketDetailsScreen pocketDetailsScreen = this.f151630b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PocketDetailsScreen.f80841e0;
                PocketDetailsScreen pocketDetailsScreen2 = this.f151630b;
                return dli.f.a(pocketDetailsScreen2, pocketDetailsScreen2.d(), zhm.d0.E0(((fd6.a) ((oda.k) ((iea.a) pocketDetailsScreen2.c0.getValue())).f224373j.get()).e, zhm.v.k(pocketDetailsScreen2.S, pocketDetailsScreen2.T, pocketDetailsScreen2.V, pocketDetailsScreen2.W, pocketDetailsScreen2.Y, pocketDetailsScreen2.Z, pocketDetailsScreen2.R, pocketDetailsScreen2.O, new ActionWidgetLoadingDelegate(), pocketDetailsScreen2.f80842a0, pocketDetailsScreen2.P, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new ErrorWidgetDelegate())), R$id.recyclerView, null, null, null, 56);
            case 1:
                PocketDetailsScreen pocketDetailsScreen3 = this.f151630b;
                fmf.o0 o0Var = new fmf.o0(pocketDetailsScreen3.Q, pocketDetailsScreen3.R.i, new e(pocketDetailsScreen3, i2));
                qji.b bVarU2 = pocketDetailsScreen3.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.pocket_details.di.PocketDetailsScreenInjector");
                oda.l lVar = (oda.l) bVarU2;
                oda.o oVar = lVar.f224386c;
                oda.l lVar2 = lVar.d;
                PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = pocketDetailsScreen3.K;
                pocketDetailsScreenContract$InputData.getClass();
                return new oda.k(oVar, lVar2, new agk.c(), pocketDetailsScreen3, pocketDetailsScreenContract$InputData, o0Var);
            case 2:
                KProperty[] kPropertyArr2 = PocketDetailsScreen.f80841e0;
                return (p) ((oda.k) ((iea.a) pocketDetailsScreen.c0.getValue())).f224383x.get();
            default:
                KProperty[] kPropertyArr3 = PocketDetailsScreen.f80841e0;
                return ((dli.c) pocketDetailsScreen.f80843b0.getValue()).w().f;
        }
    }
}
