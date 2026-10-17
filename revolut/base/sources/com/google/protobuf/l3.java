package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class l3 {
    public abstract m3 a(Object obj2);

    public final boolean b(Object obj2, s2 s2Var) throws InvalidProtocolBufferException {
        v vVar = (v) s2Var;
        int i = vVar.f49805b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            vVar.x(0);
            ((m3) obj2).f(i2 << 3, Long.valueOf(vVar.f49804a.u()));
            return true;
        }
        if (i3 == 1) {
            vVar.x(1);
            ((m3) obj2).f((i2 << 3) | 1, Long.valueOf(vVar.f49804a.q()));
            return true;
        }
        if (i3 == 2) {
            ((m3) obj2).f((i2 << 3) | 2, vVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            vVar.x(5);
            ((m3) obj2).f((i2 << 3) | 5, Integer.valueOf(vVar.f49804a.p()));
            return true;
        }
        m3 m3Var = new m3();
        int i5 = i2 << 3;
        int i6 = i5 | 4;
        while (vVar.a() != Integer.MAX_VALUE && b(m3Var, vVar)) {
        }
        if (i6 != vVar.f49805b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (m3Var.e) {
            m3Var.e = false;
        }
        ((m3) obj2).f(i5 | 3, m3Var);
        return true;
    }

    public abstract void c(Object obj2, Object obj3);
}
