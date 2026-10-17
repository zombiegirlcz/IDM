package ew2;

import android.content.Intent;
import android.graphics.Bitmap;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.card_add_to_googlepay.impl.credit_activation.GooglePayCreditActivationDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f130027b;

    public /* synthetic */ l(u uVar, int i) {
        this.f130026a = i;
        this.f130027b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        GooglePayCreditActivationDestination.Result result;
        switch (this.f130026a) {
            case 0:
                return this.f130027b.o.c0(b.f130005a);
            case 1:
                kpi.a it8 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                GooglePayCreditActivationDestination.Companion companion = GooglePayCreditActivationDestination.INSTANCE;
                int i = it8.f188246a;
                int i2 = it8.f188247b;
                Intent intent = it8.f188248c;
                if (intent != null) {
                    companion.getClass();
                    result = (GooglePayCreditActivationDestination.Result) intent.getParcelableExtra("GPAY_CREDIT_ACTIVATION_ARG");
                } else {
                    result = null;
                }
                companion.getClass();
                boolean z = i == 1024;
                boolean z3 = i2 == -1;
                u uVar = this.f130027b;
                if (z && z3 && (result instanceof GooglePayCreditActivationDestination.Result.ProceedWithGPay)) {
                    k kVar = uVar.i;
                    return kVar.i.c(kVar.j3());
                }
                int i3 = it8.f188246a;
                GooglePayCreditActivationDestination.Result result2 = intent != null ? (GooglePayCreditActivationDestination.Result) intent.getParcelableExtra("GPAY_CREDIT_ACTIVATION_ARG") : null;
                boolean z4 = i3 == 1024;
                boolean z6 = i2 == -1;
                if (z4 && z6 && (result2 instanceof GooglePayCreditActivationDestination.Result.ContinueWithout)) {
                    return uVar.o.c0(c.f130006a);
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Boolean bool = (Boolean) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                Data data = (Data) rVar.f314203c;
                od0.h hVar = od0.i.Companion;
                k kVar2 = this.f130027b.i;
                h93.f0 f0VarJ3 = kVar2.j3();
                al4.a aVar = (al4.a) iVar.g();
                v vVar = (v) kVar2.f130022b;
                te0.j jVar = vVar.f130057c;
                KProperty[] kPropertyArr = v.f130055j;
                boolean zBooleanValue = ((Boolean) jVar.getValue(vVar, kPropertyArr[1]).get()).booleanValue();
                Intrinsics.h(bool);
                boolean zBooleanValue2 = bool.booleanValue();
                v vVar2 = (v) kVar2.f130022b;
                boolean zBooleanValue3 = ((Boolean) vVar2.f130058g.getValue(vVar2, kPropertyArr[5]).get()).booleanValue();
                Bitmap bitmap = (Bitmap) data.getContent();
                n nVar = new n(f0VarJ3, zBooleanValue, zBooleanValue2, zBooleanValue3, bitmap != null ? new BitmapImage(bitmap, false, (ImageTransformations) null, 14) : null, aVar);
                hVar.getClass();
                return od0.h.a(nVar);
            case 3:
                od0.i uiModelParamsOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(uiModelParamsOptional, "uiModelParamsOptional");
                n nVar2 = (n) uiModelParamsOptional.f224257a;
                BitmapImage bitmapImage = nVar2 != null ? nVar2.e : null;
                u uVar2 = this.f130027b;
                k kVar3 = uVar2.i;
                if (nVar2 == null) {
                    kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                    m70.a.c(t0Var);
                    TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    return new PromptMarketingContentDelegate.Model("PROMPT_ID", textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.Q(bitmapImage), null, null, kVar3.k3(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072);
                }
                boolean z11 = nVar2.f130032b;
                boolean z12 = nVar2.d;
                h93.f0 f0Var = nVar2.f130031a;
                al4.a aVar2 = nVar2.f;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z12 ? R$string.card_reactivation_add_to_google_pay_title : (z11 && f0Var != null && f0Var.v) ? R$string.card_apple_wallet_virtual_post_activation_short_us_title : aVar2 == al4.a.LOCAL_DEBIT ? R$string.card_gpay_local_debit_title : aVar2 == al4.a.GLOBAL_DEBIT ? R$string.card_gpay_global_title : aVar2 == al4.a.COMBO ? R$string.card_gpay_combo_title : (f0Var == null || !f0Var.T) ? (f0Var == null || !f0Var.Y()) ? (f0Var == null || !f0Var.C()) ? nVar2.f130033c ? R$string.card_add_to_gpay_screen_prepaid_title : R$string.card_add_to_gpay_screen_title : R$string.card_add_to_gpay_screen_credit_title : R$string.card_add_to_gpay_screen_standard_virtual_title : R$string.card_add_to_gpay_screen_brazil_local_debit_title, null, null, 14);
                if (f0Var == null || !f0Var.v) {
                    return (f0Var == null || !f0Var.Y()) ? uVar2.R(textLocalisedClause, new TextLocalisedClause(R$string.card_add_to_gpay_screen_not_eligible_subtitle, null, null, 14), bitmapImage) : uVar2.R(textLocalisedClause, new TextLocalisedClause(R$string.card_add_to_gpay_screen_standard_virtual_not_eligible_subtitle, null, null, 14), bitmapImage);
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(z12 ? R$string.card_reactivation_add_to_google_pay_description : (z11 && f0Var.Y()) ? R$string.card_apple_wallet_virtual_post_activation_short_us_subtitle : aVar2 == al4.a.LOCAL_DEBIT ? R$string.card_gpay_local_debit_subtitle : aVar2 == al4.a.GLOBAL_DEBIT ? R$string.card_gpay_global_subtitle : aVar2 == al4.a.COMBO ? R$string.card_gpay_combo_subtitle : f0Var.Y() ? R$string.card_add_to_gpay_screen_standard_virtual_subtitle : R$string.card_add_to_gpay_screen_subtitle, null, null, 14);
                PromptMarketingContentDelegate.Model.Content.MediaContent mediaContentQ = u.Q(bitmapImage);
                LargeActionButton.ButtonStyle.BlackOrWhiteButton.WithCenterIcon withCenterIcon = LargeActionButton.ButtonStyle.f58728g;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new PromptMarketingContentDelegate.Model("GOOGLE_PROMPT_ID", textLocalisedClause, textLocalisedClause2, mediaContentQ, null, null, kVar3.k3(), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) withCenterIcon, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f, false, (String) null, 54), null, null, null, null, null, null, null, PromptMarketingContentDelegate.Model.AnimationType.SlideInWithReveal.f53099a, new AnimationRequest(false), null, 1309104);
            case 4:
                PromptMarketingContentDelegate.Model model = (PromptMarketingContentDelegate.Model) obj2;
                g gVar = (g) this.f130027b.L();
                if (gVar != null) {
                    ((AddCardToGooglePayActivity) gVar).setItems(zhm.u.c(model));
                }
                return Unit.f186387a;
            case 5:
                Boolean isTokenized = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isTokenized, "isTokenized");
                return isTokenized.booleanValue() ? this.f130027b.o.c0(d.f130012a) : pfm.m.f235744a;
            case 6:
                String listId = (String) obj2;
                Intrinsics.checkNotNullParameter(listId, "listId");
                boolean zF = Intrinsics.f(listId, "GOOGLE_PROMPT_ID");
                u uVar3 = this.f130027b;
                if (!zF) {
                    return uVar3.o.c0(c.f130006a);
                }
                k kVar4 = uVar3.i;
                return kVar4.i.c(kVar4.j3());
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                u uVar4 = this.f130027b;
                k kVar5 = uVar4.i;
                v vVar3 = (v) kVar5.f130022b;
                if (!((Boolean) vVar3.f130059h.getValue(vVar3, v.f130055j[6]).get()).booleanValue()) {
                    return uVar4.o.c0(c.f130006a);
                }
                uVar4.f130050q.c(new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new GooglePayCreditActivationDestination(kVar5.j3()), yhi.b.BOTTOM_DIALOG, (Integer) 1024, 8)));
                return pfm.m.f235744a;
        }
    }
}
