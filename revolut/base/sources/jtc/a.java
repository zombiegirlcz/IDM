package jtc;

import com.revolut.feature.second_device_login.api.SecondDeviceLoginDestination;
import efm.d0;
import fag.g;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ftc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f178471a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f178471a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        if (y.D(cVar, "deeplink", 1, "second-device-login")) {
            return Intrinsics.f(cVar.e(3), "me") || Intrinsics.f(cVar.e(3), "not-me");
        }
        return false;
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        etc.a aVar;
        String strE = cVar.e(2);
        String strE2 = cVar.e(3);
        if (Intrinsics.f(strE2, "me")) {
            aVar = etc.a.ME;
        } else {
            if (!Intrinsics.f(strE2, "not-me")) {
                return null;
            }
            aVar = etc.a.NOT_ME;
        }
        return new h(new SecondDeviceLoginDestination(strE, aVar), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new g(this, deeplink, 20), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
