package pfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.f[] f235722b;

    public /* synthetic */ d(efm.f[] fVarArr, int i) {
        this.f235721a = i;
        this.f235722b = fVarArr;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        efm.d dVar2;
        switch (this.f235721a) {
            case 0:
                ogm.b bVar = new ogm.b(dVar, this.f235722b);
                dVar.onSubscribe((lfm.b) bVar.e);
                bVar.a();
                break;
            case 1:
                ifm.b bVar2 = new ifm.b();
                e eVar = new e(dVar, new AtomicBoolean(), bVar2, this.f235722b.length + 1);
                dVar.onSubscribe(bVar2);
                for (efm.f fVar : this.f235722b) {
                    if (!bVar2.f161042b) {
                        if (fVar == null) {
                            bVar2.dispose();
                            eVar.onError(new NullPointerException("A completable source is null"));
                        } else {
                            fVar.d(eVar);
                        }
                    }
                    break;
                }
                eVar.onComplete();
                break;
            default:
                ifm.b bVar3 = new ifm.b();
                AtomicInteger atomicInteger = new AtomicInteger(this.f235722b.length + 1);
                zfm.c cVar = new zfm.c();
                dVar.onSubscribe(bVar3);
                efm.f[] fVarArr = this.f235722b;
                int length = fVarArr.length;
                int i = 0;
                while (i < length) {
                    efm.f fVar2 = fVarArr[i];
                    if (!bVar3.f161042b) {
                        if (fVar2 == null) {
                            zfm.h.a(cVar, new NullPointerException("A completable source is null"));
                            atomicInteger.decrementAndGet();
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            fVar2.d(new lal.a(dVar2, bVar3, cVar, atomicInteger, 27));
                        }
                        i++;
                        dVar = dVar2;
                    }
                    break;
                }
                efm.d dVar3 = dVar;
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thB = zfm.h.b(cVar);
                    if (thB == null) {
                        dVar3.onComplete();
                    } else {
                        dVar3.onError(thB);
                    }
                }
                break;
        }
    }
}
