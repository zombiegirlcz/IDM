package w50;

import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.x0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1j.b f294663a;

    public l(t1j.b transcriptInteractor) {
        Intrinsics.checkNotNullParameter(transcriptInteractor, "transcriptInteractor");
        this.f294663a = transcriptInteractor;
    }

    public final o a(com.revolut.kompot.navigable.a controller, y40.b pdfViewExtension) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
        return new o(this.f294663a, pdfViewExtension, x0.a(g1.Companion, controller.D2()));
    }
}
