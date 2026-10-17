package fa0;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPhotoScreenContract$InputData f133026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f133027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133028c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133030h;

    public e(k kVar, c cVar, ViewController viewController, CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData) {
        this.f133026a = cardPhotoScreenContract$InputData;
        this.f133027b = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.f133028c = e4m.b.b(new ehe.o(kVar, cVar, this, 2, i));
        this.d = e4m.b.b(new ehe.o(kVar, cVar, this, 1, i));
        this.e = e4m.b.b(new ehe.o(kVar, cVar, this, 0, i));
        this.f = e4m.b.b(new ehe.o(kVar, cVar, this, 4, i));
        this.f133029g = e4m.b.b(new ehe.o(kVar, cVar, this, 5, i));
        this.f133030h = e4m.b.b(new ehe.o(kVar, cVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
