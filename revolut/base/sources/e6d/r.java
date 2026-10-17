package e6d;

import androidx.room.util.DBUtil;
import com.revolut.feature.shared.autoinvest.impl.network.AutoInvestService;
import dp4.z0;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import uyh.k0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoInvestService f122986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5d.c f122987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f122988c;
    public final ue0.c d;
    public final w4l.f e;

    public r(AutoInvestService service, u5d.c dataProvider, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f122986a = service;
        this.f122987b = dataProvider;
        this.f122988c = memoryCache;
        this.d = storage;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.e = new w4l.f(new Function2(this) { // from class: e6d.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f122975b;

            {
                this.f122975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d it8 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<d6d.b>> autoInvest = this.f122975b.f122986a.getAutoInvest(it8.f122976a);
                        e31.e eVar = new e31.e(20, new e4k.f(19));
                        autoInvest.getClass();
                        ufm.i iVar = new ufm.i(autoInvest, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        d params = (d) obj2;
                        List autoInvests = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
                        ehe.n.z("AUTO_INVESTS_CACHE_KEY+", params.f122976a, this.f122975b.f122988c, autoInvests);
                        break;
                    case 2:
                        d params2 = (d) obj2;
                        List autoInvests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(autoInvests2, "autoInvests");
                        u5d.c cVar = this.f122975b.f122987b;
                        String ownerId = params2.f122976a;
                        List list = autoInvests2;
                        ArrayList items = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            items.add(x5d.b.C((yvh.b) it9.next()));
                        }
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ((Integer) DBUtil.performBlocking(cVar.a().f286197a, false, true, new uo7.k(ownerId, 20))).getClass();
                        v5d.a aVarA = cVar.a();
                        aVarA.getClass();
                        DBUtil.performBlocking(aVarA.f286197a, false, true, new k0(aVarA, items, 25));
                        break;
                    default:
                        yvh.i calculationStrategy = (yvh.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(calculationStrategy, "calculationStrategy");
                        this.f122975b.f122988c.f("CALCULATION_STRATEGY_KEY", calculationStrategy);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a(this, 3), new Function2(this) { // from class: e6d.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f122975b;

            {
                this.f122975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d it8 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<d6d.b>> autoInvest = this.f122975b.f122986a.getAutoInvest(it8.f122976a);
                        e31.e eVar = new e31.e(20, new e4k.f(19));
                        autoInvest.getClass();
                        ufm.i iVar = new ufm.i(autoInvest, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        d params = (d) obj2;
                        List autoInvests = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
                        ehe.n.z("AUTO_INVESTS_CACHE_KEY+", params.f122976a, this.f122975b.f122988c, autoInvests);
                        break;
                    case 2:
                        d params2 = (d) obj2;
                        List autoInvests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(autoInvests2, "autoInvests");
                        u5d.c cVar = this.f122975b.f122987b;
                        String ownerId = params2.f122976a;
                        List list = autoInvests2;
                        ArrayList items = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            items.add(x5d.b.C((yvh.b) it9.next()));
                        }
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ((Integer) DBUtil.performBlocking(cVar.a().f286197a, false, true, new uo7.k(ownerId, 20))).getClass();
                        v5d.a aVarA = cVar.a();
                        aVarA.getClass();
                        DBUtil.performBlocking(aVarA.f286197a, false, true, new k0(aVarA, items, 25));
                        break;
                    default:
                        yvh.i calculationStrategy = (yvh.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(calculationStrategy, "calculationStrategy");
                        this.f122975b.f122988c.f("CALCULATION_STRATEGY_KEY", calculationStrategy);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a(this, 4), new Function2(this) { // from class: e6d.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f122975b;

            {
                this.f122975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d it8 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<d6d.b>> autoInvest = this.f122975b.f122986a.getAutoInvest(it8.f122976a);
                        e31.e eVar = new e31.e(20, new e4k.f(19));
                        autoInvest.getClass();
                        ufm.i iVar = new ufm.i(autoInvest, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        d params = (d) obj2;
                        List autoInvests = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
                        ehe.n.z("AUTO_INVESTS_CACHE_KEY+", params.f122976a, this.f122975b.f122988c, autoInvests);
                        break;
                    case 2:
                        d params2 = (d) obj2;
                        List autoInvests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(autoInvests2, "autoInvests");
                        u5d.c cVar = this.f122975b.f122987b;
                        String ownerId = params2.f122976a;
                        List list = autoInvests2;
                        ArrayList items = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            items.add(x5d.b.C((yvh.b) it9.next()));
                        }
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ((Integer) DBUtil.performBlocking(cVar.a().f286197a, false, true, new uo7.k(ownerId, 20))).getClass();
                        v5d.a aVarA = cVar.a();
                        aVarA.getClass();
                        DBUtil.performBlocking(aVarA.f286197a, false, true, new k0(aVarA, items, 25));
                        break;
                    default:
                        yvh.i calculationStrategy = (yvh.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(calculationStrategy, "calculationStrategy");
                        this.f122975b.f122988c.f("CALCULATION_STRATEGY_KEY", calculationStrategy);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i5 = 3;
        new x4l.c(new f(this, continuation, 0), new a(this, 5), new Function2(this) { // from class: e6d.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f122975b;

            {
                this.f122975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d it8 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<d6d.b>> autoInvest = this.f122975b.f122986a.getAutoInvest(it8.f122976a);
                        e31.e eVar = new e31.e(20, new e4k.f(19));
                        autoInvest.getClass();
                        ufm.i iVar = new ufm.i(autoInvest, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        d params = (d) obj2;
                        List autoInvests = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
                        ehe.n.z("AUTO_INVESTS_CACHE_KEY+", params.f122976a, this.f122975b.f122988c, autoInvests);
                        break;
                    case 2:
                        d params2 = (d) obj2;
                        List autoInvests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(autoInvests2, "autoInvests");
                        u5d.c cVar = this.f122975b.f122987b;
                        String ownerId = params2.f122976a;
                        List list = autoInvests2;
                        ArrayList items = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            items.add(x5d.b.C((yvh.b) it9.next()));
                        }
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ((Integer) DBUtil.performBlocking(cVar.a().f286197a, false, true, new uo7.k(ownerId, 20))).getClass();
                        v5d.a aVarA = cVar.a();
                        aVarA.getClass();
                        DBUtil.performBlocking(aVarA.f286197a, false, true, new k0(aVarA, items, 25));
                        break;
                    default:
                        yvh.i calculationStrategy = (yvh.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(calculationStrategy, "calculationStrategy");
                        this.f122975b.f122988c.f("CALCULATION_STRATEGY_KEY", calculationStrategy);
                        break;
                }
                return Unit.f186387a;
            }
        }, new dze.n(this, continuation, 15), new z0(this, continuation, 3));
    }

    public static ufm.i a(d0 d0Var) {
        l lVar = l.f;
        dug.e eVar = new dug.e(6);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.r b(String ownerId, yvh.d scope, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(this.e.e(new d(ownerId), loadingStrategy), new e2j.j(scope, 21));
    }

    public final efm.b c(String ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return this.e.g(new d(ownerId), false);
    }

    public final ufm.i d(ufm.i iVar) {
        ufm.i iVar2 = new ufm.i(iVar, new e31.e(17, new a(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
