package nd;

import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.mlkit.vision.text.Text;
import com.meshconnect.link.LinkEventsKt;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.dependencies.R$string;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import e8h.y;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sgm.l4;
import sgm.o4;
import sgm.v4;
import zhm.a0;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements q, r8.n, zzu, l4, w0h.f {
    public p(r10.r wealthMarginInteractor) {
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static Object b(String json, n8a.r rVar) {
        ok.c cVar = ok.c.f225853a;
        lk.a aVar = lk.a.f196159a;
        Intrinsics.checkNotNullParameter(json, "json");
        Object objD = lk.a.a().d(json, new com.meshconnect.link.b.a().getType());
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        Map map = (Map) objD;
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj2 = map.get("type");
        String str = (String) ok.c.f225854b.get(obj2);
        if (str != null) {
            map = r0.q(map, new Pair("type", str));
        } else if (!d0.T(ok.c.f225855c, obj2)) {
            map = null;
        }
        if (map == null) {
            return Unit.f186387a;
        }
        Object objEmit = LinkEventsKt.events.emit(map, rVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objEmit != aVar2) {
            objEmit = Unit.f186387a;
        }
        return objEmit == aVar2 ? objEmit : Unit.f186387a;
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    public ArrayList c(trk.a assetType, List currentAssetStatsIdList, Set updatedGroupAssetStatsIdSet, hel.b bVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(currentAssetStatsIdList, "currentAssetStatsIdList");
        Intrinsics.checkNotNullParameter(updatedGroupAssetStatsIdSet, "updatedGroupAssetStatsIdSet");
        List listC = zvk.b.c(assetType);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            a0.x(zvk.b.d((AssetStatsGroup) it8.next(), bVar), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            AssetStatsId assetStatsId = (AssetStatsId) obj2;
            if (updatedGroupAssetStatsIdSet.contains(assetStatsId) && !currentAssetStatsIdList.contains(assetStatsId)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : currentAssetStatsIdList) {
            if (!updatedGroupAssetStatsIdSet.contains((AssetStatsId) obj3)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayListF1 = d0.f1(currentAssetStatsIdList);
        arrayListF1.addAll(arrayList2);
        arrayListF1.removeAll(arrayList3);
        return arrayListF1;
    }

    @Override // sgm.l4
    public o4 call() {
        return new v4(16);
    }

    @Override // w0h.f
    public Object d(gim.c cVar) {
        return Boolean.TRUE;
    }

    @Override // w0h.f
    public TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.crypto_feed_dependencies_widget_catalog_top_movers_title, null, null, 14);
    }

    @Override // w0h.f
    public TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.crypto_home_feed_dependencies_widget_common_error_action, null, null, 14);
    }

    @Override // w0h.f
    public TextLocalisedClause g() {
        return new TextLocalisedClause(R$string.crypto_home_feed_dependencies_widget_top_movers_error_title, null, null, 14);
    }

    @Override // w0h.f
    public w0h.d h() {
        return w0h.d.CRYPTO;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj2) {
        return ((Text.Line) obj2).j();
    }

    public p() {
    }

    public p(rh0.b availabilityChecker) {
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
    }

    public p(y promotionsRepository) {
        Intrinsics.checkNotNullParameter(promotionsRepository, "promotionsRepository");
    }

    public p(k2d.c providersSet) {
        Intrinsics.checkNotNullParameter(providersSet, "providersSet");
    }

    public p(mq9.f interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
    }

    public p(ffk.t pricingPlanInteractor, zlk.c planByFeatureResolver) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planByFeatureResolver, "planByFeatureResolver");
    }

    public p(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public p(zvk.b assetStatsGroupMapper, int i) {
        switch (i) {
            case 22:
                Intrinsics.checkNotNullParameter(assetStatsGroupMapper, "assetStatsGroupMapper");
                break;
            default:
                Intrinsics.checkNotNullParameter(assetStatsGroupMapper, "assetStatsGroupMapper");
                break;
        }
    }
}
