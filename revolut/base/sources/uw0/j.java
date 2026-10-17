package uw0;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import lq0.p;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j extends koi.b implements ioi.a {
    public final zr0.e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new zr0.e(this);
    }

    @Override // ioi.a
    public final void d(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof j) {
            ((j) holder).f.f324527a.itemView.animate().cancel();
        }
    }

    @Override // ioi.a
    public final void e(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof j) {
            zr0.e eVar = ((j) holder).f;
            eVar.e = true;
            View itemView = eVar.f324527a.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setTranslationX(i - i3);
            itemView.setTranslationY(i2 - i5);
        }
    }

    @Override // ioi.a
    public final boolean m(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return this.f.f324529c != null;
    }

    @Override // ioi.a
    public final void w(RecyclerView.ViewHolder holder, long j2, hoi.e eVar) {
        p pVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof j) {
            zr0.e eVar2 = ((j) holder).f;
            p pVar2 = eVar2.f324529c;
            if (pVar2 != null) {
                eVar2.f324529c = null;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                Intrinsics.h(valueAnimatorOfFloat);
                zr0.c cVar = new zr0.c(valueAnimatorOfFloat, eVar2, pVar, valueAnimatorOfFloat, pVar);
                valueAnimatorOfFloat.addListener(cVar);
                valueAnimatorOfFloat.addUpdateListener(cVar);
                valueAnimatorOfFloat.setDuration(j2);
                valueAnimatorOfFloat.start();
            }
            eVar2.f324527a.itemView.animate().translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setListener(eVar).setDuration(j2).start();
        }
    }
}
