package com.fourthline.orca.internal;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class fj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fj0 f28535a = new fj0();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28536a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f28537b = TextUnitKt.getSp(24);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f28538c = TextUnitKt.getSp(28);
        private static final long d = TextUnitKt.getSp(32);
        private static final long e = TextUnitKt.getSp(34);
        private static final long f = TextUnitKt.getSp(36);

        private a() {
        }

        public final long a() {
            return f28537b;
        }

        public final long b() {
            return e;
        }

        public final long c() {
            return d;
        }

        public final long d() {
            return f28538c;
        }
    }

    private fj0() {
    }

    public final Map a(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194961607, i, -1, "com.fourthline.orca.core.internal.styling.OrcaTheme.<get-colors> (OrcaTheme.kt:135)");
        }
        Map map = (Map) composer.consume(hj0.f29305c);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return map;
    }

    public final yi0 b(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947035905, i, -1, "com.fourthline.orca.core.internal.styling.OrcaTheme.<get-elements> (OrcaTheme.kt:127)");
        }
        yi0 yi0Var = (yi0) composer.consume(hj0.f29303a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yi0Var;
    }

    public final uh0 c(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1013432789, i, -1, "com.fourthline.orca.core.internal.styling.OrcaTheme.<get-layouts> (OrcaTheme.kt:139)");
        }
        uh0 uh0Var = (uh0) composer.consume(hj0.e);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return uh0Var;
    }

    public final Resources d(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1044659264, i, -1, "com.fourthline.orca.core.internal.styling.OrcaTheme.<get-resources> (OrcaTheme.kt:143)");
        }
        Resources resources = (Resources) composer.consume(hj0.d);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resources;
    }
}
