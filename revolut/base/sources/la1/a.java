package la1;

import jo0.m;
import kotlin.jvm.internal.Intrinsics;
import lfm.b;
import lfm.d;
import ma1.k;
import ne0.j;
import no.y2;
import od0.e;
import sa1.i;
import sa1.q;
import ue0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193315a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f193316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f193317c;
    public final e d;
    public final e e;

    public a(k sdkInteractor, j memoryCache, oa1.a logsRecorder, c storage) {
        Intrinsics.checkNotNullParameter(logsRecorder, "logsRecorder");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f193316b = logsRecorder;
        this.f193317c = sdkInteractor;
        this.d = memoryCache;
        this.e = storage;
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f193315a) {
            case 0:
                oa1.a aVar = (oa1.a) this.f193316b;
                synchronized (aVar) {
                    try {
                        b bVar = aVar.d;
                        if (bVar != null) {
                            d.a(bVar);
                        }
                        aVar.d = null;
                        aVar.f223493b = false;
                        b bVar2 = aVar.e;
                        if (bVar2 != null) {
                            d.a(bVar2);
                        }
                        aVar.e = null;
                        aVar.f223494c = false;
                        aVar.f223492a.f203881a.f150350b.f223496a.clear();
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                q qVar = (q) ((k) this.f193317c).f203887a;
                qVar.b().disconnect(new i());
                qVar.d.clear();
                qVar.f261241j.clear();
                ((j) this.d).clear();
                ((c) this.e).clear();
                return;
            default:
                ((ifm.b) this.f193316b).d();
                ((hsh.a) this.f193317c).clear();
                ((y2) this.d).getClass();
                m.f176852j = null;
                ((lo.d) this.e).clear();
                return;
        }
    }

    public a(ifm.b disposable, hsh.a cleaner, y2 videoPlayerDiagnosticTracker, lo.d memoryConsumptionTracker) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Intrinsics.checkNotNullParameter(cleaner, "cleaner");
        Intrinsics.checkNotNullParameter(videoPlayerDiagnosticTracker, "videoPlayerDiagnosticTracker");
        Intrinsics.checkNotNullParameter(memoryConsumptionTracker, "memoryConsumptionTracker");
        this.f193316b = disposable;
        this.f193317c = cleaner;
        this.d = videoPlayerDiagnosticTracker;
        this.e = memoryConsumptionTracker;
    }
}
