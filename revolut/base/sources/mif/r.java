package mif;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.Json;
import net.sf.scuba.smartcards.ISO7816;
import nif.a1;
import nif.a2;
import nif.b1;
import nif.b3;
import nif.c1;
import nif.d3;
import nif.e3;
import nif.f0;
import nif.f3;
import nif.g3;
import nif.h1;
import nif.h3;
import nif.h4;
import nif.i0;
import nif.k2;
import nif.k3;
import nif.k4;
import nif.l0;
import nif.l4;
import nif.m4;
import nif.n1;
import nif.n4;
import nif.o0;
import nif.o1;
import nif.p1;
import nif.q1;
import nif.r1;
import nif.r2;
import nif.r3;
import nif.s1;
import nif.s3;
import nif.t1;
import nif.u0;
import nif.v0;
import nif.v3;
import nif.w3;
import nif.x0;
import nif.x2;
import nif.y2;
import nif.z0;
import nif.z2;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f205826b;

    public /* synthetic */ r(s sVar, int i) {
        this.f205825a = i;
        this.f205826b = sVar;
    }

    public void a(SQLiteStatement sQLiteStatement, f3 f3Var) {
        if (f3Var.Y() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, f3Var.Y());
        }
        if (f3Var.R() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, f3Var.R());
        }
        if (f3Var.E0() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, f3Var.E0());
        }
        if (f3Var.x0() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, f3Var.x0());
        }
        sQLiteStatement.bindLong(5, f3Var.C());
        sQLiteStatement.bindLong(6, f3Var.w0());
        sQLiteStatement.bindLong(7, f3Var.F0());
        sQLiteStatement.bindLong(8, f3Var.e());
        if (f3Var.E() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, f3Var.E());
        }
        sQLiteStatement.bindLong(10, f3Var.j0());
        if (f3Var.k0() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, f3Var.k0());
        }
        if (f3Var.l0() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, f3Var.l0());
        }
        if (f3Var.t() == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, f3Var.t());
        }
        if (f3Var.y() == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindLong(14, f3Var.y().longValue());
        }
        if (f3Var.m() == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindLong(15, f3Var.m().longValue());
        }
        if (f3Var.F() == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, f3Var.F());
        }
        if (f3Var.y0() == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, f3Var.y0());
        }
        if (f3Var.a0() == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, f3Var.a0());
        }
        if (f3Var.q0() == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, f3Var.q0());
        }
        sQLiteStatement.bindLong(20, f3Var.g());
        if (f3Var.p0() == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindText(21, f3Var.p0());
        }
        if (f3Var.M() == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindDouble(22, f3Var.M().doubleValue());
        }
        if (f3Var.O() == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, f3Var.O());
        }
        if (f3Var.N() == null) {
            sQLiteStatement.bindNull(24);
        } else {
            sQLiteStatement.bindText(24, f3Var.N());
        }
        if ((f3Var.I() == null ? null : Integer.valueOf(f3Var.I().booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(25);
        } else {
            sQLiteStatement.bindLong(25, r0.intValue());
        }
        if ((f3Var.r() == null ? null : Integer.valueOf(f3Var.r().booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(26);
        } else {
            sQLiteStatement.bindLong(26, r0.intValue());
        }
        if (f3Var.s() == null) {
            sQLiteStatement.bindNull(27);
        } else {
            sQLiteStatement.bindText(27, f3Var.s());
        }
        if (f3Var.L() == null) {
            sQLiteStatement.bindNull(28);
        } else {
            sQLiteStatement.bindText(28, f3Var.L());
        }
        if (f3Var.A0() == null) {
            sQLiteStatement.bindNull(29);
        } else {
            sQLiteStatement.bindText(29, f3Var.A0());
        }
        if (f3Var.C0() == null) {
            sQLiteStatement.bindNull(30);
        } else {
            sQLiteStatement.bindText(30, f3Var.C0());
        }
        if (f3Var.V() == null) {
            sQLiteStatement.bindNull(31);
        } else {
            sQLiteStatement.bindText(31, f3Var.V());
        }
        sQLiteStatement.bindLong(32, f3Var.J0() ? 1L : 0L);
        s sVar = this.f205826b;
        oif.c cVar = sVar.e;
        k3 k3VarZ = f3Var.Z();
        cVar.getClass();
        String strG = oif.c.g(k3VarZ);
        if (strG == null) {
            sQLiteStatement.bindNull(33);
        } else {
            sQLiteStatement.bindText(33, strG);
        }
        if ((f3Var.D0() == null ? null : Integer.valueOf(f3Var.D0().booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(34);
        } else {
            sQLiteStatement.bindLong(34, r2.intValue());
        }
        if ((f3Var.u() == null ? null : Integer.valueOf(f3Var.u().booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(35);
        } else {
            sQLiteStatement.bindLong(35, r2.intValue());
        }
        if (f3Var.v() == null) {
            sQLiteStatement.bindNull(36);
        } else {
            sQLiteStatement.bindText(36, f3Var.v());
        }
        if (f3Var.b() == null) {
            sQLiteStatement.bindNull(37);
        } else {
            sQLiteStatement.bindLong(37, f3Var.b().intValue());
        }
        if (f3Var.c() == null) {
            sQLiteStatement.bindNull(38);
        } else {
            sQLiteStatement.bindDouble(38, f3Var.c().doubleValue());
        }
        if (f3Var.J() == null) {
            sQLiteStatement.bindNull(39);
        } else {
            sQLiteStatement.bindText(39, f3Var.J());
        }
        if (f3Var.S() == null) {
            sQLiteStatement.bindNull(40);
        } else {
            sQLiteStatement.bindText(40, f3Var.S());
        }
        if (f3Var.B() == null) {
            sQLiteStatement.bindNull(41);
        } else {
            sQLiteStatement.bindText(41, f3Var.B());
        }
        sQLiteStatement.bindLong(42, f3Var.h());
        if (f3Var.i() == null) {
            sQLiteStatement.bindNull(43);
        } else {
            sQLiteStatement.bindText(43, f3Var.i());
        }
        oif.c cVar2 = sVar.e;
        k2 k2VarR0 = f3Var.r0();
        cVar2.getClass();
        String strC = oif.c.c(k2VarR0);
        if (strC == null) {
            sQLiteStatement.bindNull(44);
        } else {
            sQLiteStatement.bindText(44, strC);
        }
        if (f3Var.o() == null) {
            sQLiteStatement.bindNull(45);
        } else {
            sQLiteStatement.bindLong(45, f3Var.o().longValue());
        }
        if (f3Var.n0() == null) {
            sQLiteStatement.bindNull(46);
        } else {
            sQLiteStatement.bindText(46, f3Var.n0());
        }
        if (f3Var.t0() == null) {
            sQLiteStatement.bindNull(47);
        } else {
            sQLiteStatement.bindText(47, f3Var.t0());
        }
        if (f3Var.b0() == null) {
            sQLiteStatement.bindNull(48);
        } else {
            sQLiteStatement.bindText(48, f3Var.b0());
        }
        if (f3Var.c0() == null) {
            sQLiteStatement.bindNull(49);
        } else {
            sQLiteStatement.bindText(49, f3Var.c0());
        }
        if (f3Var.q() == null) {
            sQLiteStatement.bindNull(50);
        } else {
            sQLiteStatement.bindText(50, f3Var.q());
        }
        if (f3Var.B0() == null) {
            sQLiteStatement.bindNull(51);
        } else {
            sQLiteStatement.bindText(51, f3Var.B0());
        }
        if (f3Var.H0() == null) {
            sQLiteStatement.bindNull(52);
        } else {
            sQLiteStatement.bindText(52, f3Var.H0());
        }
        if (f3Var.g0() == null) {
            sQLiteStatement.bindNull(53);
        } else {
            sQLiteStatement.bindText(53, f3Var.g0());
        }
        if (f3Var.G() == null) {
            sQLiteStatement.bindNull(54);
        } else {
            sQLiteStatement.bindText(54, f3Var.G());
        }
        if (f3Var.d0() == null) {
            sQLiteStatement.bindNull(55);
        } else {
            sQLiteStatement.bindLong(55, f3Var.d0().longValue());
        }
        if (f3Var.e0() == null) {
            sQLiteStatement.bindNull(56);
        } else {
            sQLiteStatement.bindText(56, f3Var.e0());
        }
        if (f3Var.i0() == null) {
            sQLiteStatement.bindNull(57);
        } else {
            sQLiteStatement.bindText(57, f3Var.i0());
        }
        if (f3Var.A() == null) {
            sQLiteStatement.bindNull(58);
        } else {
            sQLiteStatement.bindText(58, f3Var.A());
        }
        if ((f3Var.u0() == null ? null : Integer.valueOf(f3Var.u0().booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(59);
        } else {
            sQLiteStatement.bindLong(59, r2.intValue());
        }
        if (f3Var.s0() == null) {
            sQLiteStatement.bindNull(60);
        } else {
            sQLiteStatement.bindText(60, f3Var.s0());
        }
        if (f3Var.h0() == null) {
            sQLiteStatement.bindNull(61);
        } else {
            sQLiteStatement.bindText(61, f3Var.h0());
        }
        nif.p pVarZ = f3Var.z();
        if (pVarZ != null) {
            if (pVarZ.a() == null) {
                sQLiteStatement.bindNull(62);
            } else {
                sQLiteStatement.bindLong(62, pVarZ.a().longValue());
            }
            if (pVarZ.b() == null) {
                sQLiteStatement.bindNull(63);
            } else {
                sQLiteStatement.bindText(63, pVarZ.b());
            }
            if (pVarZ.c() == null) {
                sQLiteStatement.bindNull(64);
            } else {
                sQLiteStatement.bindText(64, pVarZ.c());
            }
            if (pVarZ.d() == null) {
                sQLiteStatement.bindNull(65);
            } else {
                sQLiteStatement.bindText(65, pVarZ.d());
            }
        } else {
            prk.o.z(sQLiteStatement, 62, 63, 64, 65);
        }
        nif.n nVarP = f3Var.p();
        if (nVarP != null) {
            if (nVarP.c() == null) {
                sQLiteStatement.bindNull(66);
            } else {
                sQLiteStatement.bindText(66, nVarP.c());
            }
            if (nVarP.e() == null) {
                sQLiteStatement.bindNull(67);
            } else {
                sQLiteStatement.bindText(67, nVarP.e());
            }
            if (nVarP.d() == null) {
                sQLiteStatement.bindNull(68);
            } else {
                sQLiteStatement.bindText(68, nVarP.d());
            }
            if ((nVarP.b() == null ? null : Integer.valueOf(nVarP.b().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(69);
            } else {
                sQLiteStatement.bindLong(69, r6.intValue());
            }
            if ((nVarP.f() == null ? null : Integer.valueOf(nVarP.f().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(70);
            } else {
                sQLiteStatement.bindLong(70, r5.intValue());
            }
            if ((nVarP.a() == null ? null : Integer.valueOf(nVarP.a().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(71);
            } else {
                sQLiteStatement.bindLong(71, r2.intValue());
            }
        } else {
            prk.o.z(sQLiteStatement, 66, 67, 68, 69);
            sQLiteStatement.bindNull(70);
            sQLiteStatement.bindNull(71);
        }
        nif.j jVarL = f3Var.l();
        if (jVarL != null) {
            if (jVarL.b() == null) {
                sQLiteStatement.bindNull(72);
            } else {
                sQLiteStatement.bindText(72, jVarL.b());
            }
            if (jVarL.a() == null) {
                sQLiteStatement.bindNull(73);
            } else {
                sQLiteStatement.bindText(73, jVarL.a());
            }
            if (jVarL.c() == null) {
                sQLiteStatement.bindNull(74);
            } else {
                sQLiteStatement.bindText(74, jVarL.c());
            }
        } else {
            prk.o.y(sQLiteStatement, 72, 73, 74);
        }
        r2 r2VarV0 = f3Var.v0();
        if (r2VarV0 != null) {
            if (r2VarV0.c() == null) {
                sQLiteStatement.bindNull(75);
            } else {
                sQLiteStatement.bindText(75, r2VarV0.c());
            }
            if (r2VarV0.f() == null) {
                sQLiteStatement.bindNull(76);
            } else {
                sQLiteStatement.bindText(76, r2VarV0.f());
            }
            if (r2VarV0.i() == null) {
                sQLiteStatement.bindNull(77);
            } else {
                sQLiteStatement.bindText(77, r2VarV0.i());
            }
            if (r2VarV0.h() == null) {
                sQLiteStatement.bindNull(78);
            } else {
                sQLiteStatement.bindText(78, r2VarV0.h());
            }
            if (r2VarV0.e() == null) {
                sQLiteStatement.bindNull(79);
            } else {
                sQLiteStatement.bindText(79, r2VarV0.e());
            }
            if ((r2VarV0.g() == null ? null : Integer.valueOf(r2VarV0.g().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(80);
            } else {
                sQLiteStatement.bindLong(80, r3.intValue());
            }
            if ((r2VarV0.a() == null ? null : Integer.valueOf(r2VarV0.a().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(81);
            } else {
                sQLiteStatement.bindLong(81, r3.intValue());
            }
            jo3.b bVarD = r2VarV0.d();
            if (bVarD == null) {
                sQLiteStatement.bindNull(82);
                sQLiteStatement.bindNull(83);
            } else if (a10.b.v(bVarD, sQLiteStatement, 82) == null) {
                sQLiteStatement.bindNull(83);
            } else {
                sQLiteStatement.bindText(83, bVarD.getCurrency());
            }
            jo3.b bVarB = r2VarV0.b();
            if (bVarB == null) {
                sQLiteStatement.bindNull(84);
                sQLiteStatement.bindNull(85);
            } else if (a10.b.v(bVarB, sQLiteStatement, 84) == null) {
                sQLiteStatement.bindNull(85);
            } else {
                sQLiteStatement.bindText(85, bVarB.getCurrency());
            }
        } else {
            prk.o.z(sQLiteStatement, 75, 76, 77, 78);
            prk.o.z(sQLiteStatement, 79, 80, 81, 82);
            prk.o.y(sQLiteStatement, 83, 84, 85);
        }
        nif.k kVarN = f3Var.n();
        if (kVarN != null) {
            if (kVarN.d() == null) {
                sQLiteStatement.bindNull(86);
            } else {
                sQLiteStatement.bindText(86, kVarN.d());
            }
            if (kVarN.g() == null) {
                sQLiteStatement.bindNull(87);
            } else {
                sQLiteStatement.bindText(87, kVarN.g());
            }
            if (kVarN.a() == null) {
                sQLiteStatement.bindNull(88);
            } else {
                sQLiteStatement.bindText(88, kVarN.a());
            }
            if (kVarN.e() == null) {
                sQLiteStatement.bindNull(89);
            } else {
                sQLiteStatement.bindText(89, kVarN.e());
            }
            if (kVarN.b() == null) {
                sQLiteStatement.bindNull(90);
            } else {
                sQLiteStatement.bindText(90, kVarN.b());
            }
            if (kVarN.f() == null) {
                sQLiteStatement.bindNull(91);
            } else {
                sQLiteStatement.bindText(91, kVarN.f());
            }
            nif.m mVarC = kVarN.c();
            if (mVarC != null) {
                sQLiteStatement.bindLong(92, mVarC.b() ? 1L : 0L);
                nif.l lVarA = mVarC.a();
                if (lVarA != null) {
                    sQLiteStatement.bindLong(93, lVarA.a());
                    if (lVarA.b() == null) {
                        sQLiteStatement.bindNull(94);
                    } else {
                        sQLiteStatement.bindText(94, lVarA.b());
                    }
                } else {
                    sQLiteStatement.bindNull(93);
                    sQLiteStatement.bindNull(94);
                }
            } else {
                prk.o.y(sQLiteStatement, 92, 93, 94);
            }
        } else {
            prk.o.z(sQLiteStatement, 86, 87, 88, 89);
            prk.o.z(sQLiteStatement, 90, 91, 92, 93);
            sQLiteStatement.bindNull(94);
        }
        nif.f fVarD = f3Var.d();
        if (fVarD != null) {
            if (fVarD.c() == null) {
                sQLiteStatement.bindNull(95);
            } else {
                sQLiteStatement.bindText(95, fVarD.c());
            }
            if (fVarD.b() == null) {
                sQLiteStatement.bindNull(96);
            } else {
                sQLiteStatement.bindText(96, fVarD.b());
            }
            if (fVarD.d() == null) {
                sQLiteStatement.bindNull(97);
            } else {
                sQLiteStatement.bindText(97, fVarD.d());
            }
            b21.a aVar = sVar.f;
            Map mapA = fVarD.a();
            aVar.getClass();
            String strN = b21.a.n(mapA);
            if (strN == null) {
                sQLiteStatement.bindNull(98);
            } else {
                sQLiteStatement.bindText(98, strN);
            }
        } else {
            prk.o.z(sQLiteStatement, 95, 96, 97, 98);
        }
        m4 m4VarG0 = f3Var.G0();
        if (m4VarG0 != null) {
            if (m4VarG0.d() == null) {
                sQLiteStatement.bindNull(99);
            } else {
                sQLiteStatement.bindText(99, m4VarG0.d());
            }
            if (m4VarG0.c() == null) {
                sQLiteStatement.bindNull(100);
            } else {
                sQLiteStatement.bindLong(100, m4VarG0.c().longValue());
            }
            if (m4VarG0.e() == null) {
                sQLiteStatement.bindNull(101);
            } else {
                sQLiteStatement.bindLong(101, m4VarG0.e().longValue());
            }
            if ((m4VarG0.b() != null ? Integer.valueOf(m4VarG0.b().booleanValue() ? 1 : 0) : null) == null) {
                sQLiteStatement.bindNull(102);
            } else {
                sQLiteStatement.bindLong(102, r1.intValue());
            }
            oif.c cVar3 = sVar.e;
            h4 h4VarA = m4VarG0.a();
            cVar3.getClass();
            String strD = oif.c.d(h4VarA);
            if (strD == null) {
                sQLiteStatement.bindNull(103);
            } else {
                sQLiteStatement.bindText(103, strD);
            }
            oif.c cVar4 = sVar.e;
            k4 k4VarF = m4VarG0.f();
            cVar4.getClass();
            String strE = oif.c.e(k4VarF);
            if (strE == null) {
                sQLiteStatement.bindNull(104);
            } else {
                sQLiteStatement.bindText(104, strE);
            }
            l4 l4VarG = m4VarG0.g();
            if (l4VarG != null) {
                if (l4VarG.b() == null) {
                    sQLiteStatement.bindNull(105);
                } else {
                    sQLiteStatement.bindDouble(105, l4VarG.b().doubleValue());
                }
                if (l4VarG.a() == null) {
                    sQLiteStatement.bindNull(106);
                } else {
                    sQLiteStatement.bindDouble(106, l4VarG.a().doubleValue());
                }
            } else {
                sQLiteStatement.bindNull(105);
                sQLiteStatement.bindNull(106);
            }
        } else {
            prk.o.z(sQLiteStatement, 99, 100, 101, 102);
            prk.o.z(sQLiteStatement, 103, 104, 105, 106);
        }
        g3 g3VarQ = f3Var.Q();
        if (g3VarQ != null) {
            if (g3VarQ.c() == null) {
                sQLiteStatement.bindNull(107);
            } else {
                sQLiteStatement.bindText(107, g3VarQ.c());
            }
            if (g3VarQ.d() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG12_TAG);
            } else {
                sQLiteStatement.bindText(LDSFile.EF_DG12_TAG, g3VarQ.d());
            }
            if (g3VarQ.a() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG13_TAG);
            } else {
                sQLiteStatement.bindText(LDSFile.EF_DG13_TAG, g3VarQ.a());
            }
            if (g3VarQ.b() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG14_TAG);
            } else {
                sQLiteStatement.bindText(LDSFile.EF_DG14_TAG, g3VarQ.b());
            }
        } else {
            prk.o.z(sQLiteStatement, 107, LDSFile.EF_DG12_TAG, LDSFile.EF_DG13_TAG, LDSFile.EF_DG14_TAG);
        }
        nif.a0 a0VarD = f3Var.D();
        if (a0VarD != null) {
            if (a0VarD.a() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG15_TAG);
            } else {
                sQLiteStatement.bindText(LDSFile.EF_DG15_TAG, a0VarD.a());
            }
            if (a0VarD.e() == null) {
                sQLiteStatement.bindNull(112);
            } else {
                sQLiteStatement.bindText(112, a0VarD.e());
            }
            if (a0VarD.c() == null) {
                sQLiteStatement.bindNull(113);
            } else {
                sQLiteStatement.bindText(113, a0VarD.c());
            }
            if (a0VarD.d() == null) {
                sQLiteStatement.bindNull(114);
            } else {
                sQLiteStatement.bindText(114, a0VarD.d());
            }
            b3 b3VarB = a0VarD.b();
            if (b3VarB != null) {
                if (b3VarB.b() == null) {
                    sQLiteStatement.bindNull(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                } else {
                    sQLiteStatement.bindDouble(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, b3VarB.b().doubleValue());
                }
                if (b3VarB.a() == null) {
                    sQLiteStatement.bindNull(116);
                } else {
                    sQLiteStatement.bindText(116, b3VarB.a());
                }
            } else {
                sQLiteStatement.bindNull(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                sQLiteStatement.bindNull(116);
            }
        } else {
            prk.o.z(sQLiteStatement, LDSFile.EF_DG15_TAG, 112, 113, 114);
            sQLiteStatement.bindNull(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            sQLiteStatement.bindNull(116);
        }
        nif.g gVarF = f3Var.f();
        if (gVarF != null) {
            if (gVarF.b() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG2_TAG);
            } else {
                sQLiteStatement.bindLong(LDSFile.EF_DG2_TAG, gVarF.b().longValue());
            }
            if (gVarF.c() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_DG4_TAG);
            } else {
                sQLiteStatement.bindText(LDSFile.EF_DG4_TAG, gVarF.c());
            }
            if (gVarF.d() == null) {
                sQLiteStatement.bindNull(LDSFile.EF_SOD_TAG);
            } else {
                sQLiteStatement.bindLong(LDSFile.EF_SOD_TAG, gVarF.d().longValue());
            }
            if (gVarF.e() == null) {
                sQLiteStatement.bindNull(SyslogConstants.LOG_CLOCK);
            } else {
                sQLiteStatement.bindText(SyslogConstants.LOG_CLOCK, gVarF.e());
            }
            if (gVarF.a() == null) {
                sQLiteStatement.bindNull(121);
            } else {
                sQLiteStatement.bindDouble(121, gVarF.a().doubleValue());
            }
        } else {
            prk.o.z(sQLiteStatement, LDSFile.EF_DG2_TAG, LDSFile.EF_DG4_TAG, LDSFile.EF_SOD_TAG, SyslogConstants.LOG_CLOCK);
            sQLiteStatement.bindNull(121);
        }
        b1 b1VarX = f3Var.X();
        if (b1VarX != null) {
            if (b1VarX.a() == null) {
                sQLiteStatement.bindNull(122);
            } else {
                sQLiteStatement.bindText(122, b1VarX.a());
            }
            if (b1VarX.c() == null) {
                sQLiteStatement.bindNull(123);
            } else {
                sQLiteStatement.bindText(123, b1VarX.c());
            }
            q1 q1VarB = b1VarX.b();
            if (q1VarB != null) {
                if (q1VarB.a() == null) {
                    sQLiteStatement.bindNull(124);
                } else {
                    sQLiteStatement.bindText(124, q1VarB.a());
                }
                if (q1VarB.c() == null) {
                    sQLiteStatement.bindNull(ISO781611.SMT_TAG);
                } else {
                    sQLiteStatement.bindText(ISO781611.SMT_TAG, q1VarB.c());
                }
                r1 r1VarB = q1VarB.b();
                if (r1VarB.a() == null) {
                    sQLiteStatement.bindNull(126);
                } else {
                    sQLiteStatement.bindText(126, r1VarB.a());
                }
                if (r1VarB.b() == null) {
                    sQLiteStatement.bindNull(CertificateBody.profileType);
                } else {
                    sQLiteStatement.bindText(CertificateBody.profileType, r1VarB.b());
                }
            } else {
                prk.o.z(sQLiteStatement, 124, ISO781611.SMT_TAG, 126, CertificateBody.profileType);
            }
        } else {
            prk.o.z(sQLiteStatement, 122, 123, 124, ISO781611.SMT_TAG);
            sQLiteStatement.bindNull(126);
            sQLiteStatement.bindNull(CertificateBody.profileType);
        }
        z0 z0VarU = f3Var.U();
        if (z0VarU != null) {
            if (z0VarU.b() == null) {
                sQLiteStatement.bindNull(128);
            } else {
                sQLiteStatement.bindText(128, z0VarU.b());
            }
            sQLiteStatement.bindDouble(129, z0VarU.c());
            sQLiteStatement.bindDouble(130, z0VarU.e());
            sQLiteStatement.bindLong(ISO781611.CREATION_DATE_AND_TIME_TAG, z0VarU.d());
            sQLiteStatement.bindDouble(132, z0VarU.a());
        } else {
            prk.o.z(sQLiteStatement, 128, 129, 130, ISO781611.CREATION_DATE_AND_TIME_TAG);
            sQLiteStatement.bindNull(132);
        }
        a2 a2VarM0 = f3Var.m0();
        if (a2VarM0 != null) {
            if (a2VarM0.a() == null) {
                sQLiteStatement.bindNull(133);
            } else {
                sQLiteStatement.bindText(133, a2VarM0.a());
            }
            if (a2VarM0.c() == null) {
                sQLiteStatement.bindNull(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
            } else {
                sQLiteStatement.bindText(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, a2VarM0.c());
            }
            if (a2VarM0.f() == null) {
                sQLiteStatement.bindNull(135);
            } else {
                sQLiteStatement.bindText(135, a2VarM0.f());
            }
            if (a2VarM0.b() == null) {
                sQLiteStatement.bindNull(136);
            } else {
                sQLiteStatement.bindText(136, a2VarM0.b());
            }
            if (a2VarM0.e() == null) {
                sQLiteStatement.bindNull(137);
            } else {
                sQLiteStatement.bindText(137, a2VarM0.e());
            }
            if (a2VarM0.d() == null) {
                sQLiteStatement.bindNull(138);
            } else {
                sQLiteStatement.bindText(138, a2VarM0.d());
            }
        } else {
            prk.o.z(sQLiteStatement, 133, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 135, 136);
            sQLiteStatement.bindNull(137);
            sQLiteStatement.bindNull(138);
        }
        e3 e3VarH = f3Var.H();
        if (e3VarH != null) {
            if (e3VarH.b() == null) {
                sQLiteStatement.bindNull(139);
            } else {
                sQLiteStatement.bindText(139, e3VarH.b());
            }
            d3 d3VarA = e3VarH.a();
            sQLiteStatement.bindLong(140, d3VarA.a());
            if (d3VarA.b() == null) {
                sQLiteStatement.bindNull(ModuleDescriptor.MODULE_VERSION);
            } else {
                sQLiteStatement.bindText(ModuleDescriptor.MODULE_VERSION, d3VarA.b());
            }
        } else {
            prk.o.y(sQLiteStatement, 139, 140, ModuleDescriptor.MODULE_VERSION);
        }
        x0 x0VarT = f3Var.T();
        if (x0VarT != null) {
            if (x0VarT.a() == null) {
                sQLiteStatement.bindNull(142);
            } else {
                sQLiteStatement.bindText(142, x0VarT.a());
            }
            h3 h3VarB = x0VarT.b();
            if (h3VarB != null) {
                if (h3VarB.c() == null) {
                    sQLiteStatement.bindNull(143);
                } else {
                    sQLiteStatement.bindText(143, h3VarB.c());
                }
                if (h3VarB.b() == null) {
                    sQLiteStatement.bindNull(SyslogConstants.LOG_LOCAL2);
                } else {
                    sQLiteStatement.bindText(SyslogConstants.LOG_LOCAL2, h3VarB.b());
                }
                if (h3VarB.a() == null) {
                    sQLiteStatement.bindNull(145);
                } else {
                    sQLiteStatement.bindText(145, h3VarB.a());
                }
            } else {
                prk.o.y(sQLiteStatement, 143, SyslogConstants.LOG_LOCAL2, 145);
            }
        } else {
            prk.o.z(sQLiteStatement, 142, 143, SyslogConstants.LOG_LOCAL2, 145);
        }
        a1 a1VarW = f3Var.W();
        if (a1VarW != null) {
            sQLiteStatement.bindLong(146, a1VarW.b() ? 1L : 0L);
            if (a1VarW.a() == null) {
                sQLiteStatement.bindNull(147);
            } else {
                sQLiteStatement.bindText(147, a1VarW.a());
            }
            if (a1VarW.c() == null) {
                sQLiteStatement.bindNull(148);
            } else {
                sQLiteStatement.bindText(148, a1VarW.c());
            }
        } else {
            prk.o.y(sQLiteStatement, 146, 147, 148);
        }
        nif.o oVarX = f3Var.x();
        if (oVarX != null) {
            if (oVarX.e() == null) {
                sQLiteStatement.bindNull(149);
            } else {
                sQLiteStatement.bindText(149, oVarX.e());
            }
            if (oVarX.b() == null) {
                sQLiteStatement.bindNull(150);
            } else {
                sQLiteStatement.bindText(150, oVarX.b());
            }
            if (oVarX.c() == null) {
                sQLiteStatement.bindNull(ISO7816.TAG_SM_EXPECTED_LENGTH);
            } else {
                sQLiteStatement.bindText(ISO7816.TAG_SM_EXPECTED_LENGTH, oVarX.c());
            }
            if (oVarX.a() == null) {
                sQLiteStatement.bindNull(SyslogConstants.LOG_LOCAL3);
            } else {
                sQLiteStatement.bindText(SyslogConstants.LOG_LOCAL3, oVarX.a());
            }
            if (oVarX.d() == null) {
                sQLiteStatement.bindNull(153);
            } else {
                sQLiteStatement.bindText(153, oVarX.d());
            }
        } else {
            prk.o.z(sQLiteStatement, 149, 150, ISO7816.TAG_SM_EXPECTED_LENGTH, SyslogConstants.LOG_LOCAL3);
            sQLiteStatement.bindNull(153);
        }
        n4 n4VarI0 = f3Var.I0();
        if (n4VarI0 != null) {
            if (n4VarI0.b() == null) {
                sQLiteStatement.bindNull(Constants.EMVTag.TAG_9A_TRANSACTION_DATE);
            } else {
                sQLiteStatement.bindText(Constants.EMVTag.TAG_9A_TRANSACTION_DATE, n4VarI0.b());
            }
            if (n4VarI0.a() == null) {
                sQLiteStatement.bindNull(155);
            } else {
                sQLiteStatement.bindText(155, n4VarI0.a());
            }
        } else {
            sQLiteStatement.bindNull(Constants.EMVTag.TAG_9A_TRANSACTION_DATE);
            sQLiteStatement.bindNull(155);
        }
        s3 s3VarO0 = f3Var.o0();
        if (s3VarO0 != null) {
            if (s3VarO0.b() == null) {
                sQLiteStatement.bindNull(Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
            } else {
                sQLiteStatement.bindText(Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, s3VarO0.b());
            }
            oif.c cVar5 = sVar.e;
            v3 v3VarC = s3VarO0.c();
            cVar5.getClass();
            String strB = oif.c.b(v3VarC);
            if (strB == null) {
                sQLiteStatement.bindNull(157);
            } else {
                sQLiteStatement.bindText(157, strB);
            }
            r3 r3VarA = s3VarO0.a();
            sQLiteStatement.bindLong(ISO781611.SMT_DO_DS, r3VarA.a());
            if (r3VarA.b() == null) {
                sQLiteStatement.bindNull(159);
            } else {
                sQLiteStatement.bindText(159, r3VarA.b());
            }
            w3 w3VarD = s3VarO0.d();
            if (w3VarD != null) {
                r3 r3VarA2 = w3VarD.a();
                sQLiteStatement.bindLong(160, r3VarA2.a());
                if (r3VarA2.b() == null) {
                    sQLiteStatement.bindNull(161);
                } else {
                    sQLiteStatement.bindText(161, r3VarA2.b());
                }
                r3 r3VarB = w3VarD.b();
                sQLiteStatement.bindLong(162, r3VarB.a());
                if (r3VarB.b() == null) {
                    sQLiteStatement.bindNull(Constants.TAG_ACE_LAYER_VERSION);
                } else {
                    sQLiteStatement.bindText(Constants.TAG_ACE_LAYER_VERSION, r3VarB.b());
                }
            } else {
                prk.o.z(sQLiteStatement, 160, 161, 162, Constants.TAG_ACE_LAYER_VERSION);
            }
        } else {
            prk.o.z(sQLiteStatement, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 157, ISO781611.SMT_DO_DS, 159);
            prk.o.z(sQLiteStatement, 160, 161, 162, Constants.TAG_ACE_LAYER_VERSION);
        }
        s1 s1VarF0 = f3Var.f0();
        if (s1VarF0 != null) {
            if (s1VarF0.b() == null) {
                sQLiteStatement.bindNull(Constants.TAG_GPI_VERSION);
            } else {
                sQLiteStatement.bindText(Constants.TAG_GPI_VERSION, s1VarF0.b());
            }
            if (s1VarF0.c() == null) {
                sQLiteStatement.bindNull(Constants.TAG_EMVL3_VERSION);
            } else {
                sQLiteStatement.bindText(Constants.TAG_EMVL3_VERSION, s1VarF0.c());
            }
            if (s1VarF0.a() == null) {
                sQLiteStatement.bindNull(Constants.TAG_PAYMENT_APP_CLESS_VERSION);
            } else {
                sQLiteStatement.bindText(Constants.TAG_PAYMENT_APP_CLESS_VERSION, s1VarF0.a());
            }
        } else {
            prk.o.y(sQLiteStatement, Constants.TAG_GPI_VERSION, Constants.TAG_EMVL3_VERSION, Constants.TAG_PAYMENT_APP_CLESS_VERSION);
        }
        nif.a aVarP = f3Var.P();
        if (aVarP != null) {
            if (aVarP.c() == null) {
                sQLiteStatement.bindNull(167);
            } else {
                sQLiteStatement.bindText(167, aVarP.c());
            }
            if (aVarP.a() == null) {
                sQLiteStatement.bindNull(168);
            } else {
                sQLiteStatement.bindText(168, aVarP.a());
            }
            nif.b bVarB2 = aVarP.b();
            if (bVarB2 != null) {
                if (bVarB2.a() == null) {
                    sQLiteStatement.bindNull(169);
                } else {
                    sQLiteStatement.bindText(169, bVarB2.a());
                }
                if (bVarB2.b() == null) {
                    sQLiteStatement.bindNull(170);
                } else {
                    sQLiteStatement.bindText(170, bVarB2.b());
                }
            } else {
                sQLiteStatement.bindNull(169);
                sQLiteStatement.bindNull(170);
            }
        } else {
            prk.o.z(sQLiteStatement, 167, 168, 169, 170);
        }
        nif.a aVarZ0 = f3Var.z0();
        if (aVarZ0 != null) {
            if (aVarZ0.c() == null) {
                sQLiteStatement.bindNull(171);
            } else {
                sQLiteStatement.bindText(171, aVarZ0.c());
            }
            if (aVarZ0.a() == null) {
                sQLiteStatement.bindNull(172);
            } else {
                sQLiteStatement.bindText(172, aVarZ0.a());
            }
            nif.b bVarB3 = aVarZ0.b();
            if (bVarB3 != null) {
                if (bVarB3.a() == null) {
                    sQLiteStatement.bindNull(173);
                } else {
                    sQLiteStatement.bindText(173, bVarB3.a());
                }
                if (bVarB3.b() == null) {
                    sQLiteStatement.bindNull(174);
                } else {
                    sQLiteStatement.bindText(174, bVarB3.b());
                }
            } else {
                sQLiteStatement.bindNull(173);
                sQLiteStatement.bindNull(174);
            }
        } else {
            prk.o.z(sQLiteStatement, 171, 172, 173, 174);
        }
        nif.h hVarJ = f3Var.j();
        if (hVarJ != null) {
            if (hVarJ.d() == null) {
                sQLiteStatement.bindNull(175);
            } else {
                sQLiteStatement.bindText(175, hVarJ.d());
            }
            if (hVarJ.e() == null) {
                sQLiteStatement.bindNull(SyslogConstants.LOG_LOCAL6);
            } else {
                sQLiteStatement.bindText(SyslogConstants.LOG_LOCAL6, hVarJ.e());
            }
            if (hVarJ.c() == null) {
                sQLiteStatement.bindNull(177);
            } else {
                sQLiteStatement.bindText(177, hVarJ.c());
            }
            if (hVarJ.f() == null) {
                sQLiteStatement.bindNull(178);
            } else {
                sQLiteStatement.bindText(178, hVarJ.f());
            }
            if (hVarJ.a() == null) {
                sQLiteStatement.bindNull(179);
            } else {
                sQLiteStatement.bindText(179, hVarJ.a());
            }
            if (hVarJ.b() == null) {
                sQLiteStatement.bindNull(180);
            } else {
                sQLiteStatement.bindText(180, hVarJ.b());
            }
        } else {
            prk.o.z(sQLiteStatement, 175, SyslogConstants.LOG_LOCAL6, 177, 178);
            sQLiteStatement.bindNull(179);
            sQLiteStatement.bindNull(180);
        }
        nif.i iVarK = f3Var.k();
        if (iVarK == null || iVarK.a() == null) {
            sQLiteStatement.bindNull(181);
        } else {
            sQLiteStatement.bindText(181, iVarK.a());
        }
        z2 z2VarW = f3Var.w();
        if (z2VarW != null) {
            y2 y2VarB = z2VarW.b();
            if (y2VarB != null) {
                oif.c cVar6 = sVar.e;
                x2 x2VarA = y2VarB.a();
                cVar6.getClass();
                String strF = oif.c.f(x2VarA);
                if (strF == null) {
                    sQLiteStatement.bindNull(182);
                } else {
                    sQLiteStatement.bindText(182, strF);
                }
                jo3.b bVarB4 = y2VarB.b();
                if (a10.b.v(bVarB4, sQLiteStatement, 183) == null) {
                    sQLiteStatement.bindNull(SyslogConstants.LOG_LOCAL7);
                } else {
                    sQLiteStatement.bindText(SyslogConstants.LOG_LOCAL7, bVarB4.getCurrency());
                }
            } else {
                prk.o.y(sQLiteStatement, 182, 183, SyslogConstants.LOG_LOCAL7);
            }
            v0 v0VarA = z2VarW.a();
            if (v0VarA != null) {
                oif.c cVar7 = sVar.e;
                u0 u0VarA = v0VarA.a();
                cVar7.getClass();
                String strA = oif.c.a(u0VarA);
                if (strA == null) {
                    sQLiteStatement.bindNull(185);
                } else {
                    sQLiteStatement.bindText(185, strA);
                }
                jo3.b bVarB5 = v0VarA.b();
                if (a10.b.v(bVarB5, sQLiteStatement, 186) == null) {
                    sQLiteStatement.bindNull(187);
                } else {
                    sQLiteStatement.bindText(187, bVarB5.getCurrency());
                }
            } else {
                prk.o.y(sQLiteStatement, 185, 186, 187);
            }
        } else {
            prk.o.z(sQLiteStatement, 182, 183, SyslogConstants.LOG_LOCAL7, 185);
            sQLiteStatement.bindNull(186);
            sQLiteStatement.bindNull(187);
        }
        i0 i0VarK = f3Var.K();
        if (i0VarK == null) {
            sQLiteStatement.bindNull(188);
            sQLiteStatement.bindNull(189);
            return;
        }
        if (i0VarK.a() == null) {
            sQLiteStatement.bindNull(188);
        } else {
            sQLiteStatement.bindLong(188, i0VarK.a().longValue());
        }
        if (i0VarK.b() == null) {
            sQLiteStatement.bindNull(189);
        } else {
            sQLiteStatement.bindText(189, i0VarK.b());
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        List listA;
        switch (this.f205825a) {
            case 0:
                a(sQLiteStatement, (f3) obj2);
                break;
            case 1:
                nif.d0 d0Var = (nif.d0) obj2;
                if (d0Var.l() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, d0Var.l());
                }
                if (d0Var.a() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, d0Var.a());
                }
                if (d0Var.b() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, d0Var.b());
                }
                if (d0Var.g() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, d0Var.g());
                }
                b21.a aVar = this.f205826b.f;
                BigDecimal bigDecimalN = d0Var.n();
                aVar.getClass();
                String strA = b21.a.a(bigDecimalN);
                if (strA == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strA);
                }
                if (d0Var.e() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, d0Var.e());
                }
                nif.b0 b0VarC = d0Var.c();
                BigDecimal bigDecimalA = b0VarC.a();
                aVar.getClass();
                String strA2 = b21.a.a(bigDecimalA);
                if (strA2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strA2);
                }
                if (b0VarC.b() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, b0VarC.b());
                }
                nif.b0 b0VarI = d0Var.i();
                if (b0VarI != null) {
                    String strA3 = b21.a.a(b0VarI.a());
                    if (strA3 == null) {
                        sQLiteStatement.bindNull(9);
                    } else {
                        sQLiteStatement.bindText(9, strA3);
                    }
                    if (b0VarI.b() == null) {
                        sQLiteStatement.bindNull(10);
                    } else {
                        sQLiteStatement.bindText(10, b0VarI.b());
                    }
                } else {
                    sQLiteStatement.bindNull(9);
                    sQLiteStatement.bindNull(10);
                }
                nif.b0 b0VarK = d0Var.k();
                if (b0VarK != null) {
                    String strA4 = b21.a.a(b0VarK.a());
                    if (strA4 == null) {
                        sQLiteStatement.bindNull(11);
                    } else {
                        sQLiteStatement.bindText(11, strA4);
                    }
                    if (b0VarK.b() == null) {
                        sQLiteStatement.bindNull(12);
                    } else {
                        sQLiteStatement.bindText(12, b0VarK.b());
                    }
                } else {
                    sQLiteStatement.bindNull(11);
                    sQLiteStatement.bindNull(12);
                }
                nif.b0 b0VarJ = d0Var.j();
                if (b0VarJ != null) {
                    String strA5 = b21.a.a(b0VarJ.a());
                    if (strA5 == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, strA5);
                    }
                    if (b0VarJ.b() == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, b0VarJ.b());
                    }
                } else {
                    sQLiteStatement.bindNull(13);
                    sQLiteStatement.bindNull(14);
                }
                nif.b0 b0VarH = d0Var.h();
                if (b0VarH != null) {
                    String strA6 = b21.a.a(b0VarH.a());
                    if (strA6 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, strA6);
                    }
                    if (b0VarH.b() == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, b0VarH.b());
                    }
                } else {
                    sQLiteStatement.bindNull(15);
                    sQLiteStatement.bindNull(16);
                }
                nif.b0 b0VarF = d0Var.f();
                if (b0VarF != null) {
                    String strA7 = b21.a.a(b0VarF.a());
                    if (strA7 == null) {
                        sQLiteStatement.bindNull(17);
                    } else {
                        sQLiteStatement.bindText(17, strA7);
                    }
                    if (b0VarF.b() == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, b0VarF.b());
                    }
                } else {
                    sQLiteStatement.bindNull(17);
                    sQLiteStatement.bindNull(18);
                }
                nif.c0 c0VarD = d0Var.d();
                if (c0VarD != null) {
                    if (c0VarD.a() == null) {
                        sQLiteStatement.bindNull(19);
                    } else {
                        sQLiteStatement.bindText(19, c0VarD.a());
                    }
                    if (c0VarD.b() == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, c0VarD.b());
                    }
                } else {
                    sQLiteStatement.bindNull(19);
                    sQLiteStatement.bindNull(20);
                }
                nif.e0 e0VarM = d0Var.m();
                if (e0VarM != null) {
                    if (e0VarM.a() == null) {
                        sQLiteStatement.bindNull(21);
                    } else {
                        sQLiteStatement.bindText(21, e0VarM.a());
                    }
                    if (e0VarM.b() == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, e0VarM.b());
                    }
                } else {
                    sQLiteStatement.bindNull(21);
                    sQLiteStatement.bindNull(22);
                }
                f0 f0VarO = d0Var.o();
                if (f0VarO != null) {
                    if (f0VarO.b() == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, f0VarO.b());
                    }
                    if (f0VarO.a() == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, f0VarO.a());
                    }
                } else {
                    sQLiteStatement.bindNull(23);
                    sQLiteStatement.bindNull(24);
                }
                f0 f0VarP = d0Var.p();
                if (f0VarP == null) {
                    sQLiteStatement.bindNull(25);
                    sQLiteStatement.bindNull(26);
                } else {
                    if (f0VarP.b() == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, f0VarP.b());
                    }
                    if (f0VarP.a() != null) {
                        sQLiteStatement.bindText(26, f0VarP.a());
                    } else {
                        sQLiteStatement.bindNull(26);
                    }
                }
                break;
            default:
                l0 l0Var = (l0) obj2;
                oif.a aVar2 = this.f205826b.o;
                if (l0Var.k() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, l0Var.k());
                }
                if (l0Var.r() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, l0Var.r());
                }
                String strC = null;
                if ((l0Var.e() == null ? null : Integer.valueOf(l0Var.e().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, r1.intValue());
                }
                h1 h1VarM = l0Var.m();
                aVar2.getClass();
                String strK0 = (h1VarM == null || (listA = h1VarM.a()) == null) ? null : zhm.d0.k0(listA, ",", null, null, 0, null, 62);
                if (strK0 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK0);
                }
                if (l0Var.j() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, l0Var.j());
                }
                if (l0Var.y() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, l0Var.y());
                }
                if (l0Var.f() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, l0Var.f());
                }
                if ((l0Var.s() == null ? null : Integer.valueOf(l0Var.s().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, r1.intValue());
                }
                if (l0Var.t() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, l0Var.t());
                }
                if (l0Var.g() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, l0Var.g());
                }
                if (l0Var.x() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, l0Var.x());
                }
                if (l0Var.v() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, l0Var.v());
                }
                if (l0Var.c() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, l0Var.c());
                }
                if (l0Var.h() == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, l0Var.h());
                }
                if ((l0Var.a() == null ? null : Integer.valueOf(l0Var.a().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindLong(15, r1.intValue());
                }
                if ((l0Var.d() == null ? null : Integer.valueOf(l0Var.d().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindLong(16, r1.intValue());
                }
                if ((l0Var.u() == null ? null : Integer.valueOf(l0Var.u().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindLong(17, r1.intValue());
                }
                if (l0Var.n() == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, l0Var.n());
                }
                if (l0Var.w() == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, l0Var.w());
                }
                if (l0Var.i() == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, l0Var.i());
                }
                o0 o0VarB = l0Var.b();
                aVar2.getClass();
                if (o0VarB != null) {
                    Json jsonA = af0.b.a();
                    jsonA.getClass();
                    strC = jsonA.c(o0.Companion.serializer(), o0VarB);
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, strC);
                }
                t1 t1VarQ = l0Var.q();
                if (t1VarQ != null) {
                    if (t1VarQ.a() == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, t1VarQ.a());
                    }
                    if (t1VarQ.b() == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, t1VarQ.b());
                    }
                } else {
                    sQLiteStatement.bindNull(22);
                    sQLiteStatement.bindNull(23);
                }
                c1 c1VarL = l0Var.l();
                if (c1VarL == null || c1VarL.a() == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindText(24, c1VarL.a());
                }
                n1 n1VarO = l0Var.o();
                if (n1VarO != null) {
                    if (n1VarO.a() == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, n1VarO.a());
                    }
                    o1 o1VarB = n1VarO.b();
                    if (o1VarB != null) {
                        if (o1VarB.b() == null) {
                            sQLiteStatement.bindNull(26);
                        } else {
                            sQLiteStatement.bindText(26, o1VarB.b());
                        }
                        if (o1VarB.c() == null) {
                            sQLiteStatement.bindNull(27);
                        } else {
                            sQLiteStatement.bindText(27, o1VarB.c());
                        }
                        if (o1VarB.a() == null) {
                            sQLiteStatement.bindNull(28);
                        } else {
                            sQLiteStatement.bindText(28, o1VarB.a());
                        }
                    } else {
                        prk.o.y(sQLiteStatement, 26, 27, 28);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 25, 26, 27, 28);
                }
                p1 p1VarP = l0Var.p();
                if (p1VarP == null) {
                    sQLiteStatement.bindNull(29);
                    sQLiteStatement.bindNull(30);
                } else {
                    if (p1VarP.a() == null) {
                        sQLiteStatement.bindNull(29);
                    } else {
                        sQLiteStatement.bindText(29, p1VarP.a());
                    }
                    if (p1VarP.b() != null) {
                        sQLiteStatement.bindLong(30, p1VarP.b().longValue());
                    } else {
                        sQLiteStatement.bindNull(30);
                    }
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f205825a) {
            case 0:
                return "INSERT OR REPLACE INTO `transactions` (`leg_id`,`group_id`,`type`,`state`,`created_date`,`started_date`,`updated_date`,`amount`,`currency`,`pocket_fee`,`pocket_id`,`pocket_type`,`category`,`completed_date`,`balance_on_completed`,`description`,`status_reason_code`,`logo`,`related_transaction_id`,`amount_with_charges`,`registered_identity_id`,`exchange_rate`,`fraud_state`,`fraud_reason`,`ecommerce`,`cardholderPresent`,`cashback_pocket_id`,`exchange_direction`,`top_up_entry_mode`,`transfer_link_id`,`investment_holding_id`,`is_investment_auto_top_up`,`localisedDescription`,`transparentPricing`,`chargeback_eligible`,`chargeback_state`,`accrued_loyalty_points`,`accrued_loyalty_points_amount`,`edt`,`group_key`,`country_code`,`amount_with_fee`,`analytics_group_id`,`related_transactions_cache`,`calculated_balance`,`recipient_key`,`sender_key`,`merchant_key`,`merchant_payment_id`,`cardOwnerId`,`topupMethod`,`warrant_reason`,`payment_counterparty_id`,`digitized_card_id`,`original_amount`,`original_currency`,`payment_method`,`counterparty_details_group`,`splittable`,`reward_reason`,`payment_initiation_type`,`counter_party_amount`,`counter_party_currency`,`counter_party_pocket_id`,`counter_party_pocket_type`,`card_id`,`card_last_four`,`card_label`,`card_disposable`,`card_pro`,`card_credit`,`auto_invest_target_pocket_id`,`auto_invest_strategy`,`auto_invest_target_type`,`standing_order_id`,`standing_order_period`,`standing_order_type`,`standing_order_start_date`,`standing_order_next_date`,`standing_order_recurring`,`standing_order_estimated`,`standing_order_low_balance_threshold_amount`,`standing_order_low_balance_threshold_currency`,`standing_order_excess_balance_threshold_amount`,`standing_order_excess_balance_threshold_currency`,`beneficiary_id`,`beneficiary_rootId`,`beneficiary_country`,`beneficiary_name`,`beneficiary_email`,`beneficiary_phone`,`beneficiary_fee_expected`,`beneficiary_fee_actualAmount_amount`,`beneficiary_fee_actualAmount_currency`,`alias_beneficiary_id`,`alias_beneficiary_country`,`alias_beneficiary_type`,`alias_beneficiary_account`,`vault_id`,`vault_expected_arrival`,`vault_nav_price`,`vault_earned_interest`,`vault_deducted`,`vault_taxes`,`vault_withdrawal_principal`,`vault_withdrawal_interest`,`gift_id`,`gift_state`,`gift_direction`,`gift_iconImageUrl`,`crypto_withdraw_address_id`,`crypto_withdraw_transaction_hash`,`crypto_withdraw_failureCode`,`crypto_withdraw_state`,`crypto_withdraw_display_rate`,`crypto_withdraw_display_currency`,`amount_breakdown_original_amount`,`amount_breakdown_original_currency`,`amount_breakdown_surcharge_amount`,`amount_breakdown_surcharge_currency`,`amount_breakdown_exchange_rate`,`junior_junior_user_id`,`junior_transfer_intent`,`junior_p2p_transfer_request_id`,`junior_p2p_transfer_request_state`,`junior_p2p_transfer_request_sender_first_name`,`junior_p2p_transfer_request_sender_last_name`,`instalment_plan_facilityId`,`instalment_plan_feeRate`,`instalment_plan_lateInterestRate`,`instalment_plan_lateInterest`,`instalment_plan_apr`,`push_to_card_first_name`,`push_to_card_last_name`,`push_to_card_state`,`push_to_card_last_four`,`push_to_card_scheme`,`push_to_card_logo_url`,`doxgety_reward_rate`,`doxgety_reward_promised_amount_amount`,`doxgety_reward_promised_amount_currency`,`joint_id`,`joint_initiator_legal_name`,`joint_initiator_image`,`joint_initiator_code`,`joint_extra_internal`,`joint_extra_account_id`,`joint_extra_peer`,`collection_trading_order_id`,`collection_trading_collection_key`,`collection_trading_collection_name`,`collection_trading_avatar`,`collection_trading_icon`,`wealth_portfolio_id`,`wealth_account_type`,`referral_reward_rate`,`referral_reward_tax_breakdown`,`referral_reward_promised_amount_amount`,`referral_reward_promised_amount_currency`,`referral_reward_taxDetails_grossAmount_amount`,`referral_reward_taxDetails_grossAmount_currency`,`referral_reward_taxDetails_tax_amount`,`referral_reward_taxDetails_tax_currency`,`paid_plan_transaction_plan_id`,`paid_plan_transaction_plan_tier`,`paid_plan_transaction_billing_cycle_id`,`fromAccount_accountInfo_type`,`fromAccount_accountInfo_pocketId`,`fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id`,`fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type`,`toAccount_accountInfo_type`,`toAccount_accountInfo_pocketId`,`toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id`,`toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type`,`apm_contact_id`,`apm_contact_phone`,`apm_contact_email`,`apm_contact_type`,`apm_contact_alias`,`apm_contact_contactName`,`apm_info_provider`,`charges_taxes_taxes_breakdown`,`charges_taxes_total_amount`,`charges_taxes_total_currency`,`charges_fees_fees_breakdown`,`charges_fees_total_amount`,`charges_fees_total_currency`,`equivalent_amount`,`equivalent_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `defi_metadata` (`defi_metadata_leg_id`,`defi_metadata_account_id`,`defi_metadata_account_scoped_asset_id`,`defi_metadata_counterpart_account_scoped_asset_id`,`defi_metadata_rate`,`defi_metadata_chain`,`defi_metadata_amount_value`,`defi_metadata_amount_currency`,`defi_metadata_fee_value`,`defi_metadata_fee_currency`,`defi_metadata_fiat_amount_value`,`defi_metadata_fiat_amount_currency`,`defi_metadata_fee_fiat_amount_value`,`defi_metadata_fee_fiat_amount_currency`,`defi_metadata_counterpart_fiat_amount_value`,`defi_metadata_counterpart_fiat_amount_currency`,`defi_metadata_counterpart_value`,`defi_metadata_counterpart_currency`,`defi_metadata_bundle_id`,`defi_metadata_bundle_link`,`defi_metadata_on_chain_tx_hash`,`defi_metadata_on_chain_tx_link`,`defi_metadata_recipient_wallet_address`,`defi_metadata_recipient_link`,`defi_metadata_sender_wallet_address`,`defi_metadata_sender_link`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `extra_attributes` (`extra_attr_leg_id`,`extra_attr_pocket_origin_type`,`extra_attr_card_verification`,`extra_attr_lounge_pass_ids`,`extra_attr_hotel_booking_id`,`extra_attr_user_offer_id`,`extra_attr_cashback_type`,`extra_attr_savings_vaults_bonus`,`extra_attr_shops_brand_id`,`extra_attr_charity_id`,`extra_attr_user_comment`,`extra_attr_tax_recipient_id`,`extra_attr_bill_account_id`,`extra_external_regulator_type`,`extra_attr_acquiring_tax_payment`,`extra_attr_can_be_marked_as_subscription`,`extra_attr_staking_info_reward`,`extra_attr_merchant_block_eligibility`,`extra_attr_transfer_reasons_catalogue`,`extra_attr_guardian_id`,`extra_attr_attrs`,`extra_attr_payment_authorisation_id`,`extra_attr_payment_authorisation_type`,`extra_attr_linked_exchange_details_counterparty_pocket_id`,`extra_attr_money_request_id`,`extra_attr_money_request_requester_id`,`extra_attr_money_request_requester_name`,`extra_attr_money_request_requester_code`,`extra_attr_mcy_top_up_funding_status`,`extra_attr_mcy_top_up_funds_transfer_expire_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
