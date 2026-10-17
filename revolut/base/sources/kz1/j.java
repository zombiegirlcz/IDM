package kz1;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.z;
import sri.m;
import wp5.y;
import xw1.n;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191054a;

    public j(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191054a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "topup-requests");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strE = cVar.e(2);
        if (d0.W(strE)) {
            return null;
        }
        return new q06.h(new ApmTopupRequestNavigation$Destination(new ApmTopupRequestNavigation$InputData(strE)), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        if (d0.W(strE)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new pfm.h(new hc7.a(27, strE, this), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
