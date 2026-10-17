package k5l;

import com.revolut.data.model.Data;
import dtc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k37.t;
import k50.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tof.va;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f181567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181568c;

    public /* synthetic */ c(j jVar, String str, int i) {
        this.f181566a = i;
        this.f181567b = jVar;
        this.f181568c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181566a) {
            case 0:
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (!Intrinsics.f(featureEnabled, Boolean.TRUE)) {
                    if (Intrinsics.f(featureEnabled, Boolean.FALSE)) {
                        return w.h(new Data(f0.f322471a, null, false, 6, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                j jVar = this.f181567b;
                jVar.f181580g.init();
                wsg.n nVar = jVar.f181577a;
                w4l.h hVar = w4l.h.f294642c;
                return pd.b.r(nim.a.w(mif.a.e(nVar.h0(hVar), osg.b.q(nVar, false), rd0.e.c(((nj8.n) jVar.f181578b).k(null, hVar), kotlin.coroutines.g.f186406a)), new a4(10)), new c(jVar, this.f181568c, 1));
            default:
                List kidWallets = (List) obj2;
                Intrinsics.checkNotNullParameter(kidWallets, "kidWallets");
                List<f> list = kidWallets;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    a0.x(((f) it8.next()).f181573b, arrayList);
                }
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (f fVar : list) {
                    linkedHashMap.put(fVar.f181572a, fVar.f181574c);
                }
                zsc.h hVar2 = new zsc.h(u.c(new Pair(new o(linkedHashMap), p.WORD_PREFIX)));
                j jVar2 = this.f181567b;
                return nim.a.w(nim.a.w(shf.a.a(jVar2.e, new va(d0.i1(arrayList)), this.f181568c, 4, hVar2, null, 112), new t(jVar2, kidWallets)), new k5e.k(jVar2, 3));
        }
    }
}
