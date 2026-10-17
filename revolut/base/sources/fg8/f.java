package fg8;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_savings.api.navigation.JuniorSavingFeatureConfig;
import com.revolut.feature.junior_savings.api.navigation.article.JuniorSavingProductArticleKey;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksEditDestination;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksListDestination;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f134926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f134927c;

    public /* synthetic */ f(m mVar, String str, int i) {
        this.f134925a = i;
        this.f134926b = mVar;
        this.f134927c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f134925a;
        Object obj3 = null;
        String requestId = this.f134927c;
        m mVar = this.f134926b;
        switch (i) {
            case 0:
                psg.a walletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                return ta6.a.A(walletProfile) ? pd.b.n(skm.p0.f264003c, new j(mVar, requestId, null)) : efm.b.n(new IllegalArgumentException("Cannot handle deeplink for account termination. Junior account is not manageable."));
            case 1:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) hVar.f288433a).booleanValue();
                m mVar2 = this.f134926b;
                String str = this.f134927c;
                if (zBooleanValue) {
                    return pd.b.n(skm.p0.f264003c, new dp4.p(26, mVar2, u0.f(new JuniorTasksEditDestination(str, null, 4)), str, (Continuation) null));
                }
                return mVar2.i(str);
            case 2:
                Boolean pocketsAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(pocketsAvailable, "pocketsAvailable");
                if (pocketsAvailable.booleanValue()) {
                    return mVar.b(requestId);
                }
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Pocket product not available for vault creation flow, juniorId = ", kotlin.text.f0.U0(4, requestId)));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return efm.d0.m(Boolean.FALSE);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Boolean bool = (Boolean) pair.f186385a;
                fo3.c cVar = (fo3.c) pair.f186386b;
                boolean zBooleanValue2 = bool.booleanValue();
                String str2 = this.f134927c;
                if (zBooleanValue2) {
                    return mVar.h(u0.f(new CreateSubaccountWithTypeScreenDestination(y0.b(SubaccountType.Junior.f88962a), null, str2, new CreateSubaccountFlowProvider$CurrencySelectionMode.Specific(cVar.d), false, 18)));
                }
                return mVar.i(str2);
            case 4:
                Boolean savingsAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(savingsAvailable, "savingsAvailable");
                if (!savingsAvailable.booleanValue()) {
                    return mVar.i(requestId);
                }
                pfm.a aVar = new pfm.a(mVar.b(requestId), new ffk.l(19, new f(mVar, requestId, 8)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return mVar.k(aVar, requestId);
            case 5:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue3 = ((Boolean) pair2.f186385a).booleanValue();
                List list = (List) pair2.f186386b;
                if (zBooleanValue3) {
                    Intrinsics.h(list);
                    if (!list.isEmpty()) {
                        return mVar.h(u0.f(new JuniorTasksListDestination(requestId, (ZoomTransitionAnimation.Widgets) null, 6)));
                    }
                }
                return mVar.i(requestId);
            case 6:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue4 = ((Boolean) pair3.f186385a).booleanValue();
                fo3.c cVar2 = (fo3.c) pair3.f186386b;
                m mVar3 = this.f134926b;
                String str3 = this.f134927c;
                return zBooleanValue4 ? pd.b.n(skm.p0.f264003c, new dmf.b(mVar3, str3, cVar2, (Continuation) null, 1)) : mVar3.i(str3);
            case 7:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return mVar.i(requestId);
            case 8:
                Boolean accountActive = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(accountActive, "accountActive");
                if (!accountActive.booleanValue()) {
                    return mVar.i(requestId);
                }
                int i2 = 22;
                efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(mVar.f134961t.a(requestId, w4l.i.f294643c), skm.p0.f264003c), null, new fci.e0(i2), 1).firstOrError();
                ffk.l lVar = new ffk.l(i2, new f(mVar, requestId, 10));
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, lVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 9:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list2 = (List) rVar.f314201a;
                Map map = (Map) rVar.f314202b;
                String maxSavingProductInterestRate = (String) rVar.f314203c;
                Iterator it9 = list2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (Intrinsics.f(((rcd.a) next).f253250a, requestId)) {
                            obj3 = next;
                        }
                    }
                }
                rcd.a aVar3 = (rcd.a) obj3;
                if (aVar3 == null) {
                    return efm.b.n(new IllegalStateException("Parent doesn't have savings request id = ".concat(requestId)));
                }
                String youthId = aVar3.f253251b;
                if (((JuniorBankingProfile) map.get(youthId)) == null) {
                    return efm.b.n(new IllegalStateException(j6.a.q("Parent doesn't have junior = ", kotlin.text.f0.U0(4, youthId))));
                }
                FeatureCommand featureCommand = new FeatureCommand(new JuniorSavingFeatureConfig.SavingReview(requestId, youthId));
                qka.c cVar3 = mVar.f134964y;
                JuniorSavingProductArticleKey juniorSavingProductArticleKey = JuniorSavingProductArticleKey.SAVING_REQUEST;
                juniorSavingProductArticleKey.getClass();
                Intrinsics.checkNotNullParameter(youthId, "youthId");
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                Intrinsics.checkNotNullParameter(maxSavingProductInterestRate, "maxSavingProductInterestRate");
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(juniorSavingProductArticleKey), zhm.r0.k(new Pair("youthId", youthId), new Pair("inviteId", requestId), new Pair("int", maxSavingProductInterestRate)));
                k9 value = k9.Junior;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return mVar.h(new FeatureCommand(cka.b.a(cVar3, productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(featureCommand, null, null, featureCommand, 6), new AnalyticsProduct.Retail(value), null, 112)));
            default:
                List savingProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(savingProducts, "savingProducts");
                if (!savingProducts.isEmpty()) {
                    return mVar.h(u0.f(new JuniorSavingFeatureConfig.JuniorSavingsListDestination(requestId)));
                }
                IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Deposits deeplink sent to a user with id: ", kotlin.text.f0.U0(4, requestId), " has empty product"));
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                return mVar.i(requestId);
        }
    }

    public /* synthetic */ f(String str, m mVar) {
        this.f134925a = 9;
        this.f134927c = str;
        this.f134926b = mVar;
    }
}
