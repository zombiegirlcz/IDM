package hjh;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import hba.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gih.b f152819c;
    public final f88.f d;

    public b(gih.b view, f88.f screenModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(screenModelExtension, "screenModelExtension");
        this.f152819c = view;
        this.d = screenModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new h23.b(rd0.e.b(((TabInvestController) this.f152819c).Q.f53218h), 23), new k(this, (Continuation) null, 21), 3);
    }
}
