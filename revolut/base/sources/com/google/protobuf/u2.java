package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f49801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3 f49802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f49803c;

    static {
        Class<?> cls;
        Class<?> cls2;
        l3 l3Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f49801a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                l3Var = (l3) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f49802b = l3Var;
        f49803c = new n3();
    }

    public static void A(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 8;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void B(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yVar.H(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM += y.m((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        yVar.I(iM);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            yVar.I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void C(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yVar.J(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iN += y.n((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        yVar.I(iN);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            yVar.K((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void D(int i, List list, w1 w1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!(list instanceof m1)) {
            while (i2 < list.size()) {
                yVar.E(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        m1 m1Var = (m1) list;
        while (i2 < list.size()) {
            Object raw = m1Var.getRaw(i2);
            if (raw instanceof String) {
                yVar.E(i, (String) raw);
            } else {
                yVar.s(i, (p) raw);
            }
            i2++;
        }
    }

    public static void E(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.H(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += y.m(((Integer) list.get(i3)).intValue());
        }
        yVar.I(iM);
        while (i2 < list.size()) {
            yVar.I(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void F(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += y.n(((Long) list.get(i3)).longValue());
        }
        yVar.I(iN);
        while (i2 < list.size()) {
            yVar.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iN = 0;
            while (i < size) {
                iN += y.n(((Integer) list.get(i)).intValue());
                i++;
            }
            return iN;
        }
        x0 x0Var = (x0) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += y.n(x0Var.d(i));
            i++;
        }
        return iN2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y.l(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y.l(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iN = 0;
            while (i < size) {
                iN += y.n(((Integer) list.get(i)).intValue());
                i++;
            }
            return iN;
        }
        x0 x0Var = (x0) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += y.n(x0Var.d(i));
            i++;
        }
        return iN2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int iN = 0;
            while (i < size) {
                iN += y.n(((Long) list.get(i)).longValue());
                i++;
            }
            return iN;
        }
        t1 t1Var = (t1) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += y.n(t1Var.e(i));
            i++;
        }
        return iN2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iM = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM += y.m((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM;
        }
        x0 x0Var = (x0) list;
        int iM2 = 0;
        while (i < size) {
            int iD = x0Var.d(i);
            iM2 += y.m((iD >> 31) ^ (iD << 1));
            i++;
        }
        return iM2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int iN = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iN += y.n((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iN;
        }
        t1 t1Var = (t1) list;
        int iN2 = 0;
        while (i < size) {
            long jE = t1Var.e(i);
            iN2 += y.n((jE >> 63) ^ (jE << 1));
            i++;
        }
        return iN2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iM = 0;
            while (i < size) {
                iM += y.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        x0 x0Var = (x0) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += y.m(x0Var.d(i));
            i++;
        }
        return iM2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int iN = 0;
            while (i < size) {
                iN += y.n(((Long) list.get(i)).longValue());
                i++;
            }
            return iN;
        }
        t1 t1Var = (t1) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += y.n(t1Var.e(i));
            i++;
        }
        return iN2;
    }

    public static Object j(Object obj2, int i, AbstractList abstractList, b1 b1Var, Object obj3, l3 l3Var) {
        if (b1Var == null) {
            return obj3;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (b1Var.findValueByNumber(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj3 = n(obj2, i, iIntValue, obj3, l3Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj3;
    }

    public static Object k(Object obj2, int i, List list, c1 c1Var, Object obj3, l3 l3Var) {
        if (c1Var == null) {
            return obj3;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Integer) it8.next()).intValue();
                if (!c1Var.isInRange(iIntValue)) {
                    obj3 = n(obj2, i, iIntValue, obj3, l3Var);
                    it8.remove();
                }
            }
            return obj3;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (c1Var.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj3 = n(obj2, i, iIntValue2, obj3, l3Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void l(l3 l3Var, Object obj2, Object obj3) {
        ((n3) l3Var).getClass();
        w0 w0Var = (w0) obj2;
        m3 m3VarE = w0Var.unknownFields;
        m3 m3Var = ((w0) obj3).unknownFields;
        m3 m3Var2 = m3.f;
        if (!m3Var2.equals(m3Var)) {
            if (m3Var2.equals(m3VarE)) {
                m3VarE = m3.e(m3VarE, m3Var);
            } else {
                m3VarE.getClass();
                if (!m3Var.equals(m3Var2)) {
                    m3VarE.a();
                    int i = m3VarE.f49748a + m3Var.f49748a;
                    m3VarE.b(i);
                    System.arraycopy(m3Var.f49749b, 0, m3VarE.f49749b, m3VarE.f49748a, m3Var.f49748a);
                    System.arraycopy(m3Var.f49750c, 0, m3VarE.f49750c, m3VarE.f49748a, m3Var.f49748a);
                    m3VarE.f49748a = i;
                }
            }
        }
        w0Var.unknownFields = m3VarE;
    }

    public static boolean m(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public static Object n(Object obj2, int i, int i2, Object obj3, l3 l3Var) {
        if (obj3 == null) {
            obj3 = l3Var.a(obj2);
        }
        ((n3) l3Var).getClass();
        ((m3) obj3).f(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void o(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.q(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = y.d;
            i3++;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, w1 w1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w1Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((y) w1Var.f49817a).s(i, (p) list.get(i2));
        }
    }

    public static void q(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                yVar.getClass();
                yVar.w(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 8;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.x(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.y(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += y.n(((Integer) list.get(i3)).intValue());
        }
        yVar.I(iN);
        while (i2 < list.size()) {
            yVar.z(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void s(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 4;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 8;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                yVar.getClass();
                yVar.u(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 4;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.v(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, w1 w1Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w1Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            w1Var.d(i, list.get(i2), t2Var);
        }
    }

    public static void w(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.y(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += y.n(((Integer) list.get(i3)).intValue());
        }
        yVar.I(iN);
        while (i2 < list.size()) {
            yVar.z(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void x(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += y.n(((Long) list.get(i3)).longValue());
        }
        yVar.I(iN);
        while (i2 < list.size()) {
            yVar.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, w1 w1Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w1Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            w1Var.g(i, list.get(i2), t2Var);
        }
    }

    public static void z(int i, List list, w1 w1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y yVar = (y) w1Var.f49817a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yVar.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        yVar.G(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = y.d;
            i3 += 4;
        }
        yVar.I(i3);
        while (i2 < list.size()) {
            yVar.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
