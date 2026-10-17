package tw0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f274795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.h f274796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f274797c;
    public final d0 d;

    public c0(RecyclerView recyclerView, koi.h adapter, boolean z, d0 widgetAnimationHelper) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(widgetAnimationHelper, "widgetAnimationHelper");
        this.f274795a = recyclerView;
        this.f274796b = adapter;
        this.f274797c = z;
        this.d = widgetAnimationHelper;
    }

    public final boolean a(RecyclerView.ViewHolder holder, Function0 onAnimationFinished) {
        Object next;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(onAnimationFinished, "onAnimationFinished");
        if (!this.f274797c || !(holder instanceof op0.p)) {
            return false;
        }
        int childAdapterPosition = this.f274795a.getChildAdapterPosition(holder.itemView);
        if (childAdapterPosition == -1) {
            return false;
        }
        List listB = this.f274796b.b();
        Object objE0 = zhm.d0.e0(childAdapterPosition, listB);
        BaseDraggableWidgetDelegate.Model model = objE0 instanceof BaseDraggableWidgetDelegate.Model ? (BaseDraggableWidgetDelegate.Model) objE0 : null;
        if (model == null || model.getK() == op0.r.UNSEEN) {
            return false;
        }
        vim.f it8 = kotlin.ranges.f.l(zhm.v.j(listB), childAdapterPosition).iterator();
        while (true) {
            if (!it8.f289625c) {
                next = null;
                break;
            }
            next = it8.next();
            if (listB.get(((Number) next).intValue()) instanceof BaseDraggableWidgetDelegate.Model) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (childAdapterPosition != (num != null ? num.intValue() : -1)) {
            return false;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        d0.a(this.d, itemView, 1, null, 12);
        onAnimationFinished.invoke();
        return true;
    }
}
