package upc;

import f88.f;
import jlc.y;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import up2.q;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f281953c;
    public final y d;

    public c(f modelExtension, y delegates) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f281953c = modelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(w.a0(this.d.f175709a.f53218h, new b(0))), new q(this, null, 1), 3);
    }
}
