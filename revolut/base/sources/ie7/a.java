package ie7;

import ai0.o;
import ai0.r;
import ai0.s;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.exoplayer.ExoPlayer;
import aw0.o9;
import be7.p;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.dj;
import com.revolut.core.ui_kit.delegates.h8;
import com.revolut.core.ui_kit.delegates.t8;
import com.revolut.core.ui_kit.delegates.y8;
import com.revolut.core.ui_kit.delegates.yi;
import com.revolut.core.ui_kit.delegates.zf;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownScreen;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlow;
import com.revolut.feature.three_ds_verification.api.ThreeDsVerificationApi$Toggles;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import h30.n;
import hw0.w;
import hw0.x;
import ip0.a60;
import ip0.ai;
import ip0.im0;
import ip0.jm0;
import ip0.pu;
import ip0.xf0;
import ip0.xw;
import ip0.yl0;
import ip0.zd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import ql7.z0;
import skm.e0;
import skm.p0;
import tr2.q;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160657b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f160656a = i;
        this.f160657b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w wVar;
        int i = this.f160656a;
        Object[] objArr = 0;
        Object obj2 = this.f160657b;
        switch (i) {
            case 0:
                CallNotificationService.Companion companion = CallNotificationService.INSTANCE;
                phm.a aVar = (phm.a) ue0.e.j((CallNotificationService) obj2).a().get(h30.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return (p) ((n) ((h30.a) aVar2.b())).Z.get();
                }
                throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
            case 1:
                return (igd.a) ((fgd.c) ((SharedAddAssetFlow) obj2).P.getValue()).d.get();
            case 2:
                int i2 = CryptoBalanceBreakdownScreen.V;
                return (ih5.b) ((hh5.a) ((CryptoBalanceBreakdownScreen) obj2).T.getValue()).f152253b.get();
            case 3:
                in0.d dVar = (in0.d) obj2;
                CoroutineScope coroutineScope = dVar.d;
                p0 p0Var = p0.f264001a;
                e0.C(coroutineScope, elm.f.f127540b, null, new in0.c(dVar, objArr == true ? 1 : 0, 3), 2);
                return Unit.f186387a;
            case 4:
                ip.b bVar = (ip.b) obj2;
                return new gwl.d((gte.a) bVar.f163349a.getValue(), (zm0.b) bVar.f163350b.getValue(), (k70.a) bVar.e.getValue(), bVar.d, bVar.f163351c, bVar.f);
            case 5:
                return (ImageView) obj2;
            case 6:
                zi0.c.g(((ai) obj2).f163450h, new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorBlack_30), null));
                return Unit.f186387a;
            case 7:
                return (FadeBottomImageView) obj2;
            case 8:
                List list = ((LinearProgressWithAmountDelegate.Model) obj2).f52678j.f54089a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(Float.valueOf((r3.f54235a / 100.0f) * ((h8) it8.next()).f54236b));
                }
                return Float.valueOf(d0.S0(arrayList));
            case 9:
                return Float.valueOf(((Number) ((Lazy) obj2).getValue()).floatValue());
            case 10:
                return (AppCompatImageView) obj2;
            case 11:
                Context context = ((t8) obj2).f.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new PorterDuffColorFilter(kli.a.s(com.revolut.core.ui_kit.R$attr.uikit_colorOverlayFill, context), PorterDuff.Mode.SRC_ATOP);
            case 12:
                LayerDrawable layerDrawable = new LayerDrawable(new ColorDrawable[]{((pu) obj2).H});
                layerDrawable.setLayerGravity(0, 80);
                return layerDrawable;
            case 13:
                y8 y8Var = (y8) obj2;
                MapPlainDelegate mapPlainDelegate = y8Var.u;
                if (y8Var.f55631m == null) {
                    if (mapPlainDelegate.e == null) {
                        Intrinsics.r("mapServices");
                        throw null;
                    }
                    Context applicationContext = y8Var.itemView.getContext().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    ((o) mapPlainDelegate.i.getValue()).getClass();
                    GoogleMapOptions internal = new GoogleMapOptions();
                    Intrinsics.checkNotNullParameter(internal, "internal");
                    GoogleMapOptions googleMapOptionsLiteMode = internal.liteMode(true);
                    Intrinsics.checkNotNullExpressionValue(googleMapOptionsLiteMode, "liteMode(...)");
                    r rVarA = s.a(applicationContext, new ai0.n(googleMapOptionsLiteMode));
                    y8Var.f55631m = rVarA;
                    int i3 = R$id.internal_mapPlain_mapView;
                    Intrinsics.checkNotNullParameter(rVarA, "<this>");
                    rVarA.setId(i3);
                    rVarA.onCreate(null);
                    rVarA.a(new xw(y8Var));
                    if (!y8Var.f55632n) {
                        y8Var.F().addView(rVarA);
                    }
                    rVarA.setClickable(false);
                    y8Var.F().setClickable(false);
                    y8Var.f.a();
                }
                return Unit.f186387a;
            case 14:
                Context context2 = ((a60) obj2).itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return context2;
            case 15:
                RowDelegate.Companion companion2 = RowDelegate.INSTANCE;
                ((SmallActionButton) obj2).getGlowHighlightManager().c();
                return Unit.f186387a;
            case 16:
                return (CutoutImageView) obj2;
            case 17:
                return ((zf) obj2).f55703r;
            case 18:
                sp0.e eVar = (sp0.e) obj2;
                return zd0.a(zd0.g(eVar, 1.0f, BitmapDescriptorFactory.HUE_RED, 300L, 0L), zd0.k(eVar, 1.0f, 0.6f, new FastOutSlowInInterpolator()));
            case 19:
                ((xf0) obj2).f167165r.b0();
                return Unit.f186387a;
            case 20:
                UiKitPlayerView uiKitPlayerView = ((yl0) obj2).f167335g;
                uiKitPlayerView.m();
                jv0.i iVar = uiKitPlayerView.f57717t;
                iVar.a();
                if (uiKitPlayerView.getExternalMediaRegistry() != null) {
                    ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
                    if (exoPlayer != null) {
                        exoPlayer.stop();
                    }
                } else {
                    uiKitPlayerView.k();
                }
                iVar.onPlayWhenReadyChanged(false, 1);
                uiKitPlayerView.k();
                return Unit.f186387a;
            case 21:
                jm0 jm0Var = (jm0) obj2;
                aim.e eVarB = u.b();
                eVarB.addAll(jm0Var.f);
                x xVar = jm0Var.e;
                if (xVar != null) {
                    eVarB.add(xVar);
                }
                List list2 = jm0Var.f164889q;
                int size = list2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    hw0.u uVar = (hw0.u) list2.get(i5);
                    float f = uVar.f156020a;
                    int i6 = im0.f164715a[uVar.f156021b.ordinal()];
                    if (i6 == 1) {
                        wVar = w.HAIRLINE_DASH;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wVar = w.HAIRLINE;
                    }
                    eVarB.add(new x(f, f, null, null, null, null, false, false, wVar, 508));
                }
                return u.a(eVarB);
            case 22:
                yi yiVar = (yi) obj2;
                Clause clause = yiVar.f55655b;
                MoneyClause moneyClause = yiVar.f55654a;
                return clause != null ? new CompositeClause(v.k(clause, moneyClause), new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : moneyClause;
            case 23:
                LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{(GradientDrawable) ((dj) obj2).D.getValue()});
                layerDrawable2.setLayerGravity(0, 80);
                return layerDrawable2;
            case 24:
                KProperty[] kPropertyArr = PlanOptionsScreen.f75595d0;
                return (ip7.j) ((z0) ((PlanOptionsScreen) obj2).Y.getValue()).f247549c.get();
            case 25:
                KProperty[] kPropertyArr2 = BaseLayoutBuilderFragment.f98556e0;
                return ((BaseLayoutBuilderFragment) obj2).F();
            case 26:
                KProperty[] kPropertyArr3 = SelectPaymentToBlockScreen.f64258d0;
                return (is2.i) ((q) ((SelectPaymentToBlockScreen) obj2).X.getValue()).k.get();
            case 27:
                return Boolean.valueOf(((jte.d) ((com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.c) obj2).f64277c).c(TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked.f91958c));
            case 28:
                return Boolean.valueOf(((jte.d) ((com.revolut.feature.three_ds_verification.impl.ui.sceen.g) obj2).e).c(ThreeDsVerificationApi$Toggles.ThreeDsVerificationRedesign.f90392c));
            default:
                BaseQuestionScreen baseQuestionScreen = (BaseQuestionScreen) obj2;
                KProperty[] kPropertyArr4 = BaseQuestionScreen.O;
                return dli.f.a(baseQuestionScreen, baseQuestionScreen.e3(), baseQuestionScreen.f3(), 0, null, null, null, 60);
        }
    }
}
