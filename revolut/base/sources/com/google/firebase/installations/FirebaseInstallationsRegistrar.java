package com.google.firebase.installations;

import af.f;
import ag.j;
import androidx.annotation.Keep;
import ce.c;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import de.l;
import df.d;
import df.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import pd.g;
import vd.a;
import vd.b;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(c cVar) {
        return new d((g) cVar.a(g.class), cVar.c(af.g.class), (ExecutorService) cVar.d(new t(a.class, ExecutorService.class)), new l((Executor) cVar.d(new t(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ce.b> getComponents() {
        ce.a aVarB = ce.b.b(e.class);
        aVarB.f23279a = "fire-installations";
        aVarB.a(n.c(g.class));
        aVarB.a(n.a(af.g.class));
        aVarB.a(new n(new t(a.class, ExecutorService.class), 1, 0));
        aVarB.a(new n(new t(b.class, Executor.class), 1, 0));
        aVarB.f = new a5.a(12);
        ce.b bVarB = aVarB.b();
        f fVar = new f(0);
        ce.a aVarB2 = ce.b.b(f.class);
        aVarB2.e = 1;
        aVarB2.f = new j(fVar, 6);
        return Arrays.asList(bVarB, aVarB2.b(), mo3.a.d("fire-installations", "18.0.0"));
    }
}
