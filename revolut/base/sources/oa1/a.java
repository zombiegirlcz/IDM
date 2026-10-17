package oa1;

import efm.c0;
import efm.r;
import h8b.l;
import h8b.m;
import hhm.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m78.e;
import m9d.j1;
import ma1.h;
import ma1.i;
import pfm.t;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f223492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f223493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f223494c;
    public lfm.b d;
    public lfm.b e;
    public final c0 f;

    public a(i cardReaderLogEventsInteractor) {
        Intrinsics.checkNotNullParameter(cardReaderLogEventsInteractor, "cardReaderLogEventsInteractor");
        this.f223492a = cardReaderLogEventsInteractor;
        c0 c0Var = f.e;
        Intrinsics.checkNotNullExpressionValue(c0Var, "newThread(...)");
        this.f = c0Var;
    }

    public final void a() {
        if (this.f223493b) {
            return;
        }
        this.f223493b = true;
        i iVar = this.f223492a;
        iVar.getClass();
        efm.b bVarIgnoreElements = ea1.b.f124050a.mergeWith(iVar.d.f223499a).distinctUntilChanged((kfm.d) new e(new j1(3), 13)).doOnNext(new e(new h(iVar, 1), 14)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        this.d = (lfm.b) bVarIgnoreElements.y(this.f).v();
    }

    public final void b() {
        if (this.f223494c) {
            return;
        }
        this.f223494c = true;
        i iVar = this.f223492a;
        ha1.c cVar = iVar.f203881a;
        r map = cVar.f150350b.f223497b.map(new m(new l(26), 19)).distinctUntilChanged().filter(new m(new l(22), 20)).map(new m(new l(23), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFilter = map.startWith(Unit.f186387a).switchMap(new m(new ha1.a(cVar, 0), 23)).flatMapSingle(new m(new ha1.a(cVar, 1), 24)).filter(new m(new l(25), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        t tVarM = rVarFilter.flatMapCompletable(new e(new h(iVar, 0), 11)).m(new e(new m9l.d(6), 12));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        this.e = (lfm.b) tVarM.v();
    }
}
