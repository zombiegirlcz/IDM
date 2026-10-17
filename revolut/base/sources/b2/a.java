package b2;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import e7l.f;
import e7l.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3a.c;
import rd0.d;
import uw1.g;
import xi0.b;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f11849b;

    public /* synthetic */ a(Collection collection, int i) {
        this.f11848a = i;
        this.f11849b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set linkedHashSet;
        List list;
        int i = this.f11848a;
        Collection collection = this.f11849b;
        switch (i) {
            case 0:
                return Boolean.valueOf(collection.contains(obj2));
            case 1:
                return Boolean.valueOf(collection.contains(obj2));
            case 2:
                return Boolean.valueOf(SnapshotStateList.retainAll$lambda$0(collection, (List) obj2));
            case 3:
                c transferFeatures = (c) obj2;
                Intrinsics.checkNotNullParameter(transferFeatures, "transferFeatures");
                ArrayList arrayListF1 = d0.f1(collection);
                boolean z = transferFeatures.d;
                g gVar = transferFeatures.f202315j;
                if (!z) {
                    arrayListF1.remove(WhoToTransferFilter.Cards.f79998a);
                }
                if (!transferFeatures.e) {
                    arrayListF1.remove(WhoToTransferFilter.CryptoWallets.f80001a);
                }
                if (!transferFeatures.f) {
                    arrayListF1.remove(WhoToTransferFilter.Charities.f79999a);
                }
                if (!transferFeatures.f202311b) {
                    arrayListF1.remove(WhoToTransferFilter.Accounts.f79984a);
                }
                if (!transferFeatures.f202312c) {
                    arrayListF1.remove(WhoToTransferFilter.Groups.f80003a);
                }
                if (!transferFeatures.f202313g) {
                    arrayListF1.remove(WhoToTransferFilter.Checks.f80000a);
                }
                Set set = gVar.f283520a;
                if (!set.contains(ApmAani.f61807c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmAani.f79985a);
                }
                if (!set.contains(ApmBizum.f61808c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmBizum.f79986a);
                }
                if (!set.contains(ApmBlik.f61809c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmBlik.f79987a);
                }
                if (!set.contains(ApmBreb.f61810c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmBreb.f79988a);
                }
                if (!set.contains(ApmIris.f61811c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmIris.f79989a);
                }
                if (!set.contains(ApmMultibanco.f61815c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmMultibanco.f79990a);
                }
                if (!set.contains(ApmPayId.f61819c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmPayId.f79991a);
                }
                if (!set.contains(ApmPix.f61820c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmPix.f79992a);
                }
                if (!set.contains(ApmQvik.f61823c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmQvik.f79993a);
                }
                if (!set.contains(ApmSpin.f61827c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmSpin.f79994a);
                }
                if (!set.contains(ApmUpi.f61828c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmUpi.f79995a);
                }
                if (!set.contains(ApmWero.f61829c)) {
                    arrayListF1.remove(WhoToTransferFilter.ApmWero.f79996a);
                }
                if (!transferFeatures.i.f290842a.f290840b) {
                    arrayListF1.remove(WhoToTransferFilter.Billers.f79997a);
                }
                return arrayListF1;
            case 4:
                Data previewCurrenciesData = (Data) obj2;
                Intrinsics.checkNotNullParameter(previewCurrenciesData, "previewCurrenciesData");
                Set set2 = (Set) previewCurrenciesData.getContent();
                if (set2 == null) {
                    set2 = h0.f322473a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collection) {
                    Pair pair = (Pair) obj3;
                    b bVar = (b) pair.f186385a;
                    b bVar2 = (b) pair.f186386b;
                    if (!set2.contains(bVar) && !set2.contains(bVar2)) {
                        arrayList.add(obj3);
                    }
                }
                return new Data(arrayList, previewCurrenciesData.getError(), previewCurrenciesData.getLoading());
            case 5:
                Throwable th10 = new Throwable("Error during fetching rates for pairs: " + collection, (Throwable) obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 6:
                Data configData = (Data) obj2;
                Intrinsics.checkNotNullParameter(configData, "configData");
                f fVar = (f) configData.getContent();
                if (fVar == null || (list = fVar.P0) == null) {
                    linkedHashSet = h0.f322473a;
                } else {
                    linkedHashSet = new LinkedHashSet();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet.add(((h) it8.next()).f123408a.f306286a);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : collection) {
                    Pair pair2 = (Pair) obj4;
                    b bVar3 = (b) pair2.f186385a;
                    b bVar4 = (b) pair2.f186386b;
                    if (!linkedHashSet.contains(bVar3.f306286a) && !linkedHashSet.contains(bVar4.f306286a)) {
                        arrayList2.add(obj4);
                    }
                }
                return new Data(arrayList2, configData.getError(), configData.getLoading());
            case 7:
                Map juniorIdToSavingEnabled = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorIdToSavingEnabled, "juniorIdToSavingEnabled");
                Collection collection2 = collection;
                int iB = q0.b(w.t(collection2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj5 : collection2) {
                    Boolean bool = (Boolean) juniorIdToSavingEnabled.get((String) obj5);
                    linkedHashMap.put(obj5, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                }
                return linkedHashMap;
            default:
                Map juniorIdToPocketsEnabled = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorIdToPocketsEnabled, "juniorIdToPocketsEnabled");
                Collection collection3 = collection;
                int iB2 = q0.b(w.t(collection3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj6 : collection3) {
                    Boolean bool2 = (Boolean) juniorIdToPocketsEnabled.get((String) obj6);
                    linkedHashMap2.put(obj6, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                }
                return linkedHashMap2;
        }
    }
}
