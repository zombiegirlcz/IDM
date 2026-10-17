package ihm;

import efm.y;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends AtomicReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f161454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f161455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f161456c;

    public h() {
        mfm.f.e(16, "capacityHint");
        this.f161454a = new ArrayList(16);
    }

    public final void a(g gVar) {
        int iIntValue;
        int i;
        if (gVar.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList = this.f161454a;
        y yVar = gVar.f161451a;
        Integer num = gVar.f161453c;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
            gVar.f161453c = 0;
        }
        int iAddAndGet = 1;
        while (!gVar.d) {
            int i2 = this.f161456c;
            while (i2 != iIntValue) {
                if (gVar.d) {
                    gVar.f161453c = null;
                    return;
                }
                Object obj2 = arrayList.get(iIntValue);
                if (this.f161455b && (i = iIntValue + 1) == i2 && i == (i2 = this.f161456c)) {
                    if (zfm.m.c(obj2)) {
                        yVar.onComplete();
                    } else {
                        yVar.onError(((zfm.k) obj2).f322037a);
                    }
                    gVar.f161453c = null;
                    gVar.d = true;
                    return;
                }
                yVar.onNext(obj2);
                iIntValue++;
            }
            if (iIntValue == this.f161456c) {
                gVar.f161453c = Integer.valueOf(iIntValue);
                iAddAndGet = gVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        gVar.f161453c = null;
    }
}
