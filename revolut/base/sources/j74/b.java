package j74;

import hz3.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pgi.i;
import pgi.j;
import pgi.s;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends pri.b implements i {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f171848h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f171849j;

    public b(c creditApplicationCommandsFactory, m navigator, s webViewPresenter) {
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(webViewPresenter, "webViewPresenter");
        this.f171848h = creditApplicationCommandsFactory;
        this.i = navigator;
        this.f171849j = webViewPresenter;
    }

    @Override // pgi.i
    public final void B(String str, String str2, String str3, String str4) {
        this.f171849j.B(str, str2, str3, str4);
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f171849j.h(view);
    }

    @Override // pri.b, pri.e
    public final boolean isAttached() {
        return this.f171849j.isAttached();
    }

    @Override // pri.b, pri.e
    public final void l() {
        this.f171849j.l();
    }

    @Override // pgi.i
    public final boolean u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!Intrinsics.f(url2, "revolut://app/credit/credit-registers")) {
            this.f171849j.u(url2);
            return true;
        }
        this.i.c(this.f171848h.b());
        return true;
    }

    @Override // pgi.i
    public final void y(String url2, String contentType) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f171849j.y(url2, contentType);
    }
}
