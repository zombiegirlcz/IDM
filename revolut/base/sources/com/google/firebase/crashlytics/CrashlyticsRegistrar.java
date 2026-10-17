package com.google.firebase.crashlytics;

import ag.j;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import df.e;
import fg.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import pd.g;
import vd.a;
import vd.b;
import vd.c;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f49445a = new t(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f49446b = new t(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f49447c = new t(c.class, ExecutorService.class);

    static {
        d subscriberName = d.CRASHLYTICS;
        fg.c cVar = fg.c.f134861a;
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == d.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map dependencies = fg.c.f134862b;
        if (dependencies.containsKey(subscriberName)) {
            String str = "Dependency " + subscriberName + " already added.";
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new fg.a(new hlm.c(true)));
        StringBuilder sb6 = new StringBuilder("Dependency to ");
        sb6.append(subscriberName);
        j6.a.C(sb6, " added.", "SessionsDependencies");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ce.a aVarB = ce.b.b(ee.c.class);
        aVarB.f23279a = "fire-cls";
        aVarB.a(n.c(g.class));
        aVarB.a(n.c(e.class));
        aVarB.a(new n(this.f49445a, 1, 0));
        aVarB.a(new n(this.f49446b, 1, 0));
        aVarB.a(new n(this.f49447c, 1, 0));
        aVarB.a(new n(fe.a.class, 0, 2));
        aVarB.a(new n(td.b.class, 0, 2));
        aVarB.a(new n(cg.a.class, 0, 2));
        aVarB.f = new j(this, 16);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), mo3.a.d("fire-cls", "19.4.4"));
    }
}
