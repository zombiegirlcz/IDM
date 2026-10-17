package lfg;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.miles.api.model.TravelMilesTransaction;
import com.revolut.feature.travel.miles.impl.network.TravelMilesService;
import hfg.o0;
import hfg.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ofg.j f194902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesService f194903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f194904c;
    public final CopyOnWriteArraySet d;
    public final w4l.f e;

    public k0(ofg.j transactionsDao, TravelMilesService milesService, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(transactionsDao, "transactionsDao");
        Intrinsics.checkNotNullParameter(milesService, "milesService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f194902a = transactionsDao;
        this.f194903b = milesService;
        this.f194904c = memoryCache;
        this.d = new CopyOnWriteArraySet();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: lfg.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f194895b;

            {
                this.f194895b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        gfg.b params = (gfg.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesService travelMilesService = this.f194895b.f194903b;
                        params.getClass();
                        efm.d0<xfg.k0> topUps = travelMilesService.getTopUps(20, params.f143406a);
                        le3.y yVar = new le3.y(new z(12), 27);
                        topUps.getClass();
                        ufm.i iVar = new ufm.i(topUps, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        gfg.b params2 = (gfg.b) obj2;
                        List topUps2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(topUps2, "topUps");
                        k0.Companion.getClass();
                        String strA = j0.a(params2);
                        k0 k0Var = this.f194895b;
                        k0Var.f194904c.f(strA, topUps2);
                        k0Var.d.add(strA);
                        break;
                    default:
                        List topUps3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((gfg.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topUps3, "topUps");
                        ofg.j jVar = this.f194895b.f194902a;
                        List<o0> list = topUps3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (o0 o0Var : list) {
                            Intrinsics.checkNotNullParameter(o0Var, "<this>");
                            String str = o0Var.f151877a;
                            long epochMilli = o0Var.f151878b.toEpochMilli();
                            long epochMilli2 = o0Var.f151879c.toEpochMilli();
                            p0 p0Var = o0Var.e;
                            qfg.m mVar = new qfg.m(str, p0Var != null ? p0Var.toString() : null, epochMilli, epochMilli2);
                            ArrayList<TravelMilesTransaction> arrayList2 = o0Var.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (TravelMilesTransaction travelMilesTransaction : arrayList2) {
                                String topUpId = o0Var.f151877a;
                                Intrinsics.checkNotNullParameter(travelMilesTransaction, "<this>");
                                Intrinsics.checkNotNullParameter(topUpId, "topUpId");
                                arrayList3.add(new qfg.o(travelMilesTransaction.f94145a, travelMilesTransaction.f94146b.name(), travelMilesTransaction.f94147c.name(), travelMilesTransaction.d.name(), topUpId));
                            }
                            arrayList.add(new qfg.n(mVar, arrayList3));
                        }
                        DBUtil.performBlocking(jVar.f224853a, false, true, new ofg.a(jVar, arrayList, 3));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: lfg.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f194900b;

            {
                this.f194900b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 390
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lfg.i0.invoke(java.lang.Object):java.lang.Object");
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: lfg.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f194895b;

            {
                this.f194895b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        gfg.b params = (gfg.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesService travelMilesService = this.f194895b.f194903b;
                        params.getClass();
                        efm.d0<xfg.k0> topUps = travelMilesService.getTopUps(20, params.f143406a);
                        le3.y yVar = new le3.y(new z(12), 27);
                        topUps.getClass();
                        ufm.i iVar = new ufm.i(topUps, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        gfg.b params2 = (gfg.b) obj2;
                        List topUps2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(topUps2, "topUps");
                        k0.Companion.getClass();
                        String strA = j0.a(params2);
                        k0 k0Var = this.f194895b;
                        k0Var.f194904c.f(strA, topUps2);
                        k0Var.d.add(strA);
                        break;
                    default:
                        List topUps3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((gfg.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topUps3, "topUps");
                        ofg.j jVar = this.f194895b.f194902a;
                        List<o0> list = topUps3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (o0 o0Var : list) {
                            Intrinsics.checkNotNullParameter(o0Var, "<this>");
                            String str = o0Var.f151877a;
                            long epochMilli = o0Var.f151878b.toEpochMilli();
                            long epochMilli2 = o0Var.f151879c.toEpochMilli();
                            p0 p0Var = o0Var.e;
                            qfg.m mVar = new qfg.m(str, p0Var != null ? p0Var.toString() : null, epochMilli, epochMilli2);
                            ArrayList<TravelMilesTransaction> arrayList2 = o0Var.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (TravelMilesTransaction travelMilesTransaction : arrayList2) {
                                String topUpId = o0Var.f151877a;
                                Intrinsics.checkNotNullParameter(travelMilesTransaction, "<this>");
                                Intrinsics.checkNotNullParameter(topUpId, "topUpId");
                                arrayList3.add(new qfg.o(travelMilesTransaction.f94145a, travelMilesTransaction.f94146b.name(), travelMilesTransaction.f94147c.name(), travelMilesTransaction.d.name(), topUpId));
                            }
                            arrayList.add(new qfg.n(mVar, arrayList3));
                        }
                        DBUtil.performBlocking(jVar.f224853a, false, true, new ofg.a(jVar, arrayList, 3));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: lfg.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f194900b;

            {
                this.f194900b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 390
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lfg.i0.invoke(java.lang.Object):java.lang.Object");
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: lfg.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f194895b;

            {
                this.f194895b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        gfg.b params = (gfg.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesService travelMilesService = this.f194895b.f194903b;
                        params.getClass();
                        efm.d0<xfg.k0> topUps = travelMilesService.getTopUps(20, params.f143406a);
                        le3.y yVar = new le3.y(new z(12), 27);
                        topUps.getClass();
                        ufm.i iVar = new ufm.i(topUps, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        gfg.b params2 = (gfg.b) obj2;
                        List topUps2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(topUps2, "topUps");
                        k0.Companion.getClass();
                        String strA = j0.a(params2);
                        k0 k0Var = this.f194895b;
                        k0Var.f194904c.f(strA, topUps2);
                        k0Var.d.add(strA);
                        break;
                    default:
                        List topUps3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((gfg.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topUps3, "topUps");
                        ofg.j jVar = this.f194895b.f194902a;
                        List<o0> list = topUps3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (o0 o0Var : list) {
                            Intrinsics.checkNotNullParameter(o0Var, "<this>");
                            String str = o0Var.f151877a;
                            long epochMilli = o0Var.f151878b.toEpochMilli();
                            long epochMilli2 = o0Var.f151879c.toEpochMilli();
                            p0 p0Var = o0Var.e;
                            qfg.m mVar = new qfg.m(str, p0Var != null ? p0Var.toString() : null, epochMilli, epochMilli2);
                            ArrayList<TravelMilesTransaction> arrayList2 = o0Var.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (TravelMilesTransaction travelMilesTransaction : arrayList2) {
                                String topUpId = o0Var.f151877a;
                                Intrinsics.checkNotNullParameter(travelMilesTransaction, "<this>");
                                Intrinsics.checkNotNullParameter(topUpId, "topUpId");
                                arrayList3.add(new qfg.o(travelMilesTransaction.f94145a, travelMilesTransaction.f94146b.name(), travelMilesTransaction.f94147c.name(), travelMilesTransaction.d.name(), topUpId));
                            }
                            arrayList.add(new qfg.n(mVar, arrayList3));
                        }
                        DBUtil.performBlocking(jVar.f224853a, false, true, new ofg.a(jVar, arrayList, 3));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
