package d27;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.u1;
import nii.w1;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a f110755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f110755w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f110755w, continuation, 0);
            case 1:
                return new m0(this.f110755w, continuation, 1);
            default:
                return new m0(this.f110755w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB0;
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar = this.f110755w;
        int i2 = 0;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objI2 = com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.I2(aVar, this);
                return objI2 == aVar2 ? aVar2 : objI2;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar4 = this.f110755w;
                Continuation continuation = null;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    m0 m0Var = new m0(aVar4, continuation, i2);
                    this.v = 1;
                    objB0 = u0.b0(aVar4.X(), "TAG_BUTTON_CREATE_OIP", m0Var, this);
                    if (objB0 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB0 = obj2;
                }
                OrderInitiationPage page = (OrderInitiationPage) objB0;
                aVar4.f74185x.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                dj0.d dVar = page.f;
                TextLocalisedClause textLocalisedClause = dVar != null ? new TextLocalisedClause(R$string.freelancer_sale_payment_link_result_success_title, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), null, 8)), null, 12) : new TextLocalisedClause(R$string.freelancer_sale_payment_link_result_success_no_amount_title, null, null, 14);
                TextClause textClause = new TextClause(page.f86431h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i6 = R$drawable.uikit_icn_16_copy;
                Float fValueOf = Float.valueOf(16.0f);
                List listK = zhm.v.k(textClause, new ImageClause(i6, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16));
                t0 t0Var = t0.f186434a;
                m70.a.t(t0Var);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "ID_CLAUSE_PAYMENT_LINK", false), null, 8);
                TextClause textClause2 = new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                LocalDateTime localDateTime = page.f86432j;
                Clause[] elements = {compositeClause, textClause2, localDateTime != null ? yoj.b.w(new TextLocalisedClause(R$string.freelancer_sale_payment_link_share_expires_on, zhm.u.c(new TimeClause(oi0.d.c0(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12), new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : null, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_sale_payment_link_result_success_caption, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return yji.l.a1(aVar4, aVar4.X1(new y0(null, new nii.j0((Clause) textLocalisedClause, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) page, (u1) new w1(2, new TextLocalisedClause(R$string.freelancer_sale_payment_link_share_cta, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_payment_link_generate_qr_cta, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4068), false, 5)), null, null, new chf.a(aVar4, page, continuation, 6), 3);
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarF = aVar.B.f(false);
                this.v = 1;
                Object objB = nim.a.b(d0VarF, this);
                return objB == aVar5 ? aVar5 : objB;
        }
    }
}
