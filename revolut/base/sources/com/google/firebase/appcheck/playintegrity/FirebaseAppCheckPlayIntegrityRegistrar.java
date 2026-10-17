package com.google.firebase.appcheck.playintegrity;

import ce.a;
import ce.n;
import ce.t;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import pd.g;
import vd.b;
import vd.c;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(c.class, Executor.class);
        t tVar2 = new t(b.class, Executor.class);
        a aVarB = ce.b.b(be.a.class);
        aVarB.f23279a = "fire-app-check-play-integrity";
        aVarB.a(n.c(g.class));
        aVarB.a(new n(tVar, 1, 0));
        aVarB.a(new n(tVar2, 1, 0));
        aVarB.f = new ae.a(tVar, tVar2, 0);
        return Arrays.asList(aVarB.b(), mo3.a.d("fire-app-check-play-integrity", "18.0.0"));
    }
}
