package ec4;

import a0.d;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pgi.i;
import pgi.j;
import pgi.s;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends pri.b implements i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f124426h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f80.a f124427j;

    public c(m navigator, s originalPresenter, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(originalPresenter, "originalPresenter");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f124426h = navigator;
        this.i = originalPresenter;
        this.f124427j = uriHelper;
    }

    @Override // pgi.i
    public final void B(String str, String str2, String str3, String str4) {
        this.i.B(str, str2, str3, str4);
    }

    public final void N(int i, String str) {
        this.f124426h.c(new FinishCommand(Integer.valueOf(i), d.x("EXTRAS_HOME_INSURANCE_STATUS", ((f80.b) this.f124427j).f(str).getQueryParameter("status")), null, 4));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.i.h(view);
    }

    @Override // pri.b, pri.e
    public final boolean isAttached() {
        return this.i.isAttached();
    }

    @Override // pri.b, pri.e
    public final void l() {
        this.i.l();
    }

    @Override // pgi.i
    public final boolean u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (a0.H(url2, "https://callback.revolut.com/success", false)) {
            N(100, url2);
            return true;
        }
        if (a0.H(url2, "https://callback.revolut.com/failure", false)) {
            N(LDSFile.EF_DG14_TAG, url2);
            return true;
        }
        this.i.u(url2);
        return true;
    }

    @Override // pgi.i
    public final void y(String url2, String contentType) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.i.y(url2, contentType);
    }
}
