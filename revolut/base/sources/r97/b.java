package r97;

import efm.d0;
import efm.r;
import go.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p97.c;
import prk.o;
import qna.n;
import rd0.e;
import skm.p0;
import te0.w;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t97.c f252540a;

    public b(t97.c productCellProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f252540a = productCellProvider;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return Intrinsics.f(id10, f());
    }

    @Override // p97.c
    public final r b() {
        return e.c(new n(q.q(d()), this, 8), p0.f264003c);
    }

    @Override // p97.c
    public final d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        if (!Intrinsics.f(productCell.f234280a, f())) {
            throw new IllegalArgumentException(o.q("Unsupported: ", productCell.f234280a));
        }
        return w.o0(p0.f264003c, new qd8.e((Object) this, (Object) productCell, false, (Continuation) null, 24));
    }

    public Flow d() {
        return new g(Boolean.TRUE, 2);
    }

    public p97.a e(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        return productCell;
    }

    public abstract p97.b f();

    public abstract Object g(Continuation continuation);
}
