package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f203880b;

    public /* synthetic */ h(i iVar, int i) {
        this.f203879a = i;
        this.f203880b = iVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fa1.k kVar;
        switch (this.f203879a) {
            case 0:
                List logEventList = (List) obj2;
                Intrinsics.checkNotNullParameter(logEventList, "logEventList");
                i iVar = this.f203880b;
                oa1.b bVar = iVar.f203883c;
                bVar.getClass();
                DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
                Intrinsics.h(dateTimeNow);
                fa1.v vVar = new fa1.v(dateTimeNow, bVar.f223495a, fa1.k.ERROR);
                ArrayList logEventList2 = new ArrayList(logEventList.size() + 1);
                logEventList2.add(vVar);
                logEventList2.addAll(1, logEventList);
                String str = (String) j6.a.k(String.class, ((ha1.f) iVar.f203882b).f150353a, "KEY_TERMINAL_ID");
                ha1.c cVar = iVar.f203881a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(logEventList2, "logEventList");
                pfm.a aVar = new pfm.a(new ufm.c(new fag.g(str, logEventList2), 2), new h8b.m(new ha1.a(cVar, 2), 26), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return new pfm.a(te0.w.g0(aVar), mfm.f.f205044g, 1);
            default:
                fa1.x logEvent = (fa1.x) obj2;
                int iA = logEvent.a().a();
                i iVar2 = this.f203880b;
                PairingInfo pairingInfoC = ((ha1.f) iVar2.f203882b).c();
                if (pairingInfoC == null || (kVar = pairingInfoC.o) == null) {
                    kVar = fa1.k.INFO;
                }
                if (iA >= kVar.a()) {
                    ha1.c cVar2 = iVar2.f203881a;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(logEvent, "logEvent");
                    oa1.c cVar3 = cVar2.f150350b;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(logEvent, "logEvent");
                    ReentrantReadWriteLock reentrantReadWriteLock = cVar3.f223498c;
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    int i = 0;
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        cVar3.f223496a.add(logEvent);
                        while (i < readHoldCount) {
                            lock.lock();
                            i++;
                        }
                        writeLock.unlock();
                        cVar3.a();
                    } catch (Throwable th10) {
                        while (i < readHoldCount) {
                            lock.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th10;
                    }
                }
                return Unit.f186387a;
        }
    }
}
