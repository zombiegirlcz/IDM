package er9;

import androidx.room.util.DBUtil;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import dp4.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class x implements f {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq9.h f128596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yq9.l f128597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yq9.b f128598c;
    public final yq9.e d;
    public final yq9.o e;
    public final yq9.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PaymentsGroupsService f128599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne0.j f128600h;
    public final qz0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w01.e f128601j;
    public final r80.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r10.f f128602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ue0.c f128603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.e f128604n;
    public final qe0.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qe0.s f128605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w4l.f f128606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w4l.f f128607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w4l.f f128608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w4l.f f128609t;
    public final w4l.f u;
    public final x4l.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x4l.c f128610w;

    public x(yq9.h groupsDao, yq9.l groupsMembersDao, yq9.b groupsBillsDao, yq9.e groupsBillsSplitsDao, yq9.o groupsSettlementsDao, yq9.i groupsDebtsDao, PaymentsGroupsService service, ne0.j memoryCache, qz0.j urlImagesRepository, w01.e drawableToFileConverter, r80.c imageCompressTransformer, r10.f groupMemberContactMapper, ue0.c storage, l80.e dateTimeProvider, ze0.a forceReloadStrategyFactory, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(groupsDao, "groupsDao");
        Intrinsics.checkNotNullParameter(groupsMembersDao, "groupsMembersDao");
        Intrinsics.checkNotNullParameter(groupsBillsDao, "groupsBillsDao");
        Intrinsics.checkNotNullParameter(groupsBillsSplitsDao, "groupsBillsSplitsDao");
        Intrinsics.checkNotNullParameter(groupsSettlementsDao, "groupsSettlementsDao");
        Intrinsics.checkNotNullParameter(groupsDebtsDao, "groupsDebtsDao");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(drawableToFileConverter, "drawableToFileConverter");
        Intrinsics.checkNotNullParameter(imageCompressTransformer, "imageCompressTransformer");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f128596a = groupsDao;
        this.f128597b = groupsMembersDao;
        this.f128598c = groupsBillsDao;
        this.d = groupsBillsSplitsDao;
        this.e = groupsSettlementsDao;
        this.f = groupsDebtsDao;
        this.f128599g = service;
        this.f128600h = memoryCache;
        this.i = urlImagesRepository;
        this.f128601j = drawableToFileConverter;
        this.k = imageCompressTransformer;
        this.f128602l = groupMemberContactMapper;
        this.f128603m = storage;
        this.f128604n = dateProvider;
        final int i = 17;
        this.o = new qe0.q(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i2 = i;
                int i3 = 18;
                int i5 = 1;
                x xVar = this.f128568b;
                switch (i2) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i6++;
                            }
                        }
                        if (i6 >= 0) {
                            arrayListF1.set(i6, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i3));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i3), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i21 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i21 == i5) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i21 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i5 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i3), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i5), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 4), 30000L, dateTimeProvider);
        this.f128605p = ((ze0.c) forceReloadStrategyFactory).b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
        final int i2 = 11;
        final int i3 = 14;
        final int i5 = 15;
        this.f128606q = new w4l.f(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i22 = i2;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i22) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i6++;
                            }
                        }
                        if (i6 >= 0) {
                            arrayListF1.set(i6, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i21 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i21 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i21 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 13), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i22 = i3;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i22) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i6++;
                            }
                        }
                        if (i6 >= 0) {
                            arrayListF1.set(i6, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i21 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i21 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i21 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i22 = i5;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i22) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i6++;
                            }
                        }
                        if (i6 >= 0) {
                            arrayListF1.set(i6, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i21 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i21 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i21 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 14), new h(this, 15), null, 136);
        final int i6 = 16;
        final int i21 = 0;
        final int i22 = 1;
        this.f128607r = new w4l.f(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i6;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 16), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i21;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i22;
                int i32 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i32));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i32), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i32), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new h(this, 0), null, 168);
        final int i32 = 2;
        final int i33 = 3;
        final int i43 = 4;
        this.f128608s = new w4l.f(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i32;
                int i322 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 1), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i33;
                int i322 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i43;
                int i322 = 18;
                int i59 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i66 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i66 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i66++;
                            }
                        }
                        if (i66 >= 0) {
                            arrayListF1.set(i66, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i59) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i59 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i59), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 2), new h(this, 3), null, 136);
        final int i59 = 5;
        final int i66 = 6;
        final int i74 = 7;
        this.f128609t = new w4l.f(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i59;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 5), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i66;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i74;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 6), new h(this, 7), null, 136);
        final int i92 = 8;
        final int i96 = 9;
        final int i99 = 10;
        this.u = new w4l.f(new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i92;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 8), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i96;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, null, new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i99;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new h(this, 9), new h(this, 10), null, 136);
        Continuation continuation = null;
        final int i100 = 12;
        this.v = new x4l.c(new s(this, continuation, 0), new h(this, 11), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i100;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new t(this, continuation, 0), new f1(this, continuation, 11));
        final int i101 = 13;
        this.f128610w = new x4l.c(new s(this, continuation, 1), new h(this, 12), new Function2(this) { // from class: er9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f128568b;

            {
                this.f128568b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ar9.p pVar;
                int i222 = i101;
                int i322 = 18;
                int i592 = 1;
                x xVar = this.f128568b;
                switch (i222) {
                    case 0:
                        PaymentGroup group = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group, "group");
                        ne0.j jVar = xVar.f128600h;
                        List list = (List) jVar.get("CACHE_KEY_GROUPS");
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = d0.f1(list);
                        Iterator it8 = arrayListF1.iterator();
                        int i662 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i662 = -1;
                            } else if (!Intrinsics.f(((PaymentGroup) it8.next()).f79285a, group.f79285a)) {
                                i662++;
                            }
                        }
                        if (i662 >= 0) {
                            arrayListF1.set(i662, group);
                        } else {
                            arrayListF1.add(size, group);
                        }
                        jVar.f("CACHE_KEY_GROUPS", arrayListF1);
                        return Unit.f186387a;
                    case 1:
                        PaymentGroup group2 = (PaymentGroup) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(group2, "group");
                        yq9.h hVar = xVar.f128596a;
                        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(group2), i322));
                        xVar.f128597b.b(z92.f.L(group2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                        PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                        efm.d0<List<cr9.l>> groupBills = paymentsGroupsService.getGroupBills(groupId, null);
                        k kVar = new k(24, new eqd.h(13));
                        groupBills.getClass();
                        ufm.i iVar = new ufm.i(groupBills, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar = new ufm.f(new ufm.i(te0.w.H0(iVar, xVar.c(groupId)), new eli.k(new e2j.i(groupId, 17), 14), 1), new eli.k(new i(xVar, groupId, 0), 15), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 3:
                        String groupId2 = (String) obj2;
                        List groupBills2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills2, "groupBills");
                        ehe.n.z("CACHE_KEY_BILLS", groupId2, xVar.f128600h, groupBills2);
                        return Unit.f186387a;
                    case 4:
                        String groupId3 = (String) obj2;
                        List groupBills3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(groupBills3, "groupBills");
                        yq9.c cVar = (yq9.c) xVar.f128598c;
                        DBUtil.performBlocking(cVar.f315994a, false, true, new xwd.o(cVar, 21, groupId3, v13.d.X(groupBills3)));
                        yq9.e eVar = xVar.d;
                        DBUtil.performBlocking(eVar.f315999a, false, true, new xwd.o(eVar, 22, groupId3, v13.d.b0(groupBills3)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String groupId4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                        PaymentsGroupsService.Companion companion2 = PaymentsGroupsService.INSTANCE;
                        ufm.f fVar2 = new ufm.f(new ufm.i(te0.w.H0(paymentsGroupsService2.getGroupSettlements(groupId4, null), xVar.c(groupId4)), new eli.k(new e2j.i(groupId4, 16), i322), 1), new eli.k(new i(xVar, groupId4, 4), 27), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 6:
                        String groupId5 = (String) obj2;
                        List groupSettlements = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                        ehe.n.z("CACHE_KEY_SETTLEMENTS", groupId5, xVar.f128600h, groupSettlements);
                        return Unit.f186387a;
                    case 7:
                        String groupId6 = (String) obj2;
                        List groupSettlements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId6, "groupId");
                        Intrinsics.checkNotNullParameter(groupSettlements2, "groupSettlements");
                        yq9.o oVar = xVar.e;
                        DBUtil.performBlocking(oVar.f316023a, false, true, new xwd.o(oVar, 24, groupId6, a.a.K(groupSettlements2)));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String groupId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId7, "groupId");
                        ufm.f fVar3 = new ufm.f(new ufm.i(te0.w.H0(xVar.f128599g.getGroupDebts(groupId7, true), xVar.c(groupId7)), new k(5, new e2j.i(groupId7, 19)), 1), new k(15, new i(xVar, groupId7, 9)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                        return fVar3;
                    case 9:
                        String params = (String) obj2;
                        List groupDebts = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                        ehe.n.z("CACHE_KEY_DEBTS", params, xVar.f128600h, groupDebts);
                        return Unit.f186387a;
                    case 10:
                        String groupId8 = (String) obj2;
                        List groupDebts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(groupId8, "groupId");
                        Intrinsics.checkNotNullParameter(groupDebts2, "groupDebts");
                        yq9.i iVar2 = xVar.f;
                        Intrinsics.checkNotNullParameter(groupDebts2, "<this>");
                        List<st9.e> list2 = groupDebts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (st9.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String str = eVar2.f265542a;
                            String str2 = eVar2.f265543b;
                            ar9.q qVar = ar9.q.OWE;
                            int i212 = br9.e.f17958b[eVar2.f265544c.ordinal()];
                            if (i212 == i592) {
                                pVar = ar9.p.ACTIVE;
                            } else {
                                if (i212 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pVar = ar9.p.PENDING;
                            }
                            ar9.p pVar2 = pVar;
                            dj0.d dVar = eVar2.d;
                            long j2 = dVar.f115082a;
                            String str3 = dVar.f115083b.f306286a;
                            dj0.d dVar2 = eVar2.e;
                            arrayList.add(new ar9.o(str, str2, qVar, pVar2, j2, str3, dVar2.f115082a, dVar2.f115083b.f306286a, eVar2.f265545g.b(), eVar2.f.b(), eVar2.f265546h));
                            i592 = 1;
                        }
                        DBUtil.performBlocking(iVar2.f316008a, false, true, new xwd.o(iVar2, 23, groupId8, arrayList));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<cr9.v>> groups = xVar.f128599g.getGroups(true);
                        eli.k kVar2 = new eli.k(new h(xVar, 19), 24);
                        groups.getClass();
                        ufm.f fVar4 = new ufm.f(new ufm.i(groups, kVar2, 0), new eli.k(new h(xVar, 20), 25), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar4, "doOnSuccess(...)");
                        return fVar4;
                    case 12:
                        String groupId9 = (String) obj2;
                        st9.f paymentGroupLink = (st9.f) obj3;
                        Intrinsics.checkNotNullParameter(groupId9, "groupId");
                        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                        xVar.f128600h.f(x.b(groupId9), paymentGroupLink);
                        return Unit.f186387a;
                    case 13:
                        String groupId10 = (String) obj2;
                        cr9.b response = (cr9.b) obj3;
                        Intrinsics.checkNotNullParameter(groupId10, "groupId");
                        Intrinsics.checkNotNullParameter(response, "response");
                        xVar.f128600h.f("CACHE_KEY_MESSAGES_ELIGIBILITY_" + groupId10, response);
                        return Unit.f186387a;
                    case 14:
                        List groups2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups2, "groups");
                        xVar.f128600h.f("CACHE_KEY_GROUPS", groups2);
                        return Unit.f186387a;
                    case 15:
                        List groups3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups3, "groups");
                        yq9.h hVar2 = xVar.f128596a;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list3 = groups3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(z92.f.J((PaymentGroup) it10.next()));
                        }
                        DBUtil.performBlocking(hVar2.f316005a, false, true, new yq9.f(hVar2, arrayList2, 0));
                        yq9.l lVar = xVar.f128597b;
                        Intrinsics.checkNotNullParameter(groups3, "<this>");
                        List list4 = groups3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(z92.f.L((PaymentGroup) it11.next()));
                        }
                        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.j(lVar, zhm.w.u(arrayList3), 0));
                        return Unit.f186387a;
                    case 16:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String groupId11 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId11, "groupId");
                        efm.d0<cr9.v> group3 = xVar.f128599g.getGroup(true, groupId11);
                        eli.k kVar3 = new eli.k(new h(xVar, i322), 19);
                        group3.getClass();
                        ufm.f fVar5 = new ufm.f(new ufm.i(group3, kVar3, 0), new eli.k(new i(xVar, groupId11, i592), 20), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar5, "doOnSuccess(...)");
                        return fVar5;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        xVar.f128600h.f(key, l2);
                        return Unit.f186387a;
                }
            }
        }, new t(this, continuation, 1), new f1(this, continuation, 12));
    }

    public static String b(String str) {
        return j6.a.q("CACHE_KEY_GROUP_INVITATION_LINK_", str);
    }

    public final ufm.n a(String groupId, Image image) {
        efm.d0 d0VarL;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(image, "image");
        if (image instanceof ResourceImage) {
            int i = ((ResourceImage) image).f59995a;
            w01.e eVar = this.f128601j;
            eVar.getClass();
            Intrinsics.checkNotNullParameter("payment_group_background_image.jpeg", "filename");
            d0VarL = ((a80.h) eVar.f293611b).o(zk0.a.INTERNAL_CACHE, new a80.e(eVar, i, 9), "payment_group_background_image.jpeg");
        } else if (image instanceof FileImage) {
            d0VarL = efm.d0.m(((FileImage) image).f59917a);
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (image instanceof UrlImage) {
            d0VarL = ((qz0.n) this.i).d((UrlImage) image);
        } else {
            d0VarL = efm.d0.l(new IllegalStateException("Image type not supported"));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
        }
        ufm.i iVar = new ufm.i(d0VarL, new k(7, new m(this, image, 1)), 0);
        int i2 = 8;
        ufm.f fVar = new ufm.f(new ufm.i(new ufm.i(iVar, new k(i2, new i(this, groupId, i2)), 0), new k(9, new h(this, 26)), 0), new k(10, new h(this, 27)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return te0.w.i0(fVar);
    }

    public final ufm.i c(String str) {
        ufm.i iVar = new ufm.i(new ufm.c(new j(this, str, 1), 2), new k(0, new h(this, 24)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof er9.w
            if (r0 == 0) goto L13
            r0 = r6
            er9.w r0 = (er9.w) r0
            int r1 = r0.f128595w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128595w = r1
            goto L18
        L13:
            er9.w r0 = new er9.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128595w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            er9.p r6 = new er9.p
            r2 = 0
            r6.<init>(r4, r5, r2, r3)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            r0.f128595w = r3
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "onIo(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: er9.x.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final ufm.i e(cr9.v vVar) {
        ufm.i iVar = new ufm.i(new ufm.c(new a31.l(vVar, 18), 2), new eli.k(new h(this, 23), 29), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r f(String groupId, boolean z) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return this.u.f(groupId, this.o.a("RELOAD_STRATEGY_KEY_DEBTS" + groupId, z));
    }

    public final efm.r g(boolean z) {
        Unit unit = Unit.f186387a;
        return this.f128606q.f(unit, this.f128605p.a(unit, z));
    }

    public final pfm.a h(String str) {
        efm.b bVarJ = efm.b.j(mo3.a.n(this.f128606q.f(Unit.f186387a, true)).ignoreElements(), mo3.a.n(this.f128608s.f(str, true)).ignoreElements(), mo3.a.n(this.f128609t.f(str, true)).ignoreElements(), mo3.a.n(this.u.f(str, true)).ignoreElements());
        Intrinsics.checkNotNullExpressionValue(bVarJ, "concatArray(...)");
        return ue0.e.v(bVarJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(w4l.f fVar, PaymentGroup paymentGroup) {
        Object objC;
        ar9.r rVarJ = z92.f.J(paymentGroup);
        yq9.h hVar = this.f128596a;
        DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, rVarJ, 18));
        String f79285a = paymentGroup.getF79285a();
        ArrayList arrayListL = z92.f.L(paymentGroup);
        yq9.l lVar = this.f128597b;
        DBUtil.performBlocking(lVar.f316016a, false, true, new yq9.k(lVar, f79285a, arrayListL, 0));
        ne0.j jVar = this.f128600h;
        List list = (List) jVar.get("CACHE_KEY_GROUPS");
        if (list != null) {
            List list2 = list;
            objC = new ArrayList(zhm.w.t(list2, 10));
            for (Object obj2 : list2) {
                if (Intrinsics.f(paymentGroup.getF79285a(), ((PaymentGroup) obj2).getF79285a())) {
                    obj2 = paymentGroup;
                }
                objC.add(obj2);
            }
            if (objC.isEmpty()) {
                objC = d0.F0(paymentGroup, objC);
            } else {
                Iterator it8 = objC.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(paymentGroup.getF79285a(), ((PaymentGroup) it8.next()).getF79285a())) {
                        break;
                    }
                }
                objC = d0.F0(paymentGroup, objC);
            }
        } else {
            objC = zhm.u.c(paymentGroup);
        }
        jVar.f("CACHE_KEY_GROUPS", objC);
        fVar.c(null, (1 & 2) == 0, new eqd.h(11));
    }
}
