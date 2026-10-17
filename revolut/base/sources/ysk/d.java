package ysk;

import cel.k;
import efm.r;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import vfg.p;
import vkm.j2;
import xsk.n;
import ypg.l;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends xsk.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fuk.a f316508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f316509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xsk.d f316510n;
    public final vki.a o;

    public d(fuk.a defaultBarSelector, p presentationModel, xsk.d inputData) {
        Intrinsics.checkNotNullParameter(defaultBarSelector, "defaultBarSelector");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f316508l = defaultBarSelector;
        this.f316509m = presentationModel;
        this.f316510n = inputData;
        this.o = pyd.c.a(this, new xsk.c(null, new xsk.g(n.ANNUALLY, vrk.d.f291612a, vrk.a.f291609a)));
    }

    @Override // yji.n
    public final void D2() {
        r map = this.f316509m.e(this.f316510n.f308556a).filter(new l(new a(0), 15)).map(new l(new a(1), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        i.Companion.getClass();
        yji.n.j2(this, rd0.e.b(ue0.e.E(map, i.f224256b)), null, new c(this, null, 1), 3);
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, rd0.e.b(this.f316509m.e(this.f316510n.f308556a)), null, new c(this, null, 0), 3);
    }

    @Override // xsk.b
    public final void Z2(Pair bar) {
        xsk.g gVarA;
        Intrinsics.checkNotNullParameter(bar, "bar");
        vki.a aVar = this.o;
        xsk.g gVar = ((xsk.c) ((j2) aVar.f22677a).getValue()).f308555b;
        int iIntValue = ((Number) bar.f186385a).intValue();
        Integer num = (Integer) bar.f186386b;
        int i = b.f316506a[gVar.f308563a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (num == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue2 = num.intValue();
            for (k kVar : k.a()) {
                if (kVar.b() == iIntValue2) {
                    gVarA = xsk.g.a(gVar, null, null, new vrk.b(iIntValue, kVar), 3);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        gVarA = xsk.g.a(gVar, null, new vrk.e(iIntValue), null, 5);
        X2(aVar, new yo7.p(gVarA, 19));
    }

    @Override // xsk.b
    public final void b3(String selectedId) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        boolean zF = Intrinsics.f(selectedId, "fundamentals-tabs-list-id");
        vki.a aVar = this.o;
        if (zF) {
            X2(aVar, new ypd.i(28));
        } else if (Intrinsics.f(selectedId, "quarterly-tabs-list-id")) {
            X2(aVar, new ypd.i(29));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
