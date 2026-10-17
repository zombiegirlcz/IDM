package or4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import ll4.r;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements fr4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he2.b f228064a;

    public j(he2.b creditCardSectionMapper) {
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        this.f228064a = creditCardSectionMapper;
    }

    @Override // fr4.g
    public final List a(r rates, xw4.a paymentState, boolean z) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        if (paymentState == xw4.a.TERMINATED) {
            return f0.f322471a;
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = rates.f;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA == null) {
            throw new IllegalArgumentException("detailsSection is expected to be present in rates");
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        List list = (List) objA;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayListH = this.f228064a.h("id_credit_card_rates_details_section", list);
        if (z) {
            return yp0.b.g(arrayListH, new ListSubheaderDelegate.Model("id_cc_details_rates_title", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_details_section_title_rates, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        yp0.b.k(arrayListH, 0, 0, 0, 0, 31);
        return arrayListH;
    }
}
