package ip0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.core.os.HandlerCompat;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RadialSliderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$State;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f166919b;

    public /* synthetic */ w10(Object obj2, int i) {
        this.f166918a = i;
        this.f166919b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        int iH;
        int i = this.f166918a;
        Object obj2 = this.f166919b;
        switch (i) {
            case 0:
                ActionsView.Item item = (ActionsView.Item) it8;
                Intrinsics.checkNotNullParameter(item, "item");
                return new x10((com.revolut.core.ui_kit.delegates.sa) obj2, item);
            case 1:
                ActionsView.Item item2 = (ActionsView.Item) it8;
                ResourceImage resourceImage = PlanWidgetDelegate.f;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new com.revolut.core.ui_kit.delegates.gb((PlanWidgetDelegate.Model) obj2, item2);
            case 2:
                String listId = (String) it8;
                Color.Solid solid = ProgressStepHorizontalV2Delegate.d;
                Intrinsics.checkNotNullParameter(listId, "listId");
                for (h40 h40Var : ((a40) obj2).f163384b) {
                    if (Intrinsics.f(h40Var.f164504a, listId)) {
                        return h40Var;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                com.revolut.core.ui_kit.delegates.ed edVar = (com.revolut.core.ui_kit.delegates.ed) obj2;
                Intrinsics.checkNotNullParameter((Configuration) it8, "it");
                koi.j jVar = edVar.e;
                PromptContentDelegate.Model model = jVar instanceof PromptContentDelegate.Model ? (PromptContentDelegate.Model) jVar : null;
                PromptContentDelegate.Model.b bVar = model != null ? model.e : null;
                if (bVar instanceof com.revolut.core.ui_kit.delegates.ad) {
                    edVar.I((com.revolut.core.ui_kit.delegates.ad) bVar);
                }
                return Unit.f186387a;
            case 4:
                q60 q60Var = (q60) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return q60Var;
            case 5:
                ((PromptMarketingContentDelegate) obj2).d.onNext((ty0.a) it8);
                return Unit.f186387a;
            case 6:
                com.revolut.core.ui_kit.delegates.rd rdVar = (com.revolut.core.ui_kit.delegates.rd) obj2;
                Intrinsics.checkNotNullParameter((Configuration) it8, "it");
                koi.j jVar2 = rdVar.e;
                PromptMarketingContentDelegate.Model model2 = jVar2 instanceof PromptMarketingContentDelegate.Model ? (PromptMarketingContentDelegate.Model) jVar2 : null;
                if (model2 == null) {
                    return Unit.f186387a;
                }
                rdVar.J(model2);
                rdVar.H();
                rdVar.I();
                return Unit.f186387a;
            case 7:
                Integer num = (Integer) it8;
                num.intValue();
                ((RadialSliderDelegate) obj2).f53138c.onNext(num);
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return new u70((y70) obj2);
            case 9:
                com.revolut.core.ui_kit.delegates.ge geVar = (com.revolut.core.ui_kit.delegates.ge) obj2;
                w10 w10Var = geVar.f54218g;
                if (w10Var != null) {
                    w10Var.invoke(Integer.valueOf(geVar.getBindingAdapterPosition()));
                }
                return Unit.f186387a;
            case 10:
                Integer num2 = (Integer) it8;
                num2.getClass();
                hsa.l lVar = ((com.revolut.core.ui_kit.delegates.he) obj2).k;
                if (lVar != null) {
                    lVar.invoke(num2);
                }
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter(it8, "it");
                return efm.r.create(new e30((cc0) obj2, 18));
            case 12:
                com.revolut.core.ui_kit.delegates.fg fgVar = (com.revolut.core.ui_kit.delegates.fg) obj2;
                MotionEvent motionEvent = (MotionEvent) it8;
                Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    fgVar.f.getHandler().removeCallbacksAndMessages(fgVar);
                    ValueAnimator valueAnimator = fgVar.i;
                    if (valueAnimator != null) {
                        valueAnimator.pause();
                    }
                    fgVar.f.stopScroll();
                } else if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                    fgVar.f.getHandler().removeCallbacksAndMessages(Long.valueOf(fgVar.getItemId()));
                    Handler handler = fgVar.f.getHandler();
                    Intrinsics.checkNotNullExpressionValue(handler, "getHandler(...)");
                    HandlerCompat.postDelayed(handler, new gc0(fgVar, 0), Long.valueOf(fgVar.getItemId()), 600L);
                }
                return Unit.f186387a;
            case 13:
                ihm.f fVar = ((ScrollerDelegate) obj2).f53280g;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 14:
                com.revolut.core.ui_kit.delegates.ig igVar = (com.revolut.core.ui_kit.delegates.ig) obj2;
                Intrinsics.checkNotNullParameter((Configuration) it8, "it");
                koi.j jVar3 = igVar.e;
                com.revolut.core.ui_kit.delegates.hg hgVar = jVar3 instanceof com.revolut.core.ui_kit.delegates.hg ? (com.revolut.core.ui_kit.delegates.hg) jVar3 : null;
                if (hgVar != null && igVar.f54304s != (iH = igVar.H(hgVar.f54248c, hgVar.k))) {
                    igVar.F(iH, hgVar.d, hgVar.f, hgVar.u, hgVar.f54251j, hgVar.f54247b, hgVar.f54250h);
                    return Unit.f186387a;
                }
                return Unit.f186387a;
            case 15:
                SearchButtonDelegate.Model model3 = (SearchButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return model3;
            case 16:
                SmartTileExchangeDelegate.Model model4 = (SmartTileExchangeDelegate.Model) obj2;
                SmartTileExchangeDelegate.Companion aVar = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return model4;
            case 17:
                SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return model5;
            case 18:
                ui0 ui0Var = (ui0) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return ui0Var;
            case 19:
                sk0 mode = (sk0) it8;
                Intrinsics.checkNotNullParameter(mode, "mode");
                return new ok0(((com.revolut.core.ui_kit.delegates.ci) obj2).f54002a, mode);
            case 20:
                ((bl0) obj2).f163626l.setShapeAppearanceModel((ShapeAppearanceModel) it8);
                return Unit.f186387a;
            case 21:
                VaultsProgressDelegate.Model model6 = (VaultsProgressDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return model6;
            case 22:
                com.revolut.core.ui_kit.delegates.dj djVar = (com.revolut.core.ui_kit.delegates.dj) obj2;
                Context context = djVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i2 = ix0.s0.d((Drawable) it8, context, aw0.s8.DEFAULT).f10611c;
                djVar.f54068x = Integer.valueOf(i2);
                ((GradientDrawable) djVar.F.getValue()).setColors(new int[]{i2, 0});
                djVar.V();
                djVar.H(new lo0((LayerDrawable) djVar.G.getValue()));
                return Unit.f186387a;
            case 23:
                tq0.c clickData = (tq0.c) it8;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f273449a.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new sp0((up0) obj2, ((Integer) obj3).intValue());
            case 24:
                Pair pair = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                el4.f fVar2 = (el4.f) pair.f186385a;
                List list = (List) pair.f186386b;
                AdditionalCardsCardholderDetailsScreenContract$InputData additionalCardsCardholderDetailsScreenContract$InputData = ((ip4.l) obj2).f167660p;
                return new ip4.e(additionalCardsCardholderDetailsScreenContract$InputData.f69007c, additionalCardsCardholderDetailsScreenContract$InputData.f69005a, fVar2, list);
            case 25:
                iqf.a update = (iqf.a) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return iqf.a.a(update, null, (krf.c) obj2, null, 11);
            case 26:
                iqh.i update2 = (iqh.i) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Set set = update2.f167859b;
                String str = ((yph.i) obj2).f315901b;
                return iqh.i.a(update2, set.contains(str) ? zhm.a1.j(set, str) : zhm.a1.m(set, str));
            case 27:
                Identifier.Phone phone = (Identifier.Phone) ((Identifier) obj2);
                return SignUpFlowContract$State.a((SignUpFlowContract$State) it8, null, new RevolutSsoApi$SignUpOutputData$Authenticated$Method.Phone(phone.f106151b, phone.f106150a, phone.f106152c), 1);
            case 28:
                NaviCommand command = (NaviCommand) it8;
                Intrinsics.checkNotNullParameter(command, "command");
                ((ir9.c) obj2).f168025a.c(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), command));
                return Boolean.TRUE;
            default:
                NaviCommand naviCommand = (NaviCommand) it8;
                sri.m mVar = ((ir9.g) obj2).f168031a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
        }
    }
}
