package ha1;

import efm.w;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f150348b;

    public /* synthetic */ a(c cVar, int i) {
        this.f150347a = i;
        this.f150348b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f150347a;
        c cVar = this.f150348b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                cVar.getClass();
                w map = efm.r.interval(0L, 10L, TimeUnit.SECONDS).map(new h8b.m(new h8b.l(24), 22));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oa1.c cVar2 = cVar.f150350b;
                ArrayList arrayList = cVar2.f223496a;
                ReentrantReadWriteLock reentrantReadWriteLock = cVar2.f223498c;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    ArrayList arrayListF1 = d0.f1(arrayList);
                    arrayList.clear();
                    Unit unit = Unit.f186387a;
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    cVar2.a();
                    ufm.b bVarM = efm.d0.m(arrayListF1);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                } catch (Throwable th10) {
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    throw th10;
                }
            default:
                ga1.j request = (ga1.j) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return cVar.f150349a.sendLogs(request);
        }
    }
}
