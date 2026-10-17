package o31;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import koi.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Canvas f221675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f221676c;
    public final /* synthetic */ RecyclerView.State d;

    public /* synthetic */ a(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state, int i) {
        this.f221674a = i;
        this.f221675b = canvas;
        this.f221676c = recyclerView;
        this.d = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        koi.b vh10 = (koi.b) obj2;
        switch (this.f221674a) {
            case 0:
                Intrinsics.checkNotNullParameter(vh10, "vh");
                j jVar = vh10.e;
                c cVar = jVar instanceof c ? (c) jVar : null;
                if (cVar != null) {
                    p31.c f51630l = cVar.getF51630l();
                    Canvas canvas = this.f221675b;
                    RecyclerView recyclerView = this.f221676c;
                    RecyclerView.State state = this.d;
                    if (f51630l != null) {
                        View itemView = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        f51630l.k(canvas, itemView, recyclerView, state);
                    }
                    p31.c f51631m = cVar.getF51631m();
                    if (f51631m != null) {
                        View itemView2 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                        f51631m.d(canvas, itemView2, recyclerView, state);
                    }
                    p31.c f51632n = cVar.getF51632n();
                    if (f51632n != null) {
                        View itemView3 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                        f51632n.i(canvas, itemView3, recyclerView, state);
                    }
                    p31.c o = cVar.getO();
                    if (o != null) {
                        View itemView4 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                        o.e(canvas, itemView4, recyclerView, state);
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(vh10, "vh");
                j jVar2 = vh10.e;
                c cVar2 = jVar2 instanceof c ? (c) jVar2 : null;
                if (cVar2 != null) {
                    p31.c f51630l2 = cVar2.getF51630l();
                    Canvas canvas2 = this.f221675b;
                    RecyclerView recyclerView2 = this.f221676c;
                    RecyclerView.State state2 = this.d;
                    if (f51630l2 != null) {
                        View itemView5 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
                        f51630l2.c(canvas2, itemView5, recyclerView2, state2);
                    }
                    p31.c f51631m2 = cVar2.getF51631m();
                    if (f51631m2 != null) {
                        View itemView6 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView6, "itemView");
                        f51631m2.b(canvas2, itemView6, recyclerView2, state2);
                    }
                    p31.c f51632n2 = cVar2.getF51632n();
                    if (f51632n2 != null) {
                        View itemView7 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView7, "itemView");
                        f51632n2.f(canvas2, itemView7, recyclerView2, state2);
                    }
                    p31.c o3 = cVar2.getO();
                    if (o3 != null) {
                        View itemView8 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView8, "itemView");
                        o3.a(canvas2, itemView8, recyclerView2, state2);
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(vh10, "vh");
                j jVar3 = vh10.e;
                c cVar3 = jVar3 instanceof c ? (c) jVar3 : null;
                if (cVar3 != null) {
                    p31.c f51630l3 = cVar3.getF51630l();
                    Canvas canvas3 = this.f221675b;
                    RecyclerView recyclerView3 = this.f221676c;
                    RecyclerView.State state3 = this.d;
                    if (f51630l3 != null) {
                        View itemView9 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView9, "itemView");
                        f51630l3.c(canvas3, itemView9, recyclerView3, state3);
                    }
                    p31.c f51631m3 = cVar3.getF51631m();
                    if (f51631m3 != null) {
                        View itemView10 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView10, "itemView");
                        f51631m3.b(canvas3, itemView10, recyclerView3, state3);
                    }
                    p31.c f51632n3 = cVar3.getF51632n();
                    if (f51632n3 != null) {
                        View itemView11 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView11, "itemView");
                        f51632n3.f(canvas3, itemView11, recyclerView3, state3);
                    }
                    p31.c o37 = cVar3.getO();
                    if (o37 != null) {
                        View itemView12 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView12, "itemView");
                        o37.a(canvas3, itemView12, recyclerView3, state3);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(vh10, "vh");
                j jVar4 = vh10.e;
                c cVar4 = jVar4 instanceof c ? (c) jVar4 : null;
                if (cVar4 != null) {
                    p31.c f51630l4 = cVar4.getF51630l();
                    Canvas canvas4 = this.f221675b;
                    RecyclerView recyclerView4 = this.f221676c;
                    RecyclerView.State state4 = this.d;
                    if (f51630l4 != null) {
                        View itemView13 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView13, "itemView");
                        f51630l4.k(canvas4, itemView13, recyclerView4, state4);
                    }
                    p31.c f51631m4 = cVar4.getF51631m();
                    if (f51631m4 != null) {
                        View itemView14 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView14, "itemView");
                        f51631m4.d(canvas4, itemView14, recyclerView4, state4);
                    }
                    p31.c f51632n4 = cVar4.getF51632n();
                    if (f51632n4 != null) {
                        View itemView15 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView15, "itemView");
                        f51632n4.i(canvas4, itemView15, recyclerView4, state4);
                    }
                    p31.c o52 = cVar4.getO();
                    if (o52 != null) {
                        View itemView16 = vh10.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView16, "itemView");
                        o52.e(canvas4, itemView16, recyclerView4, state4);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
