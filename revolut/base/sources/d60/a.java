package d60;

import com.revolut.core.extensions.rx.BreadcrumbException;
import cwl.g;
import efm.b;
import kgm.c;
import kotlin.jvm.internal.Intrinsics;
import m08.i;
import mli.d;
import mli.e;
import tpi.j;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w49.a f111431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f111432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f111433c;

    public a(w49.a commandView, j progressView, e logoutController) {
        Intrinsics.checkNotNullParameter(commandView, "commandView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(logoutController, "logoutController");
        this.f111431a = commandView;
        this.f111432b = progressView;
        this.f111433c = logoutController;
    }

    public final void a() {
        e eVar = this.f111433c;
        w49.a commandView = this.f111431a;
        Intrinsics.checkNotNullParameter(commandView, "commandView");
        b bVarG = o70.a.g(eVar.a(true));
        j jVar = this.f111432b;
        if (jVar != null) {
            bVarG = mo3.a.u(bVarG, jVar, true);
        }
        pfm.a aVarE = bVarG.e(((g) commandView).b(false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        pfm.a aVar = new pfm.a(aVarE, new c(new i(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar.w(new lhi.b(5, d.f206963a), mli.c.f206962a), "subscribe(...)");
    }
}
