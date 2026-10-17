package c2h;

import a2d.m;
import android.content.Context;
import androidx.room.migration.Migration;
import c3d.c;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import d3d.g;
import e4m.e;
import h4d.h;
import kotlin.jvm.internal.Intrinsics;
import l3f.d;
import m3f.a0;
import m3f.a1;
import m3f.a2;
import m3f.a3;
import m3f.a4;
import m3f.b0;
import m3f.b1;
import m3f.b2;
import m3f.b3;
import m3f.b4;
import m3f.c0;
import m3f.c1;
import m3f.c2;
import m3f.c3;
import m3f.c4;
import m3f.d0;
import m3f.d1;
import m3f.d2;
import m3f.d3;
import m3f.d4;
import m3f.e0;
import m3f.e1;
import m3f.e2;
import m3f.e3;
import m3f.e4;
import m3f.f;
import m3f.f0;
import m3f.f1;
import m3f.f2;
import m3f.f3;
import m3f.f4;
import m3f.g0;
import m3f.g1;
import m3f.g2;
import m3f.g3;
import m3f.g4;
import m3f.h0;
import m3f.h1;
import m3f.h2;
import m3f.h3;
import m3f.h4;
import m3f.i;
import m3f.i0;
import m3f.i1;
import m3f.i2;
import m3f.i3;
import m3f.i4;
import m3f.j0;
import m3f.j1;
import m3f.j2;
import m3f.j3;
import m3f.j4;
import m3f.k;
import m3f.k0;
import m3f.k1;
import m3f.k2;
import m3f.k3;
import m3f.k4;
import m3f.l;
import m3f.l0;
import m3f.l1;
import m3f.l2;
import m3f.l3;
import m3f.l4;
import m3f.m0;
import m3f.m1;
import m3f.m2;
import m3f.m3;
import m3f.m4;
import m3f.n;
import m3f.n0;
import m3f.n1;
import m3f.n2;
import m3f.n3;
import m3f.n4;
import m3f.o;
import m3f.o0;
import m3f.o1;
import m3f.o2;
import m3f.o3;
import m3f.o4;
import m3f.p;
import m3f.p0;
import m3f.p1;
import m3f.p2;
import m3f.p3;
import m3f.p4;
import m3f.q;
import m3f.q0;
import m3f.q1;
import m3f.q2;
import m3f.q3;
import m3f.q4;
import m3f.r;
import m3f.r0;
import m3f.r1;
import m3f.r2;
import m3f.r3;
import m3f.r4;
import m3f.s0;
import m3f.s1;
import m3f.s2;
import m3f.s3;
import m3f.s4;
import m3f.t;
import m3f.t0;
import m3f.t1;
import m3f.t2;
import m3f.t3;
import m3f.t4;
import m3f.u;
import m3f.u0;
import m3f.u1;
import m3f.u2;
import m3f.u3;
import m3f.u4;
import m3f.v;
import m3f.v0;
import m3f.v1;
import m3f.v2;
import m3f.v3;
import m3f.v4;
import m3f.w;
import m3f.w0;
import m3f.w1;
import m3f.w2;
import m3f.w3;
import m3f.w4;
import m3f.x;
import m3f.x0;
import m3f.x1;
import m3f.x2;
import m3f.x3;
import m3f.x4;
import m3f.y;
import m3f.y0;
import m3f.y1;
import m3f.y2;
import m3f.y3;
import m3f.z;
import m3f.z0;
import m3f.z1;
import m3f.z2;
import m3f.z3;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20786b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f20785a = i;
        this.f20786b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f20785a;
        int i2 = 6;
        int i3 = 4;
        int i5 = 0;
        int i6 = 5;
        int i21 = 2;
        int i22 = 7;
        int i32 = 1;
        Object obj2 = this.f20786b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                return new m(bVar.f20787a, bVar.f20788b, bVar.f20789c, i2);
            case 1:
                c cVar = (c) obj2;
                m4d.a aVar = cVar.f20932a;
                h hVar = new h((h4d.a) aVar.f202715y.get(), (ue0.c) aVar.f202711s.get(), (j) aVar.o.get());
                y1d.b bVar2 = cVar.f20933b;
                u3d.c cVar2 = (u3d.c) ((a2d.j) bVar2).i0.get();
                s.j(cVar2);
                ImmutableSet immutableSetA = ((a2d.j) bVar2).a();
                s.j(immutableSetA);
                return new g(hVar, cVar2, immutableSetA);
            case 2:
                c4f.b bVar3 = (c4f.b) obj2;
                Context context = bVar3.f21193a;
                yk0.a databaseSessionProvider = bVar3.f21194b.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) bVar3.f21195c).a();
                s.j(databaseEncryptionMigratorFactory);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                TradingDatabase.Companion companion = TradingDatabase.INSTANCE;
                companion.getClass();
                TradingDatabase tradingDatabase = (TradingDatabase) companion.a(context, databaseSessionProvider, new Migration[]{n1.f202456c, y1.f202522c, j2.f202433c, u2.f202499c, f3.f202410c, q3.f202476c, b4.f202387c, m4.f202453c, x4.f202519c, k.f202436c, v.f202502c, g0.f202413c, r0.f202479c, c1.f202390c, i1.f202426c, j1.f202432c, k1.f202438c, l1.f202444c, m1.f202450c, o1.f202462c, p1.f202468c, q1.f202474c, r1.f202480c, s1.f202486c, t1.f202492c, u1.f202498c, v1.f202504c, w1.f202510c, x1.f202516c, z1.f202527c, a2.f202379c, b2.f202385c, c2.f202391c, d2.f202397c, e2.f202403c, f2.f202409c, g2.f202415c, h2.f202421c, i2.f202427c, k2.f202439c, l2.f202445c, m2.f202451c, n2.f202457c, o2.f202463c, p2.f202469c, q2.f202475c, r2.f202481c, s2.f202487c, t2.f202493c, v2.f202505c, w2.f202511c, x2.f202517c, y2.f202523c, z2.f202528c, a3.f202380c, b3.f202386c, c3.f202392c, d3.f202398c, e3.f202404c, g3.f202416c, h3.f202422c, i3.f202428c, j3.f202434c, k3.f202440c, l3.f202446c, m3.f202452c, n3.f202458c, o3.f202464c, p3.f202470c, r3.f202482c, s3.f202488c, t3.f202494c, u3.f202500c, v3.f202506c, w3.f202512c, x3.f202518c, y3.f202524c, z3.f202529c, a4.f202381c, c4.f202393c, d4.f202399c, e4.f202405c, f4.f202411c, g4.f202417c, h4.f202423c, i4.f202429c, j4.f202435c, k4.f202441c, l4.f202447c, n4.f202459c, o4.f202465c, p4.f202471c, q4.f202477c, r4.f202483c, s4.f202489c, t4.f202495c, u4.f202501c, v4.f202507c, w4.f202513c, m3f.a.f202376c, m3f.b.f202382c, m3f.c.f202388c, m3f.d.f202394c, m3f.e.f202400c, f.f202406c, m3f.g.f202412c, m3f.h.f202418c, i.f202424c, m3f.j.f202430c, l.f202442c, m3f.m.f202448c, n.f202454c, o.f202460c, p.f202466c, q.f202472c, r.f202478c, m3f.s.f202484c, t.f202490c, u.f202496c, w.f202508c, x.f202514c, y.f202520c, z.f202525c, a0.f202377c, b0.f202383c, c0.f202389c, d0.f202395c, e0.f202401c, f0.f202407c, h0.f202419c, i0.f202425c, j0.f202431c, k0.f202437c, l0.f202443c, m0.f202449c, n0.f202455c, o0.f202461c, p0.f202467c, q0.f202473c, s0.f202485c, t0.f202491c, u0.f202497c, v0.f202503c, w0.f202509c, x0.f202515c, y0.f202521c, z0.f202526c, a1.f202378c, b1.f202384c, d1.f202396c, e1.f202402c, f1.f202408c, g1.f202414c, h1.f202420c}, databaseEncryptionMigratorFactory);
                s.k(tradingDatabase);
                return tradingDatabase;
            case 3:
                fmc.z tradingDatabaseProvider = ((c4f.j) obj2).f21220a.a();
                c4f.t.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingDatabaseProvider, "tradingDatabaseProvider");
                j3f.i iVarK = ((TradingDatabase) tradingDatabaseProvider.f136369b).k();
                s.k(iVarK);
                return iVarK;
            case 4:
                c51.f fVar = (c51.f) obj2;
                return new a0b.g(fVar.f21357a, fVar.f21358b, fVar.f21359c, fVar.d, fVar.e, fVar.f, fVar.f21360g, 1);
            case 5:
                c81.a aVar2 = (c81.a) obj2;
                return new c3d.a(aVar2.f22069a, aVar2.f22070b, aVar2.f22071c, i3);
            case 6:
                ced.a aVar3 = (ced.a) obj2;
                return new bi3.c(aVar3.f23469a, aVar3.f23470b, aVar3.f23471c, aVar3.d, aVar3.e, aVar3.f, aVar3.f23472g, aVar3.f23473h);
            case 7:
                ceh.a aVar4 = (ceh.a) obj2;
                return new deh.c(aVar4.f23480a, aVar4.f23481b, aVar4.f23482c, aVar4.d, aVar4.e, aVar4.f, aVar4.f23483g, aVar4.f23484h, aVar4.i, 0);
            case 8:
                return new com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.a(((cf7.d) obj2).f23603a);
            case 9:
                return new lg7.c(((cf7.f) obj2).f23611a);
            case 10:
                return new com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.a(((cf7.g) obj2).f23614a);
            case 11:
                cj5.b bVar4 = (cj5.b) obj2;
                return new dj5.b(bVar4.f24604a, bVar4.f24605b, bVar4.f24606c, i5);
            case 12:
                cjf.a aVar5 = (cjf.a) obj2;
                return new m(aVar5.f24666a, aVar5.f24667b, aVar5.f24668c, i6);
            case 13:
                cjf.b bVar5 = (cjf.b) obj2;
                mjf.q qVar = (mjf.q) ((bjf.a) bVar5.f24669a).Q.get();
                s.j(qVar);
                rnb.w wVarB = bVar5.f24670b.b();
                s.j(wVarB);
                gte.a aVarB = bVar5.f24671c.b();
                s.j(aVarB);
                return new pjf.b(qVar, wVarB, aVarB);
            case 14:
                cl0.c cVar3 = (cl0.c) obj2;
                return new c3d.a(cVar3.f24921a, cVar3.f24922b, cVar3.f24923c, i21);
            case 15:
                cqk.a aVar6 = (cqk.a) obj2;
                return new m(aVar6.f108148a, aVar6.f108149b, aVar6.f108150c, i22);
            case 16:
                crb.a aVar7 = (crb.a) obj2;
                return new ax4.c(aVar7.f108347a, aVar7.f108348b, aVar7.f108349c, aVar7.d, 3);
            case 17:
                crl.a aVar8 = (crl.a) obj2;
                return new deh.c(aVar8.f108402a, aVar8.f108403b, aVar8.f108404c, aVar8.d, aVar8.e, aVar8.f, aVar8.f108405g, aVar8.f108406h, aVar8.i, 2);
            case 18:
                csc.a aVar9 = (csc.a) obj2;
                return new c1d.d(aVar9.f108463a, aVar9.f108464b, aVar9.f108465c, aVar9.d, aVar9.e, aVar9.f, 7);
            case 19:
                cv1.b bVar6 = (cv1.b) obj2;
                return new fsg.f(bVar6.f109217a, bVar6.f109218b, bVar6.f109219c, bVar6.d, bVar6.e, bVar6.f, bVar6.f109220g, bVar6.f109221h, bVar6.i, bVar6.f109222j, bVar6.k, bVar6.f109223l, bVar6.f109224m, bVar6.f109225n, bVar6.o, bVar6.f109226p, 2);
            case 20:
                cv2.b bVar7 = (cv2.b) obj2;
                return new ajf.d(bVar7.f109228a, bVar7.f109229b, bVar7.f109230c, bVar7.d, bVar7.e, 2);
            case 21:
                return new com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.a(((cwi.y) obj2).f109816a, new i90.b());
            case 22:
                return new com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a(((cwi.f0) obj2).f109667a);
            case 23:
                dwi.x xVar = (dwi.x) ((cwi.l1) obj2).f109743a.f109801m.get();
                s.j(xVar);
                return new c1g.v(xVar);
            case 24:
                cz2.a aVar10 = (cz2.a) obj2;
                return new c3d.d(aVar10.f110140a, aVar10.f110141b, i32);
            case 25:
                d39.a aVar11 = (d39.a) obj2;
                return new e39.b(aVar11.f110943a, aVar11.f110944b, aVar11.f110945c, aVar11.d, aVar11.e, aVar11.f, aVar11.f110946g, aVar11.f110947h, aVar11.i, aVar11.f110948j, aVar11.k, aVar11.f110949l, aVar11.f110950m, aVar11.f110951n, aVar11.o, aVar11.f110952p, aVar11.f110953q, aVar11.f110954r, aVar11.f110955s, aVar11.f110956t, aVar11.u);
            case 26:
                d53.a aVar12 = (d53.a) obj2;
                return new ajf.d(aVar12.f111342a, aVar12.f111343b, aVar12.f111344c, aVar12.d, aVar12.e, 1);
            case 27:
                d53.b bVar8 = (d53.b) obj2;
                return new c1d.d(bVar8.f111345a, bVar8.f111346b, bVar8.f111347c, bVar8.d, bVar8.e, bVar8.f, 3);
            case 28:
                d66.a aVar13 = (d66.a) obj2;
                return new anb.c0(aVar13.f111449a, aVar13.f111450b, aVar13.f111451c, aVar13.d, 5);
            default:
                d79.a aVar14 = (d79.a) obj2;
                return new bo9.d(aVar14.f111886a, aVar14.f111887b, aVar14.f111888c, aVar14.d, aVar14.e, aVar14.f, 2);
        }
    }

    public a(cwi.h0 h0Var, cwi.y yVar) {
        this.f20785a = 21;
        this.f20786b = yVar;
    }
}
