package bg9;

import ba4.x;
import cli.y;
import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import ip0.v7;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends oki.h implements b {
    public final nf9.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f15152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rf9.n f15153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f15154r;

    public r(nf9.f interactor, ImmutableMap extensions, rf9.n genericExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(genericExtension, "genericExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f15152p = extensions;
        this.f15153q = genericExtension;
        this.f15154r = mra.d.b(this, new a(new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new q(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, new x(v7.w(this.f15154r.B(new bek.a(10))), this, 2), null, null, new o(this, continuation, 1), 3);
    }

    public final xf9.a I2() {
        wi0.b bVar = (wi0.b) ((a) ((j2) this.f15154r.f22677a).getValue()).f15139a.getContent();
        if (bVar == null) {
            return null;
        }
        xf9.a aVar = (xf9.a) this.f15152p.get(bVar.f297794a);
        return aVar == null ? this.f15153q : aVar;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15154r;
    }
}
