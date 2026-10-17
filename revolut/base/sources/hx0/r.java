package hx0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f156332b;

    public /* synthetic */ r(RecyclerView recyclerView, int i) {
        this.f156331a = i;
        this.f156332b = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f156331a) {
            case 0:
                View view = (View) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                return Boolean.valueOf(view != this.f156332b && view.getVisibility() == 0);
            case 1:
                return this.f156332b.getChildAt(((Integer) obj2).intValue());
            case 2:
                return this.f156332b.getChildAt(((Integer) obj2).intValue());
            default:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = new ArrayList();
                xv0.x.b(this.f156332b, arrayList);
                return zhm.d0.d1(arrayList);
        }
    }
}
