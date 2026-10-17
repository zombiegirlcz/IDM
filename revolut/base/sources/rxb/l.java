package rxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import efm.c0;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m1c.s1;
import m1c.t1;
import org.jetbrains.annotations.NotNull;
import qfm.d1;
import qfm.h1;
import qfm.i2;
import qfm.j0;
import qfm.j1;
import qfm.n;
import qfm.u2;
import qfm.x;
import rfm.f0;
import rfm.m;
import rfm.o;
import rfm.w;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsService f258128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsDatabase f258129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f258130c;
    public final lfm.c d;
    public final AtomicBoolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pfm.c f258131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f258132h;

    public l(RevPointsService revPointsService, RevPointsDatabase revPointsDatabase, b80.c connectionRepository, lfm.c appDisposable) {
        Intrinsics.checkNotNullParameter(revPointsService, "revPointsService");
        Intrinsics.checkNotNullParameter(revPointsDatabase, "revPointsDatabase");
        Intrinsics.checkNotNullParameter(connectionRepository, "connectionRepository");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        this.f258128a = revPointsService;
        this.f258129b = revPointsDatabase;
        this.f258130c = connectionRepository;
        this.d = appDisposable;
        this.e = new AtomicBoolean(false);
        this.f = new Object();
        this.f258132h = j6.a.h("create(...)");
    }

    public final w a(String str) {
        o oVar = new o(new pu9.a(this, str, 18));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        return te0.w.h0(oVar);
    }

    public final r b(RevPointsTransactionPageParams revPointsTransactionPageParams) {
        r rVarI;
        Long l2 = revPointsTransactionPageParams.f84105b;
        List list = revPointsTransactionPageParams.i;
        List list2 = revPointsTransactionPageParams.f84108h;
        t1 t1Var = revPointsTransactionPageParams.f84107g;
        s1 s1Var = revPointsTransactionPageParams.f;
        f1 f1Var = revPointsTransactionPageParams.e;
        Long l3 = revPointsTransactionPageParams.f84106c;
        RevPointsDatabase revPointsDatabase = this.f258129b;
        if (l2 != null) {
            sxb.b bVarG = revPointsDatabase.g();
            long jLongValue = l2.longValue();
            int i = revPointsTransactionPageParams.f84104a;
            String str = revPointsTransactionPageParams.d;
            String strName = f1Var != null ? f1Var.name() : null;
            String strName2 = s1Var != null ? s1Var.name() : null;
            String strName3 = t1Var != null ? t1Var.name() : null;
            List listN = c6d.b.N(list2);
            List listN2 = c6d.b.N(list);
            bVarG.getClass();
            List list3 = listN;
            boolean z = !(list3 == null || list3.isEmpty());
            List list4 = listN2;
            boolean z3 = !(list4 == null || list4.isEmpty());
            if (listN == null) {
                listN = u.c("");
            }
            List list5 = listN;
            if (listN2 == null) {
                listN2 = u.c("");
            }
            rVarI = bVarG.j(jLongValue, i, z, list5, z3, listN2, str, strName, strName2, strName3);
        } else if (l3 != null) {
            sxb.b bVarG2 = revPointsDatabase.g();
            long jLongValue2 = l3.longValue();
            String strName4 = null;
            int i2 = revPointsTransactionPageParams.f84104a;
            String str2 = revPointsTransactionPageParams.d;
            String strName5 = f1Var != null ? f1Var.name() : null;
            String strName6 = s1Var != null ? s1Var.name() : null;
            if (t1Var != null) {
                strName4 = t1Var.name();
            }
            String str3 = strName4;
            List listN3 = c6d.b.N(list2);
            List listN4 = c6d.b.N(list);
            bVarG2.getClass();
            List list6 = listN3;
            boolean z4 = !(list6 == null || list6.isEmpty());
            List list7 = listN4;
            boolean z6 = !(list7 == null || list7.isEmpty());
            if (listN3 == null) {
                listN3 = u.c("");
            }
            List list8 = listN3;
            if (listN4 == null) {
                listN4 = u.c("");
            }
            rVarI = bVarG2.h(jLongValue2, i2, z4, list8, z6, listN4, str2, strName5, strName6, str3);
        } else {
            sxb.b bVarG3 = revPointsDatabase.g();
            int i3 = revPointsTransactionPageParams.f84104a;
            String str4 = revPointsTransactionPageParams.d;
            String strName7 = f1Var != null ? f1Var.name() : null;
            String strName8 = s1Var != null ? s1Var.name() : null;
            String strName9 = t1Var != null ? t1Var.name() : null;
            List listN5 = c6d.b.N(list2);
            List listN6 = c6d.b.N(list);
            bVarG3.getClass();
            List list9 = listN5;
            boolean z11 = !(list9 == null || list9.isEmpty());
            List list10 = listN6;
            boolean z12 = true ^ (list10 == null || list10.isEmpty());
            if (listN5 == null) {
                listN5 = u.c("");
            }
            if (listN6 == null) {
                listN6 = u.c("");
            }
            rVarI = bVarG3.i(i3, z11, listN5, z12, listN6, str4, strName7, strName8, strName9);
        }
        r rVarDistinctUntilChanged = rVarI.map(new rw9.d(new b(5), 22)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final m c(String str) {
        j0 j0Var = new j0(g(), new f(11, new b(15)), 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0 c0Var = hhm.f.f152430b;
        mfm.f.b(timeUnit, "timeUnit is null");
        mfm.f.b(c0Var, "scheduler is null");
        m mVar = new m(new h1(new u2(j0Var, c0Var), 0), new f(12, new g(this, str, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final f0 d() {
        f0 f0VarP = new m(te0.w.h0(this.f258129b.h().a()), new rw9.d(new b(2), 18), 1).p(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return f0VarP;
    }

    public final efm.b e() {
        pfm.c cVar;
        synchronized (this.f) {
            cVar = this.f258131g;
            if (cVar == null) {
                pfm.c cVar2 = new pfm.c(new d1(f()).l(new c(this, 0)).m(new rw9.d(new a(this, 3), 16)));
                this.f258131g = cVar2;
                te0.w.j0(this.d, cVar2.w(new rw9.d(new b(1), 17), new lm.b(1)));
                cVar = cVar2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(cVar, "synchronized(...)");
        return cVar;
    }

    public final x f() {
        ufm.c cVar = new ufm.c(new e(this, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        i2 i2VarP = new ufm.i(te0.w.i0(te0.w.i0(cVar)), new rw9.d(new a(this, 6), 27), 0).p(new rw9.d(new a(this, 7), 28));
        n nVar = new n(new j1(i2VarP.v(), new rw9.d(new b(7), 29), 2), new f(0, new b(8)), 2);
        f fVar = new f(1, new a(this, 8));
        dfm.c cVar2 = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        x xVar = new x(new x(nVar, fVar, cVar2, aVar, aVar), cVar2, cVar2, new c(this, 1), aVar);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnComplete(...)");
        return xVar;
    }

    public final n g() {
        ufm.c cVar = new ufm.c(new e(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        i2 i2VarP = new ufm.i(te0.w.i0(te0.w.i0(cVar)), new rw9.d(new a(this, 0), 15), 0).p(new rw9.d(new a(this, 4), 25));
        n nVar = new n(new j1(i2VarP.v(), new f(5, new b(9)), 2), new f(13, new b(14)), 2);
        Intrinsics.checkNotNullExpressionValue(nVar, "takeUntil(...)");
        return nVar;
    }
}
