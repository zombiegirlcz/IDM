package com.google.firebase.appcheck;

import ag.j;
import ce.f;
import ce.n;
import ce.t;
import ce.v;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import pd.g;
import vd.a;
import vd.b;
import vd.c;
import vd.d;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        final t tVar = new t(d.class, Executor.class);
        final t tVar2 = new t(c.class, Executor.class);
        final t tVar3 = new t(a.class, Executor.class);
        final t tVar4 = new t(b.class, ScheduledExecutorService.class);
        ce.a aVar = new ce.a(xd.a.class, new Class[]{zd.a.class});
        aVar.f23279a = "fire-app-check";
        aVar.a(n.c(g.class));
        aVar.a(new n(tVar, 1, 0));
        aVar.a(new n(tVar2, 1, 0));
        aVar.a(new n(tVar3, 1, 0));
        aVar.a(new n(tVar4, 1, 0));
        aVar.a(n.a(af.g.class));
        aVar.f = new f() { // from class: wd.a
            @Override // ce.f
            public final Object m(v vVar) {
                return new xd.a((g) vVar.a(g.class), vVar.c(af.g.class), (Executor) vVar.d(tVar), (Executor) vVar.d(tVar2), (Executor) vVar.d(tVar3), (ScheduledExecutorService) vVar.d(tVar4));
            }
        };
        aVar.c(1);
        ce.b bVarB = aVar.b();
        af.f fVar = new af.f(0);
        ce.a aVarB = ce.b.b(af.f.class);
        aVarB.e = 1;
        aVarB.f = new j(fVar, 6);
        return Arrays.asList(bVarB, aVarB.b(), mo3.a.d("fire-app-check", "18.0.0"));
    }
}
