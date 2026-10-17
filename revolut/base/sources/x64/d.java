package x64;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import cli.y;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreenContract$InputData;
import dw3.c1;
import dw3.m0;
import dw3.n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CongratulationsContentScreen f303037b;

    public /* synthetic */ d(CongratulationsContentScreen congratulationsContentScreen, int i) {
        this.f303036a = i;
        this.f303037b = congratulationsContentScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f303036a;
        CongratulationsContentScreen congratulationsContentScreen = this.f303037b;
        switch (i) {
            case 0:
                ?? r06 = congratulationsContentScreen.R;
                df4.i iVar = congratulationsContentScreen.M;
                KProperty[] kPropertyArr = CongratulationsContentScreen.U;
                y yVar = ((c) congratulationsContentScreen.R2()).f303035r;
                if (!((j) ((j2) yVar.f22677a).getValue()).f303041c && !((j) ((j2) yVar.f22677a).getValue()).f303040b.getLoading()) {
                    c cVar = (c) congratulationsContentScreen.R2();
                    cVar.H2(cVar.f303035r, new x29.a(28));
                    RecyclerView recyclerViewH = ((dli.c) r06.getValue()).h();
                    NavBarLargeCentred navBarLargeCentredF3 = congratulationsContentScreen.f3();
                    iVar.getClass();
                    df4.i.a(navBarLargeCentredF3, recyclerViewH);
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(congratulationsContentScreen);
                    NavBarLargeCentred navBarLargeCentredF32 = congratulationsContentScreen.f3();
                    RecyclerView recyclerViewH2 = ((dli.c) r06.getValue()).h();
                    FrameLayout creditCongratulationLargeActionButtonContainer = congratulationsContentScreen.d3().f10684c;
                    Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButtonContainer, "creditCongratulationLargeActionButtonContainer");
                    d dVar = new d(congratulationsContentScreen, 4);
                    iVar.getClass();
                    df4.i.d(lifecycleScope, navBarLargeCentredF32, recyclerViewH2, creditCongratulationLargeActionButtonContainer, dVar);
                }
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = CongratulationsContentScreen.U;
                qji.b bVarU2 = congratulationsContentScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.di.CongratulationContentScreenInjector");
                n0 n0Var = (n0) bVarU2;
                c1 c1Var = n0Var.f119308c;
                n0 n0Var2 = n0Var.d;
                CongratulationsContentScreenContract$InputData congratulationsContentScreenContract$InputData = congratulationsContentScreen.L;
                congratulationsContentScreenContract$InputData.getClass();
                return new m0(c1Var, n0Var2, congratulationsContentScreen, congratulationsContentScreenContract$InputData);
            case 2:
                KProperty[] kPropertyArr3 = CongratulationsContentScreen.U;
                return (n) ((m0) congratulationsContentScreen.O.getValue()).f119232j.get();
            case 3:
                KProperty[] kPropertyArr4 = CongratulationsContentScreen.U;
                CongratulationsContentScreen congratulationsContentScreen2 = this.f303037b;
                return dli.f.a(congratulationsContentScreen2, congratulationsContentScreen2.R2(), d0.E0(u.c(congratulationsContentScreen2.S), ((m0) congratulationsContentScreen2.O.getValue()).c().Q()), R$id.creditCongratulation_recyclerView, null, null, null, 56);
            default:
                KProperty[] kPropertyArr5 = CongratulationsContentScreen.U;
                congratulationsContentScreen.f3().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
                return Unit.f186387a;
        }
    }
}
