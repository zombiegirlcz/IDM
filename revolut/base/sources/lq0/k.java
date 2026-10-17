package lq0;

import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends m {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void m(r rVar) {
        View view = rVar.f199180a;
        HashMap map = rVar.f199181b;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return;
        }
        map.put("parentEndDisappear:vis", Integer.valueOf(view.getVisibility()));
        map.put("parentEndDisappear:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("parentEndDisappear:parentEnd", Integer.valueOf(view2.getLayoutDirection() == 1 ? view2.getLeft() : view2.getRight()));
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m(holder);
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m(holder);
    }

    @Override // lq0.m
    public final b g(r rVar, r rVar2) {
        if (rVar != null) {
            HashMap map = rVar.f199181b;
            if (rVar2 != null) {
                HashMap map2 = rVar2.f199181b;
                Object obj2 = map.get("parentEndDisappear:vis");
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                int iIntValue = num != null ? num.intValue() : 8;
                Object obj3 = map2.get("parentEndDisappear:vis");
                Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                int iIntValue2 = num2 != null ? num2.intValue() : 8;
                if (iIntValue == 0 && iIntValue2 != 0) {
                    Object obj4 = map.get("parentEndDisappear:parentEnd");
                    Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
                    int iIntValue3 = num3 != null ? num3.intValue() : 0;
                    Object obj5 = map2.get("parentEndDisappear:parentEnd");
                    Integer num4 = obj5 instanceof Integer ? (Integer) obj5 : null;
                    float fIntValue = (num4 != null ? num4.intValue() : 0) - iIntValue3;
                    if (fIntValue != BitmapDescriptorFactory.HUE_RED) {
                        Object obj6 = map.get("parentEndDisappear:bounds");
                        Intrinsics.i(obj6, "null cannot be cast to non-null type android.graphics.Rect");
                        return new l(rVar.f199180a, (Rect) obj6, fIntValue);
                    }
                }
            }
        }
        return null;
    }
}
