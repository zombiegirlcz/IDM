package lph;

import cli.y;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lnk.o;
import md6.s;
import x8h.m;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends oki.h implements ali.h {
    public final ugl.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nph.b f199128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f199129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashSet f199130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f199131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f199132t;

    public d(j stateMapper, ugl.c screenerInteractor, nph.b pagerItemsMapper, m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(pagerItemsMapper, "pagerItemsMapper");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.o = screenerInteractor;
        this.f199128p = pagerItemsMapper;
        this.f199129q = etpProductAvailabilityInteractor;
        this.f199131s = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.f199132t = s.b(this, new o(3));
    }

    public static LinkedHashSet I2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ScreenerCollection) obj2).f105158h == zel.d.USER) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((ScreenerCollection) it8.next()).f105154a);
        }
        return linkedHashSet;
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f199132t;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f199129q.a(), null, null, new jkh.g(this, (Continuation) null, 7), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.n(((yhl.f) this.o).c(w4l.h.f294642c), h0.f322473a), null, new com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.a(this, null), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f199131s;
    }
}
