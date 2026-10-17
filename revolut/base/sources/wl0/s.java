package wl0;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm0.e0;
import ulm.p0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl0.a f298363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f298364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ih0.b f298365c;
    public final Lazy d;

    public s(vl0.a platformBiometrics, n80.b buildInfo, e0 securityFeatureToggles, ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(platformBiometrics, "platformBiometrics");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f298363a = platformBiometrics;
        this.f298364b = securityFeatureToggles;
        this.f298365c = remoteConfig;
        this.d = yhm.j.b(new p0(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    public final i a() {
        vl0.c cVar = (vl0.c) this.f298363a;
        boolean z = cVar.b() != o.NONE;
        boolean z3 = cVar.b() == o.FACE_UNLOCK;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        List list = ((d) this.d.getValue()).f298344a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String lowerCase = ((String) it8.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        Set setI1 = d0.i1(arrayList);
        String lowerCase2 = MODEL.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return setI1.contains(lowerCase2) ? i.CUSTOM : (z3 || (z && ((Boolean) this.f298364b.e.getValue()).booleanValue())) ? i.GOOGLE : i.CUSTOM;
    }
}
