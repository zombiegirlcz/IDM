package gr2;

import android.content.res.Resources;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import gs7.d;
import gsf.e;
import gsf.m;
import gsf.n;
import gu7.a;
import java.lang.annotation.Annotation;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import qlm.v1;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145843a;

    public /* synthetic */ j0(int i) {
        this.f145843a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        switch (this.f145843a) {
            case 0:
                return new qlm.e(z.INSTANCE.serializer());
            case 1:
                return zhm.v.k(new hrb.b(), new hrb.a());
            case 2:
                Intrinsics.checkNotNullParameter("WATCHLIST_TIPS_HOST_ID", "id");
                Pair pair = new Pair(new cte.b("WATCHLIST_TIPS_HOST_ID"), zhm.u.c("watchlistRearrangeItems"));
                Intrinsics.checkNotNullParameter("CRYPTO_RECEIVE_XRP", "id");
                return zhm.r0.k(pair, new Pair(new cte.b("CRYPTO_RECEIVE_XRP"), zhm.u.c("cryptoReceiveXrp")));
            case 3:
                KProperty[] kPropertyArr = BlockedPaymentsListScreen.f64254d0;
                return new ListSubheaderDelegate();
            case 4:
                KProperty[] kPropertyArr2 = BlockedPaymentsListScreen.f64254d0;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr3 = BlockedPaymentsListScreen.f64254d0;
                return new LargeActionButtonDelegate();
            case 6:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_canceled;
                int i2 = R$attr.uikit_colorWidgetBackground;
                return LayeredImage.Companion.f(companion, i, R$attr.uikit_colorDeepGrey, i2, Integer.valueOf(i2), 4.0f, 4.0f, null, 64);
            case 7:
                return new RowDelegate.Model("ID_SUBSCRIPTION_EMPTY_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D268", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.blocked_payments_subscriptions_empty, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            case 8:
                return new RowDelegate.Model("ID_MERCHANT_EMPTY_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D140", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.blocked_payments_merchants_empty, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            case 9:
                return new RowDelegate.Model("ID_PAYTO_EMPTY_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D140", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.blocked_payments_pay_to_empty, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            case 10:
                return new RowDelegate.Model("ID_UPI_EMPTY_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D140", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.blocked_payments_upi_empty, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            case 11:
                return new qlm.e(gs7.m.f146341a);
            case 12:
                return gs7.d.INSTANCE.serializer();
            case 13:
                d.Companion companion2 = gs7.d.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.documents.DocumentsLayoutDto.DocumentDto.Action", p0Var.b(gs7.d.class), new KClass[]{p0Var.b(gs7.g.class), p0Var.b(gs7.j.class), p0Var.b(d.b.class)}, new KSerializer[]{gs7.e.f146334a, gs7.h.f146336a, new d1("UNKNOWN", d.b.INSTANCE, new Annotation[]{new bka.b(20)})}, new Annotation[]{new bka.b(20)});
            case 14:
                return new d1("UNKNOWN", d.b.INSTANCE, new Annotation[]{new bka.b(20)});
            case 15:
                return new qlm.e(gs7.c.f146331a);
            case 16:
                m.Companion bVar = gsf.m.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 17:
                m.Companion bVar2 = gsf.m.INSTANCE;
                return new qlm.e(e.a.f146409a);
            case 18:
                m.Companion bVar3 = gsf.m.INSTANCE;
                return new qlm.e(n.a.f146437a);
            case 19:
                n.Companion companion3 = gsf.n.INSTANCE;
                return new qlm.e(n.a.f146437a);
            case 20:
                Resources system = Resources.getSystem();
                int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
                int iIntValue = 255;
                if (identifier != 0) {
                    try {
                        m.Companion companion4 = yhm.m.INSTANCE;
                        objA = Integer.valueOf(system.getInteger(identifier));
                    } catch (Throwable th10) {
                        m.Companion companion5 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    Integer num = (Integer) objA;
                    if (num != null) {
                        Integer num2 = num.intValue() > 0 ? num : null;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                    }
                    break;
                }
                return Integer.valueOf(iIntValue);
            case 21:
                a.Companion companion6 = gu7.a.INSTANCE;
                return j1.b("com.revolut.feature.insurance_embedded.impl.data.model.Action.Type", gu7.b.values());
            case 22:
                ActivateCoverageWidget.Companion bVar4 = ActivateCoverageWidget.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 23:
                BottomSheet.Companion companion7 = BottomSheet.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 24:
                BottomSheet.Action.Companion companion8 = BottomSheet.Action.INSTANCE;
                kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet.Action", p0Var2.b(BottomSheet.Action.class), new KClass[]{p0Var2.b(BottomSheet.Action.Deeplink.class), p0Var2.b(BottomSheet.Action.Dismiss.class), p0Var2.b(BottomSheet.Action.DynamicContactUrl.class), p0Var2.b(BottomSheet.Action.LearnMore.class), p0Var2.b(BottomSheet.Action.Upgrade.class)}, new KSerializer[]{BottomSheet.Action.Deeplink.a.f75878a, new d1("DISMISS", BottomSheet.Action.Dismiss.INSTANCE, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.a()}), BottomSheet.Action.DynamicContactUrl.a.f75881a, BottomSheet.Action.LearnMore.a.f75883a, BottomSheet.Action.Upgrade.a.f75886a}, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.a()});
            case 25:
                return new d1("DISMISS", BottomSheet.Action.Dismiss.INSTANCE, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.a()});
            case 26:
                BottomSheet.Action.Upgrade.Companion companion9 = BottomSheet.Action.Upgrade.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 27:
                BottomSheet.Button.Companion companion10 = BottomSheet.Button.INSTANCE;
                return BottomSheet.Action.INSTANCE.serializer();
            case 28:
                BottomSheet.Checklist.Companion companion11 = BottomSheet.Checklist.INSTANCE;
                return new qlm.e(BottomSheet.ChecklistItem.a.f75895a);
            default:
                return new qlm.e(gu7.e.f146733a);
        }
    }

    public /* synthetic */ j0(gti.h hVar) {
        this.f145843a = 20;
    }
}
