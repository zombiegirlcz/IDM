package com.revolut.analytics.tracking.v3;

import android.net.Uri;
import grl.za;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import no.a0;
import no.b0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import uo.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f50311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.b f50312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f50313c;
    public final uo.l d;
    public final oo.a e;
    public final gpk.c f;

    public c(d4m.a tracker, uo.b activeScreenHolder, q0 screenNameFinder, uo.l productMapper, oo.a deeplinkPatternFinder, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(deeplinkPatternFinder, "deeplinkPatternFinder");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f50311a = tracker;
        this.f50312b = activeScreenHolder;
        this.f50313c = screenNameFinder;
        this.d = productMapper;
        this.e = deeplinkPatternFinder;
        this.f = coroutineScopeProvider;
    }

    public final void a(String input, String deeplinkRawUri, za action, boolean z) {
        String strA;
        Intrinsics.checkNotNullParameter(deeplinkRawUri, "deeplinkRawUri");
        Intrinsics.checkNotNullParameter(action, "action");
        oo.a aVar = this.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(deeplinkRawUri, "deeplinkRawUri");
        if (input == null || d0.W(input) || Uri.parse(input).getScheme() != null || d0.K(input, '?')) {
            strA = aVar.a(deeplinkRawUri);
        } else {
            po.e eVar = aVar.f226968b;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            strA = eVar.a().replace(input, "<id>");
        }
        if (strA == null) {
            strA = null;
        } else if (!d0.r0('/', strA)) {
            strA = "/".concat(strA);
        }
        String str = strA == null ? "/" : strA;
        e0.C(this.f.c(), null, null, new b0(new kul.b(this, str, deeplinkRawUri, action, z), this, str, null), 3);
    }
}
