package ej9;

import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import com.revolut.rxdata.core.CompositeException;
import ej9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zh9.d1;
import zh9.s0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements ci9.a {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterApiService f126821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi9.c f126822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f126823c;
    public final com.google.firebase.messaging.t d;
    public final com.google.firebase.messaging.t e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f126824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f126825h;

    public p(PayLaterApiService api2, gi9.c planDao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(planDao, "planDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f126821a = api2;
        this.f126822b = planDao;
        this.f126823c = memoryCache;
        final int i = 4;
        this.d = new com.google.firebase.messaging.t(new j(this, 3), new j(this, 7), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i2) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 5;
        this.e = new com.google.firebase.messaging.t(new j(this, 8), new j(this, 9), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i22) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 6;
        final int i5 = 7;
        final int i6 = 0;
        this.f = new w4l.f(new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i22) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, new j(this, 10), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i22) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, new j(this, 12), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i22) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 1;
        final int i22 = 2;
        final int i32 = 3;
        this.f126824g = new w4l.f(new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i21;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i222) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, new j(this, 4), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i22;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i222) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, new j(this, 5), new Function2(this) { // from class: ej9.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f126818b;

            {
                this.f126818b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                String str = "<this>";
                p pVar = this.f126818b;
                switch (i222) {
                    case 0:
                        List repayments = (List) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(repayments, "repayments");
                        gi9.c cVar = pVar.f126822b;
                        List<d1> list = repayments;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (d1 d1Var : list) {
                            Intrinsics.checkNotNullParameter(d1Var, str);
                            arrayList.add(new hi9.o(d1Var.f322261c, d1Var.d, d1Var.e, d1Var.f, d1Var.f322259a, d1Var.f322260b));
                            str = str;
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f144100a, false, true, new gi9.a(cVar, arrayList, 2));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<dj9.k> planDetails = pVar.f126821a.getPlanDetails(id10);
                        o oVar = o.f;
                        dug.e eVar = new dug.e(12);
                        planDetails.getClass();
                        ufm.i iVar = new ufm.i(planDetails, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        String id11 = (String) obj2;
                        s0 details = (s0) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(details, "details");
                        pVar.f126823c.f(a10.b.t(id11, "planId", "PLAN_DETAILS_:", id11), details);
                        return Unit.f186387a;
                    case 3:
                        String planId = (String) obj2;
                        s0 details2 = (s0) obj3;
                        Intrinsics.checkNotNullParameter(planId, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        gi9.c cVar2 = pVar.f126822b;
                        Intrinsics.checkNotNullParameter(details2, "<this>");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        hi9.b bVar = new hi9.b(planId, details2.f322343a);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f144100a, false, true, new gbi.c(cVar2, bVar, 20));
                        return Unit.f186387a;
                    case 4:
                        d.b key = (d.b) obj2;
                        List plans = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        ne0.d dVar = pVar.f126823c;
                        key.getClass();
                        dVar.f("PAY_LATER_PLANS", plans);
                        return Unit.f186387a;
                    case 5:
                        String planId2 = (String) obj2;
                        od0.i plan = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        pVar.f126823c.f(a10.b.t(planId2, "planId", "PLAN_ID_:", planId2), plan);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<dj9.t>> transactionRepayments = pVar.f126821a.getTransactionRepayments(params.f126820b, params.f126819a);
                        eif.h hVar = new eif.h(new ei8.d(params, 5), 27);
                        transactionRepayments.getClass();
                        ufm.i iVar2 = new ufm.i(transactionRepayments, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        n params2 = (n) obj2;
                        List repayment = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(repayment, "repayment");
                        ne0.d dVar2 = pVar.f126823c;
                        String transactionId = params2.f126819a;
                        String facilityId = params2.f126820b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        dVar2.f(a0.d.u(new StringBuilder("REPAYMENTS_PARTS:"), facilityId, "-", transactionId), repayment);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        this.f126825h = new ao.h(20, new j(this, 6));
    }

    public static Throwable a(Throwable th10, Throwable th11) {
        Throwable[] elements = {th10, th11};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        return ((ArrayList) listL).size() > 1 ? new CompositeException(listL) : (Throwable) zhm.d0.M0(listL);
    }

    public static long d(List list) {
        Iterator it8 = list.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        long updateDateTime = ((dj9.o) it8.next()).getUpdateDateTime();
        while (it8.hasNext()) {
            long updateDateTime2 = ((dj9.o) it8.next()).getUpdateDateTime();
            if (updateDateTime < updateDateTime2) {
                updateDateTime = updateDateTime2;
            }
        }
        return updateDateTime;
    }

    public final pfm.r b() {
        efm.d0 d0VarK = this.f126825h.k(new m());
        d0VarK.getClass();
        pfm.h hVar = new pfm.h(d0VarK, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return te0.w.g0(hVar);
    }

    public final efm.r c(List list) {
        if (list.size() < 200) {
            efm.r rVarJust = efm.r.just(list);
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        efm.r rVarJust2 = efm.r.just(list);
        efm.d0<List<dj9.o>> payLaterPlans = this.f126821a.getPayLaterPlans(200, Long.valueOf(d(list)));
        eif.h hVar = new eif.h(new j(this, 0), 19);
        payLaterPlans.getClass();
        efm.r rVarConcat = efm.r.concat(rVarJust2, new sfm.b(payLaterPlans, hVar, 2));
        Intrinsics.h(rVarConcat);
        return rVarConcat;
    }

    public final efm.r e() {
        pfm.r rVarB = b();
        gi9.c cVar = this.f126822b;
        sfm.b bVarG = rVarB.g(RxRoom.createObservable(cVar.f144100a, true, new String[]{"repayments", "plan_preferences", "plans"}, new gd3.i(cVar, 19)).take(1L).map(new eif.h(new ej6.x(3), 20)));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.r rVarStartWith = ue0.e.H(bVarG, h0.f322473a, new ej6.x(4)).startWith(new Data(null, null, true, 3, null));
        efm.r rVarL = this.d.l(d.b.f126794a);
        Intrinsics.h(rVarStartWith);
        efm.r rVarDistinctUntilChanged = te0.w.l(rVarL, rVarStartWith).map(new eif.h(new ej6.x(this), 21)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
