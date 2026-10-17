package au6;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$BlockchainWithFee;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.pay_later.api.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kkf.n4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9545b;

    public /* synthetic */ k0(Object obj2, int i) {
        this.f9544a = i;
        this.f9545b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f9544a;
        Object obj4 = this.f9545b;
        switch (i) {
            case 0:
                BigDecimal value = ((rr6.o) obj3).getValue();
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-rate$0");
                ((l0) obj4).f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES_CURRENT", new rr6.o(value));
                return Unit.f186387a;
            case 1:
                List list = (List) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new CryptoWithdrawToAddressReviewContract$BlockchainWithFee((wk5.a) it8.next(), null));
                }
                return arrayList;
            case 2:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                ((fsk.g) obj4).K().invoke(e);
                return null;
            case 3:
                Throwable e2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e2, "e");
                ((i5i.b) obj4).K().invoke(e2);
                return null;
            case 4:
                Throwable e4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e4, "e");
                ((i9h.o) obj4).K().invoke(e4);
                return null;
            case 5:
                Throwable e5 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e5, "e");
                ((iwk.e) obj4).K().invoke(e5);
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((vi9.t) ((n4) obj4).o).getClass();
                return yp0.b.g(iii.c.b(null, "PAY_LATER_PLAN_DETAILS_INSTALMENT_INFO_MAPPER_ERROR_STATE_ID", 4, true), new ListSubheaderDelegate.Model("PAY_LATER_PLAN_DETAILS_INSTALMENT_INFO_MAPPER_ERROR_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pay_later_plan_header_payment_plan, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.INSIDE_BOX, 0, 0, 124);
            case 7:
                String str = ((gyd.d) obj2).f147844a;
                wxd.s products = (wxd.s) obj3;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-impl-documents_hub-domain-DocumentsHubProductPathType$-type$0");
                Intrinsics.checkNotNullParameter(products, "products");
                nyd.k kVar = (nyd.k) obj4;
                kVar.f220860b.f(nyd.k.b(kVar, str), products);
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new go.g(mra.d.h(new Data(null, (Throwable) obj2, false, 5, null), ((com.revolut.feature.payments.air.widget.impl.ui.chat.b) obj4).c3().f310974a), 2);
            case 9:
                Map map = ((aka.o) obj3).f5767a;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(map, "$v$c$com-revolut-feature-product_article-api-models-ProductArticlesConfig$-domain$0");
                ((ska.e) obj4).f263787b.f("PRODUCT_ARTICLE_CONFIG_KEY", new aka.o(map));
                return Unit.f186387a;
            case 10:
                String str2 = ((RegisteredIdentityId) obj2).f74764a;
                cjl.w userActivity = (cjl.w) obj3;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-registeredIdentityId$0");
                Intrinsics.checkNotNullParameter(userActivity, "userActivity");
                ((xjl.u) obj4).f306582a.f("USER_ACTIVITY_" + str2, userActivity);
                return Unit.f186387a;
            default:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                if (th10 != null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return xnb.q.a((xnb.q) obj4, null, null);
        }
    }
}
