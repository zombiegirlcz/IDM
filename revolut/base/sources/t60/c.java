package t60;

import androidx.recyclerview.widget.RecyclerView;
import efm.u;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements u, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f268124b;

    public /* synthetic */ c(g gVar, int i) {
        this.f268123a = i;
        this.f268124b = gVar;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        switch (this.f268123a) {
            case 0:
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                f fVar = new f(emitter);
                g gVar = this.f268124b;
                gVar.f268128c.addOnScrollListener(fVar);
                emitter.d(new b80.a(gVar, fVar, 6));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                e eVar = new e(emitter);
                g gVar2 = this.f268124b;
                gVar2.f268128c.addOnScrollListener(eVar);
                emitter.d(new b80.a(gVar2, eVar, 5));
                break;
            default:
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                d dVar = new d(emitter);
                RecyclerView.Adapter adapter = this.f268124b.f268128c.getAdapter();
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(dVar);
                }
                emitter.d(new b80.a(adapter, dVar, 7));
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return this.f268124b.Q();
    }
}
