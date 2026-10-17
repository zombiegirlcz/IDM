package awk;

import au6.e2;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f10808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zjh.j f10809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f10810n;

    public l(f input, zjh.j keyStatsProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(keyStatsProvider, "keyStatsProvider");
        this.f10808l = input;
        this.f10809m = keyStatsProvider;
        this.f10810n = pyd.c.a(this, new h(0));
    }

    @Override // yji.n
    public final void D2() {
        Collection collectionD;
        f fVar = this.f10808l;
        e filter = fVar.f10800b;
        hel.b bVar = fVar.f10801c;
        Object obj2 = this.f10809m.f322839a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter instanceof d) {
            List listC = zvk.b.c(((d) filter).f10798a);
            collectionD = new ArrayList();
            Iterator it8 = listC.iterator();
            while (it8.hasNext()) {
                a0.x(zvk.b.d((AssetStatsGroup) it8.next(), bVar), collectionD);
            }
        } else {
            if (!(filter instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            collectionD = zvk.b.d(((c) filter).f10797a, bVar);
        }
        Collection collection = collectionD;
        int iB = q0.b(w.t(collection, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : collection) {
            linkedHashMap.put(obj3, Boolean.valueOf(fVar.f10799a.contains((AssetStatsId) obj3)));
        }
        X2(this.f10810n, new j(linkedHashMap, 0));
    }

    @Override // awk.g
    public final void Z2() {
        X2(this.f10810n, new e2(28));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f10810n;
    }
}
