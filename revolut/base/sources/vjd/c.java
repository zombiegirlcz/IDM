package vjd;

import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import us6.r2;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SignInMethodsScreenContract$InputData f289710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f289711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f289712c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f289713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f289714h;

    public c(b bVar, SignInMethodsScreenContract$InputData signInMethodsScreenContract$InputData) {
        this.f289710a = signInMethodsScreenContract$InputData;
        int i = 21;
        this.f289711b = e4m.b.b(new r2(bVar, this, 2, i));
        this.f289712c = e4m.b.b(new r2(bVar, this, 1, i));
        this.d = e4m.b.b(new r2(bVar, this, 0, i));
        this.e = e4m.b.b(new r2(bVar, this, 3, i));
        this.f = e4m.b.b(new r2(bVar, this, 5, i));
        this.f289713g = e4m.b.b(new r2(bVar, this, 6, i));
        this.f289714h = e4m.b.b(new r2(bVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.singleton((yji.d) this.d.get());
    }
}
