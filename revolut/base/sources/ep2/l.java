package ep2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.transfer.core.models.FundingSource;
import eq5.n1;
import eq5.r;
import ip0.nb0;
import ip0.pb0;
import ip0.q10;
import ip0.t10;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128073a;

    public /* synthetic */ l(int i) {
        this.f128073a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        boolean z = false;
        switch (this.f128073a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                hg hgVarB = kp2.a.b();
                pb0 pb0VarA = nb0.a(pb0.Companion, "ID_CONTENT_BODY_LOADING", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return new h(v.k(hgVarB, pb0VarA), false);
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new epb.g((List) getDefaultLoadingItems.invoke());
            case 2:
                LargeActionButtonDelegate.Model it8 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr = CategoryManagementCustomController.T;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f52613a;
            case 3:
                um0 it9 = (um0) obj2;
                KProperty[] kPropertyArr2 = CategoryManagementCustomController.T;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f166696b.f;
            case 4:
                um0 it10 = (um0) obj2;
                KProperty[] kPropertyArr3 = CategoryManagementCustomController.T;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f166697c.f;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new epd.g(u.a(u.b()));
            case 6:
                xi0.b it11 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(cp5.d.D(it11));
            case 7:
                xi0.b it12 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!cp5.d.D(it12));
            case 8:
                xi0.b it13 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(cp5.d.A(it13));
            case 9:
                xi0.b it14 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(cp5.d.D(it14));
            case 10:
                xi0.b it15 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (cp5.d.z(it15) && !cp5.d.D(it15)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                r it16 = (r) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f128308b;
            case 12:
                r it17 = (r) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f128308b;
            case 13:
                r it18 = (r) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                CryptoAddress cryptoAddress = (CryptoAddress) it18.e.getContent();
                n1 n1Var = (n1) it18.f128314m.getContent();
                ArrayList arrayList = n1Var != null ? n1Var.f128295a : null;
                FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) it18.f128310g.getContent();
                FiatCryptoMoney fiatCryptoMoney2 = (FiatCryptoMoney) it18.k.getContent();
                dj0.d dVar = fiatCryptoMoney2 != null ? fiatCryptoMoney2.f71113b : null;
                if (cryptoAddress == null || arrayList == null || fiatCryptoMoney == null || dVar == null) {
                    return null;
                }
                return new vf0.h(cryptoAddress, arrayList, fiatCryptoMoney, dVar);
            case 14:
                r it19 = (r) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                xi0.b bVar = it19.f128308b;
                FundingSource fundingSource = it19.i;
                Data data3 = it19.f128314m;
                try {
                    Object content = data3.getContent();
                    data = new Data(content != null ? ((n1) content).f128296b : null, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return new yhm.r(bVar, fundingSource, data);
            case 15:
                r it20 = (r) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                FundingSource fundingSource2 = it20.i;
                if (fundingSource2 != null) {
                    return fundingSource2.f92241b;
                }
                return null;
            case 16:
                r it21 = (r) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                xi0.b bVar2 = it21.f128308b;
                nqi.c cVar = it21.f;
                FundingSource fundingSource3 = it21.i;
                Data data4 = it21.f128314m;
                try {
                    Object content2 = data4.getContent();
                    data2 = new Data(content2 != null ? ((n1) content2).f128296b : null, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data4.getLoading());
                }
                return new vf0.h(bVar2, cVar, fundingSource3, data2);
            case 17:
                r it22 = (r) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.i;
            case 18:
                r it23 = (r) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.f128308b;
            case 19:
                r it24 = (r) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f128309c;
            case 20:
                r it25 = (r) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return it25.f128311h;
            case 21:
                r domain = (r) obj2;
                Intrinsics.checkNotNullParameter(domain, "domain");
                xi0.b bVar3 = domain.f128308b;
                FundingSource fundingSource4 = domain.i;
                xi0.b bVar4 = fundingSource4 != null ? fundingSource4.f92241b : null;
                if (bVar3 == null || bVar4 == null) {
                    return null;
                }
                return new Pair(bVar3, bVar4);
            case 22:
                return ((r) obj2).f128308b;
            case 23:
                return ((r) obj2).f128308b;
            case 24:
                return ((r) obj2).f128308b;
            case 25:
                return (CryptoAddress) ((r) obj2).e.getContent();
            case 26:
                n1 n1Var2 = (n1) ((r) obj2).f128314m.getContent();
                if (n1Var2 != null) {
                    return n1Var2.f128296b;
                }
                return null;
            case 27:
                return ((r) obj2).f128309c;
            case 28:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524287);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(new t10("DISCLAIMER_LOADING_LIST_ID", q10.f165912a));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
        }
    }

    public /* synthetic */ l(cli.n nVar, int i) {
        this.f128073a = i;
    }
}
