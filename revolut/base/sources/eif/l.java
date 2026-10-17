package eif;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import mjf.q;
import pfm.m;
import tif.r;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tif.b f126623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g31.i f126624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.h f126625n;
    public final fk3.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f126626p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tif.d transactionsDaoWrapper, mif.j transactionDetailsDao, r transactionsMapperWrapper, tif.b loadingStateWrapper, ang.f userInteractor, g31.i serverTimeRepository, l80.h systemTimeProvider, fk3.b configurationRepository, q calculatedBalanceInteractor, mhf.j transactionsSearchIndexInteractor) {
        super(transactionsDaoWrapper, transactionDetailsDao, transactionsMapperWrapper, loadingStateWrapper, userInteractor, calculatedBalanceInteractor, transactionsSearchIndexInteractor);
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsDao, "transactionDetailsDao");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(serverTimeRepository, "serverTimeRepository");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f126623l = loadingStateWrapper;
        this.f126624m = serverTimeRepository;
        this.f126625n = systemTimeProvider;
        this.o = configurationRepository;
        this.f126626p = new ConcurrentHashMap();
    }

    @Override // eif.k
    public final efm.b f(x71.f sinceUpdatedDate) {
        Intrinsics.checkNotNullParameter(sinceUpdatedDate, "sinceUpdatedDate");
        Long l2 = (Long) this.f126626p.get(h());
        if (l2 == null) {
            return super.f(sinceUpdatedDate);
        }
        long jLongValue = l2.longValue();
        this.f126625n.getClass();
        if (Math.abs(SystemClock.elapsedRealtime() - jLongValue) > TimeUnit.SECONDS.toMillis(((ik3.g) this.o).f161888g.b().f123382n0)) {
            return super.f(sinceUpdatedDate);
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // eif.k
    public final void l(Long l2) {
        q6 transactionScope = h();
        tif.b bVar = this.f126623l;
        if (l2 == null) {
            g31.i iVar = this.f126624m;
            ReentrantReadWriteLock.ReadLock lock = iVar.f140183b.readLock();
            lock.lock();
            try {
                Long l3 = iVar.f140182a;
                if (l3 != null) {
                    long jLongValue = l3.longValue();
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
                    Long lA = ((mif.g) bVar.f271493a).a(bVar.d(transactionScope));
                    l2 = Long.valueOf(Math.max(jLongValue, lA != null ? lA.longValue() : 0L));
                } else {
                    l2 = null;
                }
            } finally {
                lock.unlock();
            }
        }
        if (l2 != null) {
            bVar.g(h(), l2.longValue());
            q6 q6VarH = h();
            this.f126625n.getClass();
            this.f126626p.put(q6VarH, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }
}
