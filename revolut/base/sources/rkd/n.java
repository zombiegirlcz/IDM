package rkd;

import gld.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f254829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f254830b;

    public n(c cVar, e eVar) {
        this.f254829a = eVar;
        this.f254830b = cVar;
    }

    public final p0 a(mkd.g view, sri.m navigator, tpi.j progressView, k3l.b statusDialogView, r3l.a shotView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(shotView, "shotView");
        return new p0(this.f254830b.a(view), progressView, shotView, statusDialogView, navigator, (bld.j) ((g) this.f254829a.f254798a.f251552c).C.get());
    }
}
