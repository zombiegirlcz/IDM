package aed;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.view.ContextThemeWrapper;
import atg.r;
import atg.v;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.home_feed.impl.widgets.trendingrewards.BrandCarouselItemParcel;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsShortCampaignInfo;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails;
import grl.k9;
import h93.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import n33.n2;
import n33.r2;
import n33.s2;
import org.joda.time.DateTime;
import pcd.s;
import te0.w;
import wim.z;
import zh9.u0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3530c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(as9.b bVar, ipa.j jVar, String str, String str2) {
        this.f3528a = 1;
        this.d = bVar;
        this.e = jVar;
        this.f3529b = str;
        this.f3530c = str2;
    }

    @Override // kfm.a
    public final void run() {
        String str;
        int i = this.f3528a;
        Object obj2 = this.e;
        Object obj3 = this.f3530c;
        Object obj4 = this.f3529b;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                zdd.i iVar = (zdd.i) obj5;
                String str2 = (String) obj4;
                o oVar = (o) obj2;
                String str3 = (String) obj3;
                Intrinsics.h(iVar);
                s sVarI = ydd.b.i(iVar, str2);
                if (sVarI != null) {
                    oVar.f3553m.j(new h(str3, str2), sVarI);
                    return;
                }
                return;
            case 1:
                as9.b bVar = (as9.b) obj5;
                ipa.j jVar = (ipa.j) obj2;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                b90.a aVar = bVar.f8881b;
                String strH = ipa.k.h(jVar);
                if (strH == null) {
                    strH = j6.a.p("toString(...)");
                }
                String str6 = strH;
                String strI = ipa.k.i(jVar);
                if (strI == null) {
                    m70.a.c(t0.f186434a);
                    str = "";
                } else {
                    str = strI;
                }
                ipa.h hVar = ipa.h.OTHER;
                ipa.i iVar2 = new ipa.i("GROUP_PUSH_CHANNEL", bVar.f.b(new TextLocalisedClause(R$string.social_payments_groups_notification_channel_name, null, null, 14)).toString(), ipa.l.HIGH);
                int i2 = R$drawable.uikit_icn_24_logo_revolut_colour;
                b90.b destination = b90.b.DEEPLINK;
                String strE = ipa.k.e(jVar);
                f0 buttonActions = f0.f322471a;
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(buttonActions, "buttonActions");
                s70.a aVar2 = bVar.f8883g;
                ContextThemeWrapper contextThemeWrapper = bVar.f8882c;
                int iHashCode = destination.hashCode() * 31;
                iHashCode = strE != null ? strE.hashCode() : 0;
                buttonActions.getClass();
                aVar.b(new ipa.b(str6, str, hVar, iVar2, str4, str5, i2, null, new ipa.f(((s70.b) aVar2).g(contextThemeWrapper, ((iHashCode + iHashCode) * 31) + 1, new Intent("android.intent.action.VIEW", Uri.parse(ipa.k.e(jVar))), 67108864, 4)), null, 7040));
                return;
            case 2:
                v vVar = (v) obj5;
                AccountId accountId = (AccountId) obj4;
                DateTime dateTime = (DateTime) obj3;
                xi0.b bVar2 = (xi0.b) obj2;
                ReentrantReadWriteLock reentrantReadWriteLock = vVar.f9080g;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    Map mapE = vVar.e(accountId);
                    LinkedHashMap linkedHashMapZ = mapE != null ? r0.z(mapE) : new LinkedHashMap();
                    if (dateTime != null) {
                        Long l2 = (Long) linkedHashMapZ.put(bVar2.f306286a, Long.valueOf(dateTime.getMillis()));
                        long millis = dateTime.getMillis();
                        if (l2 == null || l2.longValue() != millis) {
                            xe0.e eVar = vVar.f9079c;
                            v.Companion.getClass();
                            String strB = r.b(accountId, "CURRENCY_INFO_KEY");
                            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                            KType kTypeB = o0.b(String.class);
                            companion.getClass();
                            eVar.G(linkedHashMapZ, strB, z.d(o0.f186429a.d(o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(o0.b(Long.TYPE))))));
                        }
                    } else if (linkedHashMapZ.remove(bVar2.f306286a) != null) {
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        String strB2 = r.b(accountId, "CURRENCY_INFO_KEY");
                        KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                        KType kTypeB2 = o0.b(String.class);
                        companion2.getClass();
                        eVar2.G(linkedHashMapZ, strB2, z.d(o0.f186429a.d(o0.d(KTypeProjection.Companion.a(kTypeB2), KTypeProjection.Companion.a(o0.b(Long.TYPE))))));
                    }
                    Unit unit = Unit.f186387a;
                    while (iHashCode < readHoldCount) {
                        lock.lock();
                        iHashCode++;
                    }
                    writeLock.unlock();
                    return;
                } catch (Throwable th10) {
                    while (iHashCode < readHoldCount) {
                        lock.lock();
                        iHashCode++;
                    }
                    writeLock.unlock();
                    throw th10;
                }
            case 3:
                ((c1i.b) obj5).f20517a.G(((xi0.b) obj2).f306286a, c1i.b.a((wd6.e) obj4, (AccountId) obj3), z.d(o0.b(String.class)));
                return;
            case 4:
                String str7 = (String) obj4;
                BrandCarouselItemParcel brandCarouselItemParcel = (BrandCarouselItemParcel) obj2;
                ash.d dVar = ((ed7.k) obj5).f124937g;
                String queryParameter = Uri.parse((String) obj3).getQueryParameter("utm_source");
                dVar.a(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination(new ShopsShortCampaignInfo(str7, queryParameter != null ? queryParameter : "", brandCarouselItemParcel.d)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
                return;
            case 5:
                my8.r rVar = (my8.r) obj5;
                e7l.f config = (e7l.f) obj4;
                wi0.b userCountry = (wi0.b) obj3;
                fu8.v vVar2 = (fu8.v) obj2;
                iqi.h hVar2 = vVar2.f138142n;
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                if (zi0.c.A(rVar, config.Y0, userCountry)) {
                    ((iqi.b) hVar2).e0(true);
                    ((iqi.b) hVar2).d0(com.bumptech.glide.d.t(userCountry) ? new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_nationality, null, null, 14) : new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_citizenship, null, null, 14));
                } else {
                    ((iqi.b) hVar2).e0(false);
                }
                if (jh.d.g(vVar2.f138145r.a)) {
                    TwinVerticalButton twinVerticalButton = ((iqi.b) hVar2).f167867j;
                    if (twinVerticalButton != null) {
                        twinVerticalButton.setGradientBackgroundEnabled(false);
                        return;
                    } else {
                        Intrinsics.r("twinVerticalButton");
                        throw null;
                    }
                }
                return;
            case 6:
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar3 = (com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) obj5;
                ((rpi.b) aVar3.f96952r).N(false);
                ((opi.b) aVar3.f96948m).Z(((l2i.a) aVar3.f96956x).a((dj0.d) obj4, (StakingPocket) obj3, (dj0.d) obj2));
                return;
            case 7:
                r2 r2Var = (r2) obj5;
                n2 n2Var = (n2) obj4;
                b93.e eVar3 = (b93.e) obj3;
                l0 l0Var = (l0) obj2;
                v60.i iVar3 = r2Var.f211802p;
                s2 s2Var = (s2) r2Var.e;
                AccountId accountIdA = com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) s2Var.w0().get());
                pi3.h hVarD = n2Var != null ? n2Var.f211769a : r2Var.d();
                xfa.b bVar3 = xfa.b.ONBOARDING_CARD_SELECTION;
                te0.e eVarX0 = s2Var.x0();
                AnalyticsProduct.Companion companion3 = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137496c;
                companion3.getClass();
                AnalyticsProduct.Companion.a(k9Var);
                iVar3.onNext(new FeatureCommand(new CardDesignFeatureConfig(eVar3, accountIdA, null, null, null, false, r2Var.e(n2Var != null ? n2Var.f211770b : null), false, false, null, bVar3, hVarD, null, null, null, (AnalyticsProduct) w.M(eVarX0, new AnalyticsProduct.Retail(k9Var)), null, null, l0Var, null, null, false, false, null, 527937402)));
                return;
            case 8:
                ((qe0.f) obj5).f245023a.invoke(obj4, obj3, obj2);
                return;
            default:
                ((tdj.c) obj5).A2(new CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails((xi0.b) obj4, (xi0.b) obj3, (ncj.d) obj2));
                return;
        }
    }

    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3528a = i;
        this.d = obj2;
        this.f3529b = obj3;
        this.f3530c = obj4;
        this.e = obj5;
    }

    public /* synthetic */ d(zdd.i iVar, String str, o oVar, String str2) {
        this.f3528a = 0;
        this.d = iVar;
        this.f3529b = str;
        this.e = oVar;
        this.f3530c = str2;
    }
}
