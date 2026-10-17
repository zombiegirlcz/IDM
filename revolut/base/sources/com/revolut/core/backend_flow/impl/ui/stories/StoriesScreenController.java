package com.revolut.core.backend_flow.impl.ui.stories;

import android.content.Intent;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import fa0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import w83.a;
import wb0.c;
import xki.e;
import ya0.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/stories/StoriesScreenController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lya0/b;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoriesScreenController extends SimpleViewController<b> {
    public final int N;
    public final Object O;
    public final Object P;

    public StoriesScreenController(StoriesScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.N = R$layout.screen_transparent;
        this.O = w.y0(new a(this, screen, 5));
        this.P = w.y0(new vt3.a(this, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wb0.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        c cVar = (c) ((wb0.a) this.P.getValue());
        if (i != 1373254820) {
            cVar.getClass();
        } else if (i2 == -1) {
            cVar.C2(new b(cVar.f295989p));
        } else {
            cVar.B2();
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }
}
