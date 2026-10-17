package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d0 f49696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f49697c = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f49698a = Collections.EMPTY_MAP;

    public static d0 b() {
        d0 d0Var;
        d0 d0Var2 = f49696b;
        if (d0Var2 != null) {
            return d0Var2;
        }
        synchronized (d0.class) {
            try {
                d0Var = f49696b;
                if (d0Var == null) {
                    Class cls = b0.f49684a;
                    d0 d0Var3 = null;
                    if (cls != null) {
                        try {
                            d0Var3 = (d0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    d0Var = d0Var3 != null ? d0Var3 : f49697c;
                    f49696b = d0Var;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return d0Var;
    }

    public final u0 a(int i, d2 d2Var) {
        return (u0) this.f49698a.get(new c0(i, d2Var));
    }
}
