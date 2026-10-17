package com.fourthline.orca.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class oq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f31715c;
    public static final oq0 d;
    public static final oq0 e;
    public static final oq0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final oq0 f31716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final oq0 f31717h;
    public static final oq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final oq0 f31718j;
    public static final oq0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final oq0 f31719l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f31721b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        HashMap map = new HashMap(10);
        f31715c = map;
        d = new oq0(null, null);
        a aVar = a.none;
        e = new oq0(aVar, null);
        a aVar2 = a.xMidYMid;
        b bVar = b.meet;
        f = new oq0(aVar2, bVar);
        a aVar3 = a.xMinYMin;
        f31716g = new oq0(aVar3, bVar);
        a aVar4 = a.xMaxYMax;
        f31717h = new oq0(aVar4, bVar);
        a aVar5 = a.xMidYMin;
        i = new oq0(aVar5, bVar);
        a aVar6 = a.xMidYMax;
        f31718j = new oq0(aVar6, bVar);
        b bVar2 = b.slice;
        k = new oq0(aVar2, bVar2);
        f31719l = new oq0(aVar3, bVar2);
        map.put("none", aVar);
        map.put("xMinYMin", aVar3);
        map.put("xMidYMin", aVar5);
        map.put("xMaxYMin", a.xMaxYMin);
        map.put("xMinYMid", a.xMinYMid);
        map.put("xMidYMid", aVar2);
        map.put("xMaxYMid", a.xMaxYMid);
        map.put("xMinYMax", a.xMinYMax);
        map.put("xMidYMax", aVar6);
        map.put("xMaxYMax", aVar4);
    }

    public oq0(a aVar, b bVar) {
        this.f31720a = aVar;
        this.f31721b = bVar;
    }

    public static oq0 a(String str) {
        try {
            return b(str);
        } catch (nz0 e2) {
            throw new IllegalArgumentException(e2.getMessage());
        }
    }

    public b b() {
        return this.f31721b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        oq0 oq0Var = (oq0) obj2;
        return this.f31720a == oq0Var.f31720a && this.f31721b == oq0Var.f31721b;
    }

    public String toString() {
        return this.f31720a + " " + this.f31721b;
    }

    private static oq0 b(String str) throws nz0 {
        b bVar;
        e81 e81Var = new e81(str);
        e81Var.q();
        String strK = e81Var.k();
        if ("defer".equals(strK)) {
            e81Var.q();
            strK = e81Var.k();
        }
        a aVar = (a) f31715c.get(strK);
        e81Var.q();
        if (e81Var.c()) {
            bVar = null;
        } else {
            String strK2 = e81Var.k();
            strK2.getClass();
            if (strK2.equals("meet")) {
                bVar = b.meet;
            } else {
                if (!strK2.equals("slice")) {
                    throw new nz0("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = b.slice;
            }
        }
        return new oq0(aVar, bVar);
    }

    public a a() {
        return this.f31720a;
    }
}
