package kc4;

import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pgi.i;
import pgi.j;
import pgi.s;
import sri.m;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends pri.b implements i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f182662h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f182663j;

    public b(m navigator, s originalPresenter) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(originalPresenter, "originalPresenter");
        this.f182662h = navigator;
        this.i = originalPresenter;
        IllionFlowCallback illionFlowCallback = IllionFlowCallback.SUCCESS;
        Pair pair = new Pair(illionFlowCallback.getUrl(), illionFlowCallback);
        IllionFlowCallback illionFlowCallback2 = IllionFlowCallback.FAILURE;
        this.f182663j = r0.k(pair, new Pair(illionFlowCallback2.getUrl(), illionFlowCallback2));
    }

    @Override // pgi.i
    public final void B(String str, String str2, String str3, String str4) {
        this.i.B(str, str2, str3, str4);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // pgi.i
    public final boolean u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        IllionFlowCallback illionFlowCallback = (IllionFlowCallback) this.f182663j.get(url2);
        if ((illionFlowCallback == null ? -1 : a.f182661a[illionFlowCallback.ordinal()]) == -1) {
            this.i.u(url2);
            return true;
        }
        this.f182662h.c(new FinishCommand(666, q0.c(new Pair("EXTRAS_ILLION_FLOW_CALLBACK", illionFlowCallback)), null, 4));
        return true;
    }

    @Override // pgi.i
    public final void y(String url2, String contentType) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.i.y(url2, contentType);
    }
}
