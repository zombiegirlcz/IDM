package tsk;

import androidx.recyclerview.widget.RecyclerView;
import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274159a;

    public /* synthetic */ j(int i) {
        this.f274159a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        js0.f fVarP;
        switch (this.f274159a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 1:
                l it8 = (l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return d0.Q(it8.d);
            case 2:
                ej0.b it9 = (ej0.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f126704b;
            case 3:
                CreditCardSecurityDeposit securityDeposit = (CreditCardSecurityDeposit) obj2;
                Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
                od0.i.Companion.getClass();
                return od0.h.a(securityDeposit);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new tt4.o(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991), (List) getDefaultLoadingItems.invoke());
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 7:
                mel.f it10 = (mel.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new ttk.a(it10.f204744a.f204737a);
            case 8:
                ttl.g it11 = (ttl.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f274446b;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(3);
            case 10:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 11:
                tv4.e it12 = (tv4.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                tv4.d dVar = (tv4.d) it12.f274698a.getContent();
                if (dVar != null) {
                    return dVar.f274697c;
                }
                return null;
            case 12:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new tv4.m(new tv4.l(null, new TextLocalisedClause(R$string.credit_card_transactions_title, null, null, 14)), (List) loadingItems.invoke());
            case 13:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return new tv7.i(null, (List) getDefaultLoadingItems3.invoke(), true);
            case 14:
                tvc.d update = (tvc.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tvc.d.a(update, null, 5);
            case 15:
                tvc.d update2 = (tvc.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return tvc.d.a(update2, null, 5);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new tvc.f(new lw0.h(lw0.i.ICON), v.k(tvc.l.a(0), tvc.l.a(1), tvc.l.a(2)), false, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 17:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 18:
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (recyclerView == null || (fVarP = jb3.l.p(js0.f.Companion, recyclerView)) == null) {
                    return null;
                }
                return fVarP.a();
            case 19:
                SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return new ky0.a(model);
            case 20:
                yw4.p it13 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.e != yw4.q.TERMINATED);
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 22:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    pb0 pb0VarO = t61.a.o("LOADING_ITEM_ROW_1_PREFIX_", i, pb0.Companion, false, 6);
                    yp0.b.l(pb0VarO, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(pb0VarO);
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                ArrayList arrayList = new ArrayList(4);
                for (int i2 = 0; i2 < 4; i2++) {
                    pb0 pb0VarO2 = t61.a.o("LOADING_ITEM_ROW_2_PREFIX_", i2, pb0.Companion, false, 6);
                    yp0.b.l(pb0VarO2, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(pb0VarO2);
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new tw7.j(true, null, null, AnimatedBackgroundType.DEFAULT.f51471a, f0.f322471a, d0.E0(arrayList, arrayListP));
            case 23:
                yhm.r it14 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                VoucherProductGroupDetails voucherProductGroupDetails = (VoucherProductGroupDetails) it14.f314201a;
                x xVar = (x) it14.f314202b;
                tvb.b bVar = tvb.c.Companion;
                Address address = ((do3.n) it14.f314203c).k;
                wi0.b bVarG = address != null ? nz8.d.g(address) : null;
                bVar.getClass();
                return new kwb.b(voucherProductGroupDetails, xVar, null, tvb.b.a(bVarG));
            case 24:
                yhm.r it15 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                x xVar2 = (x) it15.f314201a;
                UserVoucherDetails userVoucherDetails = (UserVoucherDetails) it15.f314202b;
                tvb.b bVar2 = tvb.c.Companion;
                Address address2 = ((do3.n) it15.f314203c).k;
                wi0.b bVarG2 = address2 != null ? nz8.d.g(address2) : null;
                bVar2.getClass();
                return new kwb.b(null, xVar2, userVoucherDetails, tvb.b.a(bVarG2));
            case 25:
                nwj.b it16 = (nwj.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.T(it16);
            case 26:
                nwj.b it17 = (nwj.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.T(it17);
            case 27:
                Boolean isJunior = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isJunior, "isJunior");
                return isJunior.booleanValue() ? twl.d.JUNIOR : twl.d.PARENT;
            case 28:
                List suspiciousTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(suspiciousTransactions, "suspiciousTransactions");
                return d0.d0(suspiciousTransactions) != null ? efm.d0.m(d0.b0(suspiciousTransactions)) : ufm.m.f279897a;
            default:
                k3l.j it18 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.a().getF104385a(), "SUSPICIOUS_TRANSACTION_STATUS_VIEW"));
        }
    }

    public /* synthetic */ j(cli.n nVar, int i) {
        this.f274159a = i;
    }
}
