package cr0;

import com.revolut.core.ui_kit.views.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f108179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f108180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f108181c;
    public k d;
    public boolean e;

    public l(o modalViewContainerView) {
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        this.f108179a = modalViewContainerView;
        m mVar = new m();
        this.f108180b = mVar;
        this.f108181c = new k(modalViewContainerView, mVar);
    }
}
