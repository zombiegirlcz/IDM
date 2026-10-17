package tcl;

import fdl.r2;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jel.m2;
import jel.n2;
import jel.o2;
import jel.p2;
import jel.q2;
import jel.s2;
import jel.t2;
import jel.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.a0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n {
    public static final u2 a(r2.r rVar) {
        Object r2Var;
        String template = rVar.getTemplate();
        List args = rVar.getArgs();
        if (args == null) {
            args = f0.f322471a;
        }
        List<r2.q> list = args;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (r2.q qVar : list) {
            String style = qVar.getStyle();
            t2 t2Var = null;
            if (style != null) {
                t2[] t2VarArrValues = t2.values();
                int length = t2VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    t2 t2Var2 = t2VarArrValues[i];
                    if (a0.z(t2Var2.name(), style, true)) {
                        t2Var = t2Var2;
                        break;
                    }
                    i++;
                }
            }
            if (qVar instanceof r2.q.f) {
                r2.q.f fVar = (r2.q.f) qVar;
                r2Var = new q2(fVar.getPlaceholder(), t2Var, fVar.getValue());
            } else if (qVar instanceof r2.q.d) {
                r2.q.d dVar = (r2.q.d) qVar;
                r2Var = new o2(dVar.getPlaceholder(), t2Var, dVar.getValue());
            } else if (qVar instanceof r2.q.e) {
                r2.q.e eVar = (r2.q.e) qVar;
                r2Var = new p2(eVar.getPlaceholder(), t2Var, eVar.getValue());
            } else if (qVar instanceof r2.q.b) {
                r2.q.b bVar = (r2.q.b) qVar;
                r2Var = new m2(bVar.getPlaceholder(), t2Var, bVar.getValue());
            } else if (qVar instanceof r2.q.c) {
                r2.q.c cVar = (r2.q.c) qVar;
                r2Var = new n2(cVar.getPlaceholder(), t2Var, mo3.a.o(cVar.getValue()));
            } else {
                if (!(qVar instanceof r2.q.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                r2Var = new jel.r2(((r2.q.g) qVar).getPlaceholder());
            }
            arrayList.add(r2Var);
        }
        return new u2(template, arrayList);
    }

    public static final u2 b(hcl.r2 r2Var) {
        t2 t2Var;
        hcl.q2 q2Var;
        String template = r2Var.getTemplate();
        List<hcl.p2> args = r2Var.getArgs();
        ArrayList arrayList = new ArrayList(w.t(args, 10));
        for (hcl.p2 p2Var : args) {
            String style = p2Var.getStyle();
            int i = 0;
            Object r2Var2 = null;
            if (style != null) {
                t2[] t2VarArrValues = t2.values();
                int length = t2VarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    t2Var = t2VarArrValues[i2];
                    if (!a0.z(t2Var.name(), style, true)) {
                    }
                }
                t2Var = null;
            } else {
                t2Var = null;
            }
            String type = p2Var.getType();
            hcl.q2[] q2VarArrValues = hcl.q2.values();
            int length2 = q2VarArrValues.length;
            while (true) {
                if (i < length2) {
                    q2Var = q2VarArrValues[i];
                    if (!a0.z(q2Var.name(), type, true)) {
                        i++;
                    }
                } else {
                    q2Var = null;
                }
            }
            switch (q2Var == null ? -1 : m.f269890a[q2Var.ordinal()]) {
                case -1:
                case 6:
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    String stringValue = p2Var.getStringValue();
                    if (stringValue != null) {
                        r2Var2 = new q2(p2Var.getPlaceholder(), t2Var, stringValue);
                    }
                    break;
                case 2:
                    BigDecimal decimalValue = p2Var.getDecimalValue();
                    if (decimalValue != null) {
                        r2Var2 = new o2(p2Var.getPlaceholder(), t2Var, decimalValue);
                    }
                    break;
                case 3:
                    BigDecimal decimalValue2 = p2Var.getDecimalValue();
                    if (decimalValue2 != null) {
                        r2Var2 = new p2(p2Var.getPlaceholder(), t2Var, decimalValue2);
                    }
                    break;
                case 4:
                    LocalDate dateValue = p2Var.getDateValue();
                    if (dateValue != null) {
                        r2Var2 = new m2(p2Var.getPlaceholder(), t2Var, dateValue);
                    }
                    break;
                case 5:
                    jo3.b moneyValue = p2Var.getMoneyValue();
                    if (moneyValue != null) {
                        r2Var2 = new n2(p2Var.getPlaceholder(), t2Var, hx7.a.v(moneyValue));
                    }
                    break;
            }
            if (r2Var2 == null) {
                r2Var2 = new jel.r2(p2Var.getPlaceholder());
            }
            arrayList.add(r2Var2);
        }
        return new u2(template, arrayList);
    }

    public static final hcl.r2 c(u2 u2Var) {
        hcl.p2 p2VarD;
        String str = u2Var.f173572a;
        ArrayList<s2> arrayList = u2Var.f173573b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (s2 s2Var : arrayList) {
            if (s2Var instanceof q2) {
                p2VarD = d(s2Var, hcl.q2.STRING, ((q2) s2Var).f173550c, null, null, null, 28);
            } else if (s2Var instanceof o2) {
                p2VarD = d(s2Var, hcl.q2.NUMBER, null, ((o2) s2Var).f173529c, null, null, 26);
            } else if (s2Var instanceof p2) {
                p2VarD = d(s2Var, hcl.q2.PERCENTAGE, null, ((p2) s2Var).f173539c, null, null, 26);
            } else if (s2Var instanceof m2) {
                p2VarD = d(s2Var, hcl.q2.DATE, null, null, ((m2) s2Var).f173511c, null, 22);
            } else if (s2Var instanceof n2) {
                p2VarD = d(s2Var, hcl.q2.MONEY, null, null, null, hx7.a.A(((n2) s2Var).f173524c), 14);
            } else {
                if (!(s2Var instanceof jel.r2)) {
                    throw new NoWhenBranchMatchedException();
                }
                p2VarD = d(s2Var, hcl.q2.UNKNOWN, null, null, null, null, 30);
            }
            arrayList2.add(p2VarD);
        }
        return new hcl.r2(str, arrayList2);
    }

    public static hcl.p2 d(s2 s2Var, hcl.q2 q2Var, String str, BigDecimal bigDecimal, LocalDate localDate, jo3.b bVar, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        BigDecimal bigDecimal2 = (i & 4) != 0 ? null : bigDecimal;
        LocalDate localDate2 = (i & 8) != 0 ? null : localDate;
        jo3.b bVar2 = (i & 16) != 0 ? null : bVar;
        String strName = q2Var.name();
        String strA = s2Var.a();
        t2 t2VarB = s2Var.b();
        return new hcl.p2(strName, strA, t2VarB != null ? t2VarB.name() : null, str2, bigDecimal2, localDate2, bVar2);
    }
}
