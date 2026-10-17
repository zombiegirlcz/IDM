package l5d;

import androidx.recyclerview.widget.RecyclerView;
import au0.x5;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kx4.f0;
import xv0.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e5d.d f192239c;
    public final e5d.a d;
    public final sn.a e;
    public final qn.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f192240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f192241h;
    public RecyclerView.Adapter i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x5 f192242j;
    public final LinkedHashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f192243l;

    public g(e5d.d view, e5d.a model, sn.a viewableRecordItemCollector, qn.a adsTrackingInteractor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        this.f192239c = view;
        this.d = model;
        this.e = viewableRecordItemCollector;
        this.f = adsTrackingInteractor;
        this.k = new LinkedHashSet();
        this.f192243l = new LinkedHashSet();
    }

    @Override // yji.d
    public final void M() {
        this.k.clear();
        this.f192243l.clear();
        e5d.d dVar = this.f192239c;
        ScreenContentRecyclerView screenContentRecyclerViewO = dVar.O();
        o oVar = new o(screenContentRecyclerViewO, 0.5f, 0.5f, new kzc.a(this, screenContentRecyclerViewO, 17), null, 0);
        x5 x5Var = new x5(screenContentRecyclerViewO, oVar, 23);
        f fVar = new f(screenContentRecyclerViewO, x5Var);
        this.f192240g = oVar;
        this.f192241h = fVar;
        this.i = screenContentRecyclerViewO.getAdapter();
        this.f192242j = x5Var;
        screenContentRecyclerViewO.addOnScrollListener(oVar);
        screenContentRecyclerViewO.addOnLayoutChangeListener(oVar);
        RecyclerView.Adapter adapter = this.i;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(fVar);
        }
        oVar.c();
        yji.d.H(this, new f0(rd0.e.b(dVar.getF99956n0().f53689c), 8), new e(this, null, 0), 3);
        yji.d.H(this, this.e.b(dVar.O(), false), new e(this, null, 1), 3);
    }

    @Override // yji.d
    public final void N() {
        RecyclerView.Adapter adapter;
        o oVar = this.f192240g;
        e5d.d dVar = this.f192239c;
        if (oVar != null) {
            dVar.O().removeOnScrollListener(oVar);
            dVar.O().removeOnLayoutChangeListener(oVar);
        }
        f fVar = this.f192241h;
        if (fVar != null && (adapter = this.i) != null) {
            adapter.unregisterAdapterDataObserver(fVar);
        }
        x5 x5Var = this.f192242j;
        if (x5Var != null) {
            dVar.O().removeCallbacks(x5Var);
        }
        this.f192240g = null;
        this.f192241h = null;
        this.i = null;
        this.f192242j = null;
        this.k.clear();
        this.f192243l.clear();
        ((xn.b) this.f).a();
    }
}
