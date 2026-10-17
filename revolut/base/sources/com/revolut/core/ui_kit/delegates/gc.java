package com.revolut.core.ui_kit.delegates;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.internal.views.VerticalProgressStepView;
import ip0.a50;
import ip0.k50;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gc extends koi.b implements ioi.a {
    public final VerticalProgressStepView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(VerticalProgressStepView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "stepView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }

    @Override // ioi.a
    public final void d(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().cancel();
    }

    @Override // ioi.a
    public final boolean u(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, hoi.e eVar, hoi.e eVar2, long j2) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        Intrinsics.checkNotNullParameter(newHolder, "newHolder");
        if (!(oldHolder instanceof gc) || !(newHolder instanceof gc)) {
            return false;
        }
        koi.j jVar = ((gc) oldHolder).e;
        ProgressStepVerticalV2Delegate.Model model = jVar instanceof ProgressStepVerticalV2Delegate.Model ? (ProgressStepVerticalV2Delegate.Model) jVar : null;
        koi.j jVar2 = ((gc) newHolder).e;
        ProgressStepVerticalV2Delegate.Model model2 = jVar2 instanceof ProgressStepVerticalV2Delegate.Model ? (ProgressStepVerticalV2Delegate.Model) jVar2 : null;
        if (model == null || model2 == null || !model.f53012h || !model2.f53012h || Intrinsics.f(model.f53009b, model2.f53009b)) {
            return false;
        }
        View itemView = oldHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        k50 k50Var = new k50(eVar, itemView);
        itemView.animate().translationY(-itemView.getHeight()).alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j2).setListener(k50Var).setUpdateListener(k50Var).start();
        View itemView2 = newHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        itemView2.setTranslationY(Math.max(itemView2.getHeight(), itemView.getHeight()));
        itemView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        itemView2.animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(j2).setListener(eVar2).start();
        return true;
    }

    @Override // ioi.a
    public final boolean x(List payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List list = payloads;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Object obj2 : list) {
            a50 a50Var = obj2 instanceof a50 ? (a50) obj2 : null;
            if (a50Var != null ? a50Var.k : false) {
                return false;
            }
        }
        return true;
    }
}
