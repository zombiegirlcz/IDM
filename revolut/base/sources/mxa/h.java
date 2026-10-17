package mxa;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import efm.d0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements vva.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f210246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f210247b;

    public h(m navigator, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f210246a = navigator;
        this.f210247b = intentProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "share");
    }

    public final Intent b(jf0.c cVar) {
        HashMap map = cVar.d;
        String str = (String) map.get("title");
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        String str2 = (String) map.get("text");
        if (str2 == null) {
            return null;
        }
        return ((s70.b) this.f210247b).f(str, str2, null);
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        Intent intentB = b(cVar);
        if (intentB == null) {
            return null;
        }
        return new q06.h(new ExternalDestination.ByIntent(intentB, null), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 12), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
