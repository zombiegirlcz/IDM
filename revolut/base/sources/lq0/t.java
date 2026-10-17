package lq0;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends m {

    @NotNull
    private static final s Companion = new s();
    public final View d;
    public final int e;

    public t(View outAnchorView, View intoAnchorView) {
        Intrinsics.checkNotNullParameter(outAnchorView, "outAnchorView");
        Intrinsics.checkNotNullParameter(intoAnchorView, "intoAnchorView");
        this.d = intoAnchorView;
        this.e = outAnchorView.getTop();
        this.f199172c = false;
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f199181b.put("verticalOffset:visibility", Integer.valueOf(holder.f199180a.getVisibility()));
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HashMap map = holder.f199181b;
        View view = holder.f199180a;
        map.put("verticalOffset:visibility", Integer.valueOf(view.getVisibility()));
        map.put("verticalOffset:translation_y", Float.valueOf(view.getTranslationY()));
        if (view.isLaidOut()) {
            map.put("verticalOffset:top", Integer.valueOf(view.getTop()));
        }
    }

    @Override // lq0.m
    public final b g(r rVar, r rVar2) {
        View view;
        float f;
        if (rVar == null || (view = rVar.f199180a) == null) {
            if (rVar2 == null) {
                return null;
            }
            view = rVar2.f199180a;
        }
        Object obj2 = rVar != null ? rVar.f199181b.get("verticalOffset:visibility") : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        boolean z = (num != null ? num.intValue() : 8) != 0;
        float top = this.e - this.d.getTop();
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            Object obj3 = rVar != null ? rVar.f199181b.get("verticalOffset:top") : null;
            float f4 = -(view.getTop() - ((obj3 instanceof Integer ? (Integer) obj3 : null) != null ? r7.intValue() : view.getTop()));
            float f5 = f4 - top;
            top = f4;
            f = f5;
        }
        if (top == f) {
            return null;
        }
        return new mq0.a(view, top, f, 1);
    }
}
