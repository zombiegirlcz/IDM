package fde;

import efm.r;
import fag.m0;
import fag.o0;
import io3.i;
import io3.k;
import io3.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import osg.b;
import tof.i7;
import tof.ib;
import tof.oa;
import wsg.n;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f133931a;

    public a(n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f133931a = walletInteractor;
    }

    public static oa a(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        List list = cards;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ib((String) it8.next()));
        }
        ib[] ibVarArr = (ib[]) arrayList.toArray(new ib[0]);
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = (i7[]) Arrays.copyOf(ibVarArr, ibVarArr.length);
        cVar.getClass();
        return i7.c.b(i7VarArr);
    }

    public final r b() {
        k kVar = k.ACTIVE;
        l lVar = l.CREDIT;
        i iVar = i.INTERNAL;
        n nVar = this.f133931a;
        r rVarX = new ufm.i(te0.w.H0(b.j(nVar, lVar, kVar, iVar, null, null, null, 56), b.j(nVar, l.CURRENT, kVar, iVar, null, null, null, 56)), new m0(new o0(26), 21), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }
}
