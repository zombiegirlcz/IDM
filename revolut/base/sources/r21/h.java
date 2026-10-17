package r21;

import com.revolut.data.database.models.beneficiary.BeneficiaryDao;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.network.models.beneficiary.BeneficiaryPdaDto;
import com.revolut.data.network.models.beneficiary.CounterPartyInformationDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.data.network.services.BeneficiaryService;
import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import n61.o;
import org.bouncycastle.asn1.BERTags;
import q2j.k;
import r0e.i;
import skm.e0;
import skm.p0;
import wim.z;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class h implements o71.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryService f251037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v11.b f251038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f251039c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f251040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f251041h;
    public final w4l.f i;

    public h(BeneficiaryService service, v11.b dataProvider, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f251037a = service;
        this.f251038b = dataProvider;
        this.f251039c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 10;
                h hVar = this.f251030b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i3, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i3 = 9;
        Function2 function22 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 10;
                h hVar = this.f251030b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i32, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 5;
        Function1 function12 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i6 = 10;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                int i32 = 10;
                h hVar = this.f251030b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i32, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 11;
        Function2 function23 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                int i32 = 10;
                h hVar = this.f251030b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i32, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i22 = 6;
        Function1 function13 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i32 = 12;
        this.e = new w4l.f(function23, function13, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i33 = 13;
        Function2 function24 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i33;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i43 = 7;
        Function1 function14 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i59 = 1;
        this.f = new w4l.f(function24, function14, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i59;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i66 = 2;
        Function2 function25 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i66;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i74 = 0;
        Function1 function15 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i74) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i92 = 3;
        this.f251040g = new w4l.f(function25, function15, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i92;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i96 = 4;
        Function2 function26 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i96;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i99 = 1;
        Function1 function16 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i99) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i100 = 5;
        Function2 function27 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i100;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i101 = 2;
        Function1 function17 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i101) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i102 = 6;
        this.f251041h = new w4l.f(function26, function16, function27, function17, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i102;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i103 = 7;
        Function2 function28 = new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i103;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i104 = 4;
        Function1 function18 = new Function1(this) { // from class: r21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251032b;

            {
                this.f251032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i104) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES");
                    case 1:
                        a bankInformationParams = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        return (n61.d) this.f251032b.f251039c.get(h.e(bankInformationParams));
                    case 2:
                        a bankInformationParams2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        String cacheKey = h.e(bankInformationParams2);
                        v11.b bVar = this.f251032b.f251038b;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        return (n61.d) j6.a.k(n61.d.class, bVar.f285203b, cacheKey);
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARIES");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f251032b.f251039c.get("CACHE_KEY_RECENT_BENEFICIARIES");
                    case 5:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        v11.b bVar2 = this.f251032b.f251038b;
                        ArrayList arrayListA = bVar2.a();
                        if (arrayListA != null) {
                            Integer num = (Integer) bVar2.f285203b.T2("beneficiariesCount", Integer.TYPE);
                            int size = arrayListA.size();
                            if (num != null && size == num.intValue()) {
                                ArrayList arrayListA2 = bVar2.a();
                                return arrayListA2 == null ? f0.f322471a : arrayListA2;
                            }
                        }
                        return null;
                    case 6:
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj2;
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return (List) this.f251032b.f251039c.get(z92.f.k(purpose));
                    default:
                        String beneficiaryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Map map = (Map) this.f251032b.f251039c.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (map != null) {
                            return (o) map.get(beneficiaryId);
                        }
                        return null;
                }
            }
        };
        final int i105 = 8;
        this.i = new w4l.f(function28, function18, new Function2(this) { // from class: r21.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251030b;

            {
                this.f251030b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i105;
                int i322 = 10;
                h hVar = this.f251030b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        BeneficiaryService beneficiaryService = hVar.f251037a;
                        BeneficiaryService.Companion companion = BeneficiaryService.INSTANCE;
                        return hVar.k(beneficiaryService.getAccounts(null));
                    case 1:
                        String beneficiaryId = (String) obj2;
                        o status = (o) obj3;
                        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        ne0.d dVar = hVar.f251039c;
                        Map mapG = (Map) dVar.get("CACHE_KEY_BENEFICIARY_PDA");
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        if (status.b()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                            for (Map.Entry entry : mapG.entrySet()) {
                                linkedHashMap.put(entry.getKey(), o.a((o) entry.getValue()));
                            }
                            mapG = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMapZ = r0.z(mapG);
                        linkedHashMapZ.put(beneficiaryId, status);
                        dVar.f("CACHE_KEY_BENEFICIARY_PDA", linkedHashMapZ);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return hVar.k(hVar.f251037a.getPotentialPdaList());
                    case 3:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        hVar.f251039c.f("CACHE_KEY_POTENTIAL_PDA_BENEFICIARIES", list);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        a aVar = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        String strA = aVar.a();
                        String strB = aVar.b();
                        Map<String, String> mapC = aVar.c();
                        d0<CounterPartyInformationDto> counterPartyInformation = hVar.f251037a.getCounterPartyInformation(strA, strB, aVar.d(), mapC);
                        qza.a aVar2 = new qza.a(20, new i(17));
                        counterPartyInformation.getClass();
                        ufm.i iVar = new ufm.i(counterPartyInformation, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 5:
                        a bankInformationParams = (a) obj2;
                        n61.d result = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(result, "result");
                        hVar.f251039c.f(h.e(bankInformationParams), result);
                        return Unit.f186387a;
                    case 6:
                        a bankInformationParams2 = (a) obj2;
                        n61.d bankInformation = (n61.d) obj3;
                        Intrinsics.checkNotNullParameter(bankInformationParams2, "bankInformationParams");
                        Intrinsics.checkNotNullParameter(bankInformation, "result");
                        String key = h.e(bankInformationParams2);
                        v11.b bVar = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
                        bVar.f285203b.G(bankInformation, key, z.d(o0.b(n61.d.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        r<R> map = hVar.f251038b.c().observeRecent().map(new uz7.f(i322, new v0k.g(9)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        d0 d0VarFirstOrError = ue0.e.E(map, f0.f322471a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        return d0VarFirstOrError;
                    case 8:
                        List beneficiaries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                        hVar.f251039c.f("CACHE_KEY_RECENT_BENEFICIARIES", beneficiaries);
                        return Unit.f186387a;
                    case 9:
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        hVar.f251039c.f("CACHE_KEY_BENEFICIARIES", list2);
                        return Unit.f186387a;
                    case 10:
                        List entityList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(entityList, "list");
                        v11.b bVar2 = hVar.f251038b;
                        Intrinsics.checkNotNullParameter(entityList, "entityList");
                        bVar2.c().deleteAll();
                        BeneficiaryDao beneficiaryDaoC = bVar2.c();
                        List list3 = entityList;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(BeneficiaryEntityMapperKt.toEntity((f5j.a) it11.next()));
                        }
                        beneficiaryDaoC.insertAll(arrayList);
                        bVar2.f285203b.G(Integer.valueOf(entityList.size()), "beneficiariesCount", z.d(o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        BeneficiarySpecialPurpose purpose = (BeneficiarySpecialPurpose) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        return hVar.k(hVar.f251037a.getAccounts(purpose));
                    case 12:
                        BeneficiarySpecialPurpose purpose2 = (BeneficiarySpecialPurpose) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(purpose2, "purpose");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        hVar.f251039c.f(z92.f.k(purpose2), list4);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        String beneficiaryId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
                        d0<BeneficiaryPdaDto> beneficiaryPdaStatus = hVar.f251037a.getBeneficiaryPdaStatus(beneficiaryId2);
                        g gVar = g.f;
                        k kVar = new k();
                        beneficiaryPdaStatus.getClass();
                        ufm.i iVar2 = new ufm.i(beneficiaryPdaStatus, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String e(a aVar) {
        String string = q0.e(aVar.g()).toString();
        StringBuilder sbM = v0.a.m("CACHE_KEY_BANK_INFORMATION_", aVar.e(), "_", aVar.f(), "_");
        sbM.append(string);
        return sbM.toString();
    }

    public final pfm.r d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.b bVarDeleteAccount = this.f251037a.deleteAccount(id10);
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(o71.a.c(this, false, 5)), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        qza.a aVar = new qza.a(16, new r10.b(this, id10, 18));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        pfm.a aVarE = bVarDeleteAccount.e(aVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    public final Object f(String str, gim.c cVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new f(this, str, null, 0), cVar);
    }

    public final r g(BankInformationCopFlow bankInformationCopFlow, String bankCountry, String str, Map fields) {
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(bankInformationCopFlow, "bankInformationCopFlow");
        return this.f251041h.e(new a(bankCountry, str, BeneficiaryResponseMapperKt.toNetworkModel(bankInformationCopFlow), fields), w4l.h.f294642c);
    }

    public final r h(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return nim.a.w(o71.a.c(this, z, 5), new qc0.w(id10, 27));
    }

    public final r i(BeneficiarySpecialPurpose specialPurpose, w4l.k loadingStrategy, BeneficiarySortingStrategy sortingStrategy) {
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(specialPurpose, "specialPurpose");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(sortingStrategy, "sortingStrategy");
        return nim.a.w(this.e.e(specialPurpose, loadingStrategy), new qtb.c(this, sortingStrategy, 23));
    }

    public final r j(String id10, BeneficiarySpecialPurpose specialPurpose, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(specialPurpose, "specialPurpose");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(o71.a.b(this, specialPurpose, loadingStrategy, 9), new qc0.w(id10, 26));
    }

    public final ufm.i k(d0 d0Var) {
        ufm.i iVar = new ufm.i(new ufm.c(new nc0.a(this, 23), 2), new qza.a(28, new r10.b(d0Var, this, 20)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
