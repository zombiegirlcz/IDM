package l7j;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f192694w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f192694w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f192694w, continuation, 0);
            default:
                return new w(this.f192694w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2 = this.u;
        z zVar = this.f192694w;
        switch (i2) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    n7j.c cVar = zVar.f192698r;
                    wd6.e eVar = ((g) ((j2) zVar.A.f22677a).getValue()).f192670a.f99887c;
                    n7j.a dialogData = new n7j.a(eVar);
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(dialogData, "dialogData");
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.fx_orders_commodity_price_explanation_dialog_title, null, null, 14), null, null, 30);
                    int i5 = n7j.b.f213161a[eVar.ordinal()];
                    if (i5 == 1) {
                        i = R$string.fx_orders_commodity_price_explanation_dialog_description_buy;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.fx_orders_commodity_price_explanation_dialog_description_sell;
                    }
                    PlainTextDelegate.Model model = new PlainTextDelegate.Model("COMMODITY_LEARN_MORE_TEXT_ID", (UrlImage) null, (Clause) null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "COMMODITY_LEARN_MORE_TEXT_ID", false), 10))), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 30698);
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("COMMODITY_PRICE_DESCRIPTION_GOT_IY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), false, null, null, null, null, 744);
                    yp0.b.r(model2, 0, 0, 0, 0, 15);
                    List listK = zhm.v.k(model, model2);
                    k9 value = k9.Commodities;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    efm.b bVarG = zVar.f192696p.G(new rp0.y(listK, tVar, null, null, null, null, "COMMODITY_PRICE_DESCRIPTION_DIALOG_DELEGATES_KEY", new AnalyticsProduct.Retail(value), null, null, 3324));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (z.I2(zVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
