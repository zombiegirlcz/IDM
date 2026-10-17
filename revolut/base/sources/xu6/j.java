package xu6;

import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f308972b;

    public static final class a {
        private a() {
        }
    }

    public j() {
        pr6.h hVar = pr6.h.ACQUIRING;
        pr6.h hVar2 = pr6.h.FX;
        pr6.h hVar3 = pr6.h.ACQUIRING_LOYALTY;
        this.f308971a = v.k(hVar, hVar2, hVar3, pr6.h.TRANSFER, pr6.h.OTHER);
        pr6.h[] elements = {hVar, hVar2, hVar3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f308972b = kotlin.collections.d.y0(elements);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = new g(new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_title, null, null, 14));
        aim.e eVarB = u.b();
        List list = domainState.f308964a;
        List listP0 = d0.P0(list, new q2j.v(this, 24));
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : listP0) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            AcquiringPaymentFee acquiringPaymentFee = (AcquiringPaymentFee) obj2;
            pr6.h hVar = acquiringPaymentFee.f73366b;
            String str = i3 + "_" + hVar;
            boolean zContains = this.f308972b.contains(hVar);
            int i6 = k.f308973a[hVar.ordinal()];
            if (i6 == 1) {
                i = R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_promotion;
            } else if (i6 == 2) {
                i = R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_payment_processing;
            } else if (i6 == 3) {
                i = R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_exchange_rate;
            } else if (i6 == 4) {
                i = R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_transfer;
            } else {
                if (i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_other;
            }
            Clause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            if (zContains) {
                textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)));
            }
            arrayList.add(new CellDetailsDelegate.Model(str, new t0(textLocalisedClause, (Image) null, 0, false, 30), new MoneyClause(acquiringPaymentFee.f73365a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, acquiringPaymentFee.f73366b, null, null, 0, null, false, zContains, null, null, 28600));
            i3 = i5;
        }
        a0.x(arrayList, eVarB);
        if (list.size() > 1) {
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_total, null, null, 14), (Image) null, 0, false, 30);
            dj0.d.Companion.getClass();
            dj0.d dVar = dj0.d.e;
            dj0.d dVarO = dVar;
            for (Object obj3 : list) {
                int i21 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((AcquiringPaymentFee) obj3).f73365a : pyd.c.O(dVarO, ((AcquiringPaymentFee) obj3).f73365a);
                i2 = i21;
            }
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_FEE_BREAKDOWN_TOTAL", t0Var, new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new h(gVar, eVarA, new f(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14)));
    }
}
