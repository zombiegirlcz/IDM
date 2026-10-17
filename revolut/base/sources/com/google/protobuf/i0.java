package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f49729c = new i0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f49730a = new v2(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49731b;

    public i0() {
    }

    public static int c(k4 k4Var, int i, Object obj2) {
        int iL = y.l(i);
        if (k4Var == k4.GROUP) {
            iL *= 2;
        }
        return d(k4Var, obj2) + iL;
    }

    public static int d(k4 k4Var, Object obj2) {
        int serializedSize;
        int iM;
        switch (h0.f49714b[k4Var.ordinal()]) {
            case 1:
                ((Double) obj2).getClass();
                Logger logger = y.d;
                return 8;
            case 2:
                ((Float) obj2).getClass();
                Logger logger2 = y.d;
                return 4;
            case 3:
                return y.n(((Long) obj2).longValue());
            case 4:
                return y.n(((Long) obj2).longValue());
            case 5:
                return y.n(((Integer) obj2).intValue());
            case 6:
                ((Long) obj2).getClass();
                Logger logger3 = y.d;
                return 8;
            case 7:
                ((Integer) obj2).getClass();
                Logger logger4 = y.d;
                return 4;
            case 8:
                ((Boolean) obj2).getClass();
                Logger logger5 = y.d;
                return 1;
            case 9:
                Logger logger6 = y.d;
                return ((d2) obj2).getSerializedSize();
            case 10:
                Logger logger7 = y.d;
                serializedSize = ((d2) obj2).getSerializedSize();
                iM = y.m(serializedSize);
                break;
            case 11:
                if (!(obj2 instanceof p)) {
                    return y.k((String) obj2);
                }
                Logger logger8 = y.d;
                serializedSize = ((p) obj2).size();
                iM = y.m(serializedSize);
                break;
                break;
            case 12:
                if (!(obj2 instanceof p)) {
                    Logger logger9 = y.d;
                    serializedSize = ((byte[]) obj2).length;
                    iM = y.m(serializedSize);
                } else {
                    Logger logger10 = y.d;
                    serializedSize = ((p) obj2).size();
                    iM = y.m(serializedSize);
                }
                break;
            case 13:
                return y.m(((Integer) obj2).intValue());
            case 14:
                ((Integer) obj2).getClass();
                Logger logger11 = y.d;
                return 4;
            case 15:
                ((Long) obj2).getClass();
                Logger logger12 = y.d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                return y.m((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj2).longValue();
                return y.n((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj2 instanceof a1 ? y.n(((a1) obj2).getNumber()) : y.n(((Integer) obj2).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM + serializedSize;
    }

    public static int e(t0 t0Var, Object obj2) {
        k4 k4Var = t0Var.f49793c;
        int i = t0Var.f49792b;
        if (!t0Var.d) {
            return c(k4Var, i, obj2);
        }
        List list = (List) obj2;
        int iC = 0;
        if (!t0Var.e) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                iC += c(k4Var, i, it8.next());
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            iC += d(k4Var, it9.next());
        }
        return y.m(iC) + y.l(i) + iC;
    }

    public static int g(Map.Entry entry) {
        t0 t0Var = (t0) entry.getKey();
        Object value = entry.getValue();
        if (t0Var.f49793c.a() != l4.MESSAGE || t0Var.d || t0Var.e) {
            return e(t0Var, value);
        }
        int i = ((t0) entry.getKey()).f49792b;
        int iM = y.m(i) + y.l(2) + (y.l(1) * 2);
        int iL = y.l(3);
        int serializedSize = ((d2) value).getSerializedSize();
        return y.m(serializedSize) + serializedSize + iL + iM;
    }

    public static boolean j(Map.Entry entry) {
        t0 t0Var = (t0) entry.getKey();
        if (t0Var.f49793c.a() != l4.MESSAGE) {
            return true;
        }
        if (!t0Var.d) {
            Object value = entry.getValue();
            if (value instanceof e2) {
                return ((e2) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        for (Object obj2 : (List) entry.getValue()) {
            if (!(obj2 instanceof e2)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((e2) obj2).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static void p(t0 t0Var, Object obj2) {
        k4 k4Var = t0Var.f49793c;
        Charset charset = j1.f49738a;
        obj2.getClass();
        boolean z = true;
        switch (h0.f49713a[k4Var.a().ordinal()]) {
            case 1:
                z = obj2 instanceof Integer;
                break;
            case 2:
                z = obj2 instanceof Long;
                break;
            case 3:
                z = obj2 instanceof Float;
                break;
            case 4:
                z = obj2 instanceof Double;
                break;
            case 5:
                z = obj2 instanceof Boolean;
                break;
            case 6:
                z = obj2 instanceof String;
                break;
            case 7:
                if (!(obj2 instanceof p) && !(obj2 instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj2 instanceof Integer) && !(obj2 instanceof a1)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj2 instanceof d2)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t0Var.f49792b), t0Var.f49793c.a(), obj2.getClass().getName()));
        }
    }

    public static void q(y yVar, k4 k4Var, int i, Object obj2) {
        if (k4Var == k4.GROUP) {
            yVar.G(i, 3);
            ((d2) obj2).writeTo(yVar);
            yVar.G(i, 4);
        }
        yVar.G(i, k4Var.b());
        switch (h0.f49714b[k4Var.ordinal()]) {
            case 1:
                yVar.x(Double.doubleToRawLongBits(((Double) obj2).doubleValue()));
                break;
            case 2:
                yVar.v(Float.floatToRawIntBits(((Float) obj2).floatValue()));
                break;
            case 3:
                yVar.K(((Long) obj2).longValue());
                break;
            case 4:
                yVar.K(((Long) obj2).longValue());
                break;
            case 5:
                yVar.z(((Integer) obj2).intValue());
                break;
            case 6:
                yVar.x(((Long) obj2).longValue());
                break;
            case 7:
                yVar.v(((Integer) obj2).intValue());
                break;
            case 8:
                yVar.p(((Boolean) obj2).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((d2) obj2).writeTo(yVar);
                break;
            case 10:
                yVar.B((d2) obj2);
                break;
            case 11:
                if (!(obj2 instanceof p)) {
                    yVar.F((String) obj2);
                } else {
                    yVar.t((p) obj2);
                }
                break;
            case 12:
                if (!(obj2 instanceof p)) {
                    byte[] bArr = (byte[]) obj2;
                    yVar.r(bArr.length, bArr);
                } else {
                    yVar.t((p) obj2);
                }
                break;
            case 13:
                yVar.I(((Integer) obj2).intValue());
                break;
            case 14:
                yVar.v(((Integer) obj2).intValue());
                break;
            case 15:
                yVar.x(((Long) obj2).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                yVar.I((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj2).longValue();
                yVar.K((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj2 instanceof a1)) {
                    yVar.z(((Integer) obj2).intValue());
                } else {
                    yVar.z(((a1) obj2).getNumber());
                }
                break;
        }
    }

    public final void a(t0 t0Var, Object obj2) {
        List arrayList;
        if (!t0Var.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        p(t0Var, obj2);
        v2 v2Var = this.f49730a;
        Object obj3 = v2Var.get(t0Var);
        if (obj3 == null) {
            arrayList = new ArrayList();
            v2Var.put(t0Var, arrayList);
        } else {
            arrayList = (List) obj3;
        }
        arrayList.add(obj2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i0 clone() {
        v2 v2Var;
        i0 i0Var = new i0();
        int i = 0;
        while (true) {
            v2Var = this.f49730a;
            if (i >= v2Var.f49810b.size()) {
                break;
            }
            Map.Entry entryC = v2Var.c(i);
            i0Var.o((t0) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : v2Var.d()) {
            i0Var.o((t0) entry.getKey(), entry.getValue());
        }
        return i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof i0) {
            return this.f49730a.equals(((i0) obj2).f49730a);
        }
        return false;
    }

    public final int f() {
        v2 v2Var;
        int i = 0;
        int iG = 0;
        while (true) {
            v2Var = this.f49730a;
            if (i >= v2Var.f49810b.size()) {
                break;
            }
            iG += g(v2Var.c(i));
            i++;
        }
        Iterator it8 = v2Var.d().iterator();
        while (it8.hasNext()) {
            iG += g((Map.Entry) it8.next());
        }
        return iG;
    }

    public final int h() {
        v2 v2Var;
        int i = 0;
        int iE = 0;
        while (true) {
            v2Var = this.f49730a;
            if (i >= v2Var.f49810b.size()) {
                break;
            }
            Map.Entry entryC = v2Var.c(i);
            iE += e((t0) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : v2Var.d()) {
            iE += e((t0) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final int hashCode() {
        return this.f49730a.hashCode();
    }

    public final boolean i() {
        int i = 0;
        while (true) {
            v2 v2Var = this.f49730a;
            if (i >= v2Var.f49810b.size()) {
                Iterator it8 = v2Var.d().iterator();
                while (it8.hasNext()) {
                    if (!j((Map.Entry) it8.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!j(v2Var.c(i))) {
                return false;
            }
            i++;
        }
    }

    public final Iterator k() {
        return ((d3) this.f49730a.entrySet()).iterator();
    }

    public final void l() {
        v2 v2Var;
        if (this.f49731b) {
            return;
        }
        int i = 0;
        while (true) {
            v2Var = this.f49730a;
            if (i >= v2Var.f49810b.size()) {
                break;
            }
            Map.Entry entryC = v2Var.c(i);
            if (entryC.getValue() instanceof w0) {
                ((w0) entryC.getValue()).makeImmutable();
            }
            i++;
        }
        if (!v2Var.d) {
            for (int i2 = 0; i2 < v2Var.f49810b.size(); i2++) {
                Map.Entry entryC2 = v2Var.c(i2);
                if (((t0) entryC2.getKey()).d) {
                    entryC2.setValue(Collections.unmodifiableList((List) entryC2.getValue()));
                }
            }
            for (Map.Entry entry : v2Var.d()) {
                if (((t0) entry.getKey()).d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!v2Var.d) {
            v2Var.f49811c = v2Var.f49811c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.f49811c);
            v2Var.f = v2Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.f);
            v2Var.d = true;
        }
        this.f49731b = true;
    }

    public final void m(i0 i0Var) {
        v2 v2Var;
        int i = 0;
        while (true) {
            v2Var = i0Var.f49730a;
            if (i >= v2Var.f49810b.size()) {
                break;
            }
            n(v2Var.c(i));
            i++;
        }
        Iterator it8 = v2Var.d().iterator();
        while (it8.hasNext()) {
            n((Map.Entry) it8.next());
        }
    }

    public final void n(Map.Entry entry) {
        t0 t0Var = (t0) entry.getKey();
        Object value = entry.getValue();
        boolean z = t0Var.d;
        v2 v2Var = this.f49730a;
        if (z) {
            Object arrayList = v2Var.get(t0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) arrayList;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            v2Var.put(t0Var, arrayList);
            return;
        }
        if (t0Var.f49793c.a() != l4.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            v2Var.put(t0Var, value);
            return;
        }
        Object obj3 = v2Var.get(t0Var);
        if (obj3 != null) {
            p0 p0Var = (p0) ((d2) obj3).toBuilder();
            p0Var.f((w0) ((d2) value));
            v2Var.put(t0Var, p0Var.a());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            v2Var.put(t0Var, value);
        }
    }

    public final void o(t0 t0Var, Object obj2) {
        if (!t0Var.d) {
            p(t0Var, obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj2);
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                p(t0Var, it8.next());
            }
            obj2 = arrayList;
        }
        this.f49730a.put(t0Var, obj2);
    }

    public i0(int i) {
        l();
        l();
    }
}
