package fd6;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import f9d.c;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import yji.d;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xc6.a f133921c;
    public final FooterTextDelegate d;
    public final List e;

    public a(xc6.a legalEntityControllerModelExtension) {
        Intrinsics.checkNotNullParameter(legalEntityControllerModelExtension, "legalEntityControllerModelExtension");
        this.f133921c = legalEntityControllerModelExtension;
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.d = footerTextDelegate;
        this.e = u.c(footerTextDelegate);
    }

    @Override // yji.d
    public final void M() {
        d.H(this, e.b(this.d.e.f121375b), new c(this, (Continuation) null, 9), 3);
    }
}
