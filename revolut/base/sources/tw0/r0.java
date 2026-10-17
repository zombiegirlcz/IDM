package tw0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ koi.h f274871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f274872b;

    public r0(koi.h hVar, l0 l0Var, Function1 function1) {
        this.f274871a = hVar;
        this.f274872b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        Iterable iterableO = kotlin.ranges.f.o(i, i2 + i);
        if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
            return;
        }
        vim.f it8 = iterableO.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            koi.h hVar = this.f274871a;
            koi.j jVar = (koi.j) hVar.b().get(iNextInt);
            if ((jVar instanceof BaseDraggableWidgetDelegate.Model) && ((BaseDraggableWidgetDelegate.Model) jVar).getF55149l()) {
                hVar.unregisterAdapterDataObserver(this);
                this.f274872b.invoke(Integer.valueOf(l0.b(i, hVar.b())));
                return;
            }
        }
    }
}
