package lrk;

import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.stockdetails.impl.data.network.StockFinancialsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.b2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StockFinancialsService f199532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.d f199533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f199534c;
    public final w4l.f d;

    public i(StockFinancialsService service, ark.d dao, xqk.a cache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f199532a = service;
        this.f199533b = dao;
        int i = 0;
        final int i2 = 1;
        final int i3 = 0;
        this.f199534c = new w4l.f(w.k0(networkStateRepository, new l3l.m(i2, this, i.class, "stockFinancialsFromNetwork", "stockFinancialsFromNetwork$feature_stock_details_impl_release(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsParams;)Lio/reactivex/Single;", i, 27)), new l3l.m(1, cache, xqk.a.class, "getRefsForScope", "getRefsForScope(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsParams;)Ljava/util/List;", 0, 28), new b2(2, cache, xqk.a.class, "cacheRefsForScope", "cacheRefsForScope(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsParams;Ljava/util/List;)V", 0, 4), new l3l.m(i2, this, i.class, "stockFinancialsFromStorage", "stockFinancialsFromStorage$feature_stock_details_impl_release(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsParams;)Ljava/util/List;", i, 29), new Function2(this) { // from class: lrk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f199529b;

            {
                this.f199529b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                drk.c cVar;
                drk.a aVar;
                drk.b bVar;
                int i5 = i3;
                i iVar = this.f199529b;
                final int i6 = 1;
                switch (i5) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((wrk.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        final ark.d dVar = iVar.f199533b;
                        List<uqk.d> list = data;
                        final ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (uqk.d dVar2 : list) {
                            Object obj4 = grk.c.f146055a;
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            String str = dVar2.f282207a;
                            int i21 = dVar2.f282208b;
                            Integer num = dVar2.f282209c;
                            uqk.c cVar2 = dVar2.d;
                            if (cVar2 != null) {
                                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                                dj0.d dVar3 = cVar2.f282204a;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                dj0.d dVar4 = cVar2.f282205b;
                                cVar = new drk.c(bVarA, dVar4 != null ? hx7.a.A(dVar4) : null, cVar2.f282206c);
                            } else {
                                cVar = null;
                            }
                            uqk.a aVar2 = dVar2.e;
                            if (aVar2 != null) {
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                dj0.d dVar5 = aVar2.f282198a;
                                jo3.b bVarA2 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = aVar2.f282199b;
                                aVar = new drk.a(bVarA2, dVar6 != null ? hx7.a.A(dVar6) : null, aVar2.f282200c);
                            } else {
                                aVar = null;
                            }
                            uqk.b bVar2 = dVar2.f;
                            if (bVar2 != null) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                dj0.d dVar7 = bVar2.f282201a;
                                jo3.b bVarA3 = dVar7 != null ? hx7.a.A(dVar7) : null;
                                dj0.d dVar8 = bVar2.f282202b;
                                jo3.b bVarA4 = dVar8 != null ? hx7.a.A(dVar8) : null;
                                dj0.d dVar9 = bVar2.f282203c;
                                jo3.b bVarA5 = dVar9 != null ? hx7.a.A(dVar9) : null;
                                dj0.d dVar10 = bVar2.d;
                                bVar = new drk.b(bVarA3, bVarA4, bVarA5, dVar10 != null ? hx7.a.A(dVar10) : null);
                            } else {
                                bVar = null;
                            }
                            arrayList.add(new drk.d(str, i21, num, cVar, aVar, bVar));
                        }
                        dVar.getClass();
                        final int i22 = 0;
                        DBUtil.performBlocking(dVar.f8731a, false, true, new Function1() { // from class: ark.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj5;
                                switch (i22) {
                                    case 0:
                                        dVar.f8732b.insert(sQLiteConnection, (Iterable) arrayList);
                                        break;
                                    default:
                                        dVar.f8733c.insert(sQLiteConnection, (Iterable) arrayList);
                                        break;
                                }
                                return null;
                            }
                        });
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((wrk.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        final ark.d dVar11 = iVar.f199533b;
                        List<uqk.f> list2 = data2;
                        final ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (uqk.f fVar : list2) {
                            Object obj5 = grk.c.f146055a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            String str2 = fVar.f282210a;
                            uqk.l lVar = fVar.f282211b;
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            String strG = u1.g(lVar, grk.c.f146055a);
                            int i32 = fVar.f282212c;
                            Integer num2 = fVar.d;
                            ArrayList arrayList3 = fVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                arrayList4.add(grk.c.a((uqk.g) it8.next()));
                            }
                            arrayList2.add(new drk.e(str2, strG, i32, num2, new drk.h(arrayList4)));
                        }
                        dVar11.getClass();
                        DBUtil.performBlocking(dVar11.f8731a, false, true, new Function1() { // from class: ark.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i6) {
                                    case 0:
                                        dVar11.f8732b.insert(sQLiteConnection, (Iterable) arrayList2);
                                        break;
                                    default:
                                        dVar11.f8733c.insert(sQLiteConnection, (Iterable) arrayList2);
                                        break;
                                }
                                return null;
                            }
                        });
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        this.d = new w4l.f(w.k0(networkStateRepository, new h(i2, this, i.class, "stockFinancialsStatementsFromNetwork", "stockFinancialsStatementsFromNetwork$feature_stock_details_impl_release(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsStatementsParams;)Lio/reactivex/Single;", i, 0)), new h(1, cache, xqk.a.class, "getStatements", "getStatements(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsStatementsParams;)Ljava/util/List;", 0, 1), new b2(2, cache, xqk.a.class, "cacheStatements", "cacheStatements(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsStatementsParams;Ljava/util/List;)V", 0, 5), new h(i2, this, i.class, "stockFinancialsStatementsFromStorage", "stockFinancialsStatementsFromStorage$feature_stock_details_impl_release(Lcom/revolut/retail/feature/stockdetails/impl/domain/repositories/model/StockFinancialsStatementsParams;)Ljava/util/List;", 0, 2), new Function2(this) { // from class: lrk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f199529b;

            {
                this.f199529b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                drk.c cVar;
                drk.a aVar;
                drk.b bVar;
                int i5 = i2;
                i iVar = this.f199529b;
                final int i6 = 1;
                switch (i5) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((wrk.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        final ark.d dVar = iVar.f199533b;
                        List<uqk.d> list = data;
                        final ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (uqk.d dVar2 : list) {
                            Object obj4 = grk.c.f146055a;
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            String str = dVar2.f282207a;
                            int i21 = dVar2.f282208b;
                            Integer num = dVar2.f282209c;
                            uqk.c cVar2 = dVar2.d;
                            if (cVar2 != null) {
                                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                                dj0.d dVar3 = cVar2.f282204a;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                dj0.d dVar4 = cVar2.f282205b;
                                cVar = new drk.c(bVarA, dVar4 != null ? hx7.a.A(dVar4) : null, cVar2.f282206c);
                            } else {
                                cVar = null;
                            }
                            uqk.a aVar2 = dVar2.e;
                            if (aVar2 != null) {
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                dj0.d dVar5 = aVar2.f282198a;
                                jo3.b bVarA2 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = aVar2.f282199b;
                                aVar = new drk.a(bVarA2, dVar6 != null ? hx7.a.A(dVar6) : null, aVar2.f282200c);
                            } else {
                                aVar = null;
                            }
                            uqk.b bVar2 = dVar2.f;
                            if (bVar2 != null) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                dj0.d dVar7 = bVar2.f282201a;
                                jo3.b bVarA3 = dVar7 != null ? hx7.a.A(dVar7) : null;
                                dj0.d dVar8 = bVar2.f282202b;
                                jo3.b bVarA4 = dVar8 != null ? hx7.a.A(dVar8) : null;
                                dj0.d dVar9 = bVar2.f282203c;
                                jo3.b bVarA5 = dVar9 != null ? hx7.a.A(dVar9) : null;
                                dj0.d dVar10 = bVar2.d;
                                bVar = new drk.b(bVarA3, bVarA4, bVarA5, dVar10 != null ? hx7.a.A(dVar10) : null);
                            } else {
                                bVar = null;
                            }
                            arrayList.add(new drk.d(str, i21, num, cVar, aVar, bVar));
                        }
                        dVar.getClass();
                        final int i22 = 0;
                        DBUtil.performBlocking(dVar.f8731a, false, true, new Function1() { // from class: ark.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i22) {
                                    case 0:
                                        dVar.f8732b.insert(sQLiteConnection, (Iterable) arrayList);
                                        break;
                                    default:
                                        dVar.f8733c.insert(sQLiteConnection, (Iterable) arrayList);
                                        break;
                                }
                                return null;
                            }
                        });
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((wrk.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        final ark.d dVar11 = iVar.f199533b;
                        List<uqk.f> list2 = data2;
                        final ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (uqk.f fVar : list2) {
                            Object obj5 = grk.c.f146055a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            String str2 = fVar.f282210a;
                            uqk.l lVar = fVar.f282211b;
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            String strG = u1.g(lVar, grk.c.f146055a);
                            int i32 = fVar.f282212c;
                            Integer num2 = fVar.d;
                            ArrayList arrayList3 = fVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                arrayList4.add(grk.c.a((uqk.g) it8.next()));
                            }
                            arrayList2.add(new drk.e(str2, strG, i32, num2, new drk.h(arrayList4)));
                        }
                        dVar11.getClass();
                        DBUtil.performBlocking(dVar11.f8731a, false, true, new Function1() { // from class: ark.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i6) {
                                    case 0:
                                        dVar11.f8732b.insert(sQLiteConnection, (Iterable) arrayList2);
                                        break;
                                    default:
                                        dVar11.f8733c.insert(sQLiteConnection, (Iterable) arrayList2);
                                        break;
                                }
                                return null;
                            }
                        });
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(uqk.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = g.f199530a[eVar.ordinal()];
        if (i == 1) {
            return "annual";
        }
        if (i == 2) {
            return "quarterly";
        }
        throw new NoWhenBranchMatchedException();
    }
}
