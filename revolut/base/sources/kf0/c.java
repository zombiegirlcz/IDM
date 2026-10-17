package kf0;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ui0.f;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f183263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui0.d f183264b;

    public c(ui0.d dVar, f fVar) {
        this.f183263a = fVar;
        this.f183264b = dVar;
    }

    public final gpk.c a() {
        b.Companion.getClass();
        ui0.d appVersion = this.f183264b;
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        f buildVersionCode = this.f183263a;
        Intrinsics.checkNotNullParameter(buildVersionCode, "buildVersionCode");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(buildVersionCode, "buildVersionCode");
        final gpk.c cVar = new gpk.c();
        cVar.f145463a = appVersion;
        final int i = 0;
        cVar.f145464b = j.b(new Function0() { // from class: ui0.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                gpk.c cVar2 = cVar;
                switch (i2) {
                    case 0:
                        return ((d) cVar2.f145463a).b();
                    default:
                        Lazy lazy = (Lazy) cVar2.f145464b;
                        od0.a aVar = od0.a.f224253a;
                        return od0.a.e() ? a0.d.r((String) lazy.getValue(), " (1030151101)") : (String) lazy.getValue();
                }
            }
        });
        final int i2 = 1;
        cVar.f145465c = j.b(new Function0() { // from class: ui0.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                gpk.c cVar2 = cVar;
                switch (i22) {
                    case 0:
                        return ((d) cVar2.f145463a).b();
                    default:
                        Lazy lazy = (Lazy) cVar2.f145464b;
                        od0.a aVar = od0.a.f224253a;
                        return od0.a.e() ? a0.d.r((String) lazy.getValue(), " (1030151101)") : (String) lazy.getValue();
                }
            }
        });
        return cVar;
    }
}
