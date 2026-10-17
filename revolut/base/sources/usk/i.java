package usk;

import cel.k;
import com.revolut.data.model.Data;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tsk.t;
import urd.y;
import vkm.j2;
import xsk.n;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends tsk.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f282988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tsk.a f282989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tsk.e f282990n;
    public final vki.a o;

    public i(t presentationModel, tsk.a defaultBarSelector, tsk.e inputData) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(defaultBarSelector, "defaultBarSelector");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f282988l = presentationModel;
        this.f282989m = defaultBarSelector;
        this.f282990n = inputData;
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        f0 f0Var = f0.f322471a;
        this.o = pyd.c.a(this, new tsk.d(new tsk.g(data, data2, f0Var, f0Var), new tsk.h(n.ANNUALLY, vrk.d.f291612a, vrk.a.f291609a)));
    }

    @Override // yji.n
    public final void D2() {
        tsk.e eVar = this.f282990n;
        String str = eVar.f274148a;
        t tVar = this.f282988l;
        Continuation continuation = null;
        yji.n.j2(this, rd0.e.b(tVar.r(str)), null, new h(this, continuation, 0), 3);
        yji.n.j2(this, rd0.e.b(tVar.r(eVar.f274148a)), null, new h(this, continuation, 1), 3);
    }

    @Override // tsk.c
    public final void Z2(Pair bar) {
        vrk.c bVar;
        Intrinsics.checkNotNullParameter(bar, "bar");
        int iIntValue = ((Number) bar.f186385a).intValue();
        Integer num = (Integer) bar.f186386b;
        vki.a aVar = this.o;
        int i = g.f282986a[((tsk.d) ((j2) aVar.f22677a).getValue()).f274147b.f274156a.ordinal()];
        if (i == 1) {
            X2(aVar, new um7.d(new vrk.e(iIntValue), 26));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            for (k kVar : k.a()) {
                if (kVar.b() == iIntValue2) {
                    bVar = new vrk.b(iIntValue, kVar);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        bVar = vrk.a.f291609a;
        X2(aVar, new e(bVar, 0));
    }

    @Override // tsk.c
    public final void b3(String selectedId) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        boolean zF = Intrinsics.f(selectedId, "fundamentals-tabs-list-id");
        vki.a aVar = this.o;
        if (zF) {
            X2(aVar, new y(14));
        } else if (Intrinsics.f(selectedId, "quarterly-tabs-list-id")) {
            X2(aVar, new y(15));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
