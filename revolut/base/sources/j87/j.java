package j87;

import com.revolut.data.model.Data;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final wi0.b f172146r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ou5.b f172147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ks0.n f172148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l87.c f172149n;
    public final s4i.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f172150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f172151q;

    static {
        wi0.b.Companion.getClass();
        f172146r = wi0.b.f297770q3;
    }

    public j(ou5.b globalMarketsCollectionProvider, ks0.n globeResourcesInteractor, l87.c globeMarkerMapper, s4i.i assetDetailsProvider) {
        Intrinsics.checkNotNullParameter(globalMarketsCollectionProvider, "globalMarketsCollectionProvider");
        Intrinsics.checkNotNullParameter(globeResourcesInteractor, "globeResourcesInteractor");
        Intrinsics.checkNotNullParameter(globeMarkerMapper, "globeMarkerMapper");
        Intrinsics.checkNotNullParameter(assetDetailsProvider, "assetDetailsProvider");
        this.f172147l = globalMarketsCollectionProvider;
        this.f172148m = globeResourcesInteractor;
        this.f172149n = globeMarkerMapper;
        this.o = assetDetailsProvider;
        this.f172150p = new vii.c();
        this.f172151q = pyd.c.a(this, new f(h87.f.GLOBAL_INDEXES, new e(0), new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        yji.n.j2(this, this.f172147l.v(((f) ((j2) this.f172151q.f22677a).getValue()).f172139a), null, new i(this, continuation, 0), 3);
        yji.n.j2(this, q.Q(this.f172150p.a(Unit.f186387a, w4l.h.f294642c), new iw6.l(continuation, this, 8)), null, new i(this, continuation, 1), 3);
    }

    @Override // j87.a
    public final void Z2(String error, String context) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "GlobalMarkersGlobeWidget", a0.d.s("Globe posted an error ", error, " ", context), null, h0Var);
        X2(this.f172151q, new j7b.l(7));
    }

    @Override // j87.a
    public final void b3() {
        this.f172150p.b(Unit.f186387a);
    }

    @Override // j87.a
    public final void c3(String labelId) {
        List list;
        Object next;
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Data data = ((f) ((j2) this.f172151q.f22677a).getValue()).f172141c;
        if (data == null || (list = (List) data.getContent()) == null) {
            return;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((vel.f) next).a(), labelId)) {
                    break;
                }
            }
        }
        vel.f fVar = (vel.f) next;
        if (fVar != null) {
            A2(this.o.a(fVar));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f172151q;
    }
}
