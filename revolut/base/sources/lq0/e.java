package lq0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends m {

    @NotNull
    private static final c Companion = new c();
    public final View d;
    public final d e;

    public e(ConstraintLayout parentView, d slideDirection) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(slideDirection, "slideDirection");
        this.d = parentView;
        this.e = slideDirection;
        this.f199172c = false;
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f199181b.put("edgeVerticalSlide:visibility", Integer.valueOf(holder.f199180a.getVisibility()));
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HashMap map = holder.f199181b;
        View view = holder.f199180a;
        map.put("edgeVerticalSlide:visibility", Integer.valueOf(view.getVisibility()));
        map.put("edgeVerticalSlide:translation_y", Float.valueOf(view.getTranslationY()));
    }

    @Override // lq0.m
    public final b g(r rVar, r rVar2) {
        View view;
        float fFloatValue;
        if (rVar == null || (view = rVar.f199180a) == null) {
            if (rVar2 == null) {
                return null;
            }
            view = rVar2.f199180a;
        }
        Object obj2 = rVar != null ? rVar.f199181b.get("edgeVerticalSlide:visibility") : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        boolean z = (num != null ? num.intValue() : 8) != 0;
        boolean z3 = this.e == d.BOTTOM_TO_TOP;
        float height = z == z3 ? this.d.getHeight() - view.getTop() : view.getHeight() + view.getTop();
        float f = z3 ? 1.0f : -1.0f;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            Object obj3 = rVar != null ? rVar.f199181b.get("edgeVerticalSlide:translation_y") : null;
            Float f5 = obj3 instanceof Float ? (Float) obj3 : null;
            fFloatValue = (f * height) + (f5 != null ? f5.floatValue() : 0.0f);
        } else {
            Object obj4 = rVar != null ? rVar.f199181b.get("edgeVerticalSlide:translation_y") : null;
            Float f6 = obj4 instanceof Float ? (Float) obj4 : null;
            fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
        }
        if (!z) {
            f4 = (-f) * height;
        }
        if (fFloatValue == f4) {
            return null;
        }
        return new mq0.a(view, fFloatValue, f4, 1);
    }
}
