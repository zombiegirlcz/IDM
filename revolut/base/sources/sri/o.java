package sri;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o {
    private o() {
    }

    public static w70.a a(Context context) {
        hf0.a aVarJ;
        l70.e eVar;
        w70.a aVar;
        return (context == null || (aVarJ = ue0.e.j(context)) == null || (eVar = (l70.e) ue0.e.i(aVarJ, l70.e.class)) == null || (aVar = eVar.f192433b) == null) ? new w70.a(Build.VERSION.SDK_INT) : aVar;
    }

    public static LinkedHashMap b(Context context) {
        hf0.a aVarJ;
        gri.a aVar = (context == null || (aVarJ = ue0.e.j(context)) == null) ? null : (gri.a) ue0.e.i(aVarJ, gri.a.class);
        gri.a aVar2 = aVar instanceof gri.a ? aVar : null;
        if (aVar2 != null) {
            return ((c51.e) aVar2.f146023a).a();
        }
        Object objC = fri.b.Companion.c();
        Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.retail.core.di.component.RetailCoreComponent");
        return ((c51.e) ((gri.a) objC).f146023a).a();
    }

    public static m c(Context context, Integer num, k kVar, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            kVar = k.DEFAULT;
        }
        k navigationContextResolution = kVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigationContextResolution, "navigationContextResolution");
        ecm.q qVar = new ecm.q(new FragmentFactory());
        od0.a aVar = od0.a.f224253a;
        if (od0.a.h()) {
            return u.b(context, qVar);
        }
        return new com.revolut.retail.core.navigation.b(context, num2, b(context), context instanceof FragmentActivity ? new a31.a((FragmentActivity) context) : new s(), qVar, new n(), new wri.b(), navigationContextResolution, a(context), 128);
    }
}
