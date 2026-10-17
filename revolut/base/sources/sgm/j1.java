package sgm;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.rd.PageIndicatorView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f262920b;

    public /* synthetic */ j1(Object obj2, int i) {
        this.f262919a = i;
        this.f262920b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        int i = this.f262919a;
        Continuation continuation = null;
        int i2 = 1;
        Object obj2 = this.f262920b;
        switch (i) {
            case 0:
                k1 k1Var = (k1) obj2;
                try {
                    k1Var.f262950a.onComplete();
                    return;
                } finally {
                    k1Var.d.dispose();
                }
            case 1:
                ((l6) obj2).f262984c.dispose();
                return;
            case 2:
                ((a7) obj2).d();
                return;
            case 3:
                ((tg.l) obj2).sendEmptyMessage(1);
                return;
            case 4:
                tji.d dVar = (tji.d) obj2;
                int i3 = dVar.f271784c;
                if (i3 > 1) {
                    dVar.f271784c = i3 - 1;
                    return;
                }
                dVar.f271784c = 0;
                tji.n nVar = dVar.d;
                if (nVar != null) {
                    nVar.dismiss();
                }
                dVar.d = null;
                return;
            case 5:
                tkm.f.a((skm.l) obj2);
                return;
            case 6:
                ug.c cVar = (ug.c) ((em.a) obj2);
                GoogleMap googleMap = (GoogleMap) cVar.f127555a;
                if (googleMap != null) {
                    googleMap.setOnInfoWindowClickListener(cVar);
                    googleMap.setOnInfoWindowLongClickListener(cVar);
                    googleMap.setOnMarkerClickListener(cVar);
                    googleMap.setOnMarkerDragListener(cVar);
                    googleMap.setInfoWindowAdapter(cVar);
                    return;
                }
                return;
            case 7:
                PageIndicatorView pageIndicatorView = (PageIndicatorView) obj2;
                ((mp.p) pageIndicatorView.f50256a.f278952a).m().getClass();
                pageIndicatorView.animate().cancel();
                pageIndicatorView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(250L);
                return;
            case 8:
                ((vq0.j) obj2).invoke();
                return;
            case 9:
                wv0.d dVar2 = (wv0.d) obj2;
                InputConnection currentInputConnection = dVar2.getCurrentInputConnection();
                if (currentInputConnection != null) {
                    currentInputConnection.deleteSurroundingText(1, 0);
                }
                dVar2.f300256b.postDelayed(this, 50L);
                return;
            case 10:
                KProperty[] kPropertyArr = SetupBudgetController.X;
                ((SetupBudgetController) obj2).f3();
                return;
            case 11:
                com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a aVar = (com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) ((AdvancedChartsScreen) obj2).R2();
                cli.y yVar = aVar.f82081s;
                if (((y0b.f) ((vkm.j2) yVar.f22677a).getValue()).e) {
                    return;
                }
                aVar.H2(yVar, new y07.m(i2));
                return;
            case 12:
                ChatInputView chatInputView = (ChatInputView) obj2;
                chatInputView.setTranslationY(chatInputView.getMeasuredHeight());
                chatInputView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                chatInputView.animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setStartDelay(50L).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                return;
            case 13:
                CryptoSendWalletsListController cryptoSendWalletsListController = (CryptoSendWalletsListController) obj2;
                KProperty[] kPropertyArr2 = CryptoSendWalletsListController.V;
                cryptoSendWalletsListController.d3().f174538a.removeCallbacks(this);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) cryptoSendWalletsListController.e3();
                if (ue8.c.G(aVar2.o)) {
                    return;
                }
                aVar2.n2(new zp5.g(aVar2, continuation, i2), new whi.b(6));
                return;
            default:
                zxl.a aVar3 = (zxl.a) obj2;
                int i5 = zxl.a.d;
                if (aVar3.f326352c && (valueAnimator = aVar3.f326350a) != null) {
                    if (!valueAnimator.isStarted()) {
                        valueAnimator.start();
                        return;
                    } else {
                        if (valueAnimator.isPaused()) {
                            valueAnimator.resume();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public j1(vq0.j function) {
        this.f262919a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f262920b = function;
    }

    public j1(zxl.a aVar, zxl.a aVar2) {
        this.f262919a = 14;
        this.f262920b = aVar2;
    }
}
