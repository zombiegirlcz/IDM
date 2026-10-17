package iif;

import g31.i;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import ulm.j1;
import ulm.u0;
import ulm.y0;
import zhm.h0;
import zlm.c;
import zlm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Interceptor {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f161611a;

    public b(i transactionsServerTimeRepository) {
        Intrinsics.checkNotNullParameter(transactionsServerTimeRepository, "transactionsServerTimeRepository");
        this.f161611a = transactionsServerTimeRepository;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        Response responseB = hVar.b(j1Var);
        String strB = j1Var.f281095a.b();
        if (!Intrinsics.f(strB, "/user/current/transactions") && !Intrinsics.f(strB, "/crypto-exchange/v2/transactions")) {
            return responseB;
        }
        u0 u0Var = responseB.f;
        Intrinsics.checkNotNullParameter("Last-Modified", "name");
        String strA = u0Var.a("Last-Modified");
        Date dateA = strA != null ? c.a(strA) : null;
        Long lValueOf = dateA != null ? Long.valueOf(dateA.getTime()) : null;
        if (lValueOf == null) {
            String strF = responseB.f("Last-Modified", null);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "TransactionsHeadersInterceptor", j6.a.q("Failed to parse Last-Modified header: ", strF), null, h0Var);
            return responseB;
        }
        i iVar = this.f161611a;
        ReentrantReadWriteLock reentrantReadWriteLock = iVar.f140183b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            iVar.f140182a = lValueOf;
            Unit unit = Unit.f186387a;
            return responseB;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
