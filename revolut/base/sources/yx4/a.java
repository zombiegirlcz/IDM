package yx4;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import ip0.x10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import qv0.p;
import rp0.z;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private a() {
    }

    public static b a(Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        if (any instanceof b) {
            return (b) any;
        }
        boolean z = any instanceof koi.j;
        if (z && (any instanceof p)) {
            return new b(((koi.j) any).getF52580a(), ((p) any).getP(), any);
        }
        if (z) {
            return new b(((koi.j) any).getF52580a(), null, any);
        }
        if (any instanceof p) {
            m70.a.c(t0.f186434a);
            return new b("", ((p) any).getP(), any);
        }
        if (any instanceof TagViewData) {
            m70.a.c(t0.f186434a);
            return new b("", ((TagViewData) any).k, any);
        }
        if (any instanceof ty0.a) {
            ty0.a aVar = (ty0.a) any;
            return new b(aVar.f275445a, aVar.d, any);
        }
        if (any instanceof t) {
            ActionWidgetDelegate.Model model = ((t) any).f54722b;
            return new b(model.f51590a, model.f51596l, any);
        }
        if (any instanceof String) {
            return new b((String) any, any, any);
        }
        if (any instanceof x10) {
            sa saVar = ((x10) any).f167081a;
            return new b(saVar.f54700a, saVar.i, any);
        }
        if (any instanceof InputTextDelegate.TextData) {
            return new b(((InputTextDelegate.TextData) any).f52597a, any, any);
        }
        if (any instanceof z) {
            z zVar = (z) any;
            return new b(zVar.f256227a, zVar.f256228b, any);
        }
        if (any instanceof cy4.b) {
            cy4.b bVar = (cy4.b) any;
            return new b(bVar.f110041a, bVar.f110042b, any);
        }
        m70.a.c(t0.f186434a);
        return new b("", any, any);
    }
}
