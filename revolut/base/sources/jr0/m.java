package jr0;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.e1;
import ix0.f1;
import ix0.i1;
import java.util.ArrayList;
import java.util.Iterator;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;
import or0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f177917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f177918c;
    public jq0.c d;

    public m(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f177916a = target;
        this.f177917b = 1.0f;
        this.f177918c = new ArrayList();
    }

    @Override // jr0.l
    public final void a(float f) {
        float fA = i1.a(BitmapDescriptorFactory.HUE_RED, 0.25f, f);
        float fA2 = i1.a(0.6666667f, 1.0f, f);
        Interpolator interpolator = r.f177396h;
        float interpolation = interpolator.getInterpolation(fA);
        float interpolation2 = interpolator.getInterpolation(fA2);
        float f4 = this.f177917b - 1.0f;
        float f5 = ((interpolation * f4) + 1.0f) - (f4 * interpolation2);
        View view = this.f177916a;
        view.setScaleX(f5);
        view.setScaleY(f5);
    }

    @Override // jr0.l
    public final void b() {
        View view = this.f177916a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ArrayList arrayList = this.f177918c;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((f1) it8.next()).a(e1.SCALE_ANIMATION, false);
        }
        arrayList.clear();
        jq0.c cVar = this.d;
        if (cVar != null) {
            cVar.i();
        }
        this.d = null;
    }

    @Override // jr0.l
    public final void onStart() {
        float fMin;
        ArrayList arrayList = this.f177918c;
        boolean zIsEmpty = arrayList.isEmpty();
        View view = this.f177916a;
        if (zIsEmpty) {
            u.e(view, new jlh.g(this, 13));
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((f1) arrayList.get(i)).a(e1.SCALE_ANIMATION, true);
        }
        float height = view.getHeight();
        float width = view.getWidth();
        if (height <= BitmapDescriptorFactory.HUE_RED || width <= BitmapDescriptorFactory.HUE_RED) {
            fMin = 1.04f;
        } else {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 8.0f) * 2.0f;
            fMin = Math.min((fL + width) / width, (height + fL) / height);
        }
        this.f177917b = fMin;
        jq0.c cVar = this.d;
        if (cVar != null) {
            cVar.i();
        }
        jq0.c cVar2 = new jq0.c(view);
        this.d = cVar2;
        float f = this.f177917b;
        cVar2.g(f, f, null);
    }
}
