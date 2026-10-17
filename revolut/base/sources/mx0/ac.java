package mx0;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mx0.xb;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class ac extends kotlin.jvm.internal.q implements Function0 {
    public final /* synthetic */ xb f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zb f209587g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(xb xbVar, zb zbVar) {
        super(0, kotlin.jvm.internal.s.class, "hideWithDelayIfNeeded", "show$lambda$0$hideWithDelayIfNeeded(Lcom/revolut/core/ui_kit/views/StatusBarBannerView;Lcom/revolut/core/ui_kit/views/StatusBarBannerView$Configuration;)V", 0);
        this.f = xbVar;
        this.f209587g = zbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Handler handler;
        xb.a aVar = xb.Companion;
        xb xbVar = this.f;
        Handler handler2 = xbVar.getHandler();
        androidx.view.d dVar = xbVar.f210116h;
        if (handler2 != null) {
            handler2.removeCallbacks(dVar);
        }
        zb zbVar = this.f209587g;
        if (zbVar.d != null && (handler = xbVar.getHandler()) != null) {
            handler.postDelayed(dVar, zbVar.d.longValue());
        }
        return Unit.f186387a;
    }
}
