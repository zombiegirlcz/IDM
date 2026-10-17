package xkf;

import com.revolut.feature.transactions.impl.ui.kompot.details.OpenExternalLinkDialogDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f306689l;

    public c2(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f306689l = commonDataSource;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_EXTERNAL_TRACKING")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            A2(zh9.u0.b(gc0.c.f(new KompotOverlayFeatureConfig(new OpenExternalLinkDialogDestination((String) obj2), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
