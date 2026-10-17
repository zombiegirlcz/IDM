package mqi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import aw0.s8;
import aw0.x8;
import cli.y;
import com.revolut.core.ui_kit.internal.views.LimitProgressBar;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.ScratchView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.AmountInputView;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.CroppingLayoutView;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.FadingImageBackgroundLayout;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarCroppingAreaView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlowContract$Step;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeatureRating;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FinishCommand;
import d67.p;
import d67.q;
import d67.t;
import d67.u;
import ihm.f;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ix0.s0;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.e0;
import k4l.g;
import k50.b2;
import kel.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mk5.s;
import mth.r;
import mx0.d5;
import mx0.k1;
import mx0.w5;
import nii.y0;
import nii.z;
import od0.h;
import ot1.e;
import qt1.k;
import qt1.l;
import qt1.m;
import te0.w;
import tjg.c;
import tpi.i;
import tpi.j;
import vkm.j2;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f208004b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f208003a = i;
        this.f208004b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.revolut.retail.core.navigation.FinishCommand$Mode, java.lang.Integer, java.util.Map, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k4l.c cVar;
        g gVar;
        int iD;
        int i = this.f208003a;
        int i2 = 7;
        int i3 = 14;
        int i5 = 0;
        BigDecimal bigDecimal = 0;
        bigDecimal = 0;
        bigDecimal = 0;
        Object obj3 = this.f208004b;
        switch (i) {
            case 0:
                d dVar = (d) obj3;
                dVar.y();
                View currentFocus = dVar.f208008c.m2().getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                return Unit.f186387a;
            case 1:
                f fVar = ((mr9.a) obj3).f208084c;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 2:
                return LimitProgressBar.a((LimitProgressBar) obj3, ((Float) obj2).floatValue());
            case 3:
                return LinearGaugeChartView.a((LinearGaugeChartView) obj3, ((Float) obj2).floatValue());
            case 4:
                return ScratchView.c((ScratchView) obj3, (Unit) obj2);
            case 5:
                msb.a aVar = (msb.a) obj3;
                if (((tjg.c) obj2) instanceof c.C1515c) {
                    j jVar = aVar.f208642a;
                    if (jVar != null) {
                        ((i) jVar).W(true);
                    }
                } else {
                    j jVar2 = aVar.f208642a;
                    if (jVar2 != null) {
                        ((i) jVar2).Q();
                    }
                }
                return Unit.f186387a;
            case 6:
                msk.b bVar = (msk.b) obj3;
                od0.i insightAirTipOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(insightAirTipOptional, "insightAirTipOptional");
                d5d.a aVar2 = (d5d.a) insightAirTipOptional.f224257a;
                if (aVar2 == null) {
                    yj1.c cVar2 = new yj1.c(bVar.f208677a);
                    return nim.a.v(bVar.f208678b.a(cVar2), new s(bVar, cVar2, 27));
                }
                h hVar = od0.i.Companion;
                e5d.c cVar3 = new e5d.c(aVar2, "wealth_asset_details");
                hVar.getClass();
                return zi0.c.i(h.a(cVar3));
            case 7:
                com.revolut.feature.apm.bizum.impl.ui.transfer.flow.a aVar3 = (com.revolut.feature.apm.bizum.impl.ui.transfer.flow.a) obj3;
                ot1.h output = (ot1.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof e) {
                    BizumTransferInputData bizumTransferInputData = aVar3.f61622t;
                    aVar3.E2(new BizumTransferFlowContract$Step.Amount(new BizumTransferAmountContract$InputData.WithTransferData(bizumTransferInputData.f61561a, bizumTransferInputData.f61562b, ((e) output).f229399a)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                } else if (output instanceof ot1.g) {
                    ot1.g gVar2 = (ot1.g) output;
                    b3a.a aVar4 = aVar3.u;
                    m mVar = gVar2.f229401a;
                    BizumContact bizumContact = gVar2.f229402b;
                    if (mVar instanceof l) {
                        aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(bigDecimal, bigDecimal, bigDecimal, i2), ((v3a.b) aVar4).e(((l) mVar).f248927a, new ChatTransferRecipient.ApmTransferRecipient(bizumContact)))));
                    } else {
                        if (!(mVar instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(bigDecimal, bigDecimal, bigDecimal, i2), ((v3a.b) aVar4).b(new ChatTransferRecipient.ApmTransferRecipient(bizumContact)))));
                    }
                } else {
                    if (!(output instanceof ot1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.I2();
                }
                return Unit.f186387a;
            case 8:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List listK = v.k(r.a(((mth.i) obj3).f208830a, true), new gu("DOCUMENT_LIST_LOADING_SUB_HEADER_LIST_ID", R$attr.uikit_dp24, 0, 28));
                nb0 nb0Var = pb0.Companion;
                List listK2 = v.k(nb0.a(nb0Var, "ROW_LOADING_DELEGATE_MODEL_0", false, 6), nb0.a(nb0Var, "ROW_LOADING_DELEGATE_MODEL_1", false, 6));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return i2b.a.o(listK, listK2);
            case 9:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((mtl.r) obj3).b();
            case 10:
                com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a aVar5 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) obj3;
                oug.g outputData = (oug.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof oug.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar = aVar5.f94950q;
                ?? r3 = ((mug.e) ((j2) yVar.f22677a).getValue()).f209027b;
                oug.f fVar2 = (oug.f) outputData;
                AccountClosureFeedbackFeature accountClosureFeedbackFeature = fVar2.f229873a;
                AccountClosureFeatureRating accountClosureFeatureRating = (AccountClosureFeatureRating) r3.get(accountClosureFeedbackFeature);
                if (accountClosureFeatureRating == null) {
                    throw new IllegalStateException("Cannot find commented feature");
                }
                LinkedHashMap linkedHashMapZ = r0.z(((mug.e) ((j2) yVar.f22677a).getValue()).f209027b);
                linkedHashMapZ.put(accountClosureFeedbackFeature, new AccountClosureFeatureRating(accountClosureFeatureRating.f94855a, fVar2.f229874b));
                aVar5.H2(yVar, new awk.j(linkedHashMapZ, i3));
                return Unit.f186387a;
            case 11:
                e0 e0Var = (e0) obj3;
                n stockHolding = (n) obj2;
                Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
                if (e0Var != null && (cVar = e0Var.f180960m) != null && (gVar = cVar.e) != null) {
                    bigDecimal = gVar.f180970c;
                }
                return new mul.e(stockHolding, bigDecimal);
            case 12:
                com.revolut.feature.kyc.impl.external.web.flow.a aVar6 = (com.revolut.feature.kyc.impl.external.web.flow.a) obj3;
                u outputData2 = (u) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof t) {
                    aVar6.C2(us8.a.f282836a);
                } else {
                    if (!(outputData2 instanceof d67.s) && !(outputData2 instanceof p) && !(outputData2 instanceof q) && !(outputData2 instanceof d67.r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("ExternalWebKyc has unexpected type: " + outputData2);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 13:
                ev9.a aVar7 = (ev9.a) obj3;
                List messages = (List) obj2;
                Intrinsics.checkNotNullParameter(messages, "messages");
                return w.h((!messages.isEmpty() || aVar7 == ev9.a.LOCAL) ? new Data(messages, null, false, 6, null) : new Data(null, null, true, 3, null));
            case 14:
                com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a aVar8 = (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i6 = 26;
                aVar8.l2(new mkk.q(result, aVar8, bigDecimal, i6), new yi5.b(i6));
                return Unit.f186387a;
            case 15:
                mvj.b bVar2 = (mvj.b) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                yji.l.b1(bVar2, bVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, 7);
                return Boolean.TRUE;
            case 16:
                mw7.b params = (mw7.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (com.revolut.feature.insurance_home.impl.data.model.f) ((mw7.c) obj3).f209403a.get(params.a());
            case 17:
                b2 b2Var = (b2) obj3;
                nwi.e output2 = (nwi.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof nwi.c) {
                    nwi.c cVar4 = (nwi.c) output2;
                    b2Var.invoke(cVar4.f219893b, Boolean.valueOf(cVar4.f219894c));
                } else {
                    if (!(output2 instanceof nwi.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b2Var.invoke(null, Boolean.valueOf(((nwi.d) output2).f219895a));
                }
                return Unit.f186387a;
            case 18:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, (osk.c) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554399);
            case 19:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (tsk.d) obj3, null, null, null, null, null, null, 33292287);
            case 20:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (xsk.c) obj3, null, null, null, null, null, 33030143);
            case 21:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, (zsk.a) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554303);
            case 22:
                mx0.a aVar9 = (mx0.a) obj3;
                ProfileCardModel.CircleActionButtonModel circleActionButtonModel = aVar9.i;
                if (circleActionButtonModel != null) {
                    py0.c cVar5 = new py0.c(circleActionButtonModel.f57918b);
                    Context context = aVar9.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    jh.d.f(context).n0().a(aVar9.d, circleActionButtonModel, cVar5);
                    Function1 function1 = aVar9.f209560a;
                    if (function1 != null) {
                        function1.invoke(circleActionButtonModel);
                    }
                }
                return Unit.f186387a;
            case 23:
                AmountInputView.Companion aVar10 = AmountInputView.INSTANCE;
                ((AmountInputView) obj3).setContentDescription((CharSequence) obj2);
                return Unit.f186387a;
            case 24:
                ColorDrawable colorDrawable = (ColorDrawable) obj3;
                BackgroundWallpaperView.Companion aVar11 = BackgroundWallpaperView.INSTANCE;
                int i21 = k1.f209787a[((x8) obj2).f10609a.ordinal()];
                if (i21 == 1) {
                    iD = io0.a.d(0.6f, -1);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iD = io0.a.d(0.6f, -16777216);
                }
                colorDrawable.setColor(iD);
                return Unit.f186387a;
            case 25:
                ty0.a it10 = (ty0.a) obj2;
                GlyphImage glyphImage = CenteredAmountView.G;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((CenteredAmountView) obj3).f58411j.onNext(it10);
                return Unit.f186387a;
            case 26:
                Drawable drawable = (Drawable) obj2;
                int i22 = CroppingLayoutView.f58490j;
                KeyEvent.Callback croppingAreaView$ui_kit_components_release = ((CroppingLayoutView) obj3).getCroppingAreaView$ui_kit_components_release();
                d5 d5Var = croppingAreaView$ui_kit_components_release instanceof d5 ? (d5) croppingAreaView$ui_kit_components_release : null;
                if (d5Var != null) {
                    ((NavBarCroppingAreaView) d5Var).f0(drawable);
                }
                return Unit.f186387a;
            case 27:
                ViewPager2 viewPager2 = (ViewPager2) obj3;
                int iIntValue = ((Integer) obj2).intValue();
                int i32 = DraggableTabsView.f58519q;
                if (viewPager2.getScrollState() != 1) {
                    viewPager2.setCurrentItem(iIntValue);
                }
                return Unit.f186387a;
            case 28:
                FadingImageBackgroundLayout fadingImageBackgroundLayout = (FadingImageBackgroundLayout) obj3;
                Drawable drawable2 = (Drawable) obj2;
                FadingImageBackgroundLayout.Companion aVar12 = FadingImageBackgroundLayout.INSTANCE;
                if (drawable2 == null) {
                    return Unit.f186387a;
                }
                Context context2 = fadingImageBackgroundLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fadingImageBackgroundLayout.f.setColor(s0.d(drawable2, context2, s8.DEFAULT).f);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.addUpdateListener(new w5(fadingImageBackgroundLayout, i5));
                valueAnimatorOfInt.start();
                fadingImageBackgroundLayout.f58543j = valueAnimatorOfInt;
                return Unit.f186387a;
            default:
                ty0.a it11 = (ty0.a) obj2;
                int i33 = FooterActionButtonView.k;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((FooterActionButtonView) obj3).i.onNext(it11);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(r rVar, mth.i iVar) {
        this.f208003a = 8;
        this.f208004b = iVar;
    }
}
