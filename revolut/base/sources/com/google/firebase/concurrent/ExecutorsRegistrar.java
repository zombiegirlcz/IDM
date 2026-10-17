package com.google.firebase.concurrent;

import ce.b;
import ce.h;
import ce.p;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import vd.a;
import vd.c;
import vd.d;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f49442a = new p(new h(3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f49443b = new p(new h(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f49444c = new p(new h(5));
    public static final p d = new p(new h(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(a.class, ScheduledExecutorService.class);
        t[] tVarArr = {new t(a.class, ExecutorService.class), new t(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            m70.a.b(tVar2, "Null interface");
        }
        Collections.addAll(hashSet, tVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a5.a(8), hashSet3);
        t tVar3 = new t(vd.b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(vd.b.class, ExecutorService.class), new t(vd.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            m70.a.b(tVar4, "Null interface");
        }
        Collections.addAll(hashSet4, tVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new a5.a(9), hashSet6);
        t tVar5 = new t(c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(c.class, ExecutorService.class), new t(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            m70.a.b(tVar6, "Null interface");
        }
        Collections.addAll(hashSet7, tVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new a5.a(10), hashSet9);
        ce.a aVarA = b.a(new t(d.class, Executor.class));
        aVarA.f = new a5.a(11);
        return Arrays.asList(bVar, bVar2, bVar3, aVarA.b());
    }
}
