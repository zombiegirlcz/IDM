package z4l;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f319393b;

    public /* synthetic */ d(f fVar, int i) {
        this.f319392a = i;
        this.f319393b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f319392a) {
            case 0:
                List newList = (List) obj2;
                Intrinsics.checkNotNullParameter(newList, "newList");
                return new Pair(this.f319393b.b(newList), newList);
            default:
                Pair pair = (Pair) obj2;
                DiffUtil.DiffResult diffResult = (DiffUtil.DiffResult) pair.f186385a;
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                List list = (List) obj3;
                f fVar = this.f319393b;
                WeakReference weakReference = fVar.f186376a.i;
                RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
                if (recyclerView == null) {
                    throw new IllegalStateException("Recycler View not attached");
                }
                fVar.c(diffResult, list, recyclerView);
                return Unit.f186387a;
        }
    }
}
