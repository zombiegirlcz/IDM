package com.google.firebase.perf.util;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f49608c;

    public i(long j2) {
        this.f49608c = new LinkedHashMap(100, 0.75f, true);
        this.f49606a = j2;
    }

    public synchronized Object a(Object obj2) {
        y8.i iVar;
        iVar = (y8.i) ((LinkedHashMap) this.f49608c).get(obj2);
        return iVar != null ? iVar.f311603a : null;
    }

    public int b(Object obj2) {
        return 1;
    }

    public void c(Object obj2, Object obj3) {
    }

    public synchronized Object d(Object obj2, Object obj3) {
        int iB = b(obj3);
        long j2 = iB;
        if (j2 >= this.f49606a) {
            c(obj2, obj3);
            return null;
        }
        if (obj3 != null) {
            this.f49607b += j2;
        }
        y8.i iVar = (y8.i) ((LinkedHashMap) this.f49608c).put(obj2, obj3 == null ? null : new y8.i(obj3, iB));
        if (iVar != null) {
            this.f49607b -= (long) iVar.f311604b;
            if (!iVar.f311603a.equals(obj3)) {
                c(obj2, iVar.f311603a);
            }
        }
        e(this.f49606a);
        return iVar != null ? iVar.f311603a : null;
    }

    public synchronized void e(long j2) {
        while (this.f49607b > j2) {
            Iterator it8 = ((LinkedHashMap) this.f49608c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it8.next();
            y8.i iVar = (y8.i) entry.getValue();
            this.f49607b -= (long) iVar.f311604b;
            Object key = entry.getKey();
            it8.remove();
            c(key, iVar.f311603a);
        }
    }

    public i(long j2, long j3, TimeUnit timeUnit) {
        this.f49606a = j2;
        this.f49607b = j3;
        this.f49608c = timeUnit;
    }
}
