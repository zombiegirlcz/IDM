package i1b;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f157599a;

    public e(f appsFlyerProvider) {
        Intrinsics.checkNotNullParameter(appsFlyerProvider, "appsFlyerProvider");
        this.f157599a = appsFlyerProvider;
    }

    public static void a(e eVar, b bVar, d dVar, a aVar) {
        Map values = r0.g();
        eVar.getClass();
        String eventName = com.google.android.gms.internal.mlkit_vision_face.a.p(bVar.a(), " - ", dVar.a(), " ", aVar.a());
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "AppsFlyerTrackerImpl", eventName, null, null, 16);
        f fVar = eVar.f157599a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(values, "values");
        CoroutineScope coroutineScope = fVar.e;
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, elm.f.f127540b, null, new hsd.c(fVar, eventName, values, (Continuation) null, 10), 2);
    }
}
