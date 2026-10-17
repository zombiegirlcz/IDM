package b0;

import android.app.Activity;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import androidx.camera.core.CameraX;
import androidx.recyclerview.widget.LinearLayoutManager;
import cmi.u;
import cmi.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.pay.Pay;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.TooltipView;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11498b;

    public /* synthetic */ b(Context context, int i) {
        this.f11497a = i;
        this.f11498b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f11497a;
        int i2 = 6;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = 0;
        Context context = this.f11498b;
        switch (i) {
            case 0:
                return CameraX.lambda$new$0(context);
            case 1:
                return new ep0.q(context);
            case 2:
                return new ep0.q(context);
            case 3:
                return Integer.valueOf(kli.a.k(context, 64.0f));
            case 4:
                RevolutAccountsManagerContentProvider.a aVar = RevolutAccountsManagerContentProvider.Companion;
                return new nn0.a(context);
            case 5:
                RevolutAccountsManagerContentProvider.a aVar2 = RevolutAccountsManagerContentProvider.Companion;
                sg0.c.Companion.getClass();
                return new th0.k(context, sg0.b.f262576b);
            case 6:
                BottomExpandableDialogView.Companion aVar3 = BottomExpandableDialogView.INSTANCE;
                return Integer.valueOf(kli.a.w(R$attr.uikit_dp16, context));
            case 7:
                int i5 = OrderBookChartView.f57430g;
                return Integer.valueOf(kli.a.k(context, 12.0f));
            case 8:
                int i6 = OrderBookChartView.f57430g;
                return new TooltipView(context, objArr == true ? 1 : 0, i2, i3);
            case 9:
                phm.a aVar4 = (phm.a) j6.a.i(context, ite.a.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return ((ite.a) aVar5.b()).b();
                }
                throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
            case 10:
                Object objI = ue0.e.i(ue0.e.j(context), emi.a.class);
                emi.a aVar6 = objI instanceof emi.a ? (emi.a) objI : null;
                if (aVar6 == null) {
                    return null;
                }
                z zVar = (z) aVar6.f127665h.get();
                CoroutineScope coroutineScopeA = aVar6.e.a();
                s.j(coroutineScopeA);
                return new u(zVar, coroutineScopeA);
            case 11:
                WebPortalLoadingView.Companion companion = WebPortalLoadingView.INSTANCE;
                return new LinearLayoutManager(context);
            case 12:
                return context instanceof Activity ? Pay.getClient((Activity) context) : Pay.getClient(context);
            case 13:
                return new tn0.b(context);
            case 14:
                return new gl0.b(context);
            case 15:
                int i21 = ht0.p.k;
                return Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
            case 16:
                int i22 = ht0.p.k;
                Paint paint = new Paint(1);
                float fL = kli.a.l(context, 1.5f);
                Path path = new Path();
                path.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fL, Path.Direction.CCW);
                paint.setStyle(Paint.Style.STROKE);
                paint.setPathEffect(new PathDashPathEffect(path, fL * 4, BitmapDescriptorFactory.HUE_RED, PathDashPathEffect.Style.ROTATE));
                return paint;
            case 17:
                int i32 = ht0.p.k;
                return Integer.valueOf(kli.a.k(context, 56.0f));
            case 18:
                TrendView.Companion companion2 = TrendView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 16.0f));
            case 19:
                TrendView.Companion companion3 = TrendView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 40.0f));
            case 20:
                TrendView.Companion companion4 = TrendView.INSTANCE;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(kli.a.w(R$attr.uikit_dp12, context));
                return textPaint;
            case 21:
                TrendView.Companion companion5 = TrendView.INSTANCE;
                return new TooltipView(context, objArr2 == true ? 1 : 0, i2, i3);
            case 22:
                Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                paintC.setStyle(Paint.Style.STROKE);
                paintC.setStrokeCap(Paint.Cap.ROUND);
                paintC.setPathEffect(new DashPathEffect(new float[]{kli.a.k(context, 2.0f), kli.a.k(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED));
                return paintC;
            case 23:
                MultiTargetFanChartView.Companion aVar7 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 8.0f));
            case 24:
                MultiTargetFanChartView.Companion aVar8 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 12.0f));
            case 25:
                MultiTargetFanChartView.Companion aVar9 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 4.0f));
            case 26:
                MultiTargetFanChartView.Companion aVar10 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 4.0f));
            case 27:
                MultiTargetFanChartView.Companion aVar11 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 1.0f));
            case 28:
                MultiTargetFanChartView.Companion aVar12 = MultiTargetFanChartView.INSTANCE;
                return new DashPathEffect(new float[]{kli.a.k(context, 2.0f), kli.a.k(context, 3.0f)}, BitmapDescriptorFactory.HUE_RED);
            default:
                MultiTargetFanChartView.Companion aVar13 = MultiTargetFanChartView.INSTANCE;
                return Float.valueOf(kli.a.k(context, 8.0f));
        }
    }
}
