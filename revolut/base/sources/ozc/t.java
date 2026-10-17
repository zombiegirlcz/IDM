package ozc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import oe0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends ori.a implements ori.b, d {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f231329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kl.c0 f231330c;
    public final kza.a d;
    public final rzc.a e;
    public final ks0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tm.g f231331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm.g f231332h;
    public final tm.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tm.g f231333j;
    public final v60.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f231334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v60.i f231335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v60.i f231336n;
    public final List o;

    public t(g state, kl.c0 sowInteractor, kza.a remoteStoriesInteractor, rzc.a currencyChooserPresentationModel, ks0.n instructionsInteractor, com.google.firebase.messaging.t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sowInteractor, "sowInteractor");
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserPresentationModel, "currencyChooserPresentationModel");
        Intrinsics.checkNotNullParameter(instructionsInteractor, "instructionsInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f231329b = state;
        this.f231330c = sowInteractor;
        this.d = remoteStoriesInteractor;
        this.e = currencyChooserPresentationModel;
        this.f = instructionsInteractor;
        final int i = 0;
        this.f231331g = actionDelegateFactory.e(new Function0(this) { // from class: ozc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f231308b;

            {
                this.f231308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 3;
                final int i5 = 0;
                t tVar = this.f231308b;
                final int i6 = 1;
                int i21 = 2;
                switch (i2) {
                    case 0:
                        g gVar = tVar.f231329b;
                        s0 s0Var = (s0) gVar;
                        efm.d0 a7 = te0.w.C(s0Var.N0());
                        efm.d0 b4 = te0.w.C(s0Var.x0());
                        efm.d0 c2 = te0.w.C(s0Var.z0());
                        efm.d0 d = te0.w.C(s0Var.M0());
                        efm.d0 e = te0.w.C(s0Var.E0());
                        efm.d0 f = te0.w.C(s0Var.H0());
                        efm.d0 g3 = te0.w.C(s0Var.B0());
                        efm.d0 h2 = te0.w.C(s0Var.G0());
                        efm.d0 i22 = te0.w.C(s0Var.y0());
                        Intrinsics.checkNotNullParameter(a7, "a");
                        Intrinsics.checkNotNullParameter(b4, "b");
                        Intrinsics.checkNotNullParameter(c2, "c");
                        Intrinsics.checkNotNullParameter(d, "d");
                        Intrinsics.checkNotNullParameter(e, "e");
                        Intrinsics.checkNotNullParameter(f, "f");
                        Intrinsics.checkNotNullParameter(g3, "g");
                        Intrinsics.checkNotNullParameter(h2, "h");
                        Intrinsics.checkNotNullParameter(i22, "i");
                        efm.d0 d0VarY = efm.d0.y(a7, b4, c2, d, e, f, g3, h2, i22, new uyd.y(18));
                        Intrinsics.checkNotNullExpressionValue(d0VarY, "zip(...)");
                        ufm.i iVar = new ufm.i(d0VarY, new o(26, new n(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        ufm.n nVarN = iVar.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
                        pfm.a aVar = new pfm.a(nVarN, new p(1, new m(tVar, 24)), 4);
                        s0 s0Var2 = (s0) gVar;
                        pfm.t tVarZ0 = te0.w.z0(s0Var2.D0(), zhm.f0.f322471a);
                        pfm.t tVarZ02 = te0.w.z0(s0Var2.x0(), 0L);
                        te0.e eVarZ0 = s0Var2.z0();
                        od0.i.Companion.getClass();
                        od0.i iVar2 = od0.i.f224256b;
                        pfm.t tVarZ03 = te0.w.z0(eVarZ0, iVar2);
                        pfm.t tVarZ04 = te0.w.z0(s0Var2.N0(), iVar2);
                        pfm.t tVarZ05 = te0.w.z0(s0Var2.M0(), iVar2);
                        pfm.t tVarZ06 = te0.w.z0(s0Var2.L0(), iVar2);
                        te0.e eVarH0 = s0Var2.H0();
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        efm.b bVarP = efm.b.p(tVarZ0, tVarZ02, tVarZ03, tVarZ04, tVarZ05, tVarZ06, te0.w.z0(eVarH0, ""), te0.w.z0(s0Var2.E0(), iVar2), te0.w.z0(s0Var2.C0(), zhm.r0.g()), te0.w.z0(s0Var2.K0(), iVar2));
                        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
                        pfm.a aVarE = aVar.e(bVarP).e(new pfm.h(new l(tVar, i21), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    case 1:
                        g gVar2 = tVar.f231329b;
                        efm.d0 d0VarH0 = te0.w.H0(te0.w.C(((s0) gVar2).F0()), te0.w.C(((s0) gVar2).C0()));
                        Intrinsics.checkNotNullParameter(d0VarH0, "<this>");
                        ufm.n nVarN2 = d0VarH0.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN2, "observeOn(...)");
                        pfm.a aVarE2 = new pfm.a(nVarN2, new oy9.b(new m(tVar, 26), 20), 4).e(tVar.m3(new a.C1250a())).e(new pfm.h(new l(tVar, i5), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                        return aVarE2;
                    default:
                        final nzc.d dVar = (nzc.d) tVar.f231330c.f185148b;
                        pfm.a aVarE3 = dVar.f221017a.confirmUpload().e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(dVar.b());
                        Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                        pfm.a aVarE4 = ue0.e.r(te0.w.g0(aVarE3), zhm.h0.f322473a).m(new p(2, new m(tVar, 25))).e(new pfm.h(new l(tVar, i3), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE4, "andThen(...)");
                        return aVarE4;
                }
            }
        });
        final int i2 = 1;
        this.f231332h = actionDelegateFactory.e(new Function0(this) { // from class: ozc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f231308b;

            {
                this.f231308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 3;
                final int i5 = 0;
                t tVar = this.f231308b;
                final int i6 = 1;
                int i21 = 2;
                switch (i22) {
                    case 0:
                        g gVar = tVar.f231329b;
                        s0 s0Var = (s0) gVar;
                        efm.d0 a7 = te0.w.C(s0Var.N0());
                        efm.d0 b4 = te0.w.C(s0Var.x0());
                        efm.d0 c2 = te0.w.C(s0Var.z0());
                        efm.d0 d = te0.w.C(s0Var.M0());
                        efm.d0 e = te0.w.C(s0Var.E0());
                        efm.d0 f = te0.w.C(s0Var.H0());
                        efm.d0 g3 = te0.w.C(s0Var.B0());
                        efm.d0 h2 = te0.w.C(s0Var.G0());
                        efm.d0 i222 = te0.w.C(s0Var.y0());
                        Intrinsics.checkNotNullParameter(a7, "a");
                        Intrinsics.checkNotNullParameter(b4, "b");
                        Intrinsics.checkNotNullParameter(c2, "c");
                        Intrinsics.checkNotNullParameter(d, "d");
                        Intrinsics.checkNotNullParameter(e, "e");
                        Intrinsics.checkNotNullParameter(f, "f");
                        Intrinsics.checkNotNullParameter(g3, "g");
                        Intrinsics.checkNotNullParameter(h2, "h");
                        Intrinsics.checkNotNullParameter(i222, "i");
                        efm.d0 d0VarY = efm.d0.y(a7, b4, c2, d, e, f, g3, h2, i222, new uyd.y(18));
                        Intrinsics.checkNotNullExpressionValue(d0VarY, "zip(...)");
                        ufm.i iVar = new ufm.i(d0VarY, new o(26, new n(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        ufm.n nVarN = iVar.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
                        pfm.a aVar = new pfm.a(nVarN, new p(1, new m(tVar, 24)), 4);
                        s0 s0Var2 = (s0) gVar;
                        pfm.t tVarZ0 = te0.w.z0(s0Var2.D0(), zhm.f0.f322471a);
                        pfm.t tVarZ02 = te0.w.z0(s0Var2.x0(), 0L);
                        te0.e eVarZ0 = s0Var2.z0();
                        od0.i.Companion.getClass();
                        od0.i iVar2 = od0.i.f224256b;
                        pfm.t tVarZ03 = te0.w.z0(eVarZ0, iVar2);
                        pfm.t tVarZ04 = te0.w.z0(s0Var2.N0(), iVar2);
                        pfm.t tVarZ05 = te0.w.z0(s0Var2.M0(), iVar2);
                        pfm.t tVarZ06 = te0.w.z0(s0Var2.L0(), iVar2);
                        te0.e eVarH0 = s0Var2.H0();
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        efm.b bVarP = efm.b.p(tVarZ0, tVarZ02, tVarZ03, tVarZ04, tVarZ05, tVarZ06, te0.w.z0(eVarH0, ""), te0.w.z0(s0Var2.E0(), iVar2), te0.w.z0(s0Var2.C0(), zhm.r0.g()), te0.w.z0(s0Var2.K0(), iVar2));
                        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
                        pfm.a aVarE = aVar.e(bVarP).e(new pfm.h(new l(tVar, i21), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    case 1:
                        g gVar2 = tVar.f231329b;
                        efm.d0 d0VarH0 = te0.w.H0(te0.w.C(((s0) gVar2).F0()), te0.w.C(((s0) gVar2).C0()));
                        Intrinsics.checkNotNullParameter(d0VarH0, "<this>");
                        ufm.n nVarN2 = d0VarH0.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN2, "observeOn(...)");
                        pfm.a aVarE2 = new pfm.a(nVarN2, new oy9.b(new m(tVar, 26), 20), 4).e(tVar.m3(new a.C1250a())).e(new pfm.h(new l(tVar, i5), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                        return aVarE2;
                    default:
                        final nzc.d dVar = (nzc.d) tVar.f231330c.f185148b;
                        pfm.a aVarE3 = dVar.f221017a.confirmUpload().e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(dVar.b());
                        Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                        pfm.a aVarE4 = ue0.e.r(te0.w.g0(aVarE3), zhm.h0.f322473a).m(new p(2, new m(tVar, 25))).e(new pfm.h(new l(tVar, i3), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE4, "andThen(...)");
                        return aVarE4;
                }
            }
        });
        final int i3 = 2;
        this.i = actionDelegateFactory.e(new Function0(this) { // from class: ozc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f231308b;

            {
                this.f231308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 3;
                final int i5 = 0;
                t tVar = this.f231308b;
                final int i6 = 1;
                int i21 = 2;
                switch (i22) {
                    case 0:
                        g gVar = tVar.f231329b;
                        s0 s0Var = (s0) gVar;
                        efm.d0 a7 = te0.w.C(s0Var.N0());
                        efm.d0 b4 = te0.w.C(s0Var.x0());
                        efm.d0 c2 = te0.w.C(s0Var.z0());
                        efm.d0 d = te0.w.C(s0Var.M0());
                        efm.d0 e = te0.w.C(s0Var.E0());
                        efm.d0 f = te0.w.C(s0Var.H0());
                        efm.d0 g3 = te0.w.C(s0Var.B0());
                        efm.d0 h2 = te0.w.C(s0Var.G0());
                        efm.d0 i222 = te0.w.C(s0Var.y0());
                        Intrinsics.checkNotNullParameter(a7, "a");
                        Intrinsics.checkNotNullParameter(b4, "b");
                        Intrinsics.checkNotNullParameter(c2, "c");
                        Intrinsics.checkNotNullParameter(d, "d");
                        Intrinsics.checkNotNullParameter(e, "e");
                        Intrinsics.checkNotNullParameter(f, "f");
                        Intrinsics.checkNotNullParameter(g3, "g");
                        Intrinsics.checkNotNullParameter(h2, "h");
                        Intrinsics.checkNotNullParameter(i222, "i");
                        efm.d0 d0VarY = efm.d0.y(a7, b4, c2, d, e, f, g3, h2, i222, new uyd.y(18));
                        Intrinsics.checkNotNullExpressionValue(d0VarY, "zip(...)");
                        ufm.i iVar = new ufm.i(d0VarY, new o(26, new n(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        ufm.n nVarN = iVar.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
                        pfm.a aVar = new pfm.a(nVarN, new p(1, new m(tVar, 24)), 4);
                        s0 s0Var2 = (s0) gVar;
                        pfm.t tVarZ0 = te0.w.z0(s0Var2.D0(), zhm.f0.f322471a);
                        pfm.t tVarZ02 = te0.w.z0(s0Var2.x0(), 0L);
                        te0.e eVarZ0 = s0Var2.z0();
                        od0.i.Companion.getClass();
                        od0.i iVar2 = od0.i.f224256b;
                        pfm.t tVarZ03 = te0.w.z0(eVarZ0, iVar2);
                        pfm.t tVarZ04 = te0.w.z0(s0Var2.N0(), iVar2);
                        pfm.t tVarZ05 = te0.w.z0(s0Var2.M0(), iVar2);
                        pfm.t tVarZ06 = te0.w.z0(s0Var2.L0(), iVar2);
                        te0.e eVarH0 = s0Var2.H0();
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        efm.b bVarP = efm.b.p(tVarZ0, tVarZ02, tVarZ03, tVarZ04, tVarZ05, tVarZ06, te0.w.z0(eVarH0, ""), te0.w.z0(s0Var2.E0(), iVar2), te0.w.z0(s0Var2.C0(), zhm.r0.g()), te0.w.z0(s0Var2.K0(), iVar2));
                        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
                        pfm.a aVarE = aVar.e(bVarP).e(new pfm.h(new l(tVar, i21), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    case 1:
                        g gVar2 = tVar.f231329b;
                        efm.d0 d0VarH0 = te0.w.H0(te0.w.C(((s0) gVar2).F0()), te0.w.C(((s0) gVar2).C0()));
                        Intrinsics.checkNotNullParameter(d0VarH0, "<this>");
                        ufm.n nVarN2 = d0VarH0.n(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(nVarN2, "observeOn(...)");
                        pfm.a aVarE2 = new pfm.a(nVarN2, new oy9.b(new m(tVar, 26), 20), 4).e(tVar.m3(new a.C1250a())).e(new pfm.h(new l(tVar, i5), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                        return aVarE2;
                    default:
                        final nzc.d dVar = (nzc.d) tVar.f231330c.f185148b;
                        pfm.a aVarE3 = dVar.f221017a.confirmUpload().e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(new pfm.h(new kfm.a() { // from class: nzc.a
                            @Override // kfm.a
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        dVar.f221018b.remove("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
                                        break;
                                    default:
                                        dVar.f221018b.remove("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                                        break;
                                }
                            }
                        }, 2)).e(dVar.b());
                        Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                        pfm.a aVarE4 = ue0.e.r(te0.w.g0(aVarE3), zhm.h0.f322473a).m(new p(2, new m(tVar, 25))).e(new pfm.h(new l(tVar, i32), 2));
                        Intrinsics.checkNotNullExpressionValue(aVarE4, "andThen(...)");
                        return aVarE4;
                }
            }
        });
        this.f231333j = actionDelegateFactory.f(new m(this, 23));
        v60.i iVar = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.k = iVar;
        this.f231334l = v0.a.d("create(...)");
        v60.i iVar2 = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar2, "create(...)");
        this.f231335m = iVar2;
        v60.i iVar3 = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar3, "create(...)");
        this.f231336n = iVar3;
        this.o = zhm.v.k(h.AMOUNT, h.FREQUENCY, h.DESCRIPTION);
    }

    public final efm.r A3() {
        s0 s0Var = (s0) this.f231329b;
        boolean zD = ((od0.i) s0Var.F0().get()).d();
        te0.s sVar = te0.s.f270018a;
        if (zD) {
            efm.r map = te0.w.l(s0Var.F0().c(sVar), s0Var.w0().c(sVar)).map(new o(15, new m(this, 13)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return map;
        }
        efm.r map2 = te0.w.n(s0Var.N0().c(sVar), s0Var.L0().c(sVar), s0Var.x0().c(sVar), s0Var.z0().c(sVar)).map(new o(18, new m(this, 15)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public final efm.b B3(gzc.n incomeSource, List documentGroup) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
        efm.b bVarFlatMapCompletable = efm.r.fromIterable(documentGroup).flatMapCompletable(new o(14, new os9.t(this, incomeSource, 13)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }

    public final pfm.a C3(yzc.f file) {
        Intrinsics.checkNotNullParameter(file, "file");
        efm.d0 d0VarC = te0.w.C(((s0) this.f231329b).C0());
        int i = 4;
        o oVar = new o(i, new os9.t(this, file, 11));
        d0VarC.getClass();
        pfm.a aVar = new pfm.a(d0VarC, oVar, i);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final ufm.i D3() {
        efm.d0 d0VarC = te0.w.C(((s0) this.f231329b).G0());
        o oVar = new o(29, new n(8));
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(d0VarC, oVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final boolean E3() {
        List listN3 = n3();
        if ((listN3 instanceof Collection) && listN3.isEmpty()) {
            return false;
        }
        Iterator it8 = listN3.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((gzc.i) it8.next()).f148003a, "BANK_STATEMENT")) {
                return true;
            }
        }
        return false;
    }

    @Override // ori.b
    public final void c1(Object obj2) {
        h step = (h) obj2;
        Intrinsics.checkNotNullParameter(step, "step");
        te0.e eVarA0 = ((s0) this.f231329b).A0();
        od0.i.Companion.getClass();
        eVarA0.set(od0.h.a(step));
    }

    @Override // ori.b
    public final Object getStep() {
        return (h) ((od0.i) ((s0) this.f231329b).A0().get()).g();
    }

    public final pfm.a j3(String str) {
        efm.k kVarFirstElement = ((s0) this.f231329b).D0().c(te0.s.f270018a).firstElement();
        o oVar = new o(10, new os9.t(this, str, 12));
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, oVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a k3(gzc.c cVar) {
        efm.d0 d0VarC = te0.w.C(((s0) this.f231329b).I0());
        o oVar = new o(23, new oxd.m(cVar, 9));
        d0VarC.getClass();
        pfm.a aVar = new pfm.a(new ufm.i(d0VarC, oVar, 1), new o(24, new m(this, 19)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a l3() {
        s0 s0Var = (s0) this.f231329b;
        te0.e eVarF0 = s0Var.F0();
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        pfm.a aVarE = te0.w.z0(eVarF0, iVar).e(te0.w.z0(s0Var.J0(), iVar)).e(te0.w.z0(s0Var.C0(), zhm.r0.g())).e(te0.w.z0(s0Var.w0(), zhm.h0.f322473a)).e(te0.w.z0(s0Var.D0(), zhm.f0.f322471a));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.h m3(oe0.a aVar) {
        pfm.h hVar = new pfm.h(new ne0.o(this, aVar, 23), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final List n3() {
        s0 s0Var = (s0) this.f231329b;
        List list = (List) ((od0.i) s0Var.K0().get()).g();
        return list == null ? (List) zhm.d0.b0(((gzc.n) ((od0.i) s0Var.N0().get()).c()).f) : list;
    }

    public final gzc.i o3() {
        List<gzc.i> listN3 = n3();
        if (((od0.i) ((s0) this.f231329b).A0().get()).g() != h.BANK_STATEMENT_EVIDENCE_LIST) {
            return (gzc.i) zhm.d0.b0(listN3);
        }
        for (gzc.i iVar : listN3) {
            if (Intrinsics.f(iVar.f148003a, "BANK_STATEMENT")) {
                return iVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final LinkedHashMap p3() {
        s0 s0Var = (s0) this.f231329b;
        LinkedHashMap linkedHashMapZ = zhm.r0.z((Map) s0Var.C0().get());
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(linkedHashMapZ.size()));
        for (Map.Entry entry : linkedHashMapZ.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof yzc.d) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((yzc.d) it8.next()).f318069c);
            }
            linkedHashMap.put(key, arrayList2);
        }
        if (((od0.i) s0Var.E0().get()).g() == gzc.k.EXTERNAL) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!Intrinsics.f(((gzc.i) entry2.getKey()).f148003a, "BANK_STATEMENT")) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }

    public final od0.i q3() {
        return (od0.i) ((s0) this.f231329b).K0().get();
    }

    public final od0.i r3() {
        return (od0.i) ((s0) this.f231329b).N0().get();
    }

    public final boolean s3() {
        gzc.q qVar = (gzc.q) ((od0.i) ((s0) this.f231329b).G0().get()).g();
        return (qVar != null ? qVar.f148030h : null) != null;
    }

    public final boolean t3() {
        gzc.s sVar;
        gzc.p pVar = (gzc.p) ((od0.i) ((s0) this.f231329b).F0().get()).g();
        return ((pVar == null || (sVar = pVar.e) == null) ? null : sVar.f148036a) == gzc.t.UPDATE_REQUIRED;
    }

    public final efm.r u3() {
        efm.r map = ((s0) this.f231329b).Q0().c(te0.s.f270018a).map(new o(9, new n(2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(u1.d(map, this.f231330c.i()), new ox5.t0(29));
    }

    public final efm.r v3() {
        efm.r map = ((s0) this.f231329b).J0().c(te0.s.f270018a).map(new oy9.b(new n(1), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r w3() {
        efm.r rVarHide = this.f231334l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final efm.r x3() {
        efm.r map = ((s0) this.f231329b).z0().c(te0.s.f270018a).flatMap(new o(16, new m(this, 14))).map(new o(17, new n(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r y3() {
        efm.r rVarSwitchMap = ((s0) this.f231329b).J0().c(te0.s.f270018a).switchMap(new oy9.b(new m(this, 4), 28));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r z3() {
        return ((s0) this.f231329b).I0().c(te0.s.f270018a);
    }
}
