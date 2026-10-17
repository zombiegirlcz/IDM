package yc;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import et0.w;
import java.io.Serializable;
import java.util.ArrayList;
import ro0.y;
import vc.p;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f312406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f312407c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Serializable serializable, long j2, int i) {
        this.f312405a = i;
        this.f312406b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = serializable;
        this.f312407c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f312405a) {
            case 0:
                a aVar = (a) this.f312406b;
                p pVar = aVar.i;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                if (aVar.f312398n.get()) {
                    aVar.k(6, -6, null, null, null, null, null);
                    return;
                }
                wc.d dVarA = pVar.a();
                long j2 = this.f312407c;
                if (dVarA == null) {
                    aVar.f312396l.addAll(arrayList2);
                    aVar.f312397m.addAll(arrayList3);
                    Long lValueOf = Long.valueOf(j2);
                    aVar.k(5, 0, lValueOf, lValueOf, null, null, null);
                    return;
                }
                wc.d dVarA2 = pVar.a();
                f fVar = new f(aVar, arrayList2, arrayList3, j2, false, arrayList);
                dVarA2.getClass();
                if (uc.a.e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                dVarA2.d.execute(new w((Object) dVarA2, (Object) arrayList, (Object) fVar, false, 11));
                return;
            case 1:
                a aVar2 = (a) this.f312406b;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                long j3 = 0;
                int i = 0;
                while (true) {
                    long j5 = this.f312407c;
                    if (i >= 3) {
                        aVar2.f312394h.execute(new d(aVar2, arrayList4, arrayList5, arrayList6, j5, 0));
                        return;
                    }
                    long jMin = Math.min(j5, (j5 / 3) + j3);
                    aVar2.k(2, 0, Long.valueOf(jMin), Long.valueOf(j5), null, null, null);
                    SystemClock.sleep(a.o);
                    int i2 = ((vc.c) aVar2.k.get()).f287572b;
                    if (i2 == 9 || i2 == 7 || i2 == 6) {
                        return;
                    }
                    i++;
                    j3 = jMin;
                }
                break;
            default:
                y yVar = (y) this.d;
                yVar.f255793g = null;
                yVar.a((RecyclerView) this.e, (String) this.f, this.f312407c);
                return;
        }
    }

    public /* synthetic */ d(a aVar, long j2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f312405a = 1;
        this.f312406b = aVar;
        this.f312407c = j2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }
}
