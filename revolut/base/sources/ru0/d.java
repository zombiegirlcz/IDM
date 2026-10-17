package ru0;

import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import com.revolut.feature.cards_core.impl.data.network.CardsGsonHolder;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import he0.k;
import he0.m;
import ho.z;
import java.lang.reflect.Type;
import kg.o;
import kg.p;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ne0.l;
import ne0.n;
import org.joda.time.format.DateTimeFormatterBuilder;
import qlm.v1;
import voi.i;
import wl0.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257400a;

    public /* synthetic */ d(int i) {
        this.f257400a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        switch (this.f257400a) {
            case 0:
                StoryPagesView.a aVar2 = StoryPagesView.Companion;
                return Unit.f186387a;
            case 1:
                return qz0.h.a();
            case 2:
                return new DateTimeFormatterBuilder().appendPattern("HH:mm:ssZZ").toFormatter();
            case 3:
                return new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd").toFormatter();
            case 4:
                Lazy lazy = CardsGsonHolder.f65576a;
                p pVar = new p();
                Type type = new TypeToken<String>() { // from class: com.revolut.feature.cards_core.impl.data.network.CardsGsonHolder$instance_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new k(), type);
                m mVar = new m("type", so3.a.class, false, false);
                mVar.c(so3.b.class, so3.b.class.getSimpleName());
                mVar.c(so3.c.class, so3.c.class.getSimpleName());
                pVar.e.add(mVar);
                return pVar.b();
            case 5:
                return yk0.d.a();
            case 6:
                return "Analytics tracker should not work on main thread because of potentially heavy data providers, e.g. advertising id";
            case 7:
                i.a aVar3 = voi.i.Companion;
                return new csi.f(((r1b.a) ((ip.a) hf0.b.d.g()).b().k.f197487a.t2.get()).a());
            case 8:
                i.a aVar4 = voi.i.Companion;
                return ((yi2.a) ((ip.a) hf0.b.d.g()).b().k.f197487a.f198641p7.get()).a().W();
            case 9:
                return (z) voi.i.e().f238016b0.get();
            case 10:
                return voi.i.e().f();
            case 11:
                return voi.i.e().h();
            case 12:
                i.a aVar5 = voi.i.Companion;
                return (wsc.a) ((ysc.a) ((ip.a) hf0.b.d.g()).b().I0.get()).e.get();
            case 13:
                i.a aVar6 = voi.i.Companion;
                return (ff0.a) ((cf0.f) ((ip.a) hf0.b.d.g()).b().C0.get()).f23520c.get();
            case 14:
                i.a aVar7 = voi.i.Companion;
                return new ff0.d((ff0.a) ((cf0.f) ((ip.a) hf0.b.d.g()).b().C0.get()).f23520c.get());
            case 15:
                i.a aVar8 = voi.i.Companion;
                return (String) ((nj0.d) ((ip.a) hf0.b.d.g()).b().F5()).b().e.getValue();
            case 16:
                i.a aVar9 = voi.i.Companion;
                phm.a aVar10 = (phm.a) j6.a.j(hf0.b.d, rta.b.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new tul.b(new aua.f(((vta.a) ((rta.b) aVar.b())).a()));
                }
                throw new IllegalStateException(a0.d.q("Api ", rta.b.class, " is not found"));
            case 17:
                i.a aVar11 = voi.i.Companion;
                return ((ip.a) hf0.b.d.g()).b().E5().a();
            case 18:
                i.a aVar12 = voi.i.Companion;
                phm.a aVar13 = (phm.a) j6.a.j(hf0.b.d, f49.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return ((f49.b) aVar.b()).a();
                }
                throw new IllegalStateException(a0.d.q("Api ", f49.b.class, " is not found"));
            case 19:
                return Unit.f186387a;
            case 20:
                return Unit.f186387a;
            case 21:
                return (hi0.c) hi0.c.Companion.c();
            case 22:
                KProperty[] kPropertyArr = KompotFlow.g0;
                return new wii.c();
            case 23:
                wi0.b[] elements = {wi0.b.k, wi0.b.f297771r, wi0.b.f297776t, wi0.b.U, wi0.b.V, wi0.b.W, wi0.b.Y, wi0.b.f297740e0, wi0.b.f297750h0, wi0.b.f297753k0, wi0.b.f297760n0, wi0.b.f297772r0, wi0.b.f297787x0, wi0.b.y0, wi0.b.G0, wi0.b.I0, wi0.b.L0, wi0.b.S0, wi0.b.T0, wi0.b.f297764o1, wi0.b.f297781v1, wi0.b.f297788x1, wi0.b.f297791y1, wi0.b.L1, wi0.b.T1, wi0.b.V1, wi0.b.h2, wi0.b.i2, wi0.b.t2, wi0.b.y2, wi0.b.C2, wi0.b.D2, wi0.b.I2, wi0.b.L2, wi0.b.N2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 24:
                wi0.b[] elements2 = {wi0.b.f297729b, wi0.b.f297734c, wi0.b.d, wi0.b.e, wi0.b.f, wi0.b.f297746g, wi0.b.f297749h, wi0.b.i, wi0.b.f297752j, wi0.b.k, wi0.b.f297756l, wi0.b.f297759n, wi0.b.o, wi0.b.f297766p, wi0.b.f297768q, wi0.b.f297771r, wi0.b.f297773s, wi0.b.f297776t, wi0.b.u, wi0.b.v, wi0.b.f297783w, wi0.b.f297786x, wi0.b.f297790y, wi0.b.z, wi0.b.A, wi0.b.B, wi0.b.C, wi0.b.D, wi0.b.E, wi0.b.F, wi0.b.G, wi0.b.H, wi0.b.I, wi0.b.J, wi0.b.K, wi0.b.L, wi0.b.M, wi0.b.N, wi0.b.O, wi0.b.P, wi0.b.Q, wi0.b.R, wi0.b.S, wi0.b.T, wi0.b.U, wi0.b.V, wi0.b.W, wi0.b.X, wi0.b.Y, wi0.b.Z, wi0.b.f297726a0, wi0.b.f297730b0, wi0.b.c0, wi0.b.f297736d0, wi0.b.f297740e0, wi0.b.f0, wi0.b.g0, wi0.b.f297750h0, wi0.b.i0, wi0.b.f297753k0, wi0.b.l0, wi0.b.m0, wi0.b.f297760n0, wi0.b.f297763o0, wi0.b.p0, wi0.b.q0, wi0.b.f297772r0, wi0.b.f297774s0, wi0.b.f297777t0, wi0.b.u0, wi0.b.f297780v0, wi0.b.f297784w0, wi0.b.f297787x0, wi0.b.y0, wi0.b.z0, wi0.b.A0, wi0.b.B0, wi0.b.C0, wi0.b.D0, wi0.b.E0, wi0.b.G0, wi0.b.H0, wi0.b.I0, wi0.b.J0, wi0.b.K0, wi0.b.L0, wi0.b.M0, wi0.b.N0, wi0.b.O0, wi0.b.P0, wi0.b.Q0, wi0.b.R0, wi0.b.S0, wi0.b.T0, wi0.b.U0, wi0.b.V0, wi0.b.W0, wi0.b.X0, wi0.b.Y0, wi0.b.Z0, wi0.b.a1, wi0.b.f297731b1, wi0.b.f297735c1, wi0.b.f297737d1, wi0.b.f297741e1, wi0.b.f297743f1, wi0.b.f297747g1, wi0.b.f297751h1, wi0.b.f297754k1, wi0.b.f297761n1, wi0.b.f297764o1, wi0.b.f297767p1, wi0.b.f297775s1, wi0.b.f297778t1, wi0.b.f297781v1, wi0.b.f297788x1, wi0.b.f297791y1, wi0.b.A1, wi0.b.C1, wi0.b.H1, wi0.b.K1, wi0.b.L1, wi0.b.M1, wi0.b.N1, wi0.b.O1, wi0.b.P1, wi0.b.Q1, wi0.b.R1, wi0.b.S1, wi0.b.T1, wi0.b.U1, wi0.b.V1, wi0.b.W1, wi0.b.X1, wi0.b.Y1, wi0.b.Z1, wi0.b.f297727a2, wi0.b.f297732b2, wi0.b.c2, wi0.b.f297738d2, wi0.b.e2, wi0.b.f297744f2, wi0.b.f297748g2, wi0.b.h2, wi0.b.i2, wi0.b.j2, wi0.b.f297755k2, wi0.b.l2, wi0.b.f297758m2, wi0.b.f297762n2, wi0.b.f297765o2, wi0.b.p2, wi0.b.f297769q2, wi0.b.r2, wi0.b.s2, wi0.b.t2, wi0.b.u2, wi0.b.v2, wi0.b.f297785w2, wi0.b.f297789x2, wi0.b.y2, wi0.b.f297793z2, wi0.b.A2, wi0.b.C2, wi0.b.D2, wi0.b.E2, wi0.b.F2, wi0.b.G2, wi0.b.H2, wi0.b.I2, wi0.b.J2, wi0.b.K2, wi0.b.L2, wi0.b.M2, wi0.b.N2, wi0.b.O2, wi0.b.P2, wi0.b.Q2, wi0.b.R2, wi0.b.S2, wi0.b.T2, wi0.b.U2, wi0.b.V2, wi0.b.W2, wi0.b.X2, wi0.b.Y2, wi0.b.Z2, wi0.b.f297728a3, wi0.b.f297733b3, wi0.b.c3, wi0.b.f297739d3, wi0.b.f297742e3, wi0.b.f297745f3, wi0.b.g3, wi0.b.h3, wi0.b.i3, wi0.b.j3, wi0.b.k3, wi0.b.l3, wi0.b.m3, wi0.b.n3, wi0.b.o3, wi0.b.p3, wi0.b.f297770q3, wi0.b.r3, wi0.b.s3, wi0.b.t3, wi0.b.f297779u3, wi0.b.f297782v3, wi0.b.w3, wi0.b.x3, wi0.b.f297792y3, wi0.b.z3, wi0.b.A3, wi0.b.B3, wi0.b.C3, wi0.b.D3, wi0.b.E3, wi0.b.F3, wi0.b.G3};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return kotlin.collections.d.y0(elements2);
            case 25:
                return new o();
            case 26:
                d.b bVar = wl0.d.Companion;
                return new qlm.e(v1.f247718a);
            case 27:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 28:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP));
            default:
                n.Companion.getClass();
                return l.a(3, 5L);
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f257400a = i;
    }
}
