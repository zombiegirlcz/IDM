package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static Object a(Object obj2, v vVar, u0 u0Var, d0 d0Var, i0 i0Var, Object obj3, l3 l3Var) throws InvalidProtocolBufferException {
        Object objValueOf;
        Object obj4;
        ArrayList arrayList;
        int iE = u0Var.e();
        t0 t0Var = u0Var.d;
        if (t0Var.d && t0Var.e) {
            switch (e0.f49702a[u0Var.c().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    vVar.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    vVar.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    vVar.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    vVar.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    vVar.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    vVar.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    vVar.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    vVar.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    vVar.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    vVar.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    vVar.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    vVar.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    vVar.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    vVar.h(arrayList);
                    obj3 = u2.j(obj2, iE, arrayList, t0Var.f49791a, obj3, l3Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + t0Var.f49793c);
            }
            i0Var.o(t0Var, arrayList);
            return obj3;
        }
        if (u0Var.c() != k4.ENUM) {
            switch (e0.f49702a[u0Var.c().ordinal()]) {
                case 1:
                    vVar.x(1);
                    objValueOf = Double.valueOf(vVar.f49804a.n());
                    break;
                case 2:
                    vVar.x(5);
                    objValueOf = Float.valueOf(vVar.f49804a.r());
                    break;
                case 3:
                    vVar.x(0);
                    objValueOf = Long.valueOf(vVar.f49804a.u());
                    break;
                case 4:
                    vVar.x(0);
                    objValueOf = Long.valueOf(vVar.f49804a.G());
                    break;
                case 5:
                    vVar.x(0);
                    objValueOf = Integer.valueOf(vVar.f49804a.t());
                    break;
                case 6:
                    vVar.x(1);
                    objValueOf = Long.valueOf(vVar.f49804a.q());
                    break;
                case 7:
                    vVar.x(5);
                    objValueOf = Integer.valueOf(vVar.f49804a.p());
                    break;
                case 8:
                    vVar.x(0);
                    objValueOf = Boolean.valueOf(vVar.f49804a.l());
                    break;
                case 9:
                    vVar.x(0);
                    objValueOf = Integer.valueOf(vVar.f49804a.F());
                    break;
                case 10:
                    vVar.x(5);
                    objValueOf = Integer.valueOf(vVar.f49804a.y());
                    break;
                case 11:
                    vVar.x(1);
                    objValueOf = Long.valueOf(vVar.f49804a.z());
                    break;
                case 12:
                    vVar.x(0);
                    objValueOf = Integer.valueOf(vVar.f49804a.A());
                    break;
                case 13:
                    vVar.x(0);
                    objValueOf = Long.valueOf(vVar.f49804a.B());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = vVar.e();
                    break;
                case 16:
                    vVar.x(2);
                    objValueOf = vVar.f49804a.C();
                    break;
                case 17:
                    if (!u0Var.f()) {
                        Object obj5 = i0Var.f49730a.get(t0Var);
                        if (obj5 instanceof w0) {
                            p2 p2Var = p2.f49764c;
                            p2Var.getClass();
                            t2 t2VarA = p2Var.a(obj5.getClass());
                            if (!((w0) obj5).isMutable()) {
                                Object objNewInstance = t2VarA.newInstance();
                                t2VarA.mergeFrom(objNewInstance, obj5);
                                i0Var.o(t0Var, objNewInstance);
                                obj5 = objNewInstance;
                            }
                            vVar.x(3);
                            vVar.b(obj5, t2VarA, d0Var);
                            return obj3;
                        }
                    }
                    Class<?> cls = u0Var.d().getClass();
                    vVar.x(3);
                    t2 t2VarA2 = p2.f49764c.a(cls);
                    Object objNewInstance2 = t2VarA2.newInstance();
                    vVar.b(objNewInstance2, t2VarA2, d0Var);
                    t2VarA2.makeImmutable(objNewInstance2);
                    objValueOf = objNewInstance2;
                    break;
                case 18:
                    if (!u0Var.f()) {
                        Object obj6 = i0Var.f49730a.get(t0Var);
                        if (obj6 instanceof w0) {
                            p2 p2Var2 = p2.f49764c;
                            p2Var2.getClass();
                            t2 t2VarA3 = p2Var2.a(obj6.getClass());
                            if (!((w0) obj6).isMutable()) {
                                Object objNewInstance3 = t2VarA3.newInstance();
                                t2VarA3.mergeFrom(objNewInstance3, obj6);
                                i0Var.o(t0Var, objNewInstance3);
                                obj6 = objNewInstance3;
                            }
                            vVar.x(2);
                            vVar.c(obj6, t2VarA3, d0Var);
                            return obj3;
                        }
                    }
                    objValueOf = vVar.o(u0Var.d().getClass(), d0Var);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            vVar.x(0);
            int iT = vVar.f49804a.t();
            if (t0Var.f49791a.findValueByNumber(iT) == null) {
                return u2.n(obj2, iE, iT, obj3, l3Var);
            }
            objValueOf = Integer.valueOf(iT);
        }
        if (u0Var.f()) {
            i0Var.a(t0Var, objValueOf);
            return obj3;
        }
        int i = e0.f49702a[u0Var.c().ordinal()];
        if ((i == 17 || i == 18) && (obj4 = i0Var.f49730a.get(t0Var)) != null) {
            d2 d2Var = (d2) objValueOf;
            p0 p0Var = (p0) ((d2) obj4).toBuilder();
            if (!p0Var.f49760a.getClass().isInstance(d2Var)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            p0Var.f((w0) ((b) d2Var));
            objValueOf = p0Var.b();
        }
        i0Var.o(t0Var, objValueOf);
        return obj3;
    }

    public static void b(w1 w1Var, Map.Entry entry) {
        t0 t0Var = (t0) entry.getKey();
        boolean z = t0Var.d;
        k4 k4Var = t0Var.f49793c;
        boolean z3 = t0Var.e;
        int i = t0Var.f49792b;
        if (z) {
            switch (e0.f49702a[k4Var.ordinal()]) {
                case 1:
                    u2.q(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 2:
                    u2.u(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 3:
                    u2.x(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 4:
                    u2.F(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 5:
                    u2.w(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 6:
                    u2.t(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 7:
                    u2.s(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 8:
                    u2.o(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 9:
                    u2.E(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 10:
                    u2.z(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 11:
                    u2.A(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 12:
                    u2.B(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 13:
                    u2.C(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 14:
                    u2.w(i, (List) entry.getValue(), w1Var, z3);
                    break;
                case 15:
                    u2.p(i, (List) entry.getValue(), w1Var);
                    break;
                case 16:
                    u2.D(i, (List) entry.getValue(), w1Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        u2.v(i, (List) entry.getValue(), w1Var, p2.f49764c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        u2.y(i, (List) entry.getValue(), w1Var, p2.f49764c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (e0.f49702a[k4Var.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                y yVar = (y) w1Var.f49817a;
                yVar.getClass();
                yVar.w(i, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                y yVar2 = (y) w1Var.f49817a;
                yVar2.getClass();
                yVar2.u(i, Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                w1Var.f(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((y) w1Var.f49817a).J(i, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                w1Var.e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                w1Var.c(i, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                w1Var.b(i, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((y) w1Var.f49817a).q(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((y) w1Var.f49817a).H(i, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((y) w1Var.f49817a).u(i, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((y) w1Var.f49817a).w(i, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((y) w1Var.f49817a).H(i, (iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 13:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((y) w1Var.f49817a).J(i, (jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 14:
                w1Var.e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                w1Var.a(i, (p) entry.getValue());
                break;
            case 16:
                ((y) w1Var.f49817a).E(i, (String) entry.getValue());
                break;
            case 17:
                w1Var.d(i, entry.getValue(), p2.f49764c.a(entry.getValue().getClass()));
                break;
            case 18:
                w1Var.g(i, entry.getValue(), p2.f49764c.a(entry.getValue().getClass()));
                break;
        }
    }
}
