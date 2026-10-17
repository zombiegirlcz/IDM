package hl0;

import a08.d;
import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f152973a;

    public c(m navigator, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f152973a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "language-settings");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(new ExternalDestination.ByIntent(new Intent("android.settings.LOCALE_SETTINGS"), null), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return a(deeplink) ? new pfm.h(new d(this, 28), 2).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
    }
}
