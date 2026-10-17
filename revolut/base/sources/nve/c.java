package nve;

import com.revolut.feature.topup_screen.impl.destination.RevertTransferDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import q06.h;
import rd0.d;
import rte.f;
import sri.m;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f219584a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f219584a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "transfer") && Intrinsics.f(cVar.e(2), "revert");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strL = m70.a.l(cVar.e(3));
        if (strL == null) {
            return null;
        }
        return new h(new BridgeDestination(vhi.c.c(new RevertTransferDestination(strL), yhi.b.SOLID, null, false, 12)), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strL = m70.a.l(deeplink.e(3));
        if (strL != null) {
            ufm.c cVar = new ufm.c(new t(this, strL, 11), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            return cVar;
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        IllegalStateException illegalStateException = new IllegalStateException("Expected transactionId to be passed but it wasn't");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        Intrinsics.checkNotNullExpressionValue(bVarM, "also(...)");
        return bVarM;
    }
}
