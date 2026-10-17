package tcl;

import fdl.a0;
import fdl.c0;
import fdl.m0;
import fdl.n0;
import hcl.b0;
import hcl.d0;
import hcl.f0;
import hcl.g0;
import hcl.q;
import hcl.r;
import java.util.ArrayList;
import java.util.List;
import jel.a1;
import jel.b1;
import jel.c1;
import jel.e0;
import jel.l0;
import jel.t;
import jel.t0;
import jel.u;
import jel.u0;
import jel.v;
import jel.v0;
import jel.x0;
import jel.y0;
import jel.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final t a(a0 a0Var) {
        v vVar;
        ArrayList arrayList;
        e0 e0Var;
        l0 l0Var;
        ArrayList arrayList2;
        b1 b1Var;
        u0 u0Var;
        ArrayList arrayList3;
        z0 z0Var;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        int i = 0;
        if (a0Var instanceof m0) {
            m0 m0Var = (m0) a0Var;
            String sector = m0Var.getSector();
            if (sector != null) {
                u0[] u0VarArrValues = u0.values();
                int length = u0VarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    u0Var = u0VarArrValues[i2];
                    if (kotlin.text.a0.z(u0Var.name(), sector, true)) {
                        break;
                    }
                }
                u0Var = null;
            } else {
                u0Var = null;
            }
            List subSectors = m0Var.getSubSectors();
            if (subSectors != null) {
                List<m0.a> list = subSectors;
                arrayList3 = new ArrayList(w.t(list, 10));
                for (m0.a aVar : list) {
                    String subSector = aVar.getSubSector();
                    if (subSector != null) {
                        z0[] z0VarArrValues = z0.values();
                        int length2 = z0VarArrValues.length;
                        for (int i3 = 0; i3 < length2; i3++) {
                            z0Var = z0VarArrValues[i3];
                            if (kotlin.text.a0.z(z0Var.name(), subSector, true)) {
                                break;
                            }
                        }
                        z0Var = null;
                    } else {
                        z0Var = null;
                    }
                    String allocation = aVar.getAllocation();
                    arrayList3.add(new a1(z0Var, allocation != null ? y.i(allocation) : null));
                }
            } else {
                arrayList3 = null;
            }
            String allocation2 = m0Var.getAllocation();
            return new v0(u0Var, arrayList3, allocation2 != null ? y.i(allocation2) : null);
        }
        if (a0Var instanceof n0) {
            n0 n0Var = (n0) a0Var;
            String macroStrategy = n0Var.getMacroStrategy();
            if (macroStrategy != null) {
                l0[] l0VarArrValues = l0.values();
                int length3 = l0VarArrValues.length;
                for (int i5 = 0; i5 < length3; i5++) {
                    l0Var = l0VarArrValues[i5];
                    if (kotlin.text.a0.z(l0Var.name(), macroStrategy, true)) {
                        break;
                    }
                }
                l0Var = null;
            } else {
                l0Var = null;
            }
            List subStrategies = n0Var.getSubStrategies();
            if (subStrategies != null) {
                List<n0.a> list2 = subStrategies;
                arrayList2 = new ArrayList(w.t(list2, 10));
                for (n0.a aVar2 : list2) {
                    String subStrategy = aVar2.getSubStrategy();
                    if (subStrategy != null) {
                        b1[] b1VarArrValues = b1.values();
                        int length4 = b1VarArrValues.length;
                        for (int i6 = 0; i6 < length4; i6++) {
                            b1Var = b1VarArrValues[i6];
                            if (kotlin.text.a0.z(b1Var.name(), subStrategy, true)) {
                                break;
                            }
                        }
                        b1Var = null;
                    } else {
                        b1Var = null;
                    }
                    String allocation3 = aVar2.getAllocation();
                    arrayList2.add(new c1(b1Var, allocation3 != null ? y.i(allocation3) : null));
                }
            } else {
                arrayList2 = null;
            }
            String allocation4 = n0Var.getAllocation();
            return new x0(l0Var, arrayList2, allocation4 != null ? y.i(allocation4) : null);
        }
        if (a0Var instanceof fdl.l0) {
            fdl.l0 l0Var2 = (fdl.l0) a0Var;
            String region = l0Var2.getRegion();
            if (region != null) {
                e0[] e0VarArrValues = e0.values();
                int length5 = e0VarArrValues.length;
                while (i < length5) {
                    e0Var = e0VarArrValues[i];
                    if (kotlin.text.a0.z(e0Var.name(), region, true)) {
                        break;
                    }
                    i++;
                }
                e0Var = null;
            } else {
                e0Var = null;
            }
            String allocation5 = l0Var2.getAllocation();
            return new t0(e0Var, allocation5 != null ? y.i(allocation5) : null);
        }
        if (!(a0Var instanceof c0)) {
            throw new NoWhenBranchMatchedException();
        }
        c0 c0Var = (c0) a0Var;
        String type = c0Var.getType();
        if (type != null) {
            v[] vVarArrValues = v.values();
            int length6 = vVarArrValues.length;
            while (i < length6) {
                vVar = vVarArrValues[i];
                if (kotlin.text.a0.z(vVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            vVar = null;
        } else {
            vVar = null;
        }
        List subAssets = c0Var.getSubAssets();
        if (subAssets != null) {
            List<c0.a> list3 = subAssets;
            arrayList = new ArrayList(w.t(list3, 10));
            for (c0.a aVar3 : list3) {
                String allocation6 = aVar3.getAllocation();
                arrayList.add(new y0(aVar3.getCurrency(), allocation6 != null ? y.i(allocation6) : null));
            }
        } else {
            arrayList = null;
        }
        String allocation7 = c0Var.getAllocation();
        return new u(vVar, arrayList, allocation7 != null ? y.i(allocation7) : null);
    }

    public static final t b(q qVar) {
        v vVar;
        l0 l0Var;
        b1 b1Var;
        u0 u0Var;
        z0 z0Var;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        e0Var = null;
        e0 e0Var = null;
        if (qVar instanceof b0) {
            b0 b0Var = (b0) qVar;
            String sector = b0Var.getSector();
            if (sector != null) {
                u0[] u0VarArrValues = u0.values();
                int length = u0VarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    u0Var = u0VarArrValues[i2];
                    if (kotlin.text.a0.z(u0Var.name(), sector, true)) {
                        break;
                    }
                }
                u0Var = null;
            } else {
                u0Var = null;
            }
            List subSectors = b0Var.getSubSectors();
            if (subSectors != null) {
                List<f0> list = subSectors;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                for (f0 f0Var : list) {
                    String subSector = f0Var.getSubSector();
                    if (subSector != null) {
                        z0[] z0VarArrValues = z0.values();
                        int length2 = z0VarArrValues.length;
                        for (int i3 = 0; i3 < length2; i3++) {
                            z0Var = z0VarArrValues[i3];
                            if (kotlin.text.a0.z(z0Var.name(), subSector, true)) {
                                break;
                            }
                        }
                        z0Var = null;
                    } else {
                        z0Var = null;
                    }
                    arrayList4.add(new a1(z0Var, f0Var.getAllocation()));
                }
                arrayList2 = arrayList4;
            }
            return new v0(u0Var, arrayList2, b0Var.getAllocation());
        }
        if (qVar instanceof d0) {
            d0 d0Var = (d0) qVar;
            String macroStrategy = d0Var.getMacroStrategy();
            if (macroStrategy != null) {
                l0[] l0VarArrValues = l0.values();
                int length3 = l0VarArrValues.length;
                for (int i5 = 0; i5 < length3; i5++) {
                    l0Var = l0VarArrValues[i5];
                    if (kotlin.text.a0.z(l0Var.name(), macroStrategy, true)) {
                        break;
                    }
                }
                l0Var = null;
            } else {
                l0Var = null;
            }
            List subStrategies = d0Var.getSubStrategies();
            if (subStrategies != null) {
                List<g0> list2 = subStrategies;
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                for (g0 g0Var : list2) {
                    String subStrategy = g0Var.getSubStrategy();
                    if (subStrategy != null) {
                        b1[] b1VarArrValues = b1.values();
                        int length4 = b1VarArrValues.length;
                        for (int i6 = 0; i6 < length4; i6++) {
                            b1Var = b1VarArrValues[i6];
                            if (kotlin.text.a0.z(b1Var.name(), subStrategy, true)) {
                                break;
                            }
                        }
                        b1Var = null;
                    } else {
                        b1Var = null;
                    }
                    arrayList5.add(new c1(b1Var, g0Var.getAllocation()));
                }
                arrayList3 = arrayList5;
            }
            return new x0(l0Var, arrayList3, d0Var.getAllocation());
        }
        if (qVar instanceof hcl.a0) {
            hcl.a0 a0Var = (hcl.a0) qVar;
            String region = a0Var.getRegion();
            if (region != null) {
                e0[] e0VarArrValues = e0.values();
                int length5 = e0VarArrValues.length;
                while (true) {
                    if (i >= length5) {
                        break;
                    }
                    e0 e0Var2 = e0VarArrValues[i];
                    if (kotlin.text.a0.z(e0Var2.name(), region, true)) {
                        e0Var = e0Var2;
                        break;
                    }
                    i++;
                }
            }
            return new t0(e0Var, a0Var.getAllocation());
        }
        if (!(qVar instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        r rVar = (r) qVar;
        String type = rVar.getType();
        if (type != null) {
            v[] vVarArrValues = v.values();
            int length6 = vVarArrValues.length;
            while (i < length6) {
                vVar = vVarArrValues[i];
                if (kotlin.text.a0.z(vVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            vVar = null;
        } else {
            vVar = null;
        }
        List subAssets = rVar.getSubAssets();
        if (subAssets != null) {
            List<hcl.e0> list3 = subAssets;
            arrayList = new ArrayList(w.t(list3, 10));
            for (hcl.e0 e0Var3 : list3) {
                arrayList.add(new y0(e0Var3.getCurrency(), e0Var3.getAllocation()));
            }
        }
        return new u(vVar, arrayList, rVar.getAllocation());
    }

    public static final q c(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        if (tVar instanceof v0) {
            v0 v0Var = (v0) tVar;
            u0 u0Var = v0Var.f173574a;
            String strName = u0Var != null ? u0Var.name() : null;
            List list = v0Var.f173575b;
            if (list != null) {
                List<a1> list2 = list;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (a1 a1Var : list2) {
                    z0 z0Var = a1Var.f173403a;
                    arrayList4.add(new f0(z0Var != null ? z0Var.name() : null, a1Var.f173404b));
                }
                arrayList2 = arrayList4;
            }
            return new b0(strName, v0Var.f173576c, arrayList2);
        }
        if (tVar instanceof x0) {
            x0 x0Var = (x0) tVar;
            l0 l0Var = x0Var.f173599a;
            String strName2 = l0Var != null ? l0Var.name() : null;
            List list3 = x0Var.f173600b;
            if (list3 != null) {
                List<c1> list4 = list3;
                ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                for (c1 c1Var : list4) {
                    b1 b1Var = c1Var.f173425a;
                    arrayList5.add(new g0(b1Var != null ? b1Var.name() : null, c1Var.f173426b));
                }
                arrayList3 = arrayList5;
            }
            return new d0(strName2, x0Var.f173601c, arrayList3);
        }
        if (tVar instanceof t0) {
            t0 t0Var = (t0) tVar;
            e0 e0Var = t0Var.f173564a;
            return new hcl.a0(e0Var != null ? e0Var.name() : null, t0Var.f173565b);
        }
        if (!(tVar instanceof u)) {
            throw new NoWhenBranchMatchedException();
        }
        u uVar = (u) tVar;
        v vVar = uVar.f173569a;
        String strName3 = vVar != null ? vVar.name() : null;
        List list5 = uVar.f173570b;
        if (list5 != null) {
            List<y0> list6 = list5;
            arrayList = new ArrayList(w.t(list6, 10));
            for (y0 y0Var : list6) {
                arrayList.add(new hcl.e0(y0Var.f173608b, y0Var.f173607a));
            }
        }
        return new r(strName3, uVar.f173571c, arrayList);
    }
}
