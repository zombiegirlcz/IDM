package gif;

import a08.o0;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.c0;
import eif.k;
import g0d.m;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lu6.p;
import mhf.j;
import nif.d1;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import qfm.j1;
import qfm.k2;
import qfm.v0;
import te0.w;
import tof.q6;
import zjh.i;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfm.c f144180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b80.c f144181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tif.b f144182c;
    public final j d;
    public final i e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f144183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q6 f144184h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f144185j;

    public h(lfm.c disposableContainer, b80.c connectionRepository, tif.b loadingStateWrapper, tif.d transactionsDaoWrapper, j transactionsSearchIndexInteractor, i transactionsUpdateVersionInteractor) {
        Intrinsics.checkNotNullParameter(disposableContainer, "disposableContainer");
        Intrinsics.checkNotNullParameter(connectionRepository, "connectionRepository");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        Intrinsics.checkNotNullParameter(transactionsUpdateVersionInteractor, "transactionsUpdateVersionInteractor");
        this.f144180a = disposableContainer;
        this.f144181b = connectionRepository;
        this.f144182c = loadingStateWrapper;
        this.d = transactionsSearchIndexInteractor;
        this.e = transactionsUpdateVersionInteractor;
        lfm.e eVar = lfm.e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        this.i = eVar;
        this.f144185j = yhm.j.b(new g8i.h(this, 11));
        w.j0(disposableContainer, new fqj.c(this, 1));
    }

    public final boolean a() {
        q6 transactionScope = this.f144184h;
        if (transactionScope == null) {
            Intrinsics.r("transactionScope");
            throw null;
        }
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        dif.a aVar = dif.a.Version2;
        tif.b bVar = (tif.b) this.e.f322838b;
        bVar.getClass();
        mif.f fVar = bVar.f271493a;
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        mif.g gVar = (mif.g) fVar;
        Long lA = gVar.a(j6.a.q("UPDATE_VERSION_KEY", tif.a.a(transactionScope)));
        if ((lA != null ? lA.longValue() : dif.a.InitialVersion.a()) < aVar.a()) {
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            String strA = bVar.a(transactionScope);
            RoomDatabase roomDatabase = gVar.f205796a;
            RoomDatabase roomDatabase2 = gVar.f205796a;
            int i = 21;
            DBUtil.performBlocking(roomDatabase, false, true, new p(strA, i));
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            DBUtil.performBlocking(roomDatabase2, false, true, new p(bVar.c(transactionScope), i));
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            DBUtil.performBlocking(roomDatabase2, false, true, new p(bVar.d(transactionScope), 21));
            long jA = aVar.a();
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            gVar.b(new d1(j6.a.q("UPDATE_VERSION_KEY", tif.a.a(transactionScope)), jA));
        }
        q6 q6Var = this.f144184h;
        if (q6Var == null) {
            Intrinsics.r("transactionScope");
            throw null;
        }
        Boolean boolB = this.f144182c.b(q6Var);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public final void b(k transactionsCacheInflater, q6 transactionScope) {
        Intrinsics.checkNotNullParameter(transactionsCacheInflater, "transactionsCacheInflater");
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        if (this.f) {
            throw new IllegalStateException("init() must be called only once");
        }
        this.f = true;
        this.f144183g = transactionsCacheInflater;
        this.f144184h = transactionScope;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ifm.c, java.lang.Object] */
    public final void c() {
        if (this.i.isDisposed()) {
            int i = 1;
            c cVar = new c(this, i);
            int i2 = efm.i.f125385a;
            v0 v0Var = new v0(cVar);
            int i3 = 27;
            ge6.j jVar = new ge6.j(i3, new d(this, i));
            int i5 = efm.i.f125385a;
            efm.i iVarF = v0Var.f(jVar, i5, i5);
            Intrinsics.checkNotNullParameter(iVarF, "<this>");
            c0 c0Var = hhm.f.f152431c;
            mfm.f.b(c0Var, "scheduler is null");
            k2 k2Var = new k2(iVarF, c0Var);
            Intrinsics.checkNotNullExpressionValue(k2Var, "subscribeOn(...)");
            j1 j1Var = new j1(k2Var, new f61.a(new m(new BreadcrumbException(), i3)), i);
            Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
            ifm.c cVarM = j1Var.m(new o0(18, f.f144178a), new o0(18, g.f144179a), mfm.f.f205043c, e1.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(cVarM, "subscribe(...)");
            this.i = cVarM;
        }
    }
}
