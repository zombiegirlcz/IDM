package rwh;

import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pfm.h;
import rp0.j;
import te0.w;
import to7.f;
import ts5.o;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f257951b;

    public /* synthetic */ a(e eVar, int i) {
        this.f257950a = i;
        this.f257951b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f257950a;
        final int i2 = 0;
        e eVar = this.f257951b;
        final int i3 = 1;
        int i5 = 2;
        switch (i) {
            case 0:
                j jVar = eVar.f257956h;
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.d()) {
                    pwh.a aVar = (pwh.a) it8.c();
                    jVar.c(new rp0.i(aVar.e(), aVar.d(), aVar.b(), new c(aVar.c(), aVar.a())), eVar.f257958l);
                    String promptId = aVar.c();
                    ifm.b bVar = eVar.k;
                    twh.d dVar = (twh.d) eVar.f257957j;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(promptId, "promptId");
                    pfm.a aVar2 = new pfm.a(new ufm.c(new f(dVar, promptId, i3), 2), new o(18, new twg.a(dVar, promptId, i5)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    w.j0(bVar, ue0.e.v(w.g0(w.g0(aVar2))).v());
                } else {
                    jVar.b(true);
                }
                return Unit.f186387a;
            case 1:
                rp0.i configuration = (rp0.i) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Object objB = configuration.b();
                c cVar = objB instanceof c ? (c) objB : null;
                if (cVar == null) {
                    return new h(new bji.a(8), 2);
                }
                String promptId2 = cVar.b();
                ifm.b bVar2 = eVar.k;
                final twh.d dVar2 = (twh.d) eVar.f257957j;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(promptId2, "promptId");
                h hVar = new h(new kfm.a() { // from class: twh.b
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ihm.j jVar2 = dVar2.f275030h;
                                i.Companion.getClass();
                                jVar2.onNext(i.f224256b);
                                break;
                            default:
                                ihm.j jVar3 = dVar2.f275030h;
                                i.Companion.getClass();
                                jVar3.onNext(i.f224256b);
                                break;
                        }
                    }
                }, 2);
                uwh.a aVar3 = dVar2.f275027b;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(promptId2, "promptId");
                pfm.f fVarR = efm.b.r(v.k(hVar, w.g0(aVar3.f283666a.markAsOpened(promptId2))));
                Intrinsics.checkNotNullExpressionValue(fVarR, "mergeDelayError(...)");
                w.j0(bVar2, ue0.e.v(w.g0(w.g0(fVarR))).v());
                d0 d0VarS1 = lg0.b.s1(eVar.i, cVar.a(), null, null, 6);
                d0VarS1.getClass();
                h hVar2 = new h(d0VarS1, 4);
                Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
                return ue0.e.v(hVar2);
            default:
                rp0.i configuration2 = (rp0.i) obj2;
                Intrinsics.checkNotNullParameter(configuration2, "configuration");
                Object objB2 = configuration2.b();
                c cVar2 = objB2 instanceof c ? (c) objB2 : null;
                if (cVar2 != null) {
                    String promptId3 = cVar2.b();
                    ifm.b bVar3 = eVar.k;
                    final twh.d dVar3 = (twh.d) eVar.f257957j;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(promptId3, "promptId");
                    h hVar3 = new h(new kfm.a() { // from class: twh.b
                        @Override // kfm.a
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ihm.j jVar2 = dVar3.f275030h;
                                    i.Companion.getClass();
                                    jVar2.onNext(i.f224256b);
                                    break;
                                default:
                                    ihm.j jVar3 = dVar3.f275030h;
                                    i.Companion.getClass();
                                    jVar3.onNext(i.f224256b);
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    w.j0(bVar3, ue0.e.v(w.g0(w.g0(hVar3))).v());
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parcel must contain prompt info!");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
