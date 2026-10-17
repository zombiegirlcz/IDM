package k1f;

import androidx.room.util.DBUtil;
import com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import efm.d0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jyk.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n09.j0;
import ofm.q;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsService f180227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f180228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1f.b f180229c;
    public final w4l.f d;
    public final w4l.f e;

    public d(TradeRevPointsService service, ne0.j memoryCache, n1f.b accountsDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(accountsDao, "accountsDao");
        this.f180227a = service;
        this.f180228b = memoryCache;
        this.f180229c = accountsDao;
        final int i = 4;
        Function2 function2 = new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: k1f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180226b;

            {
                this.f180226b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i2) {
                    case 0:
                        i1f.a params = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f180226b.f180228b.get(d.a(params));
                    case 1:
                        i1f.a params2 = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        n1f.b bVar = this.f180226b.f180229c;
                        Iterator it8 = ((List) DBUtil.performBlocking(bVar.f211314a, true, false, new j0(bVar, params2.f157635b.name(), 10))).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((p1f.a) next).e.contains(params2.f157634a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p1f.a aVar = (p1f.a) next;
                        if (aVar == null) {
                            return null;
                        }
                        TradeRevPointsAccount tradeRevPointsAccountR = q.R(aVar);
                        od0.i.Companion.getClass();
                        return od0.h.a(tradeRevPointsAccountR);
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product.name(), this.f180226b.f180228b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        n1f.b bVar2 = this.f180226b.f180229c;
                        List list = (List) DBUtil.performBlocking(bVar2.f211314a, true, false, new j0(bVar2, product2.name(), 10));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(q.R((p1f.a) it9.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 5;
        Function2 function22 = new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 3;
        Function1 function12 = new Function1(this) { // from class: k1f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180226b;

            {
                this.f180226b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i5) {
                    case 0:
                        i1f.a params = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f180226b.f180228b.get(d.a(params));
                    case 1:
                        i1f.a params2 = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        n1f.b bVar = this.f180226b.f180229c;
                        Iterator it8 = ((List) DBUtil.performBlocking(bVar.f211314a, true, false, new j0(bVar, params2.f157635b.name(), 10))).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((p1f.a) next).e.contains(params2.f157634a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p1f.a aVar = (p1f.a) next;
                        if (aVar == null) {
                            return null;
                        }
                        TradeRevPointsAccount tradeRevPointsAccountR = q.R(aVar);
                        od0.i.Companion.getClass();
                        return od0.h.a(tradeRevPointsAccountR);
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product.name(), this.f180226b.f180228b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        n1f.b bVar2 = this.f180226b.f180229c;
                        List list = (List) DBUtil.performBlocking(bVar2.f211314a, true, false, new j0(bVar2, product2.name(), 10));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(q.R((p1f.a) it9.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 0;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 1;
        Function2 function23 = new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 0;
        Function1 function13 = new Function1(this) { // from class: k1f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180226b;

            {
                this.f180226b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i22) {
                    case 0:
                        i1f.a params = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f180226b.f180228b.get(d.a(params));
                    case 1:
                        i1f.a params2 = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        n1f.b bVar = this.f180226b.f180229c;
                        Iterator it8 = ((List) DBUtil.performBlocking(bVar.f211314a, true, false, new j0(bVar, params2.f157635b.name(), 10))).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((p1f.a) next).e.contains(params2.f157634a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p1f.a aVar = (p1f.a) next;
                        if (aVar == null) {
                            return null;
                        }
                        TradeRevPointsAccount tradeRevPointsAccountR = q.R(aVar);
                        od0.i.Companion.getClass();
                        return od0.h.a(tradeRevPointsAccountR);
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product.name(), this.f180226b.f180228b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        n1f.b bVar2 = this.f180226b.f180229c;
                        List list = (List) DBUtil.performBlocking(bVar2.f211314a, true, false, new j0(bVar2, product2.name(), 10));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(q.R((p1f.a) it9.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i32 = 2;
        Function2 function24 = new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 1;
        Function1 function14 = new Function1(this) { // from class: k1f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180226b;

            {
                this.f180226b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i33) {
                    case 0:
                        i1f.a params = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f180226b.f180228b.get(d.a(params));
                    case 1:
                        i1f.a params2 = (i1f.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        n1f.b bVar = this.f180226b.f180229c;
                        Iterator it8 = ((List) DBUtil.performBlocking(bVar.f211314a, true, false, new j0(bVar, params2.f157635b.name(), 10))).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((p1f.a) next).e.contains(params2.f157634a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p1f.a aVar = (p1f.a) next;
                        if (aVar == null) {
                            return null;
                        }
                        TradeRevPointsAccount tradeRevPointsAccountR = q.R(aVar);
                        od0.i.Companion.getClass();
                        return od0.h.a(tradeRevPointsAccountR);
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product.name(), this.f180226b.f180228b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        n1f.b bVar2 = this.f180226b.f180229c;
                        List list = (List) DBUtil.performBlocking(bVar2.f211314a, true, false, new j0(bVar2, product2.name(), 10));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(q.R((p1f.a) it9.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i43 = 3;
        this.e = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: k1f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180224b;

            {
                this.f180224b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        u2f.j product = (u2f.j) obj2;
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        n1f.b bVar = this.f180224b.f180229c;
                        String strName = product.name();
                        List list = accounts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(q.e0((TradeRevPointsAccount) it8.next()));
                        }
                        DBUtil.performBlocking(bVar.f211314a, false, true, new moe.c(bVar, strName, arrayList, 22));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i1f.a params = (i1f.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<j1f.c> account = this.f180224b.f180227a.getAccount(params.f157634a);
                        g0 g0Var = new g0(new jyk.d0(25), 9);
                        account.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(account, g0Var, 1), new g0(new jyk.d0(26), 10), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        i1f.a params2 = (i1f.a) obj2;
                        od0.i optionalAccount = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                        this.f180224b.f180228b.f(d.a(params2), optionalAccount);
                        return Unit.f186387a;
                    case 3:
                        i1f.a params3 = (i1f.a) obj2;
                        od0.i optionalAccount2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                        n1f.b bVar2 = this.f180224b.f180229c;
                        String str = params3.f157634a;
                        String strName2 = params3.f157635b.name();
                        List listL = v.l(optionalAccount2.f224257a);
                        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
                        Iterator it9 = listL.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(q.e0((TradeRevPointsAccount) it9.next()));
                        }
                        DBUtil.performBlocking(bVar2.f211314a, false, true, new ja3.d(bVar2, str, strName2, arrayList2, 29));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        u2f.j product2 = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        d0<j1f.j> accounts2 = this.f180224b.f180227a.getAccounts(product2.name());
                        g0 g0Var2 = new g0(new jyk.d0(24), 8);
                        accounts2.getClass();
                        ufm.i iVar2 = new ufm.i(accounts2, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        u2f.j product3 = (u2f.j) obj2;
                        List accounts3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(accounts3, "accounts");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_ACCOUNTS_", product3.name(), this.f180224b.f180228b, accounts3);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(i1f.a aVar) {
        return p.a.p("CACHE_KEY_TRADE_REV_POINTS_ACCOUNT_", aVar.f157634a, aVar.f157635b.name());
    }
}
