package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes17.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f49366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f49367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f49368c;
    public static final k1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f49366a = cls;
        f49367b = v(false);
        f49368c = v(true);
        d = new k1();
    }

    public static void A(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                nVar.getClass();
                nVar.a0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 8;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.b0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nVar.d0(i, 0);
                nVar.c0(iIntValue);
            }
            return;
        }
        nVar.d0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += n.R(((Integer) list.get(i3)).intValue());
        }
        nVar.e0(iR);
        for (int i5 = 0; i5 < list.size(); i5++) {
            nVar.c0(((Integer) list.get(i5)).intValue());
        }
    }

    public static void C(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.Y(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 4;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.Z(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.a0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 8;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.b0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                nVar.getClass();
                nVar.Y(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 4;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.Z(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, p0 p0Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            p0Var.h(i, list.get(i2), g1Var);
        }
    }

    public static void G(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nVar.d0(i, 0);
                nVar.c0(iIntValue);
            }
            return;
        }
        nVar.d0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += n.R(((Integer) list.get(i3)).intValue());
        }
        nVar.e0(iR);
        for (int i5 = 0; i5 < list.size(); i5++) {
            nVar.c0(((Integer) list.get(i5)).intValue());
        }
    }

    public static void H(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.f0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV += n.V(((Long) list.get(i3)).longValue());
        }
        nVar.e0(iV);
        while (i2 < list.size()) {
            nVar.g0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, p0 p0Var, g1 g1Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            p0Var.k(i, list.get(i2), g1Var);
        }
    }

    public static void J(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.Y(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 4;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.Z(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.a0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = n.e;
            i3 += 8;
        }
        nVar.e0(i3);
        while (i2 < list.size()) {
            nVar.b0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nVar.d0(i, 0);
                nVar.e0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        nVar.d0(i, 2);
        int iU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iU += n.U((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        nVar.e0(iU);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            nVar.e0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                nVar.f0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iV += n.V((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        nVar.e0(iV);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            nVar.g0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, p0 p0Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!(list instanceof j0)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                nVar.d0(i, 2);
                int i3 = nVar.f49393c;
                byte[] bArr = nVar.f49392b;
                int i5 = nVar.d;
                try {
                    int iU = n.U(str.length() * 3);
                    int iU2 = n.U(str.length());
                    if (iU2 == iU) {
                        int i6 = i5 + iU2;
                        nVar.d = i6;
                        int iJ = v1.f49419a.j(str, bArr, i6, i3 - i6);
                        nVar.d = i5;
                        nVar.e0((iJ - i5) - iU2);
                        nVar.d = iJ;
                    } else {
                        nVar.e0(v1.b(str));
                        int i21 = nVar.d;
                        nVar.d = v1.f49419a.j(str, bArr, i21, i3 - i21);
                    }
                } catch (u1 e) {
                    nVar.d = i5;
                    n.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(g0.f49364a);
                    try {
                        nVar.e0(bytes.length);
                        nVar.X(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new CodedOutputStream$OutOfSpaceException(e4);
                }
            }
            return;
        }
        j0 j0Var = (j0) list;
        for (int i22 = 0; i22 < list.size(); i22++) {
            Object raw = j0Var.getRaw(i22);
            if (raw instanceof String) {
                String str2 = (String) raw;
                nVar.d0(i, 2);
                int i32 = nVar.f49393c;
                byte[] bArr2 = nVar.f49392b;
                int i33 = nVar.d;
                try {
                    int iU3 = n.U(str2.length() * 3);
                    int iU4 = n.U(str2.length());
                    if (iU4 == iU3) {
                        int i43 = i33 + iU4;
                        nVar.d = i43;
                        int iJ2 = v1.f49419a.j(str2, bArr2, i43, i32 - i43);
                        nVar.d = i33;
                        nVar.e0((iJ2 - i33) - iU4);
                        nVar.d = iJ2;
                    } else {
                        nVar.e0(v1.b(str2));
                        int i59 = nVar.d;
                        nVar.d = v1.f49419a.j(str2, bArr2, i59, i32 - i59);
                    }
                } catch (u1 e5) {
                    nVar.d = i33;
                    n.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(g0.f49364a);
                    try {
                        nVar.e0(bytes2.length);
                        nVar.X(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new CodedOutputStream$OutOfSpaceException(e6);
                    }
                } catch (IndexOutOfBoundsException e22) {
                    throw new CodedOutputStream$OutOfSpaceException(e22);
                }
            } else {
                j jVar = (j) raw;
                nVar.d0(i, 2);
                nVar.e0(jVar.size());
                i iVar = (i) jVar;
                nVar.X(iVar.d, iVar.f(), iVar.size());
            }
        }
    }

    public static void O(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nVar.d0(i, 0);
                nVar.e0(iIntValue);
            }
            return;
        }
        nVar.d0(i, 2);
        int iU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU += n.U(((Integer) list.get(i3)).intValue());
        }
        nVar.e0(iU);
        for (int i5 = 0; i5 < list.size(); i5++) {
            nVar.e0(((Integer) list.get(i5)).intValue());
        }
    }

    public static void P(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.f0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.d0(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV += n.V(((Long) list.get(i3)).longValue());
        }
        nVar.e0(iV);
        while (i2 < list.size()) {
            nVar.g0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = n.T(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iT += n.N((j) list.get(i2));
        }
        return iT;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            if (size <= 0) {
                return 0;
            }
            c0Var.c(0);
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += n.R(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n.O(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n.P(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            if (size <= 0) {
                return 0;
            }
            c0Var.c(0);
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += n.R(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (n.T(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.c(0);
            throw null;
        }
        int iV = 0;
        for (int i = 0; i < size; i++) {
            iV += n.V(((Long) list.get(i)).longValue());
        }
        return iV;
    }

    public static int l(int i, List list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = n.T(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iA = ((a) list.get(i2)).a(g1Var);
            iT += n.U(iA) + iA;
        }
        return iT;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            if (size <= 0) {
                return 0;
            }
            c0Var.c(0);
            throw null;
        }
        int iU = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iU += n.U((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iU;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.c(0);
            throw null;
        }
        int iV = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iV += n.V((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iV;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iT = n.T(i) * size;
        if (!(list instanceof j0)) {
            while (i2 < size) {
                Object obj2 = list.get(i2);
                if (obj2 instanceof j) {
                    int size2 = ((j) obj2).size();
                    iT = n.U(size2) + size2 + iT;
                } else {
                    iT = n.S((String) obj2) + iT;
                }
                i2++;
            }
            return iT;
        }
        j0 j0Var = (j0) list;
        while (i2 < size) {
            Object raw = j0Var.getRaw(i2);
            if (raw instanceof j) {
                int size3 = ((j) raw).size();
                iT = n.U(size3) + size3 + iT;
            } else {
                iT = n.S((String) raw) + iT;
            }
            i2++;
        }
        return iT;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            if (size <= 0) {
                return 0;
            }
            c0Var.c(0);
            throw null;
        }
        int iU = 0;
        for (int i = 0; i < size; i++) {
            iU += n.U(((Integer) list.get(i)).intValue());
        }
        return iU;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.T(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.c(0);
            throw null;
        }
        int iV = 0;
        for (int i = 0; i < size; i++) {
            iV += n.V(((Long) list.get(i)).longValue());
        }
        return iV;
    }

    public static i1 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (i1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
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
    public static void w(i1 i1Var, Object obj2, Object obj3) {
        ((k1) i1Var).getClass();
        b0 b0Var = (b0) obj2;
        j1 j1Var = b0Var.unknownFields;
        j1 j1Var2 = ((b0) obj3).unknownFields;
        j1 j1Var3 = j1.f;
        if (!j1Var3.equals(j1Var2)) {
            if (j1Var3.equals(j1Var)) {
                int i = j1Var.f49373a + j1Var2.f49373a;
                int[] iArrCopyOf = Arrays.copyOf(j1Var.f49374b, i);
                System.arraycopy(j1Var2.f49374b, 0, iArrCopyOf, j1Var.f49373a, j1Var2.f49373a);
                Object[] objArrCopyOf = Arrays.copyOf(j1Var.f49375c, i);
                System.arraycopy(j1Var2.f49375c, 0, objArrCopyOf, j1Var.f49373a, j1Var2.f49373a);
                j1Var = new j1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                j1Var.getClass();
                if (!j1Var2.equals(j1Var3)) {
                    if (!j1Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = j1Var.f49373a + j1Var2.f49373a;
                    j1Var.a(i2);
                    System.arraycopy(j1Var2.f49374b, 0, j1Var.f49374b, j1Var.f49373a, j1Var2.f49373a);
                    System.arraycopy(j1Var2.f49375c, 0, j1Var.f49375c, j1Var.f49373a, j1Var2.f49373a);
                    j1Var.f49373a = i2;
                }
            }
        }
        b0Var.unknownFields = j1Var;
    }

    public static boolean x(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public static void y(int i, List list, p0 p0Var, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) p0Var.f49398a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                nVar.d0(i, 0);
                nVar.W(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        nVar.d0(i, 2);
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = n.e;
            i3++;
        }
        nVar.e0(i3);
        for (int i6 = 0; i6 < list.size(); i6++) {
            nVar.W(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i, List list, p0 p0Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            n nVar = (n) p0Var.f49398a;
            j jVar = (j) list.get(i2);
            nVar.d0(i, 2);
            nVar.e0(jVar.size());
            i iVar = (i) jVar;
            nVar.X(iVar.d, iVar.f(), iVar.size());
        }
    }
}
