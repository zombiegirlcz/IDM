package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhotosUploadSummaryControllerContract$InputData f118508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f118510c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118512h;

    public c5(c1 c1Var, b5 b5Var, ViewController viewController, PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData) {
        this.f118508a = photosUploadSummaryControllerContract$InputData;
        this.f118509b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, b5Var, this, 1, 27);
        this.f118510c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, b5Var, this, 0, 27));
        this.f = e4m.b.b(this.f118510c);
        this.f118511g = e4m.b.b(new e0(c1Var, b5Var, this, 3, 27));
        this.f118512h = e4m.b.b(new e0(c1Var, b5Var, this, 2, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
