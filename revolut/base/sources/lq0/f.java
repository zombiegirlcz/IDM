package lq0;

import android.view.View;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends m {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f199181b.put("v_vis", Integer.valueOf(holder.f199180a.getVisibility()));
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HashMap map = holder.f199181b;
        View view = holder.f199180a;
        map.put("v_vis", Integer.valueOf(view.getVisibility()));
        map.put("v_alpha", Float.valueOf(RevTransitionUtils.INSTANCE.getTransitionAlpha(view)));
    }

    @Override // lq0.m
    public final b g(r rVar, r rVar2) {
        View view;
        float fFloatValue;
        if (rVar == null || (view = rVar.f199180a) == null) {
            view = rVar2 != null ? rVar2.f199180a : null;
        }
        if (view != null) {
            Object obj2 = rVar != null ? rVar.f199181b.get("v_vis") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            int iIntValue = num != null ? num.intValue() : 8;
            if (iIntValue == 0) {
                Object obj3 = rVar != null ? rVar.f199181b.get("v_alpha") : null;
                Float f = obj3 instanceof Float ? (Float) obj3 : null;
                fFloatValue = f != null ? f.floatValue() : 1.0f;
            } else {
                fFloatValue = BitmapDescriptorFactory.HUE_RED;
            }
            Object obj4 = rVar2 != null ? rVar2.f199181b.get("v_vis") : null;
            Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
            int iIntValue2 = num2 != null ? num2.intValue() : 8;
            if (iIntValue != iIntValue2 || fFloatValue != 1.0f) {
                return new g(iIntValue2, fFloatValue, view);
            }
        }
        return null;
    }
}
