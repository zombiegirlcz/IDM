package ag1;

import cli.y;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tf1.q;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends oki.h implements c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tf1.o f4770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f4771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f4772r;

    public o(h mapper, b inputData, tf1.o addNewProductCategoryTitleProvider, q interactor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addNewProductCategoryTitleProvider, "addNewProductCategoryTitleProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f4770p = addNewProductCategoryTitleProvider;
        this.f4771q = interactor;
        this.f4772r = mra.d.b(this, new a(null, f0.f322471a), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new a01.e(this, continuation, 26), new yi5.b(26));
        ArrayList<qf1.f> arrayList = this.o.f4753c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (qf1.f fVar : arrayList) {
            arrayList2.add(new a3i.i(this.f4771q.a(fVar), fVar, 7));
        }
        yji.l.a1(this, new k((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 0), null, null, new af4.e(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f4772r;
    }
}
