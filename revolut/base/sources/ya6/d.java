package ya6;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.donations.impl.network.service.DonationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationsService f311955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja6.b f311956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f311957c;
    public final w4l.f d;
    public final jpf.a e;

    public d(DonationsService service, ja6.b dao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f311955a = service;
        this.f311956b = dao;
        this.f311957c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ya6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311950b;

            {
                this.f311950b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String charityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311950b.f311955a.getCharityCampaigns(charityId);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String charityId2 = (String) obj2;
                        List campaigns = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                        this.f311950b.f311957c.f("charity_campaigns_" + charityId2, campaigns);
                        break;
                    default:
                        String charityId3 = (String) obj2;
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        ja6.b bVar = this.f311950b.f311956b;
                        List<ba6.r> list = campaigns2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (ba6.r rVar : list) {
                            Intrinsics.checkNotNullParameter(rVar, "<this>");
                            Intrinsics.checkNotNullParameter(charityId3, "charityId");
                            String str = rVar.f13954a;
                            String string = rVar.f13955b.toString();
                            ba6.n nVar = rVar.f13956c;
                            String str2 = nVar.f13952a.f13615a;
                            String str3 = nVar.f13953b;
                            String string2 = rVar.d.toString();
                            ArrayList arrayList2 = rVar.e;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(hx7.a.A((dj0.d) it8.next()));
                            }
                            arrayList.add(new la6.f(charityId3, str, string, str2, str3, arrayList3, string2));
                        }
                        DBUtil.performBlocking(bVar.f172443a, false, true, new ja6.a(bVar, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: ya6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311954b;

            {
                this.f311954b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ba6.p pVar;
                ba6.q qVar;
                switch (i) {
                    case 0:
                        String charityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        return (List) v1.c.s("charity_campaigns_", charityId, this.f311954b.f311957c);
                    case 1:
                        String charityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        ja6.b bVar = this.f311954b.f311956b;
                        RoomDatabase roomDatabase = bVar.f172443a;
                        j4h.m mVar = new j4h.m(bVar, charityId2, 20);
                        int i2 = 0;
                        List<la6.f> list = (List) DBUtil.performBlocking(roomDatabase, true, false, mVar);
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (la6.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            String str = fVar.f193329b;
                            String str2 = fVar.f193330c;
                            ba6.q[] qVarArrValues = ba6.q.values();
                            int length = qVarArrValues.length;
                            int i3 = i2;
                            while (true) {
                                pVar = null;
                                if (i3 < length) {
                                    qVar = qVarArrValues[i3];
                                    if (!kotlin.text.a0.z(qVar.name(), str2, true)) {
                                        i3++;
                                    }
                                } else {
                                    qVar = null;
                                }
                            }
                            if (qVar == null) {
                                qVar = ba6.q.UNKNOWN;
                            }
                            ba6.q qVar2 = qVar;
                            ba6.n nVar = new ba6.n(new b93.b(fVar.d), fVar.e);
                            String str3 = fVar.f;
                            ba6.p[] pVarArrValues = ba6.p.values();
                            int length2 = pVarArrValues.length;
                            int i5 = i2;
                            while (true) {
                                if (i5 < length2) {
                                    ba6.p pVar2 = pVarArrValues[i5];
                                    if (kotlin.text.a0.z(pVar2.name(), str3, true)) {
                                        pVar = pVar2;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (pVar == null) {
                                pVar = ba6.p.UNKNOWN;
                            }
                            List list2 = fVar.f193331g;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(hx7.a.v((jo3.b) it8.next()));
                            }
                            arrayList.add(new ba6.r(str, qVar2, nVar, pVar, arrayList2));
                            i2 = 0;
                        }
                        return c6d.b.N(arrayList);
                    default:
                        String charityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311954b.f311955a.getCharityCampaigns(charityId3);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: ya6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311950b;

            {
                this.f311950b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String charityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311950b.f311955a.getCharityCampaigns(charityId);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String charityId2 = (String) obj2;
                        List campaigns = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                        this.f311950b.f311957c.f("charity_campaigns_" + charityId2, campaigns);
                        break;
                    default:
                        String charityId3 = (String) obj2;
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        ja6.b bVar = this.f311950b.f311956b;
                        List<ba6.r> list = campaigns2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (ba6.r rVar : list) {
                            Intrinsics.checkNotNullParameter(rVar, "<this>");
                            Intrinsics.checkNotNullParameter(charityId3, "charityId");
                            String str = rVar.f13954a;
                            String string = rVar.f13955b.toString();
                            ba6.n nVar = rVar.f13956c;
                            String str2 = nVar.f13952a.f13615a;
                            String str3 = nVar.f13953b;
                            String string2 = rVar.d.toString();
                            ArrayList arrayList2 = rVar.e;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(hx7.a.A((dj0.d) it8.next()));
                            }
                            arrayList.add(new la6.f(charityId3, str, string, str2, str3, arrayList3, string2));
                        }
                        DBUtil.performBlocking(bVar.f172443a, false, true, new ja6.a(bVar, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: ya6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311954b;

            {
                this.f311954b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ba6.p pVar;
                ba6.q qVar;
                switch (i2) {
                    case 0:
                        String charityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        return (List) v1.c.s("charity_campaigns_", charityId, this.f311954b.f311957c);
                    case 1:
                        String charityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        ja6.b bVar = this.f311954b.f311956b;
                        RoomDatabase roomDatabase = bVar.f172443a;
                        j4h.m mVar = new j4h.m(bVar, charityId2, 20);
                        int i22 = 0;
                        List<la6.f> list = (List) DBUtil.performBlocking(roomDatabase, true, false, mVar);
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (la6.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            String str = fVar.f193329b;
                            String str2 = fVar.f193330c;
                            ba6.q[] qVarArrValues = ba6.q.values();
                            int length = qVarArrValues.length;
                            int i3 = i22;
                            while (true) {
                                pVar = null;
                                if (i3 < length) {
                                    qVar = qVarArrValues[i3];
                                    if (!kotlin.text.a0.z(qVar.name(), str2, true)) {
                                        i3++;
                                    }
                                } else {
                                    qVar = null;
                                }
                            }
                            if (qVar == null) {
                                qVar = ba6.q.UNKNOWN;
                            }
                            ba6.q qVar2 = qVar;
                            ba6.n nVar = new ba6.n(new b93.b(fVar.d), fVar.e);
                            String str3 = fVar.f;
                            ba6.p[] pVarArrValues = ba6.p.values();
                            int length2 = pVarArrValues.length;
                            int i5 = i22;
                            while (true) {
                                if (i5 < length2) {
                                    ba6.p pVar2 = pVarArrValues[i5];
                                    if (kotlin.text.a0.z(pVar2.name(), str3, true)) {
                                        pVar = pVar2;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (pVar == null) {
                                pVar = ba6.p.UNKNOWN;
                            }
                            List list2 = fVar.f193331g;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(hx7.a.v((jo3.b) it8.next()));
                            }
                            arrayList.add(new ba6.r(str, qVar2, nVar, pVar, arrayList2));
                            i22 = 0;
                        }
                        return c6d.b.N(arrayList);
                    default:
                        String charityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311954b.f311955a.getCharityCampaigns(charityId3);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ya6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311950b;

            {
                this.f311950b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String charityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311950b.f311955a.getCharityCampaigns(charityId);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String charityId2 = (String) obj2;
                        List campaigns = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                        this.f311950b.f311957c.f("charity_campaigns_" + charityId2, campaigns);
                        break;
                    default:
                        String charityId3 = (String) obj2;
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        ja6.b bVar = this.f311950b.f311956b;
                        List<ba6.r> list = campaigns2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (ba6.r rVar : list) {
                            Intrinsics.checkNotNullParameter(rVar, "<this>");
                            Intrinsics.checkNotNullParameter(charityId3, "charityId");
                            String str = rVar.f13954a;
                            String string = rVar.f13955b.toString();
                            ba6.n nVar = rVar.f13956c;
                            String str2 = nVar.f13952a.f13615a;
                            String str3 = nVar.f13953b;
                            String string2 = rVar.d.toString();
                            ArrayList arrayList2 = rVar.e;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(hx7.a.A((dj0.d) it8.next()));
                            }
                            arrayList.add(new la6.f(charityId3, str, string, str2, str3, arrayList3, string2));
                        }
                        DBUtil.performBlocking(bVar.f172443a, false, true, new ja6.a(bVar, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        this.e = new jpf.a(new Function1(this) { // from class: ya6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f311954b;

            {
                this.f311954b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ba6.p pVar;
                ba6.q qVar;
                switch (i3) {
                    case 0:
                        String charityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        return (List) v1.c.s("charity_campaigns_", charityId, this.f311954b.f311957c);
                    case 1:
                        String charityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        ja6.b bVar = this.f311954b.f311956b;
                        RoomDatabase roomDatabase = bVar.f172443a;
                        j4h.m mVar = new j4h.m(bVar, charityId2, 20);
                        int i22 = 0;
                        List<la6.f> list = (List) DBUtil.performBlocking(roomDatabase, true, false, mVar);
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (la6.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            String str = fVar.f193329b;
                            String str2 = fVar.f193330c;
                            ba6.q[] qVarArrValues = ba6.q.values();
                            int length = qVarArrValues.length;
                            int i32 = i22;
                            while (true) {
                                pVar = null;
                                if (i32 < length) {
                                    qVar = qVarArrValues[i32];
                                    if (!kotlin.text.a0.z(qVar.name(), str2, true)) {
                                        i32++;
                                    }
                                } else {
                                    qVar = null;
                                }
                            }
                            if (qVar == null) {
                                qVar = ba6.q.UNKNOWN;
                            }
                            ba6.q qVar2 = qVar;
                            ba6.n nVar = new ba6.n(new b93.b(fVar.d), fVar.e);
                            String str3 = fVar.f;
                            ba6.p[] pVarArrValues = ba6.p.values();
                            int length2 = pVarArrValues.length;
                            int i5 = i22;
                            while (true) {
                                if (i5 < length2) {
                                    ba6.p pVar2 = pVarArrValues[i5];
                                    if (kotlin.text.a0.z(pVar2.name(), str3, true)) {
                                        pVar = pVar2;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (pVar == null) {
                                pVar = ba6.p.UNKNOWN;
                            }
                            List list2 = fVar.f193331g;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(hx7.a.v((jo3.b) it8.next()));
                            }
                            arrayList.add(new ba6.r(str, qVar2, nVar, pVar, arrayList2));
                            i22 = 0;
                        }
                        return c6d.b.N(arrayList);
                    default:
                        String charityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(charityId3, "charityId");
                        efm.d0<va6.f> charityCampaigns = this.f311954b.f311955a.getCharityCampaigns(charityId3);
                        y25.c cVar = new y25.c(new y99.x(9), 28);
                        charityCampaigns.getClass();
                        ufm.i iVar = new ufm.i(charityCampaigns, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, null, 62);
    }
}
